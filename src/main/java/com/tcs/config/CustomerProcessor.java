package com.tcs.config;

import org.springframework.batch.item.ItemProcessor;

import com.tcs.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {

		/** filter logic
		if(item.getCountry().equalsIgnoreCase("India")) {
			return item;
		} */

		return item;
	}

}
