/*
 * FileError.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: FileError.java,v 1.2 2004-01-16 11:47:26 piso Exp $
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

public final class FileError extends LispError
{
    private LispObject pathname = NIL;

    // initArgs is either a normal initArgs list or a pathname.
    public FileError(LispObject initArgs) throws ConditionThrowable
    {
        super(initArgs);
        if (initArgs instanceof Cons) {
            LispObject pathname = NIL;
            LispObject first, second;
            while (initArgs != NIL) {
                first = initArgs.car();
                initArgs = initArgs.cdr();
                second = initArgs.car();
                initArgs = initArgs.cdr();
                if (first == Keyword.PATHNAME) {
                    pathname = second;
                    break;
                }
            }
            this.pathname = pathname;
        } else
            pathname = initArgs;
    }

    public FileError(String message)
    {
        super(message);
    }

    public LispObject getPathname()
    {
        return pathname;
    }

    public LispObject typeOf()
    {
        return Symbol.FILE_ERROR;
    }

    public LispClass classOf()
    {
        return BuiltInClass.FILE_ERROR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.FILE_ERROR)
            return T;
        if (type == BuiltInClass.FILE_ERROR)
            return T;
        return super.typep(type);
    }
}
