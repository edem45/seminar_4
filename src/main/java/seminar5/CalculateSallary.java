package seminar5;

public class CalculateSallary {

    Employee employee = new Employee();
    public void calculateSalary(Integer hour) {

        employee.setSalary(employee.getSalary()* hour);

    }
}
