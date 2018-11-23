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
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
		
		int min_count = n+1, res = -1; 
        int curr_count = 1; 
          
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count < min_count) 
                { 
                    min_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                  
                curr_count = 1; 
            } 
        } 
        if (curr_count < min_count) 
        { 
            min_count = curr_count; 
            res = arr[n - 1]; 
        } 
      
        System.out.print(res); 
	}
}
