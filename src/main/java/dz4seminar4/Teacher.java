package dz4seminar4;


import java.util.Comparator;
public class Teacher extends User implements Comparable<Teacher> {

    private Long teacherId;

    public Teacher(String firstName, String secondName) {
        super(firstName, secondName);
    }


    public Teacher(String firstName, String secondName, String patronymic, Long teacherId) {
        super(firstName, secondName, patronymic);
        this.teacherId = teacherId;

    }


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String toString() {
        return "Teacher{" +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                "teacherId=" + teacherId + '}';
    }

    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}