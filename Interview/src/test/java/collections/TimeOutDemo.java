package collections;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOutDemo {

	WebDriver driver;

	Date date;

	@Test
	public void verifyTimeout() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ca-admin-uat.reciproci.com/admin/login");
		date = new Date();
		System.out.println(date.toString());
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//sonu"))).click();
			date = new Date();
			System.out.println(date.toString());
			WebElement username = driver.findElement(By.xpath("//sonu"));
			username.click();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			date = new Date();
			System.out.println(date.toString());
		}
	}

}
