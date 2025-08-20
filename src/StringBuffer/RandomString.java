package StringBuffer;

public class RandomString {
    public static void main(String[] args) {
        System.out.println(generate(5));

    }

    static String generate(int size ){
        StringBuffer str = new StringBuffer();
        while(size>0) {


            int randomNumber = (int) (Math.random() * 25) + 1;

            str.append((char)('a' + randomNumber));
            size--;

        }
        return str.toString();
    }

}
