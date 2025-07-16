package RecursionStringQuestion;

public class skipACharacter {
    public static void main(String[] args) {
        String name = "kanhaiya";
        String ans = "";
        remove(name , ans,0 , 'a');
        skip("" , name , 'a');
        System.out.println(removeThing(name));

    }
    public static void remove(String original , String ans , int start , char target ){
        if(start == original.length()){
            System.out.println(ans);
            return ;
        }
        if(original.charAt(start) != target){   
            ans += original.charAt(start);
        }
        remove(original , ans, start + 1 , target);
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

    // third approach - without passing anything
    public static String removeThing(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return removeThing(str.substring(1));
        }
        else{
            return ch + removeThing(str.substring(1));

        }
    }

}
