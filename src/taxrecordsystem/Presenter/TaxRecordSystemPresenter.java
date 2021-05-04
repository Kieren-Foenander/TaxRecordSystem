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
    
    
    
    
    
    

}
