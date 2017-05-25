import javax.swing.JButton;

import interfaces.IButton;

public class Pow2Button implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("Pow2");
		return button;
	}
}
