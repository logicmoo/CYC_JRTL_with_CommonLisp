/*
 * DiffFormatter.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: DiffFormatter.java,v 1.1.1.1 2002-09-24 16:07:59 piso Exp $
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

public final class DiffFormatter extends Formatter
{
    // Formats.
    private static final byte DIFF_FORMAT_TEXT     = 0;
    private static final byte DIFF_FORMAT_FILE     = 1;
    private static final byte DIFF_FORMAT_HEADER   = 2;
    private static final byte DIFF_FORMAT_CONTEXT  = 3;
    private static final byte DIFF_FORMAT_INSERTED = 4;
    private static final byte DIFF_FORMAT_DELETED  = 5;

    public DiffFormatter(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public LineSegmentList formatLine(Line line)
    {
        clearSegmentList();
        if (line == null || line.length() == 0) {
            addSegment("", DIFF_FORMAT_TEXT);
            return segmentList;
        }
        final String text = getDetabbedText(line);
        if (text.charAt(0) == '+' && !text.startsWith("+++")) {
            // Inserted line.
            addSegment(text, DIFF_FORMAT_INSERTED);
            return segmentList;
        }
        if (text.charAt(0) == '-' && !text.startsWith("---")) {
            // Deleted line.
            addSegment(text, DIFF_FORMAT_DELETED);
            return segmentList;
        }
        if (text.charAt(0) == ' ') {
            // Context line.
            addSegment(text, DIFF_FORMAT_CONTEXT);
            return segmentList;
        }
        if (text.charAt(0) == '?' || text.startsWith("Index: ")) {
            // File line.
            addSegment(text, DIFF_FORMAT_FILE);
            return segmentList;
        }
        // Otherwise, it must be a header line.
        addSegment(text, DIFF_FORMAT_HEADER);
        return segmentList;
    }

    public FormatTable getFormatTable()
    {
        if (formatTable == null) {
            formatTable = new FormatTable("DiffMode");
            formatTable.addEntryFromPrefs(DIFF_FORMAT_TEXT, "text");
            formatTable.addEntryFromPrefs(DIFF_FORMAT_FILE, "file", "text");
            formatTable.addEntryFromPrefs(DIFF_FORMAT_HEADER, "header", "comment");
            formatTable.addEntryFromPrefs(DIFF_FORMAT_CONTEXT, "context", "text");
            formatTable.addEntryFromPrefs(DIFF_FORMAT_INSERTED, "inserted", "text");
            formatTable.addEntryFromPrefs(DIFF_FORMAT_DELETED, "deleted", "text");
        }
        return formatTable;
    }
}
