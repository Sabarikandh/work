package alert_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		driver.findElement(By.name("B1")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	}

}
