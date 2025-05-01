/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourseallocationsystem.ControllerClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import resourseallocationsystem.ModelClass.Owner;

/**
 *
 * @author User
 */
import java.sql.*;
public class AdminController {
     private Owner admin;
     
     
     public void excuteAdminQuery(){
         String sq1 = "Select *from  ";
     }
     
    public void setAdmin(ResultSet rs) throws SQLException{
       
        while(rs.next()){
            this.admin = new Owner(rs.getString("ownerName"),rs.getString("ownerID"));
            
        
    }
    } 
    

    public Owner getAdmin() {
        return admin;
    }

    
}
