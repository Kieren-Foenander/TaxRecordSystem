/*
Programmer: Kieren Foenander S012141776
Course: COIT12200 Software Design and Development
Assignment 2
 */
package taxrecordsystem;

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
        
        TaxRecordSystemView trsv = new TaxRecordSystemView();
        trsv.setVisible(true);
       
    }

}
