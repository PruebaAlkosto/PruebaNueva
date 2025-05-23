package task;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://alkostostorefront.cfll9tllxj-alkostoco2-s1-public.model-t.cc.commerce.ondemand.com/")
public class LoginPage extends PageObject {

    @FindBy( name="username")
    WebElement textBoxUsername;

    @FindBy(name="password")
    WebElement textBoxPassword;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement btnLogin;

    public void Login(String userName,String password){
        textBoxUsername.sendKeys(userName);
        textBoxPassword.sendKeys(password);
        btnLogin.click();

    }
}