package FrameworkHelperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import FrameworkHelperPackage.DriverClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class DesireCapabilitiesClass {
    public static  WebDriver driver = null;


@BeforeSuite
    public void DesireCapability() {

        // System("eebdriver.chrome.driver","X://chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabty = new DesiredCapabilities();


        capabty.acceptInsecureCerts(); // accepts all the certificates of the chrome
        //options.addArguments("user-data-dir = C:\\Users\\Rabia-Riaz\\Desktop");
        options.addArguments("start-maximized");
        //options.addArguments("headless");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "load-extension" ,"disable-extensions" ));
        options.addArguments("Disable-popup-blocking");

        // Close the save password prompt from chrome
    Map<String, Object> prefs = new HashMap<String, Object>();
    prefs.put("credentials_enable_service", false);
    prefs.put("profile.password_manager_enabled", false);

    options.setExperimentalOption("prefs", prefs);


        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabia-Riaz\\Documents\\cypress_practice\\chromedriver.exe");

         //capabty.setBrowserName("Chrome");
         //capabty.getBrowserName();
         capabty.setCapability(ChromeOptions.CAPABILITY, options);
         capabty.setCapability("browser","Chrome");
         capabty.setCapability("browser_version","latest");
         capabty.setCapability("os","Windows");
         capabty.setCapability("os_version","10");
         capabty.setCapability("selenium_version", "3.141.59");
         capabty.setCapability("network", true); // To enable network logs
         capabty.setCapability("visual", true); // To enable step by step screenshot
         capabty.setCapability("video", true); // To enable video recording
         capabty.setCapability("console", true); // To capture console logs


        //options.merge(capabty);
        driver = new ChromeDriver(options);

        driver.get("https://test-adtech.codeinformatics.com/#/login");




    }
   // @AfterSuite
   //s public void closeBrowser()
   // {
      //  driver.quit();
  //  }

}
