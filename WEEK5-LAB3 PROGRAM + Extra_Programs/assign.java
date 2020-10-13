import java.util.*;
class Employee
{
	String empid;
	String empname;
	double empnohrs;
	double empbasic;
	double emphra;
	double empda;
	double empit;
	double empgross;
	
	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter employee details:");
		System.out.println("Enter employee id:");
		empid=s.next();
		System.out.println("Enter employee name:");
		empname=s.next();
		System.out.println("Enter number of hours:");
		empnohrs=s.nextDouble();
		System.out.println("Enter basic salary:");
		empbasic=s.nextDouble();
		System.out.println("Enter hra(%):");
		emphra=s.nextDouble();
		System.out.println("Enter da(%):");
		empda=s.nextDouble();
		System.out.println("Enter it(%):");
		empit=s.nextDouble();
	}
	double calculate()
	{
		empgross=empbasic+ empbasic*(emphra/100.0)+ empbasic*(empda/100.0) - empbasic*(empit/100.0);
		if(empnohrs > 200)
		{
			empgross = empgross + 100*(empnohrs-200);
		}
		else
		{
			empgross = empgross - 100*(200-empnohrs);
		}
		return empgross;
			
	}
}
class EmpMain {
	public static void main(String ss[])
	{
		Employee e= new Employee();
		e.accept();
		System.out.println("Gross salary: "+e.calculate());
	}
}
		