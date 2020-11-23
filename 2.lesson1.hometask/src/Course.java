public class Course {
    Obstacle[] obstacles;

    Course(Obstacle[] obstacles)
    {
        this.obstacles = obstacles;
        obstacles[0] = new Wall(10);
        obstacles[1] = new Cross(500);
        obstacles[2] = new Water(30);
    }

    void doIt(Team team)
    {
        for (int i = 0; i < team.competitors.length; i++) {
            for (int j = 0; j < 1; j++) {
                team.competitors[i].run(500);
                if (!team.competitors[i].isOnDistance()) break;
                else team.competitors[i].swim(30);
                if (!team.competitors[i].isOnDistance()) break;
                else team.competitors[i].jump(10);
                if (!team.competitors[i].isOnDistance()) break;
            }
        }
    }
}
