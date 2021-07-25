package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
   public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
	   
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    
   driver.navigate().to("https://www.instagram.com/");
   driver.navigate().back();
   driver.navigate().forward();
   driver.navigate().refresh();
	   
}

}