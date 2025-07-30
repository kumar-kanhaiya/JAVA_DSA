package OOPS.generics.compairing;

public class lambdaFunction {
    public static void main(String[] args) {
    operation sum = (a,b) -> a+b;
    }
    int sum(int a , int b ){
        return a+b;
    }

    interface operation{
        int sum(int a , int b);
    }
}
