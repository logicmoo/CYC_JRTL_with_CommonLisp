/*
 * PackageError.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: PackageError.java,v 1.12 2004-03-05 16:05:35 piso Exp $
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

public class PackageError extends LispError
{
    private final LispObject pkg;

    public PackageError(LispObject initArgs) throws ConditionThrowable
    {
        LispObject pkg = NIL;
        LispObject first, second;
        while (initArgs != NIL) {
            first = initArgs.car();
            initArgs = initArgs.cdr();
            second = initArgs.car();
            initArgs = initArgs.cdr();
            if (first == Keyword.PACKAGE)
                pkg = second;
        }
        this.pkg = pkg;
    }

    public PackageError(String message)
    {
        super(message);
        pkg = NIL;
    }

    public LispObject typeOf()
    {
        return Symbol.PACKAGE_ERROR;
    }

    public LispClass classOf()
    {
        return BuiltInClass.PACKAGE_ERROR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.PACKAGE_ERROR)
            return T;
        if (type == BuiltInClass.PACKAGE_ERROR)
            return T;
        return super.typep(type);
    }

    // ### package-error-package
    private static final Primitive1 PACKAGE_ERROR_PACKAGE =
        new Primitive1("package-error-package", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((PackageError)arg).pkg;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.PACKAGE_ERROR));
            }
        }
    };
}
