package jasko.tim.lisp.editors;

import jasko.tim.lisp.util.LispUtil;

import java.util.Arrays;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;

public class CurrentExpressionHighlightingListener implements KeyListener, MouseListener {
    private final Annotation highlightAnnotation = new Annotation("jasko.tim.lisp.editors.LispEditor.current-sexp",
    																    false, "");
    private int[] currentHighlightRange;
    
    private final Annotation outerAnnotation1 = new Annotation("jasko.tim.lisp.editors.LispEditor.outer-sexp",
		    false, "");
    private final Annotation outerAnnotation2 = new Annotation("jasko.tim.lisp.editors.LispEditor.outer-sexp",
		    false, "");
    
    public ISourceViewer installedOn;
    LispEditor editor = null;
    public CurrentExpressionHighlightingListener (LispEditor ed) {
    	editor = ed;
    }
    public CurrentExpressionHighlightingListener () {};
    
    public int[] getRange ()
    {
    	return currentHighlightRange;
    }
    
    private void removeHighlight () {
        installedOn.getAnnotationModel().removeAnnotation(highlightAnnotation);
        installedOn.getAnnotationModel().removeAnnotation(outerAnnotation1);
        installedOn.getAnnotationModel().removeAnnotation(outerAnnotation2);
    }
    
    public void install (ISourceViewer viewer) {
        viewer.getTextWidget().addKeyListener(this);
        viewer.getTextWidget().addMouseListener(this);
        installedOn = viewer;
    }
    
    public void uninstall (ISourceViewer viewer) {
        viewer.getTextWidget().removeKeyListener(this);
        viewer.getTextWidget().removeMouseListener(this);
    }

    public String getHighlightedString ()
    {
    	try
    	{
    		IDocument doc = installedOn.getDocument();
    		int[]range = getHighlightedRange();
    		return doc.get(range[0],range[1]);
    	}
    	catch(BadLocationException e)
    	{
    		return null;
    	}
    }

    public int[] getHighlightedRange ()
    {
    	int[]range = new int[2];
    	ITextSelection ts = (ITextSelection)installedOn.getSelectionProvider().getSelection();
    	range[0] = ts.getOffset();
    	range[1] = ts.getLength();
    	return range;
    }
    
    private void updateHighlighting () {
        ITextSelection ts = (ITextSelection)installedOn.getSelectionProvider().getSelection();
        if (ts.getLength()==0) {
        	editor.clearHistory();
        }
        
        try {
        	int[]range;
        	if (installedOn.getDocument().getLength()>ts.getOffset()&&installedOn.getDocument().getChar(ts.getOffset())=='(') {
        		range = LispUtil.getCurrentExpressionRange(installedOn.getDocument(), ts.getOffset()+1);}
        	else 
                range = LispUtil.getCurrentExpressionRange(installedOn.getDocument(), ts.getOffset());
        
            try {
                if (range == null) {
                    removeHighlight();
                } else if (currentHighlightRange != null && Arrays.equals(currentHighlightRange, range)) {
                    // leave current highlight in place, still valid
                } else {
                    removeHighlight();
                    installedOn.getAnnotationModel().addAnnotation(highlightAnnotation, new Position(range[0], range[1]));
                    int start = range[0] - 1; 
                	if (start >= 0) { 
                		int outerRange[] = LispUtil.getCurrentExpressionRangeWO(installedOn.getDocument(), start);
                		if (outerRange != null) {
                			int firstLen = range[0] - outerRange[0];
                			
                    		installedOn.getAnnotationModel().addAnnotation(outerAnnotation1, new Position(outerRange[0], firstLen));
                    		installedOn.getAnnotationModel().addAnnotation(outerAnnotation2, new Position(range[0] + range[1], outerRange[1] - (firstLen + range[1])));
                    	}
                    }
                }
            } finally {
                currentHighlightRange = range;
            }
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
    
    public void keyPressed (KeyEvent e) {// only need to update highlighting for key events that might move us into a different s-expression scope
        switch (e.character) {
            case '(':
            case ')':
            case '\b':
            case '\n':
            case '\r':
                updateHighlighting();
                return;
        }
    }

    public void keyReleased (KeyEvent e) {
        switch (e.keyCode) {
	        case SWT.HOME:
	        case SWT.END:
            case SWT.DEL:
            case SWT.KEYPAD_CR:
            case SWT.ARROW_RIGHT:
            case SWT.ARROW_LEFT:
            case SWT.ARROW_DOWN:
            case SWT.ARROW_UP:
            case SWT.PAGE_DOWN:
            case SWT.PAGE_UP:
	            updateHighlighting();
        }
    }

    public void mouseDoubleClick (MouseEvent e) {
    }

    public void mouseDown (MouseEvent e) {
        updateHighlighting();
    }

    public void mouseUp (MouseEvent e) {
    }
    
}