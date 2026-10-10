package com.Perseus.core;
import org.openqa.selenium.WebDriver;
import org .openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
    private static WebDriver driver;
    public static void iniciarDriver(String navegador){
        switch (navegador.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver= new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();

    }
    public static WebDriver getDriver(){
        return driver;
    }
    public static void cerrarDriver(){
        if (driver !=null){
            driver.close();
            driver=null;
        }
    }
}
