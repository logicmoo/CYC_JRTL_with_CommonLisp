/*****************************************************************************
 *                                                                           *
 *  This file is part of the BeanShell Java Scripting distribution.          *
 *  Documentation and updates may be found at http://www.beanshell.org/      *
 *                                                                           *
 *  Sun Public License Notice:                                               *
 *                                                                           *
 *  The contents of this file are subject to the Sun Public License Version  *
 *  1.0 (the "License"); you may not use this file except in compliance with *
 *  the License. A copy of the License is available at http://www.sun.com    *
 *                                                                           *
 *  The Original Code is BeanShell. The Initial Developer of the Original    *
 *  Code is Pat Niemeyer. Portions created by Pat Niemeyer are Copyright     *
 *  (C) 2000.  All Rights Reserved.                                          *
 *                                                                           *
 *  GNU Public License Notice:                                               *
 *                                                                           *
 *  Alternatively, the contents of this file may be used under the terms of  *
 *  the GNU Lesser General Public License (the "LGPL"), in which case the    *
 *  provisions of LGPL are applicable instead of those above. If you wish to *
 *  allow use of your version of this file only under the  terms of the LGPL *
 *  and not to allow others to use your version of this file under the SPL,  *
 *  indicate your decision by deleting the provisions above and replace      *
 *  them with the notice and other provisions required by the LGPL.  If you  *
 *  do not delete the provisions above, a recipient may use your version of  *
 *  this file under either the SPL or the LGPL.                              *
 *                                                                           *
 *  Patrick Niemeyer (pat@pat.net)                                           *
 *  Author of Learning Java, O'Reilly & Associates                           *
 *  http://www.pat.net/~pat/                                                 *
 *                                                                           *
 *****************************************************************************/

package	bsh.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.JEditorPane;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.browse.Utility.UtilityOptionalArgs;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.JVMImpl;

import bsh.BshIterator;
import bsh.CollectionManager;
import bsh.Primitive;
import bsh.StringUtil;

/**
	A JFC/Swing based console for the BeanShell desktop.
	This is a descendant of the old AWTConsole.

	Improvements by: Mark Donszelmann <Mark.Donszelmann@cern.ch>
		including Cut & Paste

  	Improvements by: Daniel Leuck
		including Color and Image support, key press bug workaround
*/
public class JConsole extends JScrollPane
	implements GUIConsoleInterface, Runnable, KeyListener,
	MouseListener, ActionListener, PropertyChangeListener, HyperlinkListener
{

	@Override
	public void validate() {
		if(true) {
			super.validate();
			return;
		}
		Utility.invokeLater(new Runnable() {

			@Override
			public void run() {
				 superValidateTree();

			}
		});
	}
    protected void superValidateTree() {
    	super.validate();
	}
	private final static String	CUT = "Cut";
    private final static String	COPY = "Copy";
    private final static String	PASTE =	"Paste";

	private	OutputStream outPipe;
	private	InputStream inPipe;
	private	InputStream in;
	private	PrintStream out;

	public InputStream getInputStream() { return in; }
	@Override
	public Reader getIn() { return new InputStreamReader(in); }
	@Override
	public PrintStream getOut() { return out;	}
	@Override
	public PrintStream getErr() { return out;	}

    private int	cmdStart = 0;
	private	Vector history = new Vector();
	private	String startedLine;
	private	int histLine = 0;

    private JPopupMenu menu;
    private JTextPane text;
    private DefaultStyledDocument doc;




	NameCompletion nameCompletion;
	final int SHOW_AMBIG_MAX = 50;

	// hack to prevent key repeat for some reason?
    private boolean gotUp = true;
	private Thread keyReEnabler;

	public JConsole() {
		this(null, null, null);
	}
	public JConsole(String name) {
		this(name, null, null);
	}

	public JConsole( InputStream cin, OutputStream cout )
	{
		this(null, cin, cout);
	}
	public JConsole(String name, InputStream cin, OutputStream cout )
	{
		super();
		if(name==null) name = "BeanShell Console";
		myName = name;

		// Special TextPane which catches for cut and paste, both L&F keys and
		// programmatic	behaviour
		text = new JTextPane( doc=new DefaultStyledDocument() )
			{
			{ setContentType("text/html"); }
				@Override
				public void	cut() {
					if (text.getCaretPosition() < cmdStart)	{
						super.copy();
					} else {
						super.cut();
					}
				}

				@Override
				public void	paste()	{
					forceCaretMoveToEnd();
					super.paste();
				}
//
//				@Override
//					public Dimension getPreferredSize() {
//						if(true)return getSize().;
//						return new Dimension(200, 100);
//					}
			};

		Font font = new	Font("Monospaced",Font.PLAIN,14);
		text.setText("");
		text.setFont( font );
		text.setMargin(	new Insets(7,5,7,5) );
		text.addHyperlinkListener(this);
		text.addKeyListener(this);

		setViewportView(text);

		// create popup	menu
		menu = new JPopupMenu("JConsole	Menu");
		menu.add(new JMenuItem(CUT)).addActionListener(this);
		menu.add(new JMenuItem(COPY)).addActionListener(this);
		menu.add(new JMenuItem(PASTE)).addActionListener(this);

		text.addMouseListener(this);
	      MyHTMLEditorKit kit=new MyHTMLEditorKit();
		   text.setEditorKit(kit);
		// make	sure popup menu	follows	Look & Feel
		UIManager.addPropertyChangeListener(this);

		outPipe	= cout;
		if ( outPipe ==	null ) {
			outPipe	= new PipedOutputStream();
			try {
				in = new PipedInputStream((PipedOutputStream)outPipe);
			} catch	( IOException e	) {
				print(myName + " Console internal	error (1)...", Color.red);
			}
		}

		inPipe = cin;
		if ( inPipe == null ) {
			PipedOutputStream pout = new PipedOutputStream();
			out = new PrintStream( pout );
			try {
				inPipe = new BlockingPipedInputStream(pout);
			} catch ( IOException e ) { print("Console internal error: "+e); }
		}
		// Start the inpipe watcher
		new Thread(null, this, myName + " inpipe Watcher"  ).start();

		println();
		//printHtml("<a href=\"abc\">hyperlink</a>");
		printHtml("<a href=\"http://cycserver:3020/apropos_object?name=startDmilesBSH\">startDmilesBSH</a>, <a href=\"http://www.google.com/finance?q=NYSE:C\">C</a>, <a href=\"http://www.google.com/finance?q=NASDAQ:MSFT\">MSFT</a>");
		println();
		requestFocus();
	}
	@Override
	public void hyperlinkUpdate(HyperlinkEvent e) {
        if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
	           // Do something with e.getURL() here
	        	handleLink(e);
	        }
	}
    boolean isNeedCursorChange=true;
	 public class MyHTMLEditorKit extends HTMLEditorKit {

	        MyLinkController handler=new MyLinkController();
	        @Override
			public void install(JEditorPane c) {
	            MouseListener[] oldMouseListeners=c.getMouseListeners();
	            MouseMotionListener[] oldMouseMotionListeners=c.getMouseMotionListeners();
	            super.install(c);
	            //the following code removes link handler added by original
	            //HTMLEditorKit

	            for (MouseListener l: c.getMouseListeners()) {
	                c.removeMouseListener(l);
	            }
	            for (MouseListener l: oldMouseListeners) {
	                c.addMouseListener(l);
	            }

	            for (MouseMotionListener l: c.getMouseMotionListeners()) {
	                c.removeMouseMotionListener(l);
	            }
	            for (MouseMotionListener l: oldMouseMotionListeners) {
	                c.addMouseMotionListener(l);
	            }

	            //add out link handler instead of removed one
	            c.addMouseListener(handler);
	            c.addMouseMotionListener(handler);
	        }

	        public class MyLinkController extends LinkController {

	            @Override
				public void mouseClicked(MouseEvent e) {
	                JEditorPane editor = (JEditorPane) e.getSource();

	                if (editor.isEditable() && SwingUtilities.isLeftMouseButton(e)) {
	                    if (e.getClickCount()==2) {
	                        editor.setEditable(false);
	                        super.mouseClicked(e);
	                        editor.setEditable(true);
	                    }
	                }

	            }
	            @Override
				public void mouseMoved(MouseEvent e) {
	                JEditorPane editor = (JEditorPane) e.getSource();

	                if (editor.isEditable()) {
	                    isNeedCursorChange=false;
	                    editor.setEditable(false);
	                    isNeedCursorChange=true;
	                    super.mouseMoved(e);
	                    isNeedCursorChange=false;
	                    editor.setEditable(true);
	                    isNeedCursorChange=true;
	                }
	            }

	        }
	    }
	protected void handleLink(HyperlinkEvent e) {

    	URL url = e.getURL();
    	if(url==null) {
    		try {
				url = new URL(e.getDescription());
			} catch (MalformedURLException e1) {
				throw JVMImpl.doThrow(e1);
			}
    	}
    	if(url==null) return;
    	String proto = url.getProtocol();
		try {
			if (true) {
				Object o = findPrintedObject(url);

				if (o != null) {
					BeanShellCntrl.showObject(o);
					return;
				}
			}
			URI uri = e.getURL().toURI();

			if(Desktop.isDesktopSupported()) {
			    try {
			    	Desktop.getDesktop().browse(uri);
				} catch (IOException e1) {
					e1.printStackTrace();
					throw JVMImpl.doThrow(e1);
				}
			}
		} catch (URISyntaxException e2) {
			e2.printStackTrace();
			throw JVMImpl.doThrow(e2);
		}

	}
	private Object findPrintedObject(URL url) {
		//http://localhost:3020/apropos_object?name=
			String query = url.getQuery();
			query = query.substring(query.lastIndexOf("=")+1);
		 return findPrintedObject(query);
	}
	private Object findPrintedObject(String host) {
		return BeanShellCntrl.bowl.findBean(host);
	}
	@Override
	public void requestFocus()
	{
		super.requestFocus();
		text.requestFocus();

	}


	@Override
	public void keyPressed(	KeyEvent e ) {
	    type( e );
	    gotUp=false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	    type( e );
	}

    @Override
	public void	keyReleased(KeyEvent e)	{
		gotUp=true;
		type( e	);
    }



    private synchronized void type( KeyEvent e ) {

		switch ( e.getKeyCode()	)
		{
			case ( KeyEvent.VK_ENTER ):
			    if (e.getID() == KeyEvent.KEY_PRESSED) {
					if (gotUp) {
						enter();
						resetCommandStart();
						text.setCaretPosition(cmdStart);
					}
				}
				e.consume();
				text.repaint();
				break;

			case ( KeyEvent.VK_UP ):
			    if (e.getID() == KeyEvent.KEY_PRESSED) {
				    historyUp();
				}
				e.consume();
				break;

			case ( KeyEvent.VK_DOWN	):
			    if (e.getID() == KeyEvent.KEY_PRESSED) {
					historyDown();
				}
				e.consume();
				break;

			case ( KeyEvent.VK_LEFT	):
			case ( KeyEvent.VK_DELETE ):
				if (text.getCaretPosition() <= cmdStart) {
					// This doesn't work for backspace.
					// See default case for workaround
					e.consume();
				}
				break;
			case ( KeyEvent.VK_BACK_SPACE ):

				if (text.getCaretPosition() <= cmdStart) {
					// This doesn't work for backspace.
					// See default case for workaround
					e.consume();
				}
				break;

			case ( KeyEvent.VK_RIGHT ):
				forceCaretMoveToStart();
				break;

			case ( KeyEvent.VK_HOME ):
				text.setCaretPosition(cmdStart);
				e.consume();
				break;

			case ( KeyEvent.VK_U ):	// clear line
				if ( (e.getModifiers() & InputEvent.CTRL_MASK) > 0 ) {
					replaceRange( "", cmdStart, textLength());
					histLine = 0;
					e.consume();
				}
				break;

			case ( KeyEvent.VK_ALT ):
			case ( KeyEvent.VK_CAPS_LOCK ):
			case ( KeyEvent.VK_CONTROL ):
			case ( KeyEvent.VK_META ):
			case ( KeyEvent.VK_SHIFT ):
			case ( KeyEvent.VK_PRINTSCREEN ):
			case ( KeyEvent.VK_SCROLL_LOCK ):
			case ( KeyEvent.VK_PAUSE ):
			case ( KeyEvent.VK_INSERT ):
			case ( KeyEvent.VK_F1):
			case ( KeyEvent.VK_F2):
			case ( KeyEvent.VK_F3):
			case ( KeyEvent.VK_F4):
			case ( KeyEvent.VK_F5):
			case ( KeyEvent.VK_F6):
			case ( KeyEvent.VK_F7):
			case ( KeyEvent.VK_F8):
			case ( KeyEvent.VK_F9):
			case ( KeyEvent.VK_F10):
			case ( KeyEvent.VK_F11):
			case ( KeyEvent.VK_F12):
			case ( KeyEvent.VK_ESCAPE ):

			// only	modifier pressed
			break;

			// Control-C
			case ( KeyEvent.VK_C ):
				if (text.getSelectedText() == null) {
				    if (( (e.getModifiers() & InputEvent.CTRL_MASK) > 0	)
					&& (e.getID() == KeyEvent.KEY_PRESSED))	{
						printText("^C");
					}
					e.consume();
				}
				break;

			case ( KeyEvent.VK_TAB ):
			    if (e.getID() == KeyEvent.KEY_RELEASED) {
					String part = text.getText().substring( cmdStart );
					doCommandCompletion( part );
				}
				e.consume();
				break;

			default:
				if (
					(e.getModifiers() &
					(InputEvent.CTRL_MASK
					| InputEvent.ALT_MASK | InputEvent.META_MASK)) == 0 )
				{
					// plain character
					if(!text.isEditable() && e.getID() == KeyEvent.KEY_PRESSED){
						printText(""+e.getKeyChar());
					}
					forceCaretMoveToEnd();
				}

				/*
					The getKeyCode function always returns VK_UNDEFINED for
					keyTyped events, so backspace is not fully consumed.
				*/
				if (e.paramString().indexOf("Backspace") != -1)
				{
				  if (text.getCaretPosition() <= cmdStart) {
						e.consume();
						break;
					}
				}

				break;
		}
	}

	private void doCommandCompletion( String part ) {
		if ( nameCompletion == null )
			return;

		int i=part.length()-1;

		// Character.isJavaIdentifierPart()  How convenient for us!!
		while (
			i >= 0 &&
				( Character.isJavaIdentifierPart(part.charAt(i))
				|| part.charAt(i) == '.' )
		)
			i--;

		part = part.substring(i+1);

		if ( part.length() < 2 )  // reasonable completion length
			return;

		//System.out.println("completing part: "+part);

		// no completion
		String [] complete = nameCompletion.completeName(part);
		if ( complete.length == 0 ) {
			java.awt.Toolkit.getDefaultToolkit().beep();
			return;
		}

		// Found one completion (possibly what we already have)
		if ( complete.length == 1 && !complete.equals(part) ) {
			String append = complete[0].substring(part.length());
			printText( append );
			return;
		}

		// Found ambiguous, show (some of) them

		String line = text.getText();
		String command = line.substring( cmdStart );
		// Find prompt
		for(i=cmdStart; line.charAt(i) != '\n' && i > 0; i--);
		String prompt = line.substring( i+1, cmdStart );

		// Show ambiguous
		StringBuffer sb = new StringBuffer("\n");
		for( i=0; i<complete.length && i<SHOW_AMBIG_MAX; i++)
			sb.append( complete[i] +"\n" );
		if ( i == SHOW_AMBIG_MAX )
			sb.append("...\n");

		print( sb, Color.gray );
		print( prompt ); // print resets command start
		printText( command ); // append does not reset command start
	}

	private void resetCommandStart() {
		cmdStart = textLength();
	}

	public DefaultStyledDocument getDoc() {
		return doc;
	}
	public void printHtml(String textStr) {
		if(!textStr.endsWith(" ")) textStr = textStr.concat(" ");
		final String textStr0 = textStr;
		invokeAndWait(new Runnable() {
			@Override
			public void run() {
				try {
				text.setContentType( "text/html" );
				//text.setEditable(false);
				HTMLDocument document = (HTMLDocument)text.getDocument();
			    HTMLEditorKit editorKit = (HTMLEditorKit)text.getEditorKit();
			    try {
					int slen = textLength();
					text.select(slen, slen);
					editorKit.insertHTML(document, slen, textStr0, 0, 0, null);

				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				} finally {
			    //text.setEditable(true);

				resetCommandStart();
				text.setCaretPosition(cmdStart);

			}
			}
		});
    }


	private	void printText(Object string) {
		if(!(string instanceof String )) {
			printObject(string);
			return;
		}
		int slen = textLength();
		text.select(slen, slen);
	    text.replaceSelection((String) string);
    }

    private String replaceRange(Object s, int start, int	end) {
		String st = s.toString();
		text.select(start, end);
	    text.replaceSelection(st);
	    //text.repaint();
	    return st;
    }

	private	void forceCaretMoveToEnd() {
		if (text.getCaretPosition() < cmdStart)	{
			// move caret first!
			text.setCaretPosition(textLength());
		}
		text.repaint();
    }

	private	void forceCaretMoveToStart() {
		if (text.getCaretPosition() < cmdStart)	{
			// move caret first!
		}
		text.repaint();
    }


	private	void enter() {
		String s = getCmd();

		if ( s.length()	== 0 )	// special hack	for empty return!
			s = ";\n";
		else {
			history.addElement( s );
			s = s +"\n";
		}

		printText("\n");
		histLine = 0;
		acceptLine( s );
		text.repaint();
	}

    private String getCmd() {
		String s = "";
		try {
			s =	text.getText(cmdStart, textLength() - cmdStart);
		} catch	(BadLocationException e) {
			// should not happen
			System.out.println("Internal JConsole Error: "+e);
		}
		return s;
    }

	private	void historyUp() {
		if ( history.size() == 0 )
			return;
		if ( histLine == 0 )  // save current line
			startedLine = getCmd();
		if ( histLine <	history.size() ) {
			histLine++;
			showHistoryLine();
		}
	}

	private	void historyDown() {
		if ( histLine == 0 )
			return;

		histLine--;
		showHistoryLine();
	}

	private	void showHistoryLine() {
		String showline;
		if ( histLine == 0 )
			showline = startedLine;
		else
			showline = (String)history.elementAt( history.size() - histLine	);

		replaceRange( showline,	cmdStart, textLength() );
		text.setCaretPosition(textLength());
		text.repaint();
	}

	String ZEROS = "000";
	private String myName;
	private boolean exitThreadOnEOF = true;
	public static boolean hyperLinkObjects =true;

	private	void acceptLine( String	line )
	{
		// Patch to handle Unicode characters
		// Submitted by Daniel Leuck
		StringBuffer buf = new StringBuffer();
		int lineLength = line.length();
		for(int i=0; i<lineLength; i++) {
				char c = line.charAt(i);
				if(c>127) {
					String val = Integer.toString(c, 16);
					val=ZEROS.substring(0,4-val.length()) + val;
					buf.append("\\u" + val);
				} else {
					buf.append(c);
				}
		}
		line = buf.toString();
		// End unicode patch


		if (outPipe == null )
			print(myName + ": Console internal	error: cannot output ...", Color.red);
		else
			try {
				outPipe.write( line.getBytes() );
				outPipe.flush();
			} catch	( IOException e	) {
				outPipe	= null;
				throw new RuntimeException(myName + ": Console pipe broken...");
			}
		//text.repaint();
	}

	@Override
	public void println(final Object o) {
		invokeAndWait(new Runnable() {
			@Override
			public void run() {
				printObject(o);
				printText("\n");
				resetCommandStart();
				text.setCaretPosition(cmdStart);
			}
		});
		text.repaint();
	}

	@Override
	public void print(final Object o) {
		invokeAndWait(new Runnable() {
			@Override
			public void run() {
				printObject(o);
				resetCommandStart();
				text.setCaretPosition(cmdStart);
			}
		});
	}


	public	void printObject(Object arg) {
    	if ( arg == null )
    		arg = "null";

    	if(arg instanceof String) {
    		printText((String)arg);
    	    return;
    	}

    	if(isInvariant(arg)) {
    		printText(String.valueOf(arg));
    		return;
    	}

    	//if(Debuggable.isUnprintable(c))

    	CollectionManager cm = CollectionManager.getCollectionManager();
    	if ( cm.isBshIterable( arg ) )
    	{
    		// could also just use a for(:) loop here... except for the commas
    		BshIterator iterator = cm.getBshIterator( arg );
    		printText( StringUtil.normalizeClassName(arg.getClass()) + ": {");
			while (iterator.hasNext()) {
				printObject(iterator.next());
				printText(iterator.hasNext() ? "," : "");
			}
    		printText("}");
    		return;
    	}

    	if ( !(arg instanceof Primitive)
    		&& !(arg instanceof bsh.ClassIdentifier )
    		&& arg.getClass().isArray() )
    	{
            printText( StringUtil.normalizeClassName(arg.getClass()) + ": {");
    		Object[] aarg = (Object[])arg;
			for(int i=0; i<aarg.length; i++) {
				printObject( aarg[i]);
				printText( i<aarg.length?",":"") ;
			}

			printText("}");
    		return;
    	}
    	if(this.hyperLinkObjects) {
    		printObjectHtml(arg);
    	}
    	printText(String.valueOf(arg));
    }

	private void printObjectHtml(Object arg) {
		printHtml("<a href=\"bean://"+ BeanShellCntrl.addObject(null, arg) +"\">C</a>");

	}
	private boolean isInvariant(Object arg) {
    	if (arg instanceof Primitive) {
    		return true;
    	}
		if( ReflectUtils.isImmutable(arg.getClass())) return true;
		return false;
	}
	/**
	  * Prints "\\n" (i.e. newline)
	  */
	public void println() {
	    print("\n");
		text.repaint();
	}

	@Override
	public void error( Object o ) {
	    print( o, Color.red );
	}

	public void println(Icon icon) {
		print(icon);
		println();
		text.repaint();
	}

	public void print(final Icon icon) {
	    if (icon==null)
			return;

		invokeAndWait(new Runnable() {
			@Override
			public void run() {
				text.insertIcon(icon);
				resetCommandStart();
				text.setCaretPosition(cmdStart);
			}
		});
	}

	public void print(Object s, Font font) {
		print(s, font, null);
    }

	@Override
	public void print(Object s, Color color) {
		print(s, null, color);
	}

	public void print(final Object o, final Font font, final Color color) {
		invokeAndWait(new Runnable() {
			@Override
			public void run() {
				AttributeSet old = getStyle();
				setStyle(font, color);
				printText(String.valueOf(o));
				resetCommandStart();
				text.setCaretPosition(cmdStart);
				setStyle(old, true);
			}
		});
    }

	public void print(
	    Object s,
	    String fontFamilyName,
	    int	size,
	    Color color
	    ) {

	    print(s,fontFamilyName,size,color,false,false,false);
    }

	public void print(
	    final Object o,
	    final String fontFamilyName,
	    final int	size,
	    final Color color,
	    final boolean bold,
	    final  boolean italic,
	    final boolean underline
	    )
	{
		invokeAndWait(new Runnable() {
			@Override
			public void run() {
				AttributeSet old = getStyle();
				setStyle(fontFamilyName, size, color, bold,	italic,	underline);
				printText(String.valueOf(o));
				resetCommandStart();
				text.setCaretPosition(cmdStart);
				setStyle(old, true);
			}
		});
    }

    private AttributeSet setStyle(Font font) {
	    return setStyle(font, null);
    }

    private AttributeSet setStyle(Color color) {
	    return setStyle(null, color);
    }

    private AttributeSet setStyle( Font font, Color color)
	{
	    if (font!=null)
			return setStyle( font.getFamily(), font.getSize(), color,
				font.isBold(), font.isItalic(),
				StyleConstants.isUnderline(getStyle()) );
		else
			return setStyle(null,-1,color);
    }

    private AttributeSet setStyle (
	    String fontFamilyName, int	size, Color color)
	{
		MutableAttributeSet attr = new SimpleAttributeSet();
		if (color!=null)
			StyleConstants.setForeground(attr, color);
		if (fontFamilyName!=null)
			StyleConstants.setFontFamily(attr, fontFamilyName);
		if (size!=-1)
			StyleConstants.setFontSize(attr, size);

		setStyle(attr);

		return getStyle();
    }

    private AttributeSet setStyle(
	    String fontFamilyName,
	    int	size,
	    Color color,
	    boolean bold,
	    boolean italic,
	    boolean underline
	    )
	{
		MutableAttributeSet attr = new SimpleAttributeSet();
		if (color!=null)
			StyleConstants.setForeground(attr, color);
		if (fontFamilyName!=null)
			StyleConstants.setFontFamily(attr, fontFamilyName);
		if (size!=-1)
			StyleConstants.setFontSize(attr, size);
		StyleConstants.setBold(attr, bold);
		StyleConstants.setItalic(attr, italic);
		StyleConstants.setUnderline(attr, underline);

		setStyle(attr);

		return getStyle();
    }

    private void setStyle(AttributeSet attributes) {
		setStyle(attributes, false);
    }

    private void setStyle(AttributeSet attributes, boolean overWrite) {
		text.setCharacterAttributes(attributes,	overWrite);
    }

    private AttributeSet getStyle() {
		return text.getCharacterAttributes();
    }

	@Override
	public void setFont( Font font ) {
		super.setFont( font );

		if ( text != null )
			text.setFont( font );
	}

	private	void inPipeWatcherLoop() throws IOException	{
		byte []	ba = new byte [256]; //	arbitrary blocking factor
		int read;
		while(true) {
			read = inPipe.read(ba);
			if (read == -1 && this.exitThreadOnEOF) {
				break;
			}
			print(new String(ba, 0, read));
			// text.repaint();
		}
		println(myName + ": Input	closed...");
	}

	@Override
	public void run() {
		try {
			inPipeWatcherLoop();
		} catch	( IOException e	) {
			print("Console: I/O Error: "+e+"\n", Color.red);
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return myName;
	}

    // MouseListener Interface
    @Override
	public void	mouseClicked(MouseEvent	event) {
    }

    @Override
	public void mousePressed(MouseEvent event) {

        if (event.isPopupTrigger()) {
            menu.show(
				(Component)event.getSource(), event.getX(), event.getY());
        }
    }

    @Override
	public void	mouseReleased(MouseEvent event)	{
		if (event.isPopupTrigger()) {
			menu.show((Component)event.getSource(), event.getX(),
			event.getY());
		}
		text.repaint();
    }

    @Override
	public void	mouseEntered(MouseEvent	event) {

    }

    @Override
	public void	mouseExited(MouseEvent event) {
    }

    // property	change
    @Override
	public void	propertyChange(PropertyChangeEvent event) {
		if (event.getPropertyName().equals("lookAndFeel")) {
			SwingUtilities.updateComponentTreeUI(menu);
		}
    }

    // handle cut, copy	and paste
    @Override
	public void	actionPerformed(ActionEvent event) {
		String cmd = event.getActionCommand();
		if (cmd.equals(CUT)) {
			text.cut();
		} else if (cmd.equals(COPY)) {
			text.copy();
		} else if (cmd.equals(PASTE)) {
			text.paste();
		}
    }

	/**
	 * If not in the event thread run via SwingUtilities.invokeAndWait()
	 */
	private void invokeAndWait(Runnable run) {
		if(!SwingUtilities.isEventDispatchThread()) {
			try {
				SwingUtilities.invokeAndWait(run);
			} catch(Exception e) {
				// shouldn't happen
				e.printStackTrace();
				   throw JVMImpl.doThrow(e);
			}
		} else {
			run.run();
		}
	}



	/**
		The overridden read method in this class will not throw "Broken pipe"
		IOExceptions;  It will simply wait for new writers and data.
		This is used by the JConsole internal read thread to allow writers
		in different (and in particular ephemeral) threads to write to the pipe.

		It also checks a little more frequently than the original read().

		Warning: read() will not even error on a read to an explicitly closed
		pipe (override closed to for that).
	*/
	public static class BlockingPipedInputStream extends PipedInputStream
	{
		boolean closed;
		public BlockingPipedInputStream( PipedOutputStream pout )
			throws IOException
		{
			super(pout);
		}
		@Override
		public synchronized int read() throws IOException {
			if ( closed )
				throw new IOException("stream closed");

			while (super.in < 0) {	// While no data */
				notifyAll();	// Notify any writers to wake up
				try {
					wait(250);
				} catch ( InterruptedException e ) {
					throw new InterruptedIOException();
				}
			}
			// This is what the superclass does.
			int ret = buffer[super.out++] & 0xFF;
			if (super.out >= buffer.length)
				super.out = 0;
			if (super.in == super.out)
				super.in = -1;  /* now empty */
			return ret;
		}
		@Override
		public void close() throws IOException {
			closed = true;
			super.close();
		}
	}

	@Override
	public void setNameCompletion( NameCompletion nc ) {
		this.nameCompletion = nc;
	}

	@Override
	public void setWaitFeedback( boolean on ) {
		if ( on )
			setCursor( Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR) );
		else
			setCursor( Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR) );
	}

	private int textLength() { return text.getDocument().getLength(); }

}


