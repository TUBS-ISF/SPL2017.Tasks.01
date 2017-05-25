import javax.swing.JButton;

import interfaces.IButton;

public class Pow4Button implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("Pow4");
		return button;
	}
}
