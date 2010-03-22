/*
 * PrintNotReadable.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: PrintNotReadable.java 12431 2010-02-08 08:05:15Z mevenson $
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

public class PrintNotReadable extends LispError
{
    public PrintNotReadable(SubLObject initArgs)
    {
        super(StandardClass.PRINT_NOT_READABLE);
        super.initialize(initArgs);
        SubLObject object = null;
        while (initArgs != NIL) {
            SubLObject first = initArgs.first();
            initArgs = initArgs.rest();
            SubLObject second = initArgs.first();
            initArgs = initArgs.rest();
            if (first == Keyword.OBJECT) {
                object = second;
                break;
            }
        }
        if (object != null)
            setInstanceSlotValue(LispSymbols.OBJECT, object);
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.PRINT_NOT_READABLE;
    }

    @Override
    public SubLObject classOf()
    {
        return StandardClass.PRINT_NOT_READABLE;
    }

    @Override
    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.PRINT_NOT_READABLE)
            return T;
        if (type == StandardClass.PRINT_NOT_READABLE)
            return T;
        return super.typep(type);
    }

    @Override
    public String getMessage()
    {
        StringBuilder sb = new StringBuilder();
        SubLObject object = UNBOUND_VALUE;
        object = getInstanceSlotValue(LispSymbols.OBJECT);
        if (object != UNBOUND_VALUE) {
            final LispThread thread = LispThread.currentThread();
            final SpecialBindingsMark mark = thread.markSpecialBindings();
            thread.bindSpecial(LispSymbols.PRINT_READABLY, NIL);
            thread.bindSpecial(LispSymbols.PRINT_ARRAY, NIL);
            try {
                sb.append(object.writeToString());
            }
            finally {
                thread.resetSpecialBindings(mark);
            }
        } else
            sb.append("Object");
        sb.append(" cannot be printed readably.");
        return sb.toString();
    }

    // ### print-not-readable-object
    private static final Primitive PRINT_NOT_READABLE_OBJECT =
        new JavaPrimitive("print-not-readable-object", "condition")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
                if (arg instanceof PrintNotReadable) return ((PrintNotReadable)arg).getInstanceSlotValue(LispSymbols.OBJECT);
                return type_error(arg, LispSymbols.PRINT_NOT_READABLE);

        }
    };
}
