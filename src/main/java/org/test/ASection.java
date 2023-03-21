package org.test;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASection {


public static void main (String[] args) throws Exception    {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\januaryMaven\\src\\main\\resources\\chromedriver.exe");
 try {

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver ();
driver.navigate().to("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
String parent=driver.getWindowHandle();
System.out.println(parent);
Set<String>child=driver.getWindowHandles();
System.out.println(child);


String text=driver.findElement(By.xpath("//span[@class='B_NuCI'])")).getText();
System.out.println(text);
 }
 catch(Exception e) {
	 System.out.println(e.toString());

	
	
}













}
	 
}



