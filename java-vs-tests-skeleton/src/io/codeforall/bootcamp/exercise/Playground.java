package io.codeforall.bootcamp.exercise;

public class Playground {
    public static void main(String[] args) {

        //AI object
        Ai ai = new Ai("2025.02.09", "Marcelo");

        //Properties
        System.out.println("AI name " + ai.getName());
        System.out.println("Creation Date " + ai.getCreationDate());

        //Array test
        int[] numbers = {1, 2, 3, 4, 5};
        int[] doubleNumbers = ai.doubleArray(numbers);
        System.out.println("Doubled Array: ");
        for (int num : doubleNumbers) {
            System.out.println(num + " ");
        }
        System.out.println();

        //Iterative Method
        int factorialIterativeResult = ai.factorialIterative(5);
        System.out.println("Factorial (Iterative) of 5: " + factorialIterativeResult);

        //Recursive Method
        int factorialRecursiveResult = ai.factorialRecursive(5);
        System.out.println("Factorial (Recursive) of 5: " + factorialRecursiveResult);

        //Palindrome
        String text = "Anotaram a data da maratona";
        String replacedText = ai.palindromeCheck(text);
        System.out.println("Text after replacing palindromes: " + replacedText);

        //email verification
        String emailRegex = ai.emailValidator();
        System.out.println("Email Regex: " + emailRegex);


    }
}



