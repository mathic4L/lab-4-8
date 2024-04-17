import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.Timer;

public class Client {

    public static String[] loginAndPassword() {
        String[] loginPassword = {"", ""};
        Scanner scanner = new Scanner(System.in);

        System.out.println("ведите логин");
        loginPassword[0] = scanner.next();
        System.out.println("ведите пароль");
        loginPassword[1] = scanner.next();
        return loginPassword;
    }

    public static void command() {

    }

    public static void main(String[] args) {
        while (true) {
            try (Socket socket = new Socket("127.0.0.1", 8000);
                 BufferedReader bufferedReader = new BufferedReader(
                         new InputStreamReader(socket.getInputStream()));
                 BufferedWriter bufferedWriter = new BufferedWriter(
                         new OutputStreamWriter(socket.getOutputStream())
                 )
            ) {

                Scanner scanner = new Scanner(System.in);
                String request = scanner.next();

                bufferedWriter.write(request);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                while (true) {
                    if (bufferedReader.ready()) {
                        System.out.println(bufferedReader.readLine());
                        break;
                    }
                }


            } catch (IOException e) {
                System.out.println("sth went wrong");
            }
        }
    }
}
