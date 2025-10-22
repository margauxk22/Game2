public class Main {
    public static void main(String[] args) {

        // game 1
        Game one = new Game(1);
        one.getLevel(1).reachGoal();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).reachGoal();
        one.getLevel(3).setPoints(500);
        one.makeBonus();

        System.out.println("Game " + one.getGameNum());
        System.out.println(one.getScore());
        System.out.println(" ");

        //2
        Game two = new Game(2);
        two.getLevel(1).reachGoal();
        two.getLevel(1).setPoints(200);
        two.getLevel(2).reachGoal();
        two.getLevel(2).setPoints(100);

        System.out.println("Game " + two.getGameNum());
        System.out.println(two.getScore());
        System.out.println(" ");

        // game 3
        Game three = new Game(3);
        three.getLevel(1).reachGoal();
        three.getLevel(1).setPoints(200);
        three.getLevel(3).reachGoal();
        three.getLevel(3).setPoints(500);
        three.makeBonus();

        System.out.println("Game " + three.getGameNum());
        System.out.println(three.getScore());
        System.out.println(" ");


        Game four = new Game(4);
        four.getLevel(2).reachGoal();
        four.getLevel(2).setPoints(100);
        four.getLevel(3).reachGoal();
        four.getLevel(3).setPoints(500);
        four.makeBonus();

        System.out.println("Game " + four.getGameNum());
        System.out.println(four.getScore());
        System.out.println(" ");

        // game 5
        Game five = new Game(5);
        System.out.println("High Score: " + five.playManyTimes(4));

    }
}