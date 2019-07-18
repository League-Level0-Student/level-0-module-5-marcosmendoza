package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot rob=new Robot ();
		//2. Set the speed to 100
rob.setSpeed(1000);


		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		if (colorChoice==0) {
			
		}
		else if (colorChoice==1) {
			rob.setPenColor(255,0,0);
		}
		
		else if (colorChoice==2) {
			
			
			
		}
		System.out.println(colorChoice);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user request
		String poly = JOptionPane.showInputDialog("how much polyhons  od oyu want to be d arwn");
				int pol = Integer.parseInt(poly);
		for (int i = 0; i <pol; i++) {
			
		rob.penDown();

		rob.setAngle(350);

		rob.move(100);

		rob.setAngle(45);

		rob.move(100);

		rob.setAngle(135);

		rob.move(100);

		rob.setAngle(190);;

		rob.move(100);

		rob.setAngle(270);

		rob.move(105);
		
		rob.penUp();
		rob.move(142);
		}
		
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

