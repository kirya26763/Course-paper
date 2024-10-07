public class Main {
    private static Employee[] employees = new Employee[10];

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

    private static void print() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Сумма зарплат всех сотрудников " + calculatedSumSalary());
        System.out.println("Сотркдник с миниммальной зарплатой" +calculatedMinSalary());
        System.out.println("Сотркдник с максимальной зарплатой"+ calculatedMaxSalary());
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Дмитрий", "Иванов", "Александрович", 152100, 1);
        employees[1] = new Employee("Олег", "Дмитрев", "Евгеневич", 152000, 1);
        employees[2] = new Employee("Вадим", "Стрельников", "Никитич", 100020, 2);
        employees[3] = new Employee("Александр", "Рубинов", "Леонидович", 100000, 2);
        employees[4] = new Employee("Данил", "Михаилов", "Генадьевичь", 80007, 3);
        employees[5] = new Employee("Леонид", "Григорьев", "Артемович", 80000, 3);
        employees[6] = new Employee("Алексей", "Матросов", "Михаилович", 60001, 4);
        employees[7] = new Employee("Михаил", "Берегов", "Алексеевич", 60000, 4);
        employees[8] = new Employee("Кирилл", "Артемьев", "Владимирович", 45097, 5);
        employees[9] = new Employee("Никита", "Голубцов", "Григорьевичь", 45000, 5);
        print();
    }
}