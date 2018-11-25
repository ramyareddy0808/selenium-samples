package Testing1;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.invokeBrowser();
		
		wc.getTitleOFThePage();
		
		String title = wc.getTitleOFThePage(); 
		
		System.out.println("Title of the page is " +title);
		
		System.out.println("Current URL of the page is "+wc.getCurrentURL());
		
		wc.closeBrowser();
	

	}

}
