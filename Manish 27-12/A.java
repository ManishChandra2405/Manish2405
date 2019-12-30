import java.util.Random; 
class A { 
    void func(int n) 
    { 
        try 
           { 
            int x = 10 / n; 
            int y[] = new int[n]; 
            y[x] = 10; 
           } 
        catch (ArithmeticException e) 
          { 
            System.out.println("Dividing by 0"); 
          } 
        catch (ArrayIndexOutOfBoundsException e) 
          { 
            System.out.println("That index doesn't exist"); 
          } 
    } 
    public static void main(String a[]) 
    { 
        new A().func(new Random().nextInt(10)); 
    } 
} 