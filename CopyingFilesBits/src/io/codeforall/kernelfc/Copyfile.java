package io.codeforall.kernelfc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class Copyfile {
    private FileInputStream inputStream;

    private FileOutputStream outputStream;

    private byte[] buffer = new byte[1024];
    private int byteCounter;


    public Copyfile() throws IOException {
        inputStream = new FileInputStream("src/io/codeforall/kernelfc/teste.txt");
        outputStream = new FileOutputStream("src/io/codeforall/kernelfc/copyteste.txt");
        copy(inputStream, outputStream);
    }

    public void copy(FileInputStream inputStream, FileOutputStream outputStream) throws IOException {
        while ((byteCounter = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, byteCounter);
        }
        inputStream.close();
        outputStream.close();
    }

}
