package pixel.academy.crud_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pixel.academy.crud_app.dao.EmployeeDAO;
import pixel.academy.crud_app.entity.Employee;

@SpringBootApplication
public class CrudAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeDAO employeeDAO) {
        return runner -> {
            createEmployee(employeeDAO);
        };
    }

    private void createEmployee(EmployeeDAO employeeDAO) {

        System.out.println("Creating employee...");

        Employee emp = employeeDAO.createEmployee(
                "Victor",
                "Demerji",
                6,
                "Java Developer",
                5000
        );

        System.out.println("Saved employee with ID: " + emp.getId());

        employeeDAO.displayEmployeeInfo(emp);
        employeeDAO.paySalary(emp);
        employeeDAO.bonusSalary(emp);
    }
}
