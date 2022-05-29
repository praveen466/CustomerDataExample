package com.goldmansachs.repository;

import com.goldmansachs.response.Address;
import com.goldmansachs.response.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomerDataRepo {

    public static HashMap<Long, Customer> customers = new HashMap<>();
    static{
        Address address1 = new Address("H.NO:21","1st line","bangalore","karnataka",560037,"IND");
        Address address2 = new Address("H.NO:21","1st line","bangalore","karnataka",560037,"IND");
        Address address3 = new Address("H.NO:21","1st line","bangalore","karnataka",560037,"IND");

        customers.put(1001L, new Customer( "Lokesh", 1001,123456789, address1));
        customers.put(1002L, new Customer( "John", 1002,988762124, address2));
        customers.put(1003L, new Customer( "Melcum",1003, 1239001233, address3));
    }

    public static List<Customer> getCustomers(){
        return new ArrayList<Customer>(customers.values());
    }

    public static Customer getCustomer(Long id){
        return customers.get(id);
    }

    public static void updateCustomer(Long id, Customer customer){
        customers.put(id, customer);
    }

    public static void removeCustomer(Long id){
        customers.remove(id);
    }
}
