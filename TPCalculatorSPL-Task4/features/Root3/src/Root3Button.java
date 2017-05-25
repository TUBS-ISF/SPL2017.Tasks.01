import javax.swing.JButton;

import interfaces.IButton;

public class Root3Button implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("Root3");
		return button;
	}
}
