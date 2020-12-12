// program for push button works with Anonymous inner class

package Example_10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example_10 {

	public static void main(String[] args) {

		// create a push button with label
		JButton but = new JButton("Click this button");

		// here we are passing anonymous inner class object to addActionListener()
		// method
		but.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Anonymous inner class demo");
			}
		});

		// create frame
		JFrame f = new JFrame("Understanding lambda expressions");

		// add button to the frame
		f.add(but);

		// set the size of the frame
		f.setSize(500, 350);

		// display the frame
		f.setVisible(true);

		// close the frame when close button of frame is clicked
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
