package RecursionSubset;

public class Permutation {
    public static void main(String[] args) {
        permutation("","abc");

    }
    public static void permutation(String p , String up){
        // base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        int size = p.length() + 1;
        for (int i = 0; i < size; i++) {
            permutation(p+ch,up.substring(1));
            permutation(ch+p,up.substring(1));
        }
    }
}
