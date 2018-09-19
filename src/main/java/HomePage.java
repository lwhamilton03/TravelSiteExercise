import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//*[@id=\"s2id_autogen8\"]/a")
	private WebElement locateButton; 
	
//	public boolean check()
//	{
//		if(locateButton == null)
//		{
//			return false;
//		}
//		return locateButton.isDisplayed();
//	}
	
	public void clickLocation()
	{
		getLocateButton().click();
	}

	public WebElement getLocateButton() {
		return locateButton;
	}

	public void setLocateButton(WebElement locateButton) {
		this.locateButton = locateButton;
	}
}
