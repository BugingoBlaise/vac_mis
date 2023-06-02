/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author Mugisha
 */
public class Patient implements Serializable{
 private   int patient_id;
 private   String fname;
 private   String lname;
 private   String sex;
 private   String age;
 private   String vaccine;
 private   String dose;
 private   String date;
 private Vaccine vac;

    public Patient(Vaccine vac) {
        this.vac = vac;
    }

    public Patient(Integer patient_id) {
        this.patient_id = patient_id;
    }

    public Patient() {
    }

    public Patient(int patient_id, String fname, String lname, String sex, String age, String vaccine, String dose, String date, Vaccine vac) {
        this.patient_id = patient_id;
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
        this.age = age;
        this.vaccine = vaccine;
        this.dose = dose;
        this.date = date;
        this.vac = vac;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Vaccine getVac() {
        return vac;
    }

    public void setVac(Vaccine vac) {
        this.vac = vac;
    }
    
    
    
    
    
    
}
