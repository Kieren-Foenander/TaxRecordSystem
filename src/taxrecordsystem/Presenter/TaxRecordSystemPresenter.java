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
        //displays current record on gui
        view.displayRecord(currentEntry);
        view.displayMaxAndCurrent(numberOfEntries, currentEntryIndex);
    }
    
    public void createNewCustomer(int tfn, String firstName, String lastName, String address, String phone, double income, double deductible, double taxHeld, double returnTax){
        
        Customer c = model.createCustomer(tfn, firstName, lastName, address, phone, income, deductible, taxHeld, returnTax); // creates new customer before adding so tax held and return tax variables are calulated
        int result = model.addCustomer(c.getTfn(), c.getFirstName(), c.getLastName(), c.getAddress(), c.getPhone(), c.getIncome(), c.getDeductibleAmount(), c.getTaxHeld(), c.getReturnTax());
        if (result == 1){ // add customer method returns an int to tell system whether the operation was successful or not
            view.displayMessage("Customer added successfully");
            currentEntry = c; // sets current entry to customer just entered 
            populateAllTextFields();
            view.setBrowsing(true); // sets program to browsing mode
            
        } else{
            //if adding customer operation failes error message is displayed
            view.displayMessage("Customer entry failed");
        }
    }
    
    public void performQueryByTfn(int tfn){
        // uses sql query to find customer via tfn entered
        results = model.getCustomerByTfn(tfn);
        
        numberOfEntries = results.size(); // sets value to size of arraylist returned for available entries to browse through
        if (numberOfEntries == 0){ // if tfn entered does not exist
            view.displayError("There are no Customers with this Tax File Number");
        }else{
            currentEntryIndex = 0;
            currentEntry = results.get(currentEntryIndex);
            populateAllTextFields();
            view.setBrowsing(true);
            
        }
    }
    
    public void perfomQueryByLastName(String lastName){
        //uses sql query to find customer via last name entered
        results = model.getCustomerByLastName(lastName);
        
        numberOfEntries = results.size(); // sets value to size of arraylist returned for available entries to browse through
        if (numberOfEntries == 0){ // if last name entered does not exist
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
            // uses sql query to obtain all customers in database
            results = model.getAllCustomers();
            
            numberOfEntries = results.size(); // sets value to size of arraylist returned for available entries to browse through
            if (numberOfEntries == 0){ // if there are no records 
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
        //plus by one
        currentEntryIndex ++;
        
        if (currentEntryIndex == results.size()){ 
            // if no more entries to view error shown
            view.displayError("there are no more entries");
            // minus by one to keep index same as previous
            currentEntryIndex--;
        }else {
            currentEntry = results.get(currentEntryIndex);// gets the new customer with the updated index number
            populateAllTextFields();
        }
    }
    public void previous(){
        //minus by one
        currentEntryIndex--;
        
        if (currentEntryIndex == -1){
            //does not allow user to go back further as there are no results to display
            view.displayError("there are no more entries");
            //plus by one to reset number 
            currentEntryIndex++;
        }else {
            currentEntry = results.get(currentEntryIndex); // gets preivous customer with updated index
            populateAllTextFields();
        }
    }
    
    public void edit(int tfn, String firstName, String lastName, String address, String phone, double income, double deductible, double taxHeld, double returnTax){
        // creates new customer object so tax calculations are handled with updated details
        Customer c = model.createCustomer(tfn, firstName, lastName, address, phone, income, deductible, taxHeld, returnTax);
        int result = model.editCustomer(c.getTfn(), c.getFirstName(), c.getLastName(), c.getAddress(), c.getPhone(), c.getIncome(), c.getDeductibleAmount(), c.getTaxHeld(), c.getReturnTax(), tfn);
        // returns int to ensure operation succesful
        if (result == 1){ // 
            view.displayMessage("Customer updated successfully");
            performQueryByTfn(tfn); // shows updated customer
            
        } else{
            view.displayMessage("Customer Update failed");
        }    
    }
}
