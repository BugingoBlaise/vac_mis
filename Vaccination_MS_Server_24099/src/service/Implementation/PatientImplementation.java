/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Implementation;

import dao.PatientDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Patient;
import service.PatientInterface;

/**
 *
 * @author Mugisha
 */
public class PatientImplementation extends UnicastRemoteObject implements PatientInterface{
  
   

    public PatientImplementation() throws RemoteException{
        super();
    }
     PatientDao dao=new PatientDao();
     
    @Override
    public String savePatient(Patient pat) throws RemoteException {
       try{
       return dao.savePatients(pat);
       }catch(Exception ex){
       ex.printStackTrace();
       }
   return "Connection Errors";
    }

    @Override
    public String updatePatient(Patient pat) throws RemoteException {
    try{
       return dao.updatePatients(pat);
               
        }catch(Exception ex){
       ex.printStackTrace();
       }
   return "Connection Errors"; 
    }

    @Override
    public String deletePatient(Patient pat) throws RemoteException {
     try{
     
         return dao.deletePatients(pat);
       
     }catch(Exception ex){
       ex.printStackTrace();
       }
   return "Connection Errors";    
    
    }

    @Override
    public List<Patient> retrievePatient() throws RemoteException {
        try{
     
            return dao.retrievePatients();
       
        }catch(Exception ex){
       
            ex.printStackTrace();
     
        }
   return null;
    }

    @Override
    public Patient searchById(Patient pat) throws RemoteException {
         try{
       
             return dao.searchById(pat);
             
         }catch(Exception ex){
         ex.printStackTrace();
         }
       return null;
    }

    @Override
    public boolean isSavedId(Patient pat) throws RemoteException {
    try{
    return dao.isSavedId(pat);
    }catch(Exception ex){
    ex.printStackTrace();
    }    
    return false;
    }

}
