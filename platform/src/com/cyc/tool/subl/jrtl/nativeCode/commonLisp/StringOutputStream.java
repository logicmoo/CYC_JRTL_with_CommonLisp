/*
 * StringOutputStream.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: StringOutputStream.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.io.StringWriter;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;

public final class StringOutputStream extends Stream
{
    private final StringWriter stringWriter;

    public StringOutputStream()
    {
        this(LispSymbols.CHARACTER);
    }

    StringOutputStream(SubLObject elementType)
    {
        super(LispSymbols.STRING_OUTPUT_STREAM);
        this.elementType = elementType;
        this.eolStyle = EolStyle.RAW;
        initAsCharacterOutputStream(stringWriter = new StringWriter());
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.STRING_OUTPUT_STREAM;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.STRING_OUTPUT_STREAM;
    }

    @Override
    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.STRING_OUTPUT_STREAM)
            return T;
        if (type == LispSymbols.STRING_STREAM)
            return T;
        if (type == BuiltInClass.STRING_OUTPUT_STREAM)
            return T;
        if (type == BuiltInClass.STRING_STREAM)
            return T;
        return super.typep(type);
    }

    @Override
    public long _getFilePosition()
    {
        if (elementType == NIL)
            return 0;
        return stringWriter.getBuffer().length();
    }

    public SubLObject getOutputString()
    {
        if (elementType == NIL)
            return new NilVector(0);
        StringBuffer sb = stringWriter.getBuffer();
        SubLString s = makeString(sb);
        sb.setLength(0);
        return s;
    }

    @Override
    public String toString()
    {
        return unreadableString("STRING-OUTPUT-STREAM");
    }

}
