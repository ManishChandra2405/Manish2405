import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneWeb2
{
	public static void main(String[] args) 
	{
		  	System.setProperty("webdriver.chrome.driver",
		  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver ObjDriver = new ChromeDriver();
				ObjDriver.get("https://demo.opencart.com");
				System.out.println("opencart page loaded");
				ObjDriver.quit();
			}

		}
