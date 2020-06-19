public class Main {
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Иванов Иван", "Java-разработчик", "IvanovIvan@mail.ru", "+78005553535", 40000, 25);
        employee1.getEmployee();

        //* Создать массив из 5 сотрудников
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Андреев Андрей", "Python-разработчик", "AndrAndr@mail.ru", "+78005553536", 45000, 41);
        empArray[1] = new Employee("Егоров Егор", "JavaScript-разработчик", "EgEg@mail.ru", "+78005553537", 37000, 29);
        empArray[2] = new Employee("Константинов Константин", "Java-разработчик", "KonstK@mail.ru", "+78005553538", 45000, 45);
        empArray[3] = new Employee("Алексеев Алексей", "Python-разработчик", "AlexAlex@mail.ru", "+78005553539", 60000, 46);
        empArray[4] = new Employee("Никитин Никита", "C++ разработчик", "NikitinNik@mail.ru", "+78005553530", 68000, 37);

        //* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i = 0; i < empArray.length; i++)
        {
            if (empArray[i].age > 40)
            {
                System.out.println(empArray[i]);
            }
        }
    }
}
