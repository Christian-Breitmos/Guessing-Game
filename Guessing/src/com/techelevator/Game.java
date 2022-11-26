package com.techelevator;

import java.util.Scanner;

public class Game extends Main {

      public void run(){
        // write your code here
        System.out.println("Hello, let's play a game! Try not to get your feelings hurt. :)"); //Greeting the player.
        Scanner userInput = new Scanner(System.in);//setting a method that will let player put an input.
        String input;//empty input string so it can be typed in
        int max = 0;
        int min = 1000;
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);

        System.out.println("Please guess a number between 0 and 1000: ");//telling player to select the min and max
        while(true){
//            System.out.println(randomInt);
            input = userInput.nextLine();//user being able to put their input in the program
            int guess = Integer.parseInt(input);
            if (guess > randomInt && guess <= 1000) {
                System.out.println("Too high Dummy!");
            } else if (guess < randomInt && guess >= 0) {
                System.out.println("Too low Dummy!");
            } else if (guess > 1000) {
                System.out.println("I SAID BETWEEN 0 AND 1000!! DUMMY!!");
            } else if (guess < 0) {
                System.out.println("I SAID BETWEEN 0 AND 1000!! DUMMY!");
            } else {
                System.out.println("Good job you guessed the number correctly, but you are still a dummy.");
                break;
            }
            System.out.println("TRY AGAIN DUMMY!");


        }


    }
}
