import java.util.Scanner;
public class Div
{
 public static void main(String args[])
 {
   Scanner shill=new Scanner(System.in);
   System.out.println("enter number");
  int a=shill.nextInt();
   if(a%5==0 && a%11==0)
    {
      System.out.println("it is divisible");
       
    } 
   else
    {
     System.out.println("not divisible");
    }
  }
}
