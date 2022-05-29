package com.goldmansachs.controller;

import com.goldmansachs.response.Customer;
import com.goldmansachs.service.CustomerService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerDataController {

    private final int defaultSize;

    private CustomerService customerService;

    public CustomerDataController(int defaultSize,CustomerService customerService) {
        this.defaultSize = defaultSize;
        this.customerService = customerService;
    }

    @GET
    public Response getCustomers() {
        return Response.ok(customerService.getCustomer()).build();
    }

    @GET
    @Path("/{id}")
    public Response getCustomer(@PathParam("id") Long id) {
        return Response.ok(customerService.getCustomer(id)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCustomer(Customer customer) {
        System.out.println("Customer" + customer);
        customerService.addCustomer(customer.getCustomerId(),customer);
        return Response.ok("customer added successfully").build();
    }

    @PUT
    @Path("/{id}")
    public Response updateCustomer(@PathParam("id") Long id) {
        customerService.updateCustomer(id);
        return Response.ok("customer update successfully").build();
    }

    @DELETE
    @Path("/{id}")
    public Response removeCustomer(@PathParam("id") Long id) {
        customerService.removeCustomer(id);
        return Response.ok("customer deleted successfully").build();
    }


}

