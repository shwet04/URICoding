import java.util.*;

public class arrayFill
{
    public static void main(String args[])
     {
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int arr[] = new int[100];
        
        int count = 0;
        
        for(int i =0 ; i< 100 ; i++)
        {
             if(count == T)
               count=0; 
          arr[i] = count;
          count++;
        }
        
        
	for(int i=0; i<100; i++) 
	{
	  System.out.println(arr[i]);
	}  
     }
}     	
	
