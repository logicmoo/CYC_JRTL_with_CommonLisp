/*
 * StringInputStream.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: StringInputStream.java 12362 2010-01-11 20:03:29Z vvoutilainen $
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

import java.io.StringReader;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class StringInputStream extends Stream
{
    private final StringReader stringReader;
    private final int start;
    
    public StringInputStream(String s)
    {
        this(s, 0, s.length());
    }

    public StringInputStream(String s, int start)
    {
        this(s, start, s.length());
    }

    public StringInputStream(String s, int start, int end)
    {
        super(LispSymbols.STRING_INPUT_STREAM);
        elementType = LispSymbols.CHARACTER;
        setExternalFormat(keywordDefault);
        eolStyle = EolStyle.RAW;

        this.start = start;
        
        stringReader = new StringReader(s.substring(start, end));
        initAsCharacterInputStream(stringReader);
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.STRING_INPUT_STREAM;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.STRING_INPUT_STREAM;
    }

    @Override
    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.STRING_INPUT_STREAM)
            return T;
        if (type == LispSymbols.STRING_STREAM)
            return T;
        if (type == BuiltInClass.STRING_INPUT_STREAM)
            return T;
        if (type == BuiltInClass.STRING_STREAM)
            return T;
        return super.typep(type);
    }

    @Override
    public String toString()
    {
        return unreadableString("STRING-INPUT-STREAM");
    }

    @Override
    public int getOffset() {
        return start + super.getOffset();
    }
    
  }
