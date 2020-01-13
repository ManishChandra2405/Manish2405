import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneWeb5 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
	  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 String username,password;
		    Scanner sc1 = new Scanner(System.in);
		    Scanner sc2 = new Scanner(System.in);
		    username=sc1.nextLine();
		    password=sc2.nextLine();
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com");
		String var1 = ObjDriver.getTitle();
		System.out.println("Title of the page"+var1);
	    WebElement Obj1 = ObjDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a" ));
	    Obj1.click();
	    WebElement Obj2 = ObjDriver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
	    Obj2.click();
	    WebElement Obj3 = ObjDriver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input"));
	    Obj3.click();
	

	}

}
