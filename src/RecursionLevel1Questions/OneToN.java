package RecursionLevel1Questions;

public class OneToN {
    public static void main(String[] args) {

    }
    // this function is used to print number from 1 to N
    public static int Printing(int number ){
        int n = 1;
        if(n == number){
            return number;
        }
        System.out.print(n + " ");
        n++;
        return Printing(number -1 );
    }
}
