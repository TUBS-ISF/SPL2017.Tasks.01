import javax.swing.JButton;

import interfaces.IButton;

public class SubButton implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("-");
		return button;
	}
}
