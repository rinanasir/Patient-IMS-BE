package com.vIntership.patientBE.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "patient_info")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long patientId;
    @Column(name = "patient_name", nullable = false)
    private String patientName;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "dob", nullable = false)
    private String dob;
    @Column(name = "phone_num", nullable = false)
    private String phone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "address", nullable = false)
    private String address;
//    @Column(name = "photo", nullable = false, length = 5000000)
//    private byte[] patientPhoto;

}


/*
• Patient Name
• Gender [Will be selected form a dropdown menu while adding a new patient]
• Age
• DOB [DOB will be selected form a date picker]
• Phone Number
• Email
• Address
• Photo
 */