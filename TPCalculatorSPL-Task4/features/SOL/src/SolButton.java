import javax.swing.JButton;

import interfaces.IButton;

public class SolButton implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("Sol");
		return button;
	}
}
