public class Main {
    public static void main (String[] args)
    {
        Cat cat1 = new Cat("Васька", 25);
        Plate plate1 = new Plate(200);

        Plate plate2 = new Plate(100);
        Cat []cats = new Cat[3];
        cats[0] = new Cat ("1й кот", 20);
        cats[1] = new Cat ("2й кот", 40);
        cats[2] = new Cat ("3й кот", 100);
        for (int i = 0; i < 3; i++)
        {
            plate2.checkFullness(cats[i]);
            cats[i].eat(plate2);
        }
        plate2.info();

        cat1.info();
        plate1.info();
        cat1.eat(plate1);
        cat1.info();
        plate1.info();
    }
}
