package open_closed.good;

public class Test {

    public static void main(String[] args) {
        int salary = 3000;

        SalaryPersistence dbPersistence = new DatabasePersistence();
        dbPersistence.save(salary);

        SalaryPersistence filePersistence = new FilePersistence();
        filePersistence.save(salary);
    }
}
