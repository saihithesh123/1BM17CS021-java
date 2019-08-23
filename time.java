import java.until.*;
class Time
{
int h;
int m;
int s;
time();
{
h=0;
m=0;
s=0;
}
time(int x,int y,int z);
{
h=x;m=y;s=z;
}
void current time(int x,int y,int z);
h=x;m=y;s=z;
}
void advance(int x,int y,int z)
{
s=s+z;
m=m+y+(s/60);
s=s%60;
h=h+x+(m/60);
m=m%60;
h=h%24;
}
void print()
{
System.out.println("hour"+h);
System.out.println("min"+m);
System.out.println("sec"+s);
}
class Time Demo
{
public static void main(string.arg[])
{
Scanner sc=new Scanner(System.in);
int ch;
while(1)
{
System.out.print("enter your option of choice");
ch=sc.nextInt();
switch(ch)
{
case 1:Time a=time int();
       System.out.println("enter hours,min,and seconds");
       int hh=sc.nextInt();
       int mm=sc.nextInt();
       int ss=sc.nextInt();
       a.current Time(hh,mm,ss);
       a.print();
       break;
case 2:Time obj=new Time(hh,mm,ss);
       break;
case 3:System.out.println("advance");
       break;
}
 }
  }
   }




