package RecursionLevel1Questions;

public class Merging {
    public static void main(String[] args) {
    merge(5);
    }
    public static void merge(int number ){
        if(number == 0 ){
            return;
        }
        System.out.println(number);
        merge(number-1);
        System.out.println(number);
    }
}
