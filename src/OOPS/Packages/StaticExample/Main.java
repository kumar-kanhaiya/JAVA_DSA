package OOPS.Packages.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human kanhaiya = new Human(20,"kanhaiya kumar ",50,false);
        Human rahul = new Human(34,"rahul",15000,true);
        System.out.println(kanhaiya.populataion);
        System.out.println(rahul.populataion);
        // static keyword retains its value after every function call ;
        // also use the function or method without creating an objects
        // inside the static method you cannot use any non-static method /.

    }
}
