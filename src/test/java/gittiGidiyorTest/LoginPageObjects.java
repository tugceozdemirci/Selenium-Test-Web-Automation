package gittiGidiyorTest;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
    @FindBy(xpath="//input[@id = 'email']")
     WebElement email;

    @FindBy(xpath = "//input[contains(@id, 'passwd')]")
    WebElement pass;

    @FindBy(xpath = "//span[contains(., 'Sign in')]")
    WebElement btnSubmit;

    public LoginPageObjects(WebDriver driver) {
        PageFactory.initElements( driver , this);
    }

    public void validateLogin() {
        email.sendKeys("dmirci2@gmail.com");
        pass.sendKeys("efsun1");
        btnSubmit.click();
    }

}
