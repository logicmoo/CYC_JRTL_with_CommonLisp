/*
 * jclass_name.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: jclass_name.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;

// ### jclass-name class-ref &optional name
public final class jclass_name extends JavaPrimitive
{
    private jclass_name()
    {
        super(LispSymbols.JCLASS_NAME, "class-ref &optional name",
"When called with one argument, returns the name of the Java class\n" +
"  designated by CLASS-REF. When called with two arguments, tests\n" +
"  whether CLASS-REF matches NAME.");
    }

    // When called with one argument, JCLASS-NAME returns the name of the class
    // referenced by CLASS-REF.
    @Override
    public SubLObject execute(SubLObject arg)

    {
        if (arg instanceof SubLString) {
            String s = arg.getString();
            try {
                return makeString((Class.forName(s)).getName());
            }
            catch (ClassNotFoundException e) {
                // Fall through.
            }
        } else if (arg instanceof JavaObject) {
            Object obj = ((JavaObject)arg).getObject();
            if (obj instanceof Class)
                return makeString(((Class)obj).getName());
            // Fall through.
        }
        return error(new LispError(arg.writeToString() + " does not designate a Java class."));
    }

    // When called with two arguments, JCLASS-NAME tests whether CLASS-REF
    // matches NAME.
    @Override
    public SubLObject execute(SubLObject first, SubLObject second)

    {
        String className = null;
        if (first instanceof SubLString) {
            String s = first.getString();
            try {
                className = (Class.forName(s)).getName();
            }
            catch (ClassNotFoundException e) {}
        } else if (first instanceof JavaObject) {
            Object obj = ((JavaObject)first).getObject();
            if (obj instanceof Class)
                className = ((Class)obj).getName();
        }
        if (className == null)
            return error(new LispError(first.writeToString() + " does not designate a Java class."));
        final SubLString name = checkString(second);
        return LispThread.currentThread().setValues(name.getString().equals(className) ? T : NIL,
                                                    makeString(className));
    }

    private static final Primitive JCLASS_NAME = new jclass_name();
}
