class Employee {
    private int id;
    private String name;
    private int ssnNO;
    private int age;
    private double salary;

    Employee(int a, String b, int c, int d, double e) {
        id = a;
        name = b;
        ssnNO = c;
        age = d;
        salary = e;

    }
public int getid(){

    return id;
}
}

class Employee2demo {


public static Employee avgmin(Employee a , Employee b,Employee c){
    if(a.getid()<b.getid() && a.getid()<c.getid()){
    return a;}
    else if(b.getid()<a.getid() && b.getid()<c.getid()){
    return b;}
    else{
    return c;}


}
public static void main(String[] args) {
    Employee ob1=new Employee(1, "h", 9, 7, 5.0);
    Employee ob2=new Employee(4, "f", 1, 3, 6.0);
    Employee ob3=new Employee(6, "aa", 12, 34, 56.0);
Employee ob4=avgmin(ob1,ob2,ob3);
System.out.print(ob4.getid());

}



}