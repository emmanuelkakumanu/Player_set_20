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
		int st=s.nextInt();
		int pl=s.nextInt();
		int re=st%pl;
		if(re==0)
		System.out.print(pl);
		else 
		System.out.print(re);
	}
}
