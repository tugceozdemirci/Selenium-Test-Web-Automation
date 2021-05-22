package gittiGidiyorTest;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class SearchPage {
    Actions action;

    public SearchPage (WebDriver driver) {
        action = new Actions (driver);
    }
    public void performMouseHover (WebElement element) {
        action.moveToElement(element).build().perform();
    }
    public void UsingJavaScriptExecutor(WebElement element, WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void pressEnter() {
        action.sendKeys(Keys.ENTER).build().perform();
    }

    public void scrollDown(WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,2000)","");
    }
}
