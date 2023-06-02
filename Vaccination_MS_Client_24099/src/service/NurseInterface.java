/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Nurse;

/**
 *
 * @author Mugisha
 */
public interface NurseInterface extends Remote {
    
    String saveNurse(Nurse nurse) throws RemoteException ;
    List<Nurse>retrieveNurses() throws RemoteException;
    boolean authenticate(String username, String password)throws RemoteException;
    boolean NurseIsSaved(Nurse nurse) throws RemoteException;
}
