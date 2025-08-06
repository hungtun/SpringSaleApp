/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phh.repositories.impl;

import com.phh.hibernatedemo.HibernateUtils;
import com.phh.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class CategoryRepositoryImpl {
    public List<Category> getCategories(){
        try(Session s = HibernateUtils.getFACTORY().openSession()){
            Query q = s.createQuery("FROM Category", Category.class);
            return q.getResultList();
        }
    }
    
    public Category getCateById(int id){
        try(Session s = HibernateUtils.getFACTORY().openSession()){
            return s.find(Category.class, id);
        }
    }
    
}
