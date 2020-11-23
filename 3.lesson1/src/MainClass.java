import java.util.ArrayList;
import java.util.Arrays;

public class MainClass<T>{
    private T obj;
    public static void main(String[] args) {
        String[] arr1 = {"adc", "qwe"};
        //System.out.println(Arrays.deepToString(arr1));
        //changeArray(arr1);
        arrToList(arr1);
    }

    //Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
    static void changeArray(String[] arr){
        String[] array = new String[2];
        for (int i = 0; i < arr.length; i++) {
            array[array.length - i - 1] = arr[i];
        }
        System.out.println(Arrays.deepToString(array));
    }

    //Написать метод, который преобразует массив в ArrayList
    static void arrToList(String[] arr){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
