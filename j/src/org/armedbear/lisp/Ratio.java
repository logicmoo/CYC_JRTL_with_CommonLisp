/*
 * Ratio.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Ratio.java,v 1.1 2003-03-21 11:51:50 piso Exp $
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

import java.math.BigInteger;

public final class Ratio extends LispObject
{
    private BigInteger numerator;
    private BigInteger denominator;

    public Ratio(BigInteger numerator, BigInteger denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public BigInteger numerator()
    {
        return numerator;
    }

    public BigInteger denominator()
    {
        return denominator;
    }

    public LispObject typeOf()
    {
        return Symbol.RATIO;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.RATIO)
            return T;
        if (typeSpecifier == Symbol.NUMBER)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject constantp()
    {
        return T;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer(String.valueOf(numerator));
        sb.append('/');
        sb.append(String.valueOf(denominator));
        return sb.toString();
    }
}
