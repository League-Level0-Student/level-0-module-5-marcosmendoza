package _05_circle_ring;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {
    	Robot rob=new Robot();
    	String ans = JOptionPane.showInputDialog("What shape do you want to be drawn(Square, Triangle, Circle, Rings)");
    	ans=ans.toLowerCase();
    	
    	if (ans.equals("circle")) {
    		rob.setSpeed(100000);
    	rob.penDown();
    		for (int i = 0; i < 360/1; i++) {
    			rob.move(3);
    			rob.turn(1);
    		}
    	
    	rob.moveTo(1,1);
    	
    	
    	
    	
    	
    	
    	
    	
    	}
    	
    	if (ans.equals("triangle")) {
    		rob.setSpeed(10000);
    		rob.penDown();
    		rob.turn(45);
    		rob.move(100);
    		rob.turn(90);
    		rob.move(100);
    		rob.turn(135);
    		rob.move(145);
			rob.moveTo(1, 1);
		}
    	
    	if(ans.equals("square")) {
    		for (int i = 0; i <5; i++) {
				
			rob.setSpeed(100000);
    		rob.penDown();
    	rob.move(100);
    	rob.turn(90);
    	rob.move(100);
    		}
    	rob.moveTo(1, 1);
    	}
    	
if(ans.equals("rings")) {
rob.moveTo(250,350);
rob.penDown();
rob.setSpeed(1);

for (int i = 0; i < 360/4; i++) {
	rob.move(3);
	rob.turn(4);


if (i%20==0) {
	for (int j = 0; j < 360/4; j++) {
		rob.setSpeed(1000000);
		rob.move(1);
		rob.turn(4);
		
	}
	
}
}
      rob.moveTo(1, 1);
}
}
}