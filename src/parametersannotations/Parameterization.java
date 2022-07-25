package parametersannotations;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Parameters({"author","searchkey"})
	@Test
	public void parametersTest(@Optional("Abc")String author, String searchkey) throws InterruptedException {
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
}