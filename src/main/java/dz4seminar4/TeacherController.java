package dz4seminar4;

public class TeacherController extends UserController {

    private TeacherViewInterface userView = new TeacherView();


    @Override
    public void create(String firstName, String secondName) {
        Teacher newTeacher = new Teacher(firstName, secondName);
    }
}