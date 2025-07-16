package RecursionStringQuestion;

public class skipACharacter {
    public static void main(String[] args) {
        String name = "kanhaiya";
        String ans = "";
        System.out.println(remove(name , ans,0 , 'a'));
        skip("" , name , 'a');

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
    public static void skip(String p , String up , char target ){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == target){
            skip(p,up.substring(1) , target);
        }
        else{
            skip(p+ch , up.substring(1) ,target);
        }
    }

}
