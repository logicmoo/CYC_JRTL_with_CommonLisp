package jasko.tim.lisp.editors.autoedits;


import org.eclipse.jface.text.IAutoEditStrategy;

public class AllAutoEdits {	
	// this function is called when an editor is created
	public static IAutoEditStrategy[] get(){
		return 	new IAutoEditStrategy[] {new LispIndentOnTab(),
				new LispIndentOnEnter(), new PairAutoEdit(), new CustomAutoEdit()};
	}
}
