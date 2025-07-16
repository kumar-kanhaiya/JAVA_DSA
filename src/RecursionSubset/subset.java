package RecursionSubset;

public class subset {
    public static void main(String[] args) {
    /*
    subset is non adjactance collections
    the pattern of taking some element or removing some element is known as subset pattern

     */
        allSubsets("" , "abc");
    }
    public static void allSubsets(String p , String up){
        if( up.isEmpty() ){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        allSubsets((p + ch),up.substring(1));
        allSubsets(p , up.substring(1));
    }
}
