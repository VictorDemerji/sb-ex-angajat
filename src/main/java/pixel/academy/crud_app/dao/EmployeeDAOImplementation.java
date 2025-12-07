package pixel.academy.crud_app.dao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
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

    @Transactional
    @Override
    public void save(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public void paySalary(Employee employee) {
        System.out.println("Salary of " + employee.getSalary() +
                " was paid to employee " + employee.getFirstName());
    }

    @Override
    public void displayEmployeeInfo(Employee employee) {
        System.out.println(employee);
    }

    @Override
    public double bonusSalary(Employee employee) {
        if (employee.getInternship() > 5) {
            double bonus = employee.getSalary() * 0.10;
            employee.setBonus(bonus);
            System.out.println("Bonus granted: " + bonus);
            return bonus;
        }
        System.out.println("No bonus. Employee internship is under 6 years.");
        return 0;
    }

    @Transactional
    @Override
    public Employee createEmployee(String firstName, String lastName,
                                   int internship, String function, double salary) {

        Employee emp = new Employee(firstName, lastName, internship, function, salary);
        entityManager.persist(emp);
        return emp;
    }
}
