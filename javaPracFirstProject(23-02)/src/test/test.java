
package test;
import  main.Contacts;
import main.Order;
import main.Student;
public class test {


    public static void main(String[] args) {
      Contacts contacts = new Contacts(1, "Stanislaw  "," Utkin "," Poltava");
        System.out.println(contacts);
        
        Order order = new Order(1, " Pizza", " Alfred", " ");
        System.out.println(order);
        Student stufent = new Student(1, "Stanislaw ", " Utkin ", "Programist s polykeka ");
        System.out.println(stufent);
    }
    
}