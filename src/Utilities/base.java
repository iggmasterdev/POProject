package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class base {

    public static WebDriver driver;

    public static String getData(String nodeName) throws ParserConfigurationException, SAXException, IOException {
        File fXmlFile = new File("D:\\AutomationDev\\IdeaProjects\\testConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }

    public static void initBrowser(String browserType) throws ParserConfigurationException, SAXException, IOException {
        switch (browserType.toLowerCase()) {
            case "firefox":
                driver = initFFDriver();
                break;

            case "chrome":
                driver = initChromeDriver();
                break;

        }
        driver.manage().window().maximize();
        driver.get(getData("URL"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    public static WebDriver initFFDriver() throws IOException, SAXException, ParserConfigurationException {
        System.setProperty("webdriver.gecko.driver",getData("FFDriverPath"));
        WebDriver driverff = new FirefoxDriver();
        return driverff;
    }

    public static WebDriver initChromeDriver() {
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    //public static void initOS(String osType) throws ParserConfigurationException, SAXException, IOException{}
    //    switch (osType.toLowerCase()){

    //}
}
