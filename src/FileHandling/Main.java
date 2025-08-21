package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

//       try(InputStreamReader isr = new InputStreamReader(System.in)){
//           System.out.println("Enter some letters : ");
//           int letters =  isr.read();
//           while(isr.ready()){
//               System.out.println((char) letters);
//               letters = isr.read();
//           }
////           isr.close(); - no need to close try catch automatically close it
//           System.out.println();
//       }
//       catch(IOException e){
//           System.out.println(e.getMessage());
//
//        }

       try(FileReader fr = new FileReader("data.txt")){
           System.out.println("Enter some letters : ");
           int letters =  fr.read();
           while(fr.ready()){
               System.out.println((char) letters);
               letters = fr.read();
           }
//           isr.close(); - no need to close try catch automatically close it
           System.out.println();
       }
       catch(IOException e){
           System.out.println(e.getMessage());

        }


       //byte to char stream and then reading char stream
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed : "  + br.readLine());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
