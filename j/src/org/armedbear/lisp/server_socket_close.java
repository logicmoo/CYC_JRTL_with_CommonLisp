/*
 * server_socket_close.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: server_socket_close.java,v 1.1 2004-05-25 18:13:46 piso Exp $
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

import java.net.ServerSocket;

// ### %server-socket-close
public final class server_socket_close extends Primitive1
{
    private server_socket_close()
    {
        super("%server-socket-close", PACKAGE_SYS, false, "socket");
    }

    public LispObject execute(LispObject first)
        throws ConditionThrowable
    {
        try {
	    ServerSocket serverSocket = (ServerSocket) JavaObject.getObject(first);
	    serverSocket.close();
	    return T;
        }
        catch (Exception e) {
            return signal(new LispError(e.getMessage()));
        }
    }

    private static final Primitive1 SERVER_SOCKET_CLOSE = new server_socket_close();
}
