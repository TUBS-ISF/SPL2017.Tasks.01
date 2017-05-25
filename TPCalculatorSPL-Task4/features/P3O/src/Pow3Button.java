import javax.swing.JButton;

import interfaces.IButton;

public class Pow3Button implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("Pow3");
		return button;
	}
}
