package RecursionStringQuestion;

public class stringSkip {
    public static void main(String[] args) {
    String name = "kanhaiyaapplekumarapple";
        System.out.println(removeString(name));
    }
    public static String removeString(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return removeString(str.substring(5));
        }
        else{
            return str.charAt(0) + removeString(str.substring(1));
        }
    }
}
