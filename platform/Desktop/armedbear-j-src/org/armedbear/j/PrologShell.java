/*
 * PrologShell.java
 *
 * Copyright (C) 2002-2010 Peter Graves
 * $Id: PrologShell.java,v 1.101 2007/08/01 17:04:07 piso Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.armedbear.j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.SwingUtilities;

import org.logicmoo.system.BeanShellCntrl;

import gnu.regexp.REMatch;
//import org.armedbear.prolog.PrologThread;

public class PrologShell extends Shell
{
  private static final String DEFAULT_PROMPT_PATTERN =
    "^[^:>\\*\\]]*[:>\\*\\]] *";

  private static final String ALLEGRO_PROMPT_PATTERN =
    "^(\\[[0-9+][ci]?\\] )?[^ ]+\\([0-9]+\\): ";

  private static final String ARMEDBEAR_PROMPT_PATTERN =
    ALLEGRO_PROMPT_PATTERN;

  private static final String CLISP_PROMPT_PATTERN =
    "^[^>\\*\\]]*\\[[0-9]+\\]> ";

  private static final String CMUCL_PROMPT_PATTERN =
    "^\\* |^[0-9]+\\] ";

  private static final String OPENMCL_PROMPT_PATTERN =
    "(^\\? )|(^Inspect ?[0-9]*\\>)";

  private static final String SBCL_PROMPT_PATTERN =
    CMUCL_PROMPT_PATTERN + "|" + ALLEGRO_PROMPT_PATTERN;

  private final boolean slime;

  private String resetCommand = null;
  private String exitCommand = "(exit)";

  private Position posBeforeLastPrompt;
  private Position posEndOfInput;

  private File currentDirectory;

  // For JProlog.java.
  protected PrologShell()
  {
    setPromptRE(ARMEDBEAR_PROMPT_PATTERN);
    setResetCommand(":reset");
    slime = false;
  }

  private PrologShell(String shellCommand, String title)
  {
    super(shellCommand, LispShellMode.getMode());
    this.title = title;
    formatter = mode.getFormatter(this);
    slime = title.startsWith("slime ");
  }

  public final boolean isProlog()
  {
    return true;
  }

  private void setResetCommand(String s)
  {
    resetCommand = s;
  }

  private void setExitCommand(String s)
  {
    exitCommand = s;
  }

  private static Shell createPrologShell(String shellCommand, String title,
                                       boolean startSlime)
  {

    PrologShell prolog = new PrologShell(shellCommand, title);
    prolog.startProcess();
    prolog.needsRenumbering(true);
    return prolog;
  }

  protected void startProcess()
  {
	  if(true) {
	  BeanShellCntrl.swipl_init_server();
	  return;
	  }
    if (shellCommand == null)
      {
        Debug.bug();
        return;
      }

    startWatcherThread();
    // See if the process exits right away (meaning jpty couldn't launch
    // the shell command).


    try
      {
        Thread.sleep(100);
      }
    catch (InterruptedException e)
      {
        Log.error(e);
      }

    Socket p = null;
    BufferedReader br = null;
    PrintWriter pw = null;

    try
      {
    	 p = new Socket("localhost", 4023);
        stdin  = new OutputStreamWriter(p.getOutputStream());
        stdoutThread = new StdoutThread(p.getInputStream());
        stderrThread = new StderrThread(p.getInputStream());
        stdoutThread.start();
        stderrThread.start();
        readOnly = false;
      }
    catch (Throwable t)
      {
        Log.error(t);
      }
  }

  protected void initializeHistory()
  {
    history = new History("prolog.history", 30);
  }

  public void enter()
  {
    if (!checkProcess())
      return;
    final Editor editor = Editor.currentEditor();
    Position dot = editor.getDotCopy();
    if (dot == null)
      return;
    if (needsRenumbering)
      renumber();
    final Line dotLine = dot.getLine();
    final Position endOfOutput = getEndOfOutput();
    if (endOfOutput == null)
      {
        // Ignore input before first prompt is displayed.
        dotLine.setText("");
        return;
      }
    if (dot.isBefore(endOfOutput))
      {
        editor.newlineAndIndent();
        return; // For now.
      }
    final Line promptLine = endOfOutput.getLine();
    final boolean atPrompt = (promptRE.getMatch(promptLine.getText()) != null);
    if (atPrompt)
      {
        Annotation a = new Annotation(endOfOutput.getOffset());
        promptLine.setAnnotation(a);
        promptLine.setFlags(STATE_PROMPT);
      }
    Position end = getEnd();
    Position pos = LispMode.findContainingSexp(end);
    boolean isComplete = (pos == null || pos.isBefore(endOfOutput));
    if (isComplete)
      {
        // Complete sexp.
        editor.eob();
        if (atPrompt)
          {
            editor.insertLineSeparator();
            editor.getDotLine().setFlags(0);
          }
      }
    else
      {
        // Not complete; multiline input.
        editor.newline();
        editor.getDotLine().setFlags(STATE_INPUT);
      }
    if (needsRenumbering)
      renumber();
    editor.moveCaretToDotCol();
    editor.getDisplay().setReframe(-2);
    resetUndo();
    stripEcho = true;
    if (isComplete)
      {
        // No containing sexp. Send input to prolog process.
        Position begin = endOfOutput;
        end = editor.getDotCopy();
        end.setOffset(end.getLineLength());
        setEndOfOutput(end);
        Line lineBeforeLastPrompt = promptLine.previous();
        if (lineBeforeLastPrompt != null)
          {
            posBeforeLastPrompt =
              new Position(lineBeforeLastPrompt,
                           lineBeforeLastPrompt.length());
          }
        posEndOfInput = end.copy();
        String s = new Region(this, begin, end).toString();
        sendInputToProlog(s);
      }
    else
      indentLineAtDot(editor);
  }

  public void electricCloseParen()
  {
    final Editor editor = Editor.currentEditor();
    editor.closeParen();
    Position dot = editor.getDotCopy();
    if (dot == null)
      return;
    if (needsRenumbering)
      renumber();
    final Position endOfOutput = getEndOfOutput();
    if (endOfOutput == null)
      return;
    if (dot.isBefore(endOfOutput))
      return;
    final Line promptLine = endOfOutput.getLine();
    final boolean atPrompt = (promptRE.getMatch(promptLine.getText()) != null);
    Position end = getEnd();
    if (dot.isBefore(end))
      return;
    Position pos = LispMode.findContainingSexp(end);
    boolean isComplete = (pos == null || pos.isBefore(endOfOutput));
    if (isComplete)
      {
        // Complete sexp.
        if (atPrompt)
          {
            Annotation a = new Annotation(endOfOutput.getOffset());
            promptLine.setAnnotation(a);
            promptLine.setFlags(STATE_PROMPT);
          }
        editor.eob();
        if (atPrompt)
          {
            editor.insertLineSeparator();
            editor.getDotLine().setFlags(0);
          }
      }
    if (needsRenumbering)
      renumber();
    editor.moveCaretToDotCol();
    editor.getDisplay().setReframe(-2);
    resetUndo();
    stripEcho = true;
    if (isComplete)
      {
        // No containing sexp. Send input to prolog process.
        Position begin = endOfOutput;
        end = editor.getDotCopy();
        end.setOffset(end.getLineLength());
        setEndOfOutput(end);
        Line lineBeforeLastPrompt = promptLine.previous();
        if (lineBeforeLastPrompt != null)
          {
            posBeforeLastPrompt =
              new Position(lineBeforeLastPrompt,
                           lineBeforeLastPrompt.length());
          }
        posEndOfInput = end.copy();
        String s = new Region(this, begin, end).toString();
        sendInputToProlog(s);
      }
  }

  public void resetProlog()
  {
    if (resetCommand != null)
      {
        Position pos = getEnd();
        insertString(pos, resetCommand.concat("\n"));
        if (needsRenumbering())
          renumber();
        enforceOutputLimit(Property.SHELL_OUTPUT_LIMIT);
        posEndOfInput = pos.copy();
        send(resetCommand);
      }
  }

  public void describe(String s, Editor editor)
  {
    if (s.equals("*"))
      ;
    else if (s.startsWith("(") || s.startsWith("#p"))
      ;
    else
      s = "'" + s;
    String command = "(cl:describe " + s + ")\n";
    Position pos = getEnd();
    insertString(pos, command);
    editor.moveDotTo(pos);
    if (needsRenumbering())
      renumber();
    enforceOutputLimit(Property.SHELL_OUTPUT_LIMIT);
    posEndOfInput = pos.copy();
    sendInputToProlog(command);
  }

  protected void stdOutUpdate(final String s)
  {
    String prompt;
    int index = s.lastIndexOf('\n');
    if (index >= 0)
      prompt = s.substring(index + 1);
    else
      prompt = s;
    final REMatch match = promptRE.getMatch(prompt);
    if (match != null)
      {
        // Last line of output looks like a prompt.
        String m = match.toString();
        if (prompt.startsWith(m))
          {
            if (prompt.substring(m.length()).startsWith(m))
              {
                // Double prompt. Remove one of them.
                prompt = prompt.substring(m.length());
              }
          }
      }
    final String output;
    if (index >= 0)
      output = s.substring(0, index + 1) + prompt;
    else
      output = prompt;
    Runnable r = new Runnable()
      {
        public void run()
        {
          Position pos = getEnd();
          if (pos != null)
            pos.getLine().setFlags(0); // This value will propagate.
          if (output.length() > 0)
            {
              appendString(output);
              if (match != null)
                {
                  Line lineBeforeLastPrompt =
                    getEnd().getLine().previous();
                  if (lineBeforeLastPrompt != null)
                    {
                      posBeforeLastPrompt =
                        new Position(lineBeforeLastPrompt,
                                     lineBeforeLastPrompt.length());
                    }
                }
            }
          if (isBusy())
            setBusy(false);
          updateDisplayInAllFrames();
          resetUndo();
        }
      };
    SwingUtilities.invokeLater(r);
  }

  protected void stdErrUpdate(final String s)
  {
    Runnable r = new Runnable()
      {
        public void run()
        {
          appendString(s);
          if (isBusy())
            setBusy(false);
          updateDisplayInAllFrames();
          resetUndo();
        }
      };
    SwingUtilities.invokeLater(r);
  }

  protected void appendString(String s)
  {
    try
      {
        lockWrite();
      }
    catch (InterruptedException e)
      {
        Log.error(e);
        return;
      }
    try
      {
        if (slime)
          {
            final Position pos;
            if (posBeforeLastPrompt != null && posBeforeLastPrompt.getNextLine() != null)
              {
                // prompt is still in the buffer
                Position posLastPrompt =
                  new Position(posBeforeLastPrompt.getNextLine(), 0);
                if (posEndOfInput != null && posEndOfInput.isAfter(posLastPrompt))
                  {
                    // there has been user input since the last prompt
                    pos = getEnd();
                  }
                else
                  {
                    pos = posBeforeLastPrompt;
                  }
              }
            else
              {
                posBeforeLastPrompt = null;
                posEndOfInput = null;
                pos = getEnd();
              }
            if (pos != null)
              {
                if (pos == posBeforeLastPrompt)
                  {
                    if (s.length() > 0)
                      {
                        if (s.charAt(s.length() - 1) == '\n')
                          s = s.substring(0, s.length() - 1);
                      }
                    if (s.length() > 0 && s.charAt(0) != '\n')
                      insertLineSeparator(pos);
                  }
                insertString(pos, s);
                if (needsRenumbering())
                  renumber();
                enforceOutputLimit(Property.SHELL_OUTPUT_LIMIT);
                if (pos != posBeforeLastPrompt)
                  setEndOfOutput(pos.copy());
              }
            else
              {
                // empty buffer
                setText(s);
                setEndOfOutput(getEnd().copy());
              }
          }
        else
          {
            // no slime
            Position pos = getEnd();
            if (pos != null)
              {
                insertString(pos, s);
                if (needsRenumbering())
                  renumber();
                enforceOutputLimit(Property.SHELL_OUTPUT_LIMIT);
                setEndOfOutput(pos.copy());
              }
            else
              {
                setText(s);
                setEndOfOutput(getEnd().copy());
              }
          }
      }
    finally
      {
        unlockWrite();
      }
  }

  private void indentLineAtDot(Editor editor)
  {
    final Line dotLine = editor.getDotLine();
    if (dotLine.length() > 0)
      return;
    try
      {
        lockWrite();
      }
    catch (InterruptedException e)
      {
        Log.error(e);
        return;
      }
    try
      {
        getFormatter().parseBuffer();
        int indent = mode.getCorrectIndentation(dotLine, this);
        if (indent != getIndentation(dotLine))
          {
            editor.addUndo(SimpleEdit.LINE_EDIT);
            setIndentation(dotLine, indent);
            dotLine.setFlags(STATE_INPUT);
            modified();
          }
        if (dotLine.length() > 0)
          {
            editor.moveDotToIndentation();
            editor.moveCaretToDotCol();
          }
        else
          {
            final Display display = editor.getDisplay();
            display.setCaretCol(indent - display.getShift());
            if (getBooleanProperty(Property.RESTRICT_CARET))
              editor.fillToCaret();
          }
        resetUndo(); // Why?
      }
    finally
      {
        unlockWrite();
      }
  }

  private void sendInputToProlog(String input)
  {
    // Save history unless input is very short (e.g. ":q"). Ignore
    // whitespace at end of line.
    String trim = input.trim();
    if (trim.length() > 2)
      {
        history.append(trim);
        history.save();
      }
    send(input);
    setBusy(true);
    for (EditorIterator it = new EditorIterator(); it.hasNext();)
      {
        Editor ed = it.nextEditor();
        if (ed.getBuffer() == this)
          ed.setWaitCursor();
      }
  }

  public void dispose()
  {
    if (!checkProcess())
      {
        Log.debug("checkProcess returned false");
        return;
      }
    Thread t = new Thread("PrologShell dispose")
      {
        public void run()
        {
          try
            {
              stdin.write(3);
              stdin.flush();
              stdin.write(exitCommand);
              stdin.write("\n");
              stdin.flush();
              stdin.close();

              final Process p = getProcess();
              if (p != null)
                {
                  p.destroy();
                  p.waitFor();
                }
            }
          catch (IOException e)
            {
              Log.error(e);
            }
          catch (InterruptedException e)
            {
              Log.error(e);
            }
        }
      };
    t.setPriority(Thread.MIN_PRIORITY);
    t.setDaemon(true);
    t.start();
  }

  public File getCurrentDirectory()
  {
    return currentDirectory;
  }

  public File getCompletionDirectory()
  {
    return currentDirectory;
  }

  public String getFileNameForDisplay()
  {
    return title;
  }

  public String toString()
  {
    return title;
  }

  public static void prolog()
  {
    prolog(null, "swipl", false, false);
  }

  public static void prolog(String shellCommand)
  {
    // Require jpty on Unix platforms.
    prolog(shellCommand, shellCommand, Platform.isPlatformUnix(), false);
  }

  private static void prolog(String shellCommand, String title,
                           boolean requireJpty, boolean startSlime)
  {
    if (requireJpty && !Utilities.haveJpty())
      {
        MessageDialog.showMessageDialog(JPTY_NOT_FOUND, "Error");
        return;
      }
    if (Platform.isPlatformWindows())
      if (!Platform.isPlatformWindows5())
        return;
    final Editor editor = Editor.currentEditor();
    // Look for an existing PrologShell buffer with the same shell command.
    Buffer buf = findProlog(title);
    if (buf == null)
      {
        editor.setWaitCursor();
        buf = createPrologShell(shellCommand, title, startSlime);
        if (buf != null)
          buf.setBusy(true);
        editor.setDefaultCursor();
      }
    else
      startSlime = false; // Already started.
    if (buf != null)
      {
        editor.makeNext(buf);
        Buffer b = editor.getBuffer();
        if (b != null && b.isPaired())
          editor.switchToBuffer(buf);
        else
          editor.activate(buf);

      }
  }

  public static CommandInterpreter findProlog(String title)
  {
    for (BufferIterator it = new BufferIterator(); it.hasNext();)
      {
        Buffer b = it.nextBuffer();
        if (b instanceof CommandInterpreter)
          {
            CommandInterpreter comint = (CommandInterpreter) b;
            if (comint.isProlog())
              {
                if (title == null || title.equals(comint.getTitle()))
                  return comint;
              }
          }
      }
    return null;
  }


}
