package org.project.doctorservice.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.project.doctorservice.enums.Status;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class DoctorStatusConverter implements AttributeConverter<Status,Integer> {
    @Override
    public Integer convertToDatabaseColumn(Status status) {
        if (status == null){
            return null;
        }
        return status.getValue();
    }

    @Override
    public Status convertToEntityAttribute(Integer integer) {
        if (integer == null){
            return null;
        }
        return Stream.of(Status.values())
                .filter(status -> status.getValue() == integer)
                .findFirst().orElse(null);
    }
}
