/*
 * NewsGroupMessageBuffer.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: NewsGroupMessageBuffer.java,v 1.4 2002-11-15 17:20:16 piso Exp $
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

import java.awt.Image;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.List;
import javax.swing.SwingUtilities;
import org.armedbear.j.BackgroundProcess;
import org.armedbear.j.Buffer;
import org.armedbear.j.Editor;
import org.armedbear.j.EditorIterator;
import org.armedbear.j.File;
import org.armedbear.j.FastStringBuffer;
import org.armedbear.j.Headers;
import org.armedbear.j.ImageLine;
import org.armedbear.j.ImageLoader;
import org.armedbear.j.Line;
import org.armedbear.j.Log;
import org.armedbear.j.ProgressNotifier;
import org.armedbear.j.Property;
import org.armedbear.j.Sidebar;
import org.armedbear.j.StatusBarProgressNotifier;
import org.armedbear.j.TextLine;
import org.armedbear.j.Utilities;

public final class NewsGroupMessageBuffer extends MessageBuffer
{
    private NewsGroupSummary summary;
    private boolean cancelled = false;

    public NewsGroupMessageBuffer(NewsGroupSummary summary,
        NewsGroupSummaryEntry entry)
    {
        super();
        this.mailbox = this.summary = summary;
        setEntry(entry);
        initializeUndo();
        type = TYPE_NORMAL;
        lineSeparator = "\n";
        mode = MessageMode.getMode();
        formatter = mode.getFormatter(this);
        readOnly = true;
        setLoaded(true);
        setBusy(true);
        new Thread(loadProcess).start();
    }

    public NewsGroupSummary getSummary()
    {
        return summary;
    }

    public NewsGroupSummaryEntry getNewsGroupSummaryEntry()
    {
        return (NewsGroupSummaryEntry) entry;
    }

    private void setEntry(NewsGroupSummaryEntry entry)
    {
        this.entry = entry;
        reset();
        title = entry.formatSubject();
        Sidebar.setUpdateFlagInAllFrames(SIDEBAR_REPAINT_BUFFER_LIST);
    }

    public void nextArticle()
    {
        NewsGroupSummaryEntry nextEntry =
            (NewsGroupSummaryEntry) summary.getNextUndeleted(entry);
        if (nextEntry != null) {
            empty();
            for (EditorIterator it = new EditorIterator(); it.hasNext();) {
                Editor ed = it.nextEditor();
                if (ed.getBuffer() == this) {
                    ed.setDot(null);
                    ed.setMark(null);
                    ed.setTopLine(null);
                    ed.repaintNow();
                }
            }
            setBusy(true);
            setEntry(nextEntry);
            new Thread(loadProcess).start();
        } else
            Editor.currentEditor().status("Last article");
    }

    public void previousArticle()
    {
        NewsGroupSummaryEntry prevEntry =
            (NewsGroupSummaryEntry) summary.getPreviousUndeleted(entry);
        if (prevEntry != null) {
            empty();
            for (EditorIterator it = new EditorIterator(); it.hasNext();) {
                Editor ed = it.nextEditor();
                if (ed.getBuffer() == this) {
                    ed.setDot(null);
                    ed.setMark(null);
                    ed.setTopLine(null);
                    ed.repaintNow();
                }
            }
            setBusy(true);
            setEntry(prevEntry);
            new Thread(loadProcess).start();
        } else
            Editor.currentEditor().status("First article");
    }

    private final BackgroundProcess loadProcess = new BackgroundProcess()
    {
        private ProgressNotifier progressNotifier;

        public void run()
        {
            setBackgroundProcess(this);
            progressNotifier = new StatusBarProgressNotifier(NewsGroupMessageBuffer.this);
            cancelled = false;
            loadMessage(progressNotifier);
            progressNotifier.setText("");
            progressNotifier.progressStop();
            setBackgroundProcess(null);
        }

        public void cancel()
        {
            Log.debug("loadProcess cancelled!!");
            cancelled = true;
            progressNotifier.cancel();
            summary.getSession().abort();
            setBusy(false);
            kill();
        }
    };

    protected void loadMessage(ProgressNotifier progressNotifier)
    {
        final String rawText =
            summary.getArticle(((NewsGroupSummaryEntry)entry).getArticleNumber(),
                progressNotifier);
        if (cancelled)
            return;
        if (rawText != null) {
            message = new Message(rawText);
            parseMessage();
            title = message.getHeaderValue(Headers.SUBJECT);
            if (title == null)
                title = "";
            allHeaders = message.getAllHeaders();
            defaultHeaders = getDefaultHeaders(allHeaders);
            rawBody = message.getRawBody();
            setText();
            setLoaded(true);
            formatter.parseBuffer();
            entry.setFlags(entry.getFlags() | MailboxEntry.SEEN);
            summary.updateEntry(entry);
        }
        Runnable r = new Runnable() {
            public void run()
            {
                setBusy(false);
                if (rawText != null) {
                    for (EditorIterator it = new EditorIterator(); it.hasNext();) {
                        Editor ed = it.nextEditor();
                        if (ed.getBuffer() == NewsGroupMessageBuffer.this) {
                            ed.setDot(getFirstLine(), 0);
                            ed.moveCaretToDotCol();
                            ed.getDisplay().setTopLine(getFirstLine());
                            ed.setUpdateFlag(REPAINT);
                            ed.updateDisplay();
                        }
                    }
                    Sidebar.repaintBufferListInAllFrames();
                }
            }
        };
        SwingUtilities.invokeLater(r);
    }

    private void appendBody(String rawBody)
    {
        BufferedReader reader = new BufferedReader(new StringReader(rawBody));
        try {
            String s;
            while ((s = reader.readLine()) != null) {
                if (s.length() >= 9 && s.startsWith("begin ")) {
                    // "begin 644 filename" or "begin 0644 filename"
                    // Skip "begin ".
                    String trim = s.substring(6).trim();
                    // Next token is permission.
                    String permission = null;
                    int index = trim.indexOf(' ');
                    if (index >= 0) {
                        permission = trim.substring(0, index);
                        trim = trim.substring(index + 1);
                    }
                    String extension = Utilities.getExtension(trim);
                    File encoded =
                        Utilities.getTempFile(Editor.getTempDirectory(), ".encoded");
                    File decoded =
                        Utilities.getTempFile(Editor.getTempDirectory(), extension);
                    FastStringBuffer sb = new FastStringBuffer("begin ");
                    sb.append("644 ");
                    sb.append(decoded.getName());
                    BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(encoded.getOutputStream()));
                    writer.write(sb.toString());
                    writer.write('\n');
                    while ((s = reader.readLine()) != null) {
                        writer.write(s);
                        writer.write('\n');
                        if (s.equals("end")) {
                            writer.flush();
                            writer.close();
                            break;
                        }
                    }
                    // BUG! This won't work on Windows!
                    sb.setText("(\\cd \"");
                    sb.append(Editor.getTempDirectory().canonicalPath());
                    sb.append("\" && \\uudecode \"");
                    sb.append(encoded.getName());
                    sb.append("\")");
                    String[] cmdarray = {"/bin/sh", "-c", sb.toString()};
                    Process process = Runtime.getRuntime().exec(cmdarray);
                    if (process != null)
                        process.waitFor();
                    ImageLoader loader = new ImageLoader(decoded);
                    Image image = loader.loadImage();
                    if (image != null) {
                        final int lineHeight = new TextLine("").getHeight();
                        final int imageHeight = image.getHeight(null);
                        final int imageWidth = image.getWidth(null);
                        int y = 0;
                        while (y < imageHeight) {
                            Rectangle r = new Rectangle(0, y, imageWidth,
                                Math.min(lineHeight, imageHeight - y));
                            appendLine(new ImageLine(image, r));
                            y += lineHeight;
                        }
                    }
                } else if (s.length() > 0 && s.charAt(0) == 0) {
                    // Don't append a string composed entirely of null bytes.
                    boolean empty = true;
                    for (int i = s.length()-1; i > 0; i--) {
                        if (s.charAt(i) != 0) {
                            empty = false;
                            break;
                        }
                    }
                    if (empty)
                        appendLine("");
                    else
                        appendLine(s);
                } else {
                    // Normal text.
                    appendLine(s);
                }
            }
            renumber();
            invalidate();
        }
        catch (Exception e) {
            Log.error(e);
        }
    }

    public void viewInline()
    {
        Line line;
        for (line = getFirstLine(); line != null; line = line.next()) {
            if (line.length() == 0)
                break; // Reached end of headers.
        }
        for (; line != null; line = line.next()) {
            String s = line.getText();
            if (s.startsWith("Inline: ")) {
                String filename = s.substring(8);
                File f =
                    File.getInstance(Editor.getTempDirectory(), filename);
                if (f.isFile()) {
                    Editor editor = Editor.currentEditor();
                    Buffer buf = editor.openFile(f);
                    editor.makeNext(buf);
                    editor.activate(buf);
                    editor.maybeKillBuffer(this);
                    return;
                }
            }
        }
    }

    public void toggleHeaders()
    {
        showFullHeaders = !showFullHeaders;
        empty();
        setText();
        formatter.parseBuffer();
        for (EditorIterator it = new EditorIterator(); it.hasNext();) {
            Editor ed = it.nextEditor();
            if (ed.getBuffer() == this) {
                ed.setDot(getFirstLine(), 0);
                ed.setTopLine(ed.getDotLine());
                ed.setMark(null);
                ed.repaintDisplay();
            }
        }
    }

    public void toggleRaw()
    {
        showRawText = !showRawText;
        empty();
        setText();
        formatter.parseBuffer();
        for (EditorIterator it = new EditorIterator(); it.hasNext();) {
            Editor ed = it.nextEditor();
            if (ed.getBuffer() == this) {
                ed.setDot(getFirstLine(), 0);
                ed.setTopLine(ed.getDotLine());
                ed.setMark(null);
                ed.repaintDisplay();
            }
        }
        Editor.currentEditor().status("Raw mode ".concat((showRawText ? "on" : "off")));
    }

    protected void setText()
    {
        empty();
        if (showRawText) {
            super.setText();
            return;
        }
        String contentType = message.getContentType();
        if (contentType != null && contentType.startsWith("image/"))
            super.setText();
        else {
            List parts = message.getParts();
            if (parts != null && parts.size() > 0) {
                super.setText();
            } else {
                // Not MIME multipart.
                String headers;
                if (showFullHeaders)
                    headers = allHeaders;
                else if (Editor.preferences().getBooleanProperty(Property.BEAUTIFY_HEADERS))
                    headers = getBeautifiedHeaders();
                else
                    headers = defaultHeaders;
                try {
                    lockWrite();
                }
                catch (InterruptedException e) {
                    Log.debug(e);
                    return;
                }
                try {
                    appendHeaderLines(headers);
                    headerLineCount = Utilities.countLines(headers);
                    appendHeaderLine("");
                    appendBody(message.getRawBody());
                }
                finally {
                    unlockWrite();
                }
            }
        }
    }
}
