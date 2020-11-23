import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) throws IOException {

        //Прочитать файл (около 50 байт) в байтовый массив и вывести этот массив в консоль

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("myfile.txt"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        int x;
        while ((x = in.read()) != -1) {
            out.write(x);
        }

        byte[] b = out.toByteArray();
        System.out.println(Arrays.toString(b));
        in.close();
        out.close();

        //Последовательно сшить 5 файлов в один (файлы примерно 100 байт).
        // Может пригодиться следующая конструкция:
        // ArrayList<InputStream> al = new ArrayList<>(); ... Enumeration<InputStream> e = Collections.enumeration(al);

        File one = new File("one.txt");
        File two = new File("two.txt");
        File three = new File("three.txt");
        File four = new File("four.txt");
        File five = new File("five.txt");

        ArrayList<InputStream> al = new ArrayList<>();
        al.add(new FileInputStream("one.txt"));
        al.add(new FileInputStream("two.txt"));
        al.add(new FileInputStream("three.txt"));
        al.add(new FileInputStream("four.txt"));
        al.add(new FileInputStream("five.txt"));

        Enumeration<InputStream> e = Collections.enumeration(al);

        SequenceInputStream sin = new SequenceInputStream(Collections.enumeration(al));
        int a;

        while ((a = sin.read()) != -1) {
            System.out.print((char) a);
        }

        in.close();

    }
}
