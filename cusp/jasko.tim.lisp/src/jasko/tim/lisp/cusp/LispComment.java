package jasko.tim.lisp.cusp;

public class LispComment {
	public int offset = 0;
	public int endOffset = 0;
	public int line = 0;
	public int endLine = 0;
	public String value = "";
	public final static String SECTION_START = ";;;;<";
	public final static String SECTION_END = "\\>";
	public final int SECTION_START_LENGTH = SECTION_START.length(); 
	
	public LispComment() {
	}
	
	public LispComment(String val, int offset,int endOffset) {
		value = val;
		this.offset = offset;
		this.endOffset = endOffset;
	}		

	public LispComment(String val, int offset,int endOffset, int line, int endLine) {
		value = val;
		this.offset = offset;
		this.endOffset = endOffset;
		this.line = line;
		this.endLine = endLine;
	}		 		

	public boolean isSectionComment() {
		return value.startsWith(SECTION_START);
	}
	
	public String SectionName() {
		if ( isSectionComment() )
		{
			return value.substring(SECTION_START_LENGTH,value.length()).split(SECTION_END)[0];
		} else {
			return "";
		}
	}		
}
