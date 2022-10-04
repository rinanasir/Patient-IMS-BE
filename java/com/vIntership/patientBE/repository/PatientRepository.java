package com.vIntership.patientBE.repository;

import com.vIntership.patientBE.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
