package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n,x,i,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");              //Inputting the no of elements e.g., 5
        n = sc.nextInt();
        int arr[] = new int[n];                                    //Declaring an array of size n
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();                                //Inputting elements e.g., 3 7 4 9 8
        }
        System.out.println("Enter the element you want to find: ");
        x=sc.nextInt();                                           //Desired element to search e.g., 7
        for(i=0;i<n;i++){
            if(arr[i]==x){                                        //Item matching desired element position
                flag = 1;                                         //Condition met
                break;
            }
            else{
                flag = 0;                                        //Condition not met
            }
        }
        if(flag==1){
            System.out.println("Element found at " +(i+1)+ "th position");
        }
        else{
            System.out.println("Element not found ");
        }
    }
}
