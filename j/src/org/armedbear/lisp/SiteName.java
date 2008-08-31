/*
 * SiteName.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id$
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

package org.armedbear.lisp;

import java.net.InetAddress;

public final class SiteName extends Lisp
{
    private static LispObject getHostName()
    {
        String hostName = null;
        try {
            InetAddress addr = InetAddress.getLocalHost();
            if (addr != null)
                hostName = addr.getHostName();
        }
        catch (Throwable t) {}
        return hostName != null ? new SimpleString(hostName) : NIL;
    }

    private static final Primitive MACHINE_INSTANCE =
        new Primitive("machine-instance")
    {
        public LispObject execute()
        {
            return getHostName();
        }
    };

    private static final Primitive LONG_SITE_NAME =
        new Primitive("long-site-name")
    {
        public LispObject execute()
        {
            return getHostName();
        }
    };

    private static final Primitive SHORT_SITE_NAME =
        new Primitive("short-site-name")
    {
        public LispObject execute()
        {
            return getHostName();
        }
    };
}
