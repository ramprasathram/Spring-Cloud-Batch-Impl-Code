package com.tech.spring.batch.config;

import com.tech.spring.batch.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.*;


public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public Customer process(Customer customer) throws Exception {
        log.info("CustomerProcessor:process");
        return customer;
        /*if(customer.getCountry().equals("Russia")) {
            return customer;
        }else{
            return null;
        }*/
    }
}
