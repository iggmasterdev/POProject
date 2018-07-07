package PageObjects;

import Utilities.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class searchResults extends base
{
    @FindBy(how = How.XPATH, using = "//*[@id=\"post-212\"]/header/h2/a")
    public WebElement firstPost;

    @FindBy(how = How.XPATH, using = "//*[@id=\"post-201\"]/header/h2/a")
    public WebElement secondPost;

    public searchResults(WebDriver driver)
    {
        this.driver = driver;
    }



}