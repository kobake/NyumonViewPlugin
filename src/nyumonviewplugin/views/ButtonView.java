package nyumonviewplugin.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class ButtonView extends ViewPart {

	Button m_button;
	
	public ButtonView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		m_button = new Button(parent, SWT.NONE);
		m_button.setText("Click");
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
