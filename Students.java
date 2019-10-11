import java.util.*;
class Students
{
string name;
int usn;
int sem;

void input()
{
System.out.println("enter name,usn,sem");
Scanner sc=new Scanner(System.in);
name=sc.next();
usn=sc.nextInt();
sem=sc.nextInt();
}
void display()
{
System.out.println(name);
System.out.println(usn);
System.out.println(sem);
}
     }
class Test extends Students
{
int credits;
int cie_marks;
int i;
void input(){
super.input();
Scanner sc=new Scanner(System.in);
System.out.println("enter the credits of the 6 subjects");
credits arr[]=new credits[6];
for(i=0;i<=6;i++)
{
credits[i]=sc.nextInt();
}
System.out.println("enter the cie marks of 6 subjects");
cie_marks arr[]=new cie_marks[6];
for(i=0;i<=6;i++)
{
cie_marks[i]=sc.nextInt();
}
}
void display()
{
super.display();
for(i=0;i<=6;i++)
{
System.out.println("credits are"+credits[i]);
System.out.println("marks are"+cie_marks[i]);
}
}
}
class exam extends Test
{
int see_marks;
void input()
{
super.input();
Scanner sc=new Scanner(System.in);
System.out.println("enter the see marks of 6 subjects");
see_marks arr[]=new see_marks[6];
for(i=0;i<=6;i++)
{
see_marks[i]=sc.nextInt();
}
}
void display()
{
super.display();
for(i=0;i<=6;i++)
{
System.out.println("your see marks are"+see_marks[i]);
}
}
}
class result extends exam
{
int grade;
int total;
int sum;
float sgpa;
void input()
{
super.input();
total arr[]=new total[6];
grade arr[]=new grade[6];
for(i=0;i<=6;i++)
{
total[i]=see_marks[i]+cie_marks[i];
if(total[i]>=90)
{
grade[i]=10;
}
if(total[i]>=70)
{
grade[i]=9;
}
if(total[i]>=50)
{
grade[i]=8;
}
else if(total[i]>=40)
{
grade[i]=7;
}
else
{
grade[i]=0;
}
sum=sum+grade[i];
}
sgpa=(float)sum/6;
}
void display()
{
super.display();
Sysytem.out.println("sgpa is"+sgpa);
}
class demo
{
public static void main(String args[])
student ob=new student();
System.out.println(ob.input());
System.out.println(ob.display());
}
}


