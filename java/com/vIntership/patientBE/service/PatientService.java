package com.vIntership.patientBE.service;

import com.vIntership.patientBE.model.Patient;
import com.vIntership.patientBE.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void addNewPatient(Patient patient) {
        patientRepository.save(patient);
    }

    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    public Object findPatientById(Long id) {
        return patientRepository.findById(id).orElseThrow();
    }

    public Object updatePatientById(Patient patient) {
        return patientRepository.save(patient);
    }

    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }

}
