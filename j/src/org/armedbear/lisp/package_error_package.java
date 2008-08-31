/*
 * package_error_package.java
 *
 * Copyright (C) 2003-2004 Peter Graves
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

// ### package-error-package
public final class package_error_package extends Primitive
{
    private package_error_package()
    {
        super("package-error-package");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        try {
            return ((PackageError)arg).getPackage();
        }
        catch (ClassCastException e) {
            return error(new TypeError(arg, Symbol.PACKAGE_ERROR));
        }
    }

    private static final Primitive PACKAGE_ERROR_PACKAGE =
        new package_error_package();
}
