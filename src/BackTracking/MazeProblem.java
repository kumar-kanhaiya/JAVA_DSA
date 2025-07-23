package BackTracking;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);

    }
    static int count(int r , int c){
        if(r == 1 || c==1){
            return 1;
        }
       return count(r,c-1) + count(r-1,c);

    }
    static void path(String p , int r , int c ){
        if(r==1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p + 'D' ,r-1 , c);

        }
        if(c>1) {
            path(p + 'R', r , c-1);
        }
    }

    // adding in array list

}
