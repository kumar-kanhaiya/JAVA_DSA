package OOPS.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4);
        Box box2 = new Box(box1);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        System.out.println(box2.l  + " " + box2.w + " " + box2.h);
        BoxWeight box3 = new BoxWeight(4,5,6,8);
        System.out.println(box3.l + " " + box3.w + " " + box3.h + " "  + box3.weight);

        // every class has Object class as a superClass .
        // there are many variable in both parent and child class
        // you are given access to variable that are in the ref type i.e BoxWeight
        // hence, you should have access to weight variable
        // this also mean , that the onces you are trying to access should be inisialised
        // but here , when the object itself is of type parent class , how will you call the child class


    }
}
