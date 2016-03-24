package com.xml;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class JDOMTest {

	public static void main(String[] args) throws Exception {
		//解析器  SAXBuilder是一个JDOM解析器 能将路径中的XML文件解析为Document对象
		SAXBuilder sb = new SAXBuilder();
		// 构造文档对象
		//Document doc = sb.build("D:/workspace/MyEclipse 2015 CI/XML/src/test.xml");
		System.out.println(JDOMTest.class.getClassLoader());
		//getResourceAsStream用于读取资源的输入流，如果无法找到资源，则返回 null
		//将XML文件解析为一个Document对象
		Document doc=sb.build(JDOMTest.class.getClassLoader().getResourceAsStream("test.xml")); 
		Element root = doc.getRootElement(); // 获取根元素
		List<Element> list = root.getChildren("disk");// 取名字为disk的所有元素
		for (int i = 0; i < list.size(); i++) {
			Element element = (Element) list.get(i);
			String name = element.getAttributeValue("name");
			String capacity = element.getChildText("capacity");// 取disk子元素capacity的内容
			String directories = element.getChildText("directories");
			String files = element.getChildText("files");
			System.out.println("磁盘信息:");
			System.out.println("分区盘符:" + name);
			System.out.println("分区容量:" + capacity);
			System.out.println("目录数:" + directories);
			System.out.println("文件数:" + files);
			System.out.println("-----------------------------------");
		}
	}
}
