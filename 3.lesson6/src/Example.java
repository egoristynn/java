import java.util.List;

public class Example{
    private static Integer FOUR = 4;

    public List cutArray(List<Integer> intArr){
        if(!intArr.contains(FOUR)) throw new RuntimeException("Array does not contains any 4");
        return intArr.subList(intArr.lastIndexOf(FOUR) + 1, intArr.size());
    }
}