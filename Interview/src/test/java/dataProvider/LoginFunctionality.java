package dataProvider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionality {
	
	Robot rb;
	Actions act;
	
	@Test
	public void verifyLogin() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		rb = new Robot();
		act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ca-admin-uat.reciproci.com/admin/login");
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("test@123");
		act.keyUp(Keys.CONTROL).sendKeys(Keys.ENTER).keyDown(Keys.CONTROL).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Master')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Brand Category']")).click();
		
		driver.findElement(By.xpath("//button[text()='ADD BRAND CATEGORY ']")).click();
		
		
		
		//Ctr+L
		Thread.sleep(1000);
		act.keyUp(Keys.CONTROL).sendKeys("l").keyDown(Keys.CONTROL).build().perform();
		//Ctr+C
		Thread.sleep(1000);
		act.keyUp(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
		//Ctrl+T
		Thread.sleep(1000);
		act.keyUp(Keys.CONTROL).sendKeys("t").keyDown(Keys.CONTROL).build().perform();
		//Ctrl+V
		Thread.sleep(1000);
		act.keyUp(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).build().perform();
	}

}
