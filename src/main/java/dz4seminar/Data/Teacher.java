package dz4seminar.Data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparable<Teacher> {

    private Long teacherId;

    public Teacher(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public Teacher(String firstName, String secondName, Long teacherId) {
        super(firstName, secondName);
        this.teacherId = teacherId;
    }

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                "teacherId=" + teacherId + '}';
    }

    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}