/*
 * UnboundVariable.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: UnboundVariable.java,v 1.15 2005-10-23 16:39:49 piso Exp $
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

public final class UnboundVariable extends CellError
{
    // obj is either the unbound variable itself or an initArgs list.
    public UnboundVariable(LispObject obj) throws ConditionThrowable
    {
        super(StandardClass.UNBOUND_VARIABLE);
        if (obj instanceof Cons)
            initialize(obj);
        else
            setCellName(obj);
    }

    public String getMessage()
    {
        LispThread thread = LispThread.currentThread();
        SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
        thread.bindSpecial(Symbol.PRINT_ESCAPE, T);
        StringBuffer sb = new StringBuffer("The variable ");
        // FIXME
        try {
            sb.append(getCellName().writeToString());
        }
        catch (Throwable t) {}
        sb.append(" is unbound.");
        thread.lastSpecialBinding = lastSpecialBinding;
        return sb.toString();
    }

    public LispObject typeOf()
    {
        return Symbol.UNBOUND_VARIABLE;
    }

    public LispObject classOf()
    {
        return StandardClass.UNBOUND_VARIABLE;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.UNBOUND_VARIABLE)
            return T;
        if (type == StandardClass.UNBOUND_VARIABLE)
            return T;
        return super.typep(type);
    }
}
