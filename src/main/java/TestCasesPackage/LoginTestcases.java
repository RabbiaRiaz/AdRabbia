package TestCasesPackage;

import FrameworkHelperPackage.DesireCapabilitiesClass;
import FrameworkHelperPackage.DriverClass;
import WebPagesUIPackage.LoginWebpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestcases  extends DesireCapabilitiesClass{

    //WebDriver driver ;
   // WebDriver driver = DriverClass.getDriver();


@Test
    public void  LoginUserTestCase() throws InterruptedException {
        //Object created of the LoginWebpage
        LoginWebpage webpage = PageFactory.initElements(driver, LoginWebpage.class);
        webpage.Login("super-admin-adtech@codeinformatics.com", "123456");
        //return driver;

    }


}
