package OOPS.generics.compairing;

public class Student implements Comparable<Student> {
    int rollNo ;
    float marks;
    public Student(int rollNo , float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }
//    @Override
//    public int compareTo(Student o){
//
//    }

    public static void main(String[] args) {
        Student kanhaiya = new Student(12,92.5f);
        Student rahul = new Student(11,94.6f);
        if(kanhaiya.compareTo(rahul) <0){
            System.out.println("not equal");
        }
    }

    @Override
    public int compareTo(Student o) {
        int difference = (int)(this.marks - o.marks);
        return difference;
    }
}
