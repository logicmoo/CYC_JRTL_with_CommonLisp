/*
 * make_server_socket.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: make_server_socket.java,v 1.1 2004-05-25 18:12:51 piso Exp $
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

// ### %make-server-socket
public final class make_server_socket extends Primitive1
{
    private make_server_socket()
    {
        super("%make-server-socket", PACKAGE_SYS, false, "port element-type");
    }

    public LispObject execute(LispObject first)
        throws ConditionThrowable
    {
        int port = Fixnum.getValue(first);
        try {
            ServerSocket socket = new ServerSocket(port);
            return new JavaObject(socket);
        }
        catch (Exception e) {
            return signal(new LispError(e.getMessage()));
        }
    }

    private static final Primitive1 MAKE_SERVER_SOCKET = new make_server_socket();
}
