import java.io.*;
import java.util.*;
public class LotteryTest {

	public static void main(String args[])
	{
		Lottery l=new Lottery();
		int person_number[]=new int[5];
		Scanner sc=new Scanner(System.in); // declaring object of scanner to read values from user
		System.out.println("Enter the person lottery number");
		for(int i=0;i<5;i++)
		{
			person_number[i]=sc.nextInt();		
		}
		int r=l.person_num(person_number);   // calls the method that will return no of digits that matches
		int cp[]=new int[5];
		cp=l.copy();

for(int i=0;i<5;i++)
	System.out.print(cp[i]+"\t");
		
		if(r==5)
			System.out.println("User number is grand prize winner:");
		else
			System.out.println("Number of digit match:"+r);
		sc.close();
	}
}
