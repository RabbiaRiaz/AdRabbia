package FrameworkHelperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverClass  {
public  static class Driver {

    public static WebDriver wd;

    public static WebDriver getDriver() {
        return wd;
    }
}
}
