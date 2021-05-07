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

    public TaxRecordSystemModel() { //constructor

        try {
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

        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

    @Override
    public List<Customer> getAllCustomers() {

        List<Customer> result = null;
        ResultSet rs = null;

        try {
            // executes query and returns matching resutls
            rs = selectAllCustomers.executeQuery();
            result = new ArrayList<Customer>();

            while (rs.next()) {
                result.add(new Customer(
                        rs.getInt("TFN"),
                        rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME"),
                        rs.getString("ADDRESS"),
                        rs.getString("PHONE"),
                        rs.getDouble("INCOME"),
                        rs.getDouble("DEDUCTIBLE"),
                        rs.getDouble("TAXHELD"),
                        rs.getDouble("TAXRETURNED")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    @Override
    public List<Customer> getCustomerByTfn(int tfn) {
        // instantiates variables required
        List<Customer> result = null;
        ResultSet rs = null;

        try {
            
            selectCustomerByTfn.setInt(1, tfn); // sets tfn to one being searched for
            
            // executeQuery returns ResultSet containing matching entries
            rs = selectCustomerByTfn.executeQuery();
            result = new ArrayList<Customer>();

            while (rs.next()) { // adds results as new customer object into arraylist 
                result.add(new Customer(
                        rs.getInt("TFN"),
                        rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME"),
                        rs.getString("ADDRESS"),
                        rs.getString("PHONE"),
                        rs.getDouble("INCOME"),
                        rs.getDouble("DEDUCTIBLE"),
                        rs.getDouble("TAXHELD"),
                        rs.getDouble("TAXRETURNED")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result; // reutrns arraylist
    }

    @Override
    public List<Customer> getCustomerByLastName(String lastName) {
        
        List<Customer> result = null;
        ResultSet rs = null;

        try {
            
            selectCustomerByLastName.setString(1, lastName); // set last name to one being searched for
            
            // executeQuery returns ResultSet containing matching entries
            rs = selectCustomerByLastName.executeQuery();
            result = new ArrayList<Customer>();

            while (rs.next()) { // adds results as new customer object into arraylist 
                result.add(new Customer(
                        rs.getInt("TFN"),
                        rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME"),
                        rs.getString("ADDRESS"),
                        rs.getString("PHONE"),
                        rs.getDouble("INCOME"),
                        rs.getDouble("DEDUCTIBLE"),
                        rs.getDouble("TAXHELD"),
                        rs.getDouble("TAXRETURNED")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result; // returns arraylist
    }
    
    

    
    public int addCustomer(int tfn, String firstName, String lastName, String address, String phone, double income, double deductibleAmount, double taxHeld, double returnTax) {
        
        // instantiates int to return
        int result = 0;
        
        //sets parameters for new customer then executes insert statement
        try{
            
            insertNewCustomer.setInt(1, tfn);
            insertNewCustomer.setString(2, firstName);
            insertNewCustomer.setString(3, lastName);
            insertNewCustomer.setString(4, address);
            insertNewCustomer.setString(5, phone);
            insertNewCustomer.setDouble(6, income);
            insertNewCustomer.setDouble(7, deductibleAmount);
            insertNewCustomer.setDouble(8, taxHeld);
            insertNewCustomer.setDouble(9, returnTax);
            
            // inserts new entry and returns # of rows updated
            result = insertNewCustomer.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
            close();
        }
        return result;
    }

    @Override
    public int editCustomer(int tfn, String firstName, String lastName, String address, String phone, double income, double deductibleAmount, double taxHeld, double returnTax, int originalTfn) {
                // instantiates int to return
        int result = 0;
        
        //sets parameters for customer update then executes update statement
        try{
            
            updateCustomer.setInt(1, tfn);
            updateCustomer.setString(2, firstName);
            updateCustomer.setString(3, lastName);
            updateCustomer.setString(4, address);
            updateCustomer.setString(5, phone);
            updateCustomer.setDouble(6, income);
            updateCustomer.setDouble(7, deductibleAmount);
            updateCustomer.setDouble(8, taxHeld);
            updateCustomer.setDouble(9, returnTax);
            updateCustomer.setInt(10, tfn);
            
            // updates existing entry and returns # of rows updated
            result = updateCustomer.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
            close();
        }
        return result;
    }

    @Override
    public void close() {
        try{
            connection.close(); 
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Customer createCustomer(int tfn, String firstName, String lastName, String address, String phone, double income, double deductibleAmount, double taxHeld, double returnTax) {
        Customer c = new Customer(tfn,firstName,lastName,address,phone,income,deductibleAmount,taxHeld,returnTax);
        return c;
    }
}
