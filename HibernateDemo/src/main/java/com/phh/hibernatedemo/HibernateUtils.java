/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phh.hibernatedemo;

import com.phh.pojo.Category;
import com.phh.pojo.Product;
import org.hibernate.SessionFactory;
import java.util.Properties;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

/**
 *
 * @author admin
 */
public class HibernateUtils {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();
        Properties pros = new Properties();
        pros.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        pros.put(Environment.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
        pros.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost/saledb");
        pros.put(Environment.JAKARTA_JDBC_USER, "root");
        pros.put(Environment.JAKARTA_JDBC_PASSWORD, "root");
        pros.put(Environment.SHOW_SQL, "true");
        conf.setProperties(pros);

        conf.addAnnotatedClass(com.phh.pojo.Comment.class);
        conf.addAnnotatedClass(com.phh.pojo.Category.class);
        conf.addAnnotatedClass(com.phh.pojo.ProdTag.class);
        conf.addAnnotatedClass(com.phh.pojo.OrderDetail.class);
        conf.addAnnotatedClass(com.phh.pojo.User.class);
        conf.addAnnotatedClass(com.phh.pojo.Tag.class);
        conf.addAnnotatedClass(com.phh.pojo.SaleOrder.class);
        conf.addAnnotatedClass(com.phh.pojo.Product.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

        FACTORY = conf.buildSessionFactory(serviceRegistry);
    }

    /**
     * @return the FACTORY
     */
    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
}
