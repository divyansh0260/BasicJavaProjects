/*
Objective:      Solving most of the questions using Recursion only.
Skills Learned: Kuch kuch hota h!
Author:         Divyansh:)
*/

import java.util.*;
public class Recursion{
    public static void main(String[] args){
        Recursion obj=new Recursion();
        Scanner sc=new Scanner(System.in);

        //The Catalogue of programs to choose from
        System.out.println("These are the following programs: ");
        System.out.println("1. Printing a multiplication table.");
        System.out.print("Enter Your Choice: ");
        int choice=sc.nextInt();

        //Calling the methods
        switch(choice){
            case 1 ->{
                System.out.print("Enter N: ");
                int n=sc.nextInt();
                obj.printTable(n,1);
            }
            default ->{System.err.println(choice+" is not even in the options mate!");}
        }

    }

    void printTable(int n, int i){
        System.out.printf("%2d x %2d = %2d%n", n, i, n*i);
        if(i<10){printTable(n,i+1);}
    }
}