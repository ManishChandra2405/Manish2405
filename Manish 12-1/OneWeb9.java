import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OneWeb9
{
	public static void main(String args [])
	{
	System.setProperty("webdriver.chrome.driver",
  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ObjDriver = new ChromeDriver();
	ObjDriver.get("http://demo.automationtesting.in/Register.html");
	List <WebElement> button = ObjDriver.findElements(By.xpath("//button"));
	System.out.println("Total buttons on page"+button.size());
	ObjDriver.close();
	}
}
