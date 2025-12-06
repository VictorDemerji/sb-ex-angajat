package pixel.academy.crud_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="internship")
    private String internship;

    @Column(name="function")
    private String function;

    @Column(name="salary")
    private int salary;

    public Employee() {

    }

    public Employee(
            String firstName,
            String lastName,
            String internship,
            String function,
            int salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.internship = internship;
        this.function = function;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInternship() {
        return internship;
    }

    public void setInternship(String internship) {
        this.internship = internship;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", internship='" + internship + '\'' +
                ", function='" + function + '\'' +
                ", salary=" + salary +
                '}';
    }
}
