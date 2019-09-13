import java.util.*;
class PERSON{
string name;
int age;
string address;
void Input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name,age,address");
name=sc.next();
age=sc.nextInt();
address=sc.next();
}
void Display()
{
System.out.println("name is"=+name);
System.out.println("age is"=+age);
System.out.println("address is"=+address);
}
   }
class STUDENT extends PERSON{
int rollno;
int sem;
void Input()
{
Super.Input();
Scanner sc=new Scanner(System.in);
System.out.println("enter the rollno,sem");
rollno=sc.nextInt();
sem=sc.nextInt();
}
void Display()
{
Super.Display();
System.out.println("rollno is"=+rollno);
System.out.println("sem is"=+sem);
}
  }
class EXAM extends STUDENT{
int marks1;
int marks2;
void Input()
{
Super.Input();
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks1,marks2");
marks1=sc.nextInt();
marks2=sc.nextInt();
}
void Display()
{
Super.Display();
System.out.println("marks1 is"=+marks1);
System.out.println("marks2 is"=+marks2);
}
float compute()
{
  float avg=(marks1+marks)/2;
return avg;
}
   }
class DEMO{
public static void main();
{
avg.sc=new avg();
sc.Input();
System.out.println(sc.avg());
sc.Display();
}
  }
 
  
