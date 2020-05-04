package com.mycompany.finalproject.dataAccess;

import com.mycompany.finalproject.bean.customer;
import com.mycompany.finalproject.bean.order;
import com.mycompany.finalproject.bean.orderItem;
import com.mycompany.finalproject.bean.product;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author saitejadabala
 */
public class customerDA {
     List<customer> customerList = new ArrayList<customer>();
     
     
     
     
       
        public  List<customer> createCustomer() {
            customerList.add(new customer(101, "satya", "adabala", "9848979329"));
            customerList.add(new customer(102, "sai", "tej", "97973293"));
            customerList.add(new customer(103, "abhi", "ram", "620878382"));
            return customerList;
        }
        
        public  List<customer> getAllCustomers() {
            return customerList;
        }

   
       
}
