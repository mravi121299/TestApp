package AutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class page_launch {
	@Test
	public void IDdemo() {
		System.setProperty("webdriver.chrome.driver", "D:\\DXC Training testing tools\\DXC Selenium Automation  Class\\LaunchChromeBroweser\\chromebrowersjars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String my_title=driver.getTitle();
		String expectedTitle = "Demo Web Shop";
if(my_title.equalsIgnoreCase(expectedTitle))
	System.out.println("Title Matched");
else
	System.out.println("Title didn't match");
driver.close();
driver.quit();

}}
