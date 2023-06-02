/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//import com.mysql.cj.Session;
import java.util.List;
import org.hibernate.*;
import model.Nurse;

/**
 *
 * @author Mugisha
 */
public class NurseDao {
    
    public String saveNurse(Nurse nurse){
    
      try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.save(nurse);
            tr.commit();
            ss.close();
           
            return "SAVED successfully";
          
      }catch(Exception ex){
      ex.printStackTrace();
      }  
        return "Connection lost";
    }
    
    
    public List<Nurse>retrieveNurses(){
    
        try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            List<Nurse> nurselist=ss.createQuery("SELECT nur FROM Nurse nur").list();
            return nurselist;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }
    
    public boolean NurseIsSaved(Nurse nurse){
        try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Nurse search = (Nurse)ss.get(Nurse.class, nurse.getId());
            return search!=null;
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return false;
    }
    
    public boolean authenticate(String username, String password) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query querry=(Query)ss.createQuery("SELECT nur FROM Nurse nur WHERE nur.username=:username AND nur.password=:password");
        querry.setParameter("username", username);
        querry.setParameter("password", password);

        Nurse nurse = (Nurse) querry.uniqueResult();

        ss.close();

        return nurse != null; // Return true if nurse object is not null
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false; // Return false for any exception
}

/*
public boolean signup(Nurse nurse){

   Session ss=HibernateUtil.getSessionFactory().openSession();
    Transaction tr=ss.beginTransaction();
    ss.save(nurse);
  tr.commit();
  ss.close();
  return true;
 

}

public boolean login(String username,String password){

 Session ss=HibernateUtil.getSessionFactory().openSession();
  Transaction tr=ss.beginTransaction();
   Query querry=(Query)ss.createQuery("FROM Nurse nur WHERE nur.username=:username AND nur.password=:password");
   querry.setParameter("username",username);
   querry.setParameter("password",password);
   Nurse nur=(Nurse) querry.uniqueResult();
   ss.getTransaction().commit();
   
 return nur!=null;
}
    */
    
    
}
