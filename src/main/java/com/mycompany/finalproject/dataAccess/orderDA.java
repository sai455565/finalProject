/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject.dataAccess;

import com.mycompany.finalproject.bean.customer;
import com.mycompany.finalproject.bean.order;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author saitejadivi
 */
public class orderDA {
    List<order> ordersList = new ArrayList<order>();
    
     public  List<order> customerOrder() {
                
            ordersList.add(new order(1,101,"12/01/2020"));
            ordersList.add(new order(2,102,"09/31/2020"));
            ordersList.add(new order(3,103,"05/25/2020"));
            return ordersList;
        }
    
     public  List<order> getAllOrders() {
            return ordersList;
        }
     
}
