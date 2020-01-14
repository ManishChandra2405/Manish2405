import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 public class TestAppend2
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		int c;
		System.out.println("enter 1 or2");
		c=in.nextInt();
		if(c==1)
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
		    Obj3.click();
		    Obj4.click();
		    System.out.println("Warning: No match for E-Mail Address and/or Password.");
		    if(ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")).isDisplayed());
		    {
			System.out.println(ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")));
			ObjDriver.findElement(By.xpath("/html/body/div[2]/div[1]"));
			System.out.println(ObjDriver.switchTo().alert().getText());
		    }
			ObjDriver.quit();
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
		   	else
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
			System.out.println("Login name"+objprop.getProperty("login1"));
			System.out.println("Pasword"+objprop.getProperty("pwd1"));
			System.setProperty("webdriver.chrome.driver",
		  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver ObjDriver = new ChromeDriver();
			ObjDriver.get("https://www.opencart.com/index.php?route=account/login");
			System.out.println("opencart2 page loaded");
			String var1 = ObjDriver.getTitle();
			System.out.println("Title of the page"+var1);
		    WebElement Obj1 = ObjDriver.findElement(By.xpath("/html/body/header/nav/div/div[2]/div/a[1]" ));
		    Obj1.click();
		     WebElement Obj3 = ObjDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/form/div[1]/input"));
		    Obj3.sendKeys(objprop.getProperty("login1"));
		    WebElement Obj4 = ObjDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/form/div[2]/input"));
		    Obj4.sendKeys(objprop.getProperty("pwd1"));
		    ObjDriver.findElement(By.xpath("/html/body/div/div[2]/div[1]"));
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
}
		

	
	



