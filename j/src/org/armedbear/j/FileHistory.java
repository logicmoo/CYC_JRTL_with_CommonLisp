/*
 * FileHistory.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: FileHistory.java,v 1.1.1.1 2002-09-24 16:08:42 piso Exp $
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

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;

public final class FileHistory extends HandlerBase implements DocumentHandler
{
    private static final int MAX_ENTRIES = 100;

    // Singleton.
    private static FileHistory fileHistory;

    private ArrayList list = new ArrayList();

    private File file;

    private FileHistory()
    {
        file = File.getInstance(Editor.getEditorDirectory(), "files.xml");
        if (file.isFile())
            load();
    }

    public static synchronized FileHistory getFileHistory()
    {
        if (fileHistory == null) {
            fileHistory = new FileHistory();
            Editor.protect(fileHistory);
        }
        return fileHistory;
    }

    public synchronized FileHistoryEntry findEntry(String canonicalPath)
    {
        final int limit = list.size();
        for (int i = 0; i < limit; i++) {
            FileHistoryEntry entry = (FileHistoryEntry) list.get(i);
            if (entry.getName().equals(canonicalPath))
                return entry;
        }
        return null;
    }

    public synchronized void store(FileHistoryEntry newEntry)
    {
        Debug.assertTrue(newEntry != null);
        Debug.assertTrue(newEntry.getName() != null);
        final int limit = list.size();
        for (int i = 0; i < limit; i++) {
            FileHistoryEntry entry = (FileHistoryEntry) list.get(i);
            if (entry.getName().equals(newEntry.getName())) {
                if (i == 0) {
                    list.set(0, newEntry);
                    return;
                }
                list.remove(i);
                break;
            }
        }
        // Add new entry.
        list.add(0, newEntry);
    }

    private void load()
    {
        Parser parser = null;
        try {
            // Jul 25 2000 8:41 PM
            // The following line works with IBM 1.3 for Windows, but
            // ParserFactory.makeParser does not. (Don't know why.)
            parser =
                (Parser) Class.forName("org.armedbear.j.aelfred.SAXDriver").newInstance();
        }
        catch (Exception e) {
            Log.error(e);
        }
        if (parser != null) {
            parser.setDocumentHandler(this);
            try {
                InputSource inputSource = new InputSource(file.getInputStream());
                parser.parse(inputSource);
            }
            catch (Exception e) {
                Log.error(e);
            }
        }
    }

    private FileHistoryEntry currentEntry = null;

    public void startElement(String name, AttributeList attributes)
        throws SAXException
    {
        if (name.equals("files")) {
            String version = attributes.getValue("version");
            if (!version.equals(getVersion()))
                throw new SAXException("Unknown file history format");
        } else if (name.equals("file")) {
            // Start a new entry.
            currentEntry = new FileHistoryEntry();
            currentEntry.setName(attributes.getValue("name"));
            currentEntry.setEncoding(attributes.getValue("encoding"));
            currentEntry.setMode(attributes.getValue("mode"));
            try {
                currentEntry.setWhen(Long.parseLong(attributes.getValue("when")));
            }
            catch (NumberFormatException e) {
                Log.error(e);
            }
        } else if (name.equals("property")) {
            Debug.assertTrue(currentEntry != null);
            String key = attributes.getValue("name");
            String value = attributes.getValue("value");
            Property property = Property.findProperty(key);
            if (property != null)
                currentEntry.setPropertyFromString(property, value);
        }
    }

    public void endElement(String name)
    {
        if (name.equals("file")) {
            list.add(currentEntry);
            currentEntry = null;
        }
    }

    public synchronized void save()
    {
        try {
            BufferedWriter writer =
                new BufferedWriter(new OutputStreamWriter(file.getOutputStream()));
            writer.write("<?xml version=\"1.0\"?>");
            writer.newLine();
            writer.write("<files version=\"" + getVersion() + "\">");
            writer.newLine();
            final int limit = Math.min(list.size(), MAX_ENTRIES);
            for (int i = 0; i < limit; i++) {
                FileHistoryEntry entry = (FileHistoryEntry) list.get(i);
                writer.write(entry.toXml());
                writer.newLine();
            }
            writer.write("</files>");
            writer.flush();
            writer.close();
        }
        catch (IOException e) {
            Log.error(e);
        }
    }

    private static final String getVersion()
    {
        return "2";
    }
}
