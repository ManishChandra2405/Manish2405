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
public void setMarks(double marks)
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
class Pgstudent extends Student
{
String subject;
public Pgstudent(int ssn,String name,int age,int sid,double marks,String subject)
{
super(ssn,name,age,sid,marks);
this.subject=subject;
}
public void setSubject(String subject)
{
this.subject=subject;
}
public String getSubject()
{
return subject;
}
public double getDegreemarks()
{
return getMarks()*5;
}
}
class test15
{
public static void main(String[] args)
{
Pgstudent ps=new Pgstudent(1,"Manish",23,123,450,"Physics");
  System.out.println(ps.getSsn());
  System.out.println(ps.getName());
  System.out.println(ps.getAge());
  System.out.println(ps.getSid());
  System.out.println(ps.getMarks());
  System.out.println(ps.getSubject());
  System.out.println(ps.getDegreemarks());
  }
  }
