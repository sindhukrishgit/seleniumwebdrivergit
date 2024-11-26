package selgit1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class MyFirstTestcaseGit {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//Webdriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
        String tit = driver.getTitle();
        
        if(tit.equals("OrangeHRM"))
        {
        	System.out.println("title is same, so test case passsed");
        }
		
        else
        {
        	System.out.println("title is not same, so test case failed");
        }
	
	    driver.close();
	
	
	}

}
