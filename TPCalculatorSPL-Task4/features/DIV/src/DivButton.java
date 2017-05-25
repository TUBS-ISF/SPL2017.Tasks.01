import javax.swing.JButton;

import interfaces.IButton;

public class DivButton implements IButton{

	@Override
	public JButton getButton() {
		JButton button = new JButton("/");
		return button;
	}
}
