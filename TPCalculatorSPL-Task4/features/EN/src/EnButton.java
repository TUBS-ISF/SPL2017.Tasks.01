import javax.swing.JButton;

import interfaces.IButton;

public class EnButton implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("EN");
		return button;
	}
}
