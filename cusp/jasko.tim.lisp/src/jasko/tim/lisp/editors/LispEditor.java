package jasko.tim.lisp.editors;

// import jasko.tim.lisp.ColorManager;
import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.builder.LispBuilder;
import jasko.tim.lisp.builder.LispMarkers;
import jasko.tim.lisp.editors.LispSelectionMixin.SelectionPosition;
import jasko.tim.lisp.editors.assist.LispInformationControlManager;
import jasko.tim.lisp.editors.outline.LispOutlinePage;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.cusp.LispParser;
import jasko.tim.lisp.cusp.CuspInterface;
import jasko.tim.lisp.util.LispUtil;
import jasko.tim.lisp.util.TopLevelItem;
import jasko.tim.lisp.util.TopLevelItemSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Stack;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.ITextViewerExtension7;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.IDE;

import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public class LispEditor extends TextEditor implements ILispEditor,ILispSelection,ITextViewerExtension7{
	LispSelectionMixin mixin = new LispSelectionMixin(this);
	
	/** The ID of this editor as defined in plugin.xml */
	public static final String EDITOR_ID = "jasko.tim.lisp.editors.LispEditor";
    /** The ID of the editor context menu */
    public static final String EDITOR_CONTEXT = EDITOR_ID + ".context";
    /** The ID of the editor ruler context menu */
    public static final String RULER_CONTEXT = EDITOR_CONTEXT + ".ruler";

	private LispOutlinePage outline;
	public LispOutlinePage getOutlinePage () {
		return outline;
	}
	private ArrayList<TopLevelItem> topForms;
	// private ColorManager.ChangeEventListener colorPrefChangeListener;
    private final LispConfiguration config = 
    	new LispConfiguration(this, LispPlugin.getDefault().getColorManager());
    
    private final CurrentExpressionHighlightingListener highlighter = 
    	new CurrentExpressionHighlightingListener(this);
    
    private final String CHANGED_POS_FOR_COMPILE = 
    	"jasko.tim.lisp.doc.change_for_compile";
    private boolean useAutoBuild = false;
    
    private final String CHANGED_POS_FOR_OUTLINE = 
    	"jasko.tim.lisp.doc.change_for_outline";

    public final String TOP_LVL_POS = 
    	"jasko.tim.lisp.doc.top_lvl_pos";
    public final static String PACKAGE_POS = "jasko.tim.lisp.doc.package_pos";
    
    public CurrentExpressionHighlightingListener getHighlighter () {
    	return highlighter;
    }

  

    
    public ISourceViewer getViewer () {
    	return getSourceViewer();
    }
    
    protected void initializeEditor() {	
        super.initializeEditor();
        setEditorContextMenuId(EDITOR_CONTEXT);
        setRulerContextMenuId(RULER_CONTEXT);
      
    }
  //copied this 
	public static IViewPart getView(String id) {
		IViewReference viewReferences[] = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getViewReferences();
		for (int i = 0; i < viewReferences.length; i++) {
			if (id.equals(viewReferences[i].getId())) {
				return viewReferences[i].getView(false);
			}
		}
		return null;
	}


public LispOutlinePage getOutline (boolean visible) {
	if (outline==null)
		createOutline(visible);
	return outline;
}

 public void createOutline (boolean visible) {
	try {
		this.getSite().getPage().showView(IPageLayout.ID_OUTLINE);
		if (!visible) 
			this.getSite().getPage().hideView(getView(IPageLayout.ID_OUTLINE));		
	} catch (PartInitException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 
 }
    
    LinkedHashMap<Position,TopLevelItem> packages = new LinkedHashMap<Position,TopLevelItem>();
    
   public LinkedHashMap<Position,TopLevelItem> getPackages () {
	   return packages;
   }
   
    public TopLevelItem addPackagePosition (TopLevelItem item) {
    	return packages.put(new Position(item.offset+1), item);
    }
    public boolean isPackagePosition(Position pos) {
    	return packages.containsKey(pos);
    }
    public TopLevelItem removePackagePosition(Position pos) {
    	return packages.remove(pos);
    }

    public static boolean isPackageItem (TopLevelItem itm) {
    	return itm.type.equalsIgnoreCase("in-package");
    }
    public static boolean isPackageName (String name) {
    	return name.equalsIgnoreCase("in-package");
    }
    public void addOutlinePosition(TopLevelItem item, Position pos){
		IDocument doc = getDocument();
	
    	try{
    		
    		if (item.type.trim().equalsIgnoreCase("in-package")) {
    			packages.put(pos,item);
    			doc.addPosition(PACKAGE_POS,pos);
    		}
    		doc.addPosition(TOP_LVL_POS, pos);
    	} catch ( Exception e ){
    		e.printStackTrace();
    	}
    }
    
    public void clearOutlinePositions(){
		IDocument doc = getDocument();
		if( null == doc ){
			return;
		}
		try{
			doc.removePositionCategory(TOP_LVL_POS);
			doc.removePositionCategory(PACKAGE_POS);
			packages.clear();
			doc.addPositionCategory(TOP_LVL_POS);
			doc.addPositionCategory(PACKAGE_POS);
		} catch ( BadPositionCategoryException e) {
			e.printStackTrace();
		}    	
    }

    public Position[] getAndClearChangedPosForOutline(){
		Position[] pos = null;
		IDocument doc = getDocument();
		if( null == doc ){
			return null;
		}
		try{
			
			pos = doc.getPositions(CHANGED_POS_FOR_OUTLINE);
			doc.removePositionCategory(CHANGED_POS_FOR_OUTLINE);
		} catch ( BadPositionCategoryException e) {
			e.printStackTrace();
			pos = null;
		}
		doc.addPositionCategory(CHANGED_POS_FOR_OUTLINE);
		return pos;
    }
    
    public void setOffset(int offset) {
   
    	setHighlightRange(offset,1,true);   	
    }

    
    public int getOffset() {
		ITextSelection ts = (ITextSelection)getSelectionProvider().getSelection();
		int offset = ts.getOffset();
		return offset;
	}

    
    public void updateOutline(){
    	//TODO: Gorsal - find actual reason for NullPointerException!
    	if (outline!=null) 
    		outline.updateOutline();
    }

    /**
     * Returns IFile associated with this editor
     * @return IFile or null
     */
    public IFile getIFile(){
    	IEditorInput input= getEditorInput();
    	IFile original= (input instanceof IFileEditorInput) ?
    	                  ((IFileEditorInput) input).getFile() : null;
    	return original;
    }
    
	public LispEditor() {
		super();
		setSourceViewerConfiguration(config);
		setDocumentProvider(new LispDocumentProvider());
		
		/* colorPrefChangeListener = new ColorManager.ChangeEventListener() {

			public void colorPreferenceChanged(ColorChangeEvent event) {
				
			}
			
		}; */
        
		//setRangeIndicator(new DefaultRangeIndicator());
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

	/**
	 * Jumps the user to a given position in the given file.
	 * If an editor is not open for this file, one is opened.
	 * If the file is not in the workspace, a link is created to it.
	 * If the position is out of bound, we try to find the snippet.
	 * If we can't find that, at least they have the file open.
	 * @param filePath
	 * @param position
	 * @param snippet
	 */
	public static void jumpToDefinition(String filePath, int position, 
			String snippet) {
		jumpToDefinition(filePath, position, snippet, null);
	}
	
	/**
	 * Jumps the user to a given position in the given file.
	 * If an editor is not open for this file, one is opened.
	 * If the file is not in the workspace, a link is created to it.
	 * If the position is out of bound, we try to find the snippet.
	 * If the snippet isn't found, we go to the first instance of symbol.
	 * If we can't find that, at least they have the file open.
	 * 
	 * Really, it is very unlikely that we'll ever use any of the fall-backs
	 * @param filePath
	 * @param position
	 * @param snippet
	 * @param symbol
	 */
	@SuppressWarnings("restriction")
	public static void jumpToDefinition(String filePath, int position, 
			String snippet, String symbol) {
		System.out.println("*jump: " + filePath + ":" + position);
		IWorkbenchPage page =
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath path = new Path(filePath);
		IFile[] files = root.findFilesForLocation(path);
		
		IEditorPart editor = null;
		
		if (files.length > 0) {
			try {
				editor = IDE.openEditor(page, files[0], true);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File not found:" + path);
			try {
				IProject project = root.getProject(".External Lisp Files");
				if (!project.exists()) {
					project.create(null);
				}
				if (!project.isOpen()) {
					project.open(null);
				}
				IFile file = project.getFile(path.lastSegment());
				file.createLink(path, IResource.NONE, null);
			
				editor = IDE.openEditor(page, file, true);
			} catch (CoreException ex) {
				ex.printStackTrace();
			}
		}
		
		if (editor != null) {
			//System.out.println("0");
			TextEditor editor2 = (TextEditor) editor;
			try {
				IDocument doc = editor2.getDocumentProvider()
				  .getDocument(editor2.getEditorInput());
				
				String contents = doc.get();
				if (symbol == null) {
					//System.out.println("A0 " + snippet);
					int offset = contents.indexOf(snippet, position);
					if (offset >= 0) {
						//System.out.println("A1 " + offset);
						editor2.selectAndReveal(offset, 0);
					} else {
						//System.out.println("A2 " + position);
						editor2.selectAndReveal(position, 0);
					}
				} else {
					//System.out.println("B0");
					// skip comments or strings
					int iters = 0;
					int offset = position;
					while(offset >= 0 && offset < doc.getLength() && 
							(doc.getPartition(offset)
								     .getType().equals(LispPartitionScanner.LISP_COMMENT)
								     || doc.getPartition(offset)
								     .getType().equals(LispPartitionScanner.LISP_STRING))){
						offset = contents.indexOf(symbol,offset)+symbol.length();
						++iters;
					}
					if( iters > 0 ){
						offset -= symbol.length();
					}
					if (offset >= 0) {
						//System.out.println("B1 " + offset);
						editor2.selectAndReveal(offset, symbol.length());
					} else {
						//System.out.println("B2 " + position);
						editor2.selectAndReveal(position, 0);
					}
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("**jump fallback 5");
				// Somewhere something went wrong. Who knows precisely what?
				// We'll just jump to the given position
				editor2.selectAndReveal(position, 0);
			}
			System.out.println("**** jump done");
	
			
		}
	}
	
	
	private ProjectionSupport projectionSupport;
	private ProjectionAnnotationModel projectionAnnotationModel;

	private class changesListener implements IDocumentListener{
		public void documentAboutToBeChanged(DocumentEvent event){
		}
		
		public void documentChanged(DocumentEvent event){
			try{
				event.fDocument.addPosition(CHANGED_POS_FOR_OUTLINE, 
						new Position(event.fOffset,event.fText.length()));
				if(useAutoBuild){
						event.fDocument.addPosition(CHANGED_POS_FOR_COMPILE, 
							new Position(event.fOffset,event.fText.length()));
				}
			} catch (Exception e){
				e.printStackTrace();				
			}	
		}
	}
	
	
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		super.init(site, input);
	
	}
	
	

	
	
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		//due to an eclipse bug, a tab to space converter is automatically created. This uninstalls it
		//TODO: fix eclipse bug???
		super.uninstallTabsToSpacesConverter();
		ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();
		projectionSupport = new ProjectionSupport(viewer, getAnnotationAccess(),
				getSharedColors());
		projectionSupport.addSummarizableAnnotationType(
				"org.eclipse.ui.workbench.texteditor.error");
		projectionSupport.addSummarizableAnnotationType(
				"org.eclipse.ui.workbench.texteditor.warning");
		projectionSupport.install();
		
		viewer.doOperation(ProjectionViewer.TOGGLE);
		projectionAnnotationModel = viewer.getProjectionAnnotationModel();

		licm = new LispInformationControlManager(this);
		licm.install(this.getSourceViewer().getTextWidget());

		
		IDocument doc = getDocument();
		if (doc==null) {
			this.close(false);
			parent.dispose();
			return;
		}
		if(null != doc){
			doc.addPositionCategory(CHANGED_POS_FOR_COMPILE);
			doc.addPositionUpdater(new DefaultPositionUpdater(CHANGED_POS_FOR_COMPILE));
			doc.addPositionCategory(CHANGED_POS_FOR_OUTLINE);
			doc.addPositionUpdater(new DefaultPositionUpdater(CHANGED_POS_FOR_OUTLINE));
			doc.addPositionCategory(TOP_LVL_POS);
			doc.addPositionCategory(PACKAGE_POS);
			doc.addPositionUpdater(new DefaultPositionUpdater(TOP_LVL_POS));
			doc.addPositionUpdater(new DefaultPositionUpdater(PACKAGE_POS));
			doc.addDocumentListener(new changesListener());

			final LispPlugin default1 = LispPlugin.getDefault();

      useAutoBuild = default1.getPreferenceStore()
			  .getString(PreferenceConstants.BUILD_TYPE)
				.equals(PreferenceConstants.USE_AUTO_BUILD);

			final CuspInterface cusp = default1.getCusp();

      final String currPackage = cusp.getCurrPackage();

			topForms = LispUtil.getTopLevelItems(LispParser.parse(doc.get()+"\n"),
					currPackage);

			TopLevelItemSort sorter = new TopLevelItemSort();
			sorter.sortItems(topForms, TopLevelItemSort.Sort.Position);			
		}
	}
	
	
	protected ISourceViewer createSourceViewer (Composite parent, 
			IVerticalRuler ruler, int styles) {
		SourceViewer viewer = new ProjectionViewer(parent, ruler,
				getOverviewRuler(), isOverviewRulerVisible(), styles);
		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);
        highlighter.install(viewer);
		
		return viewer;
	}
	
	private LispInformationControlManager licm;
	
	public void showPopupInfo(String message) {
		StyledText txt = this.getSourceViewer().getTextWidget();
		Point p = 
			txt.getLocationAtOffset(this.getSourceViewer().getSelectedRange().x);
		
		licm.setLocation(p);
		licm.setText(message);
		licm.showInformation();
	}
	
    protected void initializeKeyBindingScopes() {
		super.initializeKeyBindingScopes();
		setKeyBindingScopes(new String[] { "jasko.tim.lisp.context1" });  
	}
	
	protected void createActions() {
		super.createActions();
	}

	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);

		if (LispPlugin.getDefault().getPreferenceStore()
				.getString(PreferenceConstants.BUILD_TYPE)
				  .equals(PreferenceConstants.USE_SLIME_BUILD)) { 
			LispBuilder.checkLispWithDoc(getIFile(),getDocument());
		}
		LispMarkers.updateTasks(getIFile(), getDocument());
		LispMarkers.updateBreakpointMarkers(getIFile(), getDocument());
		LispMarkers.updateWatchMarkers(getIFile(), getDocument());
		processAutoBuild();
	}

	
	public void doSaveNoCompile(){
		super.doSave(null);
		LispMarkers.updateTasks(getIFile(), getDocument());
		LispMarkers.updateBreakpointMarkers(getIFile(), getDocument());
		LispMarkers.updateWatchMarkers(getIFile(), getDocument());
	}
	
	private void processAutoBuild() {
		boolean oldAutoBuild = useAutoBuild;
		useAutoBuild = LispPlugin.getDefault().getPreferenceStore()
		  .getString(PreferenceConstants.BUILD_TYPE)
		    .equals(PreferenceConstants.USE_AUTO_BUILD);
		//If useAutoBuild has changed from last save, remove all positions
		if(useAutoBuild != oldAutoBuild || !useAutoBuild){ //autobuild is on and changed
			//remove all positions if any.
			IDocument doc = getDocument();
			try{
				doc.removePositionCategory(CHANGED_POS_FOR_COMPILE);
				doc.addPositionCategory(CHANGED_POS_FOR_COMPILE);
			} catch ( BadPositionCategoryException e) {
				e.printStackTrace();
			}
		}
		if( useAutoBuild ){
			compileOnSave();
		}
	}

	private void compileOnSave() {
		IDocument doc = getDocument();
		if( true /*LispBuilder.checkLisp(getIFile()) */&&!doc.get().equals("")){
			CuspInterface cusp = LispPlugin.getDefault().getCusp(); 
			ArrayList<TopLevelItem> newForms = 
				LispUtil.getTopLevelItems(LispParser.parse(doc.get() + "\n)"),
						cusp.getCurrPackage());
			TopLevelItemSort sorter = new TopLevelItemSort();
			sorter.sortItems(newForms, TopLevelItemSort.Sort.Position);
			
			ArrayList<TopLevelItem> toDefine = undefineRemovedForms(newForms);
			
			Position[] pos = null;
			try{
				pos = doc.getPositions(CHANGED_POS_FOR_COMPILE);
			} catch ( BadPositionCategoryException e) {
				e.printStackTrace();
				pos = null;
			}
			if( pos == null || pos.length == 0 ){ //compile whole file
				//TODO: Change to Good CheckLisp
				if(LispBuilder.checkLisp(getIFile())){
					LispBuilder.compileFile(getIFile(),false);					
				}
			} else { 
				compileForms(getFormsToCompile(pos, newForms, toDefine));
			}
		}
		try {
			doc.removePositionCategory(CHANGED_POS_FOR_COMPILE);
			doc.addPositionCategory(CHANGED_POS_FOR_COMPILE);
		} catch ( BadPositionCategoryException e ){
			e.printStackTrace();
		}
	}

	private void compileForms(int[][] sexps) {
		// evaluate all modified sexps
		IDocument doc = getDocument();
		if( null == doc ){
			return;
		}
		int n = doc.getLength();
		for( int i = 0; i < sexps.length; ++i ){
			int offset = sexps[i][0];
			int endOffset = sexps[i][1];
			if( offset >= 0 ){
				String sexp = "";
				try{
					sexp = doc.get(offset,Math.min(endOffset,n-1)-offset+1);
				} catch ( BadLocationException e ){
					e.printStackTrace();
					sexp = "";
				}
				// check if it is (in-package):
				if ( sexp.toLowerCase().contains("in-package")
						|| sexp.toLowerCase().contains("make-package")
						|| sexp.toLowerCase().contains("defpackage")){
					// should compile rest of the file
					try{
						sexp = doc.get(offset,n-offset);
						//TODO: Need to only specify offset for checkLispWithDoc?
						if(LispBuilder.checkLispWithDoc(getIFile(),doc)){
							LispBuilder.compileFilePart(getIFile(), sexp, offset);
						}
						doc.removePositionCategory(CHANGED_POS_FOR_COMPILE);
						doc.addPositionCategory(CHANGED_POS_FOR_COMPILE);
					} catch ( Exception e ){
						e.printStackTrace();
					}
					break;
				} else if ( sexp != null && sexp != "" ){
					//TODO: OBVIOUSLY WE SHOULD PARSE ONLY THE SEXP WHICH HAVE CHANGED!!!! DUR!
					if(LispBuilder.checkLispWithDoc(getIFile(), doc)) { //offset, sexp.length())){
						LispBuilder.compileFilePart(getIFile(), sexp, offset);						
					}
				}
			}
		}
	}

	// also removes markers in modified positions that are not in sexp 
	//(i.e. when commented out)
	private int[][] getFormsToCompile(Position[] pos, ArrayList<TopLevelItem> newForms, 
			ArrayList<TopLevelItem> toDefine) {
		int[] range = new int[]{-1,0};
		ArrayList<Integer> sexpOffsets = new ArrayList<Integer>();
		ArrayList<Integer> sexpOffsetsEnd = new ArrayList<Integer>();
		for( Position p: pos){
			for( int i = p.offset; i <= p.offset + p.length; ++i){ 
				if( i < range[0] || i > range[0] + range[1] ){ //not in previous range
					int ii = Collections.binarySearch(sexpOffsets, i);
					if( ii >= 0 ){
						range[0] = sexpOffsets.get(ii).intValue();
						range[1] = sexpOffsetsEnd.get(ii).intValue();
					} else {
						int jj = Collections.binarySearch(sexpOffsetsEnd, i);
						if( jj >= 0 ){
							range[0] = sexpOffsets.get(jj).intValue();
							range[1] = sexpOffsetsEnd.get(jj).intValue();
						} else { //both ii and jj < 0
							ii = -ii - 1;
							jj = -jj - 1;
							if( ii > 0 && ii - 1 == jj){
								range[0] = sexpOffsets.get(jj).intValue();
								range[1] = sexpOffsetsEnd.get(jj).intValue();
							} else {
								range = LispUtil.getTopLevelRange(getDocument(), i);
								if( range == null ){ //not in sexp
									range = new int[]{-1, 0};
									// find prev close paren:
									try{
										int start = 0;
										for( start = i - 1; start >= 0; --start){
											if( getDocument().getChar(start) == ')'){
												break;
											}
										}
										int end = 0;
										if (i>0)
											for( end = i - 1; end < getDocument().getLength(); ++end ){
												if( getDocument().getChar(end) == '('){
													break;
												}
											}
										if( end > start ){
											range[0] = start;
											range[1] = end - start + 1;
											LispMarkers.deleteMarkers(getIFile(), range[0], range[1]);
										} else {
											range[0] = -1;
											range[1] = 0;
										}
									} catch ( BadLocationException e ){
										e.printStackTrace();
										range[0] = -1;
										range[1] = 0;														
									}
								}
								else if( !sexpOffsets.contains(range[0]) ){
									sexpOffsets.add(new Integer(range[0]));
									sexpOffsetsEnd.add(new Integer(range[0]+range[1]));
								}												
							}
						}
					}
				}
			}
		}
		// also add toDefine offsets:
		for( TopLevelItem itm: toDefine){
			if( !sexpOffsets.contains(itm.offset)){
				sexpOffsets.add(itm.offset);
				sexpOffsetsEnd.add(itm.offsetEnd);
			}
		}
		// if newForms contains multiple forms with same name and package,
		// and one of them is modified, add compilation of all forms after modified
		ArrayList<String> multForms = new ArrayList<String>();
		for( TopLevelItem itm: newForms){
			String itmTmp = itm.type+","+itm.name+","+itm.pkg;
			if( itm.type.equalsIgnoreCase("in-package")){
				
			} else 	if( multForms.contains(itmTmp) ){//duplicate items of modified forms
				sexpOffsets.add(new Integer(itm.offset));
				sexpOffsetsEnd.add(new Integer(itm.offsetEnd));
			} else if ( sexpOffsets.contains(new Integer(itm.offset))){ //modified form
				multForms.add(itmTmp);
			}
		}
		
		
		Collections.sort(sexpOffsets);
		Collections.sort(sexpOffsetsEnd);
		
		int[][] res = new int[sexpOffsets.size()][2];
		for( int i = 0; i < sexpOffsets.size(); ++i){
			res[i][0] = sexpOffsets.get(i);
			res[i][1] = sexpOffsetsEnd.get(i);
		}
		return res;
	}

	// undefines removed forms and returns unchanged forms that still should be defined
	// see the comment in the function
	private ArrayList<TopLevelItem> undefineRemovedForms(ArrayList<TopLevelItem> newForms) {
		// ==== find removed forms
		ArrayList<String> toUndefine = new ArrayList<String>(topForms.size());
		ArrayList<String> notToUndefine = new ArrayList<String>(topForms.size());
		ArrayList<TopLevelItem> toDefine = new ArrayList<TopLevelItem>(topForms.size());
		ArrayList<String> toDefineNoPos = new ArrayList<String>(topForms.size());
		ArrayList<String> newTypeNamePkg = new ArrayList<String>(newForms.size());
		ArrayList<String> oldTypeNamePkg = new ArrayList<String>(topForms.size());

		for( TopLevelItem item: newForms ){
			newTypeNamePkg.add(item.type+","+item.name+","+item.pkg);
		}
		for( TopLevelItem item: topForms ){
			oldTypeNamePkg.add(item.type+","+item.name+","+item.pkg);
		}
		
		// find removed forms
		// All complexity is to handle the following situation:
		// suppose have two function definition (defun f () 1) (defun f () 2)
		// if second definition change to (defun ff () 2) need to recompile 
		// also first definition

		for( TopLevelItem item: topForms ){
			String itemTmp = item.type+","+item.name+","+item.pkg;
			if ( itemTmp.toLowerCase().startsWith("in-package")){
				
			} else if( !newTypeNamePkg.contains(itemTmp) ){ //if not in new forms - set to undefine
				if (!toUndefine.contains(itemTmp)){//set to undefine only once
					toUndefine.add(itemTmp);
				}
			} else { //form is in new forms
				// if it is already in notToUndefine list - multiple forms
				if( notToUndefine.contains(itemTmp) ){
					// it it is already in toDefine list - it was already processed
					if ( !toDefineNoPos.contains(itemTmp) ){
						// see if need to put form for evaluation
						// first find number of times form is in old and new lists
						int nnew = 0;
						for( String itm: newTypeNamePkg){
							if( itm.equalsIgnoreCase(item.type+","+item.name+","+item.pkg)){
								++nnew;
							}
						}
						int nold = 0;
						for( String itm: oldTypeNamePkg){
							if( itm.equalsIgnoreCase(item.type+","+item.name+","+item.pkg)){
								++nold;
							}
						}
						// if number of times is not same - evaluate the form
						// that has same type/name/package but is last in
						// new forms
						if( nnew != nold ){
							int ind = newTypeNamePkg.lastIndexOf(itemTmp);
							if( ind >= 0 ){
								toDefine.add(newForms.get(ind));
							}
						}
					}
				} else {
					notToUndefine.add(itemTmp);
				}
			}
		}
		
		// === undefine removed forms (at the moment functions and tests only)
		boolean undefineTests = LispPlugin.getDefault().getCusp().getUseUnitTest(); 
		for( String itm: toUndefine){
			String[] item = itm.split(",");
			LispBuilder.CompileListener cl = new LispBuilder.CompileListener(this.getIFile(),false);
			if( item[0].equalsIgnoreCase("defun") ){
				LispPlugin.getDefault().getCusp().sendUndefine(item[1], item[2], cl);
			} else if ( undefineTests && item[0].equalsIgnoreCase("define-test") ){
				LispPlugin.getDefault().getCusp().sendUndefineTest(item[1], item[2], cl);
			}
			
		}
		
		topForms = newForms;
		return toDefine;
	}

	public void updateFoldingStructure(HashSet<Position> positions, 
			Position lastSection)
	{
		// these hold mapping between oldannotations and their positions
		HashSet<Position> oldPositions = new HashSet<Position>();
		HashMap<Position,ProjectionAnnotation> hashAnnotations = 
			new HashMap<Position, ProjectionAnnotation>();

		// prepare data structures
		{
			Iterator<?> it = projectionAnnotationModel.getAnnotationIterator();
			while(it.hasNext()){
				ProjectionAnnotation a = (ProjectionAnnotation) it.next();
				Position p = projectionAnnotationModel.getPosition(a);
				oldPositions.add(p);
				hashAnnotations.put(p, a);
			}
		}
		
		//get removed annotations
		HashSet<Position> remPositions = new HashSet<Position>();
		remPositions.addAll(oldPositions);
		remPositions.removeAll(positions);
		Annotation[] remAnnotations = new Annotation[remPositions.size()];
		{
			Iterator<Position> it = remPositions.iterator();
			int i = 0;
			while(it.hasNext()){
				remAnnotations[i] = hashAnnotations.get(it.next());
				++i;
			}
		}
		
		//get new annotations
		HashMap<ProjectionAnnotation, Position> newAnnotations = 
			new HashMap<ProjectionAnnotation, Position>();

		positions.removeAll(oldPositions);
		{
			Iterator<Position> it = positions.iterator();
			while(it.hasNext()){
				newAnnotations.put(new ProjectionAnnotation(), (Position)it.next());
			}
		}
		
		//deal with possible garbage in last section when it is collapsed
		ProjectionAnnotation lastSectionAnnotation = hashAnnotations.get(lastSection);
		boolean lastSectionCollapsed = false;
		if (lastSectionAnnotation != null ) {
			lastSectionCollapsed = lastSectionAnnotation.isCollapsed();
			projectionAnnotationModel.expand(lastSectionAnnotation);
		}
		
		projectionAnnotationModel.modifyAnnotations(remAnnotations,newAnnotations,null);
		
		if ( lastSectionCollapsed ) {
			projectionAnnotationModel.collapse(lastSectionAnnotation);
		}
	}
	
	
    public void dispose () {
        super.dispose();
        ISourceViewer viewer = getSourceViewer();
        if (viewer!=null) {
        	highlighter.uninstall(viewer);
        }
    }
    
	/**
	 * Seriously, couldn't they have made this a little easier to get at?
	 */

	public IDocument getDocument () {	 
		return getDocumentProvider().getDocument(getEditorInput());
	}

	
	
	/**
	 * We overload this to enable our handy outline page
	 */
	@SuppressWarnings("unchecked")
	public Object getAdapter(Class adapter) {
		if (adapter.equals(IContentOutlinePage.class)) {
			
			outline = new LispOutlinePage(this);
			return outline;
			
		} else {
			return super.getAdapter(adapter);
		}
	}

	/* (non-Javadoc)
	 * @see jasko.tim.lisp.editors.ILispEditor#getTextWidget()
	 */
	public void showMessage(String msg) {
		showPopupInfo(msg);
	}
	
	/* (non-Javadoc)
	 * @see jasko.tim.lisp.editors.ILispEditor#getTextWidget()
	 */
	public StyledText getTextWidget() {
		return this.getSourceViewer().getTextWidget();
	}



	public void setTabsToSpacesConverter(IAutoEditStrategy converter) {
		// TODO Auto-generated method stub
		
	}




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

	public void addHistory(SelectionPosition pos) {
		mixin.addHistory(pos);
	}

	
}
