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

        Customer c = model.createCustomer(tfn, firstName, lastName, address, phone, income, deductible, taxHeld, returnTax); // creates new customer before adding so tax held and return tax variables are calulated
        int result = model.addCustomer(c.getTfn(), c.getFirstName(), c.getLastName(), c.getAddress(), c.getPhone(), c.getIncome(), c.getDeductibleAmount(), c.getTaxHeld(), c.getReturnTax());
        if (result == 1){ // 
            view.displayMessage("Customer added successfully");
            currentEntry = c;
            populateAllTextFields();
            view.setBrowsing(true);
            
        } else{
            view.displayMessage("Customer entry failed");
        }
    }
    
    public void performQueryByTfn(int tfn){
        results = model.getCustomerByTfn(tfn);
        
        numberOfEntries = results.size();
        if (numberOfEntries == 0){
            view.displayError("There are no Customers with this Tax File Number");
        }else{
            currentEntryIndex = 0;
            currentEntry = results.get(currentEntryIndex);
            populateAllTextFields();
            view.setBrowsing(true);
            
        }
    }
    
    public void perfomQueryByLastName(String lastName){
        results = model.getCustomerByLastName(lastName);
        
        numberOfEntries =  results.size();
        if (numberOfEntries == 0){
            view.displayError("There are no Customers with this last name");
        }else {
            currentEntryIndex = 0;
            currentEntry = results.get(currentEntryIndex);
            populateAllTextFields();
            view.setBrowsing(true);
            
        }
    }
    
    public void browse(){
        try{
            results = model.getAllCustomers();
            
            numberOfEntries = results.size();
            if (numberOfEntries == 0){
                view.displayError("No records to browse");
            } else{
                currentEntryIndex = 0;
                currentEntry = results.get(currentEntryIndex);
                populateAllTextFields();
                view.setBrowsing(true);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void next(){
        currentEntryIndex ++;
        
        if (currentEntryIndex == results.size()){
            view.displayError("there are no more entries");
            currentEntryIndex--;
        }else {
            
            currentEntry = results.get(currentEntryIndex);
            populateAllTextFields();
        }
    }
    public void previous(){
        currentEntryIndex--;
        
        if (currentEntryIndex == -1){
            view.displayError("there are no more entries");
            currentEntryIndex++;
        }else {
            currentEntry = results.get(currentEntryIndex);
            populateAllTextFields();
        }
    }
    
    public void edit(int tfn, String firstName, String lastName, String address, String phone, double income, double deductible, double taxHeld, double returnTax){
        Customer c = model.createCustomer(tfn, firstName, lastName, address, phone, income, deductible, taxHeld, returnTax);
        int result = model.editCustomer(c.getTfn(), c.getFirstName(), c.getLastName(), c.getAddress(), c.getPhone(), c.getIncome(), c.getDeductibleAmount(), c.getTaxHeld(), c.getReturnTax(), tfn);
        
        if (result == 1){ // 
            view.displayMessage("Customer updated successfully");
            currentEntry = c;
            populateAllTextFields();
            browse();
            
        } else{
            view.displayMessage("Customer Update failed");
        }    
    }

    public void close(){
        
    }
    
}
