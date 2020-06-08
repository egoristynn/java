public class Plate {
    protected int fullness;

    Plate(int fullness)
    {
        this.fullness = fullness;
    }
    void info ()
    {
        System.out.println("Осталось еды в миске: " + fullness);
    }

    void checkFullness (Cat cat)
    {
        if (fullness < cat.hunger)
        {
            System.out.println("Коту не хватает еще " + (cat.hunger - fullness) + " единиц еды");
            System.out.println("В миску добавили " + (cat.hunger - fullness) + " единиц еды");
            fullness = cat.hunger;
        } else
            System.out.println("Еды хватает");
    }
}
