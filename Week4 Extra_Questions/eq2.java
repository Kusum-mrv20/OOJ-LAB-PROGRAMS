import java.util.*;
class Book{
	int bookid; 
	String booktitle;
	int no_of_pages;
	int year_of_pub;
	String author;
	String publisher;
	double price;

	void accept()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("\nEnter the Book details:");
	System.out.println("Enter Book ID:");
	bookid=s.nextInt();
	System.out.println("Enter Book title:");
	booktitle=s.next();
	System.out.println("Enter number of pages of the book:");
	no_of_pages=s.nextInt();
	System.out.println("Enter year of publication of the book:");
	year_of_pub=s.nextInt();
	System.out.println("Enter the name of author of the book:");
	author=s.next();
	System.out.println("Enter the publisher name of the book:");
	publisher=s.next();
	System.out.println("Enter price of the book:");
	price=s.nextInt();
	}
	
	void display()
	{
	System.out.println("\nThe Book details are as below:");
	System.out.println("The Book ID:"+bookid);
	System.out.println("The Book title:"+booktitle);
	System.out.println("The number of pages of the book:"+no_of_pages);
	System.out.println("The year of publication of the book:"+year_of_pub);
	System.out.println("The name of author of the book:"+author);
	System.out.println("The name of publisher name of the book:"+publisher);
	System.out.println("The price of the book:"+price);
	}
}

class BookMain{
public static void main(String ss[]){
Scanner s=new Scanner(System.in);
String authorname;
boolean i,j,k;
int n=0;
Book b1=new Book();
b1.accept();
Book b2=new Book();
b2.accept();
Book b3=new Book();
b3.accept();
b1.display();
b2.display();
b3.display();
System.out.println("\nEnter the author name:");
authorname=s.next();
i=authorname.equals(b1.author);
j=authorname.equals(b2.author);
k=authorname.equals(b3.author);
if(i==true)
{
System.out.println("\nThe details of the book written by "+authorname+" are as follows:");
b1.display();
}
if(j==true)
{
System.out.println("\nThe details of the book written by "+authorname+" are as follows:");
b2.display();
}
if(k==true)
{
System.out.println("\nThe details of the book written by "+authorname+" are as follows:");
b3.display();
}
if((b1.price>b2.price)&&(b1.price>b3.price))
System.out.println("\nThe most expensive book among the three is "+b1.booktitle);
if((b2.price>b1.price)&&(b2.price>b3.price))
System.out.println("\nThe most expensive book among the three is "+b2.booktitle);
if((b3.price>b1.price)&&(b3.price>b2.price))
System.out.println("\nThe title of the most expensive book among the three is "+b3.booktitle);

if(b1.year_of_pub==2020)
n++;
if(b2.year_of_pub==2020)
n++;
if(b3.year_of_pub==2020)
n++;
System.out.println("\nNumber of books published in the year 2020 are "+n);
if((b1.no_of_pages<b2.no_of_pages)&&(b1.no_of_pages<b3.no_of_pages))
{
System.out.println("\nThe details of the book with the least number of pages among the three are as follows:");
b1.display();
}
if((b2.no_of_pages<b1.no_of_pages)&&(b2.no_of_pages<b3.no_of_pages))
{
System.out.println("The details of the book with the least number of pages among the three are as follows:");
b2.display();
}
if((b3.no_of_pages<b1.no_of_pages)&&(b3.no_of_pages<b2.no_of_pages))
{
System.out.println("The details of the book with the least number of pages among the three are as follows:");
b3.display();
}
}
}