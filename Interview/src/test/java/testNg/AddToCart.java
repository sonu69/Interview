package testNg;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {

	WebDriver driver;

	Robot rb;

	@Test
	public void verifyAddToCart() throws Exception{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(18,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		rb = new Robot();

		WebElement phoneNumber=driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/../../input"));
		phoneNumber.sendKeys("9905040207");

		WebElement password = driver.findElement(By.xpath("//span[text()='Enter Password']/../../input"));
		password.sendKeys("sonu3791");

		driver.findElement(By.xpath("//button/span[text()='Login']")).click();

		Assert.assertTrue(driver.getTitle().contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));

		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		mobile.click();

		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();

		Thread.sleep(2000);
		WebElement brand = driver.findElement(By.xpath("//a[@title='Asus' or text()='Asus']"));
		brand.click();

		String parentWindow = driver.getWindowHandle();

		Thread.sleep(1000);

		List<WebElement> mobiles = driver.findElements(By.cssSelector("._4rR01T"));
		//.s1Q9rs

		for(WebElement mob:mobiles) {

			if(mob.getText().contains("ASUS ROG Phone")) {
				mob.click();
			}		

		}

		Set<String> windows = driver.getWindowHandles();

		for(String allWindows:windows) {

			driver.switchTo().window(allWindows);

			Thread.sleep(1000);

			if(driver.getTitle().contains("ASUS ROG Phone 3 ( 128 GB Storage, 12 GB RAM )")) {

				try{
					WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
					addToCart.click();
				}
				catch(Exception e) {					
				}

				try{
					WebElement goToCart = driver.findElement(By.xpath("//button[text()='GO TO CART']"));
					goToCart.click();
				}
				catch(Exception e) {
				}

				break;
			}
		}
		
		Thread.sleep(1000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(1000);
		WebElement cart = driver.findElement(By.xpath("//a/span[text()='Cart']"));

		cart.click();

		rb.keyPress(KeyEvent.VK_HOME);

		Thread.sleep(2000);


		Thread.sleep(1000);
		WebElement placeorder = driver.findElement(By.xpath("//button/span[text()='Place Order']"));
		placeorder.click();

		try {
			WebElement viewAllAdd = driver.findElement(By.xpath("//div[contains(text(),'View all')]"));
			viewAllAdd.click();
		}catch(Exception e) {

		}

		Thread.sleep(2000);
		List<WebElement> name = driver.findElements(By.xpath("//p[@class='rPNEXT']/span[1]"));
		List<WebElement> phone = driver.findElements(By.xpath("//span[@class='_3mmRDy _2dQV-8']"));
		List<WebElement> pincode = driver.findElements(By.xpath("//span[@class='rPNEXT Br27Zz']/span"));


		for(int i=0;i<name.size();i++){
			String nameV="Tushare Vats";
			String pincodeV="110018";
			if(name.get(i).getText().equalsIgnoreCase(nameV) && pincode.get(i).getText().equalsIgnoreCase(pincodeV)){
				Thread.sleep(1000);
				name.get(i).click();
				Thread.sleep(1000);
				break;
			}
		}

		WebElement deliverHere = driver.findElement(By.xpath("//button[text()='Deliver Here']"));
		deliverHere.click();

		rb.keyPress(KeyEvent.VK_END);
		Thread.sleep(2000);

		WebElement continueOrder = driver.findElement(By.xpath("//button[text()='CONTINUE']"));
		continueOrder.click();

		Thread.sleep(2000);
		WebElement accept_Cont = driver.findElement(By.xpath("//button[text()='Accept & Continue']"));
		accept_Cont.click();





	}

}
