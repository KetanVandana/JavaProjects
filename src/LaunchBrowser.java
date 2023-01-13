
public class LaunchBrowser {
	
	
	public boolean isBrowserLaunched(String browser) {
		
		System.out.println("Launch Browser");
		
		switch(browser.toLowerCase().trim()) {
		
		case "chrome":
			System.out.println("Chrome broser gets launched....");
			return true;
			
		case "edge":
			System.out.println("Edge broser gets launched....");
			return true;
			
		case "ie":
			System.out.println("IE broser gets launched....");
			return true;
			
		case "safari":
			System.out.println("safari broser gets launched....");
			return true;
			
		case "opera":
			System.out.println("Opera broser gets launched....");
			return true;
			
		default:
			System.out.println("Please pass the right browser: "+ browser);
			return false;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaunchBrowser br = new LaunchBrowser();
		System.out.println(br.isBrowserLaunched("EdGE"));
	}

}
