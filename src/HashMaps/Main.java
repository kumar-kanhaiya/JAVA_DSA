package HashMaps;

//import org.w3c.dom.Entity;

//import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

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
        p is a large prime number ;

         */

        HashMap<String,Integer> map = new HashMap();

        map.put("kanhaiya",95);
        map.put("sachin",85);
        map.put("satyam",89);


        System.out.println(map.get("kanhaiya"));

        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(25);
        set.add(36);
        set.add(12);
        set.add(75);
        set.add(69);
        set.add(12);
        System.out.println(set);

        TreeMap<String,Integer> mapp = new TreeMap<>();
        map.put("kanhaiya",89);
        map.put("shubham",75);
        map.put("rajan" , 98);
        System.out.println(mapp);
    }
    class mapUsingHash{
        private Entity[] entities;
        public mapUsingHash(){
            entities = new Entity[100];
        }

        public void put(String key , String value){
            int hash = Math.abs(key.hashCode() % entities.length);
            entities[hash] = new Entity(key ,value); // overriding

        }

        public String get(String key ){
            int hash = Math.abs(key.hashCode()% entities.length);
            if(entities[hash] != null && entities[hash].key.equals(key) ){
                return entities[hash].value;
            }
            return null;
        }

        private class Entity{
            String key ;
            String value;

            public Entity(String key , String value){
                this.key = key;
                this.value = value;
            }

        }

    }

}
