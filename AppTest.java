package hello;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

 

public class AppTest 

{ 

 public WebDriver driver; 

 public String baseUrl = "https://www.lambdatest.com/";  

 

 @Test             

 public void test1() {      

 

 WebDriverManager.chromedriver().setup();

 ChromeOptions options = new ChromeOptions();

 options.addArguments("--no-sandbox");

 options.addArguments("--disable-dev-shm-usage");

 options.addArguments("--headless");

 driver = new ChromeDriver(options);

 

 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  

 driver.manage().window().maximize();  

 driver.get(baseUrl);

 driver.close();

 }     

}
 

Next, head over to the pom.xml file and add the following dependencies for the Selenium WebDriver code:

      junit

      junit

      4.11

      test

    

      

org.seleniumhq.selenium  

selenium-java  

3.141.59  

      

    

io.github.bonigarcia

webdrivermanager

4.3.1
