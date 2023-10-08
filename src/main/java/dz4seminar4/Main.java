package dz4seminar4;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Аnna", "Sidorova", "Valerievna", 2L);
        Teacher teacher2 = new Teacher("Anton", "Petrov", "Gergievich",1L);


        List<Teacher>  teacherList= new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        System.out.println(teacherList);

    }
}
