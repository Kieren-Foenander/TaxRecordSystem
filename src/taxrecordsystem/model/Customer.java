/*
Programmer: Kieren Foenander S012141776
Course: COIT12200 Software Design and Development
Assignment 2
 */
package taxrecordsystem.model;

/**
 *
 * @author Kieren Foenander
 */
public class Customer {

    // creating instance varibles for a customer object
    private int tfn;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private double income;
    private double deductibleAmount;
    private double taxHeld;
    private double returnTax;

    Customer() {// defualt constructor
    }

    Customer(int tfn, String firstName, String lastName, String address, String phone, double income, double deductibleAmount, double taxHeld, double returnTax) {
        // parameterised constructor  
        this.tfn = tfn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.income = income;
        this.deductibleAmount = deductibleAmount;
        taxHeld = calculateTaxHeld(income);
        this.taxHeld = taxHeld;
        returnTax = calculateReturnTax(income, taxHeld, deductibleAmount);
        this.returnTax = returnTax;
    }

    /* Set and Get methods */
    public void setTfn(int tfn) {
        this.tfn = tfn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setDeductibleAmount(double deductibleAmount) {
        this.deductibleAmount = deductibleAmount;
    }

    public int getTfn() {
        return tfn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public double getIncome() {
        return income;
    }

    public double getDeductibleAmount() {
        return deductibleAmount;
    }

    public double getTaxHeld() {
        return taxHeld;
    }

    public double getReturnTax() {
        return returnTax;
    }

    public double calculateTaxHeld(double income) {

        double untiered = 18200;
        double tierOneLow = 18201;
        double tierOneHigh = 37000;
        double tierOneRate = 0.19;
        double tierTwoLow = 37001;
        double tierTwoHigh = 87000;
        double tierTwoSetAmount = 3572;
        double tierTwoRate = 0.325;
        double tierThreeLow = 87001;
        double tierThreeHigh = 180000;
        double tierThreeSetAmount = 19822;
        double tierThreeRate = 0.37;
        double tierFour = 180001;
        double tierFourSetAmount = 54232;
        double tierFourRate = 0.47;
        double amountOverThreshHold;
        // values added from appendix

        // will find which income tier the customer is in and calculate the tax held by using the rate of tax
        if (income < tierOneLow) {
            taxHeld = 0;
        } else if (income >= tierOneLow && income <= tierOneHigh) {

            amountOverThreshHold = income - untiered;
            taxHeld = amountOverThreshHold * tierOneRate;
        } else if (income >= tierTwoLow && income <= tierTwoHigh) {

            amountOverThreshHold = income - tierOneHigh;
            taxHeld = tierTwoSetAmount + (amountOverThreshHold * tierTwoRate);
        } else if (income >= tierThreeLow && income <= tierThreeHigh) {

            amountOverThreshHold = income - tierTwoHigh;
            taxHeld = tierThreeSetAmount + (amountOverThreshHold * tierThreeRate);
        } else if (income >= tierFour) {

            amountOverThreshHold = income - tierThreeHigh;
            taxHeld = tierFourSetAmount + (amountOverThreshHold * tierFourRate);
        }
        return taxHeld;
    }

    public double calculateReturnTax(double income, double taxHeld, double deductibleAmount) {

        double actualIncome = income - deductibleAmount; // calcualtes actual income
        double actualTaxHeld = calculateTaxHeld(actualIncome); // uses calculate tax Held method to find the actual tax held with the actual income
        returnTax = taxHeld - actualTaxHeld; // finds the difference

        return returnTax;
    }

    @Override
    public String toString() {
        return "Customer{" + "tfn=" + tfn + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phone=" + phone + ", income=" + income + ", deductibleAmount=" + deductibleAmount + ", taxHeld=" + taxHeld + ", returnTax=" + returnTax + '}';
    }
    
    

}
