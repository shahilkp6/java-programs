import java.util.Scanner;
public class Chara
 {
   public static void main(String[] args)
     {
         Scanner obj=new Scanner(System.in);
         System.out.println("enter charecter");
         char ch = obj.next().charAt(0);
         int a = ch;
         if(a>= 97 && a<=122)
          {
             System.out.println("lower case");
         
          }
         else if(a>=65 && a<=90)
           
          {
            System.out.println("it is uppercase");
          }
         else if((a>=32 && a<=47) || (a>=58 && a<=64) || (a>=91 && a<=96) || (a>=123 && a<=126))
         { 
            System.out.println("special");
         }
        else
          {
              System.out.println("digits");
           }
     }

 }
  
