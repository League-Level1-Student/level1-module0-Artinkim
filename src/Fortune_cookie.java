import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_cookie implements ActionListener {
public static void main(String[] args) {
Fortune_cookie fc = new Fortune_cookie();	
fc.showButton();
}
public void showButton() {
    System.out.println("Button clicked");
    JFrame f = new JFrame();
    f.setVisible(true);
    JButton button = new JButton();
    f.add(button);
    button.addActionListener(this);
  f.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo");
	int rand = new Random().nextInt(5);
	if(rand == 0)
	{
		JOptionPane.showMessageDialog(null, "You will have good luck");	
	}
	if(rand == 1)
	{
		JOptionPane.showMessageDialog(null, "You will have bad luck");	
	}
	if(rand == 2)
	{
		JOptionPane.showMessageDialog(null, "09 013  9193 319");	
	}
	if(rand == 3)
	{
		JOptionPane.showMessageDialog(null, "45 47 732 74 554");	
	}
	if(rand == 4)
	{
		JOptionPane.showMessageDialog(null, "24 246 574 654 3");	
	}
}

}
