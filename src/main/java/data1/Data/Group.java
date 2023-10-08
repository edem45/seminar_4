package data1.Data;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Student> studentList;
    private Teacher teacherList;

    private Integer groupId;

    Student student = new Student();
    Teacher teacher = new Teacher();

    public Group(ArrayList<Student> studentList, Teacher teacher, Integer groupId){

        this.studentList = studentList;
        this.groupId = groupId;

    }

    @Override
    public String toString() {
        return "Group{" +
                "studentList=" + studentList +
                ", groupId=" + groupId +
                ", teacher=" + teacher +
                '}';
    }

    public void createStudent(String name, String lastName, String dateOfBirth, int studentId) {
        student.setStudentId(studentId);
        student.setName(name);
        student.setLastname(lastName);
        student.setDateOfBirth(dateOfBirth);

    }

    public void createTeacher(String name, String lastName, String dateOfBirth, String discipline) {
        teacher.setDiscipline(discipline);
        teacher.setName(name);
        teacher.setLastname(lastName);
        teacher.setDateOfBirth(dateOfBirth);
    }


    public Group() {

    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(Teacher teacherList) {
        this.teacherList = teacherList;
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
