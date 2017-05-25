import javax.swing.JButton;

import interfaces.IButton;

public class Root2Button implements IButton{

	@Override
	public JButton getButton() {
		JButton button = new JButton("Root2");
		return button;
	}
}
