/*
    Objective:  CodeChef's Java Projects for Beginners[1].
    Dated:      11th April, 2025
*/

import java.util.*;

public class NumberGuessingGame{

    int input(){
            System.out.print("Enter your guess: ");
            int input=new Scanner(System.in).nextInt();
            return input;
    }

    int randomGen(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the minimum range: ");
        int min=sc.nextInt();
        System.out.print("Enter the maximum range: ");
        int max=sc.nextInt();
        return (int)(Math.floor(Math.random() * (max - min + 1) + min));
    }

    boolean isGuessCorrect(int input, int ran){
        if(input==ran){
            System.out.println("Congrats! You have guessed the number.....");
            return true;
        }
        else if(Math.abs(input-ran)>10){
            System.out.println("Verrryy Faaar, Try Again!");
            return false;
        }
        else if(Math.abs(input-ran)>5){
            System.out.println("Thoda sa Close, Try Again!");
            return false;
        }
        else{
            System.out.println("Very Closeee, Try Again!");
            return false;
        }

    }


    public static void main(String []args){
        
        System.out.println("\n\n\nGreetings to the Number Guessing Game!!!\n\nEnter the range in which you want me to guess: ");
        NumberGuessingGame obj=new NumberGuessingGame();
        int rand=obj.randomGen();

        System.out.println("I have guessed a number..Can you guess it too??\nLet's Play!\n\n");

 
        
        int input=0;
        do{
            input=obj.input();
        }
        while(!(obj.isGuessCorrect(input, rand)));

        

    }
}
