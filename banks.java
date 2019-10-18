import java.util.*;
class Account
{
    String name, accno, type_acc;
    double bal;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, accno and balance");
        name=sc.next();
        accno=sc.next();
        bal=sc.nextDouble();
    }
    void output()
    {
        System.out.println("Details are:\nName"+name+"\nAcc no "+accno+"\nType of acc "+type_acc+"\nBalance"+bal);

    }
}
class Savings extends Account
{
    double rate, time,interest;
    void input()
    {
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Rate and Time");
        rate=sc.nextDouble();
        time=sc.nextDouble();
    }
    void compute()
    {   
        double b=bal;
        bal=bal*(Math.pow((1+rate/100), time));
        interest=bal-b;

    }
    void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        double with=sc.nextDouble();
        if(bal<with)
        {
            System.out.println("Your balance is too low. It cant be withdrawn");
            return;
        }
        bal-=with;
        System.out.println("Balance "+bal);

    }
    void output()
    {
        super.output();
        System.out.println("Compound interest "+interest);
    }
}
class Current extends Account
{
    final double minbal=500;
    final double penalty=200;
    void input()
    {
        super.input();
    }
    void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        double with=sc.nextDouble();
        if(bal<with)
        {
            System.out.println("Your balance is too low. It cant be withdrawn");
            return;
        }
        bal-=with;
        System.out.println("Balance "+bal);
    }
    void checkbal()
    {
        if(bal<minbal)
        {
            System.out.println("Your balance is less that min balance(penalty of 200 taken)");
            bal-=penalty;
            System.out.println("Balance "+bal);

        }
    }
    void output()
    {
        super.output();
    }
}
class Bank
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type of account");
        String t;
        t=sc.next();
        if(t=="savings")
        Savings a = new Savings();
        a.input();
        a.compute();
        a.output();
        a.withdraw();
        Current b = new Current();
        b.input();
        b.output();
        b.withdraw();
        b.checkbal();
    }
}
