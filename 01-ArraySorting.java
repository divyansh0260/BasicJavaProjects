/*
Author:Divyansh:)
A program which checks if an array is sorted or not
An alternate logic could be using java.util.Arrays.sort() and then comparing a cloned array but mai khaali baitha tha so did it manually!
*/

import java.util.*;
public class Main{

    //takes and return the input
    int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            System.out.printf("Enter number[%d]: ",(i+1));
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    //sorts the array in ascending order and returns the counter
    int sortArrayAsc(int[] arr){
        int counter=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    counter++;
                }
            }
        }
        return counter;
    }

    
    public static void main(String args[]){
        Main obj=new Main();
        int arr[]=obj.takeInput();
        
        System.out.print("Given Array is: ");
        for(int el:arr){System.out.printf("%d, ",el);}
        System.out.println("\b ");
        //This might not work in some IDEs/Terminals.

        int counter=obj.sortArrayAsc(arr);        
        if(counter==0){
            System.out.println("Array is sorted and in ascending order!");
        }
        else if(counter==(((arr.length-1)*arr.length)/2)){
            System.out.println("Array is sorted and in descending order!");
        }
        else
        System.out.println("The array is not sorted!");
    }
}
