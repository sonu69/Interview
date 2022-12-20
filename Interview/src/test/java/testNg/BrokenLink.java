package testNg;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	String homepage = "https://www.zlti.com";
	String url = "";
	HttpURLConnection huc = null;
	int respCode = 200;

	WebDriver driver;

	Robot rb;

	@Test
	public void verifyBrokenLink() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(18,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(homepage);
		rb = new Robot();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for(int i=0;i<links.size();i++) {

			url = links.get(i).getAttribute("href");

			if(url==null || url.isEmpty()) {
				System.out.println(url +" url is enpty");
				continue;
			}

			if(!url.startsWith(homepage)) {
				System.out.println(url+" url belongs to another domain");
				continue;
			}

			try {
				huc=(HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();
				System.out.println(respCode);
				if(respCode>=400) {
					System.out.println(url+" url is a broken link");
				}else {
					System.out.println(url+" url is a valid link");
				}
			}
			catch(Exception e) {	
			}	
		}

	}
}
