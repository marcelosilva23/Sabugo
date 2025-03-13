package io.codeforall.kernelfc;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


    public class Server {

        public static void main(String[] args) throws FileNotFoundException {
            int portNumber = 8081;


            try (ServerSocket serverSocket = new ServerSocket(portNumber)) {

                while (true) {
                    try (Socket clientSocket = serverSocket.accept();
                         BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                         FileReader reader = new FileReader("www/index.html");
                         BufferedReader indexBuf = new BufferedReader(reader);

                         PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
                        PrintWriter indexOut = new PrintWriter(indexBuf.readLine());

                        String requestLine;
                        while ((requestLine = in.readLine()) != null && !requestLine.isEmpty()) {
                            System.out.println(requestLine);

                            String response = "HTTP/1.0 200 Document Follows\r\n" +
                                    "Content-Type: text/html; charset=UTF-8\r\n" +
                                    "Content-Length: <indexBuf> \r\n";
                            out.println(response);
                            out.println(indexOut);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*HTTP/1.0 200 Document Follows\r\n
           Content-Type: text/html; charset=UTF-8\r\n
           Content-Length: <file_byte_size> \r\n


        HTTP/1.0 200 Document Follows\r\n
        Content-Type: image/<image_file_extension> \r\n"
        Content-Length: <file_byte_size> \r\n


        HTTP/1.0 404 Not Found
        Content-Type: text/html; charset=UTF-8\r\n
        Content-Length: <file_byte_size> \r\n
*/