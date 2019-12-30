import java.util.HashSet;
import java.util.Iterator;
class Test20
{
  public static void main(String[] args)
   {
     HashSet<String> hs = new HashSet<String>();
     hs.add("Welcome");
     hs.add("Manish");
     hs.add("Kowsalya");
     hs.add("Kumar");
     hs.add("Padma");
     System.out.println(hs.add("Welcome"));
     System.out.println(hs.size());
     for(String s : hs)
         System.out.println(s);
     hs.remove("Welcome");
     Iterator<String> itr = hs.iterator();
     while(itr.hasNext())
     System.out.println(itr.next());
   }
} 