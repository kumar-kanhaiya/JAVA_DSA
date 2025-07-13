package RecursionPatternQuestions;

public class Triangle {
    public static void main(String[] args) {
        trianglePattern(5);

    }
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
}
