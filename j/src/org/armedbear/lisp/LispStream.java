/*
 * LispStream.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: LispStream.java,v 1.8 2004-01-16 17:10:03 piso Exp $
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

public abstract class LispStream extends LispObject
{
    private LispObject pathname;
    private boolean interactive;
    private boolean open = true;

    public LispObject getPathname()
    {
        return pathname;
    }

    protected void setPathname(LispObject pathname)
    {
        this.pathname = pathname;
    }

    public boolean isInteractive()
    {
        return interactive;
    }

    public void setInteractive(boolean b)
    {
        interactive = b;
    }

    public boolean isOpen()
    {
        return open;
    }

    public void setOpen(boolean b)
    {
        open = b;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    public abstract LispObject close(LispObject abort) throws ConditionThrowable;
}
