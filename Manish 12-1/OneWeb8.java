import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OneWeb8
{
	public static void main(String args [])
	{
	System.setProperty("webdriver.chrome.driver",
  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ObjDriver = new ChromeDriver();
	ObjDriver.get("http://demo.automationtesting.in/Register.html");
	WebElement radio = ObjDriver.findElement(By.name("radiooptions"));
	boolean status=radio.isDisplayed();
	System.out.println("radio button is displayed"+status);
	boolean enabled_status=radio.isEnabled();
	System.out.println("radio button is enabled"+enabled_status);
	boolean selected_status=radio.isSelected();
	System.out.println("radio button is selected"+selected_status);
	radio.click();
	ObjDriver.close();

}
	
	
}

