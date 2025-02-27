package org.project.doctorservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.project.doctorservice.enums.Days;

import java.time.LocalTime;
import java.util.UUID;

@Entity
@Data
public class DoctorSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "doctor_id",referencedColumnName = "id" , nullable = false)
    private Doctor doctor;

    private LocalTime startTime;

    private LocalTime endTime;

    private Days availableDays;

}
