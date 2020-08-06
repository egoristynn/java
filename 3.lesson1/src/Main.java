public class Main {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box<Apple>(new Apple());
        Box<Orange> box2 = new Box<Orange>(new Orange());
        Box<Apple> box3 = new Box<Apple>(new Apple());

        box1.addFruit(new Apple());
        box1.addFruit(new Apple());

        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());

        box1.changeBox(box1, box3);

        box1.addFruit(new Apple());
        box1.addFruit(new Apple());

        box1.getWeight();
        box3.getWeight();
        box2.getWeight();

        box1.compare(box1, box3);
    }
}
