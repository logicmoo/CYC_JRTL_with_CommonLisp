/*
 * LispAPI.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: LispAPI.java,v 1.34 2004-04-12 23:02:33 piso Exp $
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

import java.util.Iterator;
import javax.swing.SwingUtilities;
import javax.swing.undo.CompoundEdit;
import org.armedbear.lisp.AbstractString;
import org.armedbear.lisp.ConditionThrowable;
import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.Function;
import org.armedbear.lisp.GenericFunction;
import org.armedbear.lisp.JavaObject;
import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispCharacter;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Packages;
import org.armedbear.lisp.Primitive0;
import org.armedbear.lisp.Primitive1;
import org.armedbear.lisp.Primitive2;
import org.armedbear.lisp.Primitive3;
import org.armedbear.lisp.Primitive;
import org.armedbear.lisp.Primitives;
import org.armedbear.lisp.SimpleString;
import org.armedbear.lisp.Symbol;
import org.armedbear.lisp.TypeError;
import org.armedbear.lisp.UndefinedFunction;
import org.armedbear.lisp.WrongNumberOfArgumentsException;

public final class LispAPI extends Lisp
{
    private static final Preferences preferences = Editor.preferences();

    public static final Package PACKAGE_J =
        Packages.createPackage("J");
    public static final Package PACKAGE_J_INTERNALS =
        Packages.createPackage("J-INTERNALS");
    static {
        PACKAGE_J.usePackage(PACKAGE_CL);
        PACKAGE_J.usePackage(PACKAGE_EXT);
        PACKAGE_J.usePackage(PACKAGE_JAVA);
        PACKAGE_J_INTERNALS.usePackage(PACKAGE_CL);
        PACKAGE_J_INTERNALS.usePackage(PACKAGE_EXT);
        PACKAGE_J_INTERNALS.usePackage(PACKAGE_JAVA);
    }

    public static final Symbol _CURRENT_COMMAND_ =
        exportSpecial("*CURRENT-COMMAND*", PACKAGE_J, NIL);

    public static final Symbol _LAST_COMMAND_ =
        exportSpecial("*LAST-COMMAND*", PACKAGE_J, NIL);

    public static final void eventHandled()
    {
        _LAST_COMMAND_.setSymbolValue(_CURRENT_COMMAND_.getSymbolValue());
        _CURRENT_COMMAND_.setSymbolValue(NIL);
    }

    public static final Editor checkEditor(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Editor) ((JavaObject)obj).getObject();
        }
        catch (ClassCastException e) {
            signal(new TypeError("The value " + obj + " is not an editor."));
            // Not reached.
            return null;
        }
    }

    public static final Buffer checkBuffer(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Buffer) ((JavaObject)obj).getObject();
        }
        catch (ClassCastException e) {
            signal(new TypeError("The value " + obj + " is not a buffer."));
            // Not reached.
            return null;
        }
    }

    public static final Position checkMarker(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Position) ((JavaObject)obj).getObject();
        }
        catch (ClassCastException e) {
            signal(new TypeError("The value " + obj + " is not a marker."));
            // Not reached.
            return null;
        }
    }

    public static final Line checkLine(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Line) ((JavaObject)obj).getObject();
        }
        catch (ClassCastException e) {
            signal(new TypeError("The value " + obj + " is not a line."));
            // Not reached.
            return null;
        }
    }

    // ### current-editor
    private static final Primitive0 CURRENT_EDITOR =
        new Primitive0("current-editor", PACKAGE_J, true,
                       "()",
                       "Returns the current editor as a Lisp object.")
    {
        public LispObject execute()
        {
            return new JavaObject(Editor.currentEditor());
        }
    };

    // ### %set-current-editor
    private static final Primitive1 _SET_CURRENT_EDITOR =
        new Primitive1("%set-current-editor", PACKAGE_J, false,
                       "(EDITOR)",
                       "Makes EDITOR the current editor.")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Editor.setCurrentEditor(checkEditor(arg));
            return arg;
        }
    };

    // ### other-editor
    private static final Primitive0 OTHER_EDITOR =
        new Primitive0("other-editor", PACKAGE_J, true) {
        public LispObject execute()
        {
            Editor otherEditor = Editor.currentEditor().getOtherEditor();
            return otherEditor != null ? new JavaObject(otherEditor) : NIL;
        }
    };

    // ### current-buffer
    private static final Primitive0 CURRENT_BUFFER =
        new Primitive0("current-buffer", PACKAGE_J, true) {
        public LispObject execute()
        {
            return new JavaObject(Editor.currentEditor().getBuffer());
        }
    };

    // ### buffer
    private static final Primitive1 BUFFER =
        new Primitive1("buffer", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new JavaObject(checkEditor(arg).getBuffer());
        }
    };

    // ### buffer-pathname
    private static final Primitive1 BUFFER_PATHNAME =
        new Primitive1("buffer-pathname", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            File file = checkBuffer(arg).getFile();
            if (file != null) {
                if (file.isRemote())
                    return new SimpleString(file.netPath());
                return new SimpleString(file.canonicalPath());
            }
            return NIL;
        }
    };

    // ### buffer-string
    private static final Primitive BUFFER_STRING =
        new Primitive("buffer-string", PACKAGE_J, true) {
        public LispObject execute() throws ConditionThrowable
        {
            return new SimpleString(Editor.currentBuffer().getText());
        }
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new SimpleString(checkBuffer(arg).getText());
        }
    };

    // ### copy-marker
    private static final Primitive1 COPY_MARK =
        new Primitive1("copy-marker", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return new JavaObject(new Position(checkMarker(arg)));
            }
            catch (Exception e) {
                throw new ConditionThrowable(new TypeError(arg, "marker"));
            }
        }
    };

    // ### goto-char
    // goto-char position &optional marker
    private static final Primitive GOTO_CHAR =
        new Primitive("goto-char", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            // Move dot to position.
            final Editor editor = Editor.currentEditor();
            editor.moveDotTo(checkMarker(arg));
            return new JavaObject(editor.getDot());
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Log.debug("goto-char two argument case");
            Position pos1 = checkMarker(first);
            Position pos2 = checkMarker(second);
            pos1.moveTo(pos2);
            return first;
        }
    };

    // ### point
    private static final Primitive0 POINT =
        new Primitive0("point", PACKAGE_J, true) {
        public LispObject execute()
        {
            Position dot = Editor.currentEditor().getDot();
            if (dot != null)
                return new JavaObject(dot.copy());
            return NIL;
        }
    };

    // ### point-min
    private static final Primitive0 POINT_MIN =
        new Primitive0("point-min", PACKAGE_J, true) {
        public LispObject execute()
        {
            final Line line = Editor.currentBuffer().getFirstLine();
            if (line == null)
                return NIL;
            return new JavaObject(new Position(line, 0));
        }
    };

    // ### point-max
    private static final Primitive0 POINT_MAX =
        new Primitive0("point-max", PACKAGE_J, true) {
        public LispObject execute()
        {
            Position pos = Editor.currentBuffer().getEnd();
            if (pos == null)
                return NIL;
            return new JavaObject(pos);
        }
    };

    // ### make-marker
    private static final Primitive1 MAKE_MARKER =
        new Primitive1("make-marker", PACKAGE_J, true) {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Line line = checkLine(first);
            int offset = Fixnum.getValue(second);
            return new JavaObject(new Position(line, offset));
        }
    };

    // ### marker-line
    private static final Primitive1 MARKER_LINE =
        new Primitive1("marker-line", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new JavaObject(checkMarker(arg).getLine());
        }
    };

    // ### marker-charpos
    private static final Primitive1 MARKER_CHARPOS =
        new Primitive1("marker-charpos", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return number(checkMarker(arg).getOffset());
        }
    };

    // ### current-line
    private static final Primitive0 CURRENT_LINE =
        new Primitive0("current-line", PACKAGE_J, true) {
        public LispObject execute()
        {
            Editor editor = Editor.currentEditor();
            Position dot = Editor.currentEditor().getDot();
            if (dot != null)
                return new JavaObject(dot.getLine());
            return NIL;
        }
    };

    // ### line-next
    private static final Primitive1 LINE_NEXT =
        new Primitive1("line-next", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Line next = checkLine(arg).next();
            return next != null ? new JavaObject(next) : NIL;
        }
    };

    // ### line-previous
    private static final Primitive1 LINE_PREVIOUS =
        new Primitive1("line-previous", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Line prev = checkLine(arg).previous();
            return prev != null ? new JavaObject(prev) : NIL;
        }
    };

    // ### line-chars
    private static final Primitive1 LINE_CHARS =
        new Primitive1("line-chars", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            String s = checkLine(arg).getText();
            return s != null ? new SimpleString(s) : NIL;
        }
    };

    // ### line-flags
    private static final Primitive1 LINE_FLAGS =
        new Primitive1("line-flags", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return number(checkLine(arg).flags());
        }
    };

    // ### char-after
    // Returns character immediately after marker.
    private static final Primitive1 CHAR_AFTER =
        new Primitive1("char-after", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return LispCharacter.getInstance(checkMarker(arg).getChar());
        }
    };

    // ### char-before
    // Returns character immediately before marker.
    private static final Primitive1 CHAR_BEFORE =
        new Primitive1("char-before", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Position pos = checkMarker(arg).copy();
            return pos.prev() ? LispCharacter.getInstance(pos.getChar()) : NIL;
        }
    };

    // ### forward-char
    // Move point right N characters (left if N is negative).
    private static final Primitive FORWARD_CHAR =
        new Primitive("forward-char", PACKAGE_J, true) {
        public LispObject execute() throws ConditionThrowable
        {
            return forwardChar(1);
        }
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return forwardChar(Fixnum.getValue(arg));
        }
    };

    // ### backward-char
    // Move point left N characters (right if N is negative).
    private static final Primitive BACKWARD_CHAR =
        new Primitive("backward-char", PACKAGE_J, true) {
        public LispObject execute() throws ConditionThrowable
        {
            return forwardChar(-1);
        }
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return forwardChar(-Fixnum.getValue(arg));
        }
    };

    private static final LispObject forwardChar(int n) throws ConditionThrowable
    {
        if (n != 0) {
            final Editor editor = Editor.currentEditor();
            Position pos = editor.getDot();
            if (pos != null) {
                editor.addUndo(SimpleEdit.MOVE);
                if (n > 0) {
                    while (n-- > 0) {
                        if (!pos.next())
                            throw new ConditionThrowable(new LispError("reached end of buffer"));
                    }
                } else {
                    Debug.assertTrue(n < 0);
                    while (n++ < 0) {
                        if (!pos.prev())
                            throw new ConditionThrowable(new LispError("reached beginning of buffer"));
                    }
                }
                editor.moveCaretToDotCol();
            }
        }
        return NIL;
    }

    // ### beginning-of-line
    private static final Primitive BEGINNING_OF_LINE =
        new Primitive("beginning-of-line", PACKAGE_J, true) {
        public LispObject execute() throws ConditionThrowable
        {
            Editor.currentEditor().bol();
            return NIL;
        }
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            int n = (arg != NIL) ? Fixnum.getValue(arg) : 1;
            final Editor editor = Editor.currentEditor();
            Position pos = editor.getDot();
            if (pos != null) {
                editor.addUndo(SimpleEdit.MOVE);
                while (--n > 0) {
                    Line nextLine = pos.getNextLine();
                    if (nextLine != null)
                        pos.setLine(nextLine);
                    else
                        break;
                }
                pos.setOffset(0);
                editor.moveCaretToDotCol();
            }
            return NIL;
        }
    };

    // ### end-of-line
    private static final Primitive END_OF_LINE =
        new Primitive("end-of-line", PACKAGE_J, true) {
        public LispObject execute() throws ConditionThrowable
        {
            Editor.currentEditor().eol();
            return NIL;
        }
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            int n = (arg != NIL) ? Fixnum.getValue(arg) : 1;
            final Editor editor = Editor.currentEditor();
            Position pos = editor.getDot();
            if (pos != null) {
                editor.addUndo(SimpleEdit.MOVE);
                while (--n > 0) {
                    Line nextLine = pos.getNextLine();
                    if (nextLine != null)
                        pos.setLine(nextLine);
                    else
                        break;
                }
                pos.setOffset(pos.getLineLength());
                editor.moveCaretToDotCol();
            }
            return NIL;
        }
    };

    private static final Symbol KEYWORD_GLOBAL =
        Keyword.internKeyword("GLOBAL");
    private static final Symbol KEYWORD_MODE =
        Keyword.internKeyword("MODE");
    private static final Symbol KEYWORD_BUFFER =
        Keyword.internKeyword("BUFFER");
    private static final Symbol KEYWORD_CURRENT =
        Keyword.internKeyword("CURRENT");

    // ### %variable-value
    // %variable-value symbol kind where => value
    private static final Primitive3 _VARIABLE_VALUE =
        new Primitive3("%variable-value", PACKAGE_J, false) {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws ConditionThrowable
        {
            Symbol symbol = checkSymbol(first);
            JVar jvar = JVar.getJVar(symbol);
            Property property = jvar.getProperty();
            LispObject kind = second;
            LispObject where = third;
            final Editor editor = Editor.currentEditor();
            if (kind == KEYWORD_CURRENT) {
                if (where != NIL)
                    return signal(new LispError("Bad argument: " + where + "."));
                final Buffer buffer = editor.getBuffer();
                if (property.isBooleanProperty())
                    return buffer.getBooleanProperty(property) ? T : NIL;
                if (property.isIntegerProperty())
                    return number(buffer.getIntegerProperty(property));
                String value = buffer.getStringProperty(property);
                return value != null ? new SimpleString(value) : NIL;
            }
            if (kind == KEYWORD_GLOBAL) {
                if (property.isBooleanProperty())
                    return preferences.getBooleanProperty(property) ? T : NIL;
                if (property.isIntegerProperty())
                    return number(preferences.getIntegerProperty(property));
                String value = preferences.getStringProperty(property);
                return value != null ? new SimpleString(value) : NIL;
            }
            if (kind == KEYWORD_MODE) {
                final Mode mode;
                if (where == NIL)
                    mode = editor.getMode();
                else {
                    mode = Editor.getModeList().getModeFromModeName(where.getStringValue());
                    if (mode == null)
                        return signal(new LispError("Unknown mode: " + where + "."));
                }
                if (property.isBooleanProperty())
                    return mode.getBooleanProperty(property) ? T : NIL;
                if (property.isIntegerProperty())
                    return number(mode.getIntegerProperty(property));
                String value = mode.getStringProperty(property);
                return value != null ? new SimpleString(value) : NIL;
            }
            if (kind == KEYWORD_BUFFER) {
                final Buffer buffer;
                if (where != NIL)
                    buffer = checkBuffer(where);
                else
                    buffer = editor.getBuffer();
                if (property.isBooleanProperty())
                    return buffer.getBooleanProperty(property) ? T : NIL;
                if (property.isIntegerProperty())
                    return number(buffer.getIntegerProperty(property));
                String value = buffer.getStringProperty(property);
                return value != null ? new SimpleString(value) : NIL;
            }
            return signal(new LispError("Invalid parameter: " + kind + "."));
        }
    };

    // ### %set-variable-value
    // %set-variable-value symbol kind where new-value => new-value
    private static final Primitive _SET_VARIABLE_VALUE =
        new Primitive("%set-variable-value", PACKAGE_J, false) {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 4)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            Symbol symbol = checkSymbol(args[0]);
            JVar jvar = JVar.getJVar(symbol);
            Property property = jvar.getProperty();
            LispObject kind = args[1];
            LispObject where = args[2];
            LispObject newValue = args[3];
            if (kind == KEYWORD_GLOBAL) {
                if (property.isBooleanProperty()) {
                    if (newValue == NIL) {
                        preferences.setProperty(property, "false");
                        return NIL;
                    } else {
                        preferences.setProperty(property, "true");
                        return T;
                    }
                } else {
                    preferences.setProperty(property, newValue.getStringValue());
                    return newValue;
                }
            }
            final Editor editor = Editor.currentEditor();
            if (kind == KEYWORD_MODE) {
                final Mode mode;
                if (where == NIL)
                    mode = editor.getMode();
                else
                    mode = Editor.getModeList().getModeFromModeName(where.getStringValue());
                if (property.isBooleanProperty()) {
                    if (newValue == NIL) {
                        mode.setProperty(property, false);
                        return NIL;
                    } else {
                        mode.setProperty(property, true);
                        return T;
                    }
                } else {
                    mode.setProperty(property, newValue.getStringValue());
                    return newValue;
                }
            }
            if (kind == KEYWORD_BUFFER) {
                final Buffer buffer;
                if (where != NIL)
                    buffer = checkBuffer(where);
                else
                    buffer = editor.getBuffer();
                if (property.isBooleanProperty()) {
                    buffer.setProperty(property, newValue != NIL);
                    return newValue != NIL ? T : NIL;
                }
                if (property.isIntegerProperty()) {
                    buffer.setProperty(property, Fixnum.getValue(newValue));
                    return newValue;
                }
                buffer.setProperty(property, newValue.getStringValue());
                return newValue;
            }
            return signal(new LispError("Invalid parameter: " + kind));
        }
    };

    // ### kill-theme
    private static final Primitive0 KILL_THEME =
        new Primitive0("kill-theme", PACKAGE_J, true) {
        public LispObject execute()
        {
            preferences.killTheme();
            return T;
        }
    };

    // ### restore-focus
    private static final Primitive0 RESTORE_FOCUS =
        new Primitive0("restore-focus", PACKAGE_J, true) {
        public LispObject execute()
        {
            Editor.currentEditor().setFocusToDisplay();
            return T;
        }
    };

    // ### global-map-key
    private static final Primitive2 GLOBAL_MAP_KEY =
        new Primitive2("global-map-key", PACKAGE_J, true) {
        public LispObject execute(LispObject first, LispObject second)
	    throws ConditionThrowable
        {
            String keyText = first.getStringValue();
            Object command;
            if (second instanceof AbstractString) {
                command = second.getStringValue();
            } else {
                // Verify that the command can be coerced to a function.
                coerceToFunction(second);
                command = second;
            }
            return KeyMap.getGlobalKeyMap().mapKey(keyText, command) ? T : NIL;
        }
    };

    // ### global-unmap-key
    private static final Primitive1 GLOBAL_UNMAP_KEY =
        new Primitive1("global-unmap-key", PACKAGE_J, true) {
        public LispObject execute(LispObject arg)
	    throws ConditionThrowable
        {
            String keyText = arg.getStringValue();
            return KeyMap.getGlobalKeyMap().unmapKey(keyText) ? T : NIL;
        }
    };

    // ### map-key-for-mode
    private static final Primitive3 MAP_KEY_FOR_MODE =
        new Primitive3("map-key-for-mode", PACKAGE_J, true) {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
	    throws ConditionThrowable
        {
            String keyText = first.getStringValue();
            Object command;
            if (second instanceof AbstractString) {
                command = second.getStringValue();
            } else {
                // Verify that the command can be coerced to a function.
                coerceToFunction(second);
                command = second;
            }
            String modeName = third.getStringValue();
            Mode mode = Editor.getModeList().getModeFromModeName(modeName);
            if (mode == null)
                throw new ConditionThrowable(new LispError("unknown mode \"".concat(modeName).concat("\"")));
            return mode.getKeyMap().mapKey(keyText, command) ? T : NIL;
        }
    };

    // ### unmap-key-for-mode
    private static final Primitive2 UNMAP_KEY_FOR_MODE =
        new Primitive2("unmap-key-for-mode", PACKAGE_J, true) {
        public LispObject execute(LispObject first, LispObject second)
	    throws ConditionThrowable
        {
            String keyText = first.getStringValue();
            String modeName = second.getStringValue();
            Mode mode = Editor.getModeList().getModeFromModeName(modeName);
            if (mode == null)
                throw new ConditionThrowable(new LispError("unknown mode \"".concat(modeName).concat("\"")));
            return mode.getKeyMap().unmapKey(keyText) ? T : NIL;
        }
    };

    // ### %set-global-property
    private static final Primitive2 _SET_GLOBAL_PROPERTY =
        new Primitive2("%set-global-property", PACKAGE_J, false) {
        public LispObject execute(LispObject first, LispObject second)
	    throws ConditionThrowable
        {
            String key = first.getStringValue();
            final String value;
            if (second instanceof Fixnum)
                value = String.valueOf(Fixnum.getValue(second));
            else
                value = second.getStringValue();
            Editor.setGlobalProperty(key, value);
            return second;
        }
    };

    // ### insert
    private static final Primitive INSERT =
        new Primitive("insert", PACKAGE_J, true) {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length == 0)
                return NIL;
            final Editor editor = Editor.currentEditor();
            if (!editor.checkReadOnly())
                return NIL;
            CompoundEdit compoundEdit = editor.beginCompoundEdit();
            try {
                for (int i = 0; i < args.length; i++) {
                    LispObject obj = args[i];
                    if (obj instanceof LispCharacter) {
                        editor.insertChar(((LispCharacter)obj).getValue());
                    } else if (obj instanceof AbstractString) {
                        editor.insertString(obj.getStringValue());
                    } else
                        throw new ConditionThrowable(new TypeError(obj, "character or string"));
                }
                return NIL;
            }
            finally {
                editor.endCompoundEdit(compoundEdit);
            }
        }
    };

    // ### delete-region => nil
    private static final Primitive0 DELETE_REGION =
        new Primitive0("delete-region", PACKAGE_J, true)
    {
        public LispObject execute() throws ConditionThrowable
        {
            final Editor editor = Editor.currentEditor();
            if (!editor.checkReadOnly())
                return NIL;
            editor.deleteRegion();
            return NIL;
        }
    };

    // ### set-mark pos => pos
    private static final Primitive1 SET_MARK =
        new Primitive1("set-mark", PACKAGE_J, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            final Editor editor = Editor.currentEditor();
            if (arg != NIL)
                editor.setMark(checkMarker(arg));
            else
                editor.unmark();
            return arg;
        }
    };

    private static final Primitive0 UNDO =
        new Primitive0("undo", PACKAGE_J, true)
    {
        public LispObject execute() throws ConditionThrowable
        {
            Editor.currentEditor().undo();
            return NIL;
        }
    };

    private static final Primitive0 BEGIN_COMPOUND_EDIT =
        new Primitive0("begin-compound-edit", PACKAGE_J, false)
    {
        public LispObject execute()
        {
            return new JavaObject(Editor.currentEditor().beginCompoundEdit());
        }
    };

    private static final Primitive1 END_COMPOUND_EDIT =
        new Primitive1("end-compound-edit", PACKAGE_J, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                CompoundEdit compoundEdit =
                    (CompoundEdit) ((JavaObject)arg).getObject();
                Editor.currentEditor().endCompoundEdit(compoundEdit);
                return NIL;
            }
            catch (ClassCastException e) {
                throw new ConditionThrowable(new TypeError(arg, "compound edit"));
            }
        }
    };

    // ### %log-debug
    private static final Primitive1 _LOG_DEBUG =
        new Primitive1("%log-debug", PACKAGE_J, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Log.debug(arg.getStringValue());
            return arg;
        }
    };

    // ### get-last-event-time
    private static final Primitive0 GET_LAST_EVENT_INTERNAL_TIME =
        new Primitive0("get-last-event-internal-time", PACKAGE_J, true)
    {
        public LispObject execute() throws ConditionThrowable
        {
            return number(Dispatcher.getLastEventMillis());
        }
    };

    public static void invokeOpenFileHook(Buffer buffer)
    {
        try {
            Primitives.FUNCALL.execute(PACKAGE_J.intern("INVOKE-HOOK"),
                                       PACKAGE_J.intern("OPEN-FILE-HOOK"),
                                       new JavaObject(buffer));
        }
        catch (Throwable t) {
            Log.debug(t);
        }
    }

    public static void invokeBufferActivatedHook(Buffer buffer)
    {
        if (buffer != null) {
            try {
                Primitives.FUNCALL.execute(PACKAGE_J.intern("INVOKE-HOOK"),
                                           PACKAGE_J.intern("BUFFER-ACTIVATED-HOOK"),
                                           new JavaObject(buffer));
            }
            catch (Throwable t) {
                Log.debug(t);
            }
        }
    }

    public static void invokeAfterSaveHook(Buffer buffer)
    {
        try {
            Primitives.FUNCALL.execute(PACKAGE_J.intern("INVOKE-HOOK"),
                                       PACKAGE_J.intern("AFTER-SAVE-HOOK"),
                                       new JavaObject(buffer));
        }
        catch (Throwable t) {
            Log.debug(t);
        }
    }

    // ### invoke-later
    public static final Primitive1 INVOKE_LATER =
        new Primitive1("invoke-later", PACKAGE_J, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            final LispObject fun;
            if (arg instanceof Symbol)
                fun = arg.getSymbolFunction();
            else
                fun = arg;
            if (fun instanceof Function || fun instanceof GenericFunction) {
                Runnable r = new Runnable() {
                    public void run()
                    {
                        try {
                            funcall0(fun, LispThread.currentThread());
                        }
                        catch (Throwable t) {
                            Log.error(t);
                        }
                    }
                };
                SwingUtilities.invokeLater(r);
                return NIL;
            }
            throw new ConditionThrowable(new UndefinedFunction(arg));
        }
    };

    static {
        for (Iterator it = Property.iterator(); it.hasNext();)
            JVar.addVariableForProperty((Property)it.next());
    }
}
