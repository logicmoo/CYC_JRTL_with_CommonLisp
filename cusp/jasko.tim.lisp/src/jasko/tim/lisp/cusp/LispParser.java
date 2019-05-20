package jasko.tim.lisp.cusp;

import java.util.*;

import org.eclipse.core.resources.IFile;
import java.io.*;


/**
 * Quick and very dirty lisp parser.
 *  I wouldn't mind seeing it replaced.
 * @author Tim Jasko
 *
 */
public class LispParser {
	public int parenBalance = 0;

	public static LispNode parse(String code) {
		return new LispParser().parseCode(code);
	}
	
	public static LispNode parse(String code, boolean justFirstSexp) {
		return new LispParser().parseCode(code,justFirstSexp);
	}
	
	public static String fileToString(IFile file){
		try{
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(file.getContents()));
			StringBuilder sb = new StringBuilder();
			String line = reader.readLine();
			while (line != null) {
				sb.append(line);
				sb.append('\n');
				line = reader.readLine();
			}
			return sb.toString();			
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}		
	}
	
	public static LispNode parse(IFile file){
		return LispParser.parse(fileToString(file));
	}
	
	
	public static int[] getEOLOffsets(String str){
		ArrayList<Integer> pos = new ArrayList<Integer>();
		for(int i = 0; i < str.length(); ++i ){
			if(str.charAt(i) == '\n'){
				pos.add(new Integer(i));
			}
		}
		int[] res = new int[pos.size()];
		for(int i = 0; i < pos.size(); ++i){
			res[i] = pos.get(i).intValue();
		}
		return res;
	}
	
	public static int getLineNum(int offset, int[] EOLOffsets){
		int res = Arrays.binarySearch(EOLOffsets, offset);
		if( res >= 0 ){
			return res + 1;
		} else {
			return -res;
		}
	}

	public LispNode parseCode(String code) {
		return parseCode(code,false);
	}
	

	public LispNode parseCode(String code, boolean justFirstSexp) {
		int start = 0;
		parenBalance = 0;

		if( justFirstSexp && code.charAt(0) != '(' ){
			return null;
		}
		
		LispNode ret = new LispNode(0);
		Stack<LispNode> s = new Stack<LispNode>();
		
		int[] eoffsets = getEOLOffsets(code);
		
		LispNode curr = ret;
		s.push(curr);
		
		StringBuilder sb = new StringBuilder();
		int length = code.length();
		int i = 0;
		for (i=start; i<length; ++i) {
			char c = code.charAt(i);
			if (c == '(') {
				++parenBalance;
				LispNode next = new LispNode(i);
				next.line = getLineNum(i,eoffsets);
				if (!sb.toString().equals("")) {
					int startOffset = i - sb.toString().length();
					curr.params.add(new LispNode(sb.toString(), startOffset, i,
							getLineNum(startOffset,eoffsets), getLineNum(i,eoffsets)));
					sb = new StringBuilder();
				}
				curr.params.add(next);
				curr = next;
				s.push(curr);
			} else if (c == ')') {
				--parenBalance;
				if (!sb.toString().equals("")) {
					int startOffset = i - sb.toString().length();
					curr.params.add(new LispNode(sb.toString(), startOffset, 
							i-1, getLineNum(startOffset,eoffsets), getLineNum(i-1,eoffsets)));
					sb = new StringBuilder();
				}
				curr.endOffset = i;
				
				if( parenBalance == 0 && justFirstSexp ){
					return curr;
				}
				
				try {
					s.pop();
				} catch (EmptyStackException e) {
				}
				if (!s.empty()) {
					curr = (LispNode)s.peek();
				}
				
			} else if (c == '"') {
				int offset = i;
				char lit = '"';
				do {
					++i;
					if (i < length) {
						lit = code.charAt(i);
						if (lit == '\\') {
							++i;
							if (i < length) {
								sb.append(code.charAt(i));
							}
						} else if (lit != '"') {
							sb.append(lit);
						}
					}
				} while (lit != '"' && i<length);
				LispNode str = new LispNode(sb.toString(), offset, i, 
						getLineNum(offset,eoffsets), getLineNum(i,eoffsets));
				str.isString = true;
				curr.params.add(str);
				sb = new StringBuilder();
			}  else if (c == ';') {
 				int i0 = i;
  				char lit = ';';
 				StringBuilder sbtmp = new StringBuilder();
  				do {
 					sbtmp.append(lit);
  					++i;
					if (i < length) {
						lit = code.charAt(i);
					}
  				} while (lit != '\n' && i<length);
 				ret.addComment(sbtmp.toString(),i0,i-1,
 						getLineNum(i0,eoffsets),getLineNum(i-1,eoffsets));
				if (i >= length) {
					--i;
				}
			} else if (c == '#') {
				if (i < length-1) {
					if (code.charAt(i+1) == '|' && i < length-2) {
 						int i0 = i;
 						StringBuilder sbtmp = new StringBuilder();
 						sbtmp.append('#');
  						++i;
 						char lit = '|';
  						boolean done = false;
  						do {
 							sbtmp.append(lit);
							++i;
							lit = code.charAt(i);
							if (lit == '|' && i<length-1) {
								if (code.charAt(i+1) == '#') {
									++i;
									done = true;
								}
							}
						} while (!done && i<length-1);
  						ret.addComment(sbtmp.toString(),i0,i-1,
  								getLineNum(i0,eoffsets),getLineNum(i-1,eoffsets));
						
					} else if (code.charAt(i+1) == '\\' && i < length-3) {
						int offset = i;
						sb.append(code.charAt(i));
						sb.append(code.charAt(i+1));
						sb.append(code.charAt(i+2));
						i += 2;
						LispNode str = new LispNode(sb.toString(), offset, i,
								getLineNum(offset,eoffsets),getLineNum(offset,eoffsets));
						str.isString = true; // close enough
						curr.params.add(str);
						sb = new StringBuilder();
					}
				}
			} else if (Character.isWhitespace(c)) {
				if (!sb.toString().equals("")) {
					curr.params.add(new LispNode(sb.toString(), i-sb.toString().length(), i-1,
							getLineNum(i-sb.toString().length(),eoffsets),getLineNum(i-1,eoffsets)));
					sb = new StringBuilder();
				}
			} else {
				sb.append(c);
			}
			
		} // for
		// Make sure we get the endOffset set on everyone even when our sexps are incomplete
		// This is important for LispUtil.getParameterNumber, and thus for LispIndenter
		if (curr.endOffset == 0) {
			curr.endOffset = i;
			curr.endLine = getLineNum(i,eoffsets);
		}
		while (!s.empty()) {
			curr = s.peek();
			if (curr.endOffset == 0) {
				curr.endOffset = i;
				curr.endLine = getLineNum(i,eoffsets);
			}
			s.pop();
		}
		return ret;
	}

}
