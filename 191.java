
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
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		int k=0;
		for(int i=0,j=n-1;i<n && j>=0;i++,j--)
		{
			if(a[i]==b[j])
			{
				k++;
			}
		}
		if(k==n)
		System.out.print("yes");
		else
		System.out.print("no");
		
	}
}
