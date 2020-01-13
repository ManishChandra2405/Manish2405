import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestAssaign {

	public static void main(String[] args) throws IOException 
	{
		String username,password;
		Scanner in = new Scanner(System.in);
		username=in.nextLine();
		password=in.nextLine();
		int a;
		System.out.println("enter 1 or2");
		a=in.nextInt();
		if(a==1)
		{
			 FileWriter fileWriter = new FileWriter("C:/Users/admin/Desktop/New.txt",true);
			 PrintWriter print = new PrintWriter(fileWriter);
			 fileWriter.append(username);
			 fileWriter.append(password);
			 print.close();
			 System.out.println("File Appended");
		}
		else
		{
			System.out.println("Not appende");
		}
     }
}
