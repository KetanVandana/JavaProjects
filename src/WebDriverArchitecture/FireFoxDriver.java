package WebDriverArchitecture;

public class FireFoxDriver implements WebDriver{
	
	public  FireFoxDriver() {
		System.out.println("FireFox Browser gets launched!");
	}

	@Override
	public void findElements() {
		System.out.println("FireFox Driver - Find Elements method is called");
		
	}

	@Override
	public void findElement() {
		System.out.println("FireFox Driver - Find Elements method is called");
		
	}

	@Override
	public void click(String btn) {
		System.out.println("FireFox Driver - Click on button : "+btn);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("FireFox Driver - Enter the value in text box" + element +" : "+value);
		
	}

	@Override
	public void getText(String element) {
		System.out.println("FireFox Driver " + element);
		
	}

	@Override
	public boolean isDisplayed(String element) {
		System.out.println("FireFox Driver - Elements is displayed");
		return true;
	}

	@Override
	public void get(String ele) {
		System.out.println("Launch the Url: " + ele);
		
	}
}
