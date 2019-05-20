package jasko.tim.lisp.views;

import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.structuremergeviewer.ICompareInput;
import org.eclipse.compare.structuremergeviewer.ICompareInputChangeListener;
import org.eclipse.swt.graphics.Image;

public class LispCompareInput implements ICompareInput {

	private ICompareInput fCompareInput;

	public LispCompareInput(final ICompareInput compareInput) {
		this.fCompareInput = compareInput;
	}

	
	public void addCompareInputChangeListener(
			final ICompareInputChangeListener listener) {
		this.fCompareInput.addCompareInputChangeListener(listener);
	}

	public void copy(boolean leftToRight) {
		this.fCompareInput.copy(leftToRight);
	}

	public ITypedElement getAncestor() {
		return this.fCompareInput.getAncestor();
	}

	public Image getImage() {
		return this.fCompareInput.getImage();
	}

	public int getKind() {
		return this.fCompareInput.getKind();
	}

	public ITypedElement getLeft() {
		final ITypedElement leftElement = this.fCompareInput.getLeft();
		return leftElement;
	}

	public String getName() {
		return this.fCompareInput.getName();
	}

	public ITypedElement getRight() {
		final ITypedElement rightElement = this.fCompareInput.getRight();
		return rightElement;
	}

	public void removeCompareInputChangeListener(
			final ICompareInputChangeListener listener) {
		this.fCompareInput.removeCompareInputChangeListener(listener);
	}

}
