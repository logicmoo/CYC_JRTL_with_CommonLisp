/*
 * LispSyntaxIterator.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: LispSyntaxIterator.java,v 1.1.1.1 2002-09-24 16:09:30 piso Exp $
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

package org.armedbear.j;

// Supports movement through the syntactically important text of a buffer,
// i.e. skipping whitespace and comments.
public final class LispSyntaxIterator extends DefaultSyntaxIterator
{
    public LispSyntaxIterator(Position pos)
    {
        super(pos);
    }

    // Returns char array with syntactic whitespace (quotes and comments)
    // replaced with actual space characters.
    public char[] hideSyntacticWhitespace(String s)
    {
        char[] chars = s.toCharArray();
        boolean inQuote = false;
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            char c = chars[i];
            if (inQuote) {
                chars[i] = ' ';
                if (c == '\\' && i < length-1) {
                    // Handle escape char.
                    chars[++i] = ' ';
                } else if (c == '"')
                    inQuote = false;
            } else if (c == '"') {
                inQuote = true;
                chars[i] = ' ';
            }
        }
        // Handle comment part if any.
        int index = -1;
        for (int i = 0; i < length-1; i++) {
            if (chars[i] == ';') {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            for (int i = index; i < length; i++)
                chars[i] = ' ';
        }
        return chars;
    }
}
