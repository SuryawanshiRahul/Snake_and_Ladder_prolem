package com.infogalaxy;

import java.util.Random;

public class Snake_and_ladder {
    int position = 0;
    int die;
    public void showPosition(){
        //UC-1 Game played with Single Player At Start Position is 0
        System.out.println("Player Position is :"+position);
    }

    public static void main(String[] args) {
        Snake_and_ladder snake_and_ladder = new Snake_and_ladder();
        snake_and_ladder.showPosition();

    }
}
