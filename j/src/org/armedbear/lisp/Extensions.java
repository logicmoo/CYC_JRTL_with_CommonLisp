/*
 * Extensions.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Extensions.java,v 1.7 2003-08-25 17:36:42 piso Exp $
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

public final class Extensions extends Lisp
{
    // ### special-variable-p
    private static final Primitive1 SPECIAL_VARIABLE_P =
        new Primitive1("special-variable-p", PACKAGE_EXT, true) {
        public LispObject execute(LispObject arg) throws Condition
        {
            return arg.isSpecialVariable() ? T : NIL;
        }
    };

    // ### charpos
    private static final Primitive1 CHARPOS =
        new Primitive1("charpos", PACKAGE_EXT, true) {
        public LispObject execute(LispObject arg) throws Condition
        {
            if (arg instanceof CharacterOutputStream)
                return new Fixnum(((CharacterOutputStream)arg).getCharPos());
            throw new TypeError(arg, "character output stream");
        }
    };

    // ### make-socket
    // make-socket host port => stream
    private static final Primitive2 MAKE_SOCKET =
        new Primitive2("make-socket", PACKAGE_EXT, true) {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            String host = LispString.getValue(first);
            int port = Fixnum.getValue(second);
            try {
                Socket socket = new Socket(host, port);
                CharacterInputStream in =
                    new CharacterInputStream(socket.getInputStream());
                CharacterOutputStream out =
                    new CharacterOutputStream(socket.getOutputStream());
                return new TwoWayStream(in, out);
            }
            catch (Exception e) {
                throw new LispError(e.getMessage());
            }
        }
    };
}
