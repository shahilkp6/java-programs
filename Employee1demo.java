import java.util.Scanner;

class Employee {
    private  int id;
    private String desig;
    private int ssnNO;
    private int age;
    private double salar;
    private static int idcount = 0;



    Employee(String b, int c,int d, double e){

        desig=b;
        ssnNO=c;
        age=d;
        salar=e;
        id=++idcount;


    }

    public void setter() {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter all values");
        id = obj.nextInt();
        desig = obj.next();
        ssnNO = obj.nextInt();
        age = obj.nextInt();
        salar = obj.nextDouble();

    }

    static int getidcounter() {
        
        return idcount;
      
    }

}

class Employee1demo {

    public static void main(String[] args) {
        
    Employee ob1=new Employee("ed", 2, 3, 4.0);
    System.out.print("idcount=" + Employee.getidcounter());         
    Employee ob2=new Employee("ef", 5, 6, 8.0);
    System.out.print("idcount=" + Employee.getidcounter());  
    Employee ob3=new Employee("es", 1, 55, 83.0);
    System.out.print("idcount=" + Employee.getidcounter()); 
    }

}