/*
 * NntpSession.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: NntpSession.java,v 1.2 2002-10-02 17:50:35 piso Exp $
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import org.armedbear.j.Debug;
import org.armedbear.j.Editor;
import org.armedbear.j.FastStringBuffer;
import org.armedbear.j.Log;
import org.armedbear.j.ProgressNotifier;
import org.armedbear.j.Property;

public final class NntpSession
{
    private static final int DEFAULT_PORT = 119;

    private String host;
    private int port;
    private Socket socket;
    private BufferedReader reader;
    private OutputStreamWriter writer;
    private String groupName;
    private int count;
    private int first;
    private int last;

    public static final boolean DEFAULT_ECHO = false;

    private boolean echo = DEFAULT_ECHO;

    private NntpSession(String host, int port)
    {
        this.host = host;
        this.port = port;
    }

    public static NntpSession getSession()
    {
        return getSession(Editor.preferences().getStringProperty(Property.NEWS));
    }

    public static NntpSession getSession(String host)
    {
        if (host == null || host.length() == 0)
            return null;

        return new NntpSession(host, DEFAULT_PORT);
    }

    public void setEcho(boolean b)
    {
        echo = b;
    }

    public String getHost()
    {
        return host;
    }

    public int getCount()
    {
        return count;
    }

    public int getFirst()
    {
        return first;
    }

    public int getLast()
    {
        return last;
    }

    public String getArticle(int articleNumber, ProgressNotifier progressNotifier)
    {
        writeLine("ARTICLE ".concat(String.valueOf(articleNumber)));
        String response = readLine();
        if (response == null)
            return null;
        if (!response.startsWith("220"))
            return null;
        echo = false;
        if (progressNotifier != null)
            progressNotifier.progressStart();
        FastStringBuffer sb = new FastStringBuffer(1024);
        while (true) {
            String s = readLine();
            if (s == null)
                return null;
            if (s.equals("."))
                break;
            sb.append(s);
            sb.append("\r\n");
            if (progressNotifier != null) {
                progressNotifier.progress("Received ", sb.length(), 0);
                if (progressNotifier.cancelled()) {
                    Log.debug("getArticle cancelled!!");
                    abort();
                    break;
                }
            }
        }
        if (progressNotifier != null) {
            progressNotifier.progress("Received ", sb.length(), 0);
            progressNotifier.progressStop();
        }
        echo = DEFAULT_ECHO;
        return sb.toString();
    }

    public boolean connect()
    {
        Log.debug("connecting on port " + port + "...");
        boolean succeeded = false;
        try {
            socket = new Socket(host, port);
            Log.debug("connected!");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new OutputStreamWriter(socket.getOutputStream());
            readLine();
            return true;
        }
        catch (Exception e) {
            Log.error(e);
            return false;
        }
    }

    public boolean reconnect()
    {
        if (connect())
            if (selectGroup(groupName))
                return true;

        return false;
    }

    public void disconnect()
    {
        Log.debug("disconnecting...");
        writeLine("QUIT");
        readLine();
        abort();
    }

    private void abort()
    {
        if (socket != null) {
            try {
                socket.close();
            }
            catch (IOException e) {
                Log.error(e);
            }
            socket = null;
            reader = null;
            writer = null;
        }
    }

    public boolean selectGroup(String groupName)
    {
        writeLine("GROUP " + groupName);
        String response = readLine();
        if (!response.startsWith("211"))
            return false;
        this.groupName = groupName;
        StringTokenizer st = new StringTokenizer(response);
        String token = st.nextToken();
        Debug.assertTrue(token.equals("211"));
        count = Integer.parseInt(st.nextToken());
        Log.debug("count = " + count);
        first = Integer.parseInt(st.nextToken());
        Log.debug("first = " + first);
        last = Integer.parseInt(st.nextToken());
        Log.debug("last = " + last);
        return true;
    }

    public String readLine()
    {
        if (reader == null) {
            Debug.bug("readLine reader is null");
            return null;
        }
        try {
            String s = reader.readLine();
            if (echo && s != null)
                Log.debug("<== ".concat(s));
            return s;
        }
        catch (IOException e) {
            Log.error(e);
            return null;
        }
    }

    public boolean writeLine(String s)
    {
        if (writer == null)
            if (!reconnect())
                return false;
        if (echo)
            Log.debug("==> ".concat(s));
        try {
            writer.write(s);
            writer.write("\r\n");
            writer.flush();
            return true;
        }
        catch (Exception e) {
            Log.error(e);
        }
        // Things didn't go exactly as planned. Try to reconnect.
        Log.debug("writeLine trying to reconnect...");
        if (connect()) {
            if (selectGroup(groupName)) {
                if (echo)
                    Log.debug("==> ".concat(s));
                try {
                    writer.write(s);
                    writer.write("\r\n");
                    writer.flush();
                    return true;
                }
                catch (IOException e) {
                    Log.error(e);
                }
            }
        }
        return false;
    }
}
