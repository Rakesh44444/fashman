package Testing_Pack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scripting extends Method_reuse{

	public void searching() {
		driver.findElement(By.xpath("//input[@class='Vy9RSP']")).sendKeys("iphone 17pro ");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void scrolling() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
	}
	public void select() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 17 Pro (Silver, 512 GB)']")).click();
	}
	public void changing_window() throws InterruptedException {
		Thread.sleep(2000);
		Set<String> Windows=driver.getWindowHandles();
		ArrayList<String> myorder= new ArrayList(Windows);
		driver.switchTo().window(myorder.get(0));
		Thread.sleep(1000);
		String Bname =driver.getTitle();
		System.out.println("Before select the phone :"+ Bname);
		Thread.sleep(2000);
		driver.switchTo().window(myorder.get(1));
		String Aname = driver.getTitle();
		System.out.println("After select the phone:"+ Aname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@style='transform: translateY(0px) scale(1);']")).click();
		driver.findElement(By.xpath("//img[@class='gNunGE' and @alt='Cart']")).click();
		//Actions A = new Actions(driver);
		//A.moveToElement(driver.findElement(By.xpath("(//div[@class='css-146c3p1'and text()='Remove']"))).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Remove')]")).click();
		//driver.findElement(By.xpath("//div[@class='css-146c3p1 r-1vgyyaa r-ubezar r-1rsjblm']")).click();
		
		
		//driver.close();
		//driver.switchTo().window(myorder.get(0));
		
	}

}
