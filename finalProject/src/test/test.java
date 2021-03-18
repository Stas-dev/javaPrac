/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import main.Student;
import main.Contacts;
import main.Order;
import main.GUI;

/**
 *
 * @author Я
 */
public class test {
     public static void main(String[] args) {
        Student student = new Student(1, "Stas","Utkin" );
         System.out.println(student);
         Contacts contact = new Contacts(student.getStudentId(), student.getStudentName(), student.getStudentLastName(), "123");
         System.out.println(contact);
         GUI g = new GUI();
         g.setVisible(true);
          
         Order firstOrder = new Order(student.getStudentId(), student.getStudentName(), student.getStudentLastName(),"06777293969",432 );
         firstOrder.serialize();
         System.out.println(firstOrder);
    }
}
  