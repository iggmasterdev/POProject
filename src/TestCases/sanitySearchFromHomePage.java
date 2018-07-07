package TestCases;

import Utilities.base;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class sanitySearchFromHomePage extends base
{
    @BeforeClass
    public static void startSession()
    {
        System.setProperty("webdriver.chrome.driver","D:\\AutomationDev\\Drivers\\ChromeDriver\\chromedriver.exe");
        driver =  new ChromeDriver();
    }
}
