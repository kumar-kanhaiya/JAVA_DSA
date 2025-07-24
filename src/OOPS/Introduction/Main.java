package OOPS.Introduction;

public class Main {
    public static void main(String[] args) {
       Student student1 = new Student("Kanhaiya",96,5);
        System.out.println(student1);
    }
}
class Student {
    String name;
    int marks;
    int rollNo;

    public Student( String name,int marks, int rollNo) {
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
