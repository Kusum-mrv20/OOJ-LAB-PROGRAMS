import java.util.*;
class Age {
	int years;
	int months;
	Age() 
	{}
	Age(int years,int months)
	{
		this.years=years;
		this.months=months;
	}
	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter years:");
		years=s.nextInt();
		System.out.println("Enter months:");
		months=s.nextInt();
	}
}
class AgeMain {
	public static void main(String ss[])
	{
		Age a=new Age(20,9);
		System.out.println("Sample input:"+a.years+" "+a.months);
		Age a1=new Age();
		System.out.println("Enter age of Ram:");
		a1.accept();
		Age a2=new Age();
		System.out.println("Enter age of Shyam:");
		a2.accept();
		int t1=a1.years*12 + a1.months;
		int t2=a2.years*12 + a2.months;
		if(t1>t2)
		{
			System.out.println("Ram is elder to Shyam");
		}
		else if (t2>t1)
		{
			System.out.println("Shyam is elder to Ram");
		}
		else
		{
			System.out.println("Ram and Shyam are of same age");
		}
	}
}
			
		
		
		
