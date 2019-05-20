package jasko.tim.lisp.cusp;

import java.util.*;

/**
 * Handy structure I use to store s-expressions.
 *  Luckily for us, we don't actually do much with them beyond
 *  pass them back into Lisp, so we don't actually have to worry much about the data type.
 * @author Tim Jasko
 */
public class LispNode {
	public int offset = 0;
	public int endOffset = 0;
	public int line = 0;
	public int endLine = 0;
	public String value = "";
	public ArrayList<LispNode> params = new ArrayList<LispNode>();
	//	keep file comments only in root LispNode
	public ArrayList<LispComment> comments = new ArrayList<LispComment>();
	
	public boolean isString = false;
	
	public LispNode() {
	}
	
	public LispNode(int offset) {
		this.offset = offset;
	}
	
	public LispNode(int offset, int endOffset) {
		this.offset = offset;
		this.endOffset = endOffset;
	}
	
	public LispNode(String val) {
		value = val;
	}
	
	public LispNode(String val, int offset) {
		value = val;
		this.offset = offset;
	}
	
	public LispNode(String val, int offset,int endOffset) {
		value = val;
		this.offset = offset;
		this.endOffset = endOffset;
	}

	public LispNode(String val, int offset,int endOffset, int line, int endLine){
		value = val;
		this.offset = offset;
		this.endOffset = endOffset;
		this.line = line;
		this.endLine = endLine;
	}
	
	/**
	 * Test if this is an empty LispNode.
	 * @return true if value equals the empty string
	 */
	public boolean isEmpty() {
		return (params.size() == 0 && value.length() == 0);
	}
	
	public int asInt() {
		int ret = 0;
		try {
			ret = Integer.parseInt(value);
		} catch (NumberFormatException e) {
		}
		return ret;
	}
	
	
	public LispNode car() {
		if (params.size() >= 1) {
			return params.get(0);
		} else {
			return new LispNode();
		}
	}
	
	public LispNode cadr() {
		if (params.size() >= 2) {
			return params.get(1);
		} else {
			return new LispNode();
		}
	}
	
	public LispNode caadr() {
		if (params.size() >= 3) {
			return params.get(2);
		} else {
			return new LispNode();
		}
	}
	
	public LispNode get(int i) {
		try {
			if (params.size() >= i+1) {
				return params.get(i);
			} else {
				return new LispNode();
			}
		} catch (Exception e) {
			System.out.println(e);
			return new LispNode();
		}
	}
	

	
	public int getNumberOfSubSexps(){
		return params.size();
	}
	
	/**
	 * Treats this node as a plist.
	 * @param key
	 * @return The value in the list after the key. A blank node is returned if the key isn't found.
	 */
	public LispNode getf(String key) {
		for (int i=0; i<params.size(); ++i) {
			LispNode kid = params.get(i);
			if (kid.value.equalsIgnoreCase(key)) {
				LispNode res = this.get(i+1);
				if( res.value.equals("'")){
					res = this.get(i+2);
				}
				return res;
			} else if (kid.params.size() > 0) {
				LispNode grandKid = kid.get(0);
				if (grandKid.value.equalsIgnoreCase(key)) {
					return kid.get(1);
				}
			}
		}
		
		return new LispNode();
	}

	public String toString() {
		if (!value.equals("")) {
			return "`" + value + "`";
		} else {
			StringBuffer ret = new StringBuffer("(");
			for (LispNode p : params) {
				ret.append(p.toString()).append(" ");
			}
			ret.append(")");
			return ret.toString();
		}
	}
	
	public String toLisp() {
		if (isString) {
			return '"' + value + '"';
		} else if (value.equals("")) {
			StringBuilder ret = new StringBuilder();
			ret.append("(");
			int size = params.size();
			for (int i=0; i<size; ++i) {
				LispNode param = params.get(i);
				ret.append(param.toLisp());
				if (i < size-1) {
					ret.append(' ');
				}
			}
			ret.append(")");
			return ret.toString();
		} else {
			return value;
		}
	}
	
	public boolean equals(LispNode other) {
		return this.toLisp().equals(other.toLisp());
	}

	public void clearComments(){
		comments.clear();
	}
	
	public void addComment(String val, int offset, int endOffset){
		comments.add(new LispComment(val,offset,endOffset));
	}
	
	public void addComment(String val, int offset, int endOffset, int line, int endLine){
		comments.add(new LispComment(val,offset,endOffset,line,endLine));
	}
	
	public int getNumberOfComments() {
		int ret = 0;
		for( LispComment comment: comments ) {
			if( comment.isSectionComment() ) {
				++ret;
			}
		}
		return ret;
	}
	
	public boolean isCarEqual(String val) {
		return car().value.equalsIgnoreCase(val);
	}
}
