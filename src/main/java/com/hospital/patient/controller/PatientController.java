package com.hospital.patient.controller;

import com.hospital.patient.model.Patient;
import com.hospital.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired // make the dependency injection design pattern.
    private PatientService patientService; //patientService called bean

//    @GetMapping("/print-name")
//    public ResponseEntity printPatientName(){
//        return ResponseEntity.ok(patientService.printName("Rami"));
//    }
    //http://localhost:8090/patient/print-name?name=Rami
    //http://localhost:8090/patient/print-name?name=Rami&a=30
    @GetMapping("/print-name") // ↓ ↑   enable postman
    public ResponseEntity printPatientName(@RequestParam String name,@RequestParam("a") Integer age){
        return ResponseEntity.ok(patientService.printName(name,age));
    }
    @GetMapping("/print-all-patients")
    public ResponseEntity getPatients(){
        return ResponseEntity.ok(patientService.getPatients());
    }
    @PostMapping("/save")
    public ResponseEntity savePatient(@RequestBody Patient patient){
        return ResponseEntity.ok(patient);
    }
    public void helloworld(){

    }
//    @GetMapping("/print-name")
//    public String printPatientName(){
//        return patientService.printName("Rami");
//    }
}
