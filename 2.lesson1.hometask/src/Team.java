public class Team {
    String name;
    Competitor[] competitors;

    Team (String name, Competitor[] competitors)
    {
        this.name = name;
        this.competitors = competitors;
        competitors[0] = new Animal("Кот", "Кот 1", 50, 5, 0);
        competitors[1] = new Animal("Собака", "Собака 1", 300, 2, 30);
        competitors[2] = new Human("Человек 1");
        competitors[3] = new Human("Человек 2");
    }


    void infoAll ()
    {
        System.out.println();
        System.out.println("Информация о команде " + name + ":");
        for (int i = 0; i < competitors.length; i++)
        {
            competitors[i].info();
        }
    }

    void winnersInfo ()
    {
        System.out.println();
        System.out.println("Информация о прошедших дистанцию:");
        for (int i = 0; i < competitors.length; i++)
        {
            if (competitors[i].isOnDistance())
            {
                competitors[i].info();
            }
        }
    }
}
