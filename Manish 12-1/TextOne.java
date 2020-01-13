import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOne 
{
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.chrome.driver",
  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ObjDriver = new ChromeDriver();
	ObjDriver.get("http://demo.automationtesting.in/Register.html");
	List <WebElement> total1=ObjDriver.findElements(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
	System.out.println(total1.size());
	for(WebElement ele:total1)
	{
		System.out.println(ele.getAttribute("placeholder"));
	}
	List <WebElement> total2=ObjDriver.findElements(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
	System.out.println(total2.size());
	for(WebElement ele:total2)
	{
		System.out.println(ele.getAttribute("placeholder"));
	}

}
}

\