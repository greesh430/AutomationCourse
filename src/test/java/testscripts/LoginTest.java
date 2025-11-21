package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import test.DemoBase;

public class LoginTest extends DemoBase {
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidCredentials() {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();	
		
	}
@Test	
public void verifyWhetherUserIsAbleToLoginWithInValidCredentials() {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("abc");
		
    	WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("def");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();	

}
@Test	
public void verifyWhetherUserIsAbleToLoginWithValidUsernameInvalidPassword() {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("abc");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();	
}
	
	@Test
public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameValidPaswword() {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("abc");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();	
}
}






