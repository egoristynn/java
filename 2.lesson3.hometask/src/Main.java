import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        String word = null;
        int wordCounter = 0;

        //Создать массив с набором слов
        ArrayList<String> words = new ArrayList<>();
        words.add("яблоко");
        words.add("абрикос");
        words.add("слива");
        words.add("апельсин");
        words.add("яблоко");
        words.add("яблоко");
        words.add("абрикос");
        words.add("груша");
        words.add("апельсин");
        words.add("слива");

       //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем)
        Set<String> set = new HashSet<>(words);
        System.out.println(set);
        System.out.println();

        //Посчитать, сколько раз встречается каждое слово
        for (int i = 0; i < words.size(); i++) {
            word = words.get(i);
            for (int j = 0; j < words.size(); j++) {
                if (word.equals(words.get(j))) {
                    wordCounter++;
                }
            }
            System.out.println("Слово " + words.get(i) + " встретилось " + wordCounter + " раз");
            wordCounter = 0;
        }
    }
}
