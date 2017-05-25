import javax.swing.JButton;

import interfaces.IButton;

public class SosButton implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("Sos");
		return button;
	}
}
