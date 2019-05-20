package jasko.tim.lisp.views;

import jasko.tim.lisp.CuspResources;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.cusp.LispNode;
import jasko.tim.lisp.cusp.LispParser;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class XrefView extends ViewPart implements KeyListener {
	public static final String ID = "jasko.tim.lisp.views.XrefView";

	private ArrayList<String> options;
	private ArrayList<LispNode> data;
	private ArrayList<String> tips = null;
	
	private Tree treeOptions;
	private Label lblTip;
	private Label lblSearch;
	private Label lblTitle;
	private String search = "";	
	
	public static XrefView getXrefView() {
		IWorkbenchPage page = PlatformUI.getWorkbench()
		    .getActiveWorkbenchWindow().getActivePage();
		try {
			IViewPart view = page.showView(XrefView.ID);
			if (view != null && view instanceof XrefView) {
				XrefView me = (XrefView) view;
				return me;
			} else {
				return null;
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void showResults(String title, ArrayList<String> options, 
			ArrayList<LispNode> data, ArrayList<String> tips){
		lblTitle.setText(title);
		this.options = options;
		this.data = data;
		this.tips = tips;
		populateTree();
	}
	
	private void populateTree(){
		treeOptions.removeAll();
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
	}
	
	@Override
	public void createPartControl(Composite parent) {
		GridData gridData;

		Group grpEnum = new Group(parent, SWT.SHADOW_ETCHED_IN);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		
		grpEnum.setLayout(layout);
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		grpEnum.setLayoutData(gridData);

		lblTitle = new Label(grpEnum, SWT.SHADOW_IN);
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = false;
		gridData.horizontalAlignment = GridData.FILL;
		lblTitle.setLayoutData(gridData);
		lblTitle.setVisible(true);
		lblTitle.setText("Xref (find Callers/Callees) search results:");
		
		treeOptions = new Tree(grpEnum, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
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
		
	}

	private void okPressed() {
		TreeItem item = treeOptions.getSelection()[0];
		LispNode chosen = (LispNode)item.getData();
		
		LispNode location = chosen.getf(":location");
		String path = location.getf(":file").value;
		LispNode positionNode = location.getf(":position");
		LispNode snippetNode = location.getf(":snippet");
		
		if( positionNode.value.equals("") ){
			for( LispNode x : chosen.params ){
				positionNode = x.getf(":position");
				if( !positionNode.value.equals("") ){
					break;
				}
			}
		}
		
		if( snippetNode.value.equals("") ){
			for( LispNode x : chosen.params ){
				snippetNode = x.getf(":snippet");
				if( !snippetNode.value.equals("") ){
					break;
				}
			}
		}
		
		int position = positionNode.asInt();
		String snippet = snippetNode.value;
		
		LispEditor.jumpToDefinition(path, position, snippet);
	}
	
	@Override
	public void setFocus() {
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
				return;
			} else {
				search = "";
				lblSearch.setText(search);
				lblSearch.setVisible(false);
				return;
			}
		} else if (e.character == SWT.CR || e.character == SWT.LF) {
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
	}

	public void keyReleased(KeyEvent e) {
		
	}	

	private void setSelection(TreeItem item) {
		if( treeOptions.getItemCount() > 0 ){
			treeOptions.setSelection(item);
			if (tips != null) {
				lblTip.setText(item.getData("tip").toString());
			}			
		}
	}

	private void setSelection(int index) {
		if( treeOptions.getItemCount() > 0 ){
			setSelection(treeOptions.getItem(index));
		}
	}

}
