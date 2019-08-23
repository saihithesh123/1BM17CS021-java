import java.util.*;
class employee
{
String employeeID;
String employeename;
int basicsalary,DA,GS,incometax,netsalary;
public void read()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the employee ID");
employeeID=sc.next();
System.out.println("Enter the employee name");
employeename=sc.next();
System.out.println("Enter the basic salary of employee");
basicsalary=sc.nextInt(); 
calculate();
}
public void calculate()  
{
DA=(75/100)*basicsalary;
GS=basicsalary+DA+HRA;
incometax=(30/100)*GS;
netsalary=basic+DA-incometax;
}
public void display()
{
System.out.println("Employee ID  :  "+employeeID+"n"+"Employeename  :  "+employeename+"n"+"Employee basic salary  :  "+DA+"n"+"GS  :  "+GS+"n"+"Incometax  :  "+incometax+"n"+"netsalary  :  "+netsalary);
}
 }
class main
{
public static void main(String args[])
{
employee employeeobj=new employee();
employeeobj.read(); 
employeeobj.display(); 
}
}