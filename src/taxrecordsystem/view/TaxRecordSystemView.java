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
import java.util.regex.Pattern;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
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

    private JButton saveButton;
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
        super("Tax Record System");
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
        saveButton = new JButton();
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

        currentEntryTextField.setEditable(false);

        ofLabel.setText("of");

        previousButton.setEnabled(false);

        nextButton.setEnabled(false);

        editButton.setEnabled(false);

        setVisible(true);

        browsButton.setText("Browse");
        browsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        tfnSearchButton.setText("Search By TFN");
        tfnSearchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                tfnSearchButtonActionPerformed(evt);
            }
        });

        lastNameSearchButton.setText("Search By Last Name");
        lastNameSearchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                lastNameSearchButtonActionPerformed(evt);
            }
        });

        clearTextFieldsButton.setText("Add New Customer");
        clearTextFieldsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                clearTextFieldsButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save New Customer");
        saveButton.setToolTipText("");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        editButton.setText("Save Updated detials");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        previousButton.setText("previous");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        nextButton.setText("next");
        nextButton.addActionListener(new ActionListener() {
            @Override
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
                                                        .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(saveButton, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
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

    private void SaveButtonActionPerformed(ActionEvent evt) {

        try {
            // gets input from user
            int tfn = Integer.parseInt(tfnTextField.getText());
            String firstName = firstNameTextField.getText();
            String lastName = lastNameTextField.getText();
            String address = addressTextField.getText();
            String phone = phoneTextField.getText();
            double income = Double.parseDouble(incomeTextField.getText());
            double deductible = Double.parseDouble(deductibleTextField.getText());
            double taxHeld = 0;
            double returnTax = 0;
            if (validateCustomer(tfn, firstName, lastName, address, phone, income, deductible) == true) {
                //creates new customer with given input
                presenter.createNewCustomer(tfn, firstName, lastName, address, phone, income, deductible, taxHeld, returnTax);
            }

        } catch (NumberFormatException e) {
            //ensures number inputs are numbers
            displayError(e.getMessage().substring(e.getMessage().lastIndexOf(" ") + 1) + " is not entered out properly");
        }
    }

    private void editButtonActionPerformed(ActionEvent evt) {
        try {
            //gets input from user
            int tfn = Integer.parseInt(tfnTextField.getText());
            String firstName = firstNameTextField.getText();
            String lastName = lastNameTextField.getText();
            String address = addressTextField.getText();
            String phone = phoneTextField.getText();
            double income = Double.parseDouble(incomeTextField.getText());
            double deductible = Double.parseDouble(deductibleTextField.getText());
            double taxHeld = 0;
            double returnTax = 0;
            if (validateCustomer(tfn, firstName, lastName, address, phone, income, deductible) == true) {
                //edits existing user with new input
                presenter.edit(tfn, firstName, lastName, address, phone, income, deductible, taxHeld, returnTax);
            }

        } catch (NumberFormatException e) {
            //ensures that number inputs are actually numbers
            displayError(e.getMessage().substring(e.getMessage().lastIndexOf(" ") + 1) + " is not entered correctly");
        }
    }
    
    private boolean validateString(String field,String name, int max, int min){
        //to validate the string fields 
        boolean valid;
        if(field.length() > max){
            displayError(name+ " contains too many letters");
            valid = false;
            return valid;
        }else if (field.length() ==  min){
            displayError(name+" field is blank");
            valid = false;
            return valid;
        }else{
            valid = true;
        }
        return valid;
    }
    
    private boolean validateDouble(double field, String name, int max, int min){
        //to validate integer fields
        boolean valid;
        if(String.valueOf(field).length() > max){
            displayError(name+ " contains too many numbers");
            valid = false;
            return valid;
        }else if (String.valueOf(field).length() ==  min){
            displayError(name+" field is blank");
            valid = false;
            return valid;
        }else{
            valid = true;
        }
        return valid;
    }

    private boolean validateCustomer(int tfn, String firstName, String lastName, String address, String phone, double income, double deductible) {
        // validates length of fields to avoid sql entry errors

        boolean valid;
        final int MAX = 11;
        final int PHONE_NUMBER = 10;
        final int MAX_STRING = 20;
        final int MAX_ADDRESS = 50;
        final int MIN = 0;
        String fn = "First Name";
        String ln = "Last Name";
        String ad = "Address";
        String in = "Income";
        String de = "Deductible Income";

       if (String.valueOf(tfn).length() > MAX) {
            displayError("Tax File Number contains too many numbers");
            valid = false;
            return valid;
        }else if (String.valueOf(tfn).length() == MIN){
            displayError("Tax File Number field is blank");
            valid = false;
            return valid;
        } else {
            valid = true;
        }

        if(validateString(firstName, fn, MAX_STRING, MIN) == false || validateString(lastName, ln, MAX_STRING, MIN) == false 
                || validateString(address, ad, MAX_ADDRESS, MIN) == false){
            //validates firstName, lastName and address fields
            valid = false;
            return valid;
        }else{
            valid = true;
        }
        
        if (validateDouble(income, in, MAX, MIN) == false || validateDouble(deductible, de, MAX, MIN) == false){
            //validates income and deductible fields
            valid = false;
            return valid;
        }else{
            valid = true;
        }

        /* 
            special case for phone number as a phone number consists of 10 didgits and can only be numbers but due to starting with
            a zero in sql it is treated as a varchar so this further validation required in system to ensure only numbers used
         */
        if (phone.length() != PHONE_NUMBER) {
            displayError("phone number must contain 10 digits");
            valid = false;
            return valid;
        } else if (Pattern.matches("[a-zA-Z]+", phone)) { // ensures only numbers used for phone number
            displayError("phone Number can only contain numbers");
            valid = false;
            return valid;
        } else {
            valid = true;
        }

        return valid;
    }

    private void browseButtonActionPerformed(ActionEvent evt) {
        presenter.browse();
    }

    private void tfnSearchButtonActionPerformed(ActionEvent evt) {
        searchByTfn();
    }

    private void lastNameSearchButtonActionPerformed(ActionEvent evt) {
        searchByName();
    }

    private void clearTextFieldsButtonActionPerformed(ActionEvent evt) {
        // clears all text fields to enter new customer details
        tfnTextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        addressTextField.setText("");
        phoneTextField.setText("");
        incomeTextField.setText("");
        deductibleTextField.setText("");
        taxHeldTextField.setText("");
        returnTaxTextField.setText("");
        currentEntryTextField.setText("");
        maximumEntryTextField.setText("");
        setBrowsing(false);
    }

    private void previousButtonActionPerformed(ActionEvent evt) {
        presenter.previous();
    }

    private void nextButtonActionPerformed(ActionEvent evt) {
        presenter.next();
    }

    @Override
    public void bind(TaxRecordSystemPresenter p) {
        presenter = p;
    }

    @Override
    public void setBrowsing(boolean browsing) { // enables buttons for browising purposes 
        nextButton.setEnabled(browsing);
        previousButton.setEnabled(browsing);
        editButton.setEnabled(browsing); // enables edit button as system is displaying existing users now
        tfnTextField.setEditable(!browsing); // disables textfield from being editet as value cant be changed due to it being the primary key
        saveButton.setEnabled(!browsing);// disables save button while browsing
    }

    @Override
    public void displayError(String error) {//displays error meesage with given parameter   
        JOptionPane.showMessageDialog(null, error, "ErrorMsg", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void displayRecord(Customer c) { // updates all text fields to display passed customer information
        tfnTextField.setText(String.valueOf(c.getTfn()));
        firstNameTextField.setText(c.getFirstName());
        lastNameTextField.setText(c.getLastName());
        addressTextField.setText(c.getAddress());
        phoneTextField.setText(c.getPhone());
        incomeTextField.setText(String.valueOf(c.getIncome()));
        deductibleTextField.setText(String.valueOf(c.getDeductibleAmount()));
        taxHeldTextField.setText("$" + String.valueOf(c.getTaxHeld()));
        returnTaxTextField.setText("$" + String.valueOf(c.getReturnTax()));
    }

    @Override
    public void displayMaxAndCurrent(int max, int current) { // displays the max and current number of customers from the current list being looked at
        currentEntryTextField.setText(String.valueOf(current + 1));
        maximumEntryTextField.setText(String.valueOf(max));

    }

    @Override
    public void searchByTfn() { // gets tfn to search for
        try {
            int tfn = Integer.parseInt(JOptionPane.showInputDialog("Enter Tax File Number"));
            presenter.performQueryByTfn(tfn);
        } catch (NumberFormatException e) {
            displayError(e.getMessage().substring(e.getMessage().lastIndexOf(" ") + 1) + " is not a valid tfn number");
        }
    }

    @Override
    public void searchByName() { // gets name to search for
        String name = JOptionPane.showInputDialog("Enter Customers Last Name");
        presenter.perfomQueryByLastName(name);
    }

    @Override
    public void displayMessage(String message) { // displays message with the passed string
        JOptionPane.showMessageDialog(null, message);
    }

}
