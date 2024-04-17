import jdk.nashorn.internal.parser.JSONParser;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8000)) {

            while (true) {
                try {
                    checkConsole();

                    Socket socket = serverSocket.accept();
                    BufferedReader bufferedReader = new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));
                    BufferedWriter bufferedWriter = new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream()));

                    connector();

                    String request = bufferedReader.readLine();
                    System.out.println("request is \"" + request + " \"");

                    String response;
                    try {
                        response = requestHandler(request);
                    } catch (Exception e) {
                        break;
                    }

                    bufferedWriter.write("kinda response");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    System.out.println("response sent");

                } catch (Exception e) {
                    System.out.println("sth went wrong");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static void checkConsole() throws IOException {
        if (System.in.available() > 0 && (new Scanner(System.in)).hasNextLine()) {
            System.exit(0);
        }
    }

    public static void connector() {
        System.out.println("connected. waiting for a line");
    }

    public static String requestHandler(String request) throws Exception {
        if (request.equals("end")) {
            throw new Exception();
        }
        String response = "test reponse";
        System.out.println("reponse \"" + response + "\" generated");
        return response;
    }

}
