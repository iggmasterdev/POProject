package PageObjects;

import Utilities.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage extends base
{
    @FindBy(how = How.XPATH, using = "//*[@id=\"search-2\"]/form/label/input")
    public WebElement searchBox;

    @FindBy(how = How.CSS, using = "search-submit[type='submit']")
    public WebElement searchButton;

    public mainPage(WebDriver driver)
    {
        this.driver = driver;
    }

}
