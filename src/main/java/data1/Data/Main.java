package data1.Data;

import data1.Data.View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        View view = new View();
        Student student = new Student("ivan1", "ivanow1",
                "02/02/1997", 10);
        Student student2 = new Student("ivan2", "ivanow2",
                "02/02/1997", 12);
        Student student3 = new Student("ivan3", "ivanow3",
                "02/02/1997", 12);
        view.createGroup(new Group(new ArrayList<>(List.of(student, student2, student3)),
                new Teacher("ivan5", "ivanow5",
                "02/02/1997", "математика"), 10));

        view.printInfo();
        view.createStudent(10,"ivan4", "ivanow4",
                "02/02/1997", 13);

    }
}
