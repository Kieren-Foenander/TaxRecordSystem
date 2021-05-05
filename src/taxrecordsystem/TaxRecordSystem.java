/*
Programmer: Kieren Foenander S012141776
Course: COIT12200 Software Design and Development
Assignment 2
 */
package taxrecordsystem;

import taxrecordsystem.Presenter.TaxRecordSystemPresenter;
import taxrecordsystem.model.Customer;
import taxrecordsystem.model.ITaxRecordSystemModel;
import taxrecordsystem.model.TaxRecordSystemModel;
import taxrecordsystem.view.ITaxRecordSystemView;
import taxrecordsystem.view.TaxRecordSystemView;

/**
 *
 * @author Kieren Foenander
 */
public class TaxRecordSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ITaxRecordSystemModel itrsm = new TaxRecordSystemModel();
        
        ITaxRecordSystemView itrsv = new TaxRecordSystemView();
        
        TaxRecordSystemPresenter trsp = new TaxRecordSystemPresenter(itrsm, itrsv);
        
        itrsv.bind(trsp);

    }

}
