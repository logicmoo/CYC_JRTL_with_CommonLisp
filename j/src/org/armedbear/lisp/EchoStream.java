/*
 * EchoStream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: EchoStream.java,v 1.1 2004-01-20 02:22:32 piso Exp $
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

// FIXME Need to add echo functionality!
public final class EchoStream extends LispStream
{
    private final LispInputStream in;
    private final LispOutputStream out;

    public EchoStream(LispInputStream in, LispOutputStream out)
    {
        this.in = in;
        this.out = out;
    }

    public EchoStream(LispInputStream in, LispOutputStream out,
                      boolean interactive)
    {
        this.in = in;
        this.out = out;
        setInteractive(interactive);
    }

    public LispObject getElementType()
    {
        LispObject itype = in.getElementType();
        LispObject otype = out.getElementType();
        if (itype == otype)
            return itype;
        return Symbol.NULL; // FIXME
    }

    public LispInputStream getInputStream()
    {
        return in;
    }

    public LispOutputStream getOutputStream()
    {
        return out;
    }

    public LispObject typeOf()
    {
        return Symbol.ECHO_STREAM;
    }

    public LispClass classOf()
    {
        return BuiltInClass.ECHO_STREAM;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.ECHO_STREAM)
            return T;
        if (type == BuiltInClass.ECHO_STREAM)
            return T;
        return super.typep(type);
    }

    public LispObject close(LispObject abort) throws ConditionThrowable
    {
        in.close(abort);
        out.close(abort);
        setOpen(false);
        return T;
    }

    public String toString()
    {
        return unreadableString("ECHO-STREAM");
    }

    // ### make-echo-stream
    // input-stream output-stream => echo-stream
    private static final Primitive2 MAKE_ECHO_STREAM =
        new Primitive2("make-echo-stream","input-stream output-stream") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (!(first instanceof LispInputStream))
                return signal(new TypeError(first, "input stream"));
            if (!(second instanceof LispOutputStream))
                return signal(new TypeError(second, "output stream"));
            return new EchoStream((LispInputStream) first,
                                    (LispOutputStream) second);
        }
    };

    // ### echo-stream-input-stream
    // echo-stream => input-stream
    private static final Primitive1 ECHO_STREAM_INPUT_STREAM =
        new Primitive1("echo-stream-input-stream","echo-stream") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof EchoStream)
                return ((EchoStream)arg).getInputStream();
            return signal(new TypeError(arg, "echo-stream"));
        }
    };

    // ### echo-stream-output-stream
    // echo-stream => output-stream
    private static final Primitive1 ECHO_STREAM_OUTPUT_STREAM =
        new Primitive1("echo-stream-output-stream","echo-stream") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof EchoStream)
                return ((EchoStream)arg).getOutputStream();
            return signal(new TypeError(arg, "echo-stream"));
        }
    };
}
