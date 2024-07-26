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
        System.out.println("2. Printing Asterisk Patterns.");
        System.out.print("Enter Your Choice: ");
        int choice=new Scanner(System.in).nextInt();

        //Calling the methods
        switch(choice){
            case 1 ->{
                int n=obj.takeInput("Enter the number: ");
                int i=obj.takeInput("Table upto?: ");
                obj.printTable(n,i);
            }
            case 2 ->{
                int n=obj.takeInput("No. of rows: ");
                obj.printPatternAsc(n);
                System.out.println();
                obj.printPatternDsc(n);
            }
            default ->{System.err.println(choice+" is not even in the options mate!");}
        }

    }


    //String parameter to Print what user specifically wants rather than adding a generic Input Statement
    int takeInput(String st){
        Scanner sc=new Scanner(System.in);
        System.out.print(st);
        int n=sc.nextInt();
        return n;
    }
    
    //multiplication Table
    void printTable(int n, int i){
        if(i>1){printTable(n,i-1);}
        System.out.printf("%2d x %2d = %2d%n", n, i, n*i);
    }

    //Printing patterns
    void printPatternAsc(int i){
        if(i>=1){printPatternAsc(i-1);}
        for(int j=0;j<i;j++){System.out.print("* ");}
        System.out.println();
    }
    void printPatternDsc(int i){
        for(int j=0;j<i;j++){System.out.print("* ");}
        System.out.println();
        if(i>=1){printPatternDsc(i-1);}
    }
    
}
