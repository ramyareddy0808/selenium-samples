package Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {
	
	
	ChromeDriver driver;
	String URL = "http://www.demo.guru99.com/v4";
	
	public void invokebrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(URL);
	}
		//Login
		public void login() {
			
			WebElement userTextbox = driver.findElement(By.name("uid"));
			userTextbox.sendKeys("mngr129022");
			
			driver.findElement(By.name("password")).sendKeys("qEdydap");
			
			driver.findElement(By.name("btnLogin")).click();
			
		}
	
		//New customer
		public void newCustomer() {
			driver.findElement(By.linkText("New Customer")).click();
			
			driver.findElement(By.name("name")).sendKeys("Ramya");
			
			driver.findElement(By.xpath("//input[@value='f']")).click();
			
			driver.findElement(By.name("dob")).sendKeys("01/12/1989");
			driver.findElement(By.name("addr")).sendKeys("Worcester \n Road");
			driver.findElement(By.name("city")).sendKeys("Framingham");
			driver.findElement(By.name("state")).sendKeys("MA");
			driver.findElement(By.name("pinno")).sendKeys("017000");
			driver.findElement(By.name("telephoneno")).sendKeys("5081112222");
			
			String emailId = "aa"+System.currentTimeMillis()+"@gmail.com";
			
			System.out.println("Email id is "+emailId);
			
			driver.findElement(By.name("emailid")).sendKeys(emailId);
			driver.findElement(By.name("password")).sendKeys("asdfg");
			
			driver.findElement(By.name("sub")).click();
				
		}
		//To get customer id
			public String getCustomerId() {
			return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		}
			
			
			//create new account/add account
			public void addAccount(String customerId) {
				driver.findElement(By.linkText("New Account")).click();
				driver.findElement(By.name("cusid")).sendKeys(customerId);
				
				//to select account from drop down
				
				WebElement accountType = driver.findElement(By.name("selaccount"));
				Select dropdown = new Select(accountType);
				dropdown.selectByVisibleText("Current");
				System.out.println("Is multiselect? :: " + dropdown.isMultiple());

				driver.findElement(By.name("inideposit")).sendKeys("44400");
				driver.findElement(By.name("button2")).click();
				
				
			}
			
			
	 
		public void closeBrowser() {
			
			driver.quit();
		}
	
	

}
