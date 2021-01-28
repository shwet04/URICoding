import java.util.*;

public class numberLessThanTen
{

  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     
     //double n=100;
     
     double arr[] = new double[100];
     
     for(int i=0; i<=10 ; i++)
     {
         arr[i] = sc.nextDouble();
     }
     
     for(int j=0 ;j <=10 ; j++)
     {
       if(arr[j] <= 10)
       {
          System.out.println("A[" + j + "] = " + arr[j] );
        }
     }
  }
  
}  
