package dependency_inversion.good;

import open_closed.good.FilePersistence;
import open_closed.good.SalaryPersistence;
import single_responsability.good.Employee;

public class EmployeeService {

    private SalaryPersistence salaryPersistence;

    public EmployeeService(SalaryPersistence salaryPersistence) {
        this.salaryPersistence = salaryPersistence;
    }

    public void persistSalary(Employee employee) {
        int salary = employee.calculateSalary();
        salaryPersistence.save(salary);
    }
}
