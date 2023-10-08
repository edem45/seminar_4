package dz4seminar.View;

import dz4seminar.Data.Student;
import dz4seminar.Data.StudentGroup;
import dz4seminar.Data.User;

import java.util.List;
import java.util.logging.Logger;





public class UserView {

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}