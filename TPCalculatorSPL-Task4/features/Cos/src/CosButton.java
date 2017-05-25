import javax.swing.JButton;

import interfaces.IButton;

public class CosButton implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("cos");
		return button;
	}

}
