package org.project.doctorservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.project.doctorservice.converter.DoctorGenderConverter;
import org.project.doctorservice.converter.DoctorStatusConverter;
import org.project.doctorservice.enums.Gender;
import org.project.doctorservice.enums.Status;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "doctors")
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false,length = 50)
    private String name;

    @Column(nullable = false,length = 70)
    private String email;

    @Column(length = 11, nullable = false)
    private String phone;

    @Convert(converter = DoctorGenderConverter.class)
    @Column(length = 2, nullable = false)
    private Gender gender;

    @Column(nullable = false)
    private LocalDate birthday;

    @Column(length = 100, nullable = false)
    private String specialty;

    @Column(length = 100, nullable = false)
    private String department;

    @Column(length = 50, nullable = false)
    private byte experienceYears;

    @Column(length = 100, nullable = false)
    private String hospitalName;

    @Column(length = 100, nullable = false)
    private String hospitalAddress;

    @Column(length = 10000, nullable = false)
    private BigDecimal salary;

    @Column(length = 1000, nullable = false)
    private BigDecimal consultationFee;

    @Convert(converter = DoctorStatusConverter.class)
    @Column(length = 1, nullable = false)
    private Status status;

    @Column(length = 100)
    private String address;

    @Column(length = 100)
    private String photoUrl;

    @Column(length = 200)
    private String bio;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @OneToOne(mappedBy = "doctors",cascade = CascadeType.ALL)
    private DoctorSchedule doctorSchedule;

    @OneToMany(mappedBy = "doctors")
    private Set<DoctorExperience> doctorExperiences;
}
