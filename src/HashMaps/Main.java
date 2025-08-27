package HashMaps;

public class Main {
    public static void main(String[] args) {
        /*
        HashMap is the key value pairs
        HashCode :- it is the method of getting a number or integer
        2 ways to remove collision
        1. chainning
        2. open addresing

         */
        String name = "kanhaiya";
        int code = name.hashCode();
        System.out.println(code);
        Integer a = 254658;
        int c = a.hashCode();
        System.out.println(c);
        /*
        Hash functions:
        where n is no of keys
        m is the size of table also the prime number(not to close to
                                the power of 2 or 10);
        1. Division method :- h(k) = k % m ;
        2. Multiplication Method : h(k) = [(a * k ) % 2^m ] >> (w - r );
        where a is the random number
        w = number of bits in k
        m = 2^r;
        it is faster than first method
        a is not to close to 2^w-1 or 2^w ;

        3. Universal Hashing
        h(k) = [(ak + b) % p] % m ;
        where a and b are random number which are belongs to 0 to p-1;

         */


    }
}
