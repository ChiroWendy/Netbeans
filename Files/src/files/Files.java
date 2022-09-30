/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author charm
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create file using java
        String name, surname, studentNumber ,courseName;
        Scanner scan = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("Enter your name");
        name = scan.next();
        System.out.println("Enter your surname");
        surname = scan.next();
        System.out.println("Enter your student number");
        studentNumber = scan.next();
        System.out.println("Enter your course name");
         courseName = scan.next();
        System.out.println("****************************");
        
        createFile();
        WriteToFile(name, surname, studentNumber,courseName);
      

    }

    private static void createFile() {
        try{
            // option 1 to write to file
        File myFile = new File("filename.txt");
        //option 2 to wrte to file
       // File myFile2 = new File("C:\\Users\\charm\\Documents\\FinalYear\\ITJA3-B44\\ReadAndWriteFile.txt");
        
         if(myFile.createNewFile()){
             System.out.println("File created : " + myFile.getName());
         }
     
         
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        
    }

    private static void WriteToFile(String name, String surname, String studentNumber, String courseName) {
        try{
            FileWriter filewriter = new FileWriter("C:\\Users\\charm\\Documents\\FinalYear\\ITJA3-B44\\ReadAndWriteFile.txt");
            filewriter.write(name);
            filewriter.write(surname);
            filewriter.write(studentNumber);
            filewriter.write(courseName);
            
            filewriter.close();
            System.out.println("Successfully writtern to file");
              ReadFile(filewriter);
        }catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
        
        
    }

    private static void ReadFile(FileWriter filewriter) {
        try{
            File obj = new File("C:\\Users\\charm\\Documents\\FinalYear\\ITJA3-B44\\BBRFTL251-ITJA3-B44-ASSESSMENT-WENDY-CHIRO\\ReadFile.txt");
           Scanner read = new Scanner(obj);
            while(read.hasNext()){
                String data = read.nextLine();
                System.out.println("");
                System.out.println(data);
            }
           read.close();
            
        }catch(FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        
    }
}
   