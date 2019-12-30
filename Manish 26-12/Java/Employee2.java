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

class Employee2 extends Person
{
  private int empid;
  priavte double salary;
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
  public double salary()
  {
   return salary;
  }
}
class Test12
{
 public static void main(String args[])
 {
  Emplpoyee e=new Employee(1,"Manish",23,2450,3000);
  System.out.println(e.getSsn());
  System.out.println(e.getName());
  System.out.println(e.getAge());
  System.out.println(e.gempid());
  System.out.println(e.getSalary());
  }
}
