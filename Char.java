import java.util.Scanner;
public class Char
{
 public static void main(String args[])
 {
   Scanner shill=new Scanner(System.in);
   System.out.println("enter month  number");
  int a=shill.nextInt();
   if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12 )
    {
      System.out.println("it has 31 days");
       
    } 
   else if (a==2)
    {
     System.out.println("it has 28 if it is leap it has 29");
    }
   else
    { 
     System.out.println("it has 30");
    }
  }
}
