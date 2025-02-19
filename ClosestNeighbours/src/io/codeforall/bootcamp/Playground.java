package io.codeforall.bootcamp;

public class Playground {
    public static void main (String[] args){
        int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};

        int minDifference = Math.abs(numbers[0] - numbers[1]);
        int index = 0;

        for(int i = 0; i < numbers.length - 1; i++){
            if(Math.abs(numbers [i] - numbers [i + 1]) < minDifference){
                index = i;
            }
        }
    System.out.println("The closest Neighbours are: " + numbers[index] + " " + numbers[index + 1]);
    }
}
