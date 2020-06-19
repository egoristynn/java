public class Main {
    public static void main(String[] args)
    {

        Animal animal1 = new Animal();
        Dog dog1 = new Dog("Sharik");
        Cat cat1 = new Cat("Vas'ka");


        dog1.run(400);
        dog1.run(600);
        dog1.swim(60);
        dog1.swim(2);
        dog1.overJump(0.5);
        dog1.overJump(10);
        System.out.println();
        cat1.swim(2);
        cat1.overJump(5);
        cat1.overJump(1);
        cat1.run(30);
        cat1.run(1000);
    }
}
