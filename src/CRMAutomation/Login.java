package CRMAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://imcqa.crm.dynamics.com");
		
		driver.findElement(By.xpath("//input[@name = 'loginfmt']")).sendKeys("shradhama@cybage.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		driver.findElement(By.xpath("//input[@id = 'usernameInput']")).click();
		driver.findElement(By.xpath("//input[@id = 'passwordInput']")).click();
		driver.findElement(By.xpath("//input[@id = 'passwordInput']")).sendKeys("Sep@2020");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id = 'submitButton']")).click();
		System.out.print("Test");

	}

}
