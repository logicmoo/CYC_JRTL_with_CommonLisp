/*
 * AbstractBuffer.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: AbstractBuffer.java,v 1.1.1.1 2002-09-24 16:08:43 piso Exp $
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

import java.util.List;

public abstract class AbstractBuffer
{
    public static final int TYPE_SYSTEM           =  0;
    public static final int TYPE_NORMAL           =  1;
    public static final int TYPE_ARCHIVE          =  2;
    public static final int TYPE_DIRECTORY        =  3;
    public static final int TYPE_SHELL            =  4;
    public static final int TYPE_COMPILATION      =  5;
    public static final int TYPE_MAN              =  6;
    public static final int TYPE_OUTPUT           =  7;
    public static final int TYPE_IMAGE            =  8;
    public static final int TYPE_MAILBOX          =  9;
    public static final int TYPE_TELNET           = 10;
    public static final int TYPE_SSH              = 11;
    public static final int TYPE_LIST_OCCURRENCES = 12;

    protected int type = TYPE_SYSTEM;

    private Line firstLine;

    private List tags;

    public final int getType()
    {
        return type;
    }

    public final Line getFirstLine()
    {
        return firstLine;
    }

    public final void setFirstLine(Line line)
    {
        firstLine = line;
    }

    public final Position getEnd()
    {
        Line line = firstLine;
        if (line == null)
            return null;
        while (line.next() != null)
            line = line.next();
        return new Position(line, line.length());
    }

    public final List getTags()
    {
        return tags;
    }

    public final void setTags(List tags)
    {
        this.tags = tags;
    }

    public abstract int load();
}
