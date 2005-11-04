/*
 * assql.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: assql.java,v 1.4 2005-11-04 13:38:15 piso Exp $
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

// ### assql item alist => entry
public final class assql extends Primitive
{
    private assql()
    {
        super("assql", PACKAGE_EXT);
    }

    public LispObject execute(LispObject item, LispObject alist)
        throws ConditionThrowable
    {
        while (alist != NIL) {
            LispObject cons = alist.car();
            if (cons instanceof Cons) {
                if (cons.car().eql(item))
                    return cons;
            } else if (cons != NIL)
                return signalTypeError(cons, Symbol.LIST);
            alist = alist.cdr();
        }
        return NIL;
    }

    private static final Primitive ASSQL = new assql();
}
