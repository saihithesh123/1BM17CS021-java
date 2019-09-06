import java.util.*;

class Account
{
String name;
int balance;
int number;
void Input(){
Scanner.sc=new Scanner(System.in);
System.out.println("enter the name,number,balance");
name=sc.next();
balance=sc.nextInt();
number=sc.nextInt();
}
void Display()
{
System.out.println(name);
System.out.println(balance);
System.out.println(number);
  }
}

class Savingaccount extends Account
{
float intrestrate;
int time;
void Input()
{
Scanner.sc=new Scanner(System.in);
Super.Input();
intrestrate=sc.nextInt();
time=sc.nextInt();
}
void Display()
{
Super.Display();
System.out.println(intrestrate);
System.out.println(time);
}
float compute();
{
return balance*time*intrestrate;
   }
}
class Demo
{
public static void main(String.org[])
{
Savingaccount.sc=new Savingaccount();
sc.Input();
System.out.println(sc.compute());
sc.Display();
 }
}


