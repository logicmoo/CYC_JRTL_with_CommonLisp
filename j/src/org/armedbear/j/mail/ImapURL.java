/*
 * ImapURL.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: ImapURL.java,v 1.1.1.1 2002-09-24 16:10:11 piso Exp $
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

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import org.armedbear.j.FastStringBuffer;

public final class ImapURL extends MailboxURL
{
    private static final int DEFAULT_PORT = 143;

    private String folderName;

    public ImapURL(String s) throws MalformedURLException
    {
        if (!s.startsWith("{"))
            throw new MalformedURLException();
        int index = s.indexOf('}');
        if (index < 0)
            throw new MalformedURLException();
        host = s.substring(1, index);
        folderName = s.substring(index + 1);
        port = DEFAULT_PORT;
        index = host.indexOf(':');
        if (index >= 0) {
            try {
                port = Integer.parseInt(host.substring(index + 1));
            }
            catch (Exception e) {
                throw new MalformedURLException();
            }
            host = host.substring(0, index);
        }
        index = host.indexOf('@');
        if (index >= 0) {
            user = host.substring(0, index);
            host = host.substring(index + 1);
        }
        if (folderName.equalsIgnoreCase("inbox"))
            folderName = "inbox";
    }

    public final String getFolderName()
    {
        return folderName;
    }

    public final List getFolderPathComponents()
    {
        ArrayList list = new ArrayList();
        int begin = 0;
        while (true) {
            int index = folderName.indexOf('/', begin);
            if (index < 0) {
                list.add(folderName.substring(begin));
                break;
            } else {
                list.add(folderName.substring(begin, index));
                begin = index + 1;
                if (begin >= folderName.length())
                    break;
            }
        }
        return list;
    }

    public boolean equals(Object object)
    {
        if (!(object instanceof ImapURL))
            return false;
        ImapURL url = (ImapURL) object;
        if (host != url.host) {
            if (host == null)
                return false;
            if (!host.equals(url.host))
                return false;
        }
        if (folderName != url.folderName) {
            if (folderName == null)
                return false;
            if (!folderName.equals(url.folderName))
                return false;
        }
        if (user != url.user) {
            if (user == null)
                return false;
            if (!user.equals(url.user))
                return false;
        }
        if (port != url.port)
            return false;
        return true;
    }

    public String toString()
    {
        FastStringBuffer sb = new FastStringBuffer('{');
        if (user != null) {
            sb.append(user);
            sb.append('@');
        }
        sb.append(host);
        if (port != DEFAULT_PORT) {
            sb.append(':');
            sb.append(port);
        }
        sb.append('}');
        sb.append(folderName);
        return sb.toString();
    }

    public String getCanonicalName()
    {
        FastStringBuffer sb = new FastStringBuffer('{');
        if (user != null)
            sb.append(user);
        else
            sb.append(System.getProperty("user.name"));
        sb.append('@');
        sb.append(host);
        sb.append(':');
        sb.append(port);
        sb.append('}');
        sb.append(folderName);
        return sb.toString();
    }
}
