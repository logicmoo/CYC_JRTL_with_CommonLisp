/*
 * Interpreter.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Interpreter.java,v 1.4 2003-01-28 01:41:06 piso Exp $
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
import java.io.OutputStream;

public final class Interpreter extends Lisp
{
    // There can only be one interpreter.
    public static Interpreter interpreter;

    public static boolean initialized;

    private final boolean jlisp;

    public static synchronized Interpreter getInstance()
    {
        return interpreter;
    }

    public static synchronized Interpreter createInstance()
    {
        if (interpreter != null)
            return null;
        return interpreter = new Interpreter();
    }

    public static synchronized Interpreter createInstance(InputStream in,
        OutputStream out, String initialDirectory)
    {
        if (interpreter != null)
            return null;
        return interpreter = new Interpreter(in, out, initialDirectory);
    }

    private final InputStream inputStream;
    private final Environment environment = new Environment();

    private Interpreter()
    {
        inputStream = System.in;
        CharacterOutputStream out = new CharacterOutputStream(System.out);
        _STANDARD_OUTPUT_.setSymbolValue(out);
        _ERROR_OUTPUT_.setSymbolValue(out);
        _TRACE_OUTPUT_.setSymbolValue(out);
        jlisp = false;
    }

    private Interpreter(InputStream inputStream, OutputStream outputStream,
        String initialDirectory)
    {
        this.inputStream = inputStream;
        CharacterOutputStream out = new CharacterOutputStream(outputStream);
        _STANDARD_OUTPUT_.setSymbolValue(out);
        _ERROR_OUTPUT_.setSymbolValue(out);
        _TRACE_OUTPUT_.setSymbolValue(out);
        _DEFAULT_PATHNAME_DEFAULTS_.setSymbolValue(
            new LispString(initialDirectory));
        jlisp = true;
    }

    public static synchronized void initialize(boolean jlisp)
    {
        if (!initialized) {
            try {
                Load._load("boot.lisp", true, false);
                if (jlisp)
                    Load._load("j.lisp", true, false);
            }
            catch (Throwable t) {
                t.printStackTrace();
            }
            initialized = true;
        }
    }

    private boolean done = false;

    public void run()
    {
        Debug.assertTrue(inputStream != null);
        LispReader reader = new LispReader(inputStream);
        done = false;
        try {
            CharacterOutputStream out = getStandardOutput();
            out.writeString(banner());
            initialize(jlisp);
            while (true) {
                try {
                    out.writeString(prompt());
                    out.finishOutput();
                    LispObject obj = reader.readObject(false); // Top level read.
                    if (obj == EOF)
                        break;
                    out.setCharPos(0);
                    resetStack();
                    LispObject result = eval(obj, environment);
                    if (done)
                        return;
                    out = getStandardOutput();
                    out.freshLine();
                    checkStack();
                    LispObject[] values = getValues();
                    if (values != null) {
                        for (int i = 0; i < values.length; i++)
                            out.writeLine(String.valueOf(values[i]));
                    } else
                        out.writeLine(String.valueOf(result));
                }
                catch (StackOverflowError e) {
                    out.writeLine("Stack overflow");
                }
                catch (LispException e) {
                    String message = e.getMessage();
                    if (message != null)
                        out.writeLine("Error: " + e.getMessage() + ".");
                    else
                        out.writeLine("Error");
                    backtrace();
                }
                catch (Throwable t) {
                    out.printStackTrace(t);
                    backtrace();
                }
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void kill()
    {
        done = true;
    }

    public synchronized void dispose()
    {
        Debug.trace("Interpreter.dispose");
        Debug.assertTrue(interpreter == this);
        interpreter = null;
    }

    protected void finalize() throws Throwable
    {
        System.err.println("Interpreter.finalize");
    }

    // Used only by JLisp.runStartupScript() and JLisp.runLispCommand().
    public static LispObject evaluate(String s) throws LispException
    {
        LispReader reader = new LispReader(s);
        // Use readObject(false) here to simulate top level.
        LispObject obj = reader.readObject(false);
        if (obj == EOF)
            throw new EndOfFileException();
        return eval(obj, new Environment());
    }

    // Used only by the JUnit test suite (Tests.java).
    public static final String ERROR = "Error";

    // Used only by the JUnit test suite (Tests.java).
    public static String evalString(String s)
    {
        LispReader reader = new LispReader(s);
        StringBuffer sb = new StringBuffer();
        while (true) {
            try {
                // Use readObject(false) here to simulate top level.
                LispObject obj = reader.readObject(false);
                if (obj == EOF)
                    break;
                LispObject result = eval(obj, new Environment());
                LispObject[] values = getValues();
                if (values != null) {
                    for (int i = 0; i < values.length; i++) {
                        if (i > 0)
                            sb.append(", ");
                        sb.append(String.valueOf(values[i]));
                    }
                } else
                    sb.append(String.valueOf(result));
            }
            catch (Exception e) {
                return ERROR;
            }
        }
        return sb.toString();
    }

    private static final String build;

    static {
        String s = null;
        InputStream in = Interpreter.class.getResourceAsStream("build");
        if (in != null) {
            try {
                BufferedReader reader =
                    new BufferedReader(new InputStreamReader(in));
                s = reader.readLine();
                reader.close();
            }
            catch (IOException e) {}
        }
        build = s;
    }

    private static String banner()
    {
        final String sep = System.getProperty("line.separator");
        StringBuffer sb = new StringBuffer("Armed Bear Lisp ");
        sb.append(Version.getVersion());
        if (build != null) {
            sb.append(" (built ");
            sb.append(build);
            sb.append(')');
        }
        sb.append(sep);
        sb.append("Java ");
        sb.append(System.getProperty("java.version"));
        sb.append(' ');
        sb.append(System.getProperty("java.vendor"));
        sb.append(sep);
        String vm = System.getProperty("java.vm.name");
        if (vm != null) {
            sb.append(vm);
            sb.append(sep);
        }
        return sb.toString();
    }

    private static String prompt()
    {
        Package pkg = (Package) _PACKAGE_.getSymbolValue();
        String pkgName = pkg.getNickname();
        if (pkgName == null)
            pkgName = pkg.getName();
        return pkgName + "> ";
    }
}
