/*
 * JVar.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: JVar.java,v 1.4 2004-11-28 15:44:25 piso Exp $
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

import java.util.ArrayList;
import org.armedbear.lisp.ConditionThrowable;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Symbol;

public final class JVar extends LispObject
{
    private static final Symbol J_VARIABLE_VALUE =
        LispAPI.PACKAGE_J_INTERNALS.addInternalSymbol("J-VARIABLE-VALUE");

    private final Property property;

    private JVar(String name, Property property)
    {
        this.property = property;
        try {
            Symbol symbol = LispAPI.PACKAGE_J.findAccessibleSymbol(name);
            if (symbol == null)
                symbol = LispAPI.PACKAGE_J.addExternalSymbol(name);
            put(symbol, J_VARIABLE_VALUE, this);
        }
        catch (Throwable t) {
            Log.error(t);
        }
    }

    public Property getProperty()
    {
        return property;
    }

    public static JVar getJVar(Symbol symbol) throws ConditionThrowable
    {
        LispObject obj = get(symbol, J_VARIABLE_VALUE, null);
        if (obj instanceof JVar)
            return (JVar) obj;
        throw new ConditionThrowable(new LispError(String.valueOf(symbol) +
            " is not defined as an editor variable"));
    }

    public static synchronized void addVariableForProperty(Property property)
    {
        new JVar(property.getLispName(), property);
    }

    public String toString()
    {
        FastStringBuffer sb = new FastStringBuffer("#<J-VARIABLE @ #x");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(">");
        return sb.toString();
    }
}
