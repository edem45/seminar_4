package dz4seminar.View;

import dz4seminar.Data.Teacher;

import java.util.List;

public class TeacherView implements UserViewInterface<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> listT) {
        System.out.println("Список учителей");
        for (Teacher teacher : listT) {
            System.out.println(teacher.getTeacherId());
        }
    }
}
