public class Animal {
    String name;

    Animal()
    {
    }

    void run(int length)
    {
        System.out.println(name + " has ran " + length + " metres");
    }
    void swim(int length)
    {
        System.out.println(name + " has swam " + length + " metres");
    }
    void overJump(double height)
    {
        System.out.println(name + " has jumped over obstacle " + height + " metres high");
    }
}
