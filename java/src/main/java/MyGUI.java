import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {

	public MyGUI() {
		super("My GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close operation of window
		
		JButton theButton = new JButton("Click me!");

		//ActionListener listener = new myActionListener(); // the action listener

		theButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked me!");
			}
		});

		JButton button2 = new JButton("No, click me!");
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Haha, I win!");
			}
		});

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(theButton);
		panel.add(button2);
		this.setLayout(new FlowLayout());

		this.add(theButton);
		this.add(button2);
		this.pack(); // optimize size
		this.setVisible(true); // show up on screen		
	}
	
	public static void main(String[] args) {
    	new MyGUI(); //create the frame
  	}

  	// action listener able to be used wherever called in code
  	/*public static class myActionListener implements ActionListener {
  		// action performed when clicked
		public void actionPerformed(ActionEvent e) {
			System.out.println("You clicked me!");
		}
  	}*/
}
