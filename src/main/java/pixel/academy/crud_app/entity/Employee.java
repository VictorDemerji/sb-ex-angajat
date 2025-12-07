package pixel.academy.crud_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="internship")
    private int internship;

    // FUNCTION este cuvânt rezervat → neapărat cu backticks
    @Column(name="`function`")
    private String function;

    @Column(name="salary")
    private double salary;

    @Column(name="bonus")
    private double bonus;

    public Employee() {}

    public Employee(String firstName, String lastName,
                    int internship, String function, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.internship = internship;
        this.function = function;
        this.salary = salary;
    }

    // Getters & Setters

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getInternship() { return internship; }
    public String getFunction() { return function; }
    public double getSalary() { return salary; }
    public double getBonus() { return bonus; }

    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", internship=" + internship +
                ", function='" + function + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
