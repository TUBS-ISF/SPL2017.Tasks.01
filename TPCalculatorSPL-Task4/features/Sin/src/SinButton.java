import javax.swing.JButton;

import interfaces.IButton;

public class SinButton implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("sin");
		return button;
	}
}
