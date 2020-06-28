public class Cat extends Animal{

    Cat(String name)
    {
        this.name = name;
    }

    @Override
    void run(int length) {
        if (length <= 200 && length >= 0)
        {
            super.run(length);
        }
        else System.out.println(name + " can't run so far");
    }

    @Override
    void swim(int length)
    {
        System.out.println(name + " can't swim");
    }

    @Override
    void overJump(double height) {
        if (height <= 2 && height >= 0)
        {
            super.overJump(height);
        }
        else System.out.println(name + " can't jump so high");
    }
}
