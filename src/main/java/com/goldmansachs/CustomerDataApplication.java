package com.goldmansachs;

import com.goldmansachs.controller.CustomerDataController;
import com.goldmansachs.service.CustomerService;
import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.glassfish.jersey.internal.inject.Custom;

public class CustomerDataApplication extends Application<CustomerConfiguration> {

        public static void main(String[] args) throws Exception {
            new CustomerDataApplication().run("server","introduction-config.yml");
        }

        @Override
        public void run(CustomerConfiguration basicConfiguration, Environment environment) {
            int customerList = basicConfiguration.getCustomerlist();
            CustomerService customerService = new CustomerService();
            environment.jersey().register(new CustomerDataController(customerList,customerService));
        }

        @Override
        public void initialize(Bootstrap<CustomerConfiguration> bootstrap) {
            bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
            super.initialize(bootstrap);
        }
    }
