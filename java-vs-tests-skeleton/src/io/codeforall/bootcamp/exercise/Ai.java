package io.codeforall.bootcamp.exercise;

public class Ai {

    //Attributes
    private String creationDate;
    private String name;

    //Personalized Constructor
    public Ai(String creationDate, String name) {
        this.creationDate = creationDate;
        this.name = name;
    }

    //Getter & Setters
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //doubleArray
    public int[] doubleArray(int[] array) {
        int[] doubledArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            doubledArray[i] = array[i] * 2;
        }
        return doubledArray;
    }

    //Factorial Iterative
    public int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //Factorial recursive
    public int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialIterative(n - 1);
    }

    //Palindrome
    public String palindromeCheck(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[0] = "";
        }
        return String.join(" ", words);
    }

    //Check if is Palindrome
    private boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    //email Validator
    public String emailValidator() {

        return "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    }
}

