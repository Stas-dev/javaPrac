/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Я
 */
public class Order extends Contacts implements Serializable{
    
    private int amount;
   
    
    public Order(int studentId, String studentName, String studentLastName, String number, int Amount) {
        super(studentId, studentName, studentLastName, number);
   
        this.amount = Amount;
    }

  

 
    public int getAmount() {
        return amount;
    }

    public void setAmount(int Amount) {
        this.amount = Amount;
    }

    @Override
    public String toString() {
        return super.toString()  + "Amount  - " + amount; 
    }
   
   public void  serialize(){
        ArrayList<Order> orderList = new ArrayList<>();
        Order order1  = new Order(0, "Stanislaw", "Utkin", "0677293969", 150);
        orderList.add(0, order1);
        Order order2 = new Order(1, "Vasya ", "Pupkin", "0432123451", 100);
        orderList.add(1, order2);
        Order order3 = new Order(2, "Ivan", "Ivanov", "1234567890", 250);
        orderList.add(2, order3);
        Order order4 = new Order (3, "John ", "Doe", "123098231", 400);
        orderList.add(3, order4);
        Order order5 = new Order(4, "Thor", "Odinson", "1230984576", 800);
        orderList.add(4, order5);
       
       
          try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("orders.dat")))
            {
                 oos.writeObject(orderList);
                
             } catch (FileNotFoundException ex) {
                 System.out.println(ex.getMessage());
                  //Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                  System.out.println(ex.getMessage());
                   // Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
             }
              
       
    
   
}
}
