import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SOUND_EFFECTS_MACHINE implements ActionListener {
	public static void main(String[] args) {
		SOUND_EFFECTS_MACHINE SEM = new SOUND_EFFECTS_MACHINE();
		SEM.m();
	}

	public void m() {
		JFrame f = new JFrame();
		JButton b = new JButton("SOUND1");
		JButton bb = new JButton("SOUND2");
		JPanel p = new JPanel();
		f.setVisible(true);
		b.addActionListener(this);
		bb.addActionListener(this);
		f.add(p);
		p.add(b);
		p.add(bb);

		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
if(buttonPressed.equals(b))
{
playSound("drum.wav");	
}
if(buttonPressed.equals(bb))
{
playSound("homer-woohoo.wav");	
}
	}
}
