/*
 * ShellCommand.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: ShellCommand.java,v 1.2 2002-10-02 18:16:19 piso Exp $
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

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public final class ShellCommand implements Runnable
{
    private String cmdline;
    private String input;
    private StringBuffer sb = new StringBuffer();
    private int exitValue = -1;

    public ShellCommand(String cmdline)
    {
        this.cmdline = cmdline;
    }

    public ShellCommand(String cmdline, String input)
    {
        this.cmdline = cmdline;
        this.input = input;
    }

    public final String getOutput()
    {
        return sb.toString();
    }

    public final int exitValue()
    {
        return exitValue;
    }

    private void appendOutput(String s)
    {
        sb.append(s);
    }

    public void run()
    {
        Process process = null;

        try {
            if (cmdline != null) {
                if (Platform.isPlatformUnix()) {
                    String[] cmdarray = {"/bin/sh", "-c", cmdline};
                    process = Runtime.getRuntime().exec(cmdarray);
                } else if (Platform.isPlatformWindows()) {
                    ArrayList list = new ArrayList();
                    list.add("cmd.exe");
                    list.add("/c");
                    list.addAll(Utilities.tokenize(cmdline));
                    final int size = list.size();
                    String[] cmdarray = new String[size];
                    for (int i = 0; i < size; i++)
                        cmdarray[i] = (String) list.get(i);
                    process = Runtime.getRuntime().exec(cmdarray);
                }
            }
        }
        catch (IOException e) {
            Log.error(e);
        }

        if (process != null) {
            ShellCommandReaderThread stdoutThread =
                new ShellCommandReaderThread(process.getInputStream());
            stdoutThread.start();
            ShellCommandReaderThread stderrThread =
                new ShellCommandReaderThread(process.getErrorStream());
            stderrThread.start();
            if (input != null) {
                BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
                try {
                    writer.write(input);
                    writer.flush();
                    writer.close();
                }
                catch (IOException e) {
                    Log.error(e);
                }
            }
            try {
                exitValue = process.waitFor();
            }
            catch (InterruptedException e) {
                Log.error(e);
            }
            try {
                stdoutThread.join();
            }
            catch (InterruptedException e) {
                Log.error(e);
            }
            try {
                stderrThread.join();
            }
            catch (InterruptedException e) {
                Log.error(e);
            }
        }
    }

    private class ShellCommandReaderThread extends ReaderThread
    {
        // If this constructor is private, we run into jikes 1.15 bug #2256.
        ShellCommandReaderThread(InputStream inputStream)
        {
            super(inputStream);
        }

        public void update(final String s)
        {
            appendOutput(s);
        }
    }

    public static void shellCommand()
    {
        if (Platform.isPlatformWindows() && !Platform.isPlatformWindows5())
            return;
        final Editor editor = Editor.currentEditor();
        InputDialog d = new InputDialog(editor, "Command:", "Shell Command", null);
        d.setHistory(new History("shellCommand.command"));
        editor.centerDialog(d);
        d.show();
        String command = d.getInput();
        if (command == null)
            return;
        command = command.trim();
        if (command.length() == 0)
            return;
        shellCommand(editor, command);
    }

    public static void shellCommand(String command)
    {
        if (Platform.isPlatformWindows() && !Platform.isPlatformWindows5())
            return;
        shellCommand(Editor.currentEditor(), command);
    }

    private static void shellCommand(Editor editor, String command)
    {
        final File dir = editor.getCurrentDirectory();
        if (dir == null || !dir.isDirectory())
            return;
        String cmdline = "(\\cd " + dir.canonicalPath() + " && " + command + ")";
        ShellCommand shellCommand = new ShellCommand(cmdline);
        shellCommand.run();
        String output = shellCommand.getOutput();
        if (output != null && output.length() > 0) {
            OutputBuffer buf = OutputBuffer.getOutputBuffer(output);
            if (buf != null) {
                buf.setTitle(command);
                editor.makeNext(buf);
                editor.activateInOtherWindow(buf);
            }
        }
    }
}
