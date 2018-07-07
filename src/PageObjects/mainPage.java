package PageObjects;

import Utilities.base;
import Utilities.commonOps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage extends base
{
    public WebDriver driver;
    commonOps ComOps = new commonOps();

    @FindBy(how = How.XPATH, using = "//*[@id=\"search-2\"]/form/label/input")
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"search-2\"]/form/input")
    public WebElement searchButton;

    public mainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void searchAction(String searchValue)
    {
        searchBox.sendKeys(searchValue);
        searchButton.click();
    }


}
