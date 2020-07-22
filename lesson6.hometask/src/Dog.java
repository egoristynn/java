public class Dog extends Animal{

    Dog(String name)
    {
        this.name = name;
    }

    @Override
    void run(int length) {
        if (length <= 500 && length >= 0)
        {
            super.run(length);
        }
        else System.out.println(name + " can't run so far");
    }

    @Override
    void swim(int length) {
        if (length <= 30 && length >= 0)
        {
            super.swim(length);
        }
        else System.out.println(name + " can't swim so far");
    }

    @Override
    void overJump(double height) {
        if (height <= 0.5 && height >= 0)
        {
            super.overJump(height);
        }
        else System.out.println(name + " can't jump so high");
    }
}
