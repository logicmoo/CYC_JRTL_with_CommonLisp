/*
 * WebFormatter.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: WebFormatter.java,v 1.1.1.1 2002-09-24 16:08:45 piso Exp $
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

import java.awt.Color;
import java.awt.Font;

public final class WebFormatter extends Formatter implements WebConstants
{
    public WebFormatter(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public final LineSegmentList formatLine(Line line)
    {
        LineSegmentList list =
            line instanceof WebLine ? ((WebLine)line).getSegmentList() : null;
        if (list == null) {
            list = new LineSegmentList();
            list.addSegment(new HtmlLineSegment("", 0));
        }
        return list;
    }

    public final Color getColor(int format)
    {
        return super.getColor(format & ~(FORMAT_BOLD | FORMAT_ITALIC));
    }

    public int getStyle(int format)
    {
        FormatTableEntry entry =
            getFormatTable().lookup(format & ~(FORMAT_BOLD | FORMAT_ITALIC));
        int style = entry != null ? entry.getStyle() : Font.PLAIN;
        if ((format & FORMAT_BOLD) != 0)
            style |= Font.BOLD;
        else if ((format & FORMAT_ITALIC) != 0)
            style |= Font.ITALIC;
        return style;
    }

    public final FormatTableEntry getFormatTableEntry(int format)
    {
        return null;
    }

    public final boolean getUnderline(int format)
    {
        if ((format & FORMAT_WHITESPACE) != 0)
            return false;
        else
            return (format & FORMAT_LINK) != 0;
    }

    public FormatTable getFormatTable()
    {
        if (formatTable == null) {
            formatTable = new FormatTable("WebMode");
            formatTable.addEntryFromPrefs(FORMAT_TEXT, "text");
            formatTable.addEntryFromPrefs(FORMAT_LINK, "link", "keyword");
            formatTable.addEntryFromPrefs(FORMAT_WHITESPACE, "text");
            formatTable.addEntryFromPrefs(FORMAT_DISABLED, "disabled");
        }
        return formatTable;
    }
}
