public class MainClass {
    static final int size = 10000000;
    static final int h = size / 2;

    static class MyThread extends Thread{
        float[] arr;
        MyThread(float[] arr)
        {
            this.arr = arr;
        }

        @Override
        public void run() {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }

    public static void main(String[] args) {
        firstArr();
        secondArr();
    }

    static void firstArr()
    {
        float[] arr = new float[size];

        //Заполняем этот массив единицами;
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        //Засекаем время выполнения
        long a = System.currentTimeMillis();
        //Проходим по всему массиву и для каждой ячейки считаем новое значение по формуле
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    static void secondArr()
    {
        float[] arr3 = new float[size];
        float[] arr2 = new float[size];
        float[] arr1 = new float[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1;
        }
        //Засекаем время выполнения
        long b = System.currentTimeMillis();
        //Разбиваем массив на 2 части
        System.arraycopy(arr1, 0, arr2, 0, h);
        System.arraycopy(arr1, h, arr3, 0, h);

        MyThread thread1 = new MyThread(arr2);
        MyThread thread2 = new MyThread(arr3);

        thread1.start();
        thread2.start();

        System.out.println(System.currentTimeMillis() - b);
    }
}