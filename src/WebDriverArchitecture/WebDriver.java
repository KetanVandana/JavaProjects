package WebDriverArchitecture;

public interface WebDriver extends SearchContext {
	
	@Override
	public void findElements();
	
	@Override
	public void findElement();
	
	
	
	public void click(String button);
	public void get(String ele);
	public void sendKeys(String element, String value);
	public void getText(String element);
	public boolean isDisplayed(String element);

}
