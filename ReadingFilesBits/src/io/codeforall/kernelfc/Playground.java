package io.codeforall.kernelfc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Playground {
    public static void main(String[] args) throws IOException {

        WordReader wordReader = new WordReader();

        for (String word : wordReader) {
            System.out.println(word);
        }

        Iterator<String> iterator = wordReader.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}