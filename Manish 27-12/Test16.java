interface MyInterface
{
  void sum(int x,int y);
  void mul(int x,int y);
}
class Sum implements MyInterface
{
 public void sum(int x,int y)
  {
   System.out.println("Sum is" +(x+y));
  }
 public void mul(int x,int y)
  {
  System.out.println("Mul is" +(x*y));
  }
}
class Mul implements MyInterface
 {
    public void sum(int x,int y)
   {
    System.out.println("Sum is" +(x-(-y)));  
   }
   public void mul(int x,int y)
   { 
  System.out.println("Mul is" +(y*x));
   }
 }
class Test16
{
  public static void main(String[] args)
    {
    Sum s=new Sum();
     s.sum(3,3);
     s.mul(2,3);
    Mul m=new Mul();
     m.sum(2,6);
     m.mul(12,7); 
    }
}

