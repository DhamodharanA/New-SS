package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
WebDriver driver;
	@Test
	public void verifyradiobutton() throws InterruptedException {
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
	WebElement clkadm = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a"));
	clkadm.click();
	Thread.sleep(3000);
	
	//Verify the Radio Button
	WebElement Checked = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span"));
	
	WebElement UnChecked = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span"));
	
	Boolean Status1 = Checked.isSelected();
	Boolean Status2 = UnChecked.isSelected();
	
	System.out.println(Status1);
	System.out.println(Status2);
	}
}