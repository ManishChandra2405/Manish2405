class Person
{
 private int ssn,age;
 private String name;
 public Person(){}
 public Person(int ssn,String name,int age)
 {
 this.ssn=ssn;
 this.name=name;
 this.age=age;
 }
public void setSsn(int ssn)
 {
 this.ssn=ssn;
 }
 public void setName(String name)
 {
 this.name=name;
 }
 public void setAge(int Age)
 {
 this.age=age;
 }
 public int getSsn()
 {
 return ssn;
 }
 public String getName()
 {
 return name;
 }
 public int getAge()
 {
 return age;
 }
}

class Employee extends Person
{
  private int empid;
  private double salary;
  public Employee(int ssn,String name,int age,int empid,double salary)
  {
   super(ssn,name,age);
   this.empid=empid;
   this.salary=salary;
   }
  public void setEmpid(int empid)
  {
   this.empid=empid;
  }
  public void setSalary(int salary)
  {
   this.salary=salary;
  }
  public int getempid()
  {
   return empid;
  }
  public double getSalary()
  {
   return salary;
  }
}
class Salesman extends Employee
 {
  int points;
   public Salesman(int ssn,String name,int age,int empid,double salary,int points)
  {
   super(ssn,name,age,empid,salary);
   this.points=points;
  }
  public void setPoints(int points)
  {
   this.points=points;
  }
  public int getPoints()
  {
   return points;
  }
  public double getIncentives()
  {
   return points*500;
  }
  public double getTotalsalary()
  {
   return getSalary()+points*500;
  }
  }
class Test14
{
  public static void main(String[] args)
  {
   Salesman sm=new Salesman(1,"Manish",20,234,30000,7);
   System.out.println(sm.getSsn());
   System.out.println(sm.getName());
   System.out.println(sm.getAge());
   System.out.println(sm.getempid());
   System.out.println(sm.getSalary());
   System.out.println(sm.getPoints());
   System.out.println(sm.getIncentives());
   System.out.println(sm.getTotalsalary());
  }
}  
