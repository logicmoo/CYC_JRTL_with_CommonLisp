/*
 * SlimeInputStream.java
 *
 * Copyright (C) 2004 Andras Simon, Peter Graves
 * $Id: SlimeInputStream.java 12362 2010-01-11 20:03:29Z vvoutilainen $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class SlimeInputStream extends Stream
{
    String s;
    int length;
    final Function f;
    final LispStream ostream;

    public SlimeInputStream(Function f, LispStream ostream)
    {
        super(LispSymbols.SLIME_INPUT_STREAM);
        elementType = LispSymbols.CHARACTER;
        isInputStream = true;
        isOutputStream = false;
        isCharacterStream = true;
        isBinaryStream = false;
        this.f = f;
        this.ostream = ostream;
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.SLIME_INPUT_STREAM;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.SLIME_INPUT_STREAM;
    }

    @Override
    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.SLIME_INPUT_STREAM)
            return T;
        if (type == LispSymbols.STRING_STREAM)
            return T;
        if (type == BuiltInClass.SLIME_INPUT_STREAM)
            return T;
        if (type == BuiltInClass.STRING_STREAM)
            return T;
        return super.typep(type);
    }

    @Override
    public SubLObject close(SubLObject abort)
    {
        setOpen(false);
        return T;
    }

    @Override
    public SubLObject listen()
    {
        return offset < length ? T : NIL;
    }

    @Override
    public int _readChar()
    {
        if (offset >= length) {
            ostream.finishOutput();
            s = LispThread.currentThread().execute(f).getString();
            if (s.length() == 0)
                return -1;
            offset = 0;
            length = s.length();
        }
        int n = s.charAt(offset);
        ++offset;
        if (n == '\n')
            ++lineNumber;
        return n;
    }

    @Override
    public void _unreadChar(int n)
    {
        if (offset > 0) {
            --offset;
            if (n == '\n')
                --lineNumber;
        }
    }

    @Override
    public boolean _charReady()
    {
        return offset < length ? true : false;
    }


    @Override
    public void _clearInput()
    {
        super._clearInput();
        s = "";
        offset = 0;
        length = 0;
        lineNumber = 0;
    }


    @Override
    public String toString()
    {
        return unreadableString("SLIME-INPUT-STREAM");
    }
}
