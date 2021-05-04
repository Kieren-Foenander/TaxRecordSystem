/*
Programmer: Kieren Foenander S012141776
Course: COIT12200 Software Design and Development
Assignment 2
 */

package taxrecordsystem.model;

import java.util.List;

/**
 *
 * @author Kieren Foenander
 */
public class TaxRecordSystemModel implements ITaxRecordSystemModel {

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
