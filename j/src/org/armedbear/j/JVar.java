/*
 * JVar.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: JVar.java,v 1.2 2003-09-19 17:42:09 piso Exp $
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
    private static final ArrayList variables = new ArrayList();

    private static final Symbol J_VARIABLE_VALUE =
        LispAPI.PACKAGE_J_INTERNALS.addInternalSymbol("J-VARIABLE-VALUE");

    private Property property;

    private JVar(String name, Property property)
    {
        this.property = property;
        Symbol symbol = LispAPI.PACKAGE_J.findAccessibleSymbol(name);
        if (symbol == null)
            symbol = LispAPI.PACKAGE_J.addExternalSymbol(name);
        try {
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
        if (!(obj instanceof JVar))
            throw new ConditionThrowable(new LispError(String.valueOf(symbol) +
                                                       " is not defined as an editor variable"));
        return (JVar) obj;
    }

    public static void addVariableForProperty(Property property)
    {
        variables.add(new JVar(property.getLispName(), property));
    }
}
