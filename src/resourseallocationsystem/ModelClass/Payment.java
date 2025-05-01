/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourseallocationsystem.ModelClass;

/**
 *
 * @author User
 */
public class Payment {
    private int paymentNo;
    private int noOfDays;
    private double dailyCharge;

    public int getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(int paymentNo) {
        this.paymentNo = paymentNo;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public double getDailyCharge() {
        return dailyCharge;
    }

    public void setDailyCharge(double dailyCharge) {
        this.dailyCharge = dailyCharge;
    }

    public Payment(int paymentNo, int noOfDays, double dailyCharge) {
        this.setPaymentNo(paymentNo);
        this.setNoOfDays(noOfDays);
        this.setDailyCharge(dailyCharge);
    }

    public Payment(int paymentNo, int noOfDays) {
        this(paymentNo,noOfDays,3000.00);
    }

    public Payment(int paymentNo) {
        this(paymentNo,3);
    }

    public Payment() {
        this(0);
    }
    
    
    
    
}
