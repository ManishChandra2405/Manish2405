import java.util.HashSet;
class Test18
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
   }
} 