package Utilities;

import org.openqa.selenium.WebDriver;
import org.xml.sax.SAXException;

import javax.swing.text.Document;
import javax.swing.text.html.parser.Parser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class base
{

    public static WebDriver driver;

    public static String getData (String nodeName) throws ParserConfigurationException, SAXException, IOException
    {
        File fXmlFile = new File("D:\\AutomationDev\\IdeaProjects\\testConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }
}
