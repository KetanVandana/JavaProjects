package WebDriverArchitecture;

import java.util.Scanner;

public class WalmartTest {
	
	static WebDriver driver; 

	public static void main(String[] args) {
		
		System.out.print("Enter which browser you want to launch: ");
		Scanner sc = new Scanner(System.in);
		
		
		String browser = sc.next();
		System.out.println(browser);
		
		if (browser.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.trim().equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}else if (browser.trim().equalsIgnoreCase("firefox")) {
			driver = new FireFoxDriver();
		}else {
			System.out.println("Please pass right browser : "+ browser);
		}
		
		driver.get("www.walmart.com");
		driver.findElement();
		driver.findElements();
		
		driver.sendKeys("UserName", "Vandana");
		driver.sendKeys("Paasword", "Vandana12345");
		
		driver.click("SubmitButton");
		
		driver.getText("Welcome Vandana...");
	

	}

}
