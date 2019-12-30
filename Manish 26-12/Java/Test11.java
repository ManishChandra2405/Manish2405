class Student
{
 public int rno;
 public String name;
 public int sub1;
 public int sub2;
 public int sub3;
public Student(int rno,String name,int sub1,int sub2,int sub3)
{
 this.rno=rno;
 this.name=name;
 this.sub1=sub1;
 this.sub2=sub2;
 this.sub3=sub3;
}
public int getrno()
{
return rno;
}
public String getname()
{
return name;
}
 public double gettotalmarks()
{
double totalmarks=sub1+sub2+sub3;
return totalmarks;
}
public double getaverage()
{
double average=gettotalmarks()/3;
return average;
}
public String getgrade()
{
String grade;
if(gettotalmarks()<30)
{
grade="fail";
}
else
{
grade="pass";
}
return grade;
}
public String getdivision()
{
String division;
if(getgrade().equals("pass"))
{
division="a section";
}
division="b section";
return division;
}
}
class Test11
{
public static void main(String args[])
{
Student s[]={new Student(101,"John",50,60,70),new Student(102,"Johncena",70,90,0),new Student(103,"dj",0,6,0)};
for(int i=0;i<3;i++)
{
System.out.println(s[i].getrno());
System.out.println(s[i].getname());
System.out.println(s[i].gettotalmarks());
System.out.println(s[i].getgrade());
System.out.println(s[i].getdivision());
}
}
}