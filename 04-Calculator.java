/*
    Objective:  CodeChef's Java Projects for Beginners[2].
    Dated:      11th April, 2025
*/

import java.util.*;
public class Calculator{

    //Greets the user and shows the Menu
    int greet(){
        System.out.println("\n\n\nWelcome to Calculator!\n\nChoose one operation");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. EXIT");
        int input=takeInput("\nEnter your selection: ");
        return input;
    }


    void initial(){

        int input=greet();
        if((input!=1)&&(input!=2)&&(input!=3)&&(input!=4)) finalOutput();
        else{
            System.out.println("Enter the numbers to be operated upon!");
            int n1=takeInput("Enter the First number: ");
            int n2=takeInput("Enter the Second number: ");
            int ans=0;

            switch(input){
                case 1: ans=n1+n2; break;
                case 2: ans=n1-n2; break;
                case 3: ans=n1*n2; break;
                default: ans=n1/n2;
            }
            System.out.println("\nYour answer is: "+ans);
        }
        initial();
    }


    int takeInput(String st){
        Scanner sc=new Scanner(System.in);
        System.out.print(st);
        int a=sc.nextInt();
        return a;
    }


    void finalOutput(){
        System.out.println("Exiting the calculator!");
        System.exit(0);
    }
    public static void main(String args[]){
        Calculator obj=new Calculator();
        obj.initial();
    }
}
