package com.infogalaxy;

import java.util.Random;

public class Snake_and_ladder {
    int position = 0;
    int die;
    public void showPosition(){
        //UC-1 Game played with Single Player At Start Position is 0
        System.out.println("Player Position is :"+position);
    }
    public void  rollsDie(){
        //UC-2-Rolls_Die_1_To_6_Using_Random_Function
        Random random = new Random();
        die =random.nextInt(6)+1;
        System.out.println("Die No is :");
    }
    public static void main(String[] args) {
        Snake_and_ladder snake_and_ladder = new Snake_and_ladder();
        snake_and_ladder.showPosition();
        snake_and_ladder.rollsDie();
    }
}
