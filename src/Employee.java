public class Employee {
    private static int calculationID = 1;
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private int salary;
    private int department;

    public Employee(String firstName, String lastName, String middleName, int salary, int department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salary = salary;
        this.department = department;
        id = calculationID++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id - " + id +
                ", Ф.И.О сотрудника - " + '\"' + lastName + " " + firstName + " " + middleName + " " + '\"' + " отдел "
                + department + ", ЗП - " + salary;
    }
}
