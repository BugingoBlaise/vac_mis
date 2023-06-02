/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
//import java.rmi.server.UnicastRemoteObject;
import service.Implementation.NurseImplementation;
import service.Implementation.PatientImplementation;
import service.Implementation.VaccineImplementation;

/**
 *
 * @author Mugisha
 */
public class Server {
    
    private final VaccineImplementation vacImpl;
    private final NurseImplementation nurseImpl;
    private final PatientImplementation patImpl;
    
    public Server() throws RemoteException{
        this.vacImpl=new VaccineImplementation();
        this.nurseImpl=new NurseImplementation();
        this.patImpl=new PatientImplementation();
    }
    public static void main(String[] args) {
        try{
        
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        Registry registry=LocateRegistry.createRegistry(6000);
        registry.rebind("vaccine", new VaccineImplementation());
        registry.rebind("nurse", new NurseImplementation());
        registry.rebind("patient", new PatientImplementation());
       
        
        System.out.println("Server is running on port 6000");
        
        }catch(Exception ex){
        ex.printStackTrace();
        }
    }
    
    
}
