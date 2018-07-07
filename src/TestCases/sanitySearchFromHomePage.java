package TestCases;

import PageObjects.mainPage;
import PageObjects.searchResults;
import Utilities.base;
import Utilities.commonOps;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class sanitySearchFromHomePage extends base
{
    static PageObjects.mainPage mp;
    static PageObjects.searchResults sr;
    static commonOps ComOps = new commonOps();

    @BeforeClass
    public static void startSession() throws IOException, SAXException, ParserConfigurationException {
        System.setProperty("webdriver.chrome.driver", "D:\\AutomationDev\\Drivers\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getData("URL"));

        mp = PageFactory.initElements(driver, mainPage.class);
        sr = PageFactory.initElements(driver, searchResults.class);
    }

    @AfterClass
    public static void closeSession()
    {
        driver.quit();
    }

    @Test
    public void test1()
    {
        mp.searchAction("Mobile App");
        ComOps.verifyElementExists(sr.firstPost);
        ComOps.verifyElementExists(sr.secondPost);
    }

}
