public class Employee {
    //* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    //* Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String name, String position, String email, String phoneNumber, int salary, int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    //* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    void getEmployee()
        {
            System.out.println("ФИО: " + name);
            System.out.println("Должность: " + position);
        }

    @Override
    public String toString() {
        return name + " " + position + " " + email + " " + phoneNumber + " " + salary + " " + age;
    }
}