import org.omg.CORBA.TIMEOUT;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void print(Object object) {
        System.out.println("obj");
    }

    public static void print(Integer integer) {
        System.out.println("int");
    }

    public static void main(String[] args) throws IOException {
//        File file = new File("test.txt");
//        file.delete();
//        file.createNewFile();
//
//
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
//        bufferedWriter.write("abcd");
//        bufferedWriter.flush();
//        bufferedWriter.close();
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        ArrayList<Character> characters = new ArrayList<>(10);
//        System.out.println(bufferedReader.readLine());
//
//        int temp;
//        while ((temp = bufferedReader.read()) != -1) {
//            System.out.println(temp);
//            characters.add((char) temp);
//        }
//
//        characters.forEach(System.out::println);
//
//        StringWriter stringWriter = new StringWriter();
//
//        int test = System.in.read();
//        System.out.println(test);

        while (true) {
            if(System.in.read() > 0) {
                break;
            }
            System.out.println("one more");
        }
        System.out.println("ended");
    }
}


