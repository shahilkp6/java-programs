import java.util.Scanner;
import java.lang.Math;
public class Root
   {
    public static void main(String[] args)
     {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter coef  respec");
        double a= obj.nextInt();
        double b= obj.nextInt();
        double c= obj.nextInt();
        double d=(b*b)-(4*a*c);
        double x= Math.sqrt(d);
        System.out.println("enter="+x);
     }
    }
