import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneWeb3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
	  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com");
		System.out.println("opencart page loaded");
		String var1 = ObjDriver.getTitle();
		System.out.println("Title of the page"+var1);
		WebElement Obj1 = ObjDriver.findElement(By.xpath("//html/body/div[2]/ul/li[2]/a"));
		Obj1.click();
		String var2 = ObjDriver.getTitle();
		System.out.println("Title of the page"+var2);
		

	}

}
