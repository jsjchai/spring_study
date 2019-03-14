package com.spring.simulation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;


/**
 * @author jsjchai
 */
public class ClassPathXmlApplicationContext implements BeanFactory {

    private Map<String, Object> beans = new HashMap<String, Object>();

    public ClassPathXmlApplicationContext() throws Exception {
        SAXBuilder sb = new SAXBuilder();
        Document doc = sb.build(this.getClass().getClassLoader().getResourceAsStream("beans.xml"));
        Element root = doc.getRootElement();
        List<Element> list = root.getChildren("bean");
        for (int i = 0; i < list.size(); i++) {
            Element e = list.get(i);
            String id = e.getAttributeValue("id");
            String className = e.getAttributeValue("class");
            System.out.println(id + ":" + className);
            //newInstance 创建此 Class 对象所表示的类的一个新实例
            Object obj = Class.forName(className).newInstance();
            System.out.println(obj);
            beans.put(id, obj);


            for (Element pe : e.getChildren("property")) {
                String name = pe.getAttributeValue("name");
                String bean = pe.getAttributeValue("bean");
                Object bobj = beans.get(bean); //UserDaoImpl

                String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
                System.out.println("methodName:" + methodName);

                //setUserDAO(UserDao.class)
                Method m = obj.getClass().getMethod(methodName, bobj.getClass().getInterfaces()[0]);
                System.out.println("m:" + m);
                m.invoke(obj, bobj);
            }
        }
    }

    @Override
    public Object getBean(String id) {
        return beans.get(id);
    }

}
