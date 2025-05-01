/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourseallocationsystem.ModelClass;

/**
 *
 * @author User
 */
public class HallReservation {
    private String customerId;
    private int hallNo;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getHallNo() {
        return hallNo;
    }

    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }

    public HallReservation(String customerId, int hallNo) {
        this.setCustomerId(customerId);
        this.setHallNo(hallNo);
    }

    public HallReservation(String customerId) {
        this(customerId,0);
    }

    public HallReservation() {
        this("19963256784956");
        
    }
    
    
    
}
