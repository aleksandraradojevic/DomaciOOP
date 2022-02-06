package d_03_02_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.navigate().to("https://www.google.com/");
		WebElement body = driver.findElement(By.xpath("//body"));

		js.executeScript("arguments[0].style='background:' + arguments[1];", body, "blue");
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
