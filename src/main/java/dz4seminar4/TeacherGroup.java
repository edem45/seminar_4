package dz4seminar4;
import java.util.Iterator;
import java.util.List;
public class TeacherGroup implements Iterable<Teacher> {

    private List<Teacher> teachers;

    public TeacherGroup (List<Teacher> teachers){
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teachers=" + teachers +
                '}';
    }
        public void createTeacher (User user){
        teachers.add((Teacher) user);
        }

    @Override
    public TeacherGroupIterator iterator() {
        return new TeacherGroupIterator(this);
    }
}

