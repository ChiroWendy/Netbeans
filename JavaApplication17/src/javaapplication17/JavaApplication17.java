/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author charm
 */
public class JavaApplication17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 3;
        
        int arr[] = new int[n];
        
        System.out.println("Enter elements");
        for(int i = 0; i < n; i++){
// reading the array the way the user has entered the numbers 
             arr[i] = scan.nextInt();
        }
        
        System.out.print("Your unsorted  Array Is: ");
            for (int i = 0; i < arr.length; i++){
                  System.out.print(arr[i] + ",");

}
                System.out.println("\n"); 
                
                int[] input = arr;
                insertionSort(input);
    }

    private static void printNumbers(int[] input) {

    for (int i = 0; i < input.length; i++) {
        System.out.print(input[i] + ", ");
    }
    System.out.println("\n");
}

public static void insertionSort(int array[]) {
    int n = array.length;
    for (int j = 1; j < n; j++) {
        int key = array[j];
        int i = j-1;
        while ( (i > -1) && ( array [i] > key ) ) {
            array [i+1] = array [i];
            i--;
        }
        array[i+1] = key;
        printNumbers(array);
    }

    
}
    
}
