package WebDriverArchitecture;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("Chrome Browser gets launched!");
	}

	@Override
	public void findElements() {
		System.out.println("Chrome Driver - Find Elements method is called");
		
	}

	@Override
	public void findElement() {
		System.out.println("Chrome Driver - Find Elements method is called");
		
	}

	@Override
	public void click(String btn) {
		System.out.println("Chrome Driver - Click on button : "+btn);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Chrome Driver - Enter the value in text box" + element +" : "+value);
		
	}

	@Override
	public void getText(String element) {
		System.out.println("Chrome Driver " + element);
		
	}

	@Override
	public boolean isDisplayed(String element) {
		System.out.println("Chrome Driver - Elements is displayed");
		return true;
	}

	@Override
	public void get(String ele) {
		System.out.println("Launch the Url: " + ele);
		
	}

}
