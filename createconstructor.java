class Student{
private int roll;
private String name;
private String dept;
Student(int roll,String name,String dept)
{
this.roll=roll;
this.name=name;
this.dept=dept;
}
String display()
{
return roll+" "+name+" "+dept;
}
}
public class Const{
public static void main(String[]args){
Student s1 = new Student(1,"kim","cse");
Student s2 = new Student(2,"jinim","aiml");

System.out.println(s1.display());
System.out.println(s2.display());
}
}
