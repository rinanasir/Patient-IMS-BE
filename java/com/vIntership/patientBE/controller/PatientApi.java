package com.vIntership.patientBE.controller;

import com.vIntership.patientBE.model.Patient;
import com.vIntership.patientBE.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/home")
public class PatientApi {

    @Autowired
    private PatientService patientService;

    // POST: Add new Patient
    @PostMapping(path = "/addPatient")
    public @ResponseBody void addNewPatient(@RequestBody Patient patient){
        patientService.addNewPatient(patient);
    }

    // GET: All Patients
    @GetMapping(path = "/patients")
    public List<Patient> findAllPatients(){
        return patientService.findAllPatients();
    }

    // GET: Patient By ID
    @GetMapping(path = "/patients/{id}")
    public Patient findPatientById(@PathVariable Long id){
        return (Patient) patientService.findPatientById(id);
    }

    // PUT: Update Patient Information By ID
    @PutMapping(path = "/editPatient")
    public Patient updatePatientById(@RequestBody Patient patient){
        return (Patient) patientService.updatePatientById(patient);
    }

    @DeleteMapping(path = "/deletePatient/{id}")
    public void deletePatientById(@PathVariable Long id){
        patientService.deletePatientById(id);
    }

}
