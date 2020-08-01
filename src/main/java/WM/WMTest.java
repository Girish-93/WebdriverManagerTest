package WM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WMTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.operadriver().setup();
//		WebDriverManager.phantomjs().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.iedriver().setup();
//		WebDriverManager.chromiumdriver().setup();
		
		WebDriverManager.chromiumdriver().setup();
	    driver = new ChromeDriver();
	}
	
	@Test
	public void CrmPro() {
		driver.get("https://www.crmpro.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
