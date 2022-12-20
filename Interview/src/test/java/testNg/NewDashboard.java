package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

class NewDashboard {
	
	@Test
	public void verifyMenuOpt() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(18,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ca-admin-uat.reciproci.com/admin/login");
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='User Name']"));
		System.out.println(username.getAttribute("name"));
	}


}
