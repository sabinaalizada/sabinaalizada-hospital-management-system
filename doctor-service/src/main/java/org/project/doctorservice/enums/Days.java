package org.project.doctorservice.enums;

public enum Days {
    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday"),
    Sunday("Sunday");

    private final String days;

    Days(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }
}
