package com.hospital.patient.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PatientModel {

//    List<String> names = new ArrayList<>();
    List<Patient> patientNames = new ArrayList<>();

    PatientModel(){
//        names.add("Mohamed");
//        names.add("Amer");
//        names.add("Rami");
        patientNames.add(new Patient("Amer",28));
        patientNames.add(new Patient("Rami",26));
        patientNames.add(new Patient("Mohamed",23));

    }
//    public List<String> getNames(){
//        return names;
//    }
    public List<Patient> getPatients(){
        return patientNames;
    }
}
