/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject.dataAccess;

import com.mycompany.finalproject.bean.orderItem;
import com.mycompany.finalproject.bean.product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saitejadivi
 */
public class productDA {
    List<product> productList = new ArrayList<product>();
    
    public  List<product> products() {
                
            productList.add(new product(22,"secure item",2,2500));
            productList.add(new product(33,"handle with care",3,1899));
            productList.add(new product(44,"handle with care",4,5000));
            return productList;
        }
    
    public  List<product> getAllProducts() {
            return productList;
        }
}
