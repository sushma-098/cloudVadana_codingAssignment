import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice Johnson", 50000.00);
        Employee emp2 = new Employee(102, "Bob Smith", 60000.00);
        Employee emp3 = new Employee(103, "Charlie Brown", 55000.00);
        List<Employee> elist = new ArrayList<>();
        elist.add(emp1);
        elist.add(emp2);
        elist.add(emp3);
        for (Employee emp : elist) {
            emp.displayDetails();
        }
    }
}
