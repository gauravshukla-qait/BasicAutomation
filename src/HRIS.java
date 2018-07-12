import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRIS {
	static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hris.qainfotech.com/login.php");
		driver.findElement(By.className("active")).click();
		driver.findElement(By.id("txtUserName")).sendKeys(WebmailAutomation.username);
		driver.findElement(By.id("txtPassword")).sendKeys(WebmailAutomation.password);
		driver.findElement(By.id("txtUserName")).submit();
		Thread.sleep(5000);
		List<WebElement> cellElements = driver.findElements(By.className("td_cell"));
		List<WebElement> dateElements = driver.findElements(By.className("date"));
		for(WebElement element : dateElements) {
			if(element.getText().equals("13")) {
				String s = cellElements.get(counter).getText();
				System.out.println(s);
				break;
			}
			else
				counter++;
		}
	}
}
