package jasko.tim.lisp.editors.autoedits;

import java.util.HashMap;

import jasko.tim.lisp.*;
import jasko.tim.lisp.editors.LispPartitionScanner;
import jasko.tim.lisp.editors.actions.IndentAction;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;
import jasko.tim.lisp.cusp.CuspInterface;
import jasko.tim.lisp.util.*;

import org.eclipse.jface.text.*;
import org.eclipse.ui.IEditorPart;

public class LispIndentOnEnter implements IAutoEditStrategy {

	/*private void cmdEnd(DocumentCommand c, int offset) {
		c.shiftsCaret = false;
		c.caretOffset = offset;
		c.doit = false;
		c.text = "";
		return;
	}	*/

	public void customizeDocumentCommand(IDocument doc, DocumentCommand comm) {
		if ((comm.text.endsWith("\n") || comm.text.endsWith("\r")))
		{
			boolean action = 
				PreferenceInitializer.getStore().getBoolean(PreferenceConstants.INDENT_PREVIOUS_LINE);
			int change[];
			if (action) {
				change =IndentAction.doLineIndent(comm.offset,doc);	
				comm.offset += change[1];
			} 

			LispUtil.MyInt nearestToplevel = new LispUtil.MyInt(Math.max(0,LispUtil.getTopLevelOffset(doc, comm.offset)));
			//determine if enter is at end of line?
	
			comm.text += calculateIndent(comm.offset, doc,new HashMap<Integer,Position>(),nearestToplevel,true);	
		}
	}

	public static boolean onlyWhitespace (IDocument doc, int offset) throws BadLocationException {
		IRegion line =  doc.getLineInformationOfOffset(offset);
		int lineEnd = line.getOffset()+line.getLength();
		for (int i=offset;i<lineEnd;i++) {
			if (!Character.isWhitespace(doc.getChar(i)))
				return false;
		}
		return true;
	}
	
	public static String calculateIndent2 (int offset,IDocument doc,HashMap<Integer,Position> ranges,LispUtil.MyInt minOffset,boolean indentOnEnter) {

		LispUtil.FunctionInfo fi = LispUtil.getCurrentFunctionInfoWithHash(doc, offset,ranges,minOffset,true);
		if (fi==null) {
			return "";
		}
		if (fi.offset < 0) {
			minOffset.setValue( offset);
			return "";
		}
	

		LispUtil.FunctionInfo prevFunc = LispUtil.getCurrentFunctionInfoWithHash(doc, fi.offset,ranges,minOffset,false);
		LispUtil.FunctionInfo prev2Func = LispUtil.getCurrentFunctionInfoWithHash(doc, prevFunc.offset,ranges,minOffset,false);
		
		fi.name = fi.name.toLowerCase();
		prevFunc.name = prevFunc.name.toLowerCase();
		prev2Func.name = prev2Func.name.toLowerCase();
		
		boolean inComment = false;
		try {
			ITypedRegion region = doc.getPartition(offset);
			if (region.getType().equals(LispPartitionScanner.LISP_COMMENT)) {
				offset = region.getOffset()-1;
				inComment= true;
				
			}
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//System.out.println("***" + fi.name);
		//System.out.println(prevFunc.name);
		//System.out.println(prev2Func.name);
		
		try {
			int funcLine = doc.getLineOfOffset(fi.offset);
			int funcLineOffset = doc.getLineOffset(funcLine);
			
			String indent = "";
			for (int i=funcLineOffset; i<fi.offset; ++i) {
				if (doc.getChar(i) == '\t') {
					indent += "\t";
				} else {
					indent += " ";
				}
			}
			
			CuspInterface cusp = LispPlugin.getDefault().getCusp();
			//System.out.println("*prev2: " + prev2Func.name + "," +  LispUtil.getParameterNumber(doc, offset, prev2Func));
			//System.out.println("*prev: " + prevFunc.name + "," + LispUtil.getParameterNumber(doc, offset, prevFunc));
			//System.out.println("*fi: " + fi.name + "," +  LispUtil.getParameterNumber(doc, offset, fi));
			if (cusp.specialIndents.containsKey(fi.name)) {
				indent += cusp.specialIndents.get(fi.name);
			} else if (cusp.fletIndents.containsKey(prev2Func.name)
					&& LispUtil.getParameterNumber(doc, offset, prev2Func) == 1) {
				indent += "  ";
			} else if (cusp.indents.containsKey(fi.name)) {
				int paramNum = LispUtil.getParameterNumber(doc, offset, fi);
				if (paramNum <= cusp.indents.get(fi.name)) {
					indent += "    ";
				} else {
					indent += "  ";
				}
			} else if (cusp.handlerCaseIndents.containsKey(prevFunc.name)
					&& LispUtil.getParameterNumber(doc, offset, prevFunc) > 1) {
				indent += "  ";
			} else {
				if (fi.name.startsWith("def") || (fi.name.startsWith("with") &&LispPlugin.getStore().getBoolean(PreferenceConstants.SPECIAL_WITH_INDENT))
						||fi.name.startsWith(":")) {
					indent += "  ";
				} else if (inComment==true) {
					indent+=" ";
				}
				 else {
					for (int i=fi.offset+fi.name.length()+1; i<doc.getLength(); ++i) {
						char c = doc.getChar(i);
						if (!Character.isWhitespace(c)) {
							if (i>=offset&&indentOnEnter) {
								indent+=" ";
								break;
							}
							
							for (int j=0; j<i-fi.offset; ++j) {
								if (c == '\t') {
									indent += "\t";
								} else {
									indent += " ";
								}
							}
							//indent = indent.replace("        ", "\t");
							if (indent.length()==0) {	
								minOffset = new LispUtil.MyInt(doc.getLineOffset(doc.getLineOfOffset(offset)));
							}
							return indent;
						} else if (c == '\n') {
							break;
						}
					}
					indent += " ";
				}
			}
	
			if (indent.length()==0) {	
				minOffset = new LispUtil.MyInt(doc.getLineOffset(doc.getLineOfOffset(offset)));
			}
			return indent;
		} catch (BadLocationException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public static String calculateIndent(int offset, IDocument doc,HashMap<Integer,Position> ranges,LispUtil.MyInt minOffset,boolean indentOnEnter) {
		try {
			IRegion lineInfo = doc.getLineInformation(doc.getLineOfOffset(offset));
			if (doc.getContentType(offset).equals(LispPartitionScanner.LISP_STRING)) {
				return LispUtil.calculateStringIndent(offset,doc,ranges,minOffset,indentOnEnter);
			}
			int end = lineInfo.getOffset()+lineInfo.getLength();
			for (int i=offset;i<end;i++) {
				if (doc.getChar(i)!=' ') {
					if (doc.getContentType(i).equals(LispPartitionScanner.LISP_STRING)) {
						return LispUtil.calculateStringIndent(i,doc,ranges,minOffset,indentOnEnter);
					}
					else
						break;
				} 
			}
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
		return calculateIndent2(offset,doc,ranges,minOffset,indentOnEnter);
	}
	

}
