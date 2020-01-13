import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestAssaign2 
{
	public static void main(String[] args) {
		String var = "Your Store";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("http://demo.opencart.com");
		String var1 = ObjDriver.getTitle();
		if(var1.equalsIgnoreCase(var))
			System.out.println("The Home page is opened");
		else System.out.println("The home page is not opened");
		WebElement Obj1 = ObjDriver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[2]/a"));
		Obj1.click();
		WebElement Obj2 = ObjDriver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[2]/div/a"));
		Obj2.click();
		var1 = ObjDriver.getTitle();
		System.out.println("Title :  "+var1);
		WebElement obj3 = ObjDriver.findElement(By.id("input-limit"));
		Select s1 = new Select(obj3);
		List<WebElement> sl = s1.getOptions();
		System.out.println("Minimum value="+sl.get(0).getText());
		System.out.println("Maximum value="+sl.get(sl.size()-1).getText());
		for(WebElement x : sl)
			System.out.println(x.getText());

	}
		
	}
