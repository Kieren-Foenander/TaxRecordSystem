/*
Programmer: Kieren Foenander S012141776
Course: COIT12200 Software Design and Development
Assignment 2
 */

package taxrecordsystem.model;

import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kieren Foenander
 */
public class TaxRecordSystemModel implements ITaxRecordSystemModel {

    private static final String URL = "jdbc:mysql://localhost:3306/taxpayers";
    private static final String USER = "root";
    private static final String PASSWORD = "mypassword";
    
    private Connection connection = null;
    private PreparedStatement selectAllCustomers = null;
    private PreparedStatement selectCustomerByTfn = null;
    private PreparedStatement selectCustomerByLastName = null;
    private PreparedStatement insertNewCustomer = null;
    private PreparedStatement updateCustomer = null;
    
    
    public TaxRecordSystemModel(){ //constructor
        
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            //sql statement to select all customers
            selectAllCustomers = connection.prepareStatement("SELECT * FROM taxpayers");
            
            //sql statement to select specific customer by TFN
            selectCustomerByTfn = connection.prepareStatement("SELECT * FROM taxpayers WHERE TFN = ?");
            
            // sql statement to select specific customer bny last name 
            selectCustomerByLastName = connection.prepareStatement("SELECT * FROM taxpayers WHERE LASTNAME = ?");
            
            // sql statement to insert new entry
            insertNewCustomer = connection.prepareStatement("INSERT INTO `taxpayers`.`taxpayers` "
                    + "(`TFN`, `FIRSTNAME`, `LASTNAME`, `ADDRESS`, `PHONE`, `INCOME`, `DEDUCTIBLE`, `TAXHELD`, `TAXRETURNED`)"
                    + " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            //sql command to update entry
            updateCustomer = connection.prepareStatement("UPDATE `taxpayers`.`taxpayers` SET `TFN` = ?,"
                    + " `FIRSTNAME` = ?, `LASTNAME` = ?, `ADDRESS` = ?, `PHONE` = ?, `INCOME` = ?, "
                    + "`DEDUCTIBLE` = ?, `TAXHELD` = ?, `TAXRETURNED` = ? WHERE (`TFN` = ?)");
            
        } catch (SQLException e){
            e.printStackTrace();
            
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public List<Customer> getAllCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getCustomerByTfn(int tfn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getCustomerByLastName(String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addCustomer(int tfn, String firstName, String lastName, String Address, String phone, double income, double deductibleAmount, double taxHeld, double returnTax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int editCustomer(int tfn, String firstName, String lastName, String Address, String phone, double income, double deductibleAmount, double taxHeld, double returnTax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
