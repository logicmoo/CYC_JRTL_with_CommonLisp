/*
 * Macro.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Macro.java,v 1.6 2003-05-29 19:27:53 piso Exp $
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

public final class Macro extends Closure
{
    public Macro(LispObject parameters, LispObject body, Environment env)
        throws LispError
    {
        super(parameters, body, env);
        Debug.assertTrue(false);
    }

    public final int getType()
    {
        return TYPE_MACRO;
    }

    public LispObject execute(LispObject args, Environment env)
        throws Condition
    {
        LispObject[] argArray = args.cdr().copyToArray();
        if (envVar != NIL)
            Debug.assertTrue(false);
//         if (envVar != NIL && envVar instanceof Symbol) {
//             Environment ext = new Environment(env);
//             bind((Symbol)envVar, env, ext);
//             return execute(argArray, ext);
//         }
        return execute(argArray);
    }

    public final String toString()
    {
        StringBuffer sb = new StringBuffer("#<MACRO ");
        sb.append(super.toString());
        sb.append('>');
        return sb.toString();
    }
}
