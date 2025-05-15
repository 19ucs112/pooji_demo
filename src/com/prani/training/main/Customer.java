package com.prani.training.main;


import java.util.HashMap;
import java.util.Map;

public class Customer {
    String customerId;
    String customerName;
    String mobile;

    public static Map<String, Customer> map;

    static {
        map = new HashMap<>();
    }

    public Customer(String customerId, String customerName, String mobile) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobile = mobile;
    }

    public boolean checkCustomer(String id) {
        checkCustomerExistency(id);
        return map.containsKey(id);
    }

    public static boolean checkCustomerExistency(String id) {
        return map.containsKey(id);
    }


}
