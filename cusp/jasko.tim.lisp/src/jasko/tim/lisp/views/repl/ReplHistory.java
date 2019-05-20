package jasko.tim.lisp.views.repl;

import java.util.ArrayList;

import jasko.tim.lisp.ColorManager;
import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.ColorManager.ChangeEventListener;
import jasko.tim.lisp.ColorManager.ColorChangeEvent;
import jasko.tim.lisp.inspector.InspectorRunnable;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.views.ReplView;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.*;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.*;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.dnd.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;

public class ReplHistory extends SourceViewer
	implements MouseMoveListener, DisposeListener, MouseListener {
	
	private ArrayList<InspectableRegion> regions = new ArrayList<InspectableRegion>();
	private Cursor hand;
	private Color inspectableBack;
	private Color inspectableFore;
	private Color inputBack;
	private Color inputFore;
	private Color commentFore;
	
    private boolean applyInspectableStyles;
    private boolean underlineInspectables;
	
	public ReplHistory (Composite parent) {
		//EDIT: ADDED SWT.H_SCROLL
		super(parent, new VerticalRuler(10), SWT.V_SCROLL |SWT.H_SCROLL| SWT.MULTI | SWT.LEFT | SWT.BORDER);
		
		setEditable(false);
		//configure(new LispConfiguration(null, LispPlugin.getDefault().getColorManager()));
 		IDocument doc = new Document();
 		//ReplPartitionScanner.connectPartitioner(doc);
 		setDocument(doc);
 		
 		showAnnotations(false);
 		showAnnotationsOverview(false);
 		
 		getTextWidget().addMouseMoveListener(this);
 		getTextWidget().addMouseListener(this);
 		getTextWidget().addDisposeListener(this);
 		
 		hand = new Cursor(parent.getDisplay(), SWT.CURSOR_HAND);
 		
 		ColorManager colors = LispPlugin.getDefault().getColorManager();
 		inputBack = colors.getColor(ColorManager.TokenType.REPL_INP_BG);
 		inputFore = colors.getColor(ColorManager.TokenType.REPL_INP_FG);
        
 		inspectableBack = colors.getColor(ColorManager.TokenType.REPL_INSP_BG);
 		inspectableFore = colors.getColor(ColorManager.TokenType.REPL_INSP_FG);
 		commentFore = colors.getColor(ColorManager.TokenType.COMMENT);
        
        IPreferenceStore ps = LispPlugin.getDefault().getPreferenceStore();
        applyInspectableStyles = ps.getBoolean(PreferenceConstants.DECORATE_REPL_INSPECTABLES);
        underlineInspectables = ps.getBoolean(PreferenceConstants.REPL_INSPECTABLE_UNDERLINE);
        ps.addPropertyChangeListener(new IPropertyChangeListener () {
            public void propertyChange (PropertyChangeEvent event) {
                if (event.getProperty().equals(PreferenceConstants.DECORATE_REPL_INSPECTABLES)) {
                    applyInspectableStyles = (Boolean)event.getNewValue();
                } else if (event.getProperty().equals(PreferenceConstants.REPL_INSPECTABLE_UNDERLINE)) {
                    underlineInspectables = (Boolean)event.getNewValue();
                } else {
                    return;
                }
                
                // should refresh already-displayed inspectables, but not sure how to get the currently-applied
                // StyleRanges back to the "normal" syntax highlighted baseline so that the new styles could be applied
                // as necessary
            }
        });
        LispPlugin.getDefault().getColorManager().addChangeEventListener(new ChangeEventListener () {
            public void colorPreferenceChanged (ColorChangeEvent event) {
                if (event.tokenType.equals(ColorManager.TokenType.REPL_INSP_BG)) {
                    inspectableBack = event.newValue;
                } else if (event.tokenType.equals(ColorManager.TokenType.REPL_INSP_FG)) {
                    inspectableFore = event.newValue;
                } else if (event.tokenType.equals(ColorManager.TokenType.REPL_INP_FG)) {
                    inputFore = event.newValue;
                } else if (event.tokenType.equals(ColorManager.TokenType.REPL_INP_BG)) {
                    inputBack = event.newValue;
                } else if (event.tokenType.equals(ColorManager.TokenType.COMMENT)) {
                    commentFore = event.newValue;
                } else {
                    return;
                }
                
                // should refresh already-displayed inspectables, but not sure how to get the currently-applied
                // StyleRanges back to the "normal" syntax highlighted baseline so that the new styles could be applied
                // as necessary
            }
        });
	}
	
	
	public void clear() {
		IDocument doc = getDocument();
		doc.set("");
		
		regions.clear();
	}
	
	public void appendText(String text) {
		IDocument doc = getDocument();
		try {
			int start = doc.getLength();
			String[] lines = text.split("\\n");
			if (lines.length == 0) { // happens when the text is just a newline
				doc.replace(doc.getLength(), 0, text);
			} else {
				for(int i = 0; i < lines.length; ++i){
					String line = lines[i];
					if (i == lines.length-1) {
						if (text.endsWith("\n")) {
							line += "\n";
						}
					} else {
						line += "\n";
					}
					doc.replace(doc.getLength(), 0, line);
					int pos = parseLineForComment(line);
					if( pos >= 0 ){
						applyCommentStyle(start+pos,line.length()-pos);
					}
					start += line.length();
				}
			}
			//doc.replace(doc.getLength(), 0, text);
		} catch (BadLocationException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			//TODO: Gorsal - find reason for null pointer exception!
			e.printStackTrace();
		}
	}

	public void appendTextForInspector(String text) {
		IDocument doc = getDocument();
		try {
			doc.replace(doc.getLength(), 0, text);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	private int parseLineForComment(String line){
		boolean inString = false;
		for( int i = 0 ; i < line.length(); ++i ){
			if( inString ){
				if(line.charAt(i) == '"' && line.charAt(i-1) != '\\'){
					inString = false;
				}
			} else {
				if( line.charAt(i) == ';' ){
					if(i == 0 || (i > 0 && line.charAt(i-1) != '\\') ){
						return i;
					}
				} else if ( line.charAt(i) == '"'){
					if(i == 0 || (i > 0 && line.charAt(i-1) != '\\') ){
						inString = true;
					}
				}
			}
		}
		return -1;
	}
	
	private void applyCommentStyle(int start, int length) {
        StyleRange style = new StyleRange(start, length, commentFore, null);
        getTextWidget().setStyleRange(style);		
	}
	
	public void appendInput(String text){
		IDocument doc = getDocument();
		try {
			int start = doc.getLength();
			doc.replace(doc.getLength(), 0, text);
            applyInputStyle(start, text.length());
		} catch (BadLocationException e) {
			e.printStackTrace();
		}		
	}
	
    private void applyInputStyle (int start, int length) {
        StyleRange style = new StyleRange(start, length, inputFore, inputBack);
        getTextWidget().setStyleRange(style);
    }
    
	public void appendInspectable(String text, String id) {
		IDocument doc = getDocument();
		try {
			int start = doc.getLength();
			regions.add(new InspectableRegion(start, text.length(), id));
			doc.replace(start, 0, text);
			
            applyInspectableStyle(start, text.length());
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	
    private void applyInspectableStyle (int start, int length) {
        if (!applyInspectableStyles) return;
        
        StyleRange style = new StyleRange(start, length, inspectableFore, inspectableBack);
        style.underline = underlineInspectables;
        getTextWidget().setStyleRange(style);
    }

 /* TODO:   
    private void applyInspectableHoverStyle (int start, int length) {
        // not currently used -- might be nice to allow users to define a :hover style
        if (!applyInspectableStyles) return;
        
        StyleRange style = new StyleRange(start, length, inspectableFore, inspectableBack);
        style.underline = underlineInspectables;
        getTextWidget().setStyleRange(style);
    }
 */	
	private InspectableRegion getRegion (int offset) {
		for (int i=regions.size()-1; i>=0; --i) {
            InspectableRegion r = regions.get(i);
			if (r.getOffset() + r.getLength() >= offset) {
				if (r.getOffset() <= offset) {
					return r;
				}
			} else {
				return null;
			}
		}
		
		return null;
	}
    
	public void mouseMove(MouseEvent e) {
		Point p = new Point(e.x, e.y);
        InspectableRegion region = null;
        try { 
            region = getRegion(getTextWidget().getOffsetAtLocation(p));
        } catch (IllegalArgumentException ex) {
            // no active region
        }
         
		if (region != null) {
			getTextWidget().setCursor(hand);
		} else {
			getTextWidget().setCursor(null);
		}
	}

	public void mouseUp(MouseEvent e) {
		Point p = new Point(e.x, e.y);
		int offset;
		try {
			offset = getTextWidget().getOffsetAtLocation(p);
		} catch (IllegalArgumentException ex) {
			return;
		}
		InspectableRegion region = getRegion(offset);
		if (region != null) {
			if (e.button == 1) { // left click
				sendInspect(region.id);
			} else if (e.button == 3) { // right click
				showInspectableMenu(region);
			}
		}
	}
	
	protected void showInspectableMenu(final InspectableRegion region) {
		Menu menu = new Menu (this.getControl());
		MenuItem inspect = new MenuItem(menu, SWT.PUSH);
		inspect.setText("Inspect");
		inspect.addSelectionListener(new SelectionListener () {
			public void widgetDefaultSelected(SelectionEvent e) {

			}
			public void widgetSelected(SelectionEvent e) {
				sendInspect(region.id);
			}
		});
		MenuItem copyRepl = new MenuItem(menu, SWT.PUSH);
		copyRepl.setText("Copy to REPL");
		copyRepl.addSelectionListener(new SelectionListener () {
			public void widgetDefaultSelected(SelectionEvent e) {

			}
			public void widgetSelected(SelectionEvent e) {
				ReplView.getInstance().insertInInputArea("#.(cusp:get-repl-result #10r" + region.id + ")");
			}
		});
		MenuItem copy = new MenuItem(menu, SWT.PUSH);
		copy.setText("Copy to clipboard");
		copy.addSelectionListener(new SelectionListener () {
			public void widgetDefaultSelected(SelectionEvent e) {

			}
			public void widgetSelected(SelectionEvent e) {
				String data = "#.(cusp:get-repl-result #10r" + region.id + ")";

				Clipboard cb = new Clipboard(getControl().getDisplay());
				TextTransfer textTransfer = TextTransfer.getInstance();
				cb.setContents(new Object[] { data },
						new Transfer[] { textTransfer });
				cb.dispose();
			}
		});
		//menu.setLocation(p);
		menu.setVisible(true);
	}
	
	protected void sendInspect(String id) {
		LispPlugin.getDefault().getCusp()
		  .sendInspectReplResult(id, new InspectorRunnable());
	}

	public void widgetDisposed(DisposeEvent e) {
		hand.dispose();
	}
    
	public void mouseDoubleClick(MouseEvent e) {}
	public void mouseDown(MouseEvent e) {}
    
    protected class InspectableRegion extends Region {
        public final String id;
        
        public InspectableRegion(int offset, int length, String id) {
            super(offset, length);
            this.id = id;
        }
    }

}
