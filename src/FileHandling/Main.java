package FileHandling;

import java.io.*;
//import java.io.InputStream;


public class Main {
    public static void main(String[] args) {

       try(InputStreamReader isr = new InputStreamReader(System.in)){
           System.out.println("Enter some letters : ");
           int letters =  isr.read();
           while(isr.ready()){
               System.out.println((char) letters);
               letters = isr.read();
           }
//           isr.close(); - no need to close try catch automatically close it
           System.out.println();
       }
       catch(IOException e){
           System.out.println(e.getMessage());

        }

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
        // Output
        OutputStream os = System.out;
//        os.write(😒);

        System.out.println();

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello world ");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
            osw.write("😒");


        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
