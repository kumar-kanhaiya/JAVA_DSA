package BasicMath;

public class findingNonRepeatingTerm {
    // in this question we want to find the non-repeating term in the array
    public static void main(String[] args) {
        int[] array = {2,3,4,4,2,3,6};
        System.out.println(nonRepeacting2ndMethod(array));

    }
    // Normal approch
    public static int nonRepeating(int[] array ){
        for (int i = 0; i < array.length ; i++) {
            int count = 0 ;
            for (int j = 0; j < array.length ; j++) {
                if(i == j){
                    continue;
                }
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count>0){
                continue;
            }
            else{
                return array[i];
            }
        }
        return -1;
    }

    // now that's the real approach : -
    public static int nonRepeacting2ndMethod(int[] array ){
        int unique = 0 ;
        for(int element : array){
            unique ^= element;
        }
        return unique;
    }
}
