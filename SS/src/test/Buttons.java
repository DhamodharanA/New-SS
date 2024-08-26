package test;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Buttons {
WebDriver driver;
	//1. Find the Position
	@Test
	public void Position() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\daran\\Downloads\\chromedriver-win64 - 126\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	WebElement Searchbtn =driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));	
	org.openqa.selenium.Point xypoint = Searchbtn.getLocation();
	
	int xvalue = (int) xypoint.getX();
	int yvalue = (int) xypoint.getY();
	
	System.out.println("Xvalue is"+xvalue +" Yvalue Is"+yvalue);
	}
	
	
	//2. Find the Color
	@Test
	public void color() {
	WebElement Colorbtn =driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));	
	String color = Colorbtn.getCssValue("background-color");
	System.out.println(color);
	}
	
	//3. Find the Size
	@Test
	public void Size() {
		WebElement Sizebtn =driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));	
		int height = Sizebtn.getSize().getHeight();
		int width = Sizebtn.getSize().getHeight();
		System.out.println("hi"+height+"width"+width);
	}
	//4. Goto Home
}
