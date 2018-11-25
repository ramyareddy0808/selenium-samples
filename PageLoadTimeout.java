package Testing1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageLoadTimeout {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver;
		String URL = "https://www.ebay.in";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\libs\\chromedriver.exe");
			
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(URL);
		
		System.out.println(driver.getTitle());
		
		Actions action = new Actions(driver);
		
		WebElement mobileAndAccLink = driver.findElement(By.linkText("Mobile & Accessories"));
		
		action.moveToElement(mobileAndAccLink).build().perform();
		
		WebElement mobilePhoneLink = driver.findElement(By.linkText("Mobile Phones"));
		
		action.moveToElement(mobilePhoneLink).click().build().perform();
		
}

}
