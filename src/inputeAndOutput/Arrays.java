package inputeAndOutput;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {18,12,9,14,77,50};
        isExist(array,14);

    }
    public static void isExist(int[] array , int number ){
        boolean check = false;
        for(int element : array ){
            if(element == number){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Conatin");
        }
        else{
            System.out.println("not contain");
        }
    }
}
