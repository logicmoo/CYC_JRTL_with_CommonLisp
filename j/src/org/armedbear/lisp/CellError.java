/*
 * CellError.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: CellError.java,v 1.5 2005-06-22 19:11:43 piso Exp $
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

public class CellError extends LispError
{
    public CellError(LispObject initArgs) throws ConditionThrowable
    {
        super(StandardClass.CELL_ERROR);
        initialize(initArgs);
    }

    protected CellError(LispClass cls)
    {
        super(cls);
    }

    protected void initialize(LispObject initArgs) throws ConditionThrowable
    {
        LispObject name = NIL;
        LispObject first, second;
        while (initArgs != NIL) {
            first = initArgs.car();
            initArgs = initArgs.cdr();
            second = initArgs.car();
            initArgs = initArgs.cdr();
            if (first == Keyword.NAME)
                name = second;
        }
        setCellName(name);
    }

    public final LispObject getCellName() throws ConditionThrowable
    {
        return getInstanceSlotValue(Symbol.NAME);
    }

    protected final void setCellName(LispObject name) throws ConditionThrowable
    {
        setInstanceSlotValue(Symbol.NAME, name);
    }

    public LispObject typeOf()
    {
        return Symbol.CELL_ERROR;
    }

    public LispObject classOf()
    {
        return StandardClass.CELL_ERROR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CELL_ERROR)
            return T;
        if (type == StandardClass.CELL_ERROR)
            return T;
        return super.typep(type);
    }

    public String writeToString() throws ConditionThrowable
    {
        if (_PRINT_ESCAPE_.symbolValue() == NIL)
            return super.writeToString();
        StringBuffer sb = new StringBuffer(typeOf().writeToString());
        sb.append(' ');
        sb.append(getCellName().writeToString());
        return unreadableString(sb.toString());
    }
}
