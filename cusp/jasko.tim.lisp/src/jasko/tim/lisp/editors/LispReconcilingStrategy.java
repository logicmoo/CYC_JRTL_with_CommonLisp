package jasko.tim.lisp.editors;

import jasko.tim.lisp.cusp.LispNode;
import jasko.tim.lisp.cusp.LispParser;

import java.util.HashSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.swt.widgets.Display;

public class LispReconcilingStrategy implements IReconcilingStrategy,
		IReconcilingStrategyExtension {

	private LispEditor editor;

	private IDocument fDocument;

	/** holds the calculated positions */
	protected final HashSet<Position> fPositions = new HashSet<Position>();
	protected final Position fLastSection = new Position(0,0);
	
	/** The offset of the next character to be read */
	protected int fOffset;

	/** The end offset of the range to be scanned */
	protected int fRangeEnd;

	/**
	 * @return Returns the editor.
	 */
	public LispEditor getEditor() {
		return editor;
	}

	public void setEditor(ILispEditor editor) {
		if( editor instanceof LispEditor){
			this.editor = (LispEditor)editor;			
		} else {
			this.editor = null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#setDocument(org.eclipse.jface.text.IDocument)
	 */
	public void setDocument(IDocument document) {
		this.fDocument = document;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#reconcile(org.eclipse.jface.text.reconciler.DirtyRegion,
	 *      org.eclipse.jface.text.IRegion)
	 */
	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
		initialReconcile();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#reconcile(org.eclipse.jface.text.IRegion)
	 */
	public void reconcile(IRegion partition) {
		initialReconcile();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension#setProgressMonitor(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void setProgressMonitor(IProgressMonitor monitor) {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension#initialReconcile()
	 */
	public void initialReconcile() {
		fOffset = 0;
		fRangeEnd = fDocument.getLength();
		calculatePositions();
	}


	/**
	 * uses {@link #fDocument}, {@link #fOffset} and {@link #fRangeEnd} to
	 * calculate {@link #fPositions}. About syntax errors: this method is not a
	 * validator, it is useful.
	 */
	protected void calculatePositions() {
		if(editor != null){
			fPositions.clear();
			try {
				//System.out.printf("%s\n", editor.getDocument().get(fOffset, fRangeEnd - fOffset)	+ "\n");
				LispNode contents = 
					LispParser.parse(editor.getDocument().get(fOffset, fRangeEnd - fOffset)	+ "\n");
				getTokens(contents,fOffset,fRangeEnd);
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
			// Collections.sort(fPositions, new RangeTokenComparator());			
		}


		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if(editor != null){
					editor.updateFoldingStructure(fPositions,fLastSection);
					editor.updateOutline();
				}
			}
		});
	}

	/**
	 * emits tokens to {@link #fPositions}.
	 * returns inpackage
	 */
	private String getTokens(LispNode contents, int offset, int rangeEnd) {
		IDocument doc = editor.getDocument();
		String inPackage = "";
		// process sexps
		for (int i=0; i<contents.params.size()-1; ++i) {
			LispNode sexp = contents.params.get(i);
			
			if (sexp.get(0).value.equalsIgnoreCase("in-package")) {
				inPackage = sexp.get(1).value;
			}
			
			/* Let's all take this moment to poo-poo the Eclipse designers who decided to use
			 *  the Position class here, when it is not in fact a position that is being asked
			 *  for. You've even got a perfectly good Region class, kids!
			 *  
			 *  Don't poo-poo too hard, though. They're probably still smarter than you.
			 */
			if (sexp.endOffset > sexp.offset) {
				try {
					int startLine = doc.getLineOfOffset(offset + sexp.offset);					
					int endLine = doc.getLineOfOffset(offset + sexp.endOffset);					
					if (endLine > startLine) {
						int start = doc.getLineOffset(startLine);
						int end = doc.getLineOffset(endLine)+doc.getLineLength(endLine);
						emitPosition(start,end-start);						
					}
				} catch (BadLocationException e) {
					emitPosition(offset + sexp.offset, sexp.endOffset - sexp.offset+1);
					e.printStackTrace();
				}
			}
		}
	    
		// process sections
		fLastSection.setOffset(rangeEnd);
		{
			// find first section
			int i = 0;
			while ( i < contents.comments.size() && 
					!contents.comments.get(i).isSectionComment() ) {
				++i;
			}
			if ( contents.comments.size() > 0 && i < contents.comments.size() &&  
					contents.comments.get(i).isSectionComment() ) {
				int startOffset = offset + contents.comments.get(i).offset;
				int endOffset;
				fLastSection.setOffset(startOffset);
				do {
					// find next section
					do {
						++i;
					} while ( i < contents.comments.size() && 
							!contents.comments.get(i).isSectionComment() );
					// process section
					fLastSection.setOffset(startOffset);
					if ( i >= contents.comments.size() ) { //through end of file
						endOffset = rangeEnd;
					} else { //have more sections
						endOffset = offset + contents.comments.get(i).offset - 1;
					}
					emitPosition(startOffset, endOffset - startOffset);
					startOffset = endOffset + 1;
				} while (i < contents.comments.size());
				
			}
		}
		
		// process last sexp - funny interaction with sections and end of file
		if (contents.params.size() > 0) {
			LispNode last = contents.params.get(contents.params.size()-1);
			int lastRangeEnd = rangeEnd;
			if ( offset + last.offset < fLastSection.getOffset() ) {
				lastRangeEnd = fLastSection.getOffset();
			}
			emitPosition(offset + last.offset, lastRangeEnd - last.offset - offset);
		}
		fLastSection.setLength(rangeEnd - fLastSection.getOffset());
		return inPackage;
	}
	
	protected void emitPosition(int startOffset, int length) {
		fPositions.add(new Position(startOffset, length));
	}
}
