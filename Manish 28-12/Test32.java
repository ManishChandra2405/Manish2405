import java.util.LinkedList;
import java.util.ListIterator;
class Test32
{
 public static void main(String[] args)
  { 
    LinkedList<String> list = new LinkedList<>();
    list.add("Manish");
    list.add("Chandra");
    list.add("Welcome");
    list.add("Chandra");
    list.add(1,"kowsy"); 
    for (String s : list)
     System.out.println(s);
    for(int i=0;i<list.size();i++)
     System.out.println(list.get(i));
    ListIterator<String> itr = list.listIterator();
     while(itr.hasNext())
      System.out.println(itr.next());
     System.out.println();
    while(itr.hasPrevious())
     System.out.println(itr.previous());
   }
}