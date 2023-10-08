package dz4seminar.Controller;

import dz4seminar.Data.Student;
import dz4seminar.View.StudentView;
import dz4seminar.View.UserViewInterface;

public class StudentController implements IUserController {

    private UserViewInterface userView = new StudentView();

    @Override
    public void create(String firstName, String secondName) {
        Student newStudent = new Student(firstName, secondName);
    }
}