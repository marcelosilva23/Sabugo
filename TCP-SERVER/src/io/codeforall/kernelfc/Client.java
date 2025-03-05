package io.codeforall.kernelfc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverAddress = "127.0.0.1";
        int portNumber = 5051;

        try (Socket socket = new Socket(serverAddress, portNumber);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

             String line = "hello";
            while((line = in.readLine()) != null){
                System.out.println(line);
            }
            //String response = in.readLine();
            out.println("SÓ FUNCIONA UMA VEZ. TENTE MELHORAR, POR FAVOR.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
