/*
 * software_type.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: software_type.java,v 1.1 2004-02-27 16:44:12 piso Exp $
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

// ### software-type
public final class software_type extends Primitive0
{
    private software_type()
    {
        super("software-type");
    }

    public LispObject execute() throws ConditionThrowable
    {
        return new SimpleString(System.getProperty("os.name"));
    }

    private static final Primitive0 SOFTWARE_TYPE = new software_type();
}
