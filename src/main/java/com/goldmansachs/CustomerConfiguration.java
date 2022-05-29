package com.goldmansachs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSourceFactory;
import io.dropwizard.Configuration;

import javax.sql.DataSource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class CustomerConfiguration extends Configuration {

    @NotNull
    private final int customerlist;

    @JsonCreator
    public  CustomerConfiguration(@JsonProperty("customerlist") int customerlist) {
        this.customerlist = customerlist;
    }

    public int getCustomerlist() {
        return customerlist;
    }

}
