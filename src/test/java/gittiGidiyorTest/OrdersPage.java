package gittiGidiyorTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {
    @FindBy(css = "a[title='Sil']")
    WebElement deleteProduct;

    @FindBy(css = "option[value='2']")
    WebElement addProduct;

    @FindBy(css = "div[class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']>:nth-child(1)")
    WebElement updateOrder;

    public OrdersPage(WebDriver driver) {
        PageFactory.initElements( driver , this);
    }

    public void addingItem() {

    }

    public void delete () {

    }



}
