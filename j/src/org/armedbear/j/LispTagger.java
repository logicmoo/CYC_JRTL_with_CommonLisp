/*
 * LispTagger.java
 *
 * Copyright (C) 1998-2002 Peter Graves
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

import java.util.ArrayList;

public final class LispTagger extends Tagger
{
    // States.
    private static final int NEUTRAL    = 0;
    private static final int OPEN_PAREN = 1;
    private static final int DEFUN      = 2;

    private static final Mode mode = LispMode.getMode();

    public LispTagger(SystemBuffer buffer)
    {
        super(buffer);
    }

    public void run()
    {
        ArrayList tags = new ArrayList();
        Position pos = new Position(buffer.getFirstLine(), 0);
        int state = NEUTRAL;
        while (!pos.atEnd()) {
            char c = pos.getChar();
            if (Character.isWhitespace(c)) {
                pos.skipWhitespace();
                continue;
            }
            if (c == '\\') {
                // Escape.
                if (pos.getOffset() < pos.getLineLength()-1)
                    pos.skip(2);
                else {
                    Line nextLine = pos.getNextLine();
                    if (nextLine == null)
                        break;
                    pos.moveTo(nextLine, 0);
                }
                continue;
            }
            if (c == '#' && pos.lookingAt("#|")) {
                pos.skip(2);
                skipComment(pos);
                continue;
            }
            if (c == '\"') {
                pos.skipQuote();
                continue;
            }
            if (c == ';') {
                // Comment.
                Line nextLine = pos.getNextLine();
                if (nextLine == null)
                    break;
                pos.moveTo(nextLine, 0);
                continue;
            }
            if (c == '(') {
                state = OPEN_PAREN;
                pos.next();
                continue;
            }
            if (mode.isIdentifierStart(c)) {
                if (state == DEFUN) {
                    Position tokenStart = pos.copy();
                    String token = gatherToken(pos);
                    LocalTag tag = new LispTag(token, tokenStart);
                    tags.add(tag);
                    state = NEUTRAL;
                    continue;
                }
                if (state == OPEN_PAREN) {
                    String preceding =
                        pos.getLine().substring(0, pos.getOffset()).trim();
                    if (!preceding.equals("(")) {
                        state = NEUTRAL;
                        continue;
                    }
                    if (LispMode.isDefiner(gatherToken(pos)))
                        state = DEFUN;
                    else
                        state = NEUTRAL;
                    continue;
                }
                skipToken(pos);
                continue;
            }
            state = NEUTRAL;
            pos.next();
        }
        buffer.setTags(tags);
    }

    // Advances pos past token.
    private String gatherToken(Position pos)
    {
        FastStringBuffer sb = new FastStringBuffer();
        char c;
        while (mode.isIdentifierPart(c = pos.getChar())) {
            sb.append(c);
            if (!pos.next())
                break;
        }
        return sb.toString();
    }

    // Advances pos past token.
    private void skipToken(Position pos)
    {
        while (mode.isIdentifierPart(pos.getChar())) {
            if (!pos.next())
                return;
        }
    }

    private void skipComment(Position pos)
    {
        while (!pos.atEnd()) {
            char c = pos.getChar();
            if (c == '\\') {
                // Escape.
                if (pos.getOffset() < pos.getLineLength()-1)
                    pos.skip(2);
                else {
                    Line nextLine = pos.getNextLine();
                    if (nextLine == null)
                        break;
                    pos.moveTo(nextLine, 0);
                }
                continue;
            }
            if (c == '|' && pos.lookingAt("|#")) {
                pos.skip(2);
                return;
            }
            pos.next();
        }
    }
}
