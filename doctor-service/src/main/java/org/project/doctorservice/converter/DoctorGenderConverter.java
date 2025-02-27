package org.project.doctorservice.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.project.doctorservice.enums.Gender;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class DoctorGenderConverter implements AttributeConverter<Gender,String> {
    @Override
    public String convertToDatabaseColumn(Gender gender) {
        if (gender == null) {
            return null;
        }
        return gender.getGender();
    }

    @Override
    public Gender convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }

        return Stream.of(Gender.values())
                .filter(g -> g.getGender().equals(s))
                .findFirst().orElse(null);
    }
}
