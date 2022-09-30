/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author charm
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        int sum;
        Scanner scan = new Scanner(System.in);
        
        num1= scan.nextInt();
        num2 = scan.nextInt();
        
        sum = num1+num2;
        
      /*  if(sum < 0){
            System.out.println("Negative number = "+ sum);
        }else{
            System.out.println("Positive number = " +sum);
        }
        */
        while(sum>0){
            System.out.println("The sum = " +sum);
        }
        System.out.println("negative number" + sum);
    }
    
}
