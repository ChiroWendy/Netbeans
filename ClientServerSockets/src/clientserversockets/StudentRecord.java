/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserversockets;

import java.io.Serializable;

public abstract class StudentRecord implements Serializable
{
    //instance variables
    protected String student_name; 
    protected String student_surname;
    protected String student_number;
    protected float final_mark;
    protected String grade_comment;

    public StudentRecord() {
    }//end of null argument consatructor

    
    public StudentRecord(String student_name, String student_surname, String student_number) {
        this.student_name = student_name;
        this.student_surname = student_surname;
        this.student_number = student_number;
    }//end of three  argument constructor 


    //getters
    public String getStudent_name() {
        return student_name;
    }

    public String getStudent_surname() {
        return student_surname;
    }

    public String getStudent_number() {
        return student_number;
    }

    public float getFinal_mark() {
        return final_mark;
    }

    public String getGrade_comment() {
        return grade_comment;
    }

    
    //setters
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setStudent_surname(String student_surname) {
        this.student_surname = student_surname;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
   
    
    public abstract void calculateFinalMark(); // this method willcalculate the final mark 


    @Override
    public String toString() 
    {
        return  String.format("student_name:\t%s\nstudent_surname\t%s\nstudent_number\t%s\nfinal_mark\t%s\ngrade_comment\t%s\n", student_name, student_surname, student_number, final_mark, grade_comment );
    }//end of formating the StudentRecord object    
}//end of StudentRecord classs
