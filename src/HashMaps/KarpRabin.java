package HashMaps;

public class KarpRabin {
    private final int prime  = 101;

    private long calculateHash(String str){
        long hash = 0;

        for(int i = 0 ; i< str.length() ; i++){
            hash = hash + str.charAt(i) * Math.pow(prime , i);
        }
        return hash;
    }

    private long updateHash(long prevHash, char oldChar , char newChar , int patternLength){


    }
}
