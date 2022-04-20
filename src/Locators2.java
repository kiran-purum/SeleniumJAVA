import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		String name = "KIRAN";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KP15\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello "+name+",");
		driver.close();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText();
		String [] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
	}

}
