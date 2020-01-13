import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OneWeb10 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
	  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		WebElement radio = ObjDriver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		boolean status=radio.isDisplayed();
		System.out.println("check button isdisplayed"+status);
		radio.click();
		boolean enabled_status=radio.isEnabled();
		System.out.println("check button is enabled"+enabled_status);
		WebElement radio2 = ObjDriver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		boolean status2=radio2.isDisplayed();
		System.out.println("check button isdisplayed"+status2);
		radio2.click();
		boolean enabled_status2=radio.isEnabled();
		System.out.println("check button is enabled"+enabled_status2);
		WebElement radio3 = ObjDriver.findElement(By.xpath("//*[@id=\"checkbox3\"]"));
		boolean status3=radio3.isDisplayed();
		System.out.println("check button isdisplayed"+status3);
		radio3.click();
		boolean enabled_status3=radio.isEnabled();
		System.out.println("check button is enabled"+enabled_status3);
	
	
	}

}
