import java.util.*;

public class double_number
{

  public static void main(String args[])
  {
 
    Scanner sc = new Scanner(System.in); 
    
    int V = sc.nextInt();
    int i=1;
    
    int arr[] = new int[10];
    
    System.out.println("X[" + 0 +"] =" + V);
    while(i <= 10)
    {
       V= V*2;
       System.out.println("X[" + i +"] =" + V);
       
       i++;
    }
     
    
  }
}    
