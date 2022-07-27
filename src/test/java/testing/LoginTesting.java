package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTesting {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
//		driver.get("http://google.com");
//		driver.quit();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().setSize(new Dimension(1594, 860));
	    driver.findElement(By.cssSelector("#divUsername > .form-hint")).click();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    driver.quit();
	}

}
