/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject.dataAccess;

import com.mycompany.finalproject.bean.order;
import com.mycompany.finalproject.bean.orderItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saitejadivi
 */
public class orderItemDA {
    List<orderItem> orderItemList = new ArrayList<orderItem>();
    
     public  List<orderItem> orderItems() {
                
            orderItemList.add(new orderItem(1,1,22,"taco",3,2500));
            orderItemList.add(new orderItem(2,2,33,"airpods",4,1899));
            orderItemList.add(new orderItem(3,3,44,"mac book",5,5000));
            return orderItemList;
        }
    
     public  List<orderItem> getAllOrdersItems() {
            return orderItemList;
        }
     
}
