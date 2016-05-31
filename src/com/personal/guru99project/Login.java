package com.personal.guru99project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void LoginApp(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr38718");
		driver.findElement(By.name("password")).sendKeys("yhuhurE");
		driver.findElement(By.name("btnLogin")).click();
		String LoginStatus = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
		System.out.println(LoginStatus);
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
	}

}
