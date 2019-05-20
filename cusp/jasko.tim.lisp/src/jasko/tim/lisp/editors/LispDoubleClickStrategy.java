package jasko.tim.lisp.editors;

import jasko.tim.lisp.util.LispUtil;

import org.eclipse.jface.text.*;

public class LispDoubleClickStrategy implements ITextDoubleClickStrategy {
	protected ITextViewer fText;

	public void doubleClicked(ITextViewer part) {
		int pos = part.getSelectedRange().x;

		if (pos < 0)
			return;

		fText = part;

		selectWord(pos);
	}
	
	protected boolean selectWord(int caretPos) {

		selectRange(LispUtil.getCurrentFullWordRange(fText.getDocument(), caretPos));
		
		return true;
	}

	private void selectRange(int[] range) {
		//TODO: Gorsal: Really fix source of this error!
		if (fText!=null&&range!=null)
			fText.setSelectedRange(range[0], range[1]);
	}
}