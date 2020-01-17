package AssesmentAutomate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testtwo 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
	  			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver Objdriver=new ChromeDriver();    
	   Objdriver.get("http://demo.opencart.com");   
	   Objdriver.manage().window().maximize();  
	   Objdriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]/span")).click();
	   Objdriver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/span")).click();
	   System.out.println("The US Price is:");
	   String a = Objdriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[2]")).getText();
	   System.out.println(a);
	   System.out.println("The Indian Price is :");
	   String b=a.substring(1);
	   double result = Double.parseDouble(b);
	   double inr = result*75;
	   System.out.println(inr);
	   System.out.println("The Euro price is :");
	   double eur = result*0.90;
	   System.out.println(eur);
	   System.out.println("The pound price is :");
	   double pnd = result*0.77;
	   System.out.print(pnd);
			   
	   
	}
}
