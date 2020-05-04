/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myconpany.finalproject.mainClass;

import com.mycompany.finalproject.bean.customer;
import com.mycompany.finalproject.bean.order;
import com.mycompany.finalproject.bean.orderItem;
import com.mycompany.finalproject.bean.product;
import com.mycompany.finalproject.dataAccess.customerDA;
import com.mycompany.finalproject.dataAccess.orderDA;
import com.mycompany.finalproject.dataAccess.orderItemDA;
import com.mycompany.finalproject.dataAccess.productDA;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saitejadabala
 */
public class orderSystem {
    
   public static void main(String[] args){
   customerDA cda   = new customerDA();
   orderDA oda      = new orderDA();
   orderItemDA oida = new orderItemDA();
   productDA   pda  = new productDA();
   
   cda.createCustomer();
   oda.customerOrder();
   oida.orderItems();
   pda.products();
   
   
   //read everything from DB
   System.out.println("Reading customers");
       List<customer> customerDA = cda.getAllCustomers();
       for(customer dbCustomer : customerDA){
           System.out.println(dbCustomer);
       }
       
   System.out.println("\nReading Orders");
       List<order> orderDA = oda.getAllOrders();
       for(order dbOrder : orderDA){
           System.out.println(dbOrder);
       } 
       
   System.out.println("\nReading Orders Items");
       List<orderItem> orderItemDA = oida.getAllOrdersItems();
       for(orderItem dbOrderItm : orderItemDA){
           System.out.println(dbOrderItm);
       }     
       
   System.out.println("\nReading Products");
       List<product> productDA = pda.getAllProducts();
       for(product dbProduct : productDA){
           System.out.println(dbProduct);
       }     
      
    
   }
}
