import java.util.*;
class Bookdet{
	String bname;
	String auth;
	int pr;
	int pg;
	void Set(String bname, String auth, int pr,int pg){
		this.bname = bname;
		this.auth = auth;
		this.pr = pr;
		this.pg = pg; 
	}


	public String toString() {
		String s1 = ("Book Name: "+ bname);
		String s2 = ("Name of Author: "+ auth );
		String s3 =  (" Price: "+ pr);
		String s4 =  ("Number of pages: " + pg);
		return (s1+s2+s3+s4);
	}
}
class Book{
	public static void main(String args[]){
		String bname;
		String auth;
		int pr;
		int pg;
		System.out.println("Enter the number of books");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Bookdet a[] = new Bookdet[n];
		for (int i = 0;i<n;i++)
		{
			a[i] = new Book();
			System.out.println("Enter the name of the book:");
			bname = sc.next();
			System.out.println("Enter the name of the Author:");
			auth = sc.next();
			System.out.println("Enter the price of the book:");
			pr = sc.nextInt();
			System.out.println("Enter the number of pages:");
			pg = sc.nextInt();
			a[i].Set(bname,auth,pr,pg);
		}
		System.out.println("Book Details are :");
		for (i= 0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
   
