import java.util.Random; 
class A2
{ 
   void func(int n) 
    { 
        try { 
            int x = 10 / n; 
            int y[] = new int[n]; 
            y[x] = 10; 
            System.out.println("No exception arose"); 
            } 
        catch (Exception e) 
            { 
            if (e instanceof ArithmeticException) 
                System.out.println("Can't divide by 0"); 
            if (e instanceof ArrayIndexOutOfBoundsException) 
                System.out.println("This index doesn't exist in this array"); 
            } 
            }   
    public static void main(String a[]) 
    { 
        new A().func(new Random().nextInt(10)); 
    } 
}