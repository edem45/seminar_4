package dz4seminar4;

import java.util.List;
public class TeacherView implements TeacherViewInterface<Teacher> {



    @Override
    public void sendOnConsole(List<Teacher> listT) {
        System.out.println("Список учителей");
        for (Teacher teacher : listT) {
            System.out.println(teacher.getTeacherId());
        }
    }
}
