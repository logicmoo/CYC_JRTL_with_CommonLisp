/*
 * TwoWayStream.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: TwoWayStream.java,v 1.18 2004-02-13 17:05:27 piso Exp $
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

public final class TwoWayStream extends Stream
{
    private final Stream in;
    private final Stream out;

    public TwoWayStream(Stream in, Stream out)
    {
        this.in = in;
        this.out = out;
        isInputStream = true;
        isOutputStream = true;
    }

    public TwoWayStream(Stream in, Stream out, boolean interactive)
    {
        this(in, out);
        setInteractive(interactive);
    }

    public LispObject getElementType() throws ConditionThrowable
    {
        LispObject itype = in.getElementType();
        LispObject otype = out.getElementType();
        if (itype == otype)
            return itype;
        return Symbol.NULL; // FIXME
    }

    public Stream getInputStream()
    {
        return in;
    }

    public Stream getOutputStream()
    {
        return out;
    }

    public LispObject typeOf()
    {
        return Symbol.TWO_WAY_STREAM;
    }

    public LispClass classOf()
    {
        return BuiltInClass.TWO_WAY_STREAM;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.TWO_WAY_STREAM)
            return T;
        if (type == BuiltInClass.TWO_WAY_STREAM)
            return T;
        return super.typep(type);
    }

    public LispObject close(LispObject abort) throws ConditionThrowable
    {
        // "The effect of CLOSE on a constructed stream is to close the
        // argument stream only. There is no effect on the constituents of
        // composite streams."
        setOpen(false);
        return T;
    }

    public String toString()
    {
        return unreadableString("TWO-WAY-STREAM");
    }

    // ### make-two-way-stream
    // input-stream output-stream => two-way-stream
    private static final Primitive2 MAKE_TWO_WAY_STREAM =
        new Primitive2("make-two-way-stream", "input-stream output-stream")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (!(first instanceof Stream))
                return signal(new TypeError(first, Symbol.STREAM));
            if (!(second instanceof Stream))
                return signal(new TypeError(second, Symbol.STREAM));
            Stream in = (Stream) first;
            if (!in.isInputStream())
                return signal(new TypeError(in, "input stream"));
            Stream out = (Stream) second;
            if (!out.isOutputStream())
                return signal(new TypeError(out, "output stream"));
            return new TwoWayStream(in, out);
        }
    };

    // ### two-way-stream-input-stream
    // two-way-stream => input-stream
    private static final Primitive1 TWO_WAY_STREAM_INPUT_STREAM =
        new Primitive1("two-way-stream-input-stream", "two-way-stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof TwoWayStream)
                return ((TwoWayStream)arg).getInputStream();
            return signal(new TypeError(arg, Symbol.TWO_WAY_STREAM));
        }
    };

    // ### two-way-stream-output-stream
    // two-way-stream => output-stream
    private static final Primitive1 TWO_WAY_STREAM_OUTPUT_STREAM =
        new Primitive1("two-way-stream-output-stream", "two-way-stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof TwoWayStream)
                return ((TwoWayStream)arg).getOutputStream();
            return signal(new TypeError(arg, Symbol.TWO_WAY_STREAM));
        }
    };
}
