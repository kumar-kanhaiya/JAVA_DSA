package StringAndStringBuilder;

public class comparison {
    public static void main(String[] args) {
        String a = "kanhaiya";
        String b = "kanhaiya";
         // ==
        System.out.println(a==b); // return true ;
        // creating string object ;
        String name1 = new String("kanhaiya");
        String name2 = new String("kanhaiya");
        System.out.println(name1 == name2); // return false ;
        // when you only need to check value used .equals method
        System.out.println(name1.equals(name2)); // this is method or function
        System.out.println(b.length());
    }

}
