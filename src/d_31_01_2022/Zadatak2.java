package d_31_01_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://geodata.solutions/");

		Select dropdownCountry = new Select(driver.findElement(By.name("country")));
		
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		
		Select dropdownCity = new Select(driver.findElement(By.name("city")));
		
		dropdownCountry.selectByVisibleText("Belgium");
		Thread.sleep(5000);
		
		dropdownState.selectByVisibleText("Wallonia");
		Thread.sleep(5000);
		
		dropdownCity.selectByVisibleText("Arlon");
		Thread.sleep(5000);
		

		driver.close();

	}

}
