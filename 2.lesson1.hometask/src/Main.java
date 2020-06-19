public class Main {
    public static void main (String[] args)
    {
        Team team = new Team("Команда 1", new Competitor[4]);
        Course c = new Course(new Obstacle[3]);
        c.doIt(team);
        team.infoAll();
        team.winnersInfo();
    }
}
