package Utilities;

import org.openqa.selenium.WebElement;
import static org.junit.Assert.fail;

public class commonOps extends base
{
    public void verifyElementExist(WebElement elem)
    {
        try {
            elem.isDisplayed();
            System.out.println("Element Exist!");
        }
        catch (Exception e)
        {
            System.out.println("Element NOT Exist!");
            System.out.println("Element NOT Exist222!");
            fail("Element NOT Exist!");
        }
    }
}
