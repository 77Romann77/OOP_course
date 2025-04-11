package Lab8.Task1;

public class Employee extends Person {
    int salary;

    Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
}
