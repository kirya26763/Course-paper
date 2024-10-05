public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0]=new Employee("Дмитрий","Иванов","Александрович",152000,1);
        employees[1]=new Employee("Олег","Дмитрев","Евгеневич",152000,1);
        employees[2]=new Employee("Вадим","Стрельников","Никитич",100000,2);
        employees[3]=new Employee("Александр","Рубинов","Леонидович",100000,2);
        employees[4]=new Employee("Данил","Михаилов","Генадьевичь",80000,3);
        employees[5]=new Employee("Леонид","Григорьев","Артемович",80000,3);
        employees[6]=new Employee("Алексей","Матросов","Михаилович",60000,4);
        employees[7]=new Employee("Михаил","Берегов","Алексеевич",60000,4);
        employees[8]=new Employee("Кирилл","Артемьев","Владимирович",45000,5);
        employees[9]=new Employee("Никита","Голубцов","Григорьевичь",45000,5);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}