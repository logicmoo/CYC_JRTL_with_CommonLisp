package jasko.tim.lisp.views;

import jasko.tim.lisp.*;
import jasko.tim.lisp.util.*;
import jasko.tim.lisp.views.repl.*;
import jasko.tim.lisp.cusp.*;
import jasko.tim.lisp.editors.*;
import jasko.tim.lisp.editors.LispSelectionMixin.SelectionPosition;
import jasko.tim.lisp.editors.actions.*;
import jasko.tim.lisp.inspector.InspectorRunnable;
import jasko.tim.lisp.preferences.PreferenceConstants;

import java.util.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.*;
import org.eclipse.jface.text.*;
import org.eclipse.jface.text.source.*;

import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.jface.commands.ActionHandler;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

/*
 * TODO: Notes on future Repl refactoring
 * Goal - factor out repl.
 * 
 * Repl compound (ReplEditor in, and ReplHistory history), should be
 * substitutable by any class (so create Interface) which
 * implements the following functions (some of these eventually should be
 * moved inside repl and handled there):
 * 
 * - void clearHistory() to use in places where history.clear() is now used
 * - void clearRepl() to use in places where in is cleared
 * - void appendText(String msg) to append msg to repl
 * - void appendInspectable(String text, String id)
 *    also should call cusp.sendInspectInspectedPart(partNum, new InspectorRunnable()),
 *    when inspectable is selected
 * - void scrollDown()
 * - ILispEditor getILispEditor() - to install LispConfiguration
 * - void setFont(Font font)
 * - String get() get string that was edited in Repl (to send for evaluation)
 * - void selectAll()
 */

/**
 * @author Tim Jasko
 */

public class ReplView extends ViewPart implements SelectionListener {
	public static final String ID = "jasko.tim.lisp.views.ReplView";

	protected ArrayList<String> prevCommands = new ArrayList<String>();

	protected Stack<State> states = new Stack<State>();

	protected CuspInterface cusp;
	private boolean sentEvalByKeyboard = false;
	private Listener sashListener;

	protected Sash replComposite;
	protected ReplHistory history;
	protected ReplEditor in;
	protected LispConfiguration inconfig;

	protected Composite parentControl;
	protected Composite mainView;
	public Composite debugView;
	protected Tree debugTree;
	protected Label debugLabel;

	protected Button btn;
	protected Label replPackage;
	private boolean inReadMode;

	private boolean replInited = false;

	public boolean isReplInited(){
		return replInited;
	}

	/* updates current package displayed */
	public void setPackageString(String pkg){
		if(cusp != null ){
			IStatusLineManager slm = 
				getViewSite().getActionBars().getStatusLineManager();
			slm.setMessage("CL: " + cusp.getLispVersion() + 
					" | Cusp: " + LispPlugin.getVersion() +
					" | Current package: " + pkg);
			if( replPackage != null ){
				replPackage.setText("Current package: "+pkg);
			}
		}
	}

	protected void resetState() {
		while (states.size() > 1) {
			popState();
		}

		debugInfos.clear();
	}

	public static void switchToRepl() {
		IWorkbenchPage page = 
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		LispPlugin.findREPL().setFocus();

	}

	public boolean isDebugViewActive () {
		return debugView.isVisible();

	}

	public static ReplView getInstance() {
		IWorkbenchPage page = 
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		IViewPart view = page.findView(ReplView.ID);
		if (view instanceof ReplView) {
			return (ReplView) view;
		} else {
			return null;
		}
	}

	public void setFocus() {
		if (currState() instanceof DebugState) {
			debugTree.setFocus();
		} else {
			// in is null if connection to cusp failed, 
			// because as a workaround just a label is created in view
			if (in != null) {
				in.getControl().setFocus();
			}
		}
	}

	protected CuspInterface getCusp() {
		return LispPlugin.getDefault().getCusp();
	}

	public void callUrl(String url) {
		in.callUrl(url);		
	}



	private class ReplEditor extends SourceViewer implements ILispEditor {
		LispSelectionMixin mixin = new LispSelectionMixin(this);
		public void clearHistory() {
			// TODO Auto-generated method stub
			mixin.clearHistory();
		}

		public void flagSelectionAction() {
			// TODO Auto-generated method stub
			mixin.flagSelectionAction();
		}

		public Integer[] peekHistory() {
			return mixin.peekHistory();
		}

		public void popHistory() {
			mixin.popHistory();
		}

		public boolean selectionActionOccured() {
			return mixin.selectionActionOccured();
		}

		public void addHistory(SelectionPosition range) {
			mixin.addHistory(range);		
		}

		private final LispConfiguration config = 
			new LispConfiguration(this, LispPlugin.getDefault().getColorManager());
		/*
		 * private final CurrentExpressionHighlightingListener highlighter = new
		 * CurrentExpressionHighlightingListener();
		 */

		public IFile getIFile(){
			return null;
		}

		public ReplEditor (Composite comp2, VerticalRuler ruler, int i) {
			super(comp2, ruler, i);

			setEditable(true);
			configure(config);

			IDocument doc = new Document();
			LispDocumentProvider.connectPartitioner(doc);
			setDocument(doc, new AnnotationModel());
			showAnnotations(false);
			showAnnotationsOverview(false);
			// highlighter.install(this);
		}

		public String showParameterHints () {
			return config.showParameterHints();
		}

		public String showContentCompletions () {
			return config.showContentCompletions();
		}

		public void callUrl(String url) {
			ITextSelection ts = (ITextSelection) getSelectionProvider().getSelection();
			LispConfiguration.callUrl(url,ts.getOffset(),getDocument());
		}

		public void showMessage(String msg) {
			MessageBox mb = new MessageBox(getTextWidget().getShell(), SWT.OK);
			mb.setText("Message from Repl");
			mb.setMessage(msg);
			mb.open(); 	
		}
	}

	private void addUndoManager(final TextViewer textViewer) {
		// remembers 1000 edit commands
		final TextViewerUndoManager undoManager = new TextViewerUndoManager(1000);

		// add listeners
		undoManager.connect(textViewer);
		textViewer.setUndoManager(undoManager);

		StyledText styledText = textViewer.getTextWidget();
		styledText.addVerifyListener(new VerifyListener(){
			public void verifyText(VerifyEvent e){
				undoManager.endCompoundChange();
			}
		});

		styledText.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
			
				if (isUndoKeyPress(e)) {
					textViewer.doOperation(ITextOperationTarget.UNDO);
					//bug fix

				} else if (isRedoKeyPress(e)) {
					textViewer.doOperation(ITextOperationTarget.REDO);
				}
			}

			private boolean isUndoKeyPress(KeyEvent e) {
				// CTRL + z
				return ((e.stateMask & SWT.CONTROL) > 0)
				&& ((e.keyCode == 'z') || (e.keyCode == 'Z'));
			}

			private boolean isRedoKeyPress(KeyEvent e) {
				// CTRL + y
				return ((e.stateMask & SWT.CONTROL) > 0)
				&& ((e.keyCode == 'y') || (e.keyCode == 'Y'));
			}

			public void keyReleased(KeyEvent e) {
				// do nothing
			}
		});
	}

	private class HandlerDef {
		private final Class<?> the_class;
		private final String id;
		private final boolean edit_or_view;

		public HandlerDef(Class<?> hclass, String hid, boolean hedit_or_view) {
			the_class = hclass;
			id = hid;
			edit_or_view = hedit_or_view;
		}

		public LispAction newClassInstance(ILispEditor editor, ReplView view) {
			Object [] args = { null };
			Class<?> [] ctor_args = { null }; 

			if (edit_or_view) {
				ctor_args[0] = ILispEditor.class;
				args[0] = editor;
			} else {
				ctor_args[0] = ReplView.class;
				args[0] = view;
			}

			try {
				Constructor<?> ctor = the_class.getConstructor(ctor_args);
				return (LispAction) ctor.newInstance(args);
			}
			catch (NoSuchMethodException e) {
				System.err.println("HandlerDef throws NoSuchMethodException");
				e.printStackTrace();
				return null;
			} catch (SecurityException e) {
				System.err.println("HandlerDef throws SecurityException");
				e.printStackTrace();
				return null;
			} catch (InstantiationException e) {
				System.err.println("HandlerDef throws InstatiationException");
				e.printStackTrace();
				return null;
			} catch (IllegalAccessException e) {
				System.err.println("HandlerDef throws IllegalAccessException");
				e.printStackTrace();
				return null;
			} catch (IllegalArgumentException e) {
				System.err.println("HandlerDef throws IllegalArgumentException");
				e.printStackTrace();
				return null;
			} catch (InvocationTargetException e) {
				System.err.println("HandlerDef throws InvocationTargetException");
				e.printStackTrace();
				return null;
			}
		}

		public Class<?> getThe_class() {
			return the_class;
		}

		public String getId() {
			return id;
		}
	};

	public void createPartControl(Composite parent) {
		parentControl = parent;
		parent.setLayout(new GridLayout(1, false));
		mainView = new Composite(parent, SWT.NONE);
		debugView = new Composite(parent, SWT.BORDER);

		hideFrame(debugView);
		showFrame(mainView);

		cusp = getCusp();

		if (cusp == null || !cusp.isConnected()) {
			// We weren't able to connect to Lisp. If you don't catch this,
			// Eclipse shows the backtrace where the Repl should be, and then
			// people
			// email you asking what's going on. This is the much better
			// solution.
			Label lbl = new Label(parent, SWT.BORDER);
			lbl.setText(cusp.getErrorMessage());

			return;
		}
		System.out.println("**connected:" + cusp.isConnected());
		// layout controllers we need in a few places
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.verticalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = true;

		GridLayout layout = new GridLayout(1, false);
		layout.marginLeft = 1;
		layout.marginTop = 1;
		layout.marginRight = 1;
		layout.marginBottom = 1;

		// Create the debug view
		debugView.setLayout(layout);

		debugLabel = new Label(debugView, SWT.BORDER|SWT.WRAP);
		debugLabel.setText("Debugging");

		debugTree = new Tree(debugView, SWT.SINGLE);
		debugTree.setLayoutData(gd);
		debugTree.setLayout(layout);


		// Create the main repl view

		parent = mainView;

		parent.setLayout(layout);

		final Composite notButtons = new Composite(parent, SWT.NONE);
		notButtons.setLayoutData(gd);

		final Sash sash = new Sash(notButtons, SWT.HORIZONTAL);
		replComposite = sash;

		// Put a border around our text viewer
		Composite comp = new Composite(notButtons, SWT.BORDER);
		layout = new GridLayout(1, false);
		layout.marginLeft = 0;
		layout.marginTop = 0;
		layout.marginRight = 0;
		layout.marginBottom = 0;
		layout.horizontalSpacing = 0;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		comp.setLayout(layout);
		// comp.setLayoutData(gd);

		Font baseFont = JFaceResources.getTextFont();
		FontData fd = baseFont.getFontData()[0];
		fd.setHeight(LispPlugin.getDefault().getPreferenceStore()
				.getInt(PreferenceConstants.REPL_FONT_SIZE));
		Font newFont = new Font(Display.getDefault(), fd);

		history = new ReplHistory(comp);

		history.getControl().setLayoutData(gd);
		history.getTextWidget().setFont(newFont);

		Composite comp2 = new Composite(notButtons, SWT.BORDER);
		comp2.setLayout(layout);
		//EDIT: ADDED H_SCROLL
		in = new ReplEditor(comp2, new VerticalRuler(10),
				SWT.V_SCROLL |SWT.H_SCROLL| SWT.MULTI | SWT.LEFT | SWT.BORDER);
		inconfig = in.config;
		inReadMode = false;

		in.getControl().setLayoutData(gd);
		in.getTextWidget().setFont(newFont);
		in.appendVerifyKeyListener(new CheckEvalListener());
		in.appendVerifyKeyListener(new SelectAllListener());

		addUndoManager(in);
		IHandlerService keys = (IHandlerService) this.getSite().getService(IHandlerService.class);
		IContextService keyctx = (IContextService) this.getSite().getService(IContextService.class);

		keyctx.activateContext("jasko.tim.lisp.context1");

		HandlerDef [] handler_defs = {
				new HandlerDef(HyperSpecAction.class, "jasko.tim.lisp.actions.HyperSpecAction", true),
				new HandlerDef(LispDocAction.class, "jasko.tim.lisp.actions.LispDocAction", true),
				new HandlerDef(OpenHistoryAction.class, "jasko.tim.lisp.actions.OpenHistoryDialogAction", false),
				new HandlerDef(PreviousREPLCommandAction.class, "jasko.tim.lisp.actions.PreviousREPLCommandAction", false),
				new HandlerDef(NextREPLCommandAction.class, "jasko.tim.lisp.actions.NextREPLCommandAction", false),
				new HandlerDef(ContentAssistAction.class, "jasko.tim.lisp.editors.actions.ContentAssistAction", true),
				new HandlerDef(IndentAction.class, "jasko.tim.lisp.editors.actions.IndentAction", true),
				new HandlerDef(ExpandSelectionAction.class, "jasko.tim.lisp.editors.actions.ExpandSelectionAction", true),
				new HandlerDef(JumpForwardAction.class, "jasko.tim.lisp.editors.actions.JumpForwardAction", true),
				new HandlerDef(JumpBackAction.class, "jasko.tim.lisp.editors.actions.JumpBackAction", true),
				new HandlerDef(FindDefinitionAction.class, "jasko.tim.lisp.editors.actions.FindDefinitionAction", true),
				new HandlerDef(CommentingAction.class, "jasko.tim.lisp.editors.actions.CommentingAction", true),
				//new HandlerDef(SwitchFocusAction.class, "jasko.tim.lisp.actions.SwitchFocusAction", false)
		};



		for (int i = 0; i < handler_defs.length; ++i) {
			LispAction hdef = handler_defs[i].newClassInstance(in, this);
			hdef.setActionDefinitionId(handler_defs[i].getId());
			keys.activateHandler(handler_defs[i].getId(), new ActionHandler(hdef));

		}


		//IHandlerService key = (IHandlerService)PlatformUI.getWorkbench().
		//getActiveWorkbenchWindow().getService(IHandlerService.class);

		/*	HandlerDef def = new HandlerDef(SwitchFocusAction.class, "jasko.tim.lisp.editors.actions.SwitchFocusAction", true);
		LispAction action = def.newClassInstance(in,this);
		action.setActionDefinitionId(def.getId());
		keys.activateHandler(def.getId(),new ActionHandler(action));*/


		/*
		 * in.addTextListener(new ITextListener() { public void
		 * textChanged(TextEvent event) { try { if (event != null) {
		 * System.out.println("*" + event.getText() + ":" +
		 * event.getText().length()); if (event.getText().startsWith("\n") &&
		 * LispUtil.doParensBalance(in.getDocument())) { eval(); } } } catch
		 * (Exception e) { e.printStackTrace(); } } });
		 */

		/*
		 * gd = new GridData(); gd.horizontalAlignment = GridData.FILL;
		 * gd.heightHint = 50; gd.grabExcessHorizontalSpace = true;
		 * comp2.setLayoutData(gd);
		 */

		Composite buttonRow = new Composite(parent, SWT.NONE);
		buttonRow.setLayout(new RowLayout(SWT.HORIZONTAL));

		btn = new Button(buttonRow, SWT.PUSH);
		btn.setText("Send");
		btn.addSelectionListener( new OkListener());

		Button prev = new Button(buttonRow, SWT.PUSH);
		prev.setText("History");
		prev.addSelectionListener( new PrevListener(parent));

		replPackage = new Label(buttonRow, SWT.PUSH);
		setPackageString(cusp.getCurrPackage());

		// layout stuff

		final FormLayout form = new FormLayout ();
		notButtons.setLayout (form);

		FormData topData = new FormData ();
		topData.left = new FormAttachment (0, 0);
		topData.right = new FormAttachment (100, 0);
		topData.top = new FormAttachment (0, 0);
		topData.bottom = new FormAttachment (sash, 0);
		comp.setLayoutData (topData);

		final int limit = 20, percent = 60;
		final FormData sashData = new FormData ();
		sashData.left = new FormAttachment (0, 0);
		sashData.right = new FormAttachment (100, 0);
		sashData.top = new FormAttachment (percent, 0);
		sashData.bottom = new FormAttachment (percent, 5);
		sash.setLayoutData (sashData);
		// I have to handle this manually? Worst. Splitter. Ever.
		sashListener = new Listener () {
			public void handleEvent (Event e) {
				Rectangle sashRect = sash.getBounds ();
				if( sashRect.height == 0){ // sash is not displayed
					return;
				}

				Rectangle shellRect = notButtons.getClientArea ();
				//TODO: Gorsal- tell eclipse about error???
				if (shellRect.height!=0) {
					int top = shellRect.height - sashRect.height - limit;

					if( e == null ){
						e = new Event();
						e.y = (shellRect.height*6)/10;
						e.x = 0;
					}
					if( e.y == 0) {
						if( limit <= top){
							if( sashRect.y <= limit ){
								e.y = limit;
							} else if ( sashRect.y >= top ){
								e.y = top;
							} else {
								e.y = sashRect.y;
							}
						} else {
							e.y = limit;
						} 					
					} else {
						e.y = Math.max(Math.min(e.y, top), limit); 					
					}
					if (e.y != sashRect.y)  {
						sashData.top = new FormAttachment (0, e.y);
						sashData.bottom = new FormAttachment (0, e.y + 5);
						notButtons.layout ();
					}		
				}
			}
		};
		sash.addListener(SWT.Selection,sashListener);

		parent.addListener(SWT.RESIZE,sashListener);
		parent.addListener(SWT.Resize,sashListener);


		FormData bottomData = new FormData ();
		bottomData.left = new FormAttachment (0, 0);
		bottomData.right = new FormAttachment (100, 0);
		bottomData.top = new FormAttachment (sash, 0);
		bottomData.bottom = new FormAttachment (100, 0);
		comp2.setLayoutData (bottomData);

		parent.getShell().setDefaultButton(btn);

		pushEvalState();

		fillToolBar(parent);
		fillMenu(parent);

		/*
 		if (cusp != null ) {

 			setPackageString(cusp.getCurrPackage());
 			getCusp().sendEval("(format nil \"You are running ~a ~a via Cusp " 
 					+ LispPlugin.getVersion() 
 					+ "\" (lisp-implementation-type) (lisp-implementation-version))\n",
 					new ReturnHandler());
 			// appendText("You are running " + cusp.getLispVersion() +
 			// " via Cusp " + LispPlugin.getVersion()+"\n");
 			setPackageString(cusp.getCurrPackage());
 		}
		 */

		registerCuspListeners();

		parentControl.layout(false);

		// reposition widgets on paint event
		/*
		 * history.getTextWidget().addPaintObjectListener(new
		 * PaintObjectListener() { public void paintObject(PaintObjectEvent
		 * event) { StyleRange style = event.style; int start = style.start;
		 * 
		 * for (int i = 0; i < offsets.size(); i++) { int offset =
		 * offsets.get(i); if (start == offset) { Point pt =
		 * controls.get(i).getSize(); Point loc =
		 * history.getTextWidget().getLocationAtOffset(offset);
		 * System.out.println("*" + loc); int x = loc.x + 5; int y = loc.y +
		 * event.ascent - 2*pt.y/3; controls.get(i).setLocation(x, y); break; } } }
		 * });
		 */
		if ( LispPlugin.getDefault().getPreferenceStore()
				.getBoolean(PreferenceConstants.CONSOLE_COMPILER_LOG)){
			LispPlugin.getDefault().out("Lisp compiler log:");			
		}
		replInited = true;
	}

	private void hideFrame(Composite control) {
		GridData hider = new GridData();
		hider.exclude = true;
		control.setLayoutData(hider);
		control.setVisible(false);

		parentControl.layout(false);
	}

	private void showFrame(Composite control) {
		GridData shower = new GridData();
		shower.horizontalAlignment = SWT.FILL;
		shower.verticalAlignment = GridData.FILL;
		shower.grabExcessHorizontalSpace = true;
		shower.grabExcessVerticalSpace = true;
		shower.exclude = false;
		control.setLayoutData(shower);
		control.setVisible(true);

		parentControl.layout(false);
	}

	protected void fillMenu(Composite parent) {
		IMenuManager menuMgr = this.getViewSite().getActionBars().getMenuManager();
		menuMgr.add(new Action("Increase Text Size") {
			public void run() {
				StyledText history = ReplView.this.history.getTextWidget();

				Font baseFont = history.getFont();
				FontData fd = baseFont.getFontData()[0];
				fd.setHeight(fd.getHeight() + 1);
				LispPlugin.getDefault().getPreferenceStore()
				.setValue(PreferenceConstants.REPL_FONT_SIZE, fd.getHeight());
				Font newFont = new Font(Display.getDefault(), fd);

				history.setFont(newFont);
				in.getTextWidget().setFont(newFont);

				baseFont.dispose();
			}
		});

		menuMgr.add(new Action("Decrease Text Size") {
			public void run() {
				StyledText history = ReplView.this.history.getTextWidget();

				Font baseFont = history.getFont();
				FontData fd = baseFont.getFontData()[0];
				fd.setHeight(fd.getHeight() - 1);
				LispPlugin.getDefault().getPreferenceStore()
				.setValue(PreferenceConstants.REPL_FONT_SIZE, fd.getHeight());
				Font newFont = new Font(Display.getDefault(), fd);

				history.setFont(newFont);
				in.getTextWidget().setFont(newFont);

				baseFont.dispose();
			}
		});
	}

	private Action connectButton;
	private Action loadPackageButton;
	private Action packageButton;
	private Action pauseButton;
	private Action clearButton;
	private Action stepButton;
	private Action showCuspFramesButton;
	private Action runTestsButton;

	protected void fillNormalToolBar() {
		if (clearButton != null) {
			IToolBarManager tbm = this.getViewSite().getActionBars().getToolBarManager();

			tbm.removeAll();
			tbm.add(clearButton);
			tbm.add(pauseButton);
			tbm.add(packageButton);
			tbm.add(loadPackageButton);
			tbm.add(connectButton);
			tbm.add(runTestsButton);
			tbm.update(true);
		}
	}

	public void focusREPL ()
	{
		this.setFocus();
	}

	protected void fillDebugToolBar() {
		if (stepButton != null) {
			IToolBarManager tbm = this.getViewSite().getActionBars().getToolBarManager();

			tbm.removeAll();
			tbm.add(stepButton);
			stepButton.setEnabled(true);
			tbm.add(showCuspFramesButton);
			tbm.add(connectButton);
			tbm.update(true);
		}
	}

	protected void fillToolBar(Composite parent) {
		loadPackageButton = new Action("Load Package") {
			public void run() {
				cusp.sendGetInstalledPackages(new CuspRunnable() {
					public void run() {
						final LispNode installedPkgsWithInfo = 
							LispParser.parse(result.getf(":return").getf(":ok").get(1).value);

						cusp.sendGetAvailablePackages(new CuspRunnable() {
							public void run() {
								LispNode packages = result.getf(":return").getf(":ok");
								ArrayList<String> loadedPkgs = new ArrayList<String>();
								for (LispNode p : packages.params) {
									loadedPkgs.add(p.value);
								}

								LispNode instPkgs = installedPkgsWithInfo;

								ArrayList<String> pkgs = new ArrayList<String>();
								ArrayList<String> pkgsdoc = new ArrayList<String>();
								ArrayList<String> pkgslinks = new ArrayList<String>();
								for( LispNode nd : instPkgs.get(0).params ){
									if( nd.params.size() >= 3 ){
										pkgs.add(nd.get(0).value);
										LispNode infos = nd.get(1);
										String strinfo = "";
										for( LispNode info: infos.params ){
											if( !info.value.equals("") 
													&& !info.value.equalsIgnoreCase("nil")){
												strinfo += info.value + "\n";
											}
										}
										pkgsdoc.add(strinfo);
										LispNode links = nd.get(2);
										String strlinks = "";
										for( LispNode link: links.params ){
											String strlink = link.get(1).value;
											strlinks += strlink+";";
										}							
										pkgslinks.add(strlinks);
									}
								}					

								PackageDialog pd = 
									new PackageDialog(ReplView.this.getSite().getShell(),
											loadedPkgs, pkgs, pkgsdoc, pkgslinks,
											cusp.getPackage());
								if (pd.open() == Dialog.OK) {
									String pkg = pd.getPackage();
									cusp.sendLoadPackage(pd.getPackage());
									appendText("Loaded package "+pkg+"\n");
								}
							}
						});
					}
				});
			}
		};
		loadPackageButton.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.LOAD_PACKAGE));
		loadPackageButton.setToolTipText("Load Installed Package");

		connectButton = new Action("Reconnect") {
			public void run() {
				if (!cusp.isConnected() 
						|| MessageDialog.openQuestion(
								ReplView.this.getSite().getShell(),
								"Reconnect", 
						"Are you sure you want to restart your Lisp session?")){
					this.setImageDescriptor(
							CuspResources.getImageDescriptor(
									CuspResources.DISCONNECTED));										
					appendText("Reconnecting...");
					cusp.reconnect();
					appendText("done.\n");
					scrollDown();
					setPackageString(cusp.getCurrPackage());
					resetState();

					this.setImageDescriptor(
							CuspResources.getImageDescriptor(
									CuspResources.RECONNECT));
					loadPackageButton.setEnabled(cusp.getManagePackages());

				}
			}
		};
		connectButton.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.RECONNECT));
		connectButton.setToolTipText("Reconnect");

		packageButton = new Action("Change Package") {
			public void run() {
				PackageDialog pd = 
					new PackageDialog(ReplView.this.getSite().getShell(),
							cusp.getAvailablePackages(1000), cusp.getPackage());
				if (pd.open() == Dialog.OK) {
					switchPackage(pd.getPackage());
				}
			}
		};
		packageButton.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.DEFPACKAGE));
		packageButton.setToolTipText("Change Package");

		pauseButton = new Action("Interrupt execution") {
			public void run() {
				getCusp().sendInterrupt(null);
			}
		};
		pauseButton.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.THREAD_DEBUG));
		pauseButton.setToolTipText("Interrupt execution");


		clearButton = new Action("Clear Repl and Reset Sash") {
			public void run() {
				history.clear();
			}
		};
		clearButton.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.CLEAR));
		clearButton.setToolTipText("Clear Repl and Reset Sash");

		showCuspFramesButton = new Action("Show Cusp Frames", Action.AS_CHECK_BOX) {
			public void run() {
				State currState = currState();
				if (currState != null
						&& currState.getClass().getName().contains("DebugState")) {
					IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
					boolean hide = prefs.getBoolean(PreferenceConstants.DEBUG_HIDE_CUSP_FRAMES);
					hide = !hide;
					prefs.setValue(PreferenceConstants.DEBUG_HIDE_CUSP_FRAMES, hide);
					((DebugState) currState).fillDebugTree(false);
					this.setChecked(!hide);
				}
			}
		};
		showCuspFramesButton.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.SORT_POSITION));
		showCuspFramesButton.setToolTipText("Show Cusp Frames");
		IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
		boolean hide = prefs.getBoolean(PreferenceConstants.DEBUG_HIDE_CUSP_FRAMES);
		showCuspFramesButton.setChecked(!hide);


		stepButton = new Action("Step") {
			public void run() {
				State currState = currState();
				if (currState != null
						&& currState.getClass().getName()
						.contains("DebugState")) {

					((DebugState) currState).startDebug();
					this.setEnabled(false);
				}
			}
		};
		stepButton.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.STEP));
		stepButton.setToolTipText("Step");

		runTestsButton = new TestAction(getSite().getShell()); 
		runTestsButton.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.RUN_TESTS));
		runTestsButton.setToolTipText("Run tests");


		this.fillNormalToolBar();
	}

	public void widgetDefaultSelected(SelectionEvent e) {
	}

	public void widgetSelected(SelectionEvent e) {
		if (e.widget.getData() != null) {
			String partNum = e.widget.getData().toString();
			System.out.println("part: " + partNum);
			LispPlugin.getDefault().getCusp()
			.sendInspectInspectedPart(partNum, new InspectorRunnable());
		}
	}

	public void appendText(String text) {
		history.appendText(text);
		if(LispPlugin.getDefault().getPreferenceStore()
				.getBoolean(PreferenceConstants.CONSOLE_COMPILER_LOG))
		{
			LispPlugin.getDefault().out(text);
		}
	}

	public void appendInspectable(String text, String id) {
		System.out.println("Append inspectable: val = "+text+", id = "+id);
		history.appendInspectable(text, id);
	}

	public void appendInput(String text) {
		history.appendInput(text);
	}

	public void appendToInputArea(String text) {
		in.getTextWidget().append(text);
	}

	public void insertInInputArea(String text) {
		StyledText st = in.getTextWidget();
		st.insert(text);
	}


	/**
	 * This is a real class rather than an anonymous one so that it can be
	 * cloned properly. If it weren't, you'd sometimes get results printed twice
	 * on the repl
	 */
	protected class DisplayRunnable extends CuspDisplayRunnable {
		public ReplView rv;

		public void run() {
			System.out.println("DisplayRunnable: "+result.toString());
			if (presentation == null) {
				rv.appendText(result.get(1).value);
			} else {
				rv.appendInspectable(result.get(1).value, presentation);
			}
			// history.appendText(result.get(1).value);
			scrollDown();
		}

		public CuspRunnable clone() {
			DisplayRunnable re = new DisplayRunnable();
			re.presentation = this.presentation;
			re.result = this.result;
			re.rv = this.rv;

			return re;
		}
	}


	/**
	 * This is a real class rather than an anonymous one so that it can be
	 * cloned properly. If it weren't, you'd sometimes get results printed twice
	 * on the repl
	 */
	public class WelcomeRunnable extends CuspDisplayRunnable {
		public ReplView rv;

		public void run() {
			System.out.println("WelcomeRunnable: "+result.toString());
			rv.appendText(result.get(1).value);

			// history.appendText(result.get(1).value);
			scrollDown();
			if( cusp != null ){
				setPackageString(cusp.getPackage());				
			}
		}

		public CuspRunnable clone() {
			WelcomeRunnable re = new WelcomeRunnable();
			re.result = this.result;
			re.rv = this.rv;

			return re;
		}
	}

	protected void registerCuspListeners() {
		DisplayRunnable dr = new DisplayRunnable();
		dr.rv = this;
		cusp.addDisplayCallback(dr);

		cusp.addDisconnectCallback(new CuspRunnable() {
			public void run() {
				if( !cusp.isConnected() ){
					connectButton.setImageDescriptor(
							CuspResources.getImageDescriptor(
									CuspResources.DISCONNECTED));
					IStatusLineManager slm = 
						getViewSite().getActionBars().getStatusLineManager();
					slm.setMessage("Disconnected");
					appendText("Disconnected\n");
				}
			}
		});

		cusp.addReadListener(new CuspRunnable() {
			public void run() {
				pushReadState(result.get(1).value, result.get(2).value);
				appendText(cusp.fetchDisplayText() + "\n");
				scrollDown();
				inReadMode = false;
			}
		});

		cusp.addDebugInfoListener(new CuspRunnable() {
			public void run() {
				saveDebugInfo(result);
			}
		});

		cusp.addDebugReturnListener(new CuspRunnable() {
			public void run() {
				String key = result.get(1).value + ":" + result.get(2).value;
				LispNode info = debugInfos.get(key);
				if (info != null) {
					DebugState state = new DebugState(info);
					if (currState().equals(state)) {
						popState();
					}
				}
			}
		});

		cusp.addDebugListener(new CuspRunnable() {
			public void run() {
				String key = result.get(1).value + ":" + result.get(2).value;
				System.out.println("*debug found: " + key + "->" + debugInfos.get(key));
				pushDebugState(debugInfos.get(key));
			} // run()
		});

	}

	protected void scrollDown() {
		//TODO: Gorsal - get rid of blocked stuff?
		if (history!=null&&history.getDocument()!=null) {
		history.revealRange(history.getDocument().getLength(), 0);
		}
	}


	private Color backgroundColor;


	public class ReturnHandler extends CuspRunnable {
		public void run() {
			System.out.println(result);
			LispNode returns = 
				result.getf(":return").getf(":ok").getf(":present");
			for (LispNode r: returns.params) {
				String res = r.get(0).value;
				appendText(res + "\n");
			}
			// String res = .get(0).get(0).value;

			scrollDown();
		}
	}

	/**
	 * Checks the next repl command to be issued for a valid in-package form. If
	 * one is found, the name specified in the form is checked against the list
	 * of available packages. If the specified package name is available, then
	 * the cusp connection's current package is changed as requested.
	 */
	public void checkSwitchPackage (String replCmd) {
		LispNode n = LispParser.parse(replCmd);
		if (n.car().car().value.toUpperCase().equalsIgnoreCase("IN-PACKAGE")) {
			String packageName = n.car().cadr().value.toUpperCase();
			if (packageName.startsWith(":")) 
				packageName = packageName.substring(1);
			if (!packageName.equals(cusp.getPackage())) {
				ArrayList<String> packages = cusp.getAvailablePackages(5000);
				if (packages.contains(packageName.toUpperCase())){
					switchPackage(packageName);
				}
			}
		}
	}

	public boolean switchPackageIfExists (String pack) {
		String packageName = pack.toUpperCase();
		if (packageName.startsWith(":")) 
			packageName = packageName.substring(1);
		if (!packageName.equals(cusp.getPackage())) {
			ArrayList<String> packages = cusp.getAvailablePackages(5000);
			if (packages.contains(packageName.toUpperCase())){
				switchPackage(packageName); return true;
			}

		}
		return false;
	}
	/**
	 * Switches the cusp connection's current package to the given package
	 * name, prints an appropriate commented message, and forces the repl to
	 * scroll to the bottom.
	 */
	public void switchPackage (String packageName) {
		cusp.setPackage(packageName);
		appendText(";Package changed to " + packageName + "\n");
		scrollDown();
		setPackageString(packageName);
	}

	protected void eval() {
		String cmd = in.getDocument().get();
		//if (!cmd.endsWith("\n")) {
		//	cmd = cmd+"\n" ; 
		//}
		String cleanCmd = cmd.replace("\r", "");
		State state = currState();

		if (state.handle(cmd, cleanCmd)) {
			popState();
		}

		// When this was called from the TextChanged event, exceptions got
		// thrown
		// and the control became unresponsive. So, we execute elsewhere.
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				try {
					in.getTextWidget().setText("");
					in.getTextWidget().setFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected class OkListener implements SelectionListener {

		public void widgetSelected(SelectionEvent e) {
			sentEvalByKeyboard = false;
			eval();
		}


		public void widgetDefaultSelected(SelectionEvent e) {
		}

	}

	int currPrevCommand=0;
	public void showPreviousCommandFromHistory () {
		--currPrevCommand;
		if (currPrevCommand < 0) {
			currPrevCommand = prevCommands.size() - 1;
		}
		if (currPrevCommand >=0 ) {
			in.getDocument().set(prevCommands.get(currPrevCommand));
			in.setSelectedRange(in.getDocument().getLength(), 0);
		}
	}

	public void showNextCommandFromHistory () {
		++currPrevCommand;
		if (currPrevCommand >= prevCommands.size()) {
			currPrevCommand = 0;
		}
		if (prevCommands.size() > 0) {
			in.getDocument().set(prevCommands.get(currPrevCommand));
			in.setSelectedRange(in.getDocument().getLength(), 0);
		}
	}

	protected class SelectAllListener implements VerifyKeyListener {
		public void verifyKey (VerifyEvent evt) {
			if (evt.keyCode == 'a') {
				if (evt.stateMask == SWT.CONTROL ||
						(evt.stateMask == SWT.COMMAND 
								&& Platform.getOS().equals(Platform.OS_MACOSX))) {
					in.setSelectedRange(0, in.getDocument().getLength());
				}
			}
		}
	}

	protected class CheckEvalListener implements VerifyKeyListener {
		public void verifyKey(VerifyEvent event) {
			boolean doit = false;
			if( inReadMode ){
				doit = (event.keyCode == '\r' || event.keyCode == '\n');
			} else {
				boolean ctrl = true;
				if( LispPlugin.getDefault().getPreferenceStore()
						.getBoolean(PreferenceConstants.USE_CTRL_ENTER) ){
					ctrl = (event.stateMask == SWT.CONTROL); 
				}
				doit = ( ctrl
						&& (event.keyCode == '\r' || event.keyCode == '\n')
						&& !in.getDocument().get().matches("\\s*")
						&& LispUtil.doParensBalance(in.getDocument()));
			}
			if ( doit ) {
				// System.out.println("*" + event.text + ":" +
				// event.text.length());
				sentEvalByKeyboard = true;
				eval();
				event.doit = false;
			}
		}
	}

	public void openHistDialog(){
		ArrayList<String> hist = new ArrayList<String>(prevCommands.size());
		for (String command: prevCommands) {
			if (command.length() > 50) {
				hist.add(command.substring(0, 47) + "...");
			} else {
				hist.add(command);
			}
		}

		HistoryDialog hd = new HistoryDialog(ReplView.this.getSite().getShell(),
				hist);
		if (hd.open() == Dialog.OK) {
			in.getDocument().set(prevCommands.get(hd.getHistInd()));
		}
		in.getTextWidget().setFocus();
		in.getTextWidget().setSelection(in.getTextWidget().getText().length());		
	}

	protected class PrevListener implements SelectionListener {
		Control parent;

		public PrevListener(Control parent) {
			this.parent = parent;
		}

		public void widgetSelected(SelectionEvent e) {
			openHistDialog();
		}

		public void widgetDefaultSelected(SelectionEvent e) {
		}
	}

	// ******************************
	// State handling
	// ******************************

	protected void pushState(State s) {
		if (states.size() > 1) {
			// Assuming anything above one is a debug state?
			if (currState() instanceof DebugState) {
				((DebugState) currState()).deactivate();
			}
		}
		states.push(s);
		applyCurrentState();
	}

	protected void popState() {
		states.pop();
		applyCurrentState();
	}

	protected State currState() {
		if (states.isEmpty()) { // Shouldn't ever happen, but it has
			states.push(new EvalState());
		}
		return states.peek();

	}

	private void applyCurrentState() {
		State state = currState();
		Display display = this.getSite().getShell().getDisplay();
		Color newColor = state.getColor(display);

		in.getControl().setBackground(newColor);
		in.getControl().setForeground(newColor);
		replComposite.setBackground(newColor);

		if (backgroundColor != null) {
			backgroundColor.dispose();
		}
		backgroundColor = newColor;

		state.activate();
	}

	protected void pushEvalState() {
		pushState(new EvalState());
	}

	protected void pushDebugState(LispNode debugInfo) {
		DebugState state = new DebugState(debugInfo);
		System.out.println("currState:" + currState());
		if (!currState().equals(state)) {
			pushState(state);
		}
	}

	private Hashtable<String, LispNode> debugInfos = new Hashtable<String, LispNode>();
	protected void saveDebugInfo(LispNode debugInfo) {
		String key = debugInfo.get(1).value + ":" + debugInfo.get(2).value;
		debugInfos.put(key, debugInfo);
	}

	protected void pushReadState(String s1, String s2) {
		inReadMode = true;
		inconfig.stopContentAssistant();
		ReplView.switchToRepl();
		pushState(new ReadState(s1, s2));
	}

	public void PreEvalStateHandleWithPackage (String command, String cleanCommand){
		System.out.println(cleanCommand);
		prevCommands.add(command.trim());
		currPrevCommand = prevCommands.size();
		appendInput("\n"+cusp.getPackage() + ">\n" + command+"\n");
		scrollDown();

		//cusp.sendEval(cleanCommand, new ReturnHandler());

		//checkSwitchPackage(command);		
	}

	public void EvalStateHandle(String command, String cleanCommand){
		System.out.println(cleanCommand);
		prevCommands.add(command.trim());
		currPrevCommand = prevCommands.size();
		appendInput("\n"+cusp.getPackage() + ">\n" + command+"\n");
		scrollDown();

		cusp.sendEval(cleanCommand, new ReturnHandler());

		checkSwitchPackage(command);		
	}


	protected class EvalState implements State {

		public Color getColor(Display display) {
			return null;
		}

		public boolean handle(String command, String cleanCommand) {
			EvalStateHandle(command,cleanCommand);
			return false;
		}

		public void activate() {
			fillNormalToolBar();
		}
	}



	protected class ReadState implements State {
		private String stringNum1, stringNum2;

		public ReadState(String s1, String s2) {
			stringNum1 = s1;
			stringNum2 = s2;
		}

		public Color getColor(Display display) {
			return new Color(display, 0, 255, 0);
		}

		public boolean handle(String command, String cleanCommand) {
			cusp.sendReadString(cleanCommand, null, stringNum1, stringNum2);
			appendInput(">> " + command);
			scrollDown();
			inconfig.startContentAssistant();
			return true;
		}

		public void activate() {
			fillNormalToolBar();
		}

	}



	protected class DebugState implements State, 
	MouseListener, KeyListener, TreeListener, SelectionListener {
		boolean editorHasFocus = false;

		private LispNode desc, options, backtrace;
		private String thread, level;

		public DebugState(LispNode debugInfo) {
			thread = debugInfo.get(1).value;
			level = debugInfo.get(2).value;

			desc = debugInfo.get(3);
			options = debugInfo.get(4);
			backtrace = debugInfo.get(5);
		}

		public boolean equals(Object obj) {
			if (obj instanceof DebugState) {
				DebugState state = (DebugState)obj;
				return (thread.equals(state.thread) && level.equals(state.level));
			}
			return false;
		}

		public Color getColor(Display display) {
			return new Color(display, 255, 0, 0);
		}

		public boolean handle(String command, String cleanCommand) {
			return false;
		}

		public boolean preferenceIsAuto ()
		{
			return LispPlugin.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.AUTOFOCUS_DEBUGGER);
		}

		public void activate() {
			//preference? focus?
			boolean autoFocus = preferenceIsAuto();
			boolean switchBackIfInEditor = LispPlugin.getStore().getBoolean(PreferenceConstants.SWITCH_TO_EDITOR_FROM_DEBUGGER_IF);
			if (switchBackIfInEditor) {
				editorHasFocus = LispPlugin.isAnEditorActive();
			}

			fillDebugToolBar();
			debugLabel.setText(desc.car().value + "\n" + desc.cadr().value);
			debugLabel.setToolTipText(debugLabel.getText());



			//	Point size = debugLabel.getSize();
			//	if (size.y > 50) {
			//		debugLabel.setSize(size.x, 50);
			//	}

			debugLabel.setSize(debugLabel.computeSize(mainView.getSize().x,SWT.DEFAULT,false));

			String message = desc.car().value;
			if (message.trim().equalsIgnoreCase("The assertion (PACKAGEP CUSP::P) failed.")) {
				//I know this is bad if, say, the user produces an error with the same text
				//but this is so unlikely that we will do it the simple way!
				chooseSilentRestart('q'); //totally exits buffer, but we're only one level in.
				return;	
			}

			appendText(desc.car().value + "\n" + desc.cadr().value + "\n");

			fillDebugTree(true);

			debugTree.addSelectionListener(this);
			debugTree.addTreeListener(this);
			debugTree.addMouseListener(this);
			debugTree.addKeyListener(this);
			debugView.addKeyListener(this);

			debugView.pack(true);

			boolean replHasFocus = LispPlugin.isREPLActive();
			hideFrame(mainView);
			showFrame(debugView);

			LispNode condExtras = desc.caadr();

			if (condExtras.getNumberOfSubSexps() > 0) {
				for (int i = 0; i < condExtras.getNumberOfSubSexps(); i++) {
					LispNode extra = condExtras.get(i);
					if (extra.car().value.equals(":show-frame-source")) {
						String frame = extra.cadr().value;
						getCusp().sendGetFrameSourceLocation(frame, thread,
								new CuspRunnable() {
							public void run() {
								processFrameSourceLocationResult(result);
							}
						});
					}
				}
			}

			if (replHasFocus==true||autoFocus==true)
				debugView.setFocus(); //apparently supposed to use some activePage.activate(debugView);
			//don't feel like it!
		}

		public void fillDebugTree(boolean print) {
			debugTree.removeAll();
			TreeItem slimeTopLevelOption = null;
			TreeItem breakContinueOption = null;
			TreeItem quickOption = null;
			TreeItem firstItem = null;
			for (int i=0; i<options.params.size(); ++i) {
				LispNode option = options.get(i);
				if (print) {
					appendText("\t" + i + ": [" + option.car().value + "] "
							+ option.cadr().value + "\n");
				}
				TreeItem item = new TreeItem(debugTree, 0);
				item.setText(i + ": [" + option.car().value + "] " 
						+ option.cadr().value);
				item.setData(i);
				if ( i == 0) {
					firstItem = item;
				}
				String itm = option.cadr().value;
				if ( itm.equalsIgnoreCase("Return to SLIME's top level.")){
					slimeTopLevelOption = item;
				}
				if ( itm.equalsIgnoreCase("Return from BREAK.")){
					breakContinueOption = item;
				}
			} // for
			if( breakContinueOption != null ){
				quickOption = breakContinueOption;
			} else if ( slimeTopLevelOption != null ){
				quickOption = slimeTopLevelOption;
			} else {
				quickOption = firstItem;
			}


			scrollDown();

			TreeItem bt = new TreeItem(debugTree, SWT.NONE);
			bt.setText("==Backtrace==");
			bt.setData(null);

			for (int i=0; i<backtrace.params.size(); ++i) {
				LispNode trace = backtrace.get(i);
				// appendText("\t[" + trace.car().value + "] " +
				// trace.cadr().value + "\n");

				String txt = trace.car().value + "] " + trace.cadr().value;
				String txtlow = txt.toLowerCase();

				if( !txtlow.contains("bogus stack frame")){
					if( txtlow.contains("cusp") ){
						if( LispPlugin.getDefault().getPreferenceStore()
								.getBoolean(PreferenceConstants.DEBUG_HIDE_CUSP_FRAMES)){
							break; // I am not interested in cusp frames
						}
					}

					TreeItem item = new TreeItem(bt, 0);
					item.setText(txt);
					item.setData(null);
					item.setData("frame", i);

					TreeItem tmp = new TreeItem(item, 0);
					tmp.setText("Getting data...");					
				}

			} // for
			bt.setExpanded(true);

			debugTree.setFocus();

			// scroll to top of the tree
			debugTree.setSelection(firstItem);
			// select most often used (by me?) option
			debugTree.setSelection(quickOption);
		}

		public void choose(Integer choice) {
			cusp.sendDebug(choice.toString(), this.level, thread, null);

			appendInput("]> " + choice + "\n");
			scrollDown();

			debugTree.removeSelectionListener(this);
			debugTree.removeTreeListener(this);
			debugTree.removeMouseListener(this);
			debugTree.removeKeyListener(this);
			debugView.removeKeyListener(this);
			hideFrame(debugView);
			showFrame(mainView);
			popState();

			if (editorHasFocus) {
				LispPlugin.focusActiveEditor();
				editorHasFocus = true;
			}
			else {
				in.getControl().setFocus();
			}
		}

		public void deactivate() {
			debugTree.removeSelectionListener(this);
			debugTree.removeTreeListener(this);
			debugTree.removeMouseListener(this);
			debugTree.removeKeyListener(this);
			debugView.removeKeyListener(this);
			hideFrame(debugView);
			showFrame(mainView);

		}

		public void startDebug() {
			chooseRestart('s');
		}

		public void chooseSilentRestart(char c) {
			switch (c) {
			// a and c crash? sbcl under windows. I don't know about other
			// distrs.
			/*
			 * case 'a': cusp.sendAbortDebug(null); appendText("]> Abort debug\n"); break;
			 * case 'c': cusp.sendContinueDebug(null); appendText("]> Continue debug\n");
			 * break;
			 */
			case 's':
				cusp.sendStepDebug(null, thread);

				break;
			case 'q':
				cusp.sendQuitDebug(null, thread);				

				break;
			default :
				if (preferenceIsAuto())
					LispPlugin.focusActiveEditor();
				else
					in.getControl().setFocus();
				return;
			}

			scrollDown();

			debugTree.removeSelectionListener(this);
			debugTree.removeTreeListener(this);
			debugTree.removeMouseListener(this);
			debugTree.removeKeyListener(this);
			debugView.removeKeyListener(this);

			hideFrame(debugView);
			showFrame(mainView);
			popState();
			if (preferenceIsAuto())
				LispPlugin.focusActiveEditor();
			else
				in.getControl().setFocus();
		}


		public void chooseRestart(char c) {
			switch (c) {
			// a and c crash? sbcl under windows. I don't know about other
			// distrs.
			/*
			 * case 'a': cusp.sendAbortDebug(null); appendText("]> Abort debug\n"); break;
			 * case 'c': cusp.sendContinueDebug(null); appendText("]> Continue debug\n");
			 * break;
			 */
			case 's':
				cusp.sendStepDebug(null, thread);
				appendInput("]> Step\n");
				break;
			case 'q':
				cusp.sendQuitDebug(null, thread);				
				appendInput("]> Quit debug\n");
				break;
			case '\n':
				if (preferenceIsAuto())
					LispPlugin.focusActiveEditor();
				else
					in.getControl().setFocus();
				break;
			default :
				return;
			}

			scrollDown();

			debugTree.removeSelectionListener(this);
			debugTree.removeTreeListener(this);
			debugTree.removeMouseListener(this);
			debugTree.removeKeyListener(this);
			debugView.removeKeyListener(this);

			hideFrame(debugView);
			showFrame(mainView);
			popState();
			if (preferenceIsAuto())
				LispPlugin.focusActiveEditor();
			else
				in.getControl().setFocus();
		}

		public void treeExpanded(TreeEvent e) {
			final TreeItem sel = (TreeItem)e.item;

			if (sel.getData("frame") != null) {
				final Object frame = sel.getData("frame");

				// all stupidity of this procedure to make tree behave
				// civilized on Linux 
				// it would be much clearer and straightforward to just delete
				// all old items and
				// add create new ones, instead we need to reuse existing items
				getCusp().sendGetFrameLocals(frame.toString(), thread, new CuspRunnable() {
					public void run() {
						int n0 = sel.getItemCount();
						// sel.removeAll(); //this precludes displaying on Linux
						LispNode vars = result.getf(":return").getf(":ok");
						if (vars.params.size() <= 0) {
							if(n0 > 0){
								sel.getItems()[0].setText("[No Locals]");
								sel.setItemCount(1);								
							} else {
								TreeItem tmp = new TreeItem(sel, 0);
								tmp.setText("[No Locals]");		
							}
						} else {
							TreeItem varItem = null;
							for (int i=0; i < vars.params.size(); ++i) {
								LispNode var = vars.params.get(i);
								String name = var.getf(":name").value;
								String val = var.getf(":value").value;
								if( i < n0 ){
									varItem = sel.getItem(i);
								} else {
									varItem = new TreeItem(sel, 0);									
								}
								varItem.setText(name + " = " + val);
								varItem.setData("frameNum", frame);
								varItem.setData("varNum", i);
							}
							if( vars.params.size() < n0 ){
								sel.setItemCount(vars.params.size());
							}
						}
					}
				}); 
			} 
		}

		public void widgetSelected(SelectionEvent e) {
			final TreeItem sel = (TreeItem)e.item;

			if (sel.getData("frame") != null) {
				Object frame = sel.getData("frame");
				getCusp().sendGetFrameSourceLocation(frame.toString(), thread, new CuspRunnable() {
					public void run() {
						processFrameSourceLocationResult(result);

					}
				});
			}
		}

		public void processFrameSourceLocationResult(LispNode result) {
			LispNode res = result.getf(":return").getf(":ok");
			if (res.car().value.equalsIgnoreCase(":error")) {
				/*In this version of slime, we get a silly error after failing to load
				 * project through asdf. Instead of updating everything to the newest version
				 * we simply filter out this error by its message.
				 */

				String file = res.getf(":file").value;
				if (file == null || (file.length() == 0)) {
					file = res.getf(":buffer").value;
				}
				if (file != null) {
					file = getCusp().translateRemoteFilePath(file);
				}
				int pos = res.getf(":position").asInt();
				String snippet = res.getf(":snippet").value;
				LispEditor.jumpToDefinition(file, pos, snippet);
				setFocus();
			}
		}

		public void widgetDefaultSelected(SelectionEvent e) {
			final TreeItem item = (TreeItem)e.item;

			if (item.getData() != null && item.getData() instanceof Integer) {
				Integer choice = (Integer) item.getData();
				choose(choice);
			} else if (item.getData("frameNum") != null && item.getData("varNum") != null) {
				Object frame = item.getData("frameNum");
				Object var = item.getData("varNum");
				getCusp().sendInspectFrameLocal(thread, frame.toString(), var.toString(),
						new InspectorRunnable());
			}
		}


		public void mouseDoubleClick(MouseEvent e) {
		}

		public void mouseDown(MouseEvent e) {
			/*
			 * TreeItem item = debugTree.getItem(new Point(e.x, e.y)); if (item !=
			 * null && item.getData("frame") != null) { Object frame =
			 * item.getData("frame");
			 * getCusp().sendGetFrameSourceLocation(frame.toString(), new
			 * CuspRunnable() { public void run() { LispNode res =
			 * result.getf(":return").getf(":ok"); if
			 * (!res.car().value.equals(":error")) { String file =
			 * res.getf(":file").value; int pos = res.getf(":position").asInt();
			 * String snippet = res.getf(":snippet").value;
			 * LispEditor.jumpToDefinition(file, pos, snippet); } } }); }
			 */
		}

		private boolean enterKeyInited = false;

		public void keyPressed(KeyEvent e) {
			// System.out.printf("Key pressed: \n%c = \n%s\n", e.character,
			// e.toString());
			if ((int)e.character==0) {
				return;
			}
			if (!(e.character == '\r' || e.character == '\n')){
				Character c = new Character(e.character);
				try {
					if( c.toString().matches("\\D") ){
						chooseRestart(c);
					} else {
						int choice = Integer.parseInt(c.toString());
						if (choice >=0 && choice < options.params.size()) {
							choose(choice);
						}
					}
				} catch (NumberFormatException ex) {
				}
			}
		}



		public void mouseUp(MouseEvent e) {
		}

		public void keyReleased(KeyEvent e) {
			// System.out.printf("Key released: \n%c = \n%s\n", e.character,
			// e.toString());
			if (e.character == '\r' || e.character == '\n') {
				// <Enter> on Linux sends keyEvent only on keyReleased. However
				// we get into tree when we press <Enter> in REPL, and we
				// release
				// <Enter> on tree. So we need to skip first <Enter> on release.
				// But we also can send eval from REPL using Send button which
				// does no create any <Enter> event.
				if( !enterKeyInited ){
					enterKeyInited = true;
					if(sentEvalByKeyboard){
						return;
					}
				}
				TreeItem[] sels = debugTree.getSelection();
				if (sels.length > 0) {
					TreeItem item = sels[0];
					if (item.getData() != null && item.getData() instanceof Integer) {
						Integer choice = (Integer) item.getData();
						choose(choice);
					}
				}
			}
		}

		public void treeCollapsed(TreeEvent e) {
		}

	}
}
