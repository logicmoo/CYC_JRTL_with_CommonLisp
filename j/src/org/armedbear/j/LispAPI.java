/*
 * LispAPI.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispAPI.java,v 1.1 2003-06-30 19:11:56 piso Exp $
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

import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.JavaObject;
import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispString;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Packages;
import org.armedbear.lisp.Primitive0;
import org.armedbear.lisp.Primitive1;
import org.armedbear.lisp.Primitive3;
import org.armedbear.lisp.Primitive;
import org.armedbear.lisp.Symbol;
import org.armedbear.lisp.TypeError;
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
        PACKAGE_J.usePackage(PACKAGE_JAVA);
        PACKAGE_J_INTERNALS.usePackage(PACKAGE_CL);
        PACKAGE_J_INTERNALS.usePackage(PACKAGE_JAVA);
    }

    public static final Editor checkEditor(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Editor) ((JavaObject)obj).getObject();
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "editor");
        }
    }

    public static final Buffer checkBuffer(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Buffer) ((JavaObject)obj).getObject();
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "buffer");
        }
    }

    private static final Primitive0 CURRENT_EDITOR =
        new Primitive0("current-editor", PACKAGE_J, true) {
        public LispObject execute()
        {
            return new JavaObject(Editor.currentEditor());
        }
    };

    private static final Primitive0 OTHER_EDITOR =
        new Primitive0("other-editor", PACKAGE_J, true) {
        public LispObject execute()
        {
            Editor otherEditor = Editor.currentEditor().getOtherEditor();
            return otherEditor != null ? new JavaObject(otherEditor) : NIL;
        }
    };

    private static final Primitive0 CURRENT_BUFFER =
        new Primitive0("current-buffer", PACKAGE_J, true) {
        public LispObject execute()
        {
            return new JavaObject(Editor.currentEditor().getBuffer());
        }
    };

    private static final Primitive1 EDITOR_BUFFER =
        new Primitive1("editor-buffer", PACKAGE_J, true) {
        public LispObject execute(LispObject arg) throws LispError
        {
            Editor editor = checkEditor(arg);
            return new JavaObject(editor.getBuffer());
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
        new Primitive3("%variable-value", LispAPI.PACKAGE_J) {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispError
        {
            Symbol symbol = checkSymbol(first);
            JVar jvar = JVar.getJVar(symbol);
            Property property = jvar.getProperty();
            LispObject kind = second;
            LispObject where = third;
            final Editor editor = Editor.currentEditor();
            if (kind == KEYWORD_CURRENT) {
                if (where != NIL)
                    throw new LispError("bad argument " + where);
                final Buffer buffer = editor.getBuffer();
                if (property.isBooleanProperty())
                    return buffer.getBooleanProperty(property) ? T : NIL;
                if (property.isIntegerProperty())
                    return number(buffer.getIntegerProperty(property));
                return new LispString(buffer.getStringProperty(property));
            }
            if (kind == KEYWORD_GLOBAL) {
                if (property.isBooleanProperty())
                    return preferences.getBooleanProperty(property) ? T : NIL;
                if (property.isIntegerProperty())
                    return number(preferences.getIntegerProperty(property));
                return new LispString(preferences.getStringProperty(property));
            }
            if (kind == KEYWORD_MODE) {
                final Mode mode;
                if (where == NIL)
                    mode = editor.getMode();
                else
                    mode = Editor.getModeList().getModeFromModeName(LispString.getValue(where));
                if (property.isBooleanProperty())
                    return mode.getBooleanProperty(property) ? T : NIL;
                if (property.isIntegerProperty())
                    return number(mode.getIntegerProperty(property));
                return new LispString(mode.getStringProperty(property));
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
                return new LispString(buffer.getStringProperty(property));
            }
            throw new LispError("bad keyword argument: " + kind);
        }
    };

    // ### %set-variable-value
    // %set-variable-value symbol kind where new-value => new-value
    private static final Primitive _SET_VARIABLE_VALUE =
        new Primitive("%set-variable-value", LispAPI.PACKAGE_J) {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 4)
                throw new WrongNumberOfArgumentsException(this);
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
                    preferences.setProperty(property, String.valueOf(newValue));
                    return newValue;
                }
            }
            final Editor editor = Editor.currentEditor();
            if (kind == KEYWORD_MODE) {
                final Mode mode;
                if (where == NIL)
                    mode = editor.getMode();
                else
                    mode = Editor.getModeList().getModeFromModeName(LispString.getValue(where));
                if (property.isBooleanProperty()) {
                    if (newValue == NIL) {
                        mode.setProperty(property, false);
                        return NIL;
                    } else {
                        mode.setProperty(property, true);
                        return T;
                    }
                } else {
                    mode.setProperty(property, String.valueOf(newValue));
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
                buffer.setProperty(property, String.valueOf(newValue));
                return newValue;
            }
            throw new LispError("bad keyword argument: " + kind);
        }
    };

    static {
        for (java.util.Iterator it = Property.iterator(); it.hasNext();)
            JVar.addVariableForProperty((Property)it.next());
    }
}
