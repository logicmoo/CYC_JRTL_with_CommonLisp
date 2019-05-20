package jasko.tim.lisp.util;


import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.builder.LispMarkers;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.editors.LispPartitionScanner;
import jasko.tim.lisp.editors.LispScanner;
import jasko.tim.lisp.editors.autoedits.LispIndentOnEnter;
import jasko.tim.lisp.editors.outline.LispOutlinePage;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.preferences.PreferenceInitializer;
import jasko.tim.lisp.cusp.LispComment;
import jasko.tim.lisp.cusp.LispNode;
import jasko.tim.lisp.cusp.LispParser;
import jasko.tim.lisp.cusp.CuspInterface;
import jasko.tim.lisp.views.ReplView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
//Expression Getting Generality (most to least)
//getCurrentExpression (doc, offset, selLength) [evaluation?], getCurrentFullExpression
//Alt+[-> getTopLevelExpression
//Alt+m->getFullExpression->directly calls getCurrentFullExpression
import org.eclipse.jface.text.Position;

public class LispUtil {
	public static class MyInt {
		int value;
		public MyInt(int num) {
			value = num;
		}
		public int setValue (int num) {
			value = num;
			return value;
		}
		public int getValue () {
			return value;
		}
	}
	public static boolean saveParensBalance(IDocument doc, IFile file, int start, int end) {
		String code = doc.get();
		boolean res = true;
		int open = 0;
		int close = 0;

		ArrayList<int[]> parenData = new ArrayList<int[]>();
				
		for (int i = start; i < end; ++i) {
			try {
				ITypedRegion region = doc.getPartition(i);
				if (region.getType().equals(LispPartitionScanner.LISP_STRING)||region.getType().equals(LispPartitionScanner.LISP_COMMENT)) {
					i=region.getOffset()+region.getLength()-1; 
					continue;
				}
					
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			char c = code.charAt(i);
			if (c == ')') {
				try {
					if (doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
						++close;
						if (close > open) {
							// reset everything so we don't throw off the rest of the matching
							close = open;
							res = false;
							LispMarkers.addParenMarker(file,i,doc.getLineOfOffset(i), false);
						}
						parenData.add(new int[]{-1,i,doc.getLineOfOffset(i)});
					}
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
			} else if (c == '(') {
				try {
					if (doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
						++open;
						parenData.add(new int[]{1,i,doc.getLineOfOffset(i)});
					}
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
			}
		}

		if (open > close) { //go backwards
			open = 0;
			close = 0;
			for(int k = parenData.size() - 1; k >= 0; --k){
				if( parenData.get(k)[0] == -1 ) {//close
					++close;
				} else {
					++open;
					if(open>close){
						// reset everything so we don't throw off the rest of the matching
						open = close;
						LispMarkers.addParenMarker(file,parenData.get(k)[1],parenData.get(k)[2],true);
					}
				}
			} //for k
			res=false;
		}
		return res;
	}
	
	
	
	
	
	
	public static void evalExpInPackage (CuspInterface cusp,String pack,String exp) {
		cusp.sendEval(exp,pack,null);

	}
	public static String formatCuspPackageName (String pack) {
		String formatPack = pack.toUpperCase();
		if (formatPack.charAt(0)==':')
			return formatPack.substring(1);
		return formatPack;
	}
	

	public static void evalExpInCurrentPackageIf (CuspInterface cusp,String exp,
													IDocument doc,int offset,ReplView.ReturnHandler ret) {
		boolean pref = PreferenceInitializer.getStore().getBoolean(PreferenceConstants.EVAL_IN_PACKAGE);
		if (pref) {
			evalExpInCurrentPackage(cusp,exp,doc,offset,ret);
			return;
		}
		cusp.sendEval(exp,null);
	}
	
	public static void evalExpInCurrentPackage (CuspInterface cusp,String exp,IDocument doc,int offset,ReplView.ReturnHandler ret) {
		LispEditor editor = (LispEditor)(LispPlugin.getActiveEditor());
		if (editor!=null) {
			LispOutlinePage page = editor.getOutline(false);
			String pack = page.getPackage(offset);
		
			if (pack!=null && pack!="") {
				cusp.sendEval(exp,pack,ret);
				return;
			}
		}
		cusp.sendEval(exp, null);	
	}
	
	//used only to calculate indent of a new line!
	public static String calculateStringIndent (int offset, IDocument doc,HashMap<Integer,Position> ranges,LispUtil.MyInt minOffset,boolean indentOnEnter) throws BadLocationException {
		String mode = 	LispPlugin.getStore().getString(PreferenceConstants.STRING_INDENT_MODE);
		ITypedRegion region = doc.getPartition(offset);
		int regionOffset = region.getOffset();

		if (mode.equals(PreferenceConstants.NO_INDENT))
			return  "";
		else if (mode.equals(PreferenceConstants.INDENT_FIRST_LINE))  {
			if (doc.getLineOfOffset(region.getOffset())==doc.getLineOfOffset(offset)) {
				return LispIndentOnEnter.calculateIndent2(offset,doc,ranges,minOffset,indentOnEnter);
			}
			return "";
		}
		else if (mode.equals(PreferenceConstants.INDENT_SINGLE_LINE)) {
			int start = region.getOffset();
			int end = start+region.getLength()-1;
			if (doc.getLineOfOffset(start)==doc.getLineOfOffset(end)) {
				return LispIndentOnEnter.calculateIndent2(offset,doc,ranges,minOffset,indentOnEnter);
			}
			return  "";
		}
		else if (mode.equals(PreferenceConstants.INDENT_ALL)){
			return LispIndentOnEnter.calculateIndent2(offset,doc,ranges,minOffset,indentOnEnter);
		}
		//should never reach
		return  "";
	}

	
	public static boolean shouldIndentString (IRegion lineInfo, IDocument doc) throws BadLocationException {
		String mode = 	LispPlugin.getStore().getString(PreferenceConstants.STRING_INDENT_MODE);
		ITypedRegion region = doc.getPartition(lineInfo.getOffset());
		if (mode==PreferenceConstants.NO_INDENT)
			return false;	
		else if (mode==PreferenceConstants.INDENT_FIRST_LINE)  {
			if (doc.getLineOfOffset(region.getOffset())==doc.getLineOfOffset(lineInfo.getOffset())) {
				return true;
			}
			return false;
		}
		else if (mode==PreferenceConstants.INDENT_SINGLE_LINE) {
			int start = region.getOffset();
			int end = start+region.getLength()-1;
			if (doc.getLineOfOffset(start)==doc.getLineOfOffset(end)) {
				return true;
			}
			return false;
		}
		else if (mode==PreferenceConstants.INDENT_ALL){
			return true;
		}
		//should never reach
		return false;
	}
	
	//NOTE getExpression is not macro character aware!
	public static String getExpression(IDocument doc, int offset) {
		StringBuilder ret = new StringBuilder();
		int open = 0;
		int close = 0;
		try {
			for (int i=offset; i<doc.getLength(); ++i) {
				String partition = doc.getPartition(i).getType();
				if (!partition.equals(LispPartitionScanner.LISP_COMMENT)) {
					char c = doc.getChar(i);
					ret.append(c);
					if (!partition.equals(LispPartitionScanner.LISP_CHARACTER) &&
							!partition.equals(LispPartitionScanner.LISP_STRING) &&
							!partition.equals(LispPartitionScanner.LISP_SPECIAL_CHARACTER)) {
						if (c == '(') {
							++open;
						} else if (c == ')') {
							++close;
							if (close == open) {
								return ret.toString();
							}
						}
					}
				}
			}
			return ret.toString();
		} catch (BadLocationException e) {
			e.printStackTrace();
			return "";
		}
	}

	public static boolean isSpecialCharPosition (String doc, int position) {
		if (position-1>=0&&oddSlash(doc,position-1)) {
			return true;
		}
		return false;
	}
	

	public static boolean oddSlash (String allLines, int start) {
		int numStart = 0;
		for (int i=start;i>=0;i--) {
			if (allLines.charAt(i)=='\\') {
				numStart++;
			} else {
				break;
			}
		}
		if (numStart%2==0) {
			return false;
		}
		return true;
	}
	
	public static boolean singleMacroChar (char c)
	{
		return c=='\''||c=='`'||c==','||c=='\\';
	}

	public static int[] macroCharOffset (char char1, char char2, int offset,int retOffset)
	{
		String str = ""+char1+char2;
		int ret[] = {offset,offset};
		if (str.equals("#'")||str.equals("#.")||str.equals("#p")||str.equals("#+")||str.equals("#-")||
				str.equals("#x")||
			    (singleMacroChar(char1)&&singleMacroChar(char2))) {
			ret[1] = offset+1;
		}	
		else if (singleMacroChar(char1)) {}
		else if (singleMacroChar(char2)) {
			ret[0]= offset+1; ret[1] = offset+1;
		}
		else {
			ret[0] = retOffset; ret[1] = retOffset;
		}
		return ret;
	}


	public static int[] getReaderMacroOffset (IDocument doc, int offset, int by)
	{
		int[] ret = {offset,offset};
		try
		{
			for (int i=offset-1;i>=0;i+=by)
			{
				String partition = doc.getPartition(i).getType();
				if (!partition.equals(LispPartitionScanner.LISP_COMMENT) && !partition.equals(LispPartitionScanner.LISP_STRING)) 
				{
					char currentChar = doc.getChar(i);
					if (!Character.isWhitespace(currentChar)) {
						//the space char can never be a macro char (well, it better not be), so it is safe to return as equiv of 'null' char
						int[]ret2= macroCharOffset(i==0?' ':doc.getChar(i-1),currentChar,i-1,offset);
						if (ret2[0]==offset)
							if (i+1>=doc.getLength())
								return macroCharOffset(currentChar,' ',i,offset); //space is impossible macro char...hopefully		
							else
								return macroCharOffset(i==0?' ':currentChar,doc.getChar(i+1),i,offset);
						return ret2;
					}
				}
			}
		}catch(BadLocationException e) {e.printStackTrace();}
		return ret;
	}

	public static int getTopLevelOffset(IDocument doc, int offset) {
		return getTopLevelOffset(doc,offset,false);
	}

	public static int getTopLevelOffset(IDocument doc, int offset, 
			boolean withSections, int by) {
		try {
			// SK: This procedure finds topLevelOffset the following way:
			// 1. Find line of offset.
			// 2. Starting from this line and going backward,
			//    check if '(' is first character of the line. 
			//    If yes, this is topLevelOffset.
			//    if withSections and line starts with SECTION_START also toplevel
			//Notice this algorithm is only the start way to handle toplevel.
			//rare cases are handled later in another function

			int line = doc.getLineOfOffset(offset);
			for( int i = line; i >= 0&&i<=doc.getLineOfOffset(doc.getLength()-1); i+=by ){
				int lineOffset = doc.getLineOffset(i);
				if( doc.getChar(lineOffset) == '('&&!doc.getPartition(lineOffset).getType().equals(LispPartitionScanner.LISP_STRING)
				){
					return lineOffset;
				} else if ( withSections 
						&& lineOffset+LispComment.SECTION_START.length() 
						< doc.getLength()-1 
						&& doc.get(lineOffset, 
								LispComment.SECTION_START.length())
								.equals(LispComment.SECTION_START)){
					return lineOffset;
				}
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public static int getTopLevelOffset(IDocument doc, int offset, 
			boolean withSections) {
		try {
			// SK: This procedure finds topLevelOffset the following way:
			// 1. Find line of offset.
			// 2. Starting from this line and going backward,
			//    check if '(' is first character of the line. 
			//    If yes, this is topLevelOffset.
			//    if withSections and line starts with SECTION_START also toplevel
			//Notice this algorithm is only the start way to handle toplevel.
			//rare cases are handled later in another function
			if (doc.getLength()==0) {
				return -1;
			}
			int line = doc.getLineOfOffset(offset);
			for( int i = line; i >= 0; --i ){
				int lineOffset = doc.getLineOffset(i); 
				if( doc.getChar(lineOffset) == '('){
					return lineOffset;
				} else if ( withSections 
						&& lineOffset+LispComment.SECTION_START.length() 
						< doc.getLength()-1 
						&& doc.get(lineOffset, 
								LispComment.SECTION_START.length())
								.equals(LispComment.SECTION_START)){
					return lineOffset;
				}
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return -1;
	}
	public static int[] getTopLevelRangeWO(IDocument doc, int offset) {
		//if a reader macro is found in toplevel, signal error or don't do anything
		int[] range = getCurrentFullExpressionRangeWO (doc, offset);
		int[] range2 = null; 
		if(range!=null ){
			range2 =  getCurrentFullExpressionRangeWO(doc,getTopLevelOffset(doc,range[0])+1);
		}

		//regular success
		if (range!=null&&range2!=null&&range[0]==range2[0]&&range2[1]==range[1]) return range;
		//Why do we use getTopLevelOffset() 'algorithm'? Because it's mostly works! If it overshoots, it is taken care in first else if!
		//if range is null, that mean cursor was already in toplevel! GASP! Check for one behind/in front parentheses support and for macro chars! 
		if (range==null||range2!=null&&range2[0]+range2[1]<offset) {
			/*This means one of two things:
			 *(1)either the cursor was in the toplevel but was 'caught' by getCurrentFullExpressionRange because the cursor was in between
			 *   a macro character and an open parentheses or
			 *(2)getTopLevelOffset, our dear buddy, could've overshot because the open parenth had a macro character in front or it was indented incorrectly 
			 *This leads to two situations. (a) the range it returns contains a toplevel form or (b) the range it contains represents a sexp       
			 *because getTopLevelOffset encountered an improperly formatted sexp (i.e. all the way to the left)
			 *
			 * So we need to test if range is not null. If so, case 1 is satisfied and we just return range.
			 * Else, we check if sexp is a toplevel form. If so, we iterate to the right of range until we get a parenth or parent/macro combo.
			 * Else, we call getTopLevelRange again.
			 */
			//however, we shall ignore this and return null
			return null;

		}

		return range2;
	}

	public static int[] getTopLevelRange(IDocument doc, int offset) {
		//TODO: Gorsal - figure out why something mighit pass an inappropriate offset in?
		if (doc.getLength()<=offset||offset<0) {
			return null;
		}
		//if a reader macro is found in toplevel, signal error or don't do anything
		int[] range = getCurrentFullExpressionRange (doc, offset);
		int[] range2 = null; 
		if(range!=null ){
			range2 =  getCurrentFullExpressionRange(doc,getTopLevelOffset(doc,range[0])+1);
		}

		//regular success
		if (range!=null&&range2!=null&&range[0]==range2[0]&&range2[1]==range[1]) return range;
		//Why do we use getTopLevelOffset() 'algorithm'? Because it's mostly works! If it overshoots, it is taken care in first else if!
		//if range is null, that mean cursor was already in toplevel! GASP! Check for one behind/in front parentheses support and for macro chars! 
		if (range==null) 
		{
			//Possibly, our cursor was in front/behind the sexp. Cursor isn't between macro char and parenth, or else
			//getCurrentFullExpression would've caught it. Check.
			//Check for one behind parentheses
			String code = doc.get();
			try {
				if (code.charAt(Math.max(offset-1,0))==')'&&!doc.getPartition(offset).getType().equals(LispPartitionScanner.LISP_SPECIAL_CHARACTER))
				{

					return LispUtil.getCurrentFullExpressionRange(doc,Math.max(offset-1,0));
				} else
					try {
						if (code.charAt(offset)=='('&& !doc.getPartition(offset).getType().equals(LispPartitionScanner.LISP_SPECIAL_CHARACTER))
							return LispUtil.getCurrentFullExpressionRange(doc,offset+1);
						else {
							/*
								//Check for 1 in front or in middle of macro char
								int ppos = getNextParenth(doc,offset);
								int macropos = getReaderMacroOffset(doc,ppos-offset>2?offset:ppos,-1)[0];
								if (macropos<offset&&ppos>=0)
								{
									int[]range3 = getCurrentFullExpressionRangeWO(doc,ppos+1);
									return range3;
								}
							 */
						}
					} catch (BadLocationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (range2!=null&&range2[0]+range2[1]<offset) 
		{
			/*This means one of two things:
			 *(1)either the cursor was in the toplevel but was 'caught' by getCurrentFullExpressionRange because the cursor was in between
			 *   a macro character and an open parentheses or
			 *(2)getTopLevelOffset, our dear buddy, could've overshot because the open parenth had a macro character in front or it was indented incorrectly 
			 *This leads to two situations. (a) the range it returns contains a toplevel form or (b) the range it contains represents a sexp       
			 *because getTopLevelOffset encountered an improperly formatted sexp (i.e. all the way to the left)
			 *
			 * So we need to test if range is not null. If so, case 1 is satisfied and we just return range.
			 * Else, we check if sexp is a toplevel form. If so, we iterate to the right of range until we get a parenth or parent/macro combo.
			 * Else, we call getTopLevelRange again.
			 */
			//however, we shall ignore this and return null
			return null;

		}

		return range2;
	}


	public static int nextOpenParenth (IDocument doc,int offset)
	{
		String code = doc.get();
		int length = code.length();
		try
		{
			for (int i=offset;i<length;i++)
			{
				ITypedRegion partition = doc.getPartition(i);
				String type = partition.getType();
				if (type.equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					if (code.charAt(i)=='(') {
						return i;
					}
				} else {
					i +=partition.getLength()-2;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
		
					
	
	
	private static int getNextParenth (IDocument doc,int offset)
	{
		String code = doc.get();
		int length = code.length();
		try
		{
			for (int i=offset;i<length;i++)
			{
				String partition = doc.getPartition(i).getType();
				if (!partition.equals(LispPartitionScanner.LISP_COMMENT) && !partition.equals(LispPartitionScanner.LISP_STRING)
						&&!partition.equals(LispPartitionScanner.LISP_SPECIAL_CHARACTER)) 
					if (!(code.charAt(i)==' '))
						if (code.charAt(i)=='(')
							return i;
						else if (i+1<length&&code.charAt(i+1)=='(')
							return i+1;
						else if (i+2<length&&code.charAt(i+2)=='(')
							return i+2;
						else
							return -1;
			}
		}catch(BadLocationException e) {e.printStackTrace();}
		return length;
	}


	public static String getTopLevelExpressionWO(IDocument doc, int offset) {
		try
		{
			int range[] = getTopLevelRangeWO(doc,offset);

			if (!(range==null))
				return doc.get(range[0],range[1]);
			/*if (expOffset >= 0) {
			return getExpression(doc, expOffset);
		}
			 */
		}catch (BadLocationException e) {e.printStackTrace();}
		return "";
	}

	public static String getTopLevelExpression(IDocument doc, int offset) {
		try
		{
			int range[] = getTopLevelRange(doc,offset);

			if (!(range==null))
				return doc.get(range[0],range[1]);
			/*if (expOffset >= 0) {
				return getExpression(doc, expOffset);
			}
			 */
		}catch (BadLocationException e) {e.printStackTrace();}
		return "";
	}





	public static String getCurrentWord(IDocument doc, int offset) {
		String source = "";
		try {
			source = doc.get(0, offset);
		} catch (BadLocationException e) {
			e.printStackTrace();
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i=source.length()-1; i >=0; --i) {
			char c = source.charAt(i);
			try {
				if ((Character.isWhitespace(c) || c == '(' || c ==')' || c=='\'')&&!doc.getPartition(i).getType().equals(LispPartitionScanner.LISP_SPECIAL_CHARACTER)) {
					return sb.toString();
				} else {
					sb.insert(0, c);
				}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return sb.toString();
	}

	public static int[] getCurrentFullWordRange(IDocument doc, int offset, 
			boolean ignoreComments) {
		int start = -1, end = -1;
		String source = doc.get();

		try{
			if( !ignoreComments && offset < doc.getLength() 
					&& (doc.getPartition(offset)
							.getType().equals(LispPartitionScanner.LISP_COMMENT)
							|| doc.getPartition(offset)
							.getType().equals(LispPartitionScanner.LISP_STRING))) {
				ITypedRegion partition = doc.getPartition(offset);
				start = partition.getOffset();
				int length = partition.getLength();
				return new int[] {start, length};
			} else {
				for (int i = offset - 1; i >= 0; --i) {
					char c = source.charAt(i);
					if ((Character.isWhitespace(c) || c == '(' || c ==')'
						|| ( c == '\''))&&!doc.getPartition(i).getType().equals(LispPartitionScanner.LISP_SPECIAL_CHARACTER)) {
						break;
					} else {
						start = i;
					}
				}

				for (int i = offset; i < source.length(); ++i) {
					char c = source.charAt(i);
					if ((Character.isWhitespace(c) || c == '(' || c ==')'
						|| ( c == '\''))&&!doc.getPartition(i).getType().equals(LispPartitionScanner.LISP_SPECIAL_CHARACTER)) {
						break;
					} else {
						end = i + 1;
					}
				}

				if (start == -1 && end == -1) {
					return null;
				} else if (start == -1) {
					start = offset;
				} else if (end == -1) {
					end = offset;
				}
				return new int[] { start, end - start };				
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static int[] getCurrentFullWordRange (IDocument doc, int offset) {
		return getCurrentFullWordRange(doc,offset,true);
	}

	public static String getCurrentFullWord (IDocument doc, int offset) {
		int[] range = getCurrentFullWordRange(doc, offset);
		if (range != null) {
			try {
				return doc.get(range[0], range[1]);
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}

		return "";
	}

	public static int getParameterNumber(IDocument doc, int offset, FunctionInfo fi) {
		try {
			//System.out.println("offsets " + fi.name + ":" + fi.offset + "," + (offset - fi.offset) );
			if (fi.offset < 0) {
				return 0;
			}

			offset = offset - fi.offset;
			//some bug? Makes newline characters at the very end bad. So we trim string...
			String current = doc.get(fi.offset, offset).trim();
			LispNode node = LispParser.parse(current).get(0);
			//System.out.println("-node:" + node);
			for (int i=0; i < node.params.size(); ++i) {
				LispNode param = node.params.get(i);
				if (param.offset <= offset && param.endOffset >= offset) {
					return i;
				} else if (param.offset > offset) {
					return i-1;
				}
			}
			return node.params.size();
		} catch (BadLocationException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static class FunctionInfo {
		public FunctionInfo(String name, int offset) {
			this.name = name;
			this.offset = offset;
		}
		public String name;
		public int offset;
	}

	public static FunctionInfo getCurrentFunctionInfoWithHash(IDocument doc, int offset,HashMap<Integer,Position> ranges,MyInt topLevelMin,boolean useNull) {
		if (offset==topLevelMin.value) {
			return new FunctionInfo("",-1);
		}
		if (offset < topLevelMin.value) {
			if (useNull)
				return null;
			return new FunctionInfo("",-1);
		} 
		StringBuilder sb = new StringBuilder();
		int open = 0;
		int close = 0;
		int firstClose = -1;
		int prevOpen = -1; 
		try {
			for (int i=offset-1; i >=topLevelMin.value; --i) {
				char c = doc.getChar(i);
				String type = doc.getPartition(i).getType();
				ITypedRegion pType = doc.getPartition(i);
				if (type.equals(LispPartitionScanner.LISP_COMMENT)||type.equals(LispPartitionScanner.LISP_STRING)) {
					i=pType.getOffset();
					continue;	
				}
				
				if (c == ')' && type.equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					Position info = ranges.get(i);
					if (info!=null) {
						i=info.offset+1;			
					} else {
						if (firstClose==-1) {
							firstClose = i;	
						}
						++close;	
					}
					sb = new StringBuilder();
				} else if (c == '(' && type.equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++open;
					if (open > close) {
						FunctionInfo info =  new FunctionInfo(sb.toString(), i);
						if (prevOpen!=-1) {
							ranges.put(firstClose,new Position(info.offset+info.name.length()));
						}
						return info;
					} 
					sb = new StringBuilder();
					prevOpen = i;
				} else if (Character.isWhitespace(c)) {
					sb = new StringBuilder();
				} else {
					sb.insert(0, c);
				}
			}
			return new FunctionInfo("", -1);
		} catch (BadLocationException e) {
			e.printStackTrace();
			return null;
		}
	}
	/*
	public static FunctionInfo getCurrentFunctionInfo(IDocument doc, int offset) {
	
		if (offset <= 0) {
			return new FunctionInfo("", -1);
		}
		StringBuilder sb = new StringBuilder();
		//String acc="";
		int open = 0;
		int close = 0;
		try {
			for (int i=offset-1; i >=0; --i) {
				char c = doc.getChar(i);
				String type = doc.getPartition(i).getType();
				if (c == ')' && type.equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++close;
					sb = new StringBuilder();
				} else if (c == '(' && type.equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++open;
					if (open > close) {
						return new FunctionInfo(sb.toString(), i);
					} else {
						sb = new StringBuilder();
					}
				} else if (Character.isWhitespace(c)) {
					sb = new StringBuilder();
				} else {
					sb.insert(0, c);
				}

			}
			return new FunctionInfo("", -1);
		} catch (BadLocationException e) {
			e.printStackTrace();
			return new FunctionInfo("", -1);
		}
	}
*/
	public static String getCurrentFunction(IDocument doc, int offset) {
		String source = "";

		try {
			source = doc.get(0, offset);
		} catch (BadLocationException e) {
			e.printStackTrace();
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int open = 0;
		int close = 0;
		try {
			for (int i=source.length()-1; i >=0; --i) {
				char c = source.charAt(i);
				String type = doc.getPartition(i).getType();
				if (c == ')' && type.equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++close;
					sb = new StringBuilder();
				} else if (c == '(' && type.equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++open;
					if (open > close) {
						return sb.toString();
					} else {
						sb = new StringBuilder();
					}
				} else if (Character.isWhitespace(c)) {
					sb = new StringBuilder();
				} else {
					sb.insert(0, c);
				}

			}
			return "";
		} catch (BadLocationException e) {
			e.printStackTrace();
			return "";
		}
	}


	public static boolean doParensBalance(IDocument doc) {
		return doParensBalance(doc, 0, doc.getLength());
	}

	public static boolean doParensBalance(IDocument doc, int start, int end) {
		String code = doc.get();
		int open = 0;
		int close = 0;

		for (int i = start; i < end; ++i) {
			char c = code.charAt(i);
			String type;
			try {
				type = doc.getPartition(i).getType();
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace(); continue;
			}
			
			if (c == ')') {
				try {
					if (doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
						++close;
						if (close > open) {
							return false;
						}
					}
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
			} else if (c == '(') {
				try {
					if (doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
						++open;
					}
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
			}
		}

		return (open == close);
	}

	public static int[] findOpenParenWithReader(IDocument doc, int offset) {
		String code = doc.get();
		int ret[] = {-1,-1,-1};
		int open = 0;
		int close = 0;

		int parenthOffset = getNextParenth(doc,offset);
		int[] macOffset = getReaderMacroOffset(doc,offset,-1);
		try {
			if (parenthOffset!=-1&&macOffset[0]!=offset&&!doc.getPartition(offset).getType().equals(LispPartitionScanner.LISP_SPECIAL_CHARACTER))
				//ok, people, mouse was between macro char open parenth
			{
				ret[0] = macOffset[0];
				ret[1] = macOffset[1];
				ret[2] = parenthOffset; 
				return ret;
			}
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (int i=offset-1; i>=0; --i) {
			char c = code.charAt(i);
			try {
				if (c == ')' && doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++close;
				} else if (c == '(' &&doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++open;
					if (open > close) {
						int[] macRange =  getReaderMacroOffset(doc,i,-1);
						ret[0] = macRange[0];
						ret[1] = macRange[1];
						ret[2] = i;
						return ret;
					}
				}
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}

		return ret;
	}
	public static int findOpenParen(IDocument doc, int offset) {
		String code = doc.get();
		int open = 0;
		int close = 0;
		for (int i=offset-1; i>=0; --i) {
			char c = code.charAt(i);
			try {
				if (c == ')' &&doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++close;
				} else if (c == '(' &&doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++open;
					if (open > close) {
						return i;
					}
				}
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}

		return -1;
	}

	public static int findCloseParen (IDocument doc, int offset) {
		return findCloseParen(doc, offset, offset);
	}

	public static int findCloseParen (IDocument doc, int offset, int minSearchOffset) {
		int open = 0;
		int close = 0;
		String code = doc.get();
		for (int i = offset; i < code.length(); ++i) {
			try {
				char c = code.charAt(i);
				if (c == ')' &&doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++close;
					if (i >= minSearchOffset && close - open == 1) {
						return i;
					}

				} else if (c == '(' &&doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
					++open;
				}
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}

		return -1;
	}



	/**
	 * Returns a 2-element integer array indicating the range in the current document of the smallest complete
	 * s-expression w/reader macro that encloses the given offset.  If no such s-expression is found, this function returns null.
	 */
	//with reader macro support!???
	public static int[] getCurrentFullExpressionRange (IDocument doc, int offset) {
		return getCurrentFullExpressionRange(doc, offset, 0);
	}
	public static int[] getCurrentFullExpressionRangeWO (IDocument doc,int offset) {
		return getCurrentFullExpressionRangeWO(doc,offset,0);
	}
	public static int[] getCurrentFullExpressionRangeWOIgnore (IDocument doc,int offset) {
		return getCurrentFullExpressionRangeWOIgnore(doc,offset,0);
	}
	/**
	 * Returns a 2-element integer array indicating the range in the current document of the smallest complete
	 * s-expression w/reader macro that encloses the given select range.  If no such s-expression is found, this function returns null.
	 */


	public static int[] getCurrentFullExpressionRangeWO (IDocument doc, int offset, int selectionLength) {
		int begin = findOpenParen(doc, offset);

		if (begin >= 0) {
			int end = findCloseParen(doc, offset, offset + selectionLength);
			if (end >= 0) {
				return new int[] { begin, end - begin + 1 };
			}
		}

		return null;
	}

	public static String getCurrentFullExpressionWO(IDocument doc, int offset) {
		int[] range = getCurrentFullExpressionRangeWO(doc, offset); 

		if (range == null) {
			return "";
		} else {
			try {
				return doc.get(range[0], range[1]);
			} catch (BadLocationException e) {
				e.printStackTrace(); 
			}
		}
		return "";
	}


	public static int[] getCurrentFullExpressionRangeWOIgnore (IDocument doc, int offset, int selectionLength) {

		int[] begin = findOpenParenWithReader(doc, offset);
		if (begin[0]!=begin[2]) return null;
		int beg = (offset>begin[2]?offset:begin[2]);
		if (begin[0] >= 0) {
			int end = findCloseParen(doc,beg,offset+selectionLength);
			if (end >= 0) {
				return new int[] { begin[0], end - begin[0] + 1 };
			}
		}

		return null;
	}

	public static int[] getCurrentFullExpressionRange (IDocument doc, int offset, int selectionLength) {
		int[] begin = findOpenParenWithReader(doc, offset);
		int beg = (offset>begin[2]?offset:begin[2]+1);
		if (begin[0] >= 0) { 
			int end = findCloseParen(doc,beg,beg);
			if (end >= 0) {
				return new int[] { begin[0], end - begin[0] + 1 };
			}
		}

		return null;
	}

	public static String getCurrentFullExpression(IDocument doc, int offset) {
		int[] range = getCurrentFullExpressionRange(doc, offset); 

		if (range == null) {
			return "";
		} else {
			try {
				return doc.get(range[0], range[1]);
			} catch (BadLocationException e) {
				e.printStackTrace(); 
			}
		}
		return "";
	}

	/**
	 * Guesses as to the current expression, which probably hasn't been finished yet
	 * Useful for auto-assist. Not so useful for compilation.
	 */
	public static String getCurrentUnfinishedExpression(IDocument doc, int offset) {
		int begin = findOpenParen(doc, offset);
		if (begin >= 0) {
			int end = findCloseParen(doc, begin+1);
			if (end < 0) {
				end = offset;
			}
			if (end >= 0) {
				try {
					return doc.get(begin, end-begin);
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
			}
		}

		return "";
	}


	public static int countUnclosedParens(IDocument doc, int offset) {
		String code = doc.get();
		int open = 0;
		int close = 0;

		for (int i=0; i<offset; ++i) {
			char c = code.charAt(i);
				if (c == ')') {
					try {
						if (doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
							++close;
						}
					} catch (BadLocationException e) {
						e.printStackTrace();
					}
				} else if (c == '(') {
					try {
						if (doc.getPartition(i).getType().equals(IDocument.DEFAULT_CONTENT_TYPE)) {
							++open;
						}
					} catch (BadLocationException e) {
						e.printStackTrace();
					}

				}
	
		}
		return open - close;
	}

	
	/**
	 * Returns a 2-element integer array indicating the range (start, length) in the current document of the current "active"
	 * s-expression.  If there is no current s-expression, this function returns null.
	 */
	//does exactly what it says, unline one below 

	public static int[] getCurrentExpressionRangeWO (IDocument doc, int offset) throws BadLocationException {
		/*if (offset < doc.getLength() && doc.getChar(offset) == '(') {
            int end = findCloseParen(doc, offset + 1);
            if (end > -1) return new int[] { offset, end - offset + 1 };
        } else*/
		
			return getCurrentFullExpressionRange(doc, offset);
	
	}
	
	
	/**
	 * Returns a 2-element integer array indicating the range (start, length) in the current document of the current "active"
	 * s-expression.  If there is no current s-expression, this function returns null.
	 */

	public static int[] getCurrentExpressionRange (IDocument doc, int offset) throws BadLocationException {
		/*if (offset < doc.getLength() && doc.getChar(offset) == '(') {
            int end = findCloseParen(doc, offset + 1);
            if (end > -1) return new int[] { offset, end - offset + 1 };
        } else*/
		if (offset > 0 && doc.getChar(offset - 1) == ')'&&!doc.getPartition(offset-1).getType().equals(LispPartitionScanner.LISP_SPECIAL_CHARACTER)) {
			int[] start = findOpenParenWithReader(doc, offset - 1);
			if (start[0] > -1) return new int[] { start[0], offset - start[0] };
		} else {
			return getCurrentFullExpressionRange(doc, offset);
		}

		return null;
	}

	//notice that this is called when evaluating?Should name indicate this?    
	//This is the next up in 'generality' from getCurrentFullOffset - it allows one to supply
	//a highlight range via selLength!!
	public static String getCurrentExpression (IDocument doc, int offset, int selLength) {
		try {
			if (selLength > 0) {
				if (doParensBalance(doc, offset, offset + selLength)) {
					return doc.get(offset, selLength);
				} else {
					System.out.println("Not evaluating current selection; parens do not balance.");
				}
			} else {
				int[] range = getCurrentExpressionRange(doc, offset);
				if (range != null) 
				{
					return doc.get(range[0],range[1]);
				}
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}

		return "";
	}




	//take different presentations of pkg (i.e. ":mypack", "'mypack", "MYPACK", "\"MYPACK\""
	//and formats it into form "MYPACK" - same format as in return of cusp.getAvailablePackages
	//the pkg string should be valid package string, no checks for validity are made
	public static String formatPackage(String pkg){
		if("".equals(pkg) || pkg == null) {
			return "";
		}
		String res = pkg;
		char ch0 = pkg.charAt(0);
		if('\'' == ch0 || ':' == ch0){
			res = pkg.substring(1).toUpperCase();
		} else if (pkg.startsWith("\"") && pkg.endsWith("\"") && pkg.length() > 4){
			res = pkg.substring(2, pkg.length()-3).toUpperCase();
		} else {
			res = pkg.toUpperCase();
		}
		return res;
	}

	public static ArrayList getPackagesAndParses (LispNode contents, ArrayList<Integer> topLevelChanged)
	{
		LinkedHashMap<Integer,String> packages = new LinkedHashMap<Integer,String>();
		ArrayList<LispNode> retParse = new ArrayList<LispNode>();
		ArrayList ret = new ArrayList();

		int currentOffset = (topLevelChanged.size()>0?topLevelChanged.get(0):-1);
		int offset = 0;

		for (int i=0; i<contents.params.size(); ++i) {
			LispNode sexp = contents.params.get(i);

			LispNode car = sexp.get(0);
			if (car.offset>1200)
			{
				int ia =02;	
			}
			if (car.offset==currentOffset||car.endOffset == currentOffset)
			{
				if (offset+1<topLevelChanged.size()) 
					currentOffset = topLevelChanged.get(offset++);
				else
					currentOffset = -1;
				retParse.add(car);	
			}	

			if (car.value.equalsIgnoreCase("in-package")) {
				packages.put(sexp.offset, sexp.get(1).value);
			}
		}
		ret.add(packages); ret.add(retParse);
		return ret;
	}
	// get package definition closest to offset
	public static LinkedHashMap<Integer,String> getPackages (String code)
	{
		return getPackages(LispParser.parse(code+"\n"));
	}

	public static LinkedHashMap<Integer,String> getPackages (LispNode contents)
	{
		LinkedHashMap<Integer,String> packages = new LinkedHashMap<Integer,String>();
		for (int i=0; i<contents.params.size(); ++i) {
			LispNode sexp = contents.params.get(i);

			if (sexp.get(0).value.equalsIgnoreCase("in-package")) {
				packages.put(sexp.offset, sexp.get(1).value);
			}
		}
		return packages;
	}

	public static String getPackage(String code, int offset){
		LispNode contents = LispParser.parse(code + "\n");
		String res = "";
		for (int i=0; i<contents.params.size(); ++i) {
			LispNode sexp = contents.params.get(i);

			if(sexp.offset >= offset){
				return res;
			}

			if (sexp.get(0).value.equalsIgnoreCase("in-package")) {
				res = sexp.get(1).value;
			}
		}

		return res;
	}

	public static TopLevelItem getTopLevelItem(LispNode exp, String pkg, int offset){
		TopLevelItem item = new TopLevelItem();

		item.info = "";
		item.type = exp.get(0).value.toLowerCase();
		item.name = exp.get(1).toLisp();
		item.nameOffset = exp.get(1).offset + offset;
		item.offset = exp.offset + offset;
		item.offsetEnd = exp.endOffset + offset;
		item.pkg = pkg;
		if (! item.type.startsWith("def")) {
			item.name = item.type;
			if (item.type.equals("in-package")) {
				item.name = "in-package " + exp.get(1).toLisp();
			}
		} else if (item.type.equals("defstruct")) {
			LispNode name = exp.get(1); 
			if (!name.value.equals("")) {
				item.name = name.value;
			} else {
				item.name = name.get(0).value;
			}
		} else if (item.type.equals("defmethod")) {
			String name = exp.get(2).toLisp();
			if (name.startsWith(":")) {
				item.name += " " + name + " " + exp.get(3).toLisp();
			} else {
				item.name += " " + name;
			}
		}

		if (item.name.equals("")) {
			if (exp.params.size() >= 2) {
				if (exp.get(1).toLisp().startsWith(":")) {
					item.name = 
						exp.get(1).toLisp() + " " + exp.get(2).toLisp();
				} else {
					item.name = exp.get(1).toLisp();
				}
			}
		}

		return item;
	}

	public static TopLevelItem getSectionItem(LispComment comment, int offset){
		if ( comment.isSectionComment() ) {
			TopLevelItem item = new TopLevelItem();

			item.info = "";
			item.type = "section";
			item.name = comment.SectionName();
			item.offset = comment.offset;
			return item;
		} else {
			return null;
		}
	}

	public static ArrayList<TopLevelItem> getTopLevelItems(LispNode file, 
			String pkg, int offset){
		ArrayList<TopLevelItem> items = 
			new ArrayList<TopLevelItem>(file.params.size());
		String curpkg = pkg;
		for (LispNode exp: file.params) {
			TopLevelItem item = getTopLevelItem(exp,curpkg,offset);
			if( item.type.equals("in-package") ){
				curpkg = LispUtil.formatPackage(exp.get(1).toLisp());
			}

			if (! item.name.equals("")) {
				items.add(item);
			}
		}

		// add section comments
		for ( LispComment comment: file.comments ) {
			TopLevelItem item = getSectionItem(comment,offset);
			if( item != null && !item.name.equals("")){
				items.add(item);				
			}
		}		
		return items;
	}

	public static ArrayList<TopLevelItem> getTopLevelItems(LispNode file, String pkg){
		return getTopLevelItems(file,pkg,0);
	}

	/**
	 * Formats code to be send to CL as a string.
	 * Note that if we replace("\r","") here, rather than in
	 * cleanPackage, we get compilation markers in wrong positions.
	 * @param code
	 * @return
	 */
	public static String formatCode(String code) {
		return code.replace("\\", "\\\\").replace("\"", "\\\"");
	}

	/**
	 * Does almost same as formatCode, but also adds external quotes
	 * @param pkg
	 * @return
	 * @see formatCode
	 */
	public static String cleanPackage(String pkg) {
		if (pkg == null || pkg.equals("") || pkg.equalsIgnoreCase("nil")) {
			return "nil";
		} else {
			return "\"" + formatCode(pkg).replace("\r", "").replace("\n", " ") + "\"";
		}
	}
}
