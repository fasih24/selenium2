package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\uddin\\eclipse-workspace\\selenium_tool\\chromedriver_win32 (2)\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\uddin\\eclipse-workspace\\selenium_tool\\geckodriver-v0.26.0-win64 (1)\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
	//	WebDriver driver= new FirefoxDriver();
		WebDriver driver= new ChromeDriver();
		driver.manage().window();
		driver.get("http://www.google.com");
		driver.navigate().to("http://ebfs.bruteforcesolution.net/ebfs/index.php");
//		driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		
		WebElement searchBar=driver.findElement(By.xpath("//input[@id='search_query_top']"));
		
		searchBar.sendKeys("shirt");
	
		WebElement btn=driver.findElement(By.xpath("//button[@name='submit_search']"));
		Point point=btn.getLocation();
		System.out.println("x cord : "+point.x+" y cord : "+point.y);
		btn.click();
		
		
//		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();

	}

}
