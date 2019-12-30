import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Test48
{
 public static void main(String[] args) 
  {
    Employee e = new Employee(1,"Manish",20000);
    try(FileOutputStream fos = new FileOutputStream("emp.dat"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        )
     {
       oos.writeObject(e); 
     }
     catch (IOException ex)
     {
       System.out.println(ex);
     }  
  }
}
     