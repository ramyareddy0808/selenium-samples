package Testing1;

public class DemoGuru99Project {

	public static void main(String[] args) {
		
		Guru99Project guru = new Guru99Project();
		
		guru.invokebrowser();
		
		guru.login();
		
		guru.newCustomer();
		
		String customerId = guru.getCustomerId();
		
		System.out.println("Customer ID is "+customerId);
		
		guru.addAccount(customerId);
		
		guru.closeBrowser();
		
		
	}

}



