import java.io.*;
import java.util.*;
public class Lottery {

	int lottery_number[]=new int[5];
	Lottery()
	{
		Random ran=new Random();					// creating object of random class
		for(int i=0;i<5;i++)
		{
			lottery_number[i]=ran.nextInt(10);		// generates random number from 0 to 9
		}
	}
	int[] copy()									// returns lottery number randomly generated
	{
		return lottery_number;
	}
	int person_num(int arr[])						// compares person number and lottery number and return the no of digit match
	{
		int c=0;
		for(int i=0;i<5;i++)
		{
			if(lottery_number[i]==arr[i])
				c++;								// counts the number of digit that matches
		}
		return c;
	}
}
