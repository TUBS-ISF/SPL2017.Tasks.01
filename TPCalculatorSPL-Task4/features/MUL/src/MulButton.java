import javax.swing.JButton;

import interfaces.IButton;

public class MulButton implements IButton{

	@Override
	public JButton getButton() {
		JButton button = new JButton("X");
		return button;
	}
}
