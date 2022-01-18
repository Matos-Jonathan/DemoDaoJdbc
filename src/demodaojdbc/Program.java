/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodaojdbc;

import java.util.Date;
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
        
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
    
}
