class Student
{
 private int rno,s1,s2,s3,m1,m2,m3;
 private String name;
 public Student(){}
 public Student(int rno,String name,int s1,int s2,int s3)
 {
 this.rno=rno;
 this.name=name;
 this.s1=s1;
 this.s2=s2;
 this.s3=s3;
 }
public int getTotalmarks()
{
return s1+s2+s3;
}
public int getAverage()
{
return s1+s2+s3/3;
}
public String getResults()
{
if (m1>40 && m2>=40 && m3>=40)
return "passed";
return "failed";
}
public String getDivision()
{
 if (m1>40 && m2>=40 && m3>=40)
 {
  int avg=getAverage();
  if(avg>=70)
  return "First";
  else if(avg>=50)
  return "second";
  else 
  return"third";
 }
else 
return "null";
}
public int getRno()
{
return rno;
}
public String getName()
{
return name;
}
}
class Test6
{
 public static void main(String[] args)
 {
  Student s = new Student(1,"Manish",70,50,40);
  System.out.println(s.getRno());
  System.out.println(s.getName());
  System.out.println(s.getTotalmarks());
  System.out.println(s.getAverage());
  System.out.println(s.getResults());
  System.out.println(s.getDivision());
  }
}
 