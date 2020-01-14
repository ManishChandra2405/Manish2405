import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAppend 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Properties objprop = new Properties();
		try
		{
		objprop.load(new FileInputStream("C:\\Users\\admin\\Desktop\\properties.txt"));
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e2)
		{
			e2.printStackTrace();
		}
		System.out.println("Login name"+objprop.getProperty("login"));
		System.out.println("Pasword"+objprop.getProperty("pwd"));
		System.setProperty("webdriver.chrome.driver",
	  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com");
		System.out.println("opencart page loaded");
		String var1 = ObjDriver.getTitle();
		System.out.println("Title of the page"+var1);
	    WebElement Obj1 = ObjDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a" ));
	    Obj1.click();
	     WebElement Obj3 = ObjDriver.findElement(By.xpath("//*[@id=\"input-email\"]"));
	    Obj3.sendKeys(objprop.getProperty("login"));
	    WebElement Obj4 = ObjDriver.findElement(By.xpath("//*[@id=\"input-password\"]"));
	    Obj4.sendKeys(objprop.getProperty("pwd"));

		
	}

}
