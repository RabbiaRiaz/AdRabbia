package WebPagesUIPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LoginWebpage {

    WebDriver driver;

    public LoginWebpage(WebDriver driver)
    {
        this.driver= driver;
    }

    //Find the web Elements of the Login page
    @FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/form/div[2]/div[2]/div/div/input")
    @CacheLookup
    WebElement username;
    @FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/form/div[2]/div[3]/div/div/input")
    @CacheLookup
    WebElement password;
    @FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/form/div[2]/div[5]/button/span[1]")
    @CacheLookup
    WebElement LoginButton;


    public void setusername(WebElement userName)
    {
        this.username = userName;
    }


    public void Login(String name, String Password) throws InterruptedException {
        username.sendKeys(name);
        password.sendKeys(Password);
        LoginButton.click();

    }

}
