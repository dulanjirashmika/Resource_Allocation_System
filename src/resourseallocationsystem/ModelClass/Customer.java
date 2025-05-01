/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourseallocationsystem.ModelClass;

/**
 *
 * @author User
 */
public class Customer {
    private String name;
    private String nicNo;
    private String telephoneNo;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String name, String nicNo, String telephoneNo, String address) {
        this.setName(name);
        this.setNicNo(nicNo);
        this.setTelephoneNo(telephoneNo);
        this.setAddress(address);
    }

    public Customer(String name, String nicNo, String telephoneNo) {
        this(name,nicNo,telephoneNo,"Colombo");
    }

    public Customer(String name, String nicNo) {
        this(name,nicNo,"231568885");
    }

    public Customer(String name) {
        this(name,"199645896321");
    }

    public Customer() {
        this("No name");
    }
    
    
    
    
}
