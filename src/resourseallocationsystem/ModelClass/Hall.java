/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourseallocationsystem.ModelClass;

/**
 *
 * @author User
 */
public class Hall {
    private int hallNo;
    private int capacity;
    private double dailyCharge;

    public int getHallNo() {
        return hallNo;
    }

    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDailyCharge() {
        return dailyCharge;
    }

    public void setDailyCharge(double dailyCharge) {
        this.dailyCharge = dailyCharge;
    }

    public Hall(int hallNo, int capacity, double dailyCharge) {
        this.hallNo = hallNo;
        this.capacity = capacity;
        this.dailyCharge = dailyCharge;
    }

    public Hall(int hallNo, int capacity) {
        this.hallNo = hallNo;
        this.capacity = capacity;
    }

    public Hall(int hallNo) {
        this.hallNo = hallNo;
    }
    
    
    
}
