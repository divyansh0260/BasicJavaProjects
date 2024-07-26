/*
Objective:      Solving most of the questions using Recursion only.
Skills Learned: Faking consistency on github by editing and pushing the same code again and again!
Author:         Divyansh:)
*/

import java.util.*;
public class Recursion{
    
    public static void main(String[] args){
        Recursion obj=new Recursion();
        

        //The Catalogue of programs to choose from
        System.out.println("These are the following programs: ");
        System.out.println("1. Printing a multiplication table.");
        System.out.println("2. Printing Factorial of a number.");
        System.out.print("Enter Your Choice: ");
        int choice=new Scanner(System.in).nextInt();

        //Calling the methods
        switch(choice){
            case 1 ->{
                int n=obj.takeInput();
                obj.printTable(n,1);
            }
            case 2 ->{
                int n=obj.takeInput();
                if(n>39){
                    System.err.println("Integer too big!!");
                    System.exit(0);
                }
                System.out.printf("The factorial of %d is: ", n, obj.fact(n));
            }
            default ->{System.err.println(choice+" is not even in the options mate!");}
        }

    }
    
    int takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        return n;
    }
    
    long fact(long n) {
        if (n == 0){return 1;}
        else{return n * fact(n - 1);}
}
    
    void printTable(int n, int i){
        if(i>=1){printTable(n,i-1);}
        System.out.printf("%2d x %2d = %2d%n", n, i, n*i);
    }
    
}
