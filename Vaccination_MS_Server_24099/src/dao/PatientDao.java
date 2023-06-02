/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Patient;
import org.hibernate.*;

/**
 *
 * @author Mugisha
 */
public class PatientDao {
    
    
    public String savePatients(Patient pat){
    try{
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.save(pat);
        tr.commit();
        ss.close();
        return "PATIENT SAVED SUCCESSFULLY";
    
    }catch(Exception ex){
    ex.printStackTrace();
    }
        
        return "Connection Lost";
    }
    
     public String updatePatients(Patient pat){
    try{
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.update(pat);
        tr.commit();
        ss.close();
        return "PATIENT UPDATED SUCCESSFULLY";
    
    }catch(Exception ex){
    ex.printStackTrace();
    }
        
        return "Connection Lost";
    }
    
    public String deletePatients(Patient pat){
    try{
       
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.delete(pat);
        tr.commit();
        ss.close();
       
        return "PATIENT DELETED SUCCESSFULLY";
    
    }catch(Exception ex){
    ex.printStackTrace();
    }
        
        return "Connection Lost";
    }
    
    public List<Patient>retrievePatients(){
    
        try{
        
            Session ss=HibernateUtil.getSessionFactory().openSession();
            List<Patient> patientlist=ss.createQuery("SELECT pat FROM Patient pat").list();
            
            return patientlist;
        
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
        
        return null;
    }
    
    public Patient searchById(Patient pat) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Patient search = (Patient) session.get(Patient.class, pat.getPatient_id());
        return search;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    
    return null;
}
    
     public boolean isSavedId(Patient pat) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Patient search = (Patient) session.get(Patient.class, pat.getPatient_id());
        return search!=null;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    
    return false;
}
 
}
