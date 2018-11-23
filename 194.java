import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		s.next();
		char ch1=s.next().charAt(0);
		
		Character.toLowerCase(ch);
		Character.toLowerCase(ch1);
		if(ch!=ch1)
		{
			if(ch=='r')
			{
				if(ch=='p')
				System.out.print("P");
				else
				System.out.print("R");
			}
			if(ch=='p')
			{
				if(ch1=='r')
				System.out.print("P");
				else
				System.out.print("S");
			}
			if(ch=='s')
			{
				if(ch1=='r')
				System.out.print("R");
				else
				System.out.print("S");
			}
		}
		else
		System.out.print("D");
		
	} 
}
