import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
class Test42
{
 public static void main(String[] args) 
  {
    try(FileWriter fis =new FileWriter("abc.dat",true))
      {
         for(int i=97;i<122;i++)
           fis.write(i);
      }
    catch(IOException ex)
     {
       System.out.println(ex);
     }
   }
}