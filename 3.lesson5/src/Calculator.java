import java.util.Scanner;

public class Calculator {
    float result;
    public static void main(String[] args) {
        Operationable operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        if (c == 1){
            operation = (x,y) -> a+b;
            int result = operation.calculate(a,b);
            System.out.println(result);
        } else if (c == 2){
            operation = (x,y) -> a-b;
            int result = operation.calculate(a,b);
            System.out.println(result);
        } else if (c == 3){
            operation = (x,y) -> a*b;
            int result = operation.calculate(a,b);
            System.out.println(result);
        } else if (c == 4){
            operation = (x,y) -> a/b;
            int result = operation.calculate(a,b);
            System.out.println(result);
        }
    }


    interface Operationable{
        int calculate (int x, int y);
    }
}
