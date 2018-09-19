import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class TestBooking {

	
	WebDriver driver = null; 
	private String url = "https://www.phptravels.net/"; 
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/Selenium/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testBooking()
	{
		driver.get(url);
		HomePage H = PageFactory.initElements(driver, HomePage.class); 
		H.clickLocation();
		H.getLocateButton().sendKeys("London");
		
		Actions action = new Actions(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit(); 
	}
}
