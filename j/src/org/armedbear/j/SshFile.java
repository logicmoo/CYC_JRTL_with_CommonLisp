/*
 * SshFile.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: SshFile.java,v 1.3 2002-11-28 22:43:47 piso Exp $
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

public final class SshFile extends File
{
    public static final int DEFAULT_PORT = 22;

    private SshFile()
    {
        isRemote = true;
        protocol = PROTOCOL_SSH;
        port = DEFAULT_PORT;
    }

    public SshFile(String hostName, String path, String userName, String password, int port)
    {
        this();
        this.hostName = hostName;
        this.canonicalPath = path;
        this.userName = userName;
        this.password = password;
        this.port = port;
    }

    public static SshFile getSshFile(String name)
    {
        SshFile file = new SshFile();
        if (file.initRemote(name, PREFIX_SSH))
            return file;
        return null;
    }

    public static SshFile getSshFile(SshFile directory, String name)
    {
        SshFile file = new SshFile();

        file.hostName = directory.hostName;
        file.userName = directory.userName;
        file.password = directory.password;
        file.port = directory.port;

        if (Utilities.isFilenameAbsolute(name))
            file.canonicalPath = canonicalize(name, "/");
        else
            file.canonicalPath = canonicalize(appendNameToPath(directory.canonicalPath(), name, '/'), "/");

        return file;
    }

    public final File getRoot()
    {
        SshFile file = new SshFile();
        file.hostName = this.hostName;
        file.userName = this.userName;
        file.password = this.password;
        file.port = this.port;
        file.canonicalPath = "/";
        file.type = TYPE_DIRECTORY;
        return file;
    }

    public String netPath()
    {
        FastStringBuffer sb = new FastStringBuffer(256);
        sb.append(PREFIX_SSH);
        if (userName != null) {
            sb.append(userName);
            sb.append('@');
        }
        sb.append(hostName);
        if (port != DEFAULT_PORT) {
            sb.append(':');
            sb.append(port);
        }
        if (canonicalPath != null)
            sb.append(canonicalPath);
        return sb.toString();
    }

    public File getParentFile()
    {
        if (canonicalPath() == null || canonicalPath.equals("/"))
            return null; // No parent.
        int index = canonicalPath.lastIndexOf('/');
        if (index < 0)
            return null; // No parent.
        if (index == 0) // "/usr"
            return new SshFile(hostName, "/", userName, password, port);
        return new SshFile(hostName, canonicalPath.substring(0, index), userName, password, port);
    }

    public boolean isDirectory()
    {
        if (type == TYPE_LINK) {
            SshSession session = SshSession.getSession(this);
            if (session != null) {
                Debug.assertTrue(session.isLocked());
                boolean result = session.isDirectory(canonicalPath());
                session.unlock();
                return result;
            } else
                return false;
        }
        if (type == TYPE_UNKNOWN) {
            SshSession session = SshSession.getSession(this);
            if (session != null) {
                Debug.assertTrue(session.isLocked());
                if (session.isDirectory(canonicalPath()))
                    type = TYPE_DIRECTORY;
                session.unlock();
            }
        }
        return type == TYPE_DIRECTORY;
    }

    public boolean isLink()
    {
        return type == TYPE_LINK;
    }

    public boolean exists()
    {
        SshSession session = SshSession.getSession(this);
        if (session == null)
            return false;
        Debug.assertTrue(session.isLocked());
        boolean result = session.exists(canonicalPath());
        session.unlock();
        return result;
    }

    public String getDirectoryListing()
    {
        SshSession session = SshSession.getSession(this);
        if (session == null)
            return null;
        Debug.assertTrue(session.isLocked());
        String listing = session.retrieveDirectoryListing(this);
        session.unlock();
        return listing;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof SshFile))
            return false;
        SshFile f = (SshFile) obj;
        // Protocol.
        if (f.protocol != protocol)
            return false;
        // Port.
        if (f.port != port)
            return false;
        // Host name.
        if (f.hostName == null) {
            if (hostName != null)
                return false;
        } else if (!f.hostName.equals(hostName))
            return false;
        // Handle pathological corner case where both canonical paths are null.
        if (f.canonicalPath() == canonicalPath())
            return true;
        // At this point the canonical paths are cached for both files.
        // If either one is null, they can't be equal.
        if (f.canonicalPath == null || canonicalPath == null)
            return false;
        return f.canonicalPath.equals(canonicalPath);
    }
}
