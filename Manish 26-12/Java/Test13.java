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
class Student extends Person
{
private int sid;
private double marks;
public Student(int ssn,String name,int age,int sid,double marks)
{
super(ssn,name,age);
this.sid=sid;
this.marks=marks;
}
public void setSid(int sid)
{
this.sid=sid;
}
public void setMaeks(double marks)
{
this.marks=marks;
}
public int getSid()
{
return sid;
}
public double getMarks()
{
return marks;
}
}
class Test13
{
 public static void main(String[] args)
 {
  Student s =new Student(1,"Manish",23,123,450);
  System.out.println(s.getSsn());
  System.out.println(s.getName());
  System.out.println(s.getAge());
  System.out.println(s.getSid());
  System.out.println(s.getMarks());
  }
}