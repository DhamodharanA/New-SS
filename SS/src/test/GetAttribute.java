package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class GetAttribute {
	static WebDriver driver;
	@Test
	public static void Name() throws IOException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\daran\\Downloads\\chromedriver-win64 - 126\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 
	 WebElement Getatt = driver.findElement(By.id("APjFqb"));
	// Getatt.getAttribute("value");
	 
	 Getatt.getText();
	 System.out.println(Getatt);
	 
	 TakesScreenshot ss = (TakesScreenshot)driver;
		
		File Source = ss.getScreenshotAs(OutputType.FILE);
	
		Files.copy(Source, new File ("D:\\Movies\\New folder\\Screen10.png"));
		}
	@Test
	public static void SS() throws IOException {
		 driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File Source = ss.getScreenshotAs(OutputType.FILE);
	
		Files.copy(Source, new File ("D:\\Movies\\New folder\\Screen11.png"));
	}
}
