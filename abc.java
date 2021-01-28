import java.util.*;

public class abc
{

  public static void main(String args[])
  {
 
    Scanner sc = new Scanner(System.in); 
    
    int X[] = new int[10];

    for(int j = 0 ; j<10 ; j++)
    {
    	X[j] = sc.nextInt();	
    }
    
    for(int i=0; i <10 ;i++)
    {
    
   	if(X[i] <= 0)
   	{
   	  System.out.println("X[" + i+"] =" + " 1");
   	}
   	
   	else
   	{
   	  System.out.println("X["+ i +"] = " + X[i] );
   	}
   	 
    }

    
  }
  
}    
