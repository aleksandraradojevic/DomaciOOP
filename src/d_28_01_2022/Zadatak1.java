package d_28_01_2022;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj zvezdica (1 do 5): ");
		int broj = s.nextInt();

		if (broj == 1) {
			driver.findElement(By.id("rating-star-1")).click();

		} else if (broj == 2) {
			driver.findElement(By.id("rating-star-2")).click();

		} else if (broj == 3) {
			driver.findElement(By.id("rating-star-3")).click();

		} else if (broj == 4) {
			driver.findElement(By.id("rating-star-4")).click();

		} else if (broj == 5) {
			driver.findElement(By.id("rating-star-5")).click();

		} else {
			System.out.println("Pogresan unos!");
		}

		Thread.sleep(8000);

		driver.close();

	}

}
