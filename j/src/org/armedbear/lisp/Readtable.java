/*
 * Readtable.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Readtable.java,v 1.1 2003-03-09 17:31:15 piso Exp $
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

import java.util.ArrayList;

public final class Readtable extends LispObject
{
    private ArrayList table = new ArrayList();

    public Readtable()
    {
    }

    public LispObject getDispatchMacroCharacter(char dispChar,
        char subChar)
    {
        synchronized (table) {
            for (int i = 0; i < table.size(); i++) {
                Entry e = (Entry) table.get(i);
                if (e.dispChar == dispChar && e.subChar == subChar)
                    return e.function;
            }
        }
        return NIL;
    }

    public LispObject setDispatchMacroCharacter(char dispChar,
        char subChar, LispObject function)
    {
        synchronized (table) {
            for (int i = 0; i < table.size(); i++) {
                Entry e = (Entry) table.get(i);
                if (e.dispChar == dispChar && e.subChar == subChar) {
                    e.function = function;
                    return T;
                }
            }
            // Not found.
            table.add(new Entry(dispChar, subChar, function));
                return T;
        }
    }

    private static class Entry
    {
        char dispChar;
        char subChar;
        LispObject function;

        Entry(char dispChar, char subChar, LispObject function)
        {
            this.dispChar = dispChar;
            this.subChar = subChar;
            this.function = function;
        }
    }
}
