/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Vaccine;

/**
 *
 * @author Mugisha
 */
public interface VaccineInterface extends Remote{
    
    String saveVaccines(Vaccine vac) throws RemoteException;
    String updateVaccines(Vaccine vac) throws RemoteException;
    String deleteVaccines(Vaccine vac) throws RemoteException;
    List<Vaccine>retrieveVaccines()throws RemoteException;
    Vaccine searchbyId(Vaccine vac)throws RemoteException;
    boolean vaccineIsSaved(Vaccine vac) throws RemoteException;
}
