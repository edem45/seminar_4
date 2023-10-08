package dz4seminar4;

public class Student extends User implements Comparable<Student>{

    private Long studentId;

    public Student (String firstName, String secondName, String patronymic, Long studentId){
        super(firstName,secondName, patronymic);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }


    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
