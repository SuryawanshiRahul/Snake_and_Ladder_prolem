package com.infogalaxy;

import java.util.Random;

public class Snake_and_ladder {
    Random random = new Random();

    //Position of Player
    int position = 0;
    //Define Constant For Options
    final int NO_PLAY = 1;
    final int LADDER = 2;
    final int SNAKE = 3;

    // Showing The Player Current Position
    public void showPosition(){
        //UC-1 Game played with Single Player At Start Position is 0
        System.out.println("Player Position is :"+position);
    }
    // Rolling The Die to get  position
    public void  rollsDie() {
//UC-4  Checking For Player Winning Position 100
        while (position != 100){
            //UC-2-Rolls_Die_1_To_6_Using_Random_Function
            int die = random.nextInt(6) + 1;
        System.out.println("Die No is :" + die);
        // UC-3 Checking For To Play
        int option = random.nextInt(3) + 1;
        System.out.println("Option Is :" + option);
        switch (option) {
            case NO_PLAY:
                System.out.println("NO Play Arrived. Stay on Same Position");
                System.out.println("New Position :" + position);
                break;
            case LADDER:
                System.out.println("HURRAY !!! You get Ladder");
                position = position + die;
                if(position >100){
                    //UC-5 The Player Position Go Above 100,Stay In Same previous Position
                    System.out.println("******Player Out Of Board.******");
                    position = position -die;
                }
                break;
            case SNAKE:
                System.out.println("OOPS !!! You get Snake");
                position = position - die;
                if (position < 0)
                    position = 0;
                break;
        }
        showPosition();
        }
    }
    public static void main(String[] args) {
        Snake_and_ladder player1 = new Snake_and_ladder();
        player1.showPosition();
        player1.rollsDie();
    }
}
