/*
 * ClosureTemplateFunction.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: ClosureTemplateFunction.java,v 1.2 2004-07-11 12:39:01 piso Exp $
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

public abstract class ClosureTemplateFunction extends Closure
{
    public ClosureTemplateFunction(LispObject lambdaList)
        throws ConditionThrowable
    {
        super(lambdaList, NIL, null);
    }

    public final LispObject execute() throws ConditionThrowable
    {
        return notImplemented();
    }

    public final LispObject execute(LispObject arg) throws ConditionThrowable
    {
        return notImplemented();
    }

    public final LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        return notImplemented();
    }

    public final LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        return notImplemented();
    }

    public final LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        return notImplemented();
    }

    public final LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        return notImplemented();
    }

    private static final LispObject notImplemented() throws ConditionThrowable
    {
        return signal(new LispError("ClosureTemplateFunction.execute(): not implemented"));
    }

    public abstract LispObject execute(LispObject[] args, LispObject[] context)
        throws ConditionThrowable;
}
