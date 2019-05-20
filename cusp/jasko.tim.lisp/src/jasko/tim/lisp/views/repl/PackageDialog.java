package jasko.tim.lisp.views.repl;


import jasko.tim.lisp.LispPlugin;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.dialogs.FilteredList;

public class PackageDialog extends Dialog implements KeyListener {
	ArrayList<String> loadedPkgs;
	ArrayList<String> packages;
	private HashMap<String,String> infoMap = new HashMap<String,String>();
	private HashMap<String,String> linkMap = new HashMap<String,String>();
	String result = "";
	String currPackage;
	String title = "";
	String groupTitle = "";

	private FilteredList lstEnums;
	private Label lblSearch;
	private Label lblLoaded;
	private StyledText txtDoc;
	private Label[] hlinks;
	private String[] urls;
	private String[] hlinktxt;
	
	boolean loadDialog;
	
	//load package dialog
	public PackageDialog(Shell parentShell, ArrayList<String> loadedPkgs,
			ArrayList<String> packages,	ArrayList<String> infos,
			ArrayList<String> links, //separated by ';'
			String currPackage) {
		super(parentShell);
		this.currPackage = currPackage;
		this.packages = packages;
		this.loadedPkgs = loadedPkgs;
		
		title = "Load package";
		groupTitle = "Installed packages";
		infoMap.clear();
		linkMap.clear();
		if( packages.size() == infos.size() 
				&& packages.size() == links.size() ){
			for(int i = 0; i < packages.size(); ++i){
				infoMap.put(packages.get(i), infos.get(i));
				linkMap.put(packages.get(i), links.get(i));
			}
		} else {
			infoMap.clear();
			linkMap.clear();
		}
		loadDialog = true;
		Collections.sort(this.packages);
	}
	
	//change package dialog
	public PackageDialog(Shell parentShell, ArrayList<String> packages, 
			String currPackage) {
		super(parentShell);
		this.currPackage = currPackage;
		this.packages = packages;
		groupTitle = "Current Package: " + currPackage;
		title = "Change Package";
		loadDialog = false;
		Collections.sort(this.packages);
	}
	
	//test package dialog
	public PackageDialog(Shell parentShell, ArrayList<String> packages, 
			String currPackage, boolean test) {
		super(parentShell);
		this.currPackage = currPackage;
		this.packages = packages;
		groupTitle = "Most recent test package: " + currPackage;
		title = "Run tests in package";
		loadDialog = false;
		Collections.sort(this.packages);
	}
		
	public String getPackage() {
		return result;
	}
	
	protected Control createDialogArea(Composite parent) {
		Composite comp = (Composite)super.createDialogArea(parent);
	
		GridLayout compLayout = new GridLayout();
		comp.setLayout(compLayout);
	
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
		lstEnums = new FilteredList(grpEnum, SWT.LEFT | SWT.BORDER 
				| SWT.V_SCROLL | SWT.SINGLE, new LabelProvider(), 
				true, false, true);
		lstEnums.setElements(packages.toArray());
		if( packages.contains(currPackage) ){
			lstEnums.setSelection(new String[] { currPackage });			
		} else if ( packages.size() > 0 ){
			lstEnums.setSelection(new String[] { packages.get(0) });
		}
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.heightHint = 100;
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
		
		if( loadDialog ){
			lstEnums.addSelectionListener(new SelectionListener(){
				public void widgetDefaultSelected(SelectionEvent e){
					widgetSelected(e);
				};
				
				public void widgetSelected(SelectionEvent e){
					displayInfo();
				};
			});

			lblLoaded = new Label(grpEnum, SWT.SHADOW_IN);
			gridData = new GridData();
			gridData.grabExcessHorizontalSpace = true;
			gridData.grabExcessVerticalSpace = false;
			gridData.horizontalAlignment = GridData.FILL;
			lblLoaded.setLayoutData(gridData);
			lblLoaded.setVisible(false);
			
			txtDoc = new StyledText(grpEnum,
					SWT.BORDER | SWT.V_SCROLL );
			gridData = new GridData();
			gridData.grabExcessHorizontalSpace = true;
			gridData.grabExcessVerticalSpace = true;
			gridData.horizontalAlignment = GridData.FILL;
			gridData.verticalAlignment = GridData.FILL;
			gridData.heightHint = 70;
			gridData.widthHint = 400;
			txtDoc.setLayoutData(gridData);
			txtDoc.setEditable(false);
			txtDoc.setWordWrap(true);
			
			Label lbl = new Label(grpEnum, SWT.SHADOW_IN);
			gridData = new GridData();
			gridData.grabExcessHorizontalSpace = true;
			gridData.grabExcessVerticalSpace = false;
			gridData.horizontalAlignment = GridData.FILL;
			lbl.setLayoutData(gridData);
			lbl.setVisible(true);
			lbl.setText("Additional info:");
			
			urls = new String[4];
			hlinks = new Label[4];
			hlinktxt = new String[4];
			for( int i = 0; i < 4; ++i ){
				hlinks[i] = new Label(grpEnum, SWT.SHADOW_IN);
				gridData = new GridData();
				gridData.grabExcessHorizontalSpace = true;
				gridData.grabExcessVerticalSpace = false;
				gridData.horizontalAlignment = GridData.FILL;
				hlinks[i].setLayoutData(gridData);
				hlinks[i].setVisible(false);
				hlinks[i].setCursor(new Cursor(null,SWT.CURSOR_HAND));
				hlinks[i].setForeground(new Color(null,0,0,255));
			}
			hlinktxt[0] = "readme";
			hlinktxt[1] = "readme.html";
			hlinktxt[2] = "package.html";
			hlinktxt[3] = "package/index.html";
			hlinks[0].addMouseListener(new MouseListener(){
				public void mouseDoubleClick(MouseEvent e){
					String url = urls[0];
					lblLoaded.setText(url);
					callUrl(url);
				}

				public void mouseDown(MouseEvent e){
					mouseDoubleClick(e);
				}
				
				public void mouseUp(MouseEvent e){
					mouseDoubleClick(e);						
				}
			});
			hlinks[1].addMouseListener(new MouseListener(){
				public void mouseDoubleClick(MouseEvent e){
					String url = urls[1];
					lblLoaded.setText(url);
					callUrl(url);
				}

				public void mouseDown(MouseEvent e){
					mouseDoubleClick(e);
				}
				
				public void mouseUp(MouseEvent e){
					mouseDoubleClick(e);						
				}
			});
			hlinks[2].addMouseListener(new MouseListener(){
				public void mouseDoubleClick(MouseEvent e){
					String url = urls[2];
					lblLoaded.setText(url);
					callUrl(url);
				}

				public void mouseDown(MouseEvent e){
					mouseDoubleClick(e);
				}
				
				public void mouseUp(MouseEvent e){
					mouseDoubleClick(e);						
				}
			});
			hlinks[3].addMouseListener(new MouseListener(){
				public void mouseDoubleClick(MouseEvent e){
					String url = urls[3];
					lblLoaded.setText(url);
					callUrl(url);
				}

				public void mouseDown(MouseEvent e){
					mouseDoubleClick(e);
				}
				
				public void mouseUp(MouseEvent e){
					mouseDoubleClick(e);						
				}
			});
		}
		
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
		String pkg = (String)lstEnums.getSelection()[0];
		if( loadDialog && loadedPkgs.contains(pkg.toUpperCase()) ){
			lblLoaded.setText("Package " + pkg 
					+ " is loaded. Press Esc to cancel.");
			lblLoaded.setVisible(true);
			return;
		} else {
			result = (String)lstEnums.getSelection()[0];
			super.okPressed();			
		}
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(title);
	}
	
	private void displayInfo(){
		if( lstEnums.getSelectionIndex() < 0 ){
			lblLoaded.setVisible(false);
			txtDoc.setText("");
			for( int i = 0; i < 4; ++i ){
				hlinks[i].setVisible(false);
			}
			return;
		}
		String pkg = (String)lstEnums.getSelection()[0];
		String txt = infoMap.get(pkg);
		if( txt != null ){
			txtDoc.setText(txt);
			txtDoc.setToolTipText(txt);
			if( loadedPkgs.contains(pkg.toUpperCase()) ){
				lblLoaded.setText("Package "+pkg + " is loaded");
			} else {
				lblLoaded.setText("Package "+pkg + " is NOT loaded");
			}
			lblLoaded.setVisible(true);
		}
		
		//process links
		String linkstxt = linkMap.get(pkg);
		if( linkstxt != null ){
			String[] links = linkstxt.split(";");
			int j = 0;
			for( int i = 0; i < Math.min(4, links.length); ++i ){
				if( !links[i].equals("") && !links[i].equalsIgnoreCase("nil") ){
					hlinks[j].setText(hlinktxt[i]);
					hlinks[j].setVisible(true);
					urls[j] = "file://" 
						+ links[i].substring(1);//substring to remove leading P
					++j;
				}
			}
			for( int i = j; i < 4; ++i ){
				hlinks[i].setVisible(false);
			}			
		}
	}
	
	private boolean isSearchable(char c) {
		if ("1234567890qwertyuiopasdfghjklzxcvbnm!@#$%^&*()_-=+{}|[]\\:;\"\'<>?,./`~"
				.indexOf(Character.toLowerCase(c)) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void keyPressed(KeyEvent e) {
		String search = lstEnums.getFilter();
		if (e.keyCode == SWT.ESC) {
			if (search.equals("")) {
				this.cancelPressed();
				return;
			} else {
				lstEnums.setFilter("");
				lblSearch.setText("");
				lblSearch.setVisible(false);
				return;
			}
		} else if (e.keyCode == SWT.ARROW_DOWN || e.keyCode == SWT.ARROW_UP
				|| e.character == SWT.CR || e.character == SWT.LF){
			lstEnums.setFocus();
		} else if (e.keyCode == SWT.TRAVERSE_RETURN) {
			this.okPressed();
			return;
		} else if (e.character == SWT.BS) {
			lstEnums.setFilter(search.substring(0, search.length() - 1));
		} else if (isSearchable(e.character)) {
			search += Character.toLowerCase(e.character);
			lstEnums.setFilter(search);
		} else {
			return;
		}
		lblSearch.setText(lstEnums.getFilter());
		lblSearch.setVisible(true);
	}

	public void keyReleased(KeyEvent e) {
		
	}

    private void callUrl(String url) {
		IWorkbenchBrowserSupport browser =
			LispPlugin.getDefault().getWorkbench().getBrowserSupport();
		try {
			browser.createBrowser("jasko.tim.lisp.packages")
			   .openURL(new URL(url));
		} catch (PartInitException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    }

}
