import java.util.ArrayList;

public class Box<F extends Fruit> {
    private F fruit;
    protected float boxWeight;
    public Box(F fruit) {
        this.fruit = fruit;
    }

    ArrayList<Fruit> boxIn = new ArrayList<Fruit>();

    void getWeight(){
        boxWeight = fruit.weight * boxIn.size();
        System.out.println("Вес коробки составляет: " + boxWeight);
    }

    void compare(Box box1, Box box2){
        box1.boxWeight = box1.fruit.weight * box1.boxIn.size();
        box2.boxWeight = box1.fruit.weight * box2.boxIn.size();
        if (box1.boxWeight != box2.boxWeight){
            System.out.println("Веса коробок не равны");
        } else System.out.println("Веса коробок равны");
    }

    void addFruit(F fruit){
        boxIn.add(fruit);
    }

    void changeBox(Box<F> box1, Box<F> box2){
        box2.boxIn.addAll(box1.boxIn);
        box1.boxIn.clear();
    }
}
