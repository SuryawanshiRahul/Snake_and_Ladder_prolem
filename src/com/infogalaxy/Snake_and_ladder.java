package com.infogalaxy;

import java.util.Random;

public class Snake_and_ladder {
    Random random = new Random();

    //Position of Player
    int position = 0;
    //Define Constant For Options
    final int NO_PLAY = 0;
    final int LADDER = 1;
    final int SNAKE = 2;

    // Showing The Player Current Position
    public void showPosition(){
        //UC-1 Game played with Single Player At Start Position is 0
        System.out.println("Player Position is :"+position);
    }
    // Rolling The Die to get  position
    public void  rollsDie(){
        //UC-2-Rolls_Die_1_To_6_Using_Random_Function
       int die =random.nextInt(6)+1;
        System.out.println("Die No is :"+die);
    }
    public static void main(String[] args) {
        Snake_and_ladder snake_and_ladder = new Snake_and_ladder();
        snake_and_ladder.showPosition();
        snake_and_ladder.rollsDie();
    }
}
