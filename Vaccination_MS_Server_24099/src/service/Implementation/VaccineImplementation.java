/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Implementation;

import dao.VaccineDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Vaccine;
import service.VaccineInterface;

/**
 *
 * @author Mugisha
 */
public class VaccineImplementation extends UnicastRemoteObject implements VaccineInterface{

    public VaccineImplementation() throws RemoteException{
    super();
    }
    
    VaccineDao dao=new VaccineDao();
    
    
    @Override
    public String saveVaccines(Vaccine vac) throws RemoteException {
    try{
    
        dao.saveVaccines(vac);
        return "DATA SAVED";
    }catch(Exception ex){
    ex.printStackTrace();
    }
        
       return "Error";
     
    }

    @Override
    public String updateVaccines(Vaccine vac) throws RemoteException {
       try{
        
           return dao.updateVaccines(vac);
                
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return "ERROR";
    }

    @Override
    public String deleteVaccines(Vaccine vac) throws RemoteException {
        try{
        return dao.deleteVaccines(vac);
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return "ERROR";
    }

    @Override
    public List<Vaccine> retrieveVaccines() throws RemoteException {
       try{
        return dao.retrieveVaccines();
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Vaccine searchbyId(Vaccine vac) throws RemoteException {
        try{
        return dao.searchbyId(vac);
        }catch(Exception ex){
        ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean vaccineIsSaved(Vaccine vac) throws RemoteException {
    try{
    return dao.vaccineIsSaved(vac);
    }catch(Exception ex){
    ex.printStackTrace();
    }
        
        return false;
    }
    
}
