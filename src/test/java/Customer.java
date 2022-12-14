package com.containers.customer.domain;

public class Customer {


    . . .


    public boolean isActiveCustomer(String customerId)
    {

        List<Phone> hasPhones = retrieveCustomerPhones(customerId);

        List<Order> hasOrders = retrieveAllOrdersForCustomer(customerId);

        List<String> loyaltyMemberships = retrieveAllLoyaltyAccounts();

        if (hasPhones.size() > 0
            || hasOrders.size() > 0
            || loyaltyMemberships.contains(customerId)) {
        return true;
        } else
return false;
        }
    }

}