package Listeners;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(AppListener.class)
public class AppTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test()
	public void test1()
	{
		driver.navigate().to("https://www.browserstack.com/guide/how-to-find-broken-links-in-selenium");
		driver.close();
	}
	
	@Test()
	public void test2() throws IOException, InterruptedException
	{
		driver.navigate().to("https://www.browserstack.com/guide/how-to-find-broken-links-in-selenium");
		driver.findElement(By.xpath("//a[@title='Get Started free']")).click();
		Thread.sleep(2000);
		//driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement w : list)
		{
			String links = w.getDomAttribute("href");
			
		URL url = new URL(links);
			System.out.println(url);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			driver.close();
		}
	}


}
