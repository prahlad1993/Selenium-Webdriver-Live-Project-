import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.WebSocket;

import io.netty.channel.unix.Socket;

import java.net.SocketException;
public class Seleniumproject {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// This implicitly & pageload wait is use for connection reset exception
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// open URL photo editor web site 
		
		driver.get("https://www9.lunapic.com/editor/");
		
		//use implicitly wait operation
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		
		//use window maximize operation
		driver.manage().window().maximize();
		
		//finding element operation using xpath
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[1]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.findElement(By.xpath("/html/body/div[1]/div[13]/div/center/form/table/tbody/tr/td[1]/a")).click();
		
		//Backward operation
		driver.navigate().back();
		
		//Refresh window operation
		driver.navigate().refresh();
		
		// Adding more photos 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[6]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/a[6]")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.navigate().back();
		driver.navigate().refresh();
		// Add frame on photo
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[6]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/a[10]")).click();
		//Use page load concept wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		//Page scroll concept
		js.executeScript("window.scrollBy(0,500)");
        
	// Get Url of current page
		System.out.println("Page URL:"+driver.getCurrentUrl());
		List<WebElement> totalhprlinks = driver.findElements(By.tagName("a"));
		int count=totalhprlinks.size();
		System.out.println("The number of links on Webpage: "+count);
		
		driver.quit();
	
	}
}

