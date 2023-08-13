package com.hospital.patient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data // go and do getters and setters
@AllArgsConstructor // create constructor with all the fields
@NoArgsConstructor
@Builder // design pattern -> go check IncController
public class Inc {
    private UUID id;
    private String patientName;
    private Integer incNo;
}
