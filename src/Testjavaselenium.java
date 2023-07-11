import org.openqa.selenium.chrome.ChromeDriver;

public class Testjavaselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://admin-demo.nopcommerce.com");

	}

}
