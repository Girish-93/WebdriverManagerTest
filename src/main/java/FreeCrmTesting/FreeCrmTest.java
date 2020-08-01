package FreeCrmTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCrmTest {

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91821\\Downloads\\chrome v-81\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crmpro.com/index.html");//enter url
		
	    String userCredentials = Data.getUserLoginInfo().get("girishsb");
	    String userInfo[] = userCredentials.split("_");
	
		driver.findElement(By.name("username")).sendKeys(userInfo[0]);
		driver.findElement(By.name("password")).sendKeys(userInfo[1]);
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit')]"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].click();", loginBtn);

	}

}
