/*
 * get_properties.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: get_properties.java,v 1.2 2004-03-17 17:58:29 piso Exp $
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
public final class get_properties extends Primitive2
{
    private get_properties()
    {
        super("get-properties", "plist indicator-list");
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject plist = first;
        while (plist != NIL) {
            if (plist.cdr().atom())
                return signal(new TypeError("Malformed property list: " + first + "."));
            if (memq(plist.car(), second))
                return thread.setValues(plist.car(), plist.cadr(), plist);
            plist = plist.cddr();
        }
        return thread.setValues(NIL, NIL, NIL);
    }

    private static final get_properties GET_PROPERTIES = new get_properties();
}
