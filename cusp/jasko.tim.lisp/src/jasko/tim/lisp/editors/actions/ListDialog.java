package jasko.tim.lisp.editors.actions;


import jasko.tim.lisp.CuspResources;
import jasko.tim.lisp.cusp.LispNode;
import jasko.tim.lisp.cusp.LispParser;

import java.util.ArrayList;


import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class ListDialog<T>  extends Dialog implements KeyListener {
	private String result;
	private T resultData;
	//int resultIndex = 0;
	
	private ArrayList<String> options;
	private ArrayList<T> data;
	private ArrayList<String> tips = null;
	
	//private List lstEnums;
	private Tree treeOptions;
	private Label lblTip;
	private Label lblSearch;
	private String search = "";
	
	public ListDialog(Shell parentShell, ArrayList<String> options, ArrayList<T> data) {
		super(parentShell);
		this.options = new ArrayList<String>(options);
		this.data = data;
	}
	
	public ListDialog(Shell parentShell, ArrayList<String> options, ArrayList<T> data, ArrayList<String> tips) {
		super(parentShell);
		this.options = new ArrayList<String>(options);
		this.data = data;
		this.tips = tips;
	}
	
	public void setTitle(String title) {
		this.getShell().setText(title);
	}
		
	public String getResult() {
		return result;
	}
	
	public T getData() {
		return resultData;
	}
	
	public void setSelection(int index) {
		setSelection(treeOptions.getItem(index));
	}
	
	public void setSelection(TreeItem item) {
		treeOptions.setSelection(item);
		if (tips != null) {
			lblTip.setText(item.getData("tip").toString());
		}
	}
	
	/*public void setSelection(int index) {
		lstEnums.setSelection(index);
		if (tips != null) {
			lblTip.setText(tips.get(index));
		}
	}*/
	
	protected Control createDialogArea(Composite parent) {
		Composite comp = (Composite)super.createDialogArea(parent);
		
	
		comp.setLayout(new GridLayout());
	
		GridData gridData;

		Group grpEnum = new Group(comp, SWT.SHADOW_ETCHED_IN);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		
		grpEnum.setLayout(layout);
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		grpEnum.setLayoutData(gridData);
	
		/*lstEnums = new List(grpEnum, SWT.LEFT | SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		for(String p: options) {
			lstEnums.add(p);
		}*/
		treeOptions = new Tree(grpEnum, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		for (int i=0; i < options.size() && i < data.size(); ++i) {
			TreeItem item = new TreeItem(treeOptions, SWT.NONE);
			String text = options.get(i);
			item.setText(text);
			item.setData(data.get(i));
			if (tips != null && i < tips.size()) {
				item.setData("tip", tips.get(i));
			}
			LispNode type = LispParser.parse(text);
			item.setImage(CuspResources.getImageForType(type.get(0).get(0).value));
		}
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.heightHint = 100;
		treeOptions.setLayoutData(gridData);
		treeOptions.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				okPressed();
			}

			public void widgetSelected(SelectionEvent e) {
				TreeItem item = (TreeItem)e.item;
				if (tips != null) {
					lblTip.setText(item.getData("tip").toString());
				}
			}
		});
		treeOptions.addKeyListener(this);
		
		if (tips != null) {
			lblTip = new Label(grpEnum, SWT.NONE);
			lblTip.setText(tips.get(0));
			
			gridData = new GridData();
			gridData.grabExcessHorizontalSpace = true;
			gridData.grabExcessVerticalSpace = false;
			gridData.horizontalAlignment = GridData.FILL;
			lblTip.setLayoutData(gridData);
		}
		
		setSelection(0);
		
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
	
	@SuppressWarnings("unchecked")
	protected void okPressed() {
		TreeItem item = treeOptions.getSelection()[0];
		result = item.getText();
		resultData = (T)item.getData();
		super.okPressed();
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Select one");
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
		for (TreeItem option: treeOptions.getItems()) {
			if (option.getText().toLowerCase().startsWith(search)) {
				setSelection(option);
				return;
			}
		}
		this.getShell().getDisplay().beep();
	}

	public void keyReleased(KeyEvent e) {
		
	}
}
