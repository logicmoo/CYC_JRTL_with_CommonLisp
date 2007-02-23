/*
 * ForwardReferencedClass.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: ForwardReferencedClass.java,v 1.4 2007-02-23 21:17:33 piso Exp $
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

public class ForwardReferencedClass extends LispClass
{
    public ForwardReferencedClass(Symbol name)
    {
        super(name);
    }

    public LispObject typeOf()
    {
        return Symbol.FORWARD_REFERENCED_CLASS;
    }

    public LispObject classOf()
    {
        return StandardClass.FORWARD_REFERENCED_CLASS;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.FORWARD_REFERENCED_CLASS)
            return T;
        if (type == StandardClass.FORWARD_REFERENCED_CLASS)
            return T;
        return super.typep(type);
    }

    public String writeToString() throws ConditionThrowable
    {
        StringBuffer sb =
            new StringBuffer(Symbol.FORWARD_REFERENCED_CLASS.writeToString());
        if (symbol != null) {
            sb.append(' ');
            sb.append(symbol.writeToString());
        }
        return unreadableString(sb.toString());
    }

    // ### make-forward-referenced-class
    private static final Primitive MAKE_FORWARD_REFERENCED_CLASS =
        new Primitive("make-forward-referenced-class", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            try {
                Symbol name = (Symbol) arg;
                ForwardReferencedClass c = new ForwardReferencedClass(name);
                LispClass.addClass(name, c);
                return c;
            }
            catch (ClassCastException e) {
                return error(new TypeError(arg.writeToString() +
                                            " is not a valid class name."));
            }
        }
    };
}
