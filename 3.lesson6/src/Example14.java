import java.util.List;

public class Example14 {
    private static Integer FOUR = 4;
    private static Integer ONE = 1;

    public boolean checkArray(List<Integer> intArr){
        if (!intArr.contains(ONE) && !intArr.contains(FOUR)){
            System.out.println("Array does not contains any 1 or 4");
            return false;
        }
        return true;
    }
}
