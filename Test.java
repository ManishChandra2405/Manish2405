import java.util.ArrayList;
import java.util.Collection;
class Student
{
public int sid;
public String sname;
public int age;
public int marks;
public Student(){}
public Student(int sid,String sname,int age,int marks)
{
this.sid=sid;
this.sname=sname;
this.marks=marks;
this.age=age;
}
public void setSid(int sid)
{
this.sid=sid;
}
public void setSname(String sname)
{
this.sname=sname;
}
public void setAge(int age)
{
this.age=age;
}
public void setMarks(int marks)
{
this.marks=marks;
}
public int getSid()
{
return sid;
}
public String getSname()
{
return sname;
}
public int getAge()
{
return age;
}
public int getMarks()
{
return marks;
}
}
class Training
{
public int tid;
public String tname;
Student s;
public Training(){}
public Training(int tid,String tname,Student s)
{
this.tid=tid;
this.tname=tname;
this.s=s;
}
public void setSid(int sid)
{
this.sid=sid;
}
public void setTname(String tname)
{
this.tname=tname;
}
public void setStudent(Student s)
{
this.s=s;
}
public int getTid()
{
return tid;
}
public String getTname()
{
return tname;
}
ArrayList<Student> s = new ArrayList<Student>();
s.add(1,"Manish",23,9);
s.add(2,"Kowsalya",21,10);
}
class Test
{
public static void main(String[] args)
{
ArrayList<Training> t=new ArrayList<Training>();  
t.add(1,"Java",getStudent());
t.add(2,"Html",getStudent());
}
}