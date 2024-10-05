package Selenium_TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test {
  @Test
  public void f() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
  }
}
