/*
 * Darcs.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: Darcs.java,v 1.1 2005-10-06 10:33:53 piso Exp $
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
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.j;

import gnu.regexp.RE;
import gnu.regexp.REMatch;
import gnu.regexp.UncheckedRE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.undo.CompoundEdit;

public class Darcs implements Constants
{
    public static void darcs()
    {
        darcs("");
    }

    public static void darcs(String s)
    {
        if (!checkDarcsInstalled())
            return;
        final Editor editor = Editor.currentEditor();
        editor.setWaitCursor();
        List args = Utilities.tokenize(s);
        FastStringBuffer sb = new FastStringBuffer("darcs ");
        for (Iterator it = args.iterator(); it.hasNext();) {
            String arg = (String) it.next();
            if (arg.equals("%")) {
                File file = editor.getBuffer().getFile();
                if (file != null)
                    arg = file.canonicalPath();
            }
            sb.append(maybeQuote(arg));
            sb.append(' ');
        }
        final String cmd = sb.toString().trim();
        final Buffer parentBuffer = editor.getBuffer();
        Runnable commandRunnable = new Runnable() {
            public void run()
            {
                final String output =
                    command(cmd, editor.getCurrentDirectory());
                Runnable completionRunnable = new Runnable() {
                    public void run()
                    {
                        darcsCompleted(editor, parentBuffer, cmd, output);
                    }
                };
                SwingUtilities.invokeLater(completionRunnable);
            }
        };
        new Thread(commandRunnable).start();
    }

    private static void darcsCompleted(Editor editor, Buffer parentBuffer,
        String cmd, String output)
    {
        if (output != null && output.length() > 0) {
            Buffer buf;
            if (cmd.startsWith("darcs whatsnew"))
                buf = new DiffOutputBuffer(parentBuffer, output, VC_DARCS);
            else
                buf = OutputBuffer.getOutputBuffer(output);
            buf.setTitle(cmd);
            editor.makeNext(buf);
            editor.activateInOtherWindow(buf);
        }
    }

    // Implementation.
    private static final String command(String cmd, File workingDirectory)
    {
        ShellCommand shellCommand = new ShellCommand(cmd, workingDirectory);
        shellCommand.run();
        return shellCommand.getOutput();
    }

    private static boolean checkDarcsInstalled()
    {
        if (haveDarcs())
            return true;
        MessageDialog.showMessageDialog(
            "The darcs command-line client does not appear to be in your PATH.",
            "Error");
        return false;
    }

    private static int haveDarcs = -1;

    private static boolean haveDarcs()
    {
        if (haveDarcs > 0)
            return true;
        if (Utilities.have("darcs")) {
            haveDarcs = 1; // Cache positive result.
            return true;
        }
        return false;
    }

    // Enclose string in quotes if it contains any embedded spaces.
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
