/*
 * WrongNumberOfArgumentsException.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: WrongNumberOfArgumentsException.java,v 1.7 2005-04-05 15:36:59 piso Exp $
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
    {
        this.operator = operator;
    }

    public String getMessage()
    {
        StringBuffer sb = new StringBuffer("Wrong number of arguments");
        if (operator.getLambdaName() != null) {
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
