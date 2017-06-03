import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OneParamOpsListener implements ActionListener {

	private String operation = "";

	public OneParamOpsListener(String operation) {
		this.operation = operation;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String value = UiController.getInstance().getDisplayValue();
		if (!value.equals("")) {
			UiController.getInstance().setCache(0, operation);
			UiController.getInstance().setCache(1, value);
			UiController.getInstance().calculate();
		}
	}

}
