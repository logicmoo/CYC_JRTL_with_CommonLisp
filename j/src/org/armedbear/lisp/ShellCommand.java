/*
 * ShellCommand.java
 *
 * Copyright (C) 2000-2004 Peter Graves
 * $Id: ShellCommand.java,v 1.2 2004-02-23 00:09:55 piso Exp $
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

package org.armedbear.lisp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public final class ShellCommand extends Lisp implements Runnable
{
    private final String command;
    private final String directory;
    private final StringBuffer output = new StringBuffer();

    private int exitValue = -1;

    private ShellCommand(String command, String directory)
        throws ConditionThrowable
    {
        this.command = command;
        this.directory = directory;
    }

    private final String getOutput()
    {
        return output.toString();
    }

    private final int exitValue()
    {
        return exitValue;
    }

    private void appendOutput(String s)
    {
        output.append(s);
    }

    public void run()
    {
        Process process = null;
        try {
            if (command != null) {
                if (Utilities.isPlatformUnix()) {
                    if (directory != null) {
                        StringBuffer sb = new StringBuffer("\\cd \"");
                        sb.append(directory);
                        sb.append("\" && ");
                        sb.append(command);
                        String[] cmdarray = {"/bin/sh", "-c", sb.toString()};
                        process = Runtime.getRuntime().exec(cmdarray);
                    } else {
                        String[] cmdarray = {"/bin/sh", "-c", command};
                        process = Runtime.getRuntime().exec(cmdarray);
                    }
                } else if (Utilities.isPlatformWindows()) {
                    ArrayList list = new ArrayList();
                    list.add("cmd.exe");
                    list.add("/c");
                    if (directory != null) {
                        StringBuffer sb = new StringBuffer("cd /d \"");
                        sb.append(directory);
                        sb.append("\" && ");
                        sb.append(command);
                        list.addAll(tokenize(sb.toString()));
                    } else
                        list.addAll(tokenize(command));
                    final int size = list.size();
                    String[] cmdarray = new String[size];
                    for (int i = 0; i < size; i++)
                        cmdarray[i] = (String) list.get(i);
                    process = Runtime.getRuntime().exec(cmdarray);
                }
            }
        }
        catch (IOException e) {
            Debug.trace(e);
        }
        if (process != null) {
            ReaderThread stdoutThread =
                new ReaderThread(process.getInputStream());
            stdoutThread.start();
            ReaderThread stderrThread =
                new ReaderThread(process.getErrorStream());
            stderrThread.start();
            try {
                exitValue = process.waitFor();
            }
            catch (InterruptedException e) {
                Debug.trace(e);
            }
            try {
                stdoutThread.join();
            }
            catch (InterruptedException e) {
                Debug.trace(e);
            }
            try {
                stderrThread.join();
            }
            catch (InterruptedException e) {
                Debug.trace(e);
            }
        }
    }

    // Does not handle embedded single-quoted strings.
    private static List tokenize(String s)
    {
        ArrayList list = new ArrayList();
        StringBuffer sb = new StringBuffer();
        boolean inQuote = false;
        final int limit = s.length();
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            switch (c) {
                case ' ':
                    if (inQuote)
                        sb.append(c);
                    else if (sb.length() > 0) {
                        list.add(sb.toString());
                        sb.setLength(0);
                    }
                    break;
                case '"':
                    if (inQuote) {
                        if (sb.length() > 0) {
                            list.add(sb.toString());
                            sb.setLength(0);
                        }
                        inQuote = false;
                    } else
                        inQuote = true;
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        if (sb.length() > 0)
            list.add(sb.toString());
        return list;
    }

    private class ReaderThread extends Thread
    {
        private char[] buf = new char[4096];
        private final InputStream inputStream;
        private final BufferedReader reader;
        private boolean done = false;

        public ReaderThread(InputStream inputStream)
        {
            this.inputStream = inputStream;
            reader = new BufferedReader(new InputStreamReader(inputStream));
        }

        public void run()
        {
            while (!done) {
                String s = read();
                if (s == null)
                    return;
                appendOutput(s);
            }
        }

        private String read()
        {
            StringBuffer sb = new StringBuffer();
            try {
                do {
                    int numChars = reader.read(buf, 0, buf.length); // Blocks.
                    if (numChars < 0) {
                        done = true;
                        break;
                    }
                    if (numChars > 0)
                        sb.append(buf, 0, numChars);
                    Thread.sleep(10);
                } while (reader.ready());
            }
            catch (IOException e) {
                return null;
            }
            catch (InterruptedException e) {
                return null;
            }
            catch (Throwable t) {
                return null;
            }
            return sb.toString();
        }
    }

    // run-shell-command command &key :output
    // ### %run-shell-command command directory output => exit-code
    private static final Primitive _RUN_SHELL_COMMAND =
        new Primitive("%run-shell-command", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 3)
                signal(new WrongNumberOfArgumentsException(this));
            String command = args[0].getStringValue();
            LispObject directory = args[1];
            LispObject output = args[2];
            String namestring = null;
            Stream outputStream = null;
            if (directory != NIL) {
                Pathname pathname = Pathname.coerceToPathname(directory);
                namestring = pathname.getNamestring();
                if (namestring == null) {
                    return signal(new SimpleError("Pathname has no namestring: " +
                                                  pathname));
                }
            }
            if (output != NIL)
                outputStream = checkStream(output);
            ShellCommand shellCommand = new ShellCommand(command, namestring);
            shellCommand.run();
            if (outputStream != null)
                outputStream._writeString(shellCommand.getOutput());
            return number(shellCommand.exitValue());
        }
    };
}
