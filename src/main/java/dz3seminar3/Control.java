package dz3seminar3;

import java.util.List;

public class Control {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        studentGroupService.removeStudentByFIO(lastName,secondName,firstName);
    }

    public List<Student> getSortedStudentList(){
        studentGroupService.getSortedStudentList();
        return null;
    }

    public List<StudentGroup> getSortedStudentGroupList() {
        streamService.getSortedStudentGroupList();
        return null;
    }


}