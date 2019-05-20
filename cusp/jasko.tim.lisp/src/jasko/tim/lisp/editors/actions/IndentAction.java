package jasko.tim.lisp.editors.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.*;
import jasko.tim.lisp.editors.autoedits.LispIndentOnEnter;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.util.LispUtil;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.*;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;

/**
 * This is probably not the right place to do indentation, but it's a lot easier to do it here than in
 *  IAutoEditStrategy.
 * If somebody has a better understanding of these things, feel free to implement this in a more
 *  proper fashion.
 * @author Tim Jasko
 * @see jasko.tim.lisp.editors.autoedits.LispIndentOnEnter
 */
public class IndentAction extends LispAction {


	private ILispEditor editor;

	public IndentAction() {
	}

	public IndentAction(ILispEditor editor) {
		this.editor = editor;
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		editor = (ILispEditor)targetEditor;
	}    

	public static int getIndent(String str){
		int i = 0;
		while( i < str.length() && Character.isWhitespace(str.charAt(i)) ){
			++i;
		}
		return i;
	}
	
	
	public static int[] doLineIndent (int offset, IDocument doc)
	{
		int[]ret = {offset,0};
		try
		{
			IRegion lineInfo = doc.getLineInformation(doc.getLineOfOffset(offset));
			// do not mess with indentation of multiline strings! 
			// todo -- it might be cleaner architecturally to have this check happen in LispUtil,
			//     multiline strings can be *really* bad, so let expediency overtake purity for the nonce.
			//     - Chas Emerick
			// commented out part: if string ends with return then this would add indentation after return - bad
			//     - SK
			//mess with the indentation of the first line of a multiline string!
	
			LispUtil.MyInt minIndent = new 	LispUtil.MyInt(Math.max(0,LispUtil.getTopLevelOffset(doc, offset)));
			
			String newIndent = LispIndentOnEnter.calculateIndent(lineInfo.getOffset(), doc,new HashMap<Integer,Position>(),minIndent,false);

			int oldIndentLength = getIndent(doc.get(lineInfo.getOffset(),lineInfo.getLength()));
			if (oldIndentLength!=newIndent.length())
				doc.replace(lineInfo.getOffset(),oldIndentLength,newIndent);
			
			if (offset>=lineInfo.getOffset()+oldIndentLength) {
				ret[0] = offset+newIndent.length()-oldIndentLength;
				ret[1]=  newIndent.length()-oldIndentLength;
				return ret;
			} 
			else {
				ret[0] = lineInfo.getOffset()+newIndent.length();
				ret[1] = newIndent.length()-oldIndentLength;
				
				return ret;
			}
		}
		catch (BadLocationException e) {System.out.println("BAD LOCATION");}
		return ret;
	}

	static int sOff=0;
	static class IndentReplacement {
		int offset,indentOld; String indent; 

		IndentReplacement (int offset, int indentOld,String indent) {
			this.offset = offset;
			this.indentOld = indentOld;
			this.indent = indent;
		}
		int replaceDoc (final int off, final IDocument doc) {

			Display.getDefault().syncExec(
					new Runnable ()	{
						public void run()	{
							try {
								doc.replace(off+offset, indentOld, indent);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace(); 
							}
							sOff+= indent.length()-indentOld;
						}
					}
			);
			return sOff;

		}
	}
	private static IDocument statDoc;
	
	public static int[] doIndentHelper(int offset, int length, IDocument doc, int i0,IProgressMonitor monitor,ArrayList<IndentReplacement> indents ){
		int newOffset = offset;
		statDoc = doc;
		int newOffsetLength = length;
		int newi0Offset = i0;
		int i0length = i0 - offset;
		indents = new ArrayList<IndentReplacement>();
		try {
			int firstLine = doc.getLineOfOffset(offset);
			int i0Line = doc.getLineOfOffset(i0);
			int lastLine = doc.getLineOfOffset(offset+length);
			int lineNums = lastLine-firstLine+1;
			if (monitor!=null)
				monitor.beginTask("Indenting Lines (0/ "+lineNums+")", lineNums);
			
			// get first line indent0
			IRegion firstLineInfo = doc.getLineInformation(firstLine);
			int firstIndent = 
				getIndent(doc.get(firstLineInfo.getOffset(),
						firstLineInfo.getLength()));
			// get first line trimmed offset
			int firstTrimedOffset = 
				Math.max(0, offset - firstLineInfo.getOffset() - firstIndent);

			// get i0 line indent0
			IRegion i0LineInfo = doc.getLineInformation(i0Line);
			int i0Indent = 
				getIndent(doc.get(i0LineInfo.getOffset(),
						i0LineInfo.getLength()));
			// get last line trimmed position
			int i0TrimedOffset = Math.max(0, 
					offset + i0length - i0LineInfo.getOffset() - i0Indent);

			int newi0LineOffset = i0LineInfo.getOffset();

			// get last line indent0
			IRegion lastLineInfo = doc.getLineInformation(lastLine);
			int lastIndent = 
				getIndent(doc.get(lastLineInfo.getOffset(),
						lastLineInfo.getLength()));
			// get last line trimmed position
			int lastTrimedOffset = Math.max(0, 
					offset + length - lastLineInfo.getOffset() - lastIndent);

			int newLastLineOffset = lastLineInfo.getOffset();

			int firstIndentNew = 0;
			int lastIndentNew = 0;
			int i0IndentNew = 0;
			HashMap<Integer,Position> ranges = new HashMap<Integer,Position>();
		
			int i=0;
			
			LispUtil.MyInt minOffset = new LispUtil.MyInt(0);
			for (int funcLine = firstLine; funcLine <= lastLine; ++funcLine) {
				final IRegion lineInfo = doc.getLineInformation(funcLine);
				final String indent = LispIndentOnEnter.calculateIndent(lineInfo.getOffset(), doc,ranges,minOffset,false);
				final int indentOld = getIndent(doc.get(lineInfo.getOffset(),lineInfo.getLength()));
		
				if( funcLine == firstLine ){
					firstIndentNew = indent.length();
				}
				if( funcLine == lastLine ){
					lastIndentNew = indent.length();	
				} else {
					newLastLineOffset += indent.length() - indentOld;
				}
				if( funcLine < i0Line ){
					newi0LineOffset += indent.length() - indentOld;
				} else if (funcLine == i0Line ){
					i0IndentNew = indent.length();	
				}

				if (indentOld!=indent.length()) {
					if (monitor==null) {
						doc.replace(lineInfo.getOffset(), indentOld,indent);
					} else {
						Display.getDefault().syncExec(new Runnable () {
							public void run() {
								try {
									statDoc.replace(lineInfo.getOffset(), indentOld,indent);
								} catch (BadLocationException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						});
				/*	Display.getDefault().syncExec(new Runnable () {

						
						public void run() {
							try {
								statDoc.replace(lineInfo.getOffset(), indentOld,indent);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					});*/
					}
					
				}
				++i;
				if (monitor!=null&&i==100) {
					monitor.worked(100); i=0;
					monitor.setTaskName("Indenting Lines ("+(funcLine-firstLine+1)+"/"+lineNums+")");
				}
				
			}
			
			if (monitor!=null) monitor.done();
		/*	monitor.subTask("Indenting "+indents.size()+" lines"+"...Please Wait");
		
			for (IndentReplacement repl:indents) {
				try {
					doc.replace(repl.offset, repl.indentOld,repl.indent); 
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			int ii=3;
*/
			//monitor.setCanceled(true);
			newOffset = 
				firstLineInfo.getOffset() + firstIndentNew + firstTrimedOffset;
			newOffsetLength = 
				newLastLineOffset + lastIndentNew + lastTrimedOffset;
			newi0Offset = newi0LineOffset + i0IndentNew + i0TrimedOffset; 
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return new int[] {newOffset, newOffsetLength, newi0Offset};	
	}
	
	//not necessary to create, can just inline, but at first i thought it was necessary...
	static class RunnableStatic implements IRunnableWithProgress  {
		IDocument doc;
		int offset;
		int length;
		int i0;
		int[] result;
		ArrayList<IndentReplacement> indents = null;
		ProgressMonitorDialog monitor;
		RunnableStatic thisVar;
		RunnableStatic (int offset, int length, int i0,IDocument doc) {
		 this.doc = doc;	
		 this.offset = offset;
		 this.length = length;
		 this.i0 = i0;
		 thisVar = this;
		}
		RunnableStatic () {};
	
		public void run(IProgressMonitor monitor)
		throws InvocationTargetException, InterruptedException {
			// TODO Auto-generated method stub
			indents = null;
			result = doIndentHelper(offset,length,doc,i0,monitor,indents);	
			
		} 
		
		public int[] getResult () {return result;}	
		public void makeProgressMonitor () {
			Shell shell = LispPlugin.getActiveShellSync();		
			monitor =new ProgressMonitorDialog(shell) {
				protected void cancelPressed () {
					this.finishedRun();
				}
			};
		}
		
		public int[] start () {
			try {
				makeProgressMonitor();
				monitor.run(true,false,this);

			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return	getResult();
		}
	}
	
	static int[] result;
	public static int[] doIndent(int offset, int length, IDocument doc, int i0){

		int lastLine=-1;
		int firstLine=-1;
		try {
			lastLine = doc.getLineOfOffset(offset+length);
			firstLine = doc.getLineOfOffset(offset);
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (firstLine!=-1&&lastLine-firstLine+1<=150) {
			return doIndentHelper(offset,length,doc,i0,null,null);
		}
		final RunnableStatic runnable = 	new RunnableStatic (offset,length,i0,doc);
		result = runnable.start();
		//calculating indents
	
		
		//doing the actual indents
		//final ArrayList<IndentReplacement> indents = runnable.indents;
			
			

		


		return result;
	}	

	  public void run() {
         /* Supposedly, this is supposed to get the 'visible region' . ha ha.
          * ISourceViewer viewer = ((LispEditor)editor).getViewer();
          IRegion region = viewer.getVisibleRegion();*/
          ITextSelection ts = 
                  (ITextSelection) editor.getSelectionProvider().getSelection();
          int[] newOffset = doIndent(ts.getOffset(),ts.getLength(),editor.getDocument(),ts.getOffset());
          getOffset(); //this unhighlights everything and prevents scrolling up;
       //Supposed to reset selection, but also happens to scrolle ditor up to start of selection
          //editor.getSelectionProvider().setSelection(new TextSelection(newOffset[0],newOffset[1]-newOffset[0]));
        //  viewer.revealRange(region.getOffset(), region.getLength());
   
    }

	  
}
