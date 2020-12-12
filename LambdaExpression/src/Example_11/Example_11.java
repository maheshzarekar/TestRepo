// Program to display a message when push button is clicked using lambda expression - version 2

package Example_11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example_11 {

	public static void main(String[] args) {
		
		// create a push button with label
		JButton but= new JButton("Click this button");
		
		// here we are passing lambda expression to addActionListener() method
		but.addActionListener(e->System.out.println("Lambda Expression Demo"));
		
		// create frame
		JFrame f = new JFrame("Understanding lambda expressions");
		
		// add button to the frame
		f.add(but);
		
		// set the size of the frame
		f.setSize(500,300);
		
		// display the frame
		f.setVisible(true);
		
		// close the frame when close button of frame is clicked
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
