/*
 * MessageFormatter.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: MessageFormatter.java,v 1.1.1.1 2002-09-24 16:10:13 piso Exp $
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

package org.armedbear.j.mail;

import gnu.regexp.RE;
import gnu.regexp.UncheckedRE;
import org.armedbear.j.Buffer;
import org.armedbear.j.Debug;
import org.armedbear.j.Editor;
import org.armedbear.j.FormatTable;
import org.armedbear.j.Formatter;
import org.armedbear.j.Line;
import org.armedbear.j.LineSegmentList;
import org.armedbear.j.Utilities;

public final class MessageFormatter extends Formatter
{
    private static final byte MESSAGE_FORMAT_TEXT         = 0;
    private static final byte MESSAGE_FORMAT_COMMENT      = 1;
    private static final byte MESSAGE_FORMAT_HEADER_NAME  = 2;
    private static final byte MESSAGE_FORMAT_HEADER_VALUE = 3;
    private static final byte MESSAGE_FORMAT_QUOTE        = 4;
    private static final byte MESSAGE_FORMAT_SIGNATURE    = 5;

    private static final RE quoteRE = new UncheckedRE("^[a-zA-Z]*>");

    // Includes '/' for "Parts/Attachments".
    private static final RE headerRE = new UncheckedRE("^ *[a-zA-Z\\-/]+:");

    private Line startOfBody;
    private Line startOfSignature;

    public MessageFormatter(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public synchronized LineSegmentList formatLine(Line line)
    {
        String text;
        if (Editor.tabsAreVisible())
            text = Utilities.makeTabsVisible(line.getText(), buffer.getTabWidth());
        else
            text = Utilities.detab(line.getText(), buffer.getTabWidth());
        clearSegmentList();
        String trim = text.trim();
        if (trim.length() == 0) {
            // Line is empty or all whitespace.
            addSegment(text, MESSAGE_FORMAT_TEXT);
            return segmentList;
        }
        if (startOfBody == null || line.lineNumber() < startOfBody.lineNumber()) {
            // We're in the message headers.
            if (text.length() > 0) {
                int i = text.indexOf(':');
                if (i >= 0 && headerRE.getMatch(text) != null) {
                    String headerName = text.substring(0, i).trim();
                    if (isKeyword(headerName)) {
                        addSegment(text, 0, i+1, MESSAGE_FORMAT_HEADER_NAME);
                        addSegment(text, i+1, MESSAGE_FORMAT_HEADER_VALUE);
                        return segmentList;
                    }
                }
            }
            if (line.flags() == MESSAGE_FORMAT_HEADER_VALUE)
                addSegment(text, MESSAGE_FORMAT_HEADER_VALUE);
            else
                addSegment(text, MESSAGE_FORMAT_COMMENT);
            return segmentList;
        }
        if (startOfSignature != null && line.lineNumber() >= startOfSignature.lineNumber()) {
            addSegment(text, MESSAGE_FORMAT_SIGNATURE);
            return segmentList;
        }
        char c = trim.charAt(0);
        if (c == '>') {
            if (trim.startsWith(">>>>> ")) {
                // Supercite attribution line.
                addSegment(text, MESSAGE_FORMAT_TEXT);
            } else if (trim.startsWith(">From ")) {
                addSegment(text, MESSAGE_FORMAT_TEXT);
            } else {
                addSegment(text, MESSAGE_FORMAT_QUOTE);
            }
            return segmentList;
        }
        if (c == ':' || c == '|') {
            addSegment(text, MESSAGE_FORMAT_QUOTE);
            return segmentList;
        }
        if (quoteRE.getMatch(text) != null) {
            addSegment(text, MESSAGE_FORMAT_QUOTE);
            return segmentList;
        }
        addSegment(text, MESSAGE_FORMAT_TEXT);
        return segmentList;
    }

    public synchronized boolean parseBuffer()
    {
        startOfBody = null;
        startOfSignature = null;
        for (Line line = buffer.getFirstLine(); line != null; line = line.next()) {
            if (buffer instanceof MessageBuffer) {
                if (line.lineNumber() == ((MessageBuffer)buffer).getHeaderLineCount()) {
                    if (startOfBody != null)
                        Debug.bug();
                    startOfBody = line;
                }
            }
            String text = line.getText();
            if (text == null)
                continue;
            if (text.length() == 0)
                continue;
            if (startOfBody == null) {
                if (buffer instanceof SendMail && text.equals(SendMail.getHeaderSeparator()))
                    startOfBody = line.next();
                else {
                    int i = text.indexOf(':');
                    if (i >= 0 && headerRE.getMatch(text) != null) {
                        String headerName = text.substring(0, i).trim();
                        if (isKeyword(headerName))
                            line.setFlags(MESSAGE_FORMAT_HEADER_VALUE);
                        else
                            line.setFlags(0);
                    }
                    else if (line.previous() != null)
                        line.setFlags(line.previous().flags());
                }
            } else {
                // We're in the body of the message.
                line.setFlags(0);
                text = text.trim();
                if (text.length() > 0 && buffer.getLineCount() - line.lineNumber() < 16) {
                    char c = text.charAt(0);
                    if (c == '_' || c == '-') {
                        // See if line is all underscores or all hyphens.
                        boolean all = true;
                        for (int i = text.length(); i-- > 0;) {
                            if (text.charAt(i) != c) {
                                all = false;
                                break;
                            }
                        }
                        // '-' by itself may be part of a diff.
                        if (all && text.length() > 1) {
                            startOfSignature = line;
                            break;
                        }
                    }
                }
            }
        }
        buffer.setNeedsParsing(false);
        return true;
    }

    public FormatTable getFormatTable()
    {
        if (formatTable == null) {
            formatTable = new FormatTable("MessageMode");
            formatTable.addEntryFromPrefs(MESSAGE_FORMAT_TEXT, "text");
            formatTable.addEntryFromPrefs(MESSAGE_FORMAT_COMMENT, "comment");
            formatTable.addEntryFromPrefs(MESSAGE_FORMAT_HEADER_NAME, "headerName", "keyword");
            formatTable.addEntryFromPrefs(MESSAGE_FORMAT_HEADER_VALUE, "headerValue", "operator");
            formatTable.addEntryFromPrefs(MESSAGE_FORMAT_QUOTE, "string");
            formatTable.addEntryFromPrefs(MESSAGE_FORMAT_SIGNATURE, "signature", "comment");
        }
        return formatTable;
    }
}
