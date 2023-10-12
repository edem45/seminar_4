package seminar5;

import java.util.ArrayList;
import java.util.List;

public class Employeegroup {

    private List<Employee> employeeList = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        // Сохранение данных сотрудника в базу данных
        employeeList.add(employee);
    }
}
