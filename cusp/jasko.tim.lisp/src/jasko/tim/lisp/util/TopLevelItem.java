package jasko.tim.lisp.util;

public class TopLevelItem implements Comparable<TopLevelItem> {
	public String name = "";
	public int offset = 0; //offset of "(" encompassing top level sexp
	public int offsetEnd = 0; //offset of ")" encompassing top level sexp
	public int nameOffset = 0; //offset of name of top level sexp
	public String type = "";
	public String pkg = "";
	public String info = ""; //tooltip info
	
	public int compareTo(TopLevelItem o) {
		return name.toLowerCase().compareTo( 
			o.name.toLowerCase() );
	}
	
	public String toString(){
		return "{"+type+","+name+" ("+offset+")}";
	}
}
