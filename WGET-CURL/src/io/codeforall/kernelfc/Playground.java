package io.codeforall.kernelfc;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Playground {

    public static void main(String[] args) {

        BufferedInputStream reader = null;
        try {
            URL url = new URL("www.google.com");

            reader = new BufferedInputStream(url.openStream());

            int character = 0;
            while((character = reader.read()) != -1){
                System.out.print((char) character);
            }
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        }
    }
