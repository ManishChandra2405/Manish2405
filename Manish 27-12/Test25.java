import java.util.HashSet;
import java.util.Iterator;
class Test25
{
  public static void main(String[] args)
   {
     HashSet<String> hs1 = new HashSet<String>();
     hs1.add("Welcome");
     hs1.add("Manish");
     hs1.add("Kowsalya");
     hs1.add("Kumar");
     hs1.add("Padma");
     HashSet<String> hs2 = new HashSet<String>(); 
     hs2.add("Manish");
     hs2.add("Kumar");
     hs1.retainAll(hs2);
     for(String s: hs1)
     System.out.println(s);
    }
} 