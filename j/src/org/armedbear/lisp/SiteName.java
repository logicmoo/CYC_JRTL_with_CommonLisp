/*
 * SiteName.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: SiteName.java,v 1.1 2004-02-27 17:50:06 piso Exp $
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

    private static final Primitive0 MACHINE_INSTANCE =
        new Primitive0("machine-instance")
    {
        public LispObject execute()
        {
            return getHostName();
        }
    };

    private static final Primitive0 LONG_SITE_NAME =
        new Primitive0("long-site-name")
    {
        public LispObject execute()
        {
            return getHostName();
        }
    };

    private static final Primitive0 SHORT_SITE_NAME =
        new Primitive0("short-site-name")
    {
        public LispObject execute()
        {
            return getHostName();
        }
    };
}
