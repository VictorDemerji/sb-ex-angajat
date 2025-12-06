package pixel.academy.crud_app.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pixel.academy.crud_app.entity.Employee;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void paySalary(Employee employee) {
        System.out.println("Salary of " + employee.getSalary() +
                " was paid to the employee " + employee.getFirstName());
    }

    @Override
    public void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Internship: " + employee.getInternship() + " years");
        System.out.println("Funcțion: " + employee.getFunction());
        System.out.println("Salary: " + employee.getSalary());
    }

    @Override
    public double bonusSalary(Employee employee) {
        if (employee.getInternship() > 5) {
            double bonus = employee.getSalary() * 0.10;
            System.out.println("Bonus granted: " + bonus);
            return bonus;
        }
        System.out.println("The employee has no more than 5 years of experience. No bonus.");
        return 0;
    }
}
