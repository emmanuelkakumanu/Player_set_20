
import java.util.*;
import java.lang.*;
import java.io.*;
//import com.google.common.primitives.Ints; 

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(b);
		//int min=Ints.indexOf(a,b[0]);
		//int max=Ints.indexOf(a,b[n-1]);
		
		int min=0,max=0;
		for(int i=0;i<n;i++)
		if(a[i]==b[0])
		{
			min=i;break;
		}
		
		
		for(int i=0;i<n;i++)
		if(a[i]==b[n-1])
		{
			max=i;break;
		}
		
		
		System.out.print(max-min);
	}
}
