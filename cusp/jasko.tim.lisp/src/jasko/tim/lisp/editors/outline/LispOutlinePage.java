package jasko.tim.lisp.editors.outline;

import jasko.tim.lisp.*;
import jasko.tim.lisp.editors.*;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.cusp.*;
import jasko.tim.lisp.util.*;
import jasko.tim.lisp.util.TopLevelItemSort.Sort;

import java.util.*;

import jasko.tim.lisp.editors.assist.*;

import org.eclipse.swt.graphics.*;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.action.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.views.contentoutline.*;

public class LispOutlinePage extends ContentOutlinePage 
	implements MouseListener, KeyListener, MouseTrackListener{

	LinkedList <TopLevelItem> currentPackages = new LinkedList<TopLevelItem>(); 

	
	Sort sort = Sort.Position;
	IAction sortType;
	IAction sortAlpha;
	IAction sortPosition;
	
	LispEditor editor;
	LispTextHoverControlCreator tooltipCreator;
	IInformationControl tooltip;
	

	public  String getPackage ( int offset) {
		IDocument doc = editor.getDocument();
		if (editor.getPackages()!=null) {
			Set<Position> offsets = editor.getPackages().keySet();
			int i=0;
			Position prevPos = null;
			for (Position pos:offsets) {
				if (i==0) prevPos=pos;
				if (offset<pos.getOffset()&&i!=0||i==offsets.size()-1&&offset>pos.getOffset()) {
					if (prevPos!=null) {
						TopLevelItem item;
						
						Position usedPos;
						if (i==offsets.size()-1) {
							usedPos = pos;
							item = editor.getPackages().get(pos);
						} else {
							usedPos = prevPos;
							item = editor.getPackages().get(prevPos);
						}
						
						if (item==null) {
							editor.removePackagePosition(usedPos);
							return null;
						}
						LispNode exp = LispParser.parse(LispUtil
											.getTopLevelExpression(doc,item.offset)).get(0);
					/*	if (!(exp.get(0).value.equalsIgnoreCase("in-package"))) {
							editor.removePackagePosition(usedPos);
							return null;
						} Should Never Happen
						*/
						return exp.get(1).value.trim();
					}

					return null;
				}
				prevPos = pos; ++i;
			}
		}
		return null;
	}

	private ArrayList<TopLevelItem> items = new ArrayList<TopLevelItem>();
	private HashMap<TopLevelItem,Position> itemPos = 
		new HashMap<TopLevelItem,Position>();
	private HashMap<TopLevelItem,TreeItem> itemTr = 
		new HashMap<TopLevelItem,TreeItem>();
	
	public LispOutlinePage(LispEditor editor) {
		this.editor = editor;
		sort = getDefaultSort();
	}

	
	private boolean everyWhitespace (IDocument doc, int offset, int amount) throws BadLocationException
	{
		for (int i=offset;i<offset+amount;i++)
			if (!(Character.isWhitespace(doc.getChar(i))))
				return false;
		return true;
	}
	
	
	private void updateTree() throws BadLocationException{
		//backspace is unacceptably slow. Change
		
		// get changed offsets

		ArrayList<Integer> changedTopLevelPos;
		IDocument doc = editor.getDocument();
		if( null == doc ){
			return;
		}

		Position[] changedPos = editor.getAndClearChangedPosForOutline();
		//I have no clue what is causing backspace to take so long.
		/*int change = 20;
-		if (changedPos.length<=change&&everyWhitespace(doc,changedPos[0].offset,change)) {
			Position p = changedPos[0];
			if (doc.getLineOffset(doc.getLineOfOffset(p.offset+change+1))==p.offset+change+1&&Character.isWhitespace(doc.getChar(p.offset+change+1))) {
				return;
			}}
        */
		
		changedTopLevelPos = new ArrayList<Integer>();
		int cachedOffset = -1;
		if (doc.getLength()>0) {
			for(Position pos : changedPos)   {				
				if( !pos.isDeleted ) { 
					Integer offset = new Integer(LispUtil.getTopLevelOffset(doc, 
							Math.max(Math.min(pos.offset,doc.getLength()-1),0), true,-1));
					if (offset<=0) offset = new Integer(LispUtil.getTopLevelOffset(doc,0, true,1));
				
					int intVal = offset.intValue(); 
					if( intVal != cachedOffset 
							&& !changedTopLevelPos.contains(offset) &&intVal>=0 ){
						cachedOffset = intVal;
						changedTopLevelPos.add(offset);
						//dealing with deleted toplevel in-packages
					
						
					}
					
					//Faster version than commented out code below
					//set prevOffset and then move to next line
                    int prevOffset = Math.max(Math.min(offset,doc.getLength()-1),0);
                    int line = doc.getLineOfOffset(prevOffset)+1;
                    int maxLine = doc.getLineOfOffset(doc.getLength()-1);
                    if (maxLine>line) {
                    	prevOffset = doc.getLineOffset(doc.getLineOfOffset(prevOffset)+1);
                    	if (!(prevOffset<0||prevOffset>=doc.getLength()||prevOffset>pos.offset+pos.length)) {
                    		while (true) {

                    			offset = LispUtil
                    			.getTopLevelOffset(doc, 
                    					prevOffset,
                    					true,1);
                    			//move to next line
                    	
                    			if (offset<0||offset>pos.offset+pos.length||doc.getLineOfOffset(offset)==maxLine) break;
                    			prevOffset = doc.getLineOffset(doc.getLineOfOffset(offset)+1);
                    			if (!changedTopLevelPos.contains(offset))
                    				changedTopLevelPos.add(offset);
                    		}}}
						
				/*	for( int i = 0; i < pos.length; ++i ){
						offset = new Integer(LispUtil
								.getTopLevelOffset(doc, 
										Math.max(Math.min(pos.offset+i,doc.getLength()-1),0),
										true));
						intVal = offset.intValue();
						if( intVal!= cachedOffset 
								&& !changedTopLevelPos.contains(offset) && intVal>=0){
							cachedOffset = offset.intValue();
							changedTopLevelPos.add(offset);
						}			
					} */
				}
			}
		}

		// split these into added and modified
		// first put all old positions as candidates for modified
		ArrayList<Integer> modifiedPos = new ArrayList<Integer>(itemPos.size());
		for(Position pos : itemPos.values()){
			modifiedPos.add(new Integer(pos.offset-1));
		}
		// possibly modified positions
		modifiedPos.retainAll(changedTopLevelPos); 
		// added positions
		changedTopLevelPos.removeAll(modifiedPos);

		//run over elements in tree, update offsets of items,
		//and modify name and type if necessary
		//also remove cached tooltips
		//also resort if by alpha or type

		for( TopLevelItem item : itemPos.keySet()) {
			Position pos = itemPos.get(item);
			if( item.offset != pos.offset-1){
				item.offset = pos.offset-1;
				item.info = "";
			}
			if( modifiedPos.contains(new Integer(item.offset))){
				TopLevelItem itm = null; //"throw away" item
				try{
					if( doc.getChar(item.offset) == ';'){ //section
						String val = doc.get(item.offset,
								doc.getLineLength(doc
										.getLineOfOffset(item.offset)));
						itm = LispUtil.getSectionItem(
								new LispComment(val, item.offset,
										item.offset + val.length()),
										item.offset);
					} else { //sexp
						LispNode exp = LispParser.parse(LispUtil
								.getTopLevelExpression(doc, 
										Math.min(item.offset + 1,
												doc.getLength()-1))).get(0);
						itm = LispUtil.getTopLevelItem(exp, "", item.offset);
						if (LispEditor.isPackageName(itm.name)) {
							editor.addPackagePosition(itm);
						} else {
							//modified position in-packages = are they still in-packages?
							Position oldPos = new Position(itm.offset+1);
							
							if (editor.isPackagePosition(oldPos)) {
								//technically don't need, because getting the toplevel 
								//position of a in-package will return ""?
								editor.removePackagePosition(oldPos);
							}
				
							if (LispEditor.isPackageItem(itm)) {
								editor.addPackagePosition(itm);
							}
						}
						
					}
				} catch ( BadLocationException e ){
					e.printStackTrace();
				}
				if( itm != null ){
					item.offset = itm.offset;
					item.offsetEnd = itm.offsetEnd;
					item.info = "";
					TreeItem tr = itemTr.get(item);
					tr.setImage(CuspResources.getImageForType(itm.type));

					
					
					
					if( sort == Sort.Type && !item.type.equals(itm.type) ){
						TreeItem[] typeNodes = 
							getTreeViewer().getTree().getItems();
						int i, j;
						for( i = 0; i < typeNodes.length; ++i ){
							if( typeNodes[i].getText().equals(itm.type) ){
								break;
							}
						}
						for( j = 0; j < typeNodes.length; ++j ){
							if( typeNodes[j].getText().equals(item.type) ){
								break;
							}
						}
						TreeItem typeNode;
						TreeItem oldtypeNode = typeNodes[j];
						if( i >= typeNodes.length ){ //create new category
							typeNode = 
								new TreeItem(getTreeViewer().getTree(),SWT.NONE);
							typeNode.setText(itm.type);
							typeNode.setImage(CuspResources
									.getImageForType(itm.type));
							typeNode.setData("");
						} else {
							typeNode = typeNodes[i];
						}
						TreeItem tmp = 
							new TreeItem(typeNode,SWT.NONE,
									getIndex(item.offset,
											typeNode.getItems()));
						tr.setText(itm.name);
						copyItem(tr,tmp);
						itemTr.put(item, tmp);
						tr.dispose();
						if( oldtypeNode.getItemCount() < 1 ){ //remove this category
							oldtypeNode.dispose();
						}
					} else if( sort == Sort.Alpha 
							&& !item.name.equals(itm.name)){
						TreeItem[] nodes = 
							getTreeViewer().getTree().getItems();
						int i;
						for( i = 0; i < nodes.length; ++i ){
							if( nodes[i].getText()
									.compareToIgnoreCase(itm.name) >= 0 ){
								break;
							}
						}
						TreeItem tmp = 
							new TreeItem(getTreeViewer().getTree(),SWT.NONE,i);
						tr.setText(itm.name);
						copyItem(tr,tmp);
						itemTr.put(item, tmp);
						tr.dispose();
					} else {
						tr.setText(itm.name);
					}
					item.name = itm.name;
					item.type = itm.type;						
				}
			}
		}

		// get new items to add
		ArrayList<TopLevelItem> newItems = 
			new ArrayList<TopLevelItem>(changedTopLevelPos.size());
		int ii=0;
		//**for efficient package finding
		int packageCount = 0;
		LinkedHashMap<Integer,String> packages =null;//= LispUtil.getPackages(doc.get());
		Integer[] keyArray=null; //= (Integer[]) packages.keySet().toArray(new Integer[0]);
		int nextPackageOffset = -1;//(keyArray.length>0?keyArray[0]:doc.getLength()+1);
		String currentPackage = "";//packages.get(nextPackageOffset);
		boolean foundPackages = false;

		//**
		for( Integer offs : changedTopLevelPos){
			TopLevelItem itm = null;
			int offset = offs.intValue();

			try{
				if( doc.getChar(offset) == ';'){ //section
					String val = doc.get(offset, 
							doc.getLineLength(doc.getLineOfOffset(offset)));
					itm = LispUtil.getSectionItem(
							new LispComment(val, offset, offset + val.length()),
							offset);
				} else { //sexp doc.get(offs,changedTopLevelPos.get(i+1));
					if (foundPackages==false)
					{
						packages= LispUtil.getPackages(LispParser.parse(doc.get(changedTopLevelPos.get(0),
								changedTopLevelPos.get(changedTopLevelPos.size()-1)-changedTopLevelPos.get(0)))
						);
						if (packages.size()>0) {
							keyArray = packages.keySet().toArray(new Integer[0]);
							foundPackages = true;
							nextPackageOffset = (keyArray.length>1?keyArray[0]:doc.getLength()+1);
							currentPackage = packages.get(nextPackageOffset); 
						} else {
							nextPackageOffset=-1;
						}
					}
					if (ii>=nextPackageOffset&&nextPackageOffset>=0)
					{
						currentPackage = packages.get(nextPackageOffset);
						if (packageCount==keyArray.length)
						{
							nextPackageOffset = doc.getLength()+1;
						}
						else { 
							nextPackageOffset = keyArray[++packageCount];
						}
					}

				
						LispNode exp = LispParser.parse(doc.get(offs,ii+1<changedTopLevelPos.size()?changedTopLevelPos.get(ii+1)-offs:
							                                                 doc.getLength()-offs)).get(0); 
					
						itm = LispUtil.getTopLevelItem(exp, 
								                       currentPackage, offset);
						
					


				}
				if (itm!=null&&itm.offset+1<doc.getLength()) {
					newItems.add(itm);
					Position pos = new Position(itm.offset+1);
					editor.addOutlinePosition(itm,pos);
					itemPos.put(itm, pos);
				}
				ii++;
			} catch (BadLocationException e ){
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();

			};
			
		}

		// finally refresh tree adding new items
		// first sort new items
		TopLevelItemSort sorter = new TopLevelItemSort();
		sorter.sortItems(newItems, sort);

		if( sort == Sort.Position ){
			Tree tree = getTreeViewer().getTree();
			for( TopLevelItem item : newItems){
				TreeItem[] roots = getTreeViewer().getTree().getItems();
				int i = getIndex(item.offset,roots);
				TreeItem tmp = null;
				if( i > 0 && ((TopLevelItem)(roots[i-1].getData())).type
						.equals("section") ){
					if( item.type.equals("section") ){
						//move necessary items from previous section to this
						tmp = new TreeItem(tree,SWT.NONE,i);
						TreeItem[] kids = roots[i-1].getItems();
						int start = getIndex(item.offset,kids);
						for( int j = start; j < kids.length; ++j ){
							TreeItem tmpkid = new TreeItem(tmp,SWT.NONE);
							copyItem(kids[j],tmpkid);
							kids[j].dispose();
						}
					} else {
						tmp = new TreeItem(roots[i-1],
								SWT.NONE,getIndex(item.offset, 
										roots[i-1].getItems()));						
					}
				} else {
					tmp = new TreeItem(tree,SWT.NONE,i);						
					if( item.type.equals("section") ){
						//move necessary items from tree to this
						for( int j = i; j < roots.length; ++j ){
							if( ((TopLevelItem)(roots[j].getData())).type
									.equals("section") ){
								break;
							} else {
								TreeItem tmpkid = new TreeItem(tmp,SWT.NONE);
								copyItem(roots[j],tmpkid);
								roots[j].dispose();								
							}
						}						
					}
				}
				tmp.setImage(CuspResources.getImageForType(item.type));
				tmp.setText(item.name);
				tmp.setData(item);
				itemTr.put(item, tmp);
			}
		} else if ( sort == Sort.Type ) {
			for( TopLevelItem item : newItems){
				TreeItem[] typeNodes = getTreeViewer().getTree().getItems(); //types
				//find type
				int i;
				for( i = 0; i < typeNodes.length; ++i ){
					if( typeNodes[i].getText().equals(item.type) ){
						break;
					}
				}
				TreeItem typeNode; 
				if( i >= typeNodes.length ){ //create new category
					typeNode = 
						new TreeItem(getTreeViewer().getTree(),SWT.NONE);
					typeNode.setText(item.type);
					typeNode.setImage(CuspResources
							.getImageForType(item.type));
					typeNode.setData(""); //Weirdly enought, without this, errors will start!
					
					
				} else {
					typeNode = typeNodes[i];
				}
				TreeItem tmp = 
					new TreeItem(typeNode,SWT.NONE,
							getIndex(item.offset,
									typeNode.getItems())); 
				tmp.setImage(CuspResources.getImageForType(item.type));
				tmp.setText(item.name);
				tmp.setData(item);
				itemTr.put(item, tmp);
			}
			// remove top level items without kids
			for( TreeItem node : getTreeViewer().getTree().getItems()){
				if(0 == node.getItemCount()){
					node.dispose();
				}
			}
		} else { // sort is Alpha
			for( TopLevelItem item : newItems){
				TreeItem[] nodes = getTreeViewer().getTree().getItems(); //types
				int i;
				for( i = 0; i < nodes.length; ++i ){
					if( nodes[i].getText().compareToIgnoreCase(item.name) >= 0 ){
						break;
					}
				}
				TreeItem tmp = 
					new TreeItem(getTreeViewer().getTree(),SWT.NONE,i);
				tmp.setImage(CuspResources.getImageForType(item.type));
				tmp.setText(item.name);
				tmp.setData(item);
				itemTr.put(item, tmp);
			}
		}
		//finally update items array
		items.clear();
		items.addAll(itemPos.keySet());
	
		
	}

	// get index in items where offset is located, when sorted by offsets
	private int getIndex(int offset, TreeItem[] items){
	try
	{ if(items == null || items.length == 0 ){
			return 0;
		}
		TopLevelItem item0 = (TopLevelItem)(items[0].getData());
		int i = 0;
		if (item0==null) {
			items[0].dispose(); return i;
		}
		if(offset > item0.offset ){
			for( i = 1; i < items.length; ++i ){
				TopLevelItem item1 = (TopLevelItem)(items[i].getData());
				if( offset > item0.offset 
						&& offset < item1.offset ){
					break;
				}
				item0 = item1;
			}
		}

		 return i;
	} catch(Exception e) {
			e.printStackTrace(); return 0;
		}
		
		}
	

	// === dealing with the tree - they could have made it easier!
	
	//copies most data "from" "to"
	private void copyItem(TreeItem from, TreeItem to){
		if( from == null || to == null ){
			return;
		}
		to.setBackground(from.getBackground());
		to.setChecked(from.getChecked());
		to.setData(from.getData());
		to.setFont(from.getFont());
		to.setForeground(from.getForeground());
		to.setGrayed(from.getGrayed());
		to.setImage(from.getImage());
		to.setText(from.getText());
	}
	
	// move all kids "from" "to" putting them at the end of "to" 
	// (don't move disposed and their kids)
	// also update itemTr
	private void moveKids(TreeItem from, TreeItem to){
		if( from == null || from.getItemCount() == 0){
			return;
		}
		if( to != null ){
			for( TreeItem item: from.getItems() ){
				if( !item.isDisposed() ){
					TreeItem tmp = new TreeItem(to,item.getStyle());
					copyItem(item,tmp);
					itemTr.put((TopLevelItem)(item.getData()), tmp);
					if(item.getItemCount() > 0){
						moveKids(item,tmp);
					}					
				}
			}			
		} else { // if to == null move to front of the tree 
			//(before first element with kids)
			//find index of first non disposed element with kids
			Tree tree = getTreeViewer().getTree();
			TreeItem[] items = tree.getItems();
			int i = 0;
			for( i = 0; i < items.length; ++i ){
				if(items[i].getItemCount() > 0 && !items[i].isDisposed()){
					break;
				}
			}
			for( TreeItem item: from.getItems() ){
				if( !item.isDisposed() ){
					TreeItem tmp = new TreeItem(tree,item.getStyle(),i);
					copyItem(item,tmp);
					itemTr.put((TopLevelItem)(item.getData()), tmp);
					++i;
					if(item.getItemCount() > 0 ){
						moveKids(item,tmp);
					}					
				}
			}
		}
	}
	
	private boolean isDeletedTopLevel(TopLevelItem item){
		if( item == null ){
			return true;
		}
		Position pos = itemPos.get(item);
		if( pos == null || pos.isDeleted ){
			return true;
		}
		int offset =
			LispUtil.getTopLevelOffset(editor.getDocument(), pos.offset,true,-1); 
		if( offset != pos.offset-1 ){
			return true;
		}
		return false;
	}
	
//works on tree up to 2 levels deep (exactly what we use for LispOutlinePage)
	private void removeDeletedItems(){
		Tree tree = getTreeViewer().getTree();
		TreeItem[] items = tree.getItems();
		for( int i = 0; i < items.length; ++i ){
			TreeItem titem = items[i];
			if( !titem.isDisposed() ){
				if( sort != Sort.Type ){
					TopLevelItem item = (TopLevelItem)titem.getData();
					
					//- sections) or alpha
					// first remove deleted kids (they in turn do not have kids)
					for( TreeItem itm : titem.getItems() ){
						TopLevelItem tmp = (TopLevelItem)itm.getData();
						if( tmp != null && isDeletedTopLevel(tmp)){
							itemPos.remove(tmp);
							itemTr.remove(tmp);
							itm.dispose();
						}
					}
					// now delete items and move kids
					if(isDeletedTopLevel(item)){ //remove item
						if( titem.getItemCount() > 0 ){
							if(i == 0){
								moveKids(titem,null);
							} else if ( items[i-1].getItemCount() > 0 ){
								moveKids(titem,items[i-1]);
							} else {
								moveKids(titem,null);
							}
						}
						itemPos.remove(item);
						itemTr.remove(item);
						titem.dispose();
					}				
				} else {
					for( TreeItem itm : titem.getItems() ){
						TopLevelItem tmp = (TopLevelItem)itm.getData();
						if( tmp != null && isDeletedTopLevel(tmp)){
							itemPos.remove(tmp);
							itemTr.remove(tmp);
							itm.dispose();
						}
					}					
				}
			}
		}
	}
	
	private Sort getDefaultSort() {
		IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
		int sortInt = prefs.getInt(PreferenceConstants.OUTLINE_SORT);
		switch (sortInt) {
		case 0:
			return Sort.Alpha;
		case 1:
			return Sort.Position;
		case 2:
			return Sort.Type;
		default:
			return Sort.Alpha;	
		}
	}
	
	private void setDefaultSort() {
		IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
		int sortInt = 0;
		switch(sort) {
		case Alpha:
			sortInt = 0;
			break;
		case Position:
			sortInt = 1;
			break;
		case Type:
			sortInt = 2;
			break;
		}
		
		prefs.setValue(PreferenceConstants.OUTLINE_SORT, sortInt);
	}
	
	public void updateOutline(){
		removeDeletedItems();
		
			try {
				updateTree();
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public void makeContributions(IMenuManager menuMgr,
         IToolBarManager toolBarMgr,
         IStatusLineManager statusLineMgr) {

		sortAlpha = new Action("Sort by name") {
			public void run() {
				sort = Sort.Alpha;
				setDefaultSort();
				this.setChecked(true);
				sortType.setChecked(false);
				sortPosition.setChecked(false);
				sortItems();
				redoTree();
			}
		};
		sortAlpha.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.SORT_ALPHA));
		if (sort == Sort.Alpha) {
			sortAlpha.setChecked(true);
		} else {
			sortAlpha.setChecked(false);
		}
		sortAlpha.setToolTipText("Sort by name");
		
		
		sortType = new Action("Sort by type") {
			public void run() {
				sort = Sort.Type;
				setDefaultSort();
				this.setChecked(true);
				sortAlpha.setChecked(false);
				sortPosition.setChecked(false);
				sortItems();
				redoTree();
			}
		};
		sortType.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.SORT_TYPE));
		if (sort == Sort.Type) {
			sortType.setChecked(true);
		} else {
			sortType.setChecked(false);
		}
		sortType.setToolTipText("Sort by type");
		
		sortPosition = new Action("Sort by position") {
			public void run() {
				sort = Sort.Position;
				setDefaultSort();
				this.setChecked(true);
				sortType.setChecked(false);
				sortAlpha.setChecked(false);
				sortItems();
				redoTree();
			}
		};
		sortPosition.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.SORT_POSITION));
		if (sort == Sort.Position) {
			sortPosition.setChecked(true);
		} else {
			sortPosition.setChecked(false);
		}
		sortPosition.setToolTipText("Sort by position");

		toolBarMgr.add(sortPosition);
		toolBarMgr.add(sortAlpha);
		toolBarMgr.add(sortType);
	}
	
	
	public void createControl(Composite parent) {
		super.createControl(parent);

		IDocument doc = editor.getDocumentProvider().getDocument(
				  editor.getEditorInput());
		
		if( null == doc ){
			return;
		}

		Tree tree = getTreeViewer().getTree();
		
		getTreeViewer().getControl().addMouseListener(this);
		getTreeViewer().getControl().addKeyListener(this);		
		tree.addMouseTrackListener(this);
		
		tooltipCreator = new LispTextHoverControlCreator();
		tooltip = tooltipCreator.createInformationControl(tree.getShell());
		
		LispNode file = LispParser.parse(doc.get() + "\n)");
		fillTree(file);
	}

	
	private void fillTree(LispNode file) {
		items = LispUtil.getTopLevelItems(file,"");
		itemPos.clear();
		editor.clearOutlinePositions();
		for( TopLevelItem item : items ){
			Position pos = new Position(item.offset+1);
			editor.addOutlinePosition(item,pos);
			itemPos.put(item, pos);
		}
		sortItems();
		redoTree();
	}
	
	private void sortItems() {
		TopLevelItemSort sorter = new TopLevelItemSort();
		sorter.sortItems(items, sort);
	}
	 
	private void redoTree() {
		getControl().setRedraw(false);
		Tree tree = getTreeViewer().getTree();
		tree.removeAll();
		itemTr.clear();
		String currType = "()"; //impossible type
		TreeItem category = null;
		for (TopLevelItem item: items) {
			TreeItem temp;
			if (sort == Sort.Alpha) {
				temp = new TreeItem(tree, SWT.NONE);
			} else if ( sort == Sort.Position ) {
				if(category == null) {
					temp = new TreeItem(tree, SWT.NONE);
					if ( item.type.equals("section") ) {
						category = temp;
					}
				} else {
					if ( item.type.equals("section")){
						temp = new TreeItem(tree, SWT.NONE);
						category = temp;
					} else {
						temp = new TreeItem(category, SWT.NONE);
					}
				}
			} else { // sort by type
				if (!item.type.equals(currType)) {
					currType = item.type;
					category = new TreeItem(tree, SWT.NONE);
					category.setText(currType);
					category.setImage(CuspResources.getImageForType(currType));
					category.setData("");
				}
				temp = new TreeItem(category, SWT.NONE);
			}
			
			temp.setImage(CuspResources.getImageForType(item.type));
			temp.setText(item.name);
			temp.setData(item);
			//edit
			itemTr.put(item, temp);
			
		}
		
		getControl().setRedraw(true);
	}	
	
	private TopLevelItem lastSelection;
	
	public void selectionChanged(SelectionChangedEvent event) {
		try {
			IStructuredSelection sel = 
				(IStructuredSelection) event.getSelection();
			
			if (! sel.isEmpty()) {
				if (sel.getFirstElement() instanceof TopLevelItem) {
					TopLevelItem item = (TopLevelItem) sel.getFirstElement();
					if (item != lastSelection) {
						lastSelection = item;
						editor.selectAndReveal(itemPos.get(item).offset-1,
								item.type.length() + 1);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // void selectionChanged( ... )
	
	public void mouseDown(MouseEvent e) {
		IStructuredSelection sel = 
			(IStructuredSelection) getTreeViewer().getSelection();
		if (! sel.isEmpty()) {
			if (sel.getFirstElement() instanceof TopLevelItem) {
				TopLevelItem item = (TopLevelItem) sel.getFirstElement();
				lastSelection = item;
				int pos = itemPos.get(item).offset-1;
				editor.selectAndReveal(pos, item.type.length() + 1);							
			}
		}
	}
	
	String search = "";
	
	private boolean isSearchable(char c) {
		if ("1234567890qwertyuiopasdfghjklzxcvbnm!@#$%^&*()_-=+{}|[]\\:;\"\'<>?,./`~"
				.indexOf(Character.toLowerCase(c)) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void keyPressed(KeyEvent e) {
		System.out.println(search);
		if (e.keyCode == SWT.ESC) {
			search = "";
		} else if (e.character == SWT.BS) {
			search = search.substring(0, search.length() - 1);
		} else if (isSearchable(e.character)) {
			search += e.character;
			
			for (TreeItem node: getTreeViewer().getTree().getItems()) {
				if (node.getText().startsWith(search)) {
					getTreeViewer().getTree().setSelection(node);
					if (node.getData() instanceof TopLevelItem) {
						TopLevelItem item = (TopLevelItem) node.getData();
						lastSelection = item;
						editor.selectAndReveal(itemPos.get(item).offset-1, 
								item.type.length() + 1);
					}
					return;
				}
			}
			this.getSite().getShell().getDisplay().beep();
		}
	}
	
	public void setFocus() {
		search = "";
	}
	
	
	/**
	 * Updates the content view to reflect changes in the file.
	 */
	public void update(LispNode file) {
		fillTree(file);
	} // void update()
	
	public void mouseDoubleClick(MouseEvent e) {
		// meh
	}

	public void mouseUp(MouseEvent e) {
		// also meh
	}

	public void keyReleased(KeyEvent e) {
		// powers of meh combine!
	}

	public void mouseEnter(MouseEvent e){
	}
	
	// Still allows the user to escape the outline by moving over the tooltip
	public void mouseExit(MouseEvent e){
		//Tree tree = getTreeViewer().getTree();
		//Rectangle rt = tree.getClientArea();
		//if( e.x <= rt.x || e.y <= rt.y 
		//		|| e.x >= rt.x + rt.width || e.y >=rt.y + rt.height ){
			tooltip.setVisible(false);
			tooltipItem = null;
		//}
	}
	
	//show tooltip
	private TreeItem tooltipItem = null;
	
	public void mouseHover(MouseEvent e){
		IPreferenceStore prefs = LispPlugin.getDefault().getPreferenceStore();
		Boolean showToolTip = 
			prefs.getBoolean(PreferenceConstants.SHOW_OUTLINE_HINT);
		
		if( showToolTip ){
			Point pt = new Point(e.x,e.y);
			final Tree tree = getTreeViewer().getTree();
			TreeItem item = tree.getItem(pt);
			
			if( item != null && item != tooltipItem && item.getData() != null ){
				final Point ptHint = 
					new Point(e.x,item.getBounds().y 
							+ (int)Math.round(1.5*item.getBounds().height));
				tooltipItem = item;
				final TopLevelItem tr = (TopLevelItem)(item.getData());
				if( !tr.type.equals("section") ){
					Position pos = itemPos.get(tr);
					if( pos != null ){
						if( tr.info == null || tr.info.equals("") || tr.info.equals("nil") ){ //not cached
							final String variable = tr.name;
							final CuspInterface cusp = LispPlugin.getDefault().getCusp();
							cusp.sendGetArglist(variable, tr.pkg, new CuspRunnable() {
								public void run() {										
									final String args = getReturn().value;
									cusp.sendGetDocumentation(variable, tr.pkg, new CuspRunnable() {
										public void run() {
											String docstr = getReturn().value;
											tr.info = args;
											if( tr.info.equalsIgnoreCase("nil") ){
												tr.info = "";
											}
											if(docstr != null && !docstr.equals("") 
													&& !docstr.equals("nil")){
												if( tr.info.equals("") ){
													tr.info = docstr;
												} else {
													tr.info += "\n"+docstr;										
												}
											}
											if( tr.info != null && !tr.info.equals("") 
													&& !tr.info.equals("nil") ){
												tooltip.dispose();
												tooltip = tooltipCreator.createInformationControl(tree.getShell());
												tooltip.setInformation(tr.info);
												Point size = tooltip.computeSizeHint();
												tooltip.setSize(size.x, size.y);
												tooltip.setLocation(tree.toDisplay(ptHint));
												tooltip.setVisible(true);
											} else {
												tooltip.setVisible(false);
											}
										}
									});
								}
							});				
						} else { //cached
							tooltip.dispose();
							tooltip = tooltipCreator.createInformationControl(tree.getShell());
							tooltip.setInformation(tr.info);
							Point size = tooltip.computeSizeHint();
							tooltip.setSize(size.x, size.y);
							tooltip.setLocation(tree.toDisplay(ptHint));
							tooltip.setVisible(true);
						}
					} else {
						tooltip.setVisible(false);
					}
				} else {
					tooltip.setLocation(tree.toDisplay(ptHint));
				}
			}
		}
	}
}
