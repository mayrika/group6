package jpa;

import java.util.HashMap;

public class TaxInvoiceDTO
{
    private String customerCompanyName;
    private String address;
    private String taxID;
    private String customerName;
    private String customerPhoneNumber;
    private String customerEmail;
    private HashMap <String, Double> PoSNameAndPrice; //PoS : Product or Service
    private HashMap <String, Integer> PoSNameAndAmount;
    private double totalPrice;

    public String getCustomerCompanyName() {
        return customerCompanyName;
    }

    public void setCustomerCompanyName(String customerCompanyName) {
        this.customerCompanyName = customerCompanyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public HashMap<String, Double> getPoSNameAndPrice() {
        return PoSNameAndPrice;
    }

    public void setPoSNameAndPrice(HashMap<String, Double> PoSNameAndPrice) {
        this.PoSNameAndPrice = PoSNameAndPrice;
    }

    public HashMap<String, Integer> getPoSNameAndAmount() {
        return PoSNameAndAmount;
    }

    public void setPoSNameAndAmount(HashMap<String, Integer> PoSNameAndAmount) {
        this.PoSNameAndAmount = PoSNameAndAmount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
