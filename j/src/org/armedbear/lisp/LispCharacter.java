/*
 * LispCharacter.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: LispCharacter.java,v 1.4 2003-02-19 01:37:15 piso Exp $
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

public final class LispCharacter extends LispObject
{
    private final char c;

    public LispCharacter(char c)
    {
        this.c = c;
    }

    public LispObject typeOf()
    {
        return Symbol.CHARACTER;
    }

    public static char getValue(LispObject obj) throws LispError
    {
        try {
            return ((LispCharacter)obj).getValue();
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "character");
        }
    }

    public final char getValue()
    {
        return c;
    }

    public final String toString()
    {
        StringBuffer sb = new StringBuffer();
        if (_PRINT_ESCAPE_.symbolValueNoThrow() != NIL) {
            sb.append("#\\");
            switch (c) {
                case 0:
                    sb.append("Null");
                    break;
                case '\t':
                    sb.append("Tab");
                    break;
                case '\n':
                    sb.append("Newline");
                    break;
                case '\f':
                    sb.append("Page");
                    break;
                case '\r':
                    sb.append("Return");
                    break;
                case ' ':
                    sb.append("Space");
                    break;
                default:
                    sb.append(c);
                    break;
            }
        } else {
            sb.append(c);
        }
        return sb.toString();
    }
}
