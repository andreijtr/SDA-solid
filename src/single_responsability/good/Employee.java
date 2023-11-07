package single_responsability.good;

public class Employee {
    private String name;
    private String employmentDate;

    public int calculateSalary() {
        int salary = 30 * 100;
        return salary;
    }
}
