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
public interface ITaxRecordSystemModel {
    
    public List <Customer> getAllCustomers();
    public List <Customer> getCustomerByTfn(int tfn);
    public List <Customer> getCustomerByLastName(String lastName);
    public int addCustomer(int tfn, String firstName, String lastName, String Address, String phone, double income, double deductibleAmount, double taxHeld, double returnTax);
    public int editCustomer(int tfn, String firstName, String lastName, String Address, String phone, double income, double deductibleAmount, double taxHeld, double returnTax);
    public void close();

}
