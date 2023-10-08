package data1.Data.View;

import data1.Data.Controller.Controller;
import data1.Data.Group;

public class View {

    Controller controller = new Controller();


    public void createGroup (Group group) {
      controller.addGroup(group);

    }

    public void  createStudent (Integer groupId,String name, String lastName,
                                String dateOfBirth, int studentId){
        controller.addStudent(groupId,name,lastName,dateOfBirth,studentId);
    }

    public void printInfo(){

        System.out.println(controller);
    }
}
