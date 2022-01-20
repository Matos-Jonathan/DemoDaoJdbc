/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodaojdbc;

import java.util.Date;
import java.util.List;
import modelo.dao.DaoFactory;
import modelo.dao.SellerDao;
import modelo.entidades.Department;
import modelo.entidades.Seller;

/**
 *
 * @author jonathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        
        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }
    }
    
}
