package dz4seminar.View;

import dz4seminar.Data.Student;

import java.util.List;

public class StudentView implements UserViewInterface<Student>{

    @Override
    public void sendOnConsole(List<Student> listT) {
        System.out.println("Список студентов");
        for(Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}
