package org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("kamini97");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('password').value='97K44M'");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		//Drop down
		WebElement loca = driver.findElement(By.id("location"));
		Select s=new Select(loca);
		//boolean multiple = s.isMultiple();
		//System.out.println(multiple);
		s.selectByVisibleText("New York");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1= new Select(hotels);
		s1.selectByValue("Hotel Sunshine");
		Thread.sleep(2000);
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2= new Select(room);
		s2.selectByValue("Deluxe");
		Thread.sleep(2000);
		
		WebElement num = driver.findElement(By.id("room_nos"));
		Select s3= new Select(num);
		s3.selectByValue("2");
		
		driver.findElement(By.id("datepick_in")).sendKeys("05/09/2022");
		Thread.sleep(2000);
		driver.findElement(By.id("datepick_out")).sendKeys("07/09/2022");
		Thread.sleep(2000);
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s4=new Select(adult);
		s4.selectByVisibleText("2 - Two");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		//Radio button
		driver.findElement(By.name("radiobutton_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		js.executeScript("document.getElementById('first_name').value='kamini'");
		Thread.sleep(2000);
		driver.findElement(By.name("cancel")).click();
		//Logout
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		//login again
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
		
		
		}

}
