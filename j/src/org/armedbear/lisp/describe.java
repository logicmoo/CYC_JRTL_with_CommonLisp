/*
 * describe.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: describe.java,v 1.17 2005-01-13 19:45:26 piso Exp $
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

public final class describe extends Lisp
{
    // ### describe
    // Need to support optional second argument specifying output stream.
    private static final Primitive DESCRIBE =
        new Primitive("describe", "object &optional stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Stream out = getStandardOutput();
            out.freshLine();
            out._writeString(arg.describe());
            out.freshLine();
            return LispThread.currentThread().nothing();
        }

        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Stream out = outSynonymOf(second);
            out.freshLine();
            out._writeString(first.describe());
            out.freshLine();
            return LispThread.currentThread().nothing();
        }
    };
}
