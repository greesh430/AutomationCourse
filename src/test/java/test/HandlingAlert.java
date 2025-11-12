package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base{
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert simpalert = driver.switchTo().alert();
		simpalert.accept();
	}
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert confrmalert = driver.switchTo().alert();
		confrmalert.dismiss();		
	}

	public static void main(String[] args) {
		HandlingAlert handlingalert = new HandlingAlert();
		handlingalert.initializeBrowser();
		handlingalert.verifySimpleAlert();
		handlingalert.verifyConfirmAlert();

	}

}
