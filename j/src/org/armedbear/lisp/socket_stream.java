/*
 * socket_stream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: socket_stream.java,v 1.4 2007-02-23 21:17:36 piso Exp $
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

// ### %socket-stream
public final class socket_stream extends Primitive
{
    private socket_stream()
    {
        super("%socket-stream", PACKAGE_SYS, false, "socket element-type");
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        Socket socket = (Socket) ((JavaObject)first).getObject();
        LispObject elementType = second; // Checked by caller.
        try {
             Stream in =
                 new Stream(socket.getInputStream(), elementType);
             Stream out =
                 new Stream(socket.getOutputStream(), elementType);
             return new SocketStream(socket, in, out);
        }
        catch (Exception e) {
            return error(new LispError(e.getMessage()));
	}
    }

    private static final Primitive SOCKET_STREAM = new socket_stream();
}
