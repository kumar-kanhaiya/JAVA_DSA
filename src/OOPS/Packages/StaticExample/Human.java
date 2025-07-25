package OOPS.Packages.StaticExample;

public class Human {
    int age;
    String name;
    int salary ;
    boolean married ;
    static long populataion;


    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.populataion +=1;
    }
}
