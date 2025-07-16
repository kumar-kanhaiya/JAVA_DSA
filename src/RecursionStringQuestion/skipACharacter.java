package RecursionStringQuestion;

public class skipACharacter {
    public static void main(String[] args) {
        String name = "kanhaiya";
        String ans = " ";
        System.out.println(remove(name , ans,0 , 'a'));

    }
    public static String remove(String original , String ans , int start , char target ){
        if(start == original.length()){
            return ans;
        }
        if(original.charAt(start) != target){   
            ans += original.charAt(start);
        }
        return remove(original , ans, start + 1 , target);
    }

    // second approach
}
