package com.goldmansachs.service;

import com.goldmansachs.repository.CustomerDataRepo;
import com.goldmansachs.response.Address;
import com.goldmansachs.response.Customer;

import java.util.List;

public class CustomerService {



    public List<Customer> getCustomer() {
        return CustomerDataRepo.getCustomers();
    }

    public Customer getCustomer(Long id){
        return CustomerDataRepo.getCustomer(id);
    }

    public static void addCustomer(Long id, Customer customer){
        CustomerDataRepo.updateCustomer(id, customer);
    }

    public static void updateCustomer(Long id){
        Customer customer = CustomerDataRepo.getCustomer(id);
        CustomerDataRepo.updateCustomer(id, customer);
    }

    public static void removeCustomer(Long id){
        CustomerDataRepo.removeCustomer(id);
    }

}
