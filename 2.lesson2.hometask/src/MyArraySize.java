public class MyArraySize {

    static int getArray(String[][] a) throws MyArraySizeException,MyArrayDataException {
        if(a.length == 4 && a[0].length == 4) {
            System.out.println("Длина массива верна");
        } else {
            throw new MyArraySizeException("Длина массива задана неверно");
        }

        int sum = 0;
        for (int i = 0;i < a.length;i++) {
            for(int j = 0;j < a[i].length;j++) {
                try {
                    sum += Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно преобразовать ячейку "+i+"x"+j);
                }
            }
        }

        return sum;
    }
}
