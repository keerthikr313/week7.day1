package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	public LoginPage() {
		
	}
	
	public LoginPage typeUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	public LoginPage typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public WelcomePage ClickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();

	}


}
