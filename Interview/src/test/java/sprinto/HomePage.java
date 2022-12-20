package sprinto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

class HomePage {

	WebDriver driver;

	WebDriverWait wait;

	@Test
	public void bookingPage() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,15);
		Thread.sleep(2000);

		try {
			List<WebElement> close = driver.findElements(By.cssSelector(".c-pointer.c-neutral-900"));
			close.get(1).click();
		}catch(Exception e) {
			e.getMessage();
		}

		Thread.sleep(2000);
		
		WebElement roundTrip = driver.findElement(By.xpath("//div/p[text()='Round trip']"));
		roundTrip.click();

		List<WebElement> fromTo = driver.findElements(By.cssSelector("input[placeholder='Any worldwide city or airport']"));
		fromTo.get(0).sendKeys("Bangalore");

		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Bangalore') and contains(text(),'BLR')]"))).click();

		fromTo.get(1).sendKeys("Delhi");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'New Delhi') and contains(text(),'DEL')]"))).click();
		
		WebElement departOn;
		
		WebElement returnTo;
		
		WebElement searchFlight = driver.findElement(By.xpath("//button[text()='Search flights']"));
		
		searchFlight.click();
		
		
		
	}

}
