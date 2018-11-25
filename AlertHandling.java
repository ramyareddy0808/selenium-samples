package Testing1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver;
		String URL = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\libs\\chromedriver.exe");
			
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.manage().deleteAllCookies();
		
		driver.get(URL);
		
		driver.switchTo().frame("iframeResult");
				
		driver.findElement(By.tagName("button")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(3000);
		alert.accept();
		
		//alert.dismiss();
		
		driver.quit();
		
		

	}

}
