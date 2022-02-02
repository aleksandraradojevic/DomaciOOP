package d_28_01_2022;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate()
				.to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");


		for (int i = 0; i < 5; i++) {
			
			driver.findElement(By.xpath("//*[contains(@class, 'btn btn-info add-new')]")).click();

			driver.findElement(By.id("name")).sendKeys("Aleksandra Radojevic");
			driver.findElement(By.id("department")).sendKeys("QA");
			driver.findElement(By.id("phone")).sendKeys("061234567");
			driver.findElement(By.xpath("//*[contains(@class, 'table table-bordered')]/tbody//tr[last()]/td[4]/a[1]"))
					.click();

		}

		Thread.sleep(8000);

		driver.close();

	}

}
