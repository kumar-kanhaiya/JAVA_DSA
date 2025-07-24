package OOPS.Introduction;

public class Main {
    public static void main(String[] args) {
       Student student1 = new Student("Kanhaiya",96,5);
        System.out.println(student1);

        // class is logical construct
        // object is physical reality / occupies space and memory

        // .operator is used to get the value of argument
        // A constructor define what happen when an object create .
    }
}
class Student {
    String name;
    float marks;
    int rollNo;

    public Student( String name,float marks, int rollNo) {
        this.marks = marks;
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", rollNo=" + rollNo +
                '}';
    }
}
