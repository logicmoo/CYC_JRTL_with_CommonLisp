/*
 * arglist.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: arglist.java,v 1.8 2004-02-16 13:13:11 piso Exp $
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

public final class arglist extends Lisp
{
    private static final Functional getFunctional(LispObject obj)
        throws ConditionThrowable
    {
        if (obj instanceof Functional)
            return (Functional) obj;
        if (obj instanceof Symbol) {
            LispObject fun = obj.getSymbolFunction();
            if (fun instanceof Autoload) {
                Autoload autoload = (Autoload) fun;
                autoload.load();
                fun = (Functional)autoload.getSymbol().getSymbolFunction();
            }
            if (fun instanceof Functional) {
                Functional func = (Functional) fun;
                if (func.getArglist() != null)
                    return func;
                LispObject other =
                    get(checkSymbol(obj), Symbol.MACROEXPAND_MACRO, NIL);
                if (other != null)
                    return getFunctional(other);
                else
                    return null;
            }
        } else if (obj instanceof Cons && obj.car() == Symbol.LAMBDA)
            return new Closure(obj.cadr(), obj.cddr(), new Environment());
        return null;
    }

    private static final Primitive1 ARGLIST =
        new Primitive1("arglist", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            LispThread thread = LispThread.currentThread();
            Functional functional = getFunctional(arg);
            LispObject arglist = null;
            if (functional != null)
                arglist = functional.getArglist();
            final LispObject value1, value2;
            if (arglist instanceof LispString) {
                String s = ((LispString)arglist).getValue();
                // Give the string list syntax.
                s = "(" + s + ")";
                // Bind *PACKAGE* so we use the EXT package if we need
                // to intern any symbols.
                Environment oldDynEnv = thread.getDynamicEnvironment();
                thread.bindSpecial(_PACKAGE_, PACKAGE_EXT);
                try {
                    arglist = readObjectFromString(s);
                }
                finally {
                    thread.setDynamicEnvironment(oldDynEnv);
                }
                functional.setArglist(arglist);
            }
            if (arglist != null) {
                value1 = arglist;
                value2 = T;
            } else {
                value1 = NIL;
                value2 = NIL;
            }
            return thread.setValues(value1, value2);
        }
    };

    // ### %set-arglist
    private static final Primitive2 _SET_ARGLIST =
        new Primitive2("%set-arglist", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            coerceToFunctional(first).setArglist(second);
            return second;
        }
    };
}
