/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


/**
 *
 * @author Я
 */
public class Contacts extends Student  {
    private String studentNumber;
 
    
    public Contacts(int studentId, String studentName, String studentLastName, String number ) {
        super(studentId, studentName, studentLastName);
        this.studentNumber = number;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return super.toString() +"Sudent number =  "+ studentNumber;
    }

   

  
    
    
}
