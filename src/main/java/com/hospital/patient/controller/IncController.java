package com.hospital.patient.controller;

import com.hospital.patient.model.Inc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/inc")
public class IncController {
    @GetMapping("/getPatientInc")
    public Inc getPatientInc(){
        Inc c = new Inc();
        // - > @Builder
//        c.setId(UUID.randomUUID());
//        c.setIncNo(12300);
//        c.setPatientName("Jake Hour");
//        return c;
        return Inc.builder().id(UUID.randomUUID()).incNo(12300).patientName("Jack Hour").build();// or put it on c and return that
    }
}

//output:
//        {
//            "id": "1fb1de47-9878-4f03-9a8b-d28c7fae69ed",
//                "patientName": "Jake Hour",
//                "incNo": 12300
//        }