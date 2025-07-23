package BackTracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(path2("",3,3));
        pathDiagonal("",3,3);
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
    public static ArrayList<String> path2(String p , int r , int c){
        if(r==1 && c==1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(path2(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(path2(p + 'R', r, c-1));
        }
        return ans;
    }

    // adding diagonal element
    // in this there are total 3 recursive call
    // lets denote diagonal with p

    public static void pathDiagonal(String p , int r , int c ){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathDiagonal(p+'D',r-1,c);
        }
        if(r>1&& c>1){
            pathDiagonal(p+'P',r-1,c-1);
        }
        if(c>1){
            pathDiagonal(p+'R',r,c-1);
        }
    }

    static void pathWithObesticles(String p,boolean[][] maze , int r , int c ){
        if(r==1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathWithObesticles(p + 'D' ,maze,r-1 , c);

        }
        if(c>1) {
            pathWithObesticles(p + 'R', maze,r , c-1);
        }
    }
}
