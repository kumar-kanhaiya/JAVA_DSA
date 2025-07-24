package OOPS.Introduction;

public class Main {
    String name;
    int marks;
    int rollNo;

    public Main( String name,int marks, int rollNo) {
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

    public static void main(String[] args) {
        Main student1 = new Main("Kanhaiya",96,5);
        System.out.println(student1);
    }
}
