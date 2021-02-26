
package main;

public class Contacts extends Student{
   private  int contactId;

   private  String contactAddress;

    public Contacts(int Id, String Fam, String Name, String Department) {
        super(Id, Fam, Name, Department);
    }
   


    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

  

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }
   

  

   

    
}
