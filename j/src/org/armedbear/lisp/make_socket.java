/*
 * make_socket.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: make_socket.java,v 1.1 2004-03-09 02:00:21 piso Exp $
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
public final class make_socket extends Primitive3
{
    private make_socket()
    {
        super("%make-socket", PACKAGE_SYS, false, "host port element-type");
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        String host = first.getStringValue();
        int port = Fixnum.getValue(second);
        LispObject elementType = third; // Checked by caller.
        try {
            Socket socket = new Socket(host, port);
            Stream in =
                new Stream(socket.getInputStream(), elementType);
            Stream out =
                new Stream(socket.getOutputStream(), elementType);
            return new TwoWayStream(in, out);
        }
        catch (Exception e) {
            return signal(new LispError(e.getMessage()));
        }
    }

    private static final Primitive3 MAKE_SOCKET = new make_socket();
}
