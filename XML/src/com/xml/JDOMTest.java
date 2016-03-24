package com.xml;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class JDOMTest {

	public static void main(String[] args) throws Exception {
		//������  SAXBuilder��һ��JDOM������ �ܽ�·���е�XML�ļ�����ΪDocument����
		SAXBuilder sb = new SAXBuilder();
		// �����ĵ�����
		//Document doc = sb.build("D:/workspace/MyEclipse 2015 CI/XML/src/test.xml");
		System.out.println(JDOMTest.class.getClassLoader());
		//getResourceAsStream���ڶ�ȡ��Դ��������������޷��ҵ���Դ���򷵻� null
		//��XML�ļ�����Ϊһ��Document����
		Document doc=sb.build(JDOMTest.class.getClassLoader().getResourceAsStream("test.xml")); 
		Element root = doc.getRootElement(); // ��ȡ��Ԫ��
		List<Element> list = root.getChildren("disk");// ȡ����Ϊdisk������Ԫ��
		for (int i = 0; i < list.size(); i++) {
			Element element = (Element) list.get(i);
			String name = element.getAttributeValue("name");
			String capacity = element.getChildText("capacity");// ȡdisk��Ԫ��capacity������
			String directories = element.getChildText("directories");
			String files = element.getChildText("files");
			System.out.println("������Ϣ:");
			System.out.println("�����̷�:" + name);
			System.out.println("��������:" + capacity);
			System.out.println("Ŀ¼��:" + directories);
			System.out.println("�ļ���:" + files);
			System.out.println("-----------------------------------");
		}
	}
}
