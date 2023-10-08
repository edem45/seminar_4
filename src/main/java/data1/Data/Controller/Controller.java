package data1.Data.Controller;

import data1.Data.Group;
import data1.Data.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {



    private static List<Group> stream = new ArrayList<>();

    @Override
    public String toString() {
        return "Controller{" +
                "stream=" + stream +
                '}';
    }

    public void addGroup (Group group){
        stream.add(group);
    }

    public List<Group> getStream() {
        return stream;
    }

    public static Group getGroupById(Integer groupId) {
        for (Group group : stream) {
            if (group.getGroupId() == groupId) {
                return group;
            }
        }
        System.out.println("");
        return null;
    }

    public void addStudent(Integer groupId,String name, String lastName, String dateOfBirth, int studentId){

        getGroupById(groupId).addStudent(new Student(name,lastName,dateOfBirth,studentId));

    }

    public void addTeacherToGroup (Integer groupId,String name, String lastName, String dateOfBirth, String discipline) {

        getGroupById(groupId).createTeacher(name,lastName,dateOfBirth,discipline);
    }
}





