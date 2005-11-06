/*
 * UnboundSlot.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: UnboundSlot.java,v 1.8 2005-11-06 20:40:53 piso Exp $
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
        while (initArgs != NIL) {
            LispObject first = initArgs.car();
            initArgs = initArgs.cdr();
            if (first == Keyword.INSTANCE) {
                setInstance(initArgs.car());
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

    public String getMessage() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
        thread.bindSpecial(Symbol.PRINT_ESCAPE, T);
        try {
            FastStringBuffer sb = new FastStringBuffer("The slot ");
            sb.append(getCellName().writeToString());
            sb.append(" is unbound in the object ");
            sb.append(getInstance().writeToString());
            sb.append('.');
            return sb.toString();
        }
        finally {
            thread.lastSpecialBinding = lastSpecialBinding;
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
