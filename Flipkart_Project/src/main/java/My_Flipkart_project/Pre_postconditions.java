package My_Flipkart_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pre_postconditions   {
	public static WebDriver driver;
 @BeforeClass
  public void beforeClass() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakes\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	  driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account");
	 
	 
	 
	 
	 
	  }
  @Test
  public void f() {
	  driver.get("http://flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account");
	 // driver.findElement(By.xpath("//input[@class='Vy9RSP']")).sendKeys("iphone");
	  //driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
 }
  //@AfterMethod
  //public void afterMethod() {
	  
  //}

  

}
