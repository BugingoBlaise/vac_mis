/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Vaccine;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Mugisha
 */
public class VaccineDao {
    
     public void saveVaccines(Vaccine vac){
    
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.save(vac);
        tr.commit();
        ss.close();
        
       
    
    
       
    }
    
     public String updateVaccines(Vaccine vac){
    try{
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.update(vac);
        tr.commit();
        ss.close();
        return "VACCINE UPDATED SUCCESSFULLY";
    
    }catch(Exception ex){
    ex.printStackTrace();
    }
        
        return "Connection Lost";
    }
    
    public String deleteVaccines(Vaccine vac){
    try{
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.delete(vac);
        tr.commit();
        ss.close();
       
        return "VACCINE DELETED SUCCESSFULLY";
    
    }catch(Exception ex){
    ex.printStackTrace();
    }
        
        return "Connection Lost";
    }
    
    public List<Vaccine>retrieveVaccines(){
    
        try{
        
            Session ss=HibernateUtil.getSessionFactory().openSession();
            List<Vaccine> vacientlist=ss.createQuery("SELECT vac FROM Vaccine vac").list();
            
            return vacientlist;
        
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
        
        return null;
    }
    
    public Vaccine searchbyId(Vaccine vac){
    
        try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Vaccine search=(Vaccine)ss.get(Vaccine.class, vac.getVaccine_id());
            return search;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
    return null;
    }
    public boolean vaccineIsSaved(Vaccine vac){
    
        try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Vaccine search=(Vaccine)ss.get(Vaccine.class, vac.getVaccine_id());
            return search!=null;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
    return false;
    }
    
}
