import java.util.Scanner;
class Test54
{
  public static void main(String[] args)
   {
    int no;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    no=in.nextInt();
    in.nextLine();
    System.out.println("Enter a String");
    String n = in.nextLine();
    System.out.println("You have entered the " + "Number:" +no+ " String: " +n);
    }
}