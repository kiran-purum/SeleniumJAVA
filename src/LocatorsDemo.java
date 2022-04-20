import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KP15\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("KIRAN");
		driver.findElement(By.name("inputPassword")).sendKeys("Kiran123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("KIRANKALYAN");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kiran123@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Email'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7032122826");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("KIRANKALYAN");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector(".signInBtn")).click();
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
		System.out.println(driver.findElement(By.cssSelector("div h1")).getText());
		System.out.println(driver.findElement(By.cssSelector("div p")).getText());
		driver.findElement(By.cssSelector(".logout-btn")).click();
		System.out.println(driver.findElement(By.xpath("//form/h1")).getText());
		driver.close();
	}

}
