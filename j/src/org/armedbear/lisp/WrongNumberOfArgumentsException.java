/*
 * WrongNumberOfArgumentsException.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: WrongNumberOfArgumentsException.java,v 1.10 2005-11-01 01:38:58 piso Exp $
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

public final class WrongNumberOfArgumentsException extends ProgramError
{
    private final Operator operator;

    public WrongNumberOfArgumentsException(Operator operator)
        throws ConditionThrowable
    {
        // This is really just an ordinary PROGRAM-ERROR, broken out into its
        // own Java class as a convenience for the implementation.
        super(StandardClass.PROGRAM_ERROR);
        this.operator = operator;
    }

    public String getMessage()
    {
        FastStringBuffer sb =
            new FastStringBuffer("Wrong number of arguments");
        LispObject lambdaName = operator.getLambdaName();
        if (lambdaName != null && lambdaName != NIL) {
            sb.append(" for ");
            try {
                sb.append(operator.getLambdaName().writeToString());
            }
            catch (Throwable t) {
                Debug.trace(t);
            }
        }
        sb.append('.');
        return sb.toString();
    }
}
