/*
 * FelineFormatter.java
 *
 * Copyright (C) 2016 Peter Graves <gnooth@gmail.com>
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.armedbear.j;

public final class FelineFormatter extends Formatter
{
    private static final int FELINE_STATE_NEUTRAL     = 0;
    private static final int FELINE_STATE_COMMENT     = 1;
    private static final int FELINE_STATE_AFTER_COLON = 2;
    private static final int FELINE_STATE_NAME        = 3;

    private static final int FELINE_FORMAT_TEXT       = 0;
    private static final int FELINE_FORMAT_COMMENT    = 1;
    private static final int FELINE_FORMAT_NAME       = 2;
    private static final int FELINE_FORMAT_BRACE      = 3;

    public FelineFormatter(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public LineSegmentList formatLine(Line line)
    {
        clearSegmentList();
        final String text = getDetabbedText(line);
        final int limit = text.length();
        int state = FELINE_STATE_NEUTRAL;
        if (limit > 0) {
            int start = 0;
            int i = 0;
            while (i < limit) {
                char c = text.charAt(i);
                if (state == FELINE_STATE_AFTER_COLON) {
                    if (c != ' ') {
                        if (i > start)
                            addSegment(text, start, i, FELINE_FORMAT_TEXT);
                        state = FELINE_STATE_NAME;
                        start = i;
                    }
                    ++i;
                    continue;
                }
                if (state == FELINE_STATE_NAME) {
                    if (c == ' ') {
                        if (i > start)
                            addSegment(text, start, i, FELINE_FORMAT_NAME);
                        state = FELINE_STATE_NEUTRAL;
                        start = i;
                    }
                    ++i;
                    continue;
                }
                if (state == FELINE_STATE_COMMENT) {
                    if (c == ')') {
                        addSegment(text, start, i+1, FELINE_FORMAT_COMMENT);
                        state = FELINE_STATE_NEUTRAL;
                        start = i+1;
                    }
                    ++i;
                    continue;
                }
                // Not in FELINE_STATE_COMMENT.
                if (c == '(') {
                    if (i > 0 && text.charAt(i-1) > ' ') {
                        ++i;
                        continue;
                    }
                    if (i >= limit-1 || text.charAt(i+1) > ' ') {
                        ++i;
                        continue;
                    }
                    if (i > start)
                        addSegment(text, start, i, FELINE_FORMAT_TEXT);
                    state = FELINE_STATE_COMMENT;
                    start = i;
                    ++i;
                    if (i < limit)
                        ++i;
                    continue;
                }
                if (c == '!') {
                    if (i == 0 || text.charAt(i-1) == ' ') {
                        if (i < limit - 1 && text.charAt(i+1) == ' ') {
                            if (i > start)
                                addSegment(text, start, i, FELINE_FORMAT_TEXT);
                            addSegment(text, i, FELINE_FORMAT_COMMENT);
                            return segmentList;
                        }
                    }
                }
                if (c == '/') {
                    if (i < limit - 1 && text.charAt(i+1) == '/') {
                        if (i > start)
                            addSegment(text, start, i, FELINE_FORMAT_TEXT);
                        addSegment(text, i, FELINE_FORMAT_COMMENT);
                        return segmentList;
                    }
                }
                if (c == ':') {
                    if ((i == 0 || text.charAt(i-1) == ' ') &&
                        (i == limit-1 || text.charAt(i+1) == ' ')) {
                        if (i > start)
                            addSegment(text, start, i, FELINE_FORMAT_TEXT);
                        state = FELINE_STATE_AFTER_COLON;
                        start = i;
                        ++i;
                        continue;
                    }
                }
//                 if (c == '[' || c == ']') {
//                     addSegment(text, start, i, FELINE_FORMAT_TEXT);
//                     addSegment(text, i, i+1, FELINE_FORMAT_BRACE);
//                     start = i+1;
//                     ++i;
//                     continue;
//                 }
                ++i;
            }
            int format = FELINE_FORMAT_TEXT;
            if (state == FELINE_STATE_COMMENT)
                format = FELINE_FORMAT_COMMENT;
            else if (state == FELINE_STATE_NAME)
                format = FELINE_FORMAT_NAME;
            addSegment(text, start, format);
        }
        return segmentList;
    }

    public FormatTable getFormatTable()
    {
        if (formatTable == null) {
            formatTable = new FormatTable(null);
            formatTable.addEntryFromPrefs(FELINE_FORMAT_TEXT, "text");
            formatTable.addEntryFromPrefs(FELINE_FORMAT_COMMENT, "comment");
            formatTable.addEntryFromPrefs(FELINE_FORMAT_BRACE, "brace");
            formatTable.addEntryFromPrefs(FELINE_FORMAT_NAME, "function");
        }
        return formatTable;
    }
}
