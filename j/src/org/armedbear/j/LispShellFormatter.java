/*
 * LispShellFormatter.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: LispShellFormatter.java,v 1.1 2002-10-19 14:06:57 piso Exp $
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

import gnu.regexp.RE;
import gnu.regexp.REMatch;
import gnu.regexp.UncheckedRE;

public final class LispShellFormatter extends Formatter
{
    // Formats.
    private static final byte FORMAT_TEXT   = 0;
    private static final byte FORMAT_PROMPT = 1;
    private static final byte FORMAT_INPUT  = 2;

    public LispShellFormatter(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public LineSegmentList formatLine(Line line)
    {
        clearSegmentList();
        if (line == null) {
            addSegment("", FORMAT_TEXT);
            return segmentList;
        }
        final String text = getDetabbedText(line);
        if (line.flags() == STATE_PROMPT) {
            addSegment(text, FORMAT_PROMPT);
            return segmentList;
        }
        if (line.flags() == STATE_INPUT) {
            int end = getPromptEndIndex(text);
            if (end > 0) {
                addSegment(text, 0, end, FORMAT_PROMPT);
                addSegment(text, end, FORMAT_INPUT);
            } else {
                // No prompt.
                addSegment(text, FORMAT_INPUT);
            }
            return segmentList;
        }
        Line next = line.next();
        if (next == null) {
            // Last line of buffer. Check for prompt.
            int end = getPromptEndIndex(text);
            if (end > 0) {
                addSegment(text, 0, end, FORMAT_PROMPT);
                addSegment(text, end, FORMAT_INPUT);
            } else
                addSegment(text, FORMAT_INPUT);
            return segmentList;
        }
        addSegment(text, FORMAT_TEXT);
        return segmentList;
    }

    private final RE promptRE = new UncheckedRE("^[^>\\*\\]]*[>\\*\\]] *");

    private int getPromptEndIndex(String text)
    {
        if (text.length() == 0)
            return 0;
        String trim = text.trim();
        if (trim.length() == 0)
            return 0;
        if (trim.charAt(0) == '(')
            return 0; // Don't mistake "(* " for a prompt!
        if (text.startsWith("> "))
            return 2;
        if (text.startsWith("* "))
            return 2;
        REMatch match = promptRE.getMatch(text);
        if (match != null)
            return match.getEndIndex();
        return 0;
    }

    public FormatTable getFormatTable()
    {
        if (formatTable == null) {
            formatTable = new FormatTable("ShellMode");
            formatTable.addEntryFromPrefs(FORMAT_TEXT, "text");
            formatTable.addEntryFromPrefs(FORMAT_PROMPT, "prompt");
            formatTable.addEntryFromPrefs(FORMAT_INPUT, "input" );
        }
        return formatTable;
    }
}
