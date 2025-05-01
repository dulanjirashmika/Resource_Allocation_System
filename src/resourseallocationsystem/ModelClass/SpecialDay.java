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
public class SpecialDay extends HallReservation{
    private String spId;
    private String dayName;
    private int noOfDates;
    private Date firstDate;
    private Date lastDate;

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
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

    public SpecialDay(String spId, String dayName, int noOfDates, Date firstDate, Date lastDate, String customerId, int hallNo) {
        super(customerId, hallNo);
        this.spId = spId;
        this.dayName = dayName;
        this.noOfDates = noOfDates;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
    }

    public SpecialDay(String spId, String customerId, int hallNo) {
        super(customerId, hallNo);
        this.spId = spId;
    }

    public SpecialDay(String customerId, int hallNo) {
        super(customerId, hallNo);
    }
    
    
    
}
