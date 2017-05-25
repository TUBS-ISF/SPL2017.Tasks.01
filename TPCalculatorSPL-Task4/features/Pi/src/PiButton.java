import javax.swing.JButton;

import interfaces.IButton;

public class PiButton implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("PI");
		return button;
	}
}
