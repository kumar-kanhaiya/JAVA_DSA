package RecursionPatternQuestions;

public class Triangle {
    public static void main(String[] args) {
        trianglePattern2(5,0);

    }
    // normal approach
    public static void trianglePattern(int number ){
        if(number == 0){
            return;
        }
        for (int i = 0; i < number ; i++) {
            System.out.print(" * ");
        }
        System.out.println(" ");
        trianglePattern(number -1 );

    }

    // second approach
    public static void trianglePattern2(int row , int collum  ){
        if(row == 0){
            return;
        }
        if(row > collum){
            System.out.print(" * ");
            trianglePattern2(row , collum + 1);
        }
        else {

            System.out.println(" ");
            trianglePattern2(row-1,0);
        }
    }
}
