public class Cat {
    private String name;
    protected int hunger;

    Cat(String name, int hunger)
    {
        this.name = name;
        this.hunger = hunger;
    }

    void eat(Plate plate)
    {
        if (hunger <= plate.fullness)
        {
            plate.fullness -= hunger;
            hunger = 0;
            System.out.println(name + " покушал.");
        } else
            {
                System.out.println(name + " не стал есть еду, потому что ее мало.");
            }
    }

    void info()
    {
        System.out.println("Уровень голода: " + hunger);
    }
}
