/*
 * Interpreter.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Interpreter.java,v 1.65 2004-05-11 20:02:55 piso Exp $
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
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;

public final class Interpreter extends Lisp
{
    // There can only be one interpreter.
    public static Interpreter interpreter;

    private static int commandNumber;

    private final boolean jlisp;
    private final InputStream inputStream;
    private final OutputStream outputStream;

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

    private final Environment environment = new Environment();

    private Interpreter()
    {
        jlisp = false;
        inputStream = null;
        outputStream = null;
    }

    private Interpreter(InputStream inputStream, OutputStream outputStream,
                        String initialDirectory)
    {
        jlisp = true;
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        resetIO(new Stream(inputStream, Symbol.CHARACTER),
                new Stream(outputStream, Symbol.CHARACTER));
    }

    private static boolean lispInitialized;

    public static synchronized void initializeLisp(boolean jlisp)
    {
        if (!lispInitialized) {
            try {
                if (jlisp) {
                    _FEATURES_.setSymbolValue(new Cons(Keyword.J,
                                                       _FEATURES_.getSymbolValue()));
                }
                Load.loadSystemFile("boot.lisp", false, false, false);
                if (jlisp) {
                    Class.forName("org.armedbear.j.LispAPI");
                    Load.loadSystemFile("j.lisp");
                }
            }
            catch (ConditionThrowable c) {
                reportError(c, LispThread.currentThread());
            }
            catch (Throwable t) {
                t.printStackTrace();
            }
            lispInitialized = true;
        }
    }

    private static boolean topLevelInitialized;

    private static synchronized void initializeTopLevel()
    {
        if (!topLevelInitialized) {
            try {
                // Resolve top-level-loop autoload.
                Symbol TOP_LEVEL_LOOP = intern("TOP-LEVEL-LOOP", PACKAGE_TPL);
                LispObject tplFun = TOP_LEVEL_LOOP.getSymbolFunction();
                if (tplFun instanceof Autoload) {
                    Autoload autoload = (Autoload) tplFun;
                    autoload.load();
                }
                _LOAD_VERBOSE_.setSymbolValue(T);
                do {
                    String userHome = System.getProperty("user.home");
                    File file = new File(userHome, ".abclrc");
                    if (file.isFile()) {
                        Load.load(file.getCanonicalPath());
                        break;
                    }
                    if (Utilities.isPlatformWindows()) {
                        file = new File("C:\\.abclrc");
                        if (file.isFile()) {
                            Load.load(file.getCanonicalPath());
                            break;
                        }
                    }
                    file = new File(userHome, ".ablrc");
                    if (file.isFile()) {
                        String message =
                            "Warning: use of .ablrc is deprecated; use .abclrc instead.";
                        getStandardOutput()._writeLine(message);
                        Load.load(file.getCanonicalPath());
                        break;
                    }
                    file = new File(userHome, ".ablisprc");
                    if (file.isFile()) {
                        String message =
                            "Warning: use of .ablisprc is deprecated; use .abclrc instead.";
                        getStandardOutput()._writeLine(message);
                        Load.load(file.getCanonicalPath());
                        break;
                    }
                } while (false);
            }
            catch (Throwable t) {
                t.printStackTrace();
            }
            topLevelInitialized = true;
        }
    }

    private boolean done = false;

    public void run()
    {
        final LispThread thread = LispThread.currentThread();
        commandNumber = 0;
        done = false;
        try {
            Stream out = getStandardOutput();
            out._writeString(banner());
            out._finishOutput();
            if (Utilities.isPlatformUnix()) {
                try {
                    System.loadLibrary("abcl");
                    Class c = Class.forName("org.armedbear.lisp.ControlC");
                    Method m = c.getMethod("initialize", null);
                    m.invoke(null, null);
                    out._writeString("Control-C handler installed.\n");
                }
                catch (Throwable t) {}
            }
            initializeLisp(jlisp);
            initializeTopLevel();
            Symbol TOP_LEVEL_LOOP = intern("TOP-LEVEL-LOOP", PACKAGE_TPL);
            LispObject tplFun = TOP_LEVEL_LOOP.getSymbolFunction();
            if (tplFun instanceof Function) {
                funcall0(tplFun, thread);
                return;
            }
            while (true) {
                try {
                    thread.resetStack();
                    thread.setDynamicEnvironment(null);
                    ++commandNumber;
                    out._writeString(prompt());
                    out._finishOutput();
                    LispObject
                        object = getStandardInput().read(false, EOF, false); // Top level read.
                    if (object == EOF)
                        break;
                    out.setCharPos(0);
                    Symbol.MINUS.setSymbolValue(object);
                    LispObject result = eval(object, environment, thread);
                    Debug.assertTrue(result != null);
                    Symbol.STAR_STAR_STAR.setSymbolValue(Symbol.STAR_STAR.getSymbolValue());
                    Symbol.STAR_STAR.setSymbolValue(Symbol.STAR.getSymbolValue());
                    Symbol.STAR.setSymbolValue(result);
                    Symbol.PLUS_PLUS_PLUS.setSymbolValue(Symbol.PLUS_PLUS.getSymbolValue());
                    Symbol.PLUS_PLUS.setSymbolValue(Symbol.PLUS.getSymbolValue());
                    Symbol.PLUS.setSymbolValue(Symbol.MINUS.getSymbolValue());
                    if (done)
                        return;
                    out = getStandardOutput();
                    out.freshLine();
                    thread.checkStack();
                    LispObject[] values = thread.getValues();
                    Symbol.SLASH_SLASH_SLASH.setSymbolValue(Symbol.SLASH_SLASH.getSymbolValue());
                    Symbol.SLASH_SLASH.setSymbolValue(Symbol.SLASH.getSymbolValue());
                    if (values != null) {
                        LispObject slash = NIL;
                        for (int i = values.length; i-- > 0;)
                            slash = new Cons(values[i], slash);
                        Symbol.SLASH.setSymbolValue(slash);
                        for (int i = 0; i < values.length; i++)
                            out._writeLine(values[i].writeToString());
                    } else {
                        Symbol.SLASH.setSymbolValue(new Cons(result));
                        out._writeLine(result.writeToString());
                    }
                    out._finishOutput();
                }
                catch (StackOverflowError e) {
                    getStandardInput().clearInput();
                    out._writeLine("Stack overflow");
                }
                catch (ConditionThrowable c) {
                    reportError(c, thread);
                }
                catch (Throwable t) {
                    getStandardInput().clearInput();
                    out.printStackTrace(t);
                    thread.backtrace();
                }
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static void reportError(ConditionThrowable c, LispThread thread)
    {
        try {
            getStandardInput().clearInput();
            Stream out = getStandardOutput();
            out.freshLine();
            out._writeLine("Error: unhandled condition: " +
                           c.getCondition().writeToString());
            thread.backtrace();
        }
        catch (Throwable t) {
            ;
        }
    }

    public void kill()
    {
        if (jlisp) {
            try {
                inputStream.close();
            }
            catch (IOException e) {
                Debug.trace(e);
            }
            try {
                outputStream.close();
            }
            catch (IOException e) {
                Debug.trace(e);
            }
        } else
            System.exit(0);
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

    private static final Primitive2 _DEBUGGER_HOOK_FUNCTION =
        new Primitive2("%debugger-hook-function", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            throw new ConditionThrowable((Condition)first);
        }
    };

    // Used only by org.armedbear.j.Editor.executeCommand().
    public static LispObject evaluate(String s) throws ConditionThrowable
    {
        if (!lispInitialized)
            initializeLisp(true);
        StringInputStream stream = new StringInputStream(s);
        LispObject obj = stream.read(false, EOF, false);
        if (obj == EOF)
            return signal(new EndOfFile(stream));
        final LispThread thread = LispThread.currentThread();
        final Environment oldDynEnv = thread.getDynamicEnvironment();
        thread.bindSpecial(_DEBUGGER_HOOK_, _DEBUGGER_HOOK_FUNCTION);
        try {
            return eval(obj, new Environment(), thread);
        }
        finally {
            thread.setDynamicEnvironment(oldDynEnv);
        }
    }

    // Used only by the JUnit test suite (Tests.java).
    public static final String ERROR = "Error";

    // Used only by the JUnit test suite (Tests.java).
    public static String evalString(String s)
    {
        StringInputStream stream = new StringInputStream(s);
        StringBuffer sb = new StringBuffer();
        while (true) {
            try {
                LispObject obj = stream.read(false, EOF, false);
                if (obj == EOF)
                    break;
                final LispThread thread = LispThread.currentThread();
                LispObject result = eval(obj, new Environment(), thread);
                LispObject[] values = thread.getValues();
                if (values != null) {
                    for (int i = 0; i < values.length; i++) {
                        if (i > 0)
                            sb.append(", ");
                        sb.append(values[i].writeToString());
                    }
                } else
                    sb.append(result.writeToString());
            }
            catch (Throwable t) {
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
        StringBuffer sb = new StringBuffer("Armed Bear Common Lisp ");
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
        StringBuffer sb = new StringBuffer();
        sb.append(pkgName);
        sb.append('(');
        sb.append(commandNumber);
        sb.append(")> ");
        return sb.toString();
    }
}
