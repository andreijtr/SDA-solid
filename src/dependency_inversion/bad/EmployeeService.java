package dependency_inversion.bad;

import open_closed.good.FilePersistence;
import single_responsability.good.Employee;

public class EmployeeService {

    private FilePersistence filePersistence;

    public EmployeeService(FilePersistence filePersistence) {
        this.filePersistence = filePersistence;
    }

    public void persistSalary(Employee employee) {
        int salary = employee.calculateSalary();
        filePersistence.save(salary);
    }
}
