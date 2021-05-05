/*
Programmer: Kieren Foenander S012141776
Course: COIT12200 Software Design and Development
Assignment 2
 */

package taxrecordsystem.Presenter;

import java.util.List;
import taxrecordsystem.model.Customer;
import taxrecordsystem.model.ITaxRecordSystemModel;
import taxrecordsystem.view.ITaxRecordSystemView;

/**
 *
 * @author Kieren Foenander
 */
public class TaxRecordSystemPresenter {
    
    //declaring variables
    private ITaxRecordSystemView view;
    private ITaxRecordSystemModel model;
    private List <Customer> results;
    private int currentEntryIndex;
    private int numberOfEntries;
    private Customer currentEntry;
    
    public TaxRecordSystemPresenter(ITaxRecordSystemModel itrsm, ITaxRecordSystemView itrsv){ //  constructor
        
        view = itrsv;
        model = itrsm;
        currentEntryIndex = 0;
        numberOfEntries = 0;
        results = null;
        currentEntry = null;
    }
    
    private void populateAllTextFields(){
        view.displayRecord(currentEntry);
        view.displayMaxAndCurrent(numberOfEntries, currentEntryIndex);
    }
    
    public void createNewCustomer(int tfn, String firstName, String lastName, String address, String phone, double income, double deductible, double taxHeld, double returnTax){

        Customer c = model.createCustomer(tfn, firstName, lastName, address, phone, income, deductible, taxHeld, returnTax);
        int result = model.addCustomer(c.getTfn(), c.getFirstName(), c.getLastName(), c.getAddress(), c.getPhone(), c.getIncome(), c.getDeductibleAmount(), c.getTaxHeld(), c.getReturnTax());
        if (result == 1){
            view.displayMessage("Customer added successfully");
        } else{
            view.displayMessage("Customer entry failed");
        }
    }
    
    public void performQueryByTfn(int tfn){
        
    }
    
    public void perfomQueryByLastName(String lastName){
        
    }
    
    public void browse(){
        
    }
    
    public void edit(int tfn, String firstName, String lastName, String address, String phone, double income, double deductible, double taxHeld, double returnTax, int originalTfn){
        
    }
    
    public void close(){
        
    }
    
    
    
    
    
    

}
