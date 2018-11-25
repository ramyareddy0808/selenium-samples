package Testing1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver;
	String url = "http://www.facebook.com"; 
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//setting the size/resolution of the screen -responsive testing- checking responsiveness of the website
		
		Dimension dim = new Dimension(360, 460);
		driver.manage().window().setSize(dim);
		
		//Maximise the windows
		driver.manage().window().maximize();
		
		//Cookies should not affect testing/testing should bypass the cookies
		driver.manage().deleteAllCookies();
		
		//navigate to the URL/website(URL is declared above)
		driver.get(url);
		
		//navigate commands/navigate to another URL
		driver.navigate().to("http://qatechhub.com");
		
		//to go forward/backward/refresh the page
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
			
	}
	//to return the title of the page of type "string"-whenever void is not used - return keyword is used
	public String getTitleOFThePage(){
		
		String title = driver.getTitle();
		
		return title;		
	}
	
	//To get the current URL
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	
	//To close the browser/active window and quit the complete brower
	public void closeBrowser() {
	
	//driver.close();
	
	driver.quit();
	}

}
