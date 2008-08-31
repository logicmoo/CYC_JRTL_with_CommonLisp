/*
 * CapitalizeStream.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id$
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

public final class CapitalizeStream extends CaseFrobStream
{
    private boolean inWord;

    public CapitalizeStream(Stream target) throws ConditionThrowable
    {
        super(target);
    }

    public void _writeChar(char c) throws ConditionThrowable
    {
        if (inWord) {
            if (Character.isUpperCase(c)) {
                c = LispCharacter.toLowerCase(c);
            } else if (!Character.isLowerCase(c) && !Character.isDigit(c)) {
                inWord = false;
            }
        } else {
            // Not in a word.
            if (Character.isUpperCase(c)) {
                inWord = true;
            } else if (Character.isLowerCase(c)) {
                c = LispCharacter.toUpperCase(c);
                inWord = true;
            } else if (Character.isDigit(c)) {
                inWord = true;
            }
        }
        target._writeChar(c);
    }

    public void _writeString(String s) throws ConditionThrowable
    {
        final int limit = s.length();
        for (int i = 0; i < limit; i++)
            _writeChar(s.charAt(i));
    }

    public void _writeLine(String s) throws ConditionThrowable
    {
        target._writeString(s);
        target._writeChar('\n');
    }
}
