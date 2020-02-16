import java.util.Scanner;
public class Even
{
 public static void main(String args[])
 {
   Scanner shill=new Scanner(System.in);
   System.out.println("enter number");
  long int a=shill.nextInt();
   if(a%2==0)
    {
      System.out.println("it is even");
       
    } 
   else
    {
     System.out.println("it is odd");
    }
  }
}
