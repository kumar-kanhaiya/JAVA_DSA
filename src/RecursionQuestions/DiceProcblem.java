package RecursionQuestions;

public class DiceProcblem {
    public static void main(String[] args) {
    dice("",4);
    }
    public static void dice(String p , int target ){
        if(target == 0){
            System.out.println(p);
            return;
        }
//        int digit = p.charAt(0) + '0';
        for (int i = 1; i <=6 && i<= target; i++) {
            dice(p+i,target-i);
        }
    }
}
