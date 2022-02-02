package d_01_02_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.navigate().to("https://videojs.com/city");

		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")));
		driver.findElement(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")).click();

		try {
			driver.findElement(By.xpath("//button[contains(@class, 'vjs-big-play-button')]"));

		} catch (Exception e) {

		}

		Thread.sleep(5000);

		driver.close();

	}

}
