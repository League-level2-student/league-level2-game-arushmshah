import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		JFrame obj=new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		obj.setBounds(10, 10, 800, 630);
		obj.setTitle("Tank 2D");	
		obj.setBackground(Color.gray);
		obj.setResizable(false);
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
		obj.setVisible(true);
		
		
		
		JOptionPane.showConfirmDialog(null, "Instructions For Tank2D: This is a two player game where two people control two different tanks and try to shoot each other. \n Each tank has 3 lives and every hit you get on the opposing tank gives you 10 points. The scores and lives are on the right side of the panel. \n The lives are displayed with a bar. The bar on the top is player one, and the one on the bottom is player two. \n Green means 3 lives left, yellow means 2, and red means 1. If it is black then you have zero lives left. Player 1 controls: Player 1 uses WASD to move. F is to shoot.\n Player 2 controls: Player 2 uses the arrow keys to move. Space is to shoot. \n There are also bricks. Bricks are places to stop bullets from hitting the opponent. You can break the brown bricks to reach your opponent. \n But, the white bricks are indestructable, no matter how many times they are shot at, they will not break.");

	}

}