package contactpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class contact {
	public static WebDriver driver;
	@Test
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrom.driver", "C:\\Seleniumdriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://manitakothari.github.io/myproject/index%20.html");
	driver.findElement(By.id("username")).sendKeys("Arham");
	Thread.sleep(1000);
	driver.findElement(By.id("useremail")).sendKeys("axk4509@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("click")).click();
	driver.findElement(By.xpath("/html/body/div/form/input[4]")).sendKeys("Inquiry");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div/form/input[5]")).sendKeys("Time for class");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div/form/input[6]")).click();
	
	
	
	}
	

}
