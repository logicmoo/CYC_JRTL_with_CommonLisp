/*
 * PrintNotReadable.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: PrintNotReadable.java,v 1.2 2004-03-18 00:26:07 piso Exp $
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

public class PrintNotReadable extends LispError
{
    public final LispObject object;

    public PrintNotReadable(LispObject initArgs) throws ConditionThrowable
    {
        super(initArgs);
        LispObject object = NIL;
        LispObject first, second;
        while (initArgs != NIL) {
            first = initArgs.car();
            initArgs = initArgs.cdr();
            second = initArgs.car();
            initArgs = initArgs.cdr();
            if (first == Keyword.OBJECT) {
                object = second;
                break;
            }
        }
        this.object = object;
    }

    public LispObject typeOf()
    {
        return Symbol.PRINT_NOT_READABLE;
    }

    public LispClass classOf()
    {
        return BuiltInClass.PRINT_NOT_READABLE;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.PRINT_NOT_READABLE)
            return T;
        if (type == BuiltInClass.PRINT_NOT_READABLE)
            return T;
        return super.typep(type);
    }

    // ### print-not-readable-object
    private static final Primitive1 PRINT_NOT_READABLE_OBJECT =
        new Primitive1("print-not-readable-object", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((PrintNotReadable)arg).object;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.PRINT_NOT_READABLE));
            }
        }
    };
}
