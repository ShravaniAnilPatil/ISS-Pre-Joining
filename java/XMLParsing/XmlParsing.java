import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.io.File;

public class XmlParsing{

    public static void main(String[] args) {
        try {
           
            File file = new File("student.xml"); 

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            doc.getDocumentElement().normalize();

            NodeList studentList = doc.getElementsByTagName("student");

            for (int i = 0; i < studentList.getLength(); i++) {
                Node node = studentList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element emp = (Element) node;

                    String id = emp.getElementsByTagName("id").item(0).getTextContent();
                    String name = emp.getElementsByTagName("name").item(0).getTextContent();
                    String dept = emp.getElementsByTagName("department").item(0).getTextContent();

                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Department: " + dept);
                    System.out.println("-------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}