package d_31_01_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");

		List<WebElement> elementi = driver.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));

		for (int i = 0; i < elementi.size(); i++) {
			
			driver.findElement(By.xpath("//*[contains(@class, 'col-md-12')]//div[last()]/button")).click();
			
			Thread.sleep(3000);
			
			List<WebElement> obrisani = driver
					.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));
			
			if (obrisani.size() == elementi.size() - i - 1) {
				System.out.println("Obrisan");
				
			} else {
				System.out.println("Nije obrisan");
			}
		}

		driver.close();
	}

}
