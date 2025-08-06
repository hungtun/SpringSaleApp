/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.phh.hibernatedemo;

import com.phh.pojo.Category;
import com.phh.pojo.Product;
import com.phh.repositories.impl.CategoryRepositoryImpl;
import com.phh.repositories.impl.ProductRepositoryImpl;
import com.phh.repositories.impl.StatsReposityImple;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        ProductRepositoryImpl s = new ProductRepositoryImpl();
        CategoryRepositoryImpl s2 = new CategoryRepositoryImpl();
        StatsReposityImple s3 = new StatsReposityImple();
        
////        Map<String, String> params = new HashMap<>();
//////        params.put("kw","galaxy");
////        params.put("orderBy", "price");
////        params.put("page","1");
////        s.getProducts(params).forEach(p -> System.out.printf("%s - %.1f\n",p.getName(),p.getPrice()));
//        Product p = new Product();
//        p.setName("ABC");
//        p.setPrice(123l);
//        p.setCategoryId(s2.getCateById(1));
//        
//        s.addOrUpdate(p);
        s3.getRevenueByProduct().forEach(o -> System.out.printf("%d - %s: %d\n",o[0],o[1],o[2]));
    }
}
