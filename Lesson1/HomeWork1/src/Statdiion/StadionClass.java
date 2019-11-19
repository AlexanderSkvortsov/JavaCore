package Statdiion;

import Competitors.CompetitionClass;
import Obstacle.ObstacleClass;
import Obstacle.ObstacleType;

public class StadionClass {
    CompetitionClass competitor;
    ObstacleClass obstacle;

    public StadionClass(CompetitionClass competitor, ObstacleClass obstacle) {
        this.competitor = competitor;
        this.obstacle = obstacle;
    }

    public boolean startCompetition(){
        ObstacleType obstacleType = obstacle.getObstacleType();
        int obstacleValue =obstacle.getObstacleValue();
        int competitorValue = (obstacleType== ObstacleType.WALL)? competitor.getMaxHeight():competitor.getMaxDistance();

        if (obstacle.getObstacleType()== ObstacleType.WALL) competitor.jump();
         else competitor.run();

        boolean result = competitorValue>=obstacleValue;

        System.out.println( "The result is " + (result ? "OK!":"FAIL!"));

        return result;
    }
}
