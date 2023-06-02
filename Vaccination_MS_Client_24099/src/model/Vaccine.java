/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import com.toedter.calendar.JDateChooser;

import com.sun.xml.internal.ws.developer.Serialization;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;


/**
 *
 * @author Mugisha
 */

public class Vaccine implements Serializable{
    private int vaccine_id;
    
    private String vac_name;
    
    private String date;
  
 
    private List<Patient> patients;

    public Vaccine(int vaccine_id) {
        this.vaccine_id = vaccine_id;
    }

    public Vaccine() {
    }

    public Vaccine(int vaccine_id, String vac_name, String date, List<Patient> patient) {
        this.vaccine_id = vaccine_id;
        this.vac_name = vac_name;
        this.date = date;
        this.patients = patient;
    }

    public int getVaccine_id() {
        return vaccine_id;
    }

    public void setVaccine_id(int vaccine_id) {
        this.vaccine_id = vaccine_id;
    }

    public String getVac_name() {
        return vac_name;
    }

    public void setVac_name(String vac_name) {
        this.vac_name = vac_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

   
    
}
