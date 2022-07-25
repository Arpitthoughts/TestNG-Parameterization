package parametersannotations;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDataprovider2 {

	
	@Test(dataProvider="providedata")
	public void parameterswithchromeTest(String author, String searchkey) throws InterruptedException {
		// TODO Auto-generated method stub
//		String author = "guru99";
//		String searchkey = "India";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(searchkey);
		System.out.println(
				"Author is=" + author + "search key =" + driver.findElement(By.name("q")).getAttribute("value"));
		Assert.assertEquals(driver.findElement(By.name("q")).getAttribute("value"), searchkey);

	}

	
	
	@Test(dataProvider="providedata")
	public void parameterswithfirefoxTest(String author, String searchkey) throws InterruptedException {
		// TODO Auto-generated method stub
//		String author = "guru99";
//		String searchkey = "India";

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(searchkey);
		System.out.println(
				"Author is=" + author + "search key =" + driver.findElement(By.name("q")).getAttribute("value"));
		Assert.assertEquals(driver.findElement(By.name("q")).getAttribute("value"), searchkey);

	}

	
	@DataProvider(name="providedata")
	public Object[][] getData(Method M) {
		
		if(M.getName().equalsIgnoreCase("parameterswithchromeTest")) {
		return new Object[] [] {
			{"Guru99","India"},{"Ravi","UK"},{"Bhupesh","USA"}
		};
		}
		else
		{
			return new Object[] [] {
				{"Arpit","Jhansi"},{"Raja","Bihar"}
			};
		}
		
		
	}	
	
}


