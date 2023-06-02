/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Patient;

/**
 *
 * @author Mugisha
 */
public interface PatientInterface extends Remote{
    
      String savePatient(Patient pat) throws RemoteException;
      String updatePatient(Patient pat) throws RemoteException;
      String deletePatient(Patient pat) throws RemoteException;
      List<Patient>retrievePatient() throws RemoteException;
      Patient searchById(Patient pat) throws RemoteException;
      boolean isSavedId(Patient pat) throws RemoteException;
}
