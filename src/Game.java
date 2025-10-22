import java.util.Scanner;
public class Game {

    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean isBonus;
    int game;


    public Game(int gameNum) {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
        isBonus = false;
        game = gameNum;
    }

    public int getGameNum() {
        return game;
    }


    public boolean isBonus() {
        return isBonus;
    }

    public void makeBonus() {
        isBonus = true;
    }

    public Level getLevel(int i) {
        if (i == 1) return levelOne;
        if (i == 2) return levelTwo;
        if (i == 3) return levelThree;
        return null;
    }


    public void play(int gameNum) {
        System.out.println("Please enter points for game " + gameNum + ".");
        Scanner s = new Scanner(System.in);
        levelOne.setPoints(s.nextInt());
        levelOne.reachGoal();
    }


    public int getScore() {
        int points = 0;
        if (getLevel(1).goalReached()) {
            points += getLevel(1).getPoints();
            if (getLevel(2).goalReached()) {
                points += getLevel(2).getPoints();
                if (getLevel(3).goalReached()) {
                    points += getLevel(3).getPoints();
                    if (isBonus) points *= 3;
                }
            }
        }
        return points;
    }


    public int playManyTimes(int num) {
        int max = 0;
        int gameNum = 1;
        while (num > 0) {
            play(gameNum);
            int score = getScore();
            if (score > max) max = score;
            num--;
            gameNum++;
        }
        return max;
    }


}