/*
 * LispFormatter.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: LispFormatter.java,v 1.7 2002-12-23 07:46:48 piso Exp $
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

public final class LispFormatter extends Formatter
{
    // States.
    private static final int STATE_OPEN_PAREN              = STATE_LAST + 1;
    private static final int STATE_CLOSE_PAREN             = STATE_LAST + 2;
    private static final int STATE_CAR                     = STATE_LAST + 3;
    private static final int STATE_DEFUN                   = STATE_LAST + 4;
    private static final int STATE_DEFINITION              = STATE_LAST + 5;
    private static final int STATE_NAME                    = STATE_LAST + 6;
    private static final int STATE_SUBSTITUTION            = STATE_LAST + 7;
    private static final int STATE_SECONDARY_KEYWORD       = STATE_LAST + 8;
    private static final int STATE_PUNCTUATION             = STATE_LAST + 9;
    private static final int STATE_ARGLIST                 = STATE_LAST + 10;

    // Formats.
    private static final int LISP_FORMAT_TEXT              = 0;
    private static final int LISP_FORMAT_COMMENT           = 1;
    private static final int LISP_FORMAT_STRING            = 2;
    private static final int LISP_FORMAT_KEYWORD           = 3;
    private static final int LISP_FORMAT_DEFUN             = 4;
    private static final int LISP_FORMAT_NAME              = 5;
    private static final int LISP_FORMAT_PARENTHESIS       = 6;
    private static final int LISP_FORMAT_PUNCTUATION       = 7;
    private static final int LISP_FORMAT_SUBSTITUTION      = 8;
    private static final int LISP_FORMAT_SECONDARY_KEYWORD = 9;

    private final Mode mode;

    public LispFormatter(Buffer buffer)
    {
        this.buffer = buffer;
        this.mode = buffer.getMode();
    }

    private int tokenBegin = 0;

    private void endToken(String text, int tokenEnd, int state)
    {
        if (tokenEnd - tokenBegin > 0) {
            int format = -1;
            switch (state) {
                case STATE_NEUTRAL:
                case STATE_ARGLIST:
                    format = LISP_FORMAT_TEXT;
                    break;
                case STATE_QUOTE:
                    format = LISP_FORMAT_STRING;
                    break;
                case STATE_OPEN_PAREN:
                case STATE_CLOSE_PAREN:
                    format = LISP_FORMAT_PARENTHESIS;
                    break;
                case STATE_CAR: {
                    String token = text.substring(tokenBegin, tokenEnd).trim();
                    if (token.startsWith("def"))
                        format = LISP_FORMAT_DEFUN;
                    else if (isKeyword(token))
                        format = LISP_FORMAT_KEYWORD;
                    else
                        format = LISP_FORMAT_TEXT;
                    break;
                }
                case STATE_NAME:
                    format = LISP_FORMAT_NAME;
                    break;
                case STATE_DEFINITION:
                case STATE_IDENTIFIER:
                    format = LISP_FORMAT_TEXT;
                    break;
                case STATE_SECONDARY_KEYWORD:
                    format = LISP_FORMAT_SECONDARY_KEYWORD;
                    break;
                case STATE_SUBSTITUTION:
                    format = LISP_FORMAT_SUBSTITUTION;
                    break;
                case STATE_COMMENT:
                    format = LISP_FORMAT_COMMENT;
                    break;
                case STATE_PUNCTUATION:
                    format = LISP_FORMAT_PUNCTUATION;
            }
            if (format < 0) {
                Log.debug("endToken unhandled case state = " + state);
                format = LISP_FORMAT_TEXT;
            }
            addSegment(text, tokenBegin, tokenEnd, format);
            tokenBegin = tokenEnd;
        }
    }

    private void parseLine(Line line)
    {
        final String text = getDetabbedText(line);
        tokenBegin = 0;
        int state = line.flags();
        clearSegmentList();
        final int limit = text.length();
        int i = 0;
        // Skip whitespace at start of line.
        while (i < limit) {
            if (Character.isWhitespace(text.charAt(i))) {
                ++i;
            } else {
                endToken(text, i, state);
                break;
            }
        }
        while (i < limit) {
            char c = text.charAt(i);
            if (c == '\\' && i < limit-1) {
                i += 2;
                continue;
            }
            if (state == STATE_COMMENT) {
                if (c == '|' && i < limit-1) {
                    c = text.charAt(i+1);
                    if (c == '#') {
                        i += 2;
                        endToken(text, i, state);
                        state = STATE_NEUTRAL;
                        continue;
                    }
                }
                ++i;
                continue;
            }
            if (state == STATE_QUOTE) {
                if (c == '"') {
                    endToken(text, i+1, state);
                    state = STATE_NEUTRAL;
                }
                ++i;
                continue;
            }
            // Reaching here, we're not in a comment or quoted string.
            if (c == '"') {
                endToken(text, i, state);
                state = STATE_QUOTE;
                ++i;
                continue;
            }
            if (c == ';') {
                endToken(text, i, state);
                endToken(text, limit, STATE_COMMENT);
                return;
            }
            if (c == '#' && i < limit-1) {
                c = text.charAt(i+1);
                if (c == '|') {
                    endToken(text, i, state);
                    state = STATE_COMMENT;
                    i += 2;
                    continue;
                }
            }
            if (c == '`') {
                endToken(text, i, state);
                state = STATE_PUNCTUATION;
                ++i;
                endToken(text, i, state);
                state = STATE_NEUTRAL;
                continue;
            }
            if (c == ',') {
                endToken(text, i, state);
                state = STATE_PUNCTUATION;
                ++i;
                if (i < limit) {
                    c = text.charAt(i);
                    if (c == '@' || c == '.')
                        ++i;
                }
                endToken(text, i, state);
                state = STATE_SUBSTITUTION;
                continue;
            }
            if (state == STATE_ARGLIST) {
                if (c == '(') {
                    endToken(text, i, state);
                    ++i;
                    endToken(text, i, STATE_OPEN_PAREN);
                    continue;
                }
            }
            if (c == '(') {
                endToken(text, i, state);
                state = STATE_OPEN_PAREN;
                ++i;
                continue;
            }
            if (c == ')') {
                endToken(text, i, state);
                state = STATE_CLOSE_PAREN;
                ++i;
                continue;
            }
            if (state == STATE_OPEN_PAREN) {
                if (c == ':' || c == '&') {
                    endToken(text, i, state);
                    state = STATE_SECONDARY_KEYWORD;
                } else if (!Character.isWhitespace(c)) {
                    endToken(text, i, state);
                    state = STATE_CAR;
                }
                ++i;
                continue;
            }
            if (state == STATE_CLOSE_PAREN) {
                if (c != ')') {
                    endToken(text, i, state);
                    state = STATE_NEUTRAL;
                }
            }
            if (state == STATE_CAR) {
                if (Character.isWhitespace(c)) {
                    endToken(text, i, state);
                    LineSegment s = segmentList.getLastSegment();
                    if (s != null && s.getFormat() == LISP_FORMAT_DEFUN)
                        state = STATE_DEFINITION;
                    else
                        state = STATE_NEUTRAL;
                }
                ++i;
                continue;
            }
            if (state == STATE_NAME) {
                if (!mode.isIdentifierPart(c)) {
                    endToken(text, i, state);
                    state = STATE_ARGLIST;
                }
                ++i;
                continue;
            }
            if (state == STATE_IDENTIFIER ||
                state == STATE_SECONDARY_KEYWORD ||
                state == STATE_SUBSTITUTION) {
                if (!mode.isIdentifierPart(c)) {
                    endToken(text, i, state);
                    state = STATE_NEUTRAL;
                }
                ++i;
                continue;
            }
            if (state == STATE_DEFINITION) {
                if (mode.isIdentifierStart(c))
                    state = STATE_NAME;
                ++i;
                continue;
            }
            if (state == STATE_NEUTRAL || state == STATE_ARGLIST) {
                if (c == ':' || c == '&') {
                    endToken(text, i, state);
                    state = STATE_SECONDARY_KEYWORD;
                } else if (mode.isIdentifierStart(c)) {
                    endToken(text, i, state);
                    state = STATE_IDENTIFIER;
                } else // Still neutral...
                    ;
            }
            ++i;
        }
        endToken(text, i, state);
    }

    public LineSegmentList formatLine(Line line)
    {
        if (line == null) {
            clearSegmentList();
            addSegment("", LISP_FORMAT_TEXT);
            return segmentList;
        }
        parseLine(line);
        return segmentList;
    }

    public boolean parseBuffer()
    {
        int state = STATE_NEUTRAL;
        boolean changed = false;
        Line line = buffer.getFirstLine();
        while (line != null) {
            int oldflags = line.flags();
            if (state != oldflags) {
                line.setFlags(state);
                changed = true;
            }
            int limit = line.length();
            for (int i = 0; i < limit; i++) {
                char c = line.charAt(i);
                if (c == '\\' && i < limit-1) {
                    // Escape.
                    ++i;
                    continue;
                }
                if (state == STATE_COMMENT) {
                    if (c == '|' && i < limit-1 && line.charAt(i+1) == '#') {
                        ++i;
                        state = STATE_NEUTRAL;
                    }
                    continue;
                }
                if (state == STATE_QUOTE) {
                    if (c == '"')
                        state = STATE_NEUTRAL;
                    continue;
                }
                // Not in comment or quoted string.
                if (c == ';') {
                    // Single-line comment beginning. Ignore rest of line.
                    break;
                }
                if (c == '#') {
                    if (i < limit-1 && line.charAt(i+1) == '|') {
                        state = STATE_COMMENT;
                        ++i;
                    }
                    continue;
                }
                if (c == '"') {
                    state = STATE_QUOTE;
                    continue;
                }
                if (c == '(') {
                    state = STATE_OPEN_PAREN;
                    continue;
                }
                if (state == STATE_OPEN_PAREN) {
                    if (!Character.isWhitespace(c))
                        state = STATE_CAR;
                    continue;
                }
                if (state == STATE_CAR) {
                    if (c == ')' || Character.isWhitespace(c))
                        state = STATE_NEUTRAL;
                    continue;
                }
            }
            line = line.next();
        }
        buffer.setNeedsParsing(false);
        return changed;
    }

    public FormatTable getFormatTable()
    {
        if (formatTable == null) {
            formatTable = new FormatTable("LispMode");
            formatTable.addEntryFromPrefs(LISP_FORMAT_TEXT, "text");
            formatTable.addEntryFromPrefs(LISP_FORMAT_COMMENT, "comment");
            formatTable.addEntryFromPrefs(LISP_FORMAT_STRING, "string");
            formatTable.addEntryFromPrefs(LISP_FORMAT_KEYWORD, "keyword");
            formatTable.addEntryFromPrefs(LISP_FORMAT_DEFUN, "keyword");
            formatTable.addEntryFromPrefs(LISP_FORMAT_NAME, "function");
            formatTable.addEntryFromPrefs(LISP_FORMAT_PARENTHESIS,
                                          "parenthesis","text");
            formatTable.addEntryFromPrefs(LISP_FORMAT_PUNCTUATION,
                                          "punctuation", "text");
            formatTable.addEntryFromPrefs(LISP_FORMAT_SUBSTITUTION,
                                          "substitution", "text");
            formatTable.addEntryFromPrefs(LISP_FORMAT_SECONDARY_KEYWORD,
                                          "secondaryKeyword", "text");
        }
        return formatTable;
    }
}
