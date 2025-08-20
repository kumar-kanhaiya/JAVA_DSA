package StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class RandomString {
    public static void main(String[] args) {
        System.out.println(generate(5));
        String sentence = "Hi h   hjh  hjkso  siowi     w ";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        // split

        String arr = "Kunal,Apoorv,Rahul,Snehal";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));

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
