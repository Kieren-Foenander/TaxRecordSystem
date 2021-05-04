/*
Programmer: Kieren Foenander S012141776
Course: COIT12200 Software Design and Development
Assignment 2
 */

package taxrecordsystem.view;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import taxrecordsystem.Presenter.TaxRecordSystemPresenter;
import taxrecordsystem.model.Customer;

/**
 *
 * @author Kieren Foenander
 */
public class TaxRecordSystemView extends JFrame implements ITaxRecordSystemView {
    
    // Variables declaration
    private TaxRecordSystemPresenter presenter;
    
    private JButton SaveButton;
    private JLabel addressLabel;
    private JTextField addressTextField;
    private JButton browsButton;
    private JButton clearTextFieldsButton;
    private JTextField currentEntryTextField;
    private JLabel deductibleLabel;
    private JTextField deductibleTextField;
    private JButton editButton;
    private JLabel firstNameLabel;
    private JTextField firstNameTextField;
    private JLabel incomeLabel;
    private JTextField incomeTextField;
    private JLabel titleLabel;
    private JLabel ofLabel;
    private JLayeredPane jLayeredPane1;
    private JPanel jPanel;
    private JLabel lastNameLabel;
    private JButton lastNameSearchButton;
    private JTextField lastNameTextField;
    private JTextField maximumEntryTextField;
    private JButton nextButton;
    private JLabel phoneLabel;
    private JTextField phoneTextField;
    private JButton previousButton;
    private JLabel returnTaxLabel;
    private JTextField returnTaxTextField;
    private JLabel taxHeldLabel;
    private JTextField taxHeldTextField;
    private JLabel tfnLabel;
    private JButton tfnSearchButton;
    private JTextField tfnTextField;
    // End of variables declaration   

    public TaxRecordSystemView() {
        super( " Tax Record System" );
        initComponents();
    }

    @SuppressWarnings("unchecked") 
    
    // <editor-fold defaultstate="collapsed" desc="Swing Components">  
    private void initComponents() {

        jLayeredPane1 = new JLayeredPane();
        jPanel = new JPanel();
        titleLabel = new JLabel();
        tfnLabel = new JLabel();
        firstNameLabel = new JLabel();
        lastNameLabel = new JLabel();
        addressLabel = new JLabel();
        phoneLabel = new JLabel();
        incomeLabel = new JLabel();
        deductibleLabel = new JLabel();
        taxHeldLabel = new JLabel();
        returnTaxLabel = new JLabel();
        tfnTextField = new JTextField();
        firstNameTextField = new JTextField();
        lastNameTextField = new JTextField();
        addressTextField = new JTextField();
        phoneTextField = new JTextField();
        incomeTextField = new JTextField();
        deductibleTextField = new JTextField();
        taxHeldTextField = new JTextField();
        returnTaxTextField = new JTextField();
        browsButton = new JButton();
        tfnSearchButton = new JButton();
        lastNameSearchButton = new JButton();
        clearTextFieldsButton = new JButton();
        SaveButton = new JButton();
        editButton = new JButton();
        currentEntryTextField = new JTextField();
        maximumEntryTextField = new JTextField();
        ofLabel = new JLabel();
        previousButton = new JButton();
        nextButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new Font("Dialog", 1, 36)); // NOI18N
        titleLabel.setText("Tax Record System");

        tfnLabel.setText("Tax File Number:");

        firstNameLabel.setText("First Name:");

        lastNameLabel.setText("Last Name:");

        addressLabel.setText("Address:");

        phoneLabel.setText("Phone:");

        incomeLabel.setText("Income:");

        deductibleLabel.setText("Deductible Amount:");

        taxHeldLabel.setText("Tax Held:");

        returnTaxLabel.setText("Tax To Be Returned:");

        taxHeldTextField.setEditable(false);

        returnTaxTextField.setEditable(false);
        
        maximumEntryTextField.setEditable(false);
        
        ofLabel.setText("of");

        browsButton.setText("Browse");
        browsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                browsButtonActionPerformed(evt);
            }
        });

        tfnSearchButton.setText("Search By TFN");
        tfnSearchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tfnSearchButtonActionPerformed(evt);
            }
        });

        lastNameSearchButton.setText("Search By Last Name");
        lastNameSearchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                lastNameSearchButtonActionPerformed(evt);
            }
        });

        clearTextFieldsButton.setText("Add New Customer");
        clearTextFieldsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearTextFieldsButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save New Customer");
        SaveButton.setToolTipText("");
        SaveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        editButton.setText("Save Updated detials");
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        maximumEntryTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                maximumEntryTextFieldActionPerformed(evt);
            }
        });

        

        previousButton.setText("previous");
        previousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        nextButton.setText("next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel);
        jPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(titleLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(tfnLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(addressLabel)
                            .addComponent(phoneLabel)
                            .addComponent(incomeLabel)
                            .addComponent(deductibleLabel)
                            .addComponent(taxHeldLabel)
                            .addComponent(returnTaxLabel))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfnTextField)
                            .addComponent(firstNameTextField)
                            .addComponent(lastNameTextField)
                            .addComponent(addressTextField)
                            .addComponent(phoneTextField)
                            .addComponent(incomeTextField)
                            .addComponent(deductibleTextField)
                            .addComponent(taxHeldTextField)
                            .addComponent(returnTaxTextField, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(currentEntryTextField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastNameSearchButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(browsButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SaveButton, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
                            .addComponent(previousButton, GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(ofLabel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfnSearchButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearTextFieldsButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(maximumEntryTextField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(tfnLabel)
                            .addComponent(tfnTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel)
                            .addComponent(firstNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel)
                            .addComponent(lastNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel)
                            .addComponent(addressTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLabel)
                            .addComponent(phoneTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(incomeLabel)
                            .addComponent(incomeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(deductibleLabel)
                            .addComponent(deductibleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(taxHeldLabel)
                            .addComponent(taxHeldTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(returnTaxLabel)
                            .addComponent(returnTaxTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(currentEntryTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(maximumEntryTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ofLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(previousButton)
                            .addComponent(nextButton))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(SaveButton, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(editButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(browsButton, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(tfnSearchButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameSearchButton, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(clearTextFieldsButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );

        jLayeredPane1.setLayer(jPanel, JLayeredPane.DEFAULT_LAYER);

        GroupLayout jLayeredPane1Layout = new GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        pack();
    }//</editor-fold>                    

    private void maximumEntryTextFieldActionPerformed(ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void SaveButtonActionPerformed(ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void editButtonActionPerformed(ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void browsButtonActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void tfnSearchButtonActionPerformed(ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void lastNameSearchButtonActionPerformed(ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void clearTextFieldsButtonActionPerformed(ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void previousButtonActionPerformed(ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void nextButtonActionPerformed(ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

                

    @Override
    public void bind(TaxRecordSystemPresenter p) {
        p = presenter;
    }

    @Override
    public void setBrowsing(boolean browsing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayError(String error) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayRecord(Customer c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void searchByTfn(int tfn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void searchByName(String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
