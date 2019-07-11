package _05_circle_ring;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {


    	Robot rob=new Robot();

rob.moveTo(250,350);
rob.penDown();
rob.setSpeed(10000);

for (int i = 0; i < 360; i++) {
	rob.move(3);
	rob.turn(1);


if (i%20==0) {
	for (int j = 0; j < 360; j++) {
		rob.setSpeed(1000000);
		rob.move(1);
		rob.turn(1);
		
	}
}
}
    }      
}
