import java.util.Scanner;
public class Leap
{
 public static void main(String args[])
 {
   Scanner shill=new Scanner(System.in);
   System.out.println("enter year");
  int a=shill.nextInt();
   if(a%4==0)
    {
      if(a%100==0)
       {
         if(a%400==0)
          {
              System.out.println("it is a leap year");
          }
         else
          {
             System.out.println("not a leap year");     
          }
       }
      else
       {
          System.out.println("it is leap");
       }
     }
   else
    {
     System.out.println("not a leap");
    }
  }
}
