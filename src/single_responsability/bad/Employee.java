package single_responsability.bad;

public class Employee {

    public int calculateSalary() {
        int salary = 30 * 100;
        saveToDatabase(salary);
        return salary;
    }

    public void saveToDatabase(int salary) {
        // code to save salary in db
    }
}
