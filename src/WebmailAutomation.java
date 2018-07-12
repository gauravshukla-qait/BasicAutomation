
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebmailAutomation {
	static String password = "Gaurav@321#";
	static String username= "gauravshukla";

	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webmail.qainfotech.com:8443/");
		WebElement searchElement = driver.findElement(By.id("username"));
		searchElement.sendKeys(username);
		searchElement = driver.findElement(By.id("password"));
		searchElement.sendKeys(password);
		driver.findElement(By.id("username")).submit();
		Thread.sleep(3000);
		driver.findElement(By.id("zb__NEW_MENU_title")).click();
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		List<WebElement> elements = driver.findElements(By.className("addrBubbleHolder-empty"));
		actions.moveToElement(elements.get(0)).click().sendKeys("gsgauravshukla94@gmail.com").build().perform();
//		actions.moveToElement(elements.get(1)).click().sendKeys("priyankasingh@qainfotech.com").build().perform();
		driver.findElement(By.className("subjectField")).sendKeys("Daily status report");
//		driver.findElement(By.id("zb__COMPOSE-1___attachments_btn_title")).sendKeys("/home/qainfotech/Downloads/WorkTimePolicy.pdf");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    WebElement element = driver.findElement(By.className("attBubbleHolder"));	    
	    js.executeScript("arguments[0].click();", element);
		//		driver.findElement(By.id("zb__COMPOSE-1___attachments_btn_title"))
//		System.out.println(driver.findElement(By.className("attPlaceholderHint")).isDisplayed());
//		System.out.println(driver.findElement(By.className("attPlaceholderHint")).isEnabled());
//		actions.moveToElement(driver.findElement(By.id("zv__COMPOSE-1_attachments_div"))).click().sendKeys("/home/qainfotech/Downloads/1477730141_Work Time Policy_HR_QAIT_IX.0.pdf");
//		driver.switchTo().frame("ZmHtmlEditor1_body_ifr");
//		WebElement div = driver.findElement(By.xpath("//div"));
		/*actions.moveToElement(div).click().sendKeys("hi,\n" + 
				"\n" + 
				"Today I worked on creating classes for hris and webmail and snl and the code is uploaded on following url:\n" + 
				"\n" + 
				"https://github.com/gauravshuklaQA/snl-java-api\n" + 
				"Please review it and suggest for any improvement.\n" + 
				"\n" + 
				"Regards, \n" + 
				"Gaurav Shukla").build().perform();*/
//		driver.switchTo().parentFrame();
	   /* driver.findElement(By.id("zb__COMPOSE-1__SEND_title")).click();
	    Thread.sleep(3000);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    driver.findElement(By.id("DWT31_dropdown")).click();;
        Thread.sleep(1000);
	    WebElement element = driver.findElement(By.id("logOff_title"));	    
	    js.executeScript("arguments[0].click();", element);*/
		
		// Open mail by subject Keyword
		
		/*List<WebElement> elements = driver.findElements(By.className("SubjectDoubleRow"));
		for(WebElement element : elements) {
			String s = element.getText();
			if(s.contains("COUNTDOWN")) {
				element.click();
				break;
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
