package pixel.academy.crud_app.dao;

import pixel.academy.crud_app.entity.Employee;

public interface EmployeeDAO {
    void paySalary(Employee employee);
    void  displayEmployeeInfo(Employee employee);
    double bonusSalary(Employee employee);
}
