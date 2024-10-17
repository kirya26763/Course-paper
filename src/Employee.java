import java.util.Objects;

public class Employee {
    private static int calculationID = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
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

    public static int getCalculationID() {
        return calculationID;
    }

    public static void setCalculationID(int calculationID) {
        Employee.calculationID = calculationID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
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
    public String idFullNameSalary (){
        return "id - " + id +
                ", Ф.И.О сотрудника - " + '\"' + lastName + " " + firstName + " " + middleName + " " + '\"' + ", ЗП - " + salary;
    }
    public String fullName(){
        return "Ф.И.О сотрудника - " + '\"' + lastName + " " + firstName + " " + middleName + " " + '\"';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, salary, department);
    }
}
