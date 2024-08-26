package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\daran\\Downloads\\chromedriver-win64 - 126\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		//Use TakesScreenshot method to capture screenshot
		 TakesScreenshot screenshot = (TakesScreenshot)driver;
		 
		 //Saving the screenshot in desired location
		 File source = screenshot.getScreenshotAs(OutputType.FILE);
		 
		 //Path to the location to save screenshot
		 Files.copy(source, new File("D:\\Movies\\New folder\\Screen.png"));
		 
		 System.out.println("Screenshot is captured");
		}
	}


