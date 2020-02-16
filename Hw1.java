import java.util.Scanner;
 public class Hw1
 { 
    int count;
   int i=1;
    double d=2.1;
    boolean b=true;
   Scanner obj=new Scanner(System.in);
   public static void main(String args[])
    {
       
   static    int i=5;
       double d=7.7;
       i++;
       d++;
       Hw1 ob1,ob2;
       ob1=new Hw1();
       ob2=new Hw1();
       ob1.b=false;
       ob2.b=false;
       ob1.count+=5;
      System.out.print(++ob1.i +" "+ ++ob1.d +" "+ ob1.b);
       System.out.print(++ob2.i +" "+ ++ob1.d +" "+ ob1.b);
       System.out.print(i+" "+d); 
      System.out.print(count +" "+ Hw1.count +" "+ ob1.count +" "+ ob2.count);
    }
}
