/*
 * machine_type.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: machine_type.java,v 1.1 2004-02-27 17:20:31 piso Exp $
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

// ### machine-type
public final class machine_type extends Primitive0
{
    private machine_type()
    {
        super("machine-type");
    }

    public LispObject execute() throws ConditionThrowable
    {
        return new SimpleString(System.getProperty("os.arch"));
    }

    private static final Primitive0 MACHINE_TYPE = new machine_type();
}
