package AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class popup_msg {
	@Test
	public void IDdemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\DXC Training testing tools\\DXC Selenium Automation  Class\\LaunchChromeBroweser\\chromebrowersjars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
		
		
		driver.findElement(By.id("Email")).sendKeys("shybxc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dom12@");
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		Thread.sleep(10000);
		
		
		WebElement country_Dropdown = driver.findElement(By.id("CountryId"));
        Select country_name = new Select(country_Dropdown);
        country_name.selectByVisibleText("Ghana");
        
        
        WebElement state_Dropdown = driver.findElement(By.id("StateProvinceId"));
        Select state_name = new Select( state_Dropdown );
         state_name.selectByIndex(0);
         
        driver.findElement(By.id("ZipPostalCode")).sendKeys("222001");
     
        
        
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

	}}


