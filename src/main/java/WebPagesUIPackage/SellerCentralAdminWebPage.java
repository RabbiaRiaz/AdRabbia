package WebPagesUIPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

public class SellerCentralAdminWebPage {

    public WebDriver   driver;
    WebDriverWait wait;
    String validationMessage1, validationMessage2, validationMessage3 = null;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/nav/div[2]/div/div/div/div[4]/div[2]/span")
    @CacheLookup
    private WebElement sellerCenter;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/nav/div[2]/div/div/div/div[5]/div/div/div/a/div/div[2]/span")
    @CacheLookup
    private WebElement scheduling;

    @FindBy(how = How.CLASS_NAME, using = "MuiButton-label")
    private WebElement ClickOnSaveButton;








    public SellerCentralAdminWebPage (WebDriver driver)
    {
        this. driver = driver ;
        wait = new WebDriverWait(driver, 15, 100);
    }

    public void  setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public  WebDriver getDriver() {
        return driver;
    }





    //System.out.println(signUpForm.size());

   //@FindAll(@FindBy( how = How.CLASS_NAME, using = "MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-2"))
    //public List<WebElement> signUpForm;
   //List<WebElement> signUpForm= driver.findElements(By.className("MuiGrid-root"));





    //getDriver().findElement()

    /*@FindBy(className = ".error pl-3")
    private WebElement errorOfCronList;


    @FindBy(how = How.CLASS_NAME, using = ".error pl-3")
    WebElement errorOfTimeList;

    @FindBy(how = How.CLASS_NAME, using = ".error pl-3")
    WebElement errorOfStatus;*/


    //Click on Scheduling and redirect/ assert the url
    public void ClickOnScheduling() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(sellerCenter)).click();
        wait.until(ExpectedConditions.elementToBeClickable(scheduling)).click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://test-adtech.diginc.pk/#/sellerCentral", "Both strings should be matched" );
    }

    // Verify the validation checks
    public void validationCheck()
    {

        wait.until(ExpectedConditions.elementToBeClickable(ClickOnSaveButton)).click();
        List<WebElement> signUpForm  =  getDriver().findElements(By.cssSelector(".error.pl-3"));
        validationMessage1 = signUpForm.get(0).getText();
        validationMessage2 = signUpForm.get(1).getText();
        validationMessage3 = signUpForm.get(2).getText();
        System.out.println(signUpForm.size());


        Assert.assertEquals(validationMessage1,"Cron is required", "Rabbihdsjdklsjkljsj");
        Assert.assertEquals(validationMessage2,"Time is required", "Rabbihdsjdklsjkljsj");
        Assert.assertEquals(validationMessage3,"Status is required", "Rabbihdsjdklsjkljsj");


    }

    public void scheduleCrons() throws InterruptedException {

        WebElement ReportType = driver.findElement(By.cssSelector("#list input"));
        String Cname = "Catalog";
         ReportType.sendKeys(Cname);
         //System.out.println(ReportType.getText());
         //System.out.println("dfhhjkjfhj8888888888888");

       // System.out.println(reportype);
        Thread.sleep(1000);
        ReportType.sendKeys(Keys.RETURN);

        WebElement ReportTime = driver.findElement(By.cssSelector("#time input"));
        String Ctime = "01:00";
        ReportTime.sendKeys(Ctime);

        //String reporttime = ReportTime.getText();
        //System.out.println(reporttime);
        Thread.sleep(1000);
        ReportTime.sendKeys(Keys.RETURN);

        WebElement cronStatus = driver.findElement(By.name("stop"));
        String cronststus1 = cronStatus.getAttribute("value");
        System.out.println(cronststus1 +"getAttribute()");
        //cronStatus.isEnabled();
        Thread.sleep(1000);
        cronStatus.click();





        //Click on save button for schedule the crons

        wait.until(ExpectedConditions.elementToBeClickable(ClickOnSaveButton)).click();
        Thread.sleep(4000);
        // Click on Pop up
        Actions act =  new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/button/span[2]"))).click().perform();

        // finf the row 2 element like catalog row

       List<WebElement> tableElementsc = getDriver().findElements(By.cssSelector("#row-2 div"));
        System.out.println(tableElementsc.size());
        // String salesValue0 = tableElements.get(0).getText();
        String CatValue1 = tableElementsc.get(1).getText();
        //String salesValue2 = tableElements.get(2).getText();

        String CatValue3 = tableElementsc.get(3).getText();
        String CatValue4 = tableElementsc.get(4).getText();
        //String salesValue5 = tableElements.get(5).getText();

        //System.out.println(salesValue0);
        System.out.println(CatValue1);
        //System.out.println(salesValue2);
        System.out.println(CatValue3);
        System.out.println(CatValue4);

        if(CatValue1.equals(Cname))
        {
            System.out.println("11111111");
        }
        if(CatValue3.equals(Ctime))
        {
            System.out.println("222222222222");
        }
        if(CatValue4.equalsIgnoreCase(cronststus1))
        {
            System.out.println("33333333333333333333333333");
        }







            //WebElement sss1 = driver.findElement(By.cssSelector(".rdt_Table.sc-bdVaJa.bcbMzh .rdt_TableBody.sc-kpOJdX.bIxPIp #row-2 #cell-_3h1OSiURq-undefined"));
            //System.out.println(sss1.getText());

           // WebElement sss2 = driver.findElement(By.xpath("//*[@id=\"cell---_CWn217G-undefined\"]/span"));
           // System.out.println(sss2.getText());



            /*List<WebElement> tableElements = getDriver().findElements(By.cssSelector("#row-0 div"));
            System.out.println(tableElements.size());
           // String salesValue0 = tableElements.get(0).getText();
            String salesValue1 = tableElements.get(1).getText();
            //String salesValue2 = tableElements.get(2).getText();

            String salesValue3 = tableElements.get(3).getText();
            String salesValue4 = tableElements.get(4).getText();
            //String salesValue5 = tableElements.get(5).getText();

            //System.out.println(salesValue0);
            System.out.println(salesValue1);
            //System.out.println(salesValue2);
            System.out.println(salesValue3);
            System.out.println(salesValue4);*/
            








    }






}
