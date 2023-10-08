package dz4seminar.Controller;

import dz4seminar.Data.Teacher;
import dz4seminar.View.TeacherView;
import dz4seminar.View.UserViewInterface;

public class TeacherController implements IUserController {

    private UserViewInterface userView = new TeacherView();


    @Override
    public void create(String firstName, String secondName) {
        Teacher newTeacher = new Teacher(firstName, secondName);
    }
}
