// Git.java
//
// Copyright (C) 2009 Peter Graves
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

package org.armedbear.j;

import java.util.List;
import javax.swing.SwingUtilities;

public class Git implements Constants
{
  public static void git()
  {
    git("");
  }

  public static void git(String s)
  {
    if (!checkGitInstalled())
      return;
    final Editor editor = Editor.currentEditor();
    editor.setWaitCursor();
    List args = Utilities.tokenize(s);
    String arg;
    FastStringBuffer sb = new FastStringBuffer("git ");
    for (int i = 0; i < args.size(); i++)
      {
        arg = (String) args.get(i);
        sb.append(maybeQuote(arg));
        sb.append(' ');
      }
    if (sb.toString().equals("git diff "))
      {
        Log.debug("git diff");
        File file = editor.getBuffer().getFile();
        if (file != null)
          sb.append(file.getName());
      }
    final String cmd = sb.toString().trim();
    final Buffer parentBuffer = editor.getBuffer();
    Runnable commandRunnable = new Runnable()
      {
        public void run()
        {
          final String output =
            command(cmd, editor.getCurrentDirectory());
          Runnable completionRunnable = new Runnable()
            {
              public void run()
              {
                gitCompleted(editor, parentBuffer, cmd, output);
              }
            };
          SwingUtilities.invokeLater(completionRunnable);
        }
      };
    new Thread(commandRunnable).start();
  }

  private static void gitCompleted(Editor editor, Buffer parentBuffer,
                                     String cmd, String output)
  {
    if (output != null && output.length() > 0)
      {
        Buffer buf;
        if (cmd.startsWith("git diff"))
          buf = new DiffOutputBuffer(parentBuffer, output, VC_GIT);
        else
          buf = OutputBuffer.getOutputBuffer(output);
        buf.setTitle(cmd);
        editor.makeNext(buf);
        editor.activateInOtherWindow(buf);
      }
  }

  // implementation
  private static final String command(String cmd, File workingDirectory)
  {
    ShellCommand shellCommand = new ShellCommand(cmd, workingDirectory);
    shellCommand.run();
    return shellCommand.getOutput();
  }

  private static boolean checkGitInstalled()
  {
    if (haveGit())
      return true;
    MessageDialog.showMessageDialog(
      "The git command-line client does not appear to be in your PATH.",
      "Error");
    return false;
  }

  private static int haveGit = -1;

  private static boolean haveGit()
  {
    if (haveGit > 0)
      return true;
    if (Utilities.have("git"))
      {
        haveGit = 1; // cache positive result
        return true;
      }
    return false;
  }

  // enclose string in quotes if it contains any embedded spaces
  private static String maybeQuote(String s)
  {
    if (s.indexOf(' ') < 0)
      return s;
    FastStringBuffer sb = new FastStringBuffer('"');
    sb.append(s);
    sb.append('"');
    return sb.toString();
  }
}
