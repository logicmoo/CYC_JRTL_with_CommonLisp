/*
 * make_socket.java
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

// ### %make-socket
public final class make_socket extends Primitive
{
    private make_socket()
    {
        super("%make-socket", PACKAGE_SYS, false, "host port");
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        String host = first.getStringValue();
        int port = Fixnum.getValue(second);
        try {
            Socket socket = new Socket(host, port);
            return new JavaObject(socket);
        }
        catch (Exception e) {
            return error(new LispError(e.getMessage()));
        }
    }

    private static final Primitive MAKE_SOCKET = new make_socket();
}
