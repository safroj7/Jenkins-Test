package com.jenkintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JenklinTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Driver and jars\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
