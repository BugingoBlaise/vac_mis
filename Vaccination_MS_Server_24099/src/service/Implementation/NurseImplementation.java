/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Implementation;

import dao.NurseDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Nurse;
import service.NurseInterface;

/**
 *
 * @author Mugisha
 */
public class NurseImplementation extends UnicastRemoteObject implements NurseInterface{
   
    
    public NurseImplementation() throws RemoteException {
    super();
    }
   
     NurseDao dao=new NurseDao();
   
    
    @Override
    public String saveNurse(Nurse nurse) throws RemoteException {
        
      
        try{
            
       return  dao.saveNurse(nurse);
       
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
        return "Error";
       
       
        
    }


    @Override
    public List<Nurse> retrieveNurses() throws RemoteException {
       
        try{
            return dao.retrieveNurses();
        
        }catch(Exception ex){
            
        ex.printStackTrace();
        }
        
        
        return null;
    }

    @Override
    public boolean authenticate(String username, String password) throws RemoteException {
    try{
   return dao.authenticate(username, password);
    }catch(Exception ex){
    ex.printStackTrace();
    }
    return false;
    }

    @Override
    public boolean NurseIsSaved(Nurse nurse) throws RemoteException {
        try{
            return dao.NurseIsSaved(nurse);
        }catch(Exception ex){
        ex.printStackTrace();
        }
    return false;
    }

  
    
}
