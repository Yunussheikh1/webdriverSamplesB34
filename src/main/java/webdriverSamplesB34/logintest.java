package webdriverSamplesB34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement schBox =driver.findElement(By.name("q"));
		schBox.sendKeys("java Tutorial");
		schBox.submit();

	}

}
