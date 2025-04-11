package Lab8.Task1;

public class task1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Aboba", 18, 1000);

        System.out.println("Перед змінною:");
        System.out.println(employee.getName() + " " + employee.getAge());

        employee.setName("Kaneki");
        employee.setAge(20);

        System.out.println("Після змінни через employee.SetName та employee.SetAge:");
        System.out.println(employee.getName() + " " + employee.getAge());
    }
}
