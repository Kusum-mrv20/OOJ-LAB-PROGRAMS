import java.util.*;
class Player {
	String id;
	String name;
	int scores[];
	int no_matches_played;
	
	Player() {}
	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Player details:");
		System.out.println("ID:");
		id=s.next();
		System.out.println("Name:");
		name=s.next();
		System.out.println("Number of matches played:");
		no_matches_played=s.nextInt();
		scores=new int[no_matches_played];
		for(int i=0;i<no_matches_played;i++)
		{
			System.out.println("Enter the score in match "+(i+1)+":");
			scores[i]=s.nextInt();
		}
	}
		
	void display()
	{
		System.out.println("Player details with greater average score:");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Number of matches played: "+no_matches_played);
		for(int i=0;i<no_matches_played;i++)
		{
			System.out.println("Score in match "+(i+1)+":"+scores[i]);
		}
	
	}
	double calculate(){
		int sum=0;
		for(int i=0;i<no_matches_played;i++)
		{
			sum=sum+scores[i];
		}
		return (double)sum/no_matches_played;
	}
		
		
		
}
class Plymain {
	public static void main(String ss[]) {
		Player p1=new Player();
		p1.accept();
		Player p2=new Player();
		p2.accept();
		if(p1.calculate()>p2.calculate())
		{
			p1.display();
			System.out.println("Average score: "+p1.calculate());
		}
		else
		{
			p2.display();
			System.out.println("Average score: "+p2.calculate());
		}
	}
}
		
		
		
		
	