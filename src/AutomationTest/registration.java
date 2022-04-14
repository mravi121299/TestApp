package AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class registration {
	@Test
	public void IDdemo() {
		System.setProperty("webdriver.chrome.driver", "D:\\DXC Training testing tools\\DXC Selenium Automation  Class\\LaunchChromeBroweser\\chromebrowersjars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("domnic");
		driver.findElement(By.id("LastName")).sendKeys("sweta");
		driver.findElement(By.id("Email")).sendKeys("shybxc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dom12@");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Dom12@");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		
	
	}

}
