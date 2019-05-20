package jasko.tim.lisp.editors.actions;

//import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.cusp.LispNode;
import jasko.tim.lisp.cusp.CuspRunnable;
import jasko.tim.lisp.views.XrefView;

import java.util.ArrayList;

public class FindCalleesAction extends LispAction {
	private static final int TIMEOUT = 2000;
	
	public FindCalleesAction() {
	}
	
	public FindCalleesAction(ILispEditor editor) {
		super(editor);
	}
	
	public void run() {
		final String symbol = getSymbol();

		boolean haveDefinition = getCusp().haveDefinitions(symbol, 
				getPackage(), TIMEOUT);
		
		if ( !haveDefinition )
		{
			XrefView.getXrefView().showResults("No calls from "+symbol+" were found.", null, null, null);
			return;
		}

		getCusp().sendGetCallees(symbol, getPackage(), new CuspRunnable() {
			public void run() {
				LispNode guts = result.getf(":return").getf(":ok");
				
				ArrayList<String> optionNames = new ArrayList<String>(guts.params.size());
				ArrayList<LispNode> optionData = new ArrayList<LispNode>(guts.params.size());
				ArrayList<String> tips = new ArrayList<String>(guts.params.size());
				for (LispNode gut: guts.params) {
					if ( gut.params.size() == 2 && gut.params.get(1).get(0).value.equalsIgnoreCase(":location") ){
						String name = gut.get(0).value;
						if( !name.equalsIgnoreCase(":error")){
							String tip = gut.getf(":location").getf(":file").value;
							optionNames.add(name);
							optionData.add(gut);
							tips.add(tip);							
						}
					} else {
						for (int i = 1; i<gut.params.size(); ++i) {
							LispNode possibility = gut.params.get(i);
							String name = possibility.get(0).value;
							if( !name.equalsIgnoreCase(":error")){
								String tip = possibility.getf(":location").getf(":file").value;
								optionNames.add(name);
								optionData.add(possibility);
								tips.add(tip);
							}
						}
					}
				}
				
				if (optionNames.size() <= 0) {
					XrefView.getXrefView().showResults("No calls from "+symbol+" were found.", null, null, null);
					editor.showMessage("No calls from this function were found");
					return;
				} else {
					XrefView.getXrefView().showResults("Callees of "+symbol+":", optionNames, optionData, tips);
				}				
			}
		
		});
	}

}
