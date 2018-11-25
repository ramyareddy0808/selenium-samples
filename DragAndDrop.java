package Testing1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		ChromeDriver driver;
		String URL = "https://jqueryui.com/droppable";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\libs\\chromedriver.exe");
			
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(URL);
		
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		String colorBeforeDnD = target.getCssValue("color");
		
		System.out.println(colorBeforeDnD);
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).build().perform();
		
		String colorAfterDnD = target.getCssValue("color");
		
		System.out.println(colorAfterDnD);
		
		
		driver.close();

	}

}
