package io.codeforall.bootcamp;

public class Playground {
    public static void main(String[] args) {
        String word = "smart";

        String result = word.startsWith("not") ? word : "not " + word;
        System.out.println(result);
        }
}
