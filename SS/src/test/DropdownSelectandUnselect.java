package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectandUnselect {
WebDriver driver;
	@Test
	public void Select() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\daran\\Downloads\\chromedriver-win64 - 126\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Login the Application
		WebElement UN = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		UN.click();
		UN.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement PW = driver.findElement(By.xpath("//*[@name='password']"));
		PW.sendKeys("admin123");
		
		//Click Login Button
		WebElement Lbtn = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']"));
		Lbtn.click();
		Thread.sleep(3000);
		
		// Home page
		WebElement clkadm = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
		clkadm.click();
		Thread.sleep(3000);
		
		//Click Add Button
		WebElement Addbtn = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		Addbtn.click();
		Thread.sleep(3000);
		
		
		//Select the Status Disabled
		WebElement Dropdown = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div"));
		Dropdown.click();
		Select select = new Select(Dropdown);
		
		Thread.sleep(3000);
		select.selectByVisibleText("Disabled");
		//*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[0]
		Thread.sleep(3000);
	}
}
/*
 * @Test public void Homepage() { driver.findElement(By.xpath(
 * "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
 * 
 * } //*[@id="app"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a }
 */
