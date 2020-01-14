import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWeb1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
	  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://ksrtc.in/oprs-web/");
		ObjDriver.manage().window().maximize();
		ObjDriver.findElement(By.xpath("/html/body/main/form/div/div/div[2]/div[3]/button")).click();
		System.out.println(ObjDriver.switchTo().alert().getText());
		try
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		ObjDriver.switchTo().alert().accept();
		ObjDriver.quit();
		
	}

}
