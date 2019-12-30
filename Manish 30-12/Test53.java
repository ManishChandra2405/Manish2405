import java.util.StringTokenizer;
class Test53
{
 public static void main(String[] args)
  {
    String s = "I am Manish Chandra,I am 23 years old";
    StringTokenizer st = new StringTokenizer(s,",");
    System.out.println(st.countTokens());
    while(st.hasMoreTokens())
     System.out.println(st.nextToken());
   }
}