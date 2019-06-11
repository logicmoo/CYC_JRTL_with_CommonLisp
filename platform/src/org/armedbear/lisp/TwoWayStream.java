/*
 * TwoWayStream.java
 *
 * Copyright (C) 2003-2005 Peter Graves
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package org.armedbear.lisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutTextStreamImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;

public class TwoWayStream extends SubLInOutTextStreamImpl
{
    //public final Stream inStream;
    //public final Stream outStream;
//
	@Override
	public SubLInputStream toInputStream() {
		return (SubLInputStream) inStream;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		return (SubLOutputStream) outStream;
	}

    public static TwoWayStream createTwoWayStream(Stream in, Stream out, boolean interactive) {
		return new TwoWayStream(in, out, interactive);
	}
//
//	public static TwoWayStream createTwoWayStream(Stream in, Stream out) {
//		return new TwoWayStream(in, out);
//	}

	protected TwoWayStream(Stream in, Stream out)
    {
        super(Symbol.TWO_WAY_STREAM);
        direction = Keyword.IO;
        if(in!=null)setElementType(in.getElementType());
        this.inStream = in;
        this.outStream = out;
        isInputStream = true;
        isOutputStream = true;
    }

    public TwoWayStream(Stream in, Stream out, boolean interactive)
    {
        this(in, out);
        setInteractive(interactive);
    }

    @Override
	public LispObject getStreamElementType()
    {
        LispObject itype = inStream.getStreamElementType();
        LispObject otype = outStream.getStreamElementType();
        if (itype.equal(otype))
            return itype;
        return list(Symbol.AND, itype, otype);
    }

    public Stream getInputStream()
    {
        return inStream;
    }

    public Stream getOutputStream()
    {
        return outStream;
    }

    @Override
	public boolean isCharacterInputStream()
    {
        return inStream.isCharacterInputStream();
    }

    @Override
	public boolean isBinaryInputStream()
    {
        return inStream.isBinaryInputStream();
    }

    @Override
	public boolean isCharacterOutputStream()
    {
        return outStream.isCharacterOutputStream();
    }

    @Override
	public boolean isBinaryOutputStream()
    {
        return outStream.isBinaryOutputStream();
    }

    @Override
	public LispObject typeOf()
    {
        return Symbol.TWO_WAY_STREAM;
    }

    @Override
	public LispObject classOf()
    {
        return BuiltInClass.TWO_WAY_STREAM;
    }

    @Override
	public LispObject typep(LispObject type)
    {
        if (type == Symbol.TWO_WAY_STREAM)
            return T;
        if (type == BuiltInClass.TWO_WAY_STREAM)
            return T;
        return super.typep(type);
    }

    // Returns -1 at end of file.
    @Override
	protected int _readChar() throws java.io.IOException
    {
  		flush();
        return inStream._readChar();
    }

    @Override
	protected void _unreadChar(int n) throws java.io.IOException
    {
        inStream._unreadChar(n);
    }

    @Override
	protected boolean _charReady() throws java.io.IOException
    {
        return inStream._charReady();
    }

    @Override
	public void _writeChar(char c)
    {
        outStream._writeChar(c);
    }

    @Override
	public void _writeChars(char[] chars, int start, int end)

    {
        outStream._writeChars(chars, start, end);
    }

    @Override
	public void _writeString(String s)
    {
        outStream._writeString(s);
    }

    @Override
	public void _writeLine(String s)
    {
        outStream._writeLine(s);
    }

    // Reads an 8-bit byte.
    @Override
	public int _readByte()
    {
        return inStream._readByte();
    }

    // Writes an 8-bit byte.
    @Override
	public void _writeByte(int n)
    {
        outStream._writeByte(n);
    }

    @Override
	public void _finishOutput()
    {
        outStream._finishOutput();
    }

    @Override
	public void _clearInput()
    {
        inStream._clearInput();
    }

    @Override
	public LispObject listen()
    {
        return inStream.listen();
    }

    @Override
	public LispObject FRESH_LINE()
    {
        return outStream.FRESH_LINE();
    }

    @Override
	public LispObject close(LispObject abort)
    {
        // "The effect of CLOSE on a constructed stream is to close the
        // argument stream only. There is no effect on the constituents of
        // composite streams."
        setOpen(false);
        return T;
    }

    @Override
	public String printObjectImpl()
    {
        return unreadableString("TWO-WAY-STREAM");
    }

    // ### make-two-way-stream input-stream output-stream => two-way-stream
    private static final Primitive MAKE_TWO_WAY_STREAM =
        new Primitive(Symbol.MAKE_TWO_WAY_STREAM, "input-stream output-stream")
    {
        @Override
		public LispObject execute(LispObject first, LispObject second)

        {
            final Stream in = checkStream(first);
            final Stream out = checkStream(second);
            if (!in.isInputStream())
                return type_error(in, list(Symbol.SATISFIES,
                                                 Symbol.INPUT_STREAM_P));
            if (!out.isOutputStream())
                return type_error(out, list(Symbol.SATISFIES,
                                                  Symbol.OUTPUT_STREAM_P));
            return createTwoWayStream(in, out, false);
        }
    };

    // ### two-way-stream-input-stream two-way-stream => input-stream
    private static final Primitive TWO_WAY_STREAM_INPUT_STREAM =
        new Primitive(Symbol.TWO_WAY_STREAM_INPUT_STREAM, "two-way-stream")
    {
        @Override
		public LispObject execute(LispObject arg)
        {
           if (arg instanceof TwoWayStream)
               return ((TwoWayStream)arg).inStream;
           return type_error(arg, Symbol.TWO_WAY_STREAM);
        }
    };

    // ### two-way-stream-output-stream two-way-stream => output-stream
    private static final Primitive TWO_WAY_STREAM_OUTPUT_STREAM =
        new Primitive(Symbol.TWO_WAY_STREAM_OUTPUT_STREAM, "two-way-stream")
    {
        @Override
		public LispObject execute(LispObject arg)
        {
           if (arg instanceof TwoWayStream)
               return ((TwoWayStream)arg).outStream;
           return type_error(arg, Symbol.TWO_WAY_STREAM);
        }
    };
}
