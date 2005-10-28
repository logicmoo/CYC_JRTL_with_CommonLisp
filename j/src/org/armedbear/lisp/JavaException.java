/*
 * JavaException.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: JavaException.java,v 1.1 2005-10-28 16:39:59 piso Exp $
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

import java.io.PrintWriter;
import java.io.StringWriter;

public class JavaException extends LispError
{
    private final Throwable throwable;

    public JavaException(Throwable throwable) throws ConditionThrowable
    {
        super(StandardClass.JAVA_EXCEPTION);
        Debug.assertTrue(slots.length == 3);
        Debug.assertTrue(throwable != null);
        this.throwable = throwable;
        setInstanceSlotValue(Symbol.CAUSE, new JavaObject(throwable));
    }

    public LispObject typeOf()
    {
        return Symbol.JAVA_EXCEPTION;
    }

    public LispObject classOf()
    {
        return StandardClass.JAVA_EXCEPTION;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.JAVA_EXCEPTION)
            return T;
        if (type == StandardClass.JAVA_EXCEPTION)
            return T;
        return super.typep(type);
    }

    public String getMessage()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        throwable.printStackTrace(pw);
        return sw.toString();
    }

    // ### java-exception-cause java-exception => cause
    private static final Primitive JAVA_EXCEPTION_CAUSE =
        new Primitive(Symbol.JAVA_EXCEPTION_CAUSE, "java-exception",
"Returns the cause of JAVA-EXCEPTION. (The cause is the Java Throwable\n" +
"object that caused JAVA-EXCEPTION to be signalled.)")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((JavaException)arg).getInstanceSlotValue(Symbol.FORMAT_CONTROL);
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.JAVA_EXCEPTION);
            }
        }
    };
}
