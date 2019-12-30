import java.util.HashSet;
import java.util.Iterator;
class Test26
{
  public static void main(String[] args)
   {
     HashSet<Integer> hs1 = new HashSet<Integer>(); 
     hs1.add(10);
     hs1.add(100);
     hs1.add(new Integer(234));
     hs1.add(245);
     for (Integer i: hs1)
     System.out.println(i);
    }
}
     