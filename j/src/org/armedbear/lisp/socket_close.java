/*
 * socket_close.java
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

import java.net.Socket;

// ### %socket-close
public final class socket_close extends Primitive
{
    private socket_close()
    {
        super("%socket-close", PACKAGE_SYS, false, "socket");
    }

    public LispObject execute(LispObject first)
        throws ConditionThrowable
    {
	Socket socket = (Socket) JavaObject.getObject(first);
        try {
	    socket.close();
	    return T;
        }
        catch (Exception e) {
            return error(new LispError(e.getMessage()));
        }
    }

    private static final Primitive SOCKET_CLOSE = new socket_close();
}
