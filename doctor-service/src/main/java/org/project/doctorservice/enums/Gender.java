package org.project.doctorservice.enums;

import lombok.Getter;

@Getter
public enum Gender {
    MALE("M"),
    FEMALE("F"),
    OTHER("O");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

}
