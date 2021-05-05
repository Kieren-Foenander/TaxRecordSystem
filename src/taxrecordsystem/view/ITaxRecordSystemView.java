/*
Programmer: Kieren Foenander S012141776
Course: COIT12200 Software Design and Development
Assignment 2
 */
package taxrecordsystem.view;

import taxrecordsystem.Presenter.TaxRecordSystemPresenter;
import taxrecordsystem.model.Customer;

/**
 *
 * @author Kieren Foenander
 */
public interface ITaxRecordSystemView {
    
    public void bind (TaxRecordSystemPresenter p);
    public void setBrowsing(boolean browsing);
    public void displayError(String error);
    public void displayRecord(Customer c);
    public void displayMaxAndCurrent(int max, int current);
    public void searchByTfn(int tfn);
    public void searchByName(String lastName);
    public void displayMessage(String message);

}
