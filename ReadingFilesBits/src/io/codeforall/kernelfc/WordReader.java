package io.codeforall.kernelfc;

import java.io.*;
import java.nio.Buffer;
import java.util.Iterator;

public class WordReader implements Iterable<String> {
    private FileReader reader;
    private BufferedReader bReader;
    private FileWriter writer;
    private BufferedWriter bWriter;
    private char[] buffer;
    private String line;
    private int lineCounter;

    public WordReader() throws IOException {
        reader = new FileReader("src/io/codeforall/kernelfc/FILE_PATH");
        bReader = new BufferedReader(reader);
        buffer = new char[1024];
        writer = new FileWriter(line);
        bWriter = new BufferedWriter(writer);
        line = "";
    }

    public void read() throws IOException {
        while ((line = bReader.readLine()) != null) {
            lineCounter ++;
            bWriter.write(buffer,0,lineCounter);
        }
        bWriter.flush();
        bReader.close();
    }

    @Override
    public Iterator iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }
}

