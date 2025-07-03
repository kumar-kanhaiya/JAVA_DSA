package PatternPrinting;

public class Pattern {
    public static void main(String[] args) {
        pattern_5(5);
    }
// first pattern 
    public static void pattern_1(int number ){
//    *****
//    *****
//    *****
//    *****
//    *****
        for (int row = 0; row <= number ; row++) {
            System.out.println("****");
        }
    }
    public static void pattern_2(int number ){
//    *
//    **
//    ***
//    ****
//    *****
        for (int row = 0; row <= number ; row++) {
            for (int columns = 1; columns <= row ; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_3(int number ){
//    *****
//    ****
//    ***
//    **
//    *
        for (int row = number; row >=0 ; row--) {
            for (int columns = 0; columns <= row ; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_4(int number ){

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        for (int rows = 1; rows <= number ; rows++) {
            for (int columns = 1; columns <= rows ; columns++) {
                System.out.printf(" %d " , columns);
            }
            System.out.println();
        }
    }

    public static void pattern_5(int number ){
//
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
        for (int i = 1; i <= number ; i++) {
            for (int k = 1; k <= i ; k++) {
            System.out.print("*");
            }
            System.out.println();
            if(i == number){
                for (int j = i -1 ; j >0 ; j--) {
                    for (int k = j; k > 0 ; k--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

        // 2nd approach
        for (int row = 0; row < 2*number ; row++) {
            int col = row>number ? 2*number -row : row;
            for (int columns  = 0; columns  < col; columns ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_6(int number ) {
//         *
//        **
//       ***
//      ****
//     *****


    }

}
