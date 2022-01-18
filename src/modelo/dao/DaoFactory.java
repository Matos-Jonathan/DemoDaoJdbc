/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import db.DB;
import modelo.dao.Impl.SellerDaoJDBC;

/**
 *
 * @author jonathan
 */
public class DaoFactory {
    
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
