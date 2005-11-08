/*
 * get_properties.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: get_properties.java,v 1.6 2005-11-08 16:17:30 piso Exp $
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

// ### get-properties
public final class get_properties extends Primitive
{
    private get_properties()
    {
        super(Symbol.GET_PROPERTIES, "plist indicator-list");
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject plist = first;
        while (plist != NIL) {
            if (plist.cdr() instanceof Cons) {
                LispObject indicator = ((Cons)plist).car;
                LispObject indicators = second;
                while (indicators instanceof Cons) {
                    if (indicator == ((Cons)indicators).car)
                        return thread.setValues(indicator, plist.cadr(), plist);
                    indicators = ((Cons)indicators).cdr;
                }
                if (indicators != NIL)
                    return signalTypeError(indicators, Symbol.LIST);
                plist = plist.cddr();
            } else
                return signalTypeError(plist.cdr(), Symbol.CONS);
        }
        return thread.setValues(NIL, NIL, NIL);
    }

    private static final Primitive GET_PROPERTIES = new get_properties();
}
