/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourseallocationsystem.ModelClass;

/**
 *
 * @author User
 */
public class Owner {
    private String ownerName;
    private String ownerId;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public Owner(String ownerName, String ownerId) {
        this.setOwnerName(ownerName);
        this.setOwnerId(ownerId);
    }

    public Owner(String ownerId) {
        this("No name",ownerId);
    }

    public Owner() {
        this("1992354862914");
    }
    
    public void customerRegistration(String name, String nicNo, String telephoneNo, String address){
        Customer c = new Customer(name,nicNo,telephoneNo,address);
    }
    
    
}
