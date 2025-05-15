package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "kanhaiya kumar";
        char toSearch = 'a';
        System.out.println(isContain2(name,'a'));

    }
    // by using for each loop
    static boolean isContain2(String name , char target ){
        // if length of name is 0 return false
        if(name.length() == 0){
            return false;
        }
        for(char ch : name.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        // else false;
        return false;
    }

    // write a method to isContain target char in String
    static boolean isContain(String name , char target ){
        // if length of name is 0 return false
        if(name.length() == 0){
            return false;
        }
        for(int i =0 ; i<name.length() ; i++){
            // set the char at index i in check variable
            char check = name.charAt(i);
            // check isContain or not by using if condition
            if(check == target){
                // if contains return true
                return true;
            }
        }
        // else false;
        return false;
    }
}
