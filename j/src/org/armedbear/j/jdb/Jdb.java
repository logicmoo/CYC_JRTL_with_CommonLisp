/*
 * Jdb.java
 *
 * Copyright (C) 2000-2003 Peter Graves
 * $Id: Jdb.java,v 1.7 2003-05-12 13:34:01 piso Exp $
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

package org.armedbear.j.jdb;

import com.sun.jdi.AbsentInformationException;
import com.sun.jdi.ArrayReference;
import com.sun.jdi.Field;
import com.sun.jdi.LocalVariable;
import com.sun.jdi.Location;
import com.sun.jdi.Method;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.StackFrame;
import com.sun.jdi.StringReference;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.VMDisconnectedException;
import com.sun.jdi.Value;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.event.LocatableEvent;
import com.sun.jdi.request.ClassPrepareRequest;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.ExceptionRequest;
import com.sun.jdi.request.StepRequest;
import com.sun.jdi.request.ThreadDeathRequest;
import com.sun.jdi.request.ThreadStartRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import org.armedbear.j.Annotation;
import org.armedbear.j.Buffer;
import org.armedbear.j.BufferIterator;
import org.armedbear.j.Editor;
import org.armedbear.j.EditorIterator;
import org.armedbear.j.EditorList;
import org.armedbear.j.File;
import org.armedbear.j.FastStringBuffer;
import org.armedbear.j.JavaSource;
import org.armedbear.j.Line;
import org.armedbear.j.Log;
import org.armedbear.j.Position;
import org.armedbear.j.ReaderThread;
import org.armedbear.j.SimpleEdit;
import org.armedbear.j.Utilities;

public final class Jdb extends Buffer
{
    private JdbSession session;
    private VirtualMachine vm;
    private ThreadReference currentThread;
    private StackFrame currentStackFrame;
    private Location location;
    private String mainClass;
    private String mainClassArgs;
    private String classPath;
    private String javaHome;
    private String javaExecutable;
    private String vmArgs;
    private boolean startSuspended;
    private String sourcePath;
    private JdbControlDialog controlDialog;
    private Position posEndOfBuffer;
    private ArrayList breakpointListeners = new ArrayList();
    private ArrayList contextListeners = new ArrayList();
    private String lastCommand;
    private List breakpoints = new ArrayList();

    public static void jdb()
    {
        final Editor editor = Editor.currentEditor();
        final Buffer buffer = editor.getBuffer();
        Jdb jdb = findJdb();
        if (jdb != null) {
            if (!jdb.equals(buffer)) {
                editor.getFrame().unsplitWindow();
                editor.makeNext(jdb);
                editor.activateInOtherWindow(jdb);
                editor.updateDisplay();
            }
            if (jdb.getVM() != null)
                return; // Debugger is running.
        }
        JdbDialog d = new JdbDialog(editor);
        editor.centerDialog(d);
        d.show();
        editor.getFrame().setWaitCursor();
        editor.repaintNow();
        if (!d.cancelled()) {
            JdbSession session = d.getSession();
            if (jdb != null) {
                jdb.setSession(session);
                jdb.startProcess();
            } else {
                jdb = new Jdb(session);
                if (jdb != null) {
                    editor.getFrame().unsplitWindow();
                    editor.makeNext(jdb);
                    editor.activateInOtherWindow(jdb);
                    jdb.showControlDialog();
                    jdb.startProcess();
                }
            }
        }
        editor.getFrame().setDefaultCursor();
    }

    // To support e.g. Alt X "jdb next".
    public static void jdb(String s)
    {
        JdbCommands.command(s);
    }

    private Jdb(JdbSession session)
    {
        super();
        mode = JdbMode.getMode();
        formatter = mode.getFormatter(this);
        readOnly = true;
        setSession(session);
    }

    public VirtualMachine getVM()
    {
        return vm;
    }

    public void setVM(VirtualMachine vm)
    {
        this.vm = vm;
    }

    public String getMainClass()
    {
        return mainClass;
    }

    public String getMainClassArgs()
    {
        return mainClassArgs;
    }

    public String getClassPath()
    {
        return classPath;
    }

    public String getJavaHome()
    {
        return javaHome;
    }

    public String getJavaExecutable()
    {
        return javaExecutable;
    }

    public boolean getStartSuspended()
    {
        return startSuspended;
    }

    public String getSourcePath()
    {
        return sourcePath;
    }

    public String getLastCommand()
    {
        return lastCommand;
    }

    public void setLocation(Location location)
    {
        this.location = location;
    }

    public void setCurrentThread(ThreadReference threadRef)
    {
        currentThread = threadRef;
    }

    public ThreadReference getCurrentThread()
    {
        return currentThread;
    }

    public boolean isSuspended()
    {
        return currentThread != null;
    }

    public void setCurrentStackFrame(StackFrame stackFrame)
    {
        currentStackFrame = stackFrame;
    }

    public List getBreakpoints()
    {
        return breakpoints;
    }

    public void addBreakpointListener(BreakpointListener listener)
    {
        synchronized(breakpointListeners) {
            breakpointListeners.add(listener);
        }
    }

    public void fireBreakpointChanged()
    {
        synchronized(breakpointListeners) {
            Iterator iter = breakpointListeners.iterator();
            while (iter.hasNext())
                ((BreakpointListener)iter.next()).breakpointChanged();
        }
    }

    public void addContextListener(ContextListener listener)
    {
        synchronized(contextListeners) {
            contextListeners.add(listener);
        }
    }

    public void fireContextChanged()
    {
        synchronized(contextListeners) {
            Iterator iter = contextListeners.iterator();
            while (iter.hasNext())
                ((ContextListener)iter.next()).contextChanged();
        }
    }

    public void initialize()
    {
        // Nothing to do.
    }

    public synchronized int load()
    {
        if (!isLoaded()) {
            try {
                lockWrite();
            }
            catch (InterruptedException e) {
                Log.debug(e);
                return LOAD_FAILED; // Shouldn't happen.
            }
            try {
                appendLine("");
                setLoaded(true);
                posEndOfBuffer = new Position(getFirstLine(), 0);
            }
            finally {
                unlockWrite();
            }
        }
        return LOAD_COMPLETED;
    }

    private void showControlDialog()
    {
        if (controlDialog == null) {
            controlDialog = new JdbControlDialog(this);
            controlDialog.show();
        }
    }

    public JdbControlDialog getControlDialog()
    {
        return controlDialog;
    }

    public void doCommand(String input)
    {
        String s = input.trim();
        String cmd, args;
        int index = s.indexOf(' ');
        if (index >= 0) {
            cmd = s.substring(0, index);
            args = s.substring(index+1).trim();
        } else {
            cmd = s;
            args = null;
        }
        // Command may be abbreviated.
        String command = JdbCommands.findCommand(cmd);
        if (command != null) {
            doCommand(command, args);
            lastCommand = command;
        } else {
            logCommand(cmd);
            log("Command not found");
        }
    }

    public void doCommand(String command, String args)
    {
        if (command.equals("stop")) {
            logCommand("stop", args);
            doStop(args);
        } else if (command.equals("clear")) {
            logCommand("clear", args);
            doClear(args);
        } else if (command.equals("locals")) {
            logCommand("locals");
            doLocals();
        } else if (command.equals("next")) {
            logCommand("next");
            doNext(args);
        } else if (command.equals("print")) {
            logCommand("print", args);
            doPrint(args);
        } else if (command.equals("quit")) {
            logCommand("quit");
            quit();
        } else if (command.equals("restart")) {
            logCommand("restart");
            restart();
        } else if (command.equals("resume")) {
            logCommand("resume");
            doResume();
        } else if (command.equals("stdin")) {
            doStdin(args);
        } else if (command.equals("step")) {
            logCommand("step", args);
            doStep(args);
        } else if (command.equals("suspend")) {
            logCommand("suspend");
            doSuspend();
        }
    }

    private void logCommand(String command)
    {
        log("> ".concat(command));
    }

    private void logCommand(String command, String remainder)
    {
        FastStringBuffer sb = new FastStringBuffer("> ");
        sb.append(command);
        if (remainder != null && remainder.length() > 0) {
            sb.append(' ');
            sb.append(remainder);
        }
        log(sb.toString());
    }

    public void log(String s)
    {
        log(s, true);
    }

    public void log(final String s, final boolean forceNewLine)
    {
        Runnable r = new Runnable() {
            public void run()
            {
                Log.debug(s);
                appendString(s.concat("\n"), forceNewLine);
            }
        };
        if (SwingUtilities.isEventDispatchThread())
            r.run();
        else
            SwingUtilities.invokeLater(r);
    }

    private void appendString(String s, boolean forceNewLine)
    {
        if (forceNewLine && posEndOfBuffer.getOffset() > 0)
            s = "\n".concat(s);
        insertString(posEndOfBuffer, s);
        if (needsRenumbering())
            renumber();
        for (EditorIterator it = new EditorIterator(); it.hasNext();) {
            Editor ed = it.nextEditor();
            if (ed.getBuffer() == this) {
                ed.eob();
                ed.getDisplay().setReframe(-2);
                ed.setUpdateFlag(REPAINT);
                ed.updateDisplay();
            }
        }
    }

    public void printCurrentLocation(LocatableEvent event)
    {
        printCurrentLocation(event.thread(), event.location());
    }

    public void printCurrentLocation(ThreadReference threadRef, Location location)
    {
        FastStringBuffer sb = new FastStringBuffer("[");
        sb.append(threadRef.name());
        sb.append("] ");
        sb.append(location.declaringType().name());
        sb.append('.');
        sb.append(location.method().name());
        try {
            String sourceName = location.sourceName();
            sb.append(" (");
            sb.append(location.sourceName());
            int lineNumber = location.lineNumber();
            if (lineNumber > 0) {
                sb.append(':');
                sb.append(lineNumber);
            }
            sb.append(')');
        }
        catch (AbsentInformationException e) {
            Log.error(e);
        }
        log(sb.toString());
    }

    public void displayRemoteOutput(InputStream inputStream) {
        ReaderThread readerThread = new ReaderThread(inputStream) {
            public void update(final String s)
            {
                Runnable runnable = new Runnable() {
                    public void run()
                    {
                        appendString(s, false);
                    }
                };
                SwingUtilities.invokeLater(runnable);
            }
        };
        readerThread.setPriority(Thread.MAX_PRIORITY-1);
        readerThread.start();
    }

    private void addBreakpoint(ResolvableBreakpoint bp)
    {
        breakpoints.add(bp);
    }

    public void deleteBreakpoint(ResolvableBreakpoint bp)
    {
        breakpoints.remove(bp);
    }

    public static void jdbToggleBreakpoint()
    {
        Jdb jdb = findJdb();
        if (jdb == null)
            return;
        final Editor editor = Editor.currentEditor();
        final Line line = editor.getDotLine();
        Annotation annotation = line.getAnnotation();
        if (annotation instanceof BreakpointAnnotation)
            jdbDeleteBreakpoint();
        else
            jdbSetBreakpoint();
    }

    public static void jdbSetBreakpoint()
    {
        Jdb jdb = findJdb();
        if (jdb == null)
            return;
        final Editor editor = Editor.currentEditor();
        final Buffer buffer = editor.getBuffer();
        final File file = buffer.getFile();
        if (file != null && file.getName().toLowerCase().endsWith(".java")) {
            final Line line = editor.getDotLine();
            FastStringBuffer sb = new FastStringBuffer("stop at ");
            sb.append(file.getName());
            sb.append(':');
            sb.append(line.lineNumber() + 1);
            jdb.logCommand(sb.toString());
            LineNumberBreakpoint bp =
                new LineNumberBreakpoint(jdb, buffer, editor.getDotLine());
            try {
                EventRequest eventRequest = bp.resolveAgainstPreparedClasses();
                if (eventRequest != null) {
                    eventRequest.enable();
                } else {
                    EventRequestManager mgr = jdb.getVM().eventRequestManager();
                    ClassPrepareRequest cpr = mgr.createClassPrepareRequest();
                    String packageName = JavaSource.getPackageName(buffer);
                    String classFilter;
                    if (packageName != null) {
                        classFilter =
                            packageName.concat(".").concat(file.getName());
                    } else {
                        classFilter = file.getName();
                    }
                    if (classFilter.toLowerCase().endsWith(".java")) {
                        classFilter =
                            classFilter.substring(0, classFilter.length()-5);
                    }
                    cpr.addClassFilter(classFilter);
                    cpr.enable();
                }
                jdb.addBreakpoint(bp);
                jdb.saveSession();
                jdb.fireBreakpointChanged();
            }
            catch (AbsentInformationException absent) {
                jdb.log("Line number information is not available.");
            }
            catch (Exception e) {
                Log.error(e);
            }
        }
    }

    public static void jdbDeleteBreakpoint()
    {
        Jdb jdb = findJdb();
        if (jdb == null)
            return;
        final Editor editor = Editor.currentEditor();
        final Line line = editor.getDotLine();
        Annotation annotation = line.getAnnotation();
        if (annotation instanceof BreakpointAnnotation) {
            ResolvableBreakpoint bp =
                ((BreakpointAnnotation)annotation).getBreakpoint();
            bp.clear();
            jdb.deleteBreakpoint(bp);
            File file = bp.getFile();
            if (file != null) {
                Buffer buffer = Editor.getBufferList().findBuffer(file);
                if (buffer != null)
                    buffer.repaint();
            }
            jdb.saveSession();
            jdb.fireBreakpointChanged();
        }
    }

    public void doResume()
    {
        if (vm != null) {
            currentThread = null;
            currentStackFrame = null;
            vm.resume();
        }
    }

    public void doSuspend()
    {
        if (vm != null) {
            vm.suspend();
        }
    }

    public static Jdb findJdb()
    {
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer buf = it.nextBuffer();
            if (buf instanceof Jdb)
                return (Jdb) buf;
        }
        return null;
    }

    public void startProcess()
    {
        Runnable r = new Runnable() {
            public void run()
            {
                startProcessInternal();
            }
        };
        new Thread(r).start();
    }

    private void startProcessInternal()
    {
        VMConnection connection = VMConnection.getConnection(this);
        if (connection != null) {
            vm = connection.open(this);
            if (vm != null) {
                EventRequestManager mgr = vm.eventRequestManager();
                ExceptionRequest exceptionRequest =
                    mgr.createExceptionRequest(null, false, true);
                exceptionRequest.enable();
                ThreadStartRequest tsr = mgr.createThreadStartRequest();
                tsr.enable();
                ThreadDeathRequest tdr = mgr.createThreadDeathRequest();
                tdr.enable();
                if (breakpoints.size() > 0) {
                    Iterator iter = breakpoints.iterator();
                    while (iter.hasNext()) {
                        Object obj = iter.next();
                        if (obj instanceof ResolvableBreakpoint) {
                            ResolvableBreakpoint bp =
                                (ResolvableBreakpoint) obj;
                            String className = bp.getClassName();
                            if (className != null) {
                                Log.debug("adding class prepare request for |" + className + "|");
                                ClassPrepareRequest cpr =
                                    mgr.createClassPrepareRequest();
                                cpr.addClassFilter(className);
                                cpr.enable();
                            }
                        }
                    }
                } else {
                    Log.debug("startProcessInternal adding default breakpoint");
                    breakpoints.add(new MethodBreakpoint(this, mainClass,
                        "main"));
                    fireBreakpointChanged();
                }
                ClassPrepareRequest cpr = mgr.createClassPrepareRequest();
                cpr.addClassFilter(mainClass);
                cpr.enable();
                if (!startSuspended)
                    vm.resume();
            }
        }
    }

    public void resolveDeferredRequests(ClassPrepareEvent event)
    {
        synchronized(breakpoints) {
            Iterator iter = breakpoints.iterator();
            while (iter.hasNext()) {
                ResolvableBreakpoint bp = (ResolvableBreakpoint) iter.next();
                if (!bp.isResolved()) {
                    try {
                        Log.debug("bp.getClassName() = " + bp.getClassName());
                        EventRequest eventRequest = bp.resolveAgainstPreparedClasses();
                        if (eventRequest != null) {
                            Log.debug("bp was resolved");
                            eventRequest.enable();
                        } else
                            Log.debug("bp was NOT resolved");
                    }
                    catch (Exception e) {
                        Log.error(e);
                    }
                }
            }
        }
    }

    public JdbSession getSession()
    {
        return session;
    }

    private void setSession(JdbSession session)
    {
        this.session = session;
        mainClass = session.getMainClass();
        mainClassArgs = session.getMainClassArgs();
        classPath = session.getClassPath();
        javaHome = session.getJavaHome();
        javaExecutable = session.getJavaExecutable();
        vmArgs = session.getVMArgs();
        startSuspended = session.getStartSuspended();
        sourcePath = session.getSourcePath();
        initializeBreakpoints();
    }

    private void initializeBreakpoints()
    {
        breakpoints = new ArrayList();
        List breakpointSpecifications = session.getBreakpointSpecifications();
        if (breakpointSpecifications != null) {
            Iterator iter = breakpointSpecifications.iterator();
            while (iter.hasNext()) {
                BreakpointSpecification spec =
                    (BreakpointSpecification) iter.next();
                Log.debug(spec.toString());
                int lineNumber = spec.getLineNumber();
                if (spec.getLineNumber() > 0){
                    File file = File.getInstance(spec.getFileName());
                    if (file != null && file.isFile()) {
                        LineNumberBreakpoint bp =
                            new LineNumberBreakpoint(this, spec.getClassName(),
                                file, lineNumber);
                        breakpoints.add(bp);
                    }
                } else {
                    String className = spec.getClassName();
                    String methodName = spec.getMethodName();
                    if (className != null && methodName != null) {
                        MethodBreakpoint bp =
                            new MethodBreakpoint(this, className, methodName);
                        breakpoints.add(bp);
                    }
                }
            }
        }
    }

    public void saveSession()
    {
        session.setBreakpoints(breakpoints);
        session.saveDefaults();
    }

    public void source()
    {
        source(Editor.currentEditor());
    }

    public void source(final Editor editor)
    {
        Runnable r = new Runnable() {
            public void run()
            {
                if (location == null)
                    return;
                String className = location.declaringType().name();
                String sourceName = null;
                try {
                    sourceName = location.sourceName();
                    Log.debug("sourceName = |" + sourceName + "|");
                }
                catch (AbsentInformationException e) {
                    Log.error(e);
                }
                int lineNumber = location.lineNumber();
                Log.debug("lineNumber = " + lineNumber);
                Log.debug(location.declaringType().name());
                if (sourceName != null)
                    follow(editor, className, sourceName, lineNumber - 1);
            }
        };
        if (SwingUtilities.isEventDispatchThread())
            r.run();
        else
            SwingUtilities.invokeLater(r);
    }

    private boolean follow(Editor editor, String className, String fileName,
        int lineNumber)
    {
        int index = className.indexOf('$');
        if (index >= 0)
            className = className.substring(0, index);
        File file = JavaSource.findSource(className, sourcePath);
        if (file == null) {
            file = Utilities.findFileInPath(fileName, sourcePath,
                getCurrentDirectory());
        }
        if (file == null)
            return false;
        if (!file.exists())
            return false;
        final Buffer buf = Editor.getBuffer(file);
        if (buf == null)
            return false;
        Editor ed = null;
        final Buffer currentBuffer = editor.getBuffer();
        if (buf == currentBuffer) {
            ed = editor;
        } else {
            editor.makeNext(buf);
            if (currentBuffer instanceof Jdb) {
                ed = editor.activateInOtherWindow(buf);
            } else {
                // Re-use current editor.
                ed = editor;
                ed.activate(buf);
            }
        }
        Line line = buf.getLine(lineNumber);
        if (line == null) {
            ed.eob();
        } else {
            ed.addUndo(SimpleEdit.MOVE);
            ed.unmark();
            ed.update(ed.getDotLine());
            ed.setDot(line, 0);
            ed.update(ed.getDotLine());
            ed.moveCaretToDotCol();
            ed.updateDisplay();
        }
        return true;
    }

    public void dispose()
    {
        Log.debug("Jdb.dispose");
        stop();
        if (controlDialog != null) {
            controlDialog.dispose();
            controlDialog = null;
        }
        saveSession();
        cleanup();
    }

    private void cleanup()
    {
        Log.debug("Jdb.cleanup");
        if (breakpoints != null) {
            Iterator iter = breakpoints.iterator();
            while (iter.hasNext()) {
                ResolvableBreakpoint bp = (ResolvableBreakpoint) iter.next();
                Line line = bp.getLine();
                if (line != null)
                    line.setAnnotation(null);
            }
        }
    }

    private void quit()
    {
        stop();
        // Copy editor list since unsplitWindow() may close an editor.
        ArrayList editors = new ArrayList();
        for (EditorIterator it = new EditorIterator(); it.hasNext();)
            editors.add(it.next());
        EditorList editorList = Editor.getEditorList();
        for (Iterator it = editors.iterator(); it.hasNext();) {
            Editor ed = (Editor) it.next();
            if (editorList.contains(ed)) {
                if (ed.getBuffer() == this) {
                    Editor other = ed.getOtherEditor();
                    if (other != null) {
                        Editor.setCurrentEditor(other);
                        ed.getFrame().unsplitWindow();
                    }
                }
            }
        }
        kill();
    }

    private void restart()
    {
        stop();
        initializeBreakpoints();
        startProcess();
    }

    private void stop()
    {
        if (vm != null) {
            try {
                vm.exit(0);
            }
            catch (VMDisconnectedException e) {
                // Already exited.
            }
            vm = null;
        }
    }

    // e.g. "stop org.armedbear.j.Editor.main"
    private void doStop(String args)
    {
        if (args == null) {
            log("No location specified");
            return;
        }
        if (args.startsWith(" in "))
            args = args.substring(4).trim();
        int index = args.lastIndexOf('.');
        if (index < 0) {
            log("No class specified");
            return;
        }
        String className = args.substring(0, index);
        String methodName = args.substring(index+1);
        MethodBreakpoint bp = new MethodBreakpoint(this, className, methodName);
        try {
            EventRequest eventRequest = bp.resolveAgainstPreparedClasses();
            if (eventRequest != null) {
                eventRequest.enable();
            } else {
                EventRequestManager mgr = getVM().eventRequestManager();
                ClassPrepareRequest cpr = mgr.createClassPrepareRequest();
                cpr.addClassFilter(className);
                cpr.enable();
            }
            addBreakpoint(bp);
            saveSession();
            fireBreakpointChanged();
        }
        catch (AbsentInformationException e) {
            Log.error(e);
        }
        catch (Exception e) {
            Log.error(e);
        }
    }

    // e.g. "clear Jdb.java:877"
    private void doClear(String args)
    {
        if (args == null) {
            log("No breakpoint specified");
            return;
        }
        if (args.equals("all")) {
            // Disable resolved breakpoints.
            Iterator iter = breakpoints.iterator();
            while (iter.hasNext()) {
                Object obj = iter.next();
                if (obj instanceof ResolvableBreakpoint)
                    ((ResolvableBreakpoint)obj).clear();
            }
            // Clear the list.
            breakpoints.clear();
            fireBreakpointChanged();
            return;
        }
        int index = args.indexOf(':');
        if (index < 0) {
            log("Invalid breakpoint");
            return;
        }
        String fileName = args.substring(0, index);
        if (!fileName.toLowerCase().endsWith(".java"))
            fileName = fileName.concat(".java");
        int lineNumber = -1;
        try {
            lineNumber = Integer.parseInt(args.substring(index+1));
        }
        catch (NumberFormatException e) {}
        if (lineNumber < 1) {
            log("Invalid breakpoint");
            return;
        }
        Iterator iter = breakpoints.iterator();
        while (iter.hasNext()) {
            Object obj = iter.next();
            if (obj instanceof LineNumberBreakpoint) {
                LineNumberBreakpoint bp = (LineNumberBreakpoint) obj;
                File file = bp.getFile();
                if (file != null) {
                    if (fileName.equals(file.getName())) {
                        if (lineNumber == bp.getLineNumber()) {
                            // Found it.
                            bp.clear();
                            iter.remove();
                            fireBreakpointChanged();
                            break;
                        }
                    }
                }
            }
        }
    }

    private void doNext(String args)
    {
        if (vm == null)
            return;
        if (currentThread == null) {
            Log.debug("currentThread is null");
            return;
        }
        Log.debug("currentThread = " + currentThread.name());
        int count = 1;
        if (args != null) {
            try {
                count = Integer.parseInt(args);
            }
            catch (NumberFormatException e) {
                log("Invalid argument");
                return;
            }
        }
        clearStepForThread(currentThread);
        EventRequestManager erm = vm.eventRequestManager();
        StepRequest request = erm.createStepRequest(currentThread,
            StepRequest.STEP_LINE, StepRequest.STEP_OVER);
        request.addCountFilter(count);
        request.enable();
        doResume();
    }

    private void doStep(String args)
    {
        if (vm == null)
            return;
        if (currentThread == null) {
            Log.debug("currentThread is null");
            return;
        }
        Log.debug("currentThread = " + currentThread.name());
        boolean out = false;
        int count = 1;
        if (args != null) {
            if (args.equals("out")) {
                out = true;
            } else {
                try {
                    count = Integer.parseInt(args);
                }
                catch (NumberFormatException e) {
                    log("Invalid argument");
                    return;
                }
            }
        }
        clearStepForThread(currentThread);
        EventRequestManager erm = vm.eventRequestManager();
        StepRequest request = erm.createStepRequest(currentThread,
            StepRequest.STEP_LINE,
            out ? StepRequest.STEP_OUT : StepRequest.STEP_INTO);
        request.addCountFilter(count);
        request.enable();
        doResume();
    }

    private void doPrint(String what)
    {
        if (what == null || what.length() < 1) {
            log("Missing argument");
            return;
        }
        try {
            Value value = getValue(what, currentThread, currentStackFrame);
            if (value == null) {
                log("null");
            } else if (value instanceof StringReference) {
                log(value.toString());
            } else if (value instanceof ArrayReference) {
                log(value.toString());
                log(getStringValueOfArray(what, (ArrayReference)value));
            } else {
                log(value.toString());
                if (value instanceof ObjectReference) {
                    String s = getStringValueOfObject((ObjectReference)value,
                        currentThread);
                    if (s != null) {
                        Log.debug(s);
                        log(s);
                    }
                    // getStringValueOfObject() resumes the current thread, so
                    // the context has changed...
                    Log.debug("doPrint calling fireContextChanged");
                    fireContextChanged();
                }
            }
        }
        catch (AbsentInformationException absent) {
            log("Local variable information is not available.");
            log("Compile with -g to generate local variable information.");
        }
        catch (NoSuchFieldException nsf) {
            log("No such field");
        }
        catch (Exception e) {
            log(e.toString());
            Log.error(e);
        }
    }

    private void doStdin(String s)
    {
        Process process = vm.process();
        if (process != null) {
            OutputStream out = process.getOutputStream();
            try {
                if (s != null) {
                    out.write(s.getBytes());
                    log(s, false);
                }
                out.write('\n');
                out.flush();
            }
            catch (IOException e) {
                Log.error(e);
            }
        }
    }

    private void doLocals()
    {
        if (vm == null)
            return;
        if (currentThread == null) {
            Log.debug("currentThread is null");
            return;
        }
        boolean contextChanged = false;
        try {
            StackFrame stackFrame = currentStackFrame;
            if (stackFrame == null && currentThread.frameCount() > 0)
                stackFrame = currentThread.frame(0);
            List variables = stackFrame.visibleVariables();
            Map map = stackFrame.getValues(variables);
            Set entrySet = map.entrySet();
            Iterator iter = entrySet.iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                LocalVariable variable = (LocalVariable) entry.getKey();
                Value value = (Value) entry.getValue();
                FastStringBuffer sb = new FastStringBuffer(variable.typeName());
                sb.append(' ');
                sb.append(variable.name());
                sb.append(" = ");
                sb.append(value);
                if (value instanceof StringReference) {
                    ;
                } else if (value instanceof ArrayReference) {
                    String s = getStringValueOfArray(variable.name(),
                        (ArrayReference)value);
                    if (s.length() > 0) {
                        sb.append('\n');
                        sb.append(s);
                    }
                } else if (value instanceof ObjectReference) {
                    String s = getStringValueOfObject((ObjectReference)value,
                        currentThread);
                    if (s != null) {
                        sb.append(' ');
                        sb.append(s);
                    }
                    // getStringValueOfObject() resumes the current thread, so
                    // the context has changed...
                    contextChanged = true;
                }
                log(sb.toString());
            }
            if (contextChanged)
                fireContextChanged();
        }
        catch (AbsentInformationException absent) {
            log("Local variable information is not available.");
            log("Compile with -g to generate local variable information.");
        }
        catch (Exception e) {
            Log.error(e);
        }
        if (contextChanged)
            fireContextChanged();
    }

    private static String getStringValueOfObject(ObjectReference objRef,
        ThreadReference thread)
    {
        try {
            ReferenceType refType = objRef.referenceType();
            List methods = refType.methodsByName("toString",
                "()Ljava/lang/String;");
            Method method = (Method) methods.get(0);
            Value value = objRef.invokeMethod(thread, method,
                new ArrayList(), ObjectReference.INVOKE_SINGLE_THREADED);
            if (value != null)
                return value.toString();
        }
        catch (Exception e) {
            Log.error(e);
        }
        return null;
    }

    private static String getStringValueOfArray(String name, ArrayReference ar)
    {
        FastStringBuffer sb = new FastStringBuffer();
        final int limit = ar.length();
        for (int i = 0; i < limit; i++) {
            sb.append("    ");
            sb.append(name);
            sb.append('[');
            sb.append(i);
            sb.append("]: ");
            Value v = ar.getValue(i);
            sb.append(v == null ? "null" : v.toString());
            if (i < limit-1)
                sb.append('\n');
        }
        return sb.toString();
    }

    private void clearStepForThread(ThreadReference threadRef)
    {
        EventRequestManager erm = vm.eventRequestManager();
        List requests = erm.stepRequests();
        Iterator iter = requests.iterator();
        while (iter.hasNext()) {
            StepRequest request = (StepRequest) iter.next();
            if (request.thread().equals(threadRef)) {
                erm.deleteEventRequest(request);
                break; // There should be only one!
            }
        }
    }

    private static Value getValue(String expression, ThreadReference threadRef,
        StackFrame frame) throws Exception
    {
        Log.debug("getValue");
        StringTokenizer st = new StringTokenizer(expression, "[].");
        if (!st.hasMoreTokens()) {
            Log.debug("no more tokens");
            throw new NoSuchFieldException();
        }
        String token = st.nextToken();
        Log.debug("token = |" + token + "|");
        Value currentValue = null;
        Field currentField = null;
        ObjectReference obj = null;
        LocalVariable local = null;
        if (token.equals("this")) {
            currentValue = frame.thisObject();
            if (currentValue == null)
                throw new NoSuchFieldException(token);
        } else {
            Log.debug("calling visibleVariableByName");
            local = frame.visibleVariableByName(token);
            Log.debug("local = " + local);
            if (local != null) {
                currentValue = frame.getValue(local);
                Log.debug("currentValue = " + currentValue);
            } else {
                ReferenceType refType = frame.location().declaringType();
                Log.debug("refType = " + refType);
                obj = frame.thisObject();
                if (obj == null) {
                    // Static method.
                    Log.debug("static method");
                    currentField = refType.fieldByName(token);
                    if (currentField != null && currentField.isStatic())
                        currentValue = refType.getValue(currentField);
                    else
                        throw new NoSuchFieldException();
                } else {
                    currentField = refType.fieldByName(token);
                    if (currentField != null)
                        currentValue = obj.getValue(currentField);
                }
            }
        }
        while (st.hasMoreTokens() && currentValue != null) {
            String prevToken = token;
            token = st.nextToken();
            Log.debug("while loop token = |" + token + "|");
            Object arg;
            try {
                arg = new Integer(token);
            } catch (NumberFormatException e) {
                arg = token;
            }
            if (currentValue instanceof ArrayReference) {
                int count = -1;
                if (arg instanceof Integer)
                    count = ((Integer) arg).intValue();
                if (count >= 0 && count < ((ArrayReference)currentValue).length())
                    currentValue = ((ArrayReference)currentValue).getValue(count);
                else
                    throw new ArrayIndexOutOfBoundsException();
            } else if (currentValue instanceof ObjectReference &&
                arg instanceof String) {
                Log.debug("object reference, string");
                obj = (ObjectReference) currentValue;
                ReferenceType refType = obj.referenceType();
                currentField = refType.fieldByName(token);
                if (currentField != null)
                    currentValue = obj.getValue(currentField);
            } else
                throw new Exception();
        }
        Log.debug("getValue returning currentValue = " + currentValue);
        return currentValue;
    }

    public boolean isModified()
    {
        return false;
    }

    // For the buffer list.
    public String toString()
    {
        return "jdb";
    }

    public String getTitle()
    {
        return "jdb";
    }

    public Icon getIcon()
    {
        return Utilities.getIconFromFile("jpty.png");
    }
}
