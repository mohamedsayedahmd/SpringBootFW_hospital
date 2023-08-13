package com.hospital.patient.service;

import com.hospital.patient.model.Patient;
import com.hospital.patient.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientModel patientModel;

    public Patient printName(String name,Integer age){
        return patientModel.getPatients()
                .stream()
                .filter(i->{
                    return i.getName().equals(name) || i.getAge().equals(age);
                })
                .findAny()
                .orElse(new Patient()); //if you dont find
        // in order to display that as JSON
    }// here I got the name from the DB

    public List<Patient> getPatients(){
//        ArrayList<Patient> list = new ArrayList<>();
//        patientModel.getNames()
//                .stream()
//                .forEach(pname -> list.add(new Patient(pname)));
        return this.patientModel.getPatients();
    }
    }
