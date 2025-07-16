package RecursionStringQuestion;

public class skipACharacter {
    public static void main(String[] args) {
        String name = "kanhaiya";
        String ans = " ";
        remove(name , ans,0 , 'a');
        System.out.println(ans);

    }
    public static void remove(String original , String ans , int start , char target ){
        if(start == original.length()){
            return;
        }
        if(original.charAt(start) != target){
            ans += original.charAt(start);
        }
        remove(original , ans, start + 1 , target);
    }
}
