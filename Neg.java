import java.util.Scanner;
public class Neg
{
 public static void main(String args[])
 {
   Scanner shill=new Scanner(System.in);
   System.out.println("enter number");
   int a=shill.nextInt();
   if(a<0)
    {
      System.out.println("it is negtive");
       
    } 
   else if(a==0)
    {
     System.out.println("it is neither");
    }
   else
    {
     System.out.println("it is pos");
    }
  }
}
