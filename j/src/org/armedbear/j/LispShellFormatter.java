/*
 * LispShellFormatter.java
 *
 * Copyright (C) 1998-2003 Peter Graves
 * $Id: LispShellFormatter.java,v 1.7 2003-03-31 16:50:29 piso Exp $
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
    private static final byte FORMAT_TEXT    = 0;
    private static final byte FORMAT_COMMENT = 1;
    private static final byte FORMAT_PROMPT  = 2;
    private static final byte FORMAT_INPUT   = 3;

    private final RE defaultPromptRE =
        new UncheckedRE("^[^>\\*\\]]*[>\\*\\]] *");

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
        final String trim = text.trim();
        if (trim.length() > 0 && trim.charAt(0) == ';') {
            addSegment(text, FORMAT_COMMENT);
            return segmentList;
        }
        switch (line.flags()) {
            case STATE_PROMPT: {
                addSegment(text, FORMAT_PROMPT);
                return segmentList;
            }
            case STATE_INPUT: {
                int promptEnd = getPromptEndIndex(text);
                if (promptEnd > 0) {
                    addSegment(text, 0, promptEnd, FORMAT_PROMPT);
                    int commentStart = text.indexOf(';', promptEnd);
                    if (commentStart >= 0) {
                        addSegment(text, promptEnd, commentStart, FORMAT_INPUT);
                        addSegment(text, commentStart, FORMAT_COMMENT);
                    } else
                        addSegment(text, promptEnd, FORMAT_INPUT);
                } else {
                    // No prompt.
                    int commentStart = text.indexOf(';');
                    if (commentStart >= 0) {
                        addSegment(text, 0, commentStart, FORMAT_INPUT);
                        addSegment(text, commentStart, FORMAT_COMMENT);
                    } else
                        addSegment(text, FORMAT_INPUT);
                }
                return segmentList;
            }
            default:
                break;
        }
        if (line.next() == null) {
            // Last line of buffer. Check for prompt.
            int end = getPromptEndIndex(text);
            if (end > 0) {
                addSegment(text, 0, end, FORMAT_PROMPT);
                addSegment(text, end, FORMAT_INPUT);
                return segmentList;
            }
        }
        addSegment(text, FORMAT_TEXT);
        return segmentList;
    }

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
        final RE promptRE;
        if (buffer instanceof CommandInterpreter)
            promptRE = ((CommandInterpreter)buffer).getPromptRE();
        else
            promptRE = defaultPromptRE;
        REMatch match = promptRE.getMatch(text);
        if (match != null)
            return match.getEndIndex();
        return 0;
    }

    public boolean parseBuffer()
    {
        boolean changed = false;
        if (buffer instanceof LispShell) {
            Position pos = ((LispShell)buffer).getEndOfOutput();
            if (pos != null) {
                // Any lines beyond end of ouput must be input.
                for (Line line = pos.getLine().next(); line != null; line = line.next()) {
                    if (line.flags() != STATE_INPUT) {
                        line.setFlags(STATE_INPUT);
                        changed = true;
                    }
                }
            }
        }
        buffer.setNeedsParsing(false);
        return changed;
    }

    public FormatTable getFormatTable()
    {
        if (formatTable == null) {
            formatTable = new FormatTable("LispShellMode");
            formatTable.addEntryFromPrefs(FORMAT_TEXT, "text");
            formatTable.addEntryFromPrefs(FORMAT_COMMENT, "comment");
            formatTable.addEntryFromPrefs(FORMAT_PROMPT, "prompt");
            formatTable.addEntryFromPrefs(FORMAT_INPUT, "input" );
        }
        return formatTable;
    }
}
