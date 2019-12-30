interface Interface1
{
void changeGear(int a);
void Speed(int a);
void Slow(int a);
}
class Bike implements Interface1
 {
  int Speed;
  int Gear;
  public void changeGear(int newGear)
  {
   Gear=newGear;
  }
  public void Speed(int increment)
  {
   Speed=Speed+increment;
  }
  public void Slow(int decrement)
  {
   Speed=Speed-decrement;
  }
  public void display()
  {
  System.out.println("Speed:"+Speed);
  System.out.println("Gear:"+Gear);
  }
}
class Car implements Interface1
 {
  int Speed;
  int Gear;
  public void changeGear(int newGear)
  {
   Gear=newGear;
  }
  public void Speed(int increment)
  {
   Speed=Speed+increment;
  }
  public void Slow(int decrement)
  {
   Speed=Speed-decrement;
  }
  public void display()
  {
   System.out.println("Speed:"+Speed);
   System.out.println("Gear:"+Gear);
  }
}
class Test17
 {
   public static void main(String[] args)
    {
     Bike b=new Bike(); 
     b.changeGear(3);
     b.Speed(30);
     b.Slow(20);
     b.display();
     Car c=new Car();
     c.changeGear(4); 
     c.Speed(30);
     c.Slow(10);
     c.display();
    }
} 



