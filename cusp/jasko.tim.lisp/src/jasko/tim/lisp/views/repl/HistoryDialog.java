package jasko.tim.lisp.views.repl;


import java.util.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.dialogs.Dialog;



public class HistoryDialog extends Dialog  implements KeyListener {
	ArrayList<String> hist;
	String result = "";
	int ind = 0;
	String title = "Get history";
	String groupTitle = "History";

	private List lstEnums;
	private Label lblSearch;
	private String search = "";
	
	public HistoryDialog(Shell parentShell, ArrayList<String> hist) {
		super(parentShell);
		this.hist = hist;
	}
	
	
	public String getHist() {
		return result;
	}
	
	public int getHistInd(){
		return ind;
	}
	
	protected Control createDialogArea(Composite parent) {
		Composite comp = (Composite)super.createDialogArea(parent);
	
		
		comp.setLayout(new GridLayout());
	
		GridData gridData;

		Group grpEnum = new Group(comp, SWT.SHADOW_ETCHED_IN);
		grpEnum.setText(groupTitle);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		
		grpEnum.setLayout(layout);
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		grpEnum.setLayoutData(gridData);
	
		lstEnums = new List(grpEnum, SWT.LEFT | SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		for(String p: hist) {
			lstEnums.add(p);
		}
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.heightHint = 200;
		lstEnums.setLayoutData(gridData);
		lstEnums.addMouseListener(new MouseListener() {

			public void mouseDoubleClick(MouseEvent e) {
				okPressed();
			}

			public void mouseDown(MouseEvent e) {
			}
			public void mouseUp(MouseEvent e) {
			}
		});
		lstEnums.addKeyListener(this);
		
		lblSearch = new Label(grpEnum, SWT.SHADOW_IN);
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = false;
		gridData.horizontalAlignment = GridData.FILL;
		lblSearch.setLayoutData(gridData);
		lblSearch.setVisible(false);
		
		Composite grpButtons = new Composite(grpEnum, SWT.SHADOW_NONE);
		GridLayout layButtons = new GridLayout();
		layButtons.numColumns = 2;
		grpButtons.setLayout(layButtons);
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		grpButtons.setLayoutData(gridData);
		
		
		
		return comp;
	}
	
	protected void okPressed() {
		result = lstEnums.getSelection()[0];
		ind = lstEnums.getSelectionIndex();
		super.okPressed();
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(title);
	}
	
	private boolean isSearchable(char c) {
		if ("1234567890qwertyuiopasdfghjklzxcvbnm!@#$%^&*()_-=+{}|[]\\:;\"\'<>?,./`~".indexOf(
				Character.toLowerCase(c)) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.keyCode == SWT.ESC) {
			if (search.equals("")) {
				this.cancelPressed();
				return;
			} else {
				search = "";
				lblSearch.setText(search);
				lblSearch.setVisible(false);
				return;
			}
		} else if (e.keyCode == SWT.TRAVERSE_RETURN) {
			this.okPressed();
			return;
		} else if (e.character == SWT.BS) {
			search = search.substring(0, search.length() - 1);
		} else if (isSearchable(e.character)) {
			search += Character.toLowerCase(e.character);
		} else {
			return;
		}
		lblSearch.setText(search);
		lblSearch.setVisible(true);
		for (String option: lstEnums.getItems()) {
			if (option.toLowerCase().startsWith(search)) {
				lstEnums.setSelection(new String[] { option });
				return;
			}
		}
		this.getShell().getDisplay().beep();
	}

	public void keyReleased(KeyEvent e) {
		
	}
}
