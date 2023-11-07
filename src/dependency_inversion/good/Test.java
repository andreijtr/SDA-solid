package dependency_inversion.good;

import open_closed.good.DatabasePersistence;
import open_closed.good.FilePersistence;
import single_responsability.good.Employee;

public class Test {

    public static void main(String[] args) {
        Employee andrei = new Employee();

        FilePersistence filePersistence = new FilePersistence();
        EmployeeService employeeService = new EmployeeService(filePersistence);
        employeeService.persistSalary(andrei);

        // what if we want to save to db instead of writing to file?
        DatabasePersistence databasePersistence = new DatabasePersistence();
        EmployeeService employeeServiceDv = new EmployeeService(databasePersistence);
        employeeServiceDv.persistSalary(andrei);
    }
}
