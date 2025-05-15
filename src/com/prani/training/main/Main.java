package com.prani.training.main;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("cust_123", "Bangaram", "9398689911");
        Customer.map.put("cust_123", customer);
        System.out.println(Customer.checkCustomerExistency("cust_123"));
        System.out.println(customer.checkCustomer("cust"));
        int a =10;
        System.out.println(a);
    }
}