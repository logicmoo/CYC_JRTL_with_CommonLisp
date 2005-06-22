/*
 * UnboundSlot.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: UnboundSlot.java,v 1.6 2005-06-22 19:12:11 piso Exp $
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

public final class UnboundSlot extends CellError
{
    public UnboundSlot(LispObject initArgs) throws ConditionThrowable
    {
        super(StandardClass.UNBOUND_SLOT);
        initialize(initArgs);
    }

    protected void initialize(LispObject initArgs) throws ConditionThrowable
    {
        super.initialize(initArgs);
        LispObject first, second;
        while (initArgs != NIL) {
            first = initArgs.car();
            initArgs = initArgs.cdr();
            second = initArgs.car();
            if (first == Keyword.INSTANCE) {
                setInstance(second);
                break;
            }
            initArgs = initArgs.cdr();
        }
    }

    public LispObject getInstance() throws ConditionThrowable
    {
        return getInstanceSlotValue(Symbol.INSTANCE);
    }

    private void setInstance(LispObject instance) throws ConditionThrowable
    {
        setInstanceSlotValue(Symbol.INSTANCE, instance);
    }

    public String getMessage()
    {
        try {
            StringBuffer sb = new StringBuffer("The slot ");
            sb.append(safeWriteToString(getCellName()));
            sb.append(" is unbound in the object ");
            sb.append(safeWriteToString(getInstance()));
            sb.append('.');
            return sb.toString();
        }
        catch (Throwable t) {
            Debug.trace(t);
            return null;
        }
    }

    public LispObject typeOf()
    {
        return Symbol.UNBOUND_SLOT;
    }

    public LispObject classOf()
    {
        return StandardClass.UNBOUND_SLOT;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.UNBOUND_SLOT)
            return T;
        if (type == StandardClass.UNBOUND_SLOT)
            return T;
        return super.typep(type);
    }
}
