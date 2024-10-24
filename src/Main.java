public class Main {

    private static final Employee[] employees = new Employee[10];

    private static void salaryIncrease(int percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percent));
        }
    }

    private static int calculatedSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    private static Employee calculatedMinSalary() {
        Employee employeeMinSalary = null;
        for (Employee employee : employees) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    private static Employee calculatedMaxSalary() {
        Employee employeeMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    private static double averageSalary() {
        return (double) calculatedSumSalary() / employees.length;
    }

    private static void print() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Сумма зарплат всех сотрудников " + calculatedSumSalary());
        System.out.println("Сотркдник с миниммальной зарплатой " + calculatedMinSalary());
        System.out.println("Сотркдник с максимальной зарплатой " + calculatedMaxSalary());
        System.out.println("Средняя ЗП сотрудников состовляет " + averageSalary());
    }

    private static void listEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }

    private static void printDepartmentSalary() {
        System.out.println("Сотркдник с миниммальной зарплатой в " + calculatedMinSalary().getDepartment());
        System.out.println("Сотркдник с максимальной зарплатой в " + calculatedMaxSalary().getDepartment());
    }

    private static int calculatedSumSalaryDepartment(int numberDepartment) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                sumSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма зарплат отдела - " + numberDepartment + " - " + sumSalary);
        return numberDepartment;
    }

    private static int calculatedAverageSalaryDepartment(int numberDepartment) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                sumSalary += employee.getSalary();
            }
        }
        sumSalary /= 2;
        System.out.println("Средняя сумма зарплат отдела - " + numberDepartment + " - " + sumSalary);
        return numberDepartment;
    }

    private static void salaryIncreaseDepartment(int numberDepartment) {
        int conditionalPercent = 8;
        System.out.println("Отде - " + numberDepartment);
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * conditionalPercent));
            }
        }
    }

    private static void printDepartment(int numberDepartment) {
        System.out.println("Отдел - " + numberDepartment);
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment)
                System.out.println(employee.idFullNameSalary());
        }
    }

    private static void printSortingMinSalary() {
        int meaning = 100000;
        System.out.println("Сотрудники с зарплатой меньше " + meaning);
        for (Employee employee : employees) {
            if (employee.getSalary() < meaning) {
                System.out.println(employee.idFullNameSalary());
            }
        }
    }

    private static void printSortingMaxSalary() {
        int meaning = 100000;
        System.out.println("Сотрудники с зарплатой больше или равной " + meaning);
        for (Employee employee : employees) {
            if (employee.getSalary() >= meaning) {
                System.out.println(employee.idFullNameSalary());
            }
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Дмитрий", "Иванов", "Александрович", 152100, 1);
        employees[1] = new Employee("Олег", "Дмитрев", "Евгеневич", 152000, 1);
        employees[2] = new Employee("Вадим", "Стрельников", "Никитич", 100020, 2);
        employees[3] = new Employee("Александр", "Рубинов", "Леонидович", 100000, 2);
        employees[4] = new Employee("Данил", "Михаилов", "Генадьевичь", 80007, 3);
        employees[5] = new Employee("Леонид", "Григорьев", "Артемович", 55000, 3);
        employees[6] = new Employee("Алексей", "Матросов", "Михаилович", 60001, 4);
        employees[7] = new Employee("Михаил", "Берегов", "Алексеевич", 60000, 4);
        employees[8] = new Employee("Кирилл", "Артемьев", "Владимирович", 45097, 5);
        employees[9] = new Employee("Никита", "Голубцов", "Григорьевичь", 45000, 5);
        print();
        listEmployees();
        salaryIncrease(10);
        printDepartmentSalary();
        calculatedSumSalaryDepartment(1);
        calculatedAverageSalaryDepartment(1);
        salaryIncreaseDepartment(1);
        printDepartment(1);
        printSortingMinSalary();
        printSortingMaxSalary();
    }
}