import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class App {
    static final int PAGE_SIZE = 1800;
    public static void main(String[] args) throws IOException {
        //Написать консольное приложение, которое умеет постранично читать текстовые файлы (размером > 10 mb).
        // Вводим страницу (за страницу можно принять 1800 символов), программа выводит ее в консоль.
        // Контролируем время выполнения: программа не должна загружаться дольше 10 секунд, а чтение – занимать свыше 5 секунд.

        RandomAccessFile raf = new RandomAccessFile("TextFile.txt", "r");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите страницу: ");
        int p = sc.nextInt() - 1;
        raf.seek(p * PAGE_SIZE);
        byte[] arr = new byte[1800];
        raf.read(arr);
        System.out.println(new String(arr));
        raf.close();

    }
}
