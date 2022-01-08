package TestCasesPackage;

import FrameworkHelperPackage.DesireCapabilitiesClass;
import FrameworkHelperPackage.DriverClass;
import WebPagesUIPackage.SellerCentralAdminWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import TestCasesPackage.*;

public class SellerCentralAdminTestCases extends DesireCapabilitiesClass {

//
    @Test
    public void abc() throws InterruptedException {
        SellerCentralAdminWebPage SCPage = PageFactory.initElements(driver, SellerCentralAdminWebPage.class);



        SCPage.ClickOnScheduling();

    }

    @Test
    public void ggg()
    {
        SellerCentralAdminWebPage SCPage = PageFactory.initElements(driver, SellerCentralAdminWebPage.class);
        SCPage.validationCheck();


    }
}

    // WebDriver driver ;
    //LoginTestcases Tcases = new LoginTestcases(driver);
   /* @Test
    public void fff() throws InterruptedException {

        SellerCentralAdminWebPage SCPage = PageFactory.initElements(driver, SellerCentralAdminWebPage.class);
        //SCPage.validationCheck();
        SCPage.ClickOnScheduling();
        SCPage.validationCheck();
    }*/

    /*@Test
    public void abc() throws InterruptedException {


        SCPage.ClickOnScheduling();

}
@Test
public void ggg()
{
    SCPage.validationCheck();


}
@Test
public void hhhh() throws InterruptedException {
    SCPage.scheduleCrons();
}
*/

