package StringBuffer;

public class Main {
    public static void main(String[] args) {
        // Constructor -1
        StringBuffer sb = new StringBuffer();
        sb.append("Kanhaiya Kumar Singh ");
        String str = sb.toString();
        System.out.println(str);

//        Advantage over String
//        Mutable
//        Efficient
//        Thread Safe - its little slower
        // string builder is not thread safe

        // Constructor - 2
        StringBuffer s = new StringBuffer("kanhaiya kumar singh ");
        // Constructor - 3
        StringBuffer s3 = new StringBuffer(30);
        // also have some properties which is used by .method

    }
}
