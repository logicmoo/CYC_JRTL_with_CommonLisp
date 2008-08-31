/*
 * lisp_implementation_version.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id$
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

import java.math.BigInteger;

// ### lisp_implementation_version
// lisp_implementation_version <no arguments> => description
public final class lisp_implementation_version extends Primitive
{
    private lisp_implementation_version()
    {
        super("lisp-implementation-version","");
    }

    public LispObject execute()
    {
        return new SimpleString(Version.getVersion());
    }

    private static final lisp_implementation_version LISP_IMPLEMENTATION_VERSION =
        new lisp_implementation_version();
}
