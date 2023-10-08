package dz4seminar4;
import java.util.List;
public interface TeacherViewInterface<T extends Teacher> {

    public void sendOnConsole(List<T> listT);
}
