package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends Base {

	@Test
	
	void javaScriptExecutor()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='value';", webelement name);
		//js.executeScript("arguments[0].click();", webelementname);
		
		WebElement singleInput = driver.findElement(By.id("single-input-field"));
		//singleInput.sendKeys("test");
		js.executeScript("arguments[0].value='Greesh';",singleInput);
		
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		//showMessageButton.click();
		js.executeScript("arguments[0].click();", showMessageButton);		

	}

	@Test
	void javascriptExecutor1()
	{
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,150)","");
		//js.executeScript("window.scrollBy(0,-350)","");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		
	}
}
