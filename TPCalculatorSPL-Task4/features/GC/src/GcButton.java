import javax.swing.JButton;

import interfaces.IButton;

public class GcButton implements IButton{
	@Override
	public JButton getButton() {
		JButton button = new JButton("GC");
		return button;
	}
}
