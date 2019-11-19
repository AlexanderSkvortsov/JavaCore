package Statdion;

import Competitors.CompetitionClass;
import Obstacle.ObstacleClass;
import Obstacle.ObstacleType;

public class StadionClass {
    CompetitionClass competitor;
    ObstacleClass obstacle;

    public void setCompetitor(CompetitionClass competitor) {
        this.competitor = competitor;
    }

    public void setObstacle(ObstacleClass obstacle) {
        this.obstacle = obstacle;
    }


    public boolean startCompetition(){

        if ((obstacle == null) || (competitor == null)) {
            System.out.println("Error, objects are not ready.");
            return false;
        }

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
