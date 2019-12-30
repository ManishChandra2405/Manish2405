import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class Test40
{
 public static void main(String[] args) 
  {
    try(FileOutputStream fos =new FileOutputStream("abc.dat"))
      {
       for(int i=65;i<=90;i++)
          fos.write(i);
      }
    catch(IOException ex)
     {
       System.out.println(ex);
     }
   }
}