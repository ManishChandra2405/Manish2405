import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OneWeb7 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
	  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com");
		WebElement Obj1 = ObjDriver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/a[1]"));
	    List<WebElement> allLinks=Obj1.findElements(By.tagName("a"));
		System.out.println("Number of links"+ allLinks.size());
		for (WebElement ele:allLinks)
		{
			System.out.println(ele.getAttribute("href"));
		}
	ObjDriver.close();
}

}
