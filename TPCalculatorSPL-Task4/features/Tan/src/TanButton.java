import javax.swing.JButton;

import interfaces.IButton;

public class TanButton implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("tan");
		return button;
	}
}
