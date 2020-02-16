import java.util.Scanner;

class Employee {
  private int id;
  private String name;
  private int ssnNo;
  private double salary;

  Employee(int a, String b, int c, double d) {
    id = a;
    name = b;
    ssnNo = c;
    salary = d;
  }

  public void setter() {
    System.out.print("enter ");
    Scanner ob = new Scanner(System.in);
    id = ob.nextInt();
    name = ob.nextLine();
    ssnNo = ob.nextInt();
    salary = ob.nextDouble();

  }

  public int getid() {

    return id;
  }

}

public class Employeedemo {

  public static double findavg(Employee a, Employee b) {

    double avg;
    avg = (a.getid() + b.getid()) / 2.0;
    return avg;

  }

  public static void main(String[] args) {

    Employee ob1 = new Employee(15, "shahil", 5, 10000.5);
    Employee ob2 = new Employee(15, "axle", 6, 20000.5);

    double e;
    e = findavg(ob1, ob2);
    System.out.print("avg =" + e);
  }

}