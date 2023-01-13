package WebDriverArchitecture;

public class SafariDriver implements WebDriver {
	
	public SafariDriver() {
		System.out.println("Safari Browser gets launched!");
	}

	@Override
	public void findElements() {
		System.out.println("Safari Driver - Find Elements method is called");
		
	}

	@Override
	public void findElement() {
		System.out.println("Safari Driver - Find Elements method is called");
		
	}

	@Override
	public void click(String btn) {
		System.out.println("Safari Driver - Click on button : "+btn);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Safari Driver - Enter the value in text box" + element +" : "+value);
		
	}

	@Override
	public void getText(String element) {
		System.out.println("Safari Driver " + element);
		
	}

	@Override
	public boolean isDisplayed(String element) {
		System.out.println("Safari Driver - Elements is displayed");
		return true;
	}

	@Override
	public void get(String ele) {
		System.out.println("Launch the Url: " + ele);
		
	}
}
