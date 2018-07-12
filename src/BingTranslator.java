import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingTranslator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/translator");
		driver.findElement(By.id("t_sv")).sendKeys("happy");
		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String w = (String) js.executeScript("document.getElementById('t_tv').innerHTML");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = driver.findElement(By.id("t_tv"));

//		String s = (String) js.executeScript("document.getElementById('t_tv').value");

//		String gaurav = (String) js.executeScript("return document.getElementById('t_tv').value");
		System.out.println(driver.findElement(By.id("t_dummydiv")).getText());
	}

}
