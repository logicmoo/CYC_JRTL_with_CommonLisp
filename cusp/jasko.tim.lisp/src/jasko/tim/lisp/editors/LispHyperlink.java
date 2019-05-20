package jasko.tim.lisp.editors;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import jasko.tim.lisp.editors.actions.FindDefinitionAction;

public class LispHyperlink implements IHyperlink {

	private String fURLString;
	private IRegion fRegion;
	private ILispEditor editor;

	public LispHyperlink(ILispEditor edt, IRegion region, String urlString) {
		assert urlString != null;
		assert region != null;

		fRegion= region;
		fURLString= urlString;
		editor = edt;
	}

	public IRegion getHyperlinkRegion() {
		return fRegion;
	}

	public String getHyperlinkText() {
		return fURLString;
	}

	public String getTypeLabel() {
		return null;
	}

	public void open() {
		FindDefinitionAction eda = new FindDefinitionAction(editor);
		eda.run();
	}

}
