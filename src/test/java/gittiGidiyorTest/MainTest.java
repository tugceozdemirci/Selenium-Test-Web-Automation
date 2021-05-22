package gittiGidiyorTest;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    public WebDriver driver;
    @Test
    public void Chrome() {
        System.setProperty("webdriver.chrome.driver", "D:/DERSLER/new folder/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage();

        LoginPageObjects page = new LoginPageObjects(driver);

        SearchPage objectSearch = new SearchPage(driver);
        WebElement inputSearch = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        inputSearch.sendKeys("Bilgisayar");
        objectSearch.pressEnter();
        objectSearch.scrollDown(driver);

        String image = "3";
        WebElement searchImage = driver.findElement(By.xpath(" //*[@id=\"main-header\"]/div["+image+"]/div/div/div/div[2]/form/div/div[1]/div[2]/input"));
        objectSearch.performMouseHover(searchImage);

        WebElement btnAddToOrders = driver.findElement(By.xpath("//*[@id=\"item-info-block-635761293\"]/div/div[1]/div[3]/button"));
        objectSearch.UsingJavaScriptExecutor(btnAddToOrders , driver);

        OrdersPage orders = new OrdersPage(driver);

    }
    @After
    public void exit() {
        driver.quit();
    }
}

