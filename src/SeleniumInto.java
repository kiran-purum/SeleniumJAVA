import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumInto {

	public static void main(String[] args) {

		//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KP15\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();


		//Firefox		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KP15\\Downloads\\geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();

		driver1.get("https://rahulshettyacademy.com");

		System.out.println(driver1.getTitle());

		System.out.println(driver1.getCurrentUrl());

		driver.close();


		//Microsoft Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\KP15\\Downloads\\msedgedriver.exe");

		WebDriver driver2 = new EdgeDriver();

		driver2.get("https://rahulshettyacademy.com");

		System.out.println(driver2.getTitle());

		System.out.println(driver2.getCurrentUrl());

		driver.close();
		
		//Internet Explorer
		//System.setProperty("webdriver.ie.driver", "C:/path/to/IEDriverServer.exe");
		
	}
}
