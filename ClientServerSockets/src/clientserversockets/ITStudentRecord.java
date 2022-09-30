/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserversockets;

public class ITStudentRecord extends StudentRecord
{
    //instance variables
    protected int test1;
    protected int test2;
    protected int test3;
    protected String qualification = "Information Technology";

    public ITStudentRecord() {
    }//end of null argument constructor

    public ITStudentRecord(int test1, int test2, int test3, String student_name, String student_surname, String student_number) {
        super(student_name, student_surname, student_number);
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }//end of six argument constructor

    //accessors
    public int getTest1() {
        return test1;
    }

    public int getTest2() {
        return test2;
    }

    public int getTest3() {
        return test3;
    }

    public String getQualification() {
        return qualification;
    }

    
    
    //mutators 
    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public void setTest3(int test3) {
        this.test3 = test3;
    }
    

    public void grade()//establishing the student grade
    {
        if (final_mark >=80)
        {
            if (test3<40)
            {
                grade_comment = "fail with subminimum";
            }
            else
            {
                grade_comment = "pass with distinction";
            }
        }
        
        else if (final_mark >=50)
        {
            if (test3<40)
            {
                grade_comment = "fail with subminimum";
            }
            else
            {
                grade_comment = "pass";
            }
        }
        
        else if (final_mark >=45)
        {
            grade_comment = "qualify for a Supplementary assessment,";
        }    
        
        else
        {
            grade_comment = "fail";
        }
    }//end of method for establishing the grade

    
    @Override
    public void calculateFinalMark() // this method will calculate the final mark 
    {
        final_mark = (test1*20 + test2*30 +test3*50)/100;
    }

    @Override
    public String toString() 
    {
        return  String.format(super.toString() + "qualification\t%s\n", qualification );
    }//end of formating the StudentRecord object  
    
    
}//end of ITStudentRecord  class
