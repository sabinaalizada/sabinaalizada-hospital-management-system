package org.project.doctorservice.enums;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE(1),
    INACTIVE(0);

    private final int value;

    Status(int value) {
        this.value = value;
    }
}
