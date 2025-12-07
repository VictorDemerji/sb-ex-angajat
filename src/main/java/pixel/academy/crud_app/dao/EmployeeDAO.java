package pixel.academy.crud_app.dao;

import pixel.academy.crud_app.entity.Employee;

public interface EmployeeDAO {

    void save(Employee theEmployee);

    void paySalary(Employee theEmployee);

    void displayEmployeeInfo(Employee theEmployee);

    double bonusSalary(Employee theEmployee);

    Employee createEmployee(String firstName, String lastName,
                            int internship, String function, double salary);
}
