package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{
	public void verifyTable() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.id("dataTable"));
		//System.out.println(table.getText());
		WebElement tablerow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(tablerow.getText());
	}

	public static void main(String[] args) {
		HandlingTable handlingtable = new HandlingTable();
		handlingtable.initializeBrowser();
		handlingtable.verifyTable();
		

	}

}
