/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourseallocationsystem.ModelClass;

import java.util.Date;

/**
 *
 * @author User
 */
public class ContinuousPeriod extends HallReservation{
    private String cpId;
    private int noOfDates;
    private Date firstDate;
    private Date lastDate;

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public int getNoOfDates() {
        return noOfDates;
    }

    public void setNoOfDates(int noOfDates) {
        this.noOfDates = noOfDates;
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public ContinuousPeriod(String cpId, int noOfDates, Date firstDate, Date lastDate, String customerId, int hallNo) {
        super(customerId, hallNo);
        this.cpId = cpId;
        this.noOfDates = noOfDates;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
    }

    public ContinuousPeriod(String cpId, String customerId, int hallNo) {
        super(customerId, hallNo);
        this.cpId = cpId;
    }

    public ContinuousPeriod(String customerId, int hallNo) {
        super(customerId, hallNo);
    }

   
    
    
    
    
}
