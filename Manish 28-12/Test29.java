import java.util.TreeSet;
import java.util.Iterator;
class Test29
{
  public static void main(String args[])
   {  
     TreeSet<String> tset = new TreeSet<>();
     tset.add("Welcome");
     tset.add("Hello");
     tset.add("Manish");
     tset.add("Chandra");
     for (String s : tset)
     System.out.println(s);
   }
}
