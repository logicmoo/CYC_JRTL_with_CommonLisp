/*
 * PackageFunctions.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: PackageFunctions.java,v 1.2 2003-06-22 00:06:43 piso Exp $
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

public final class PackageFunctions extends Lisp
{
    // ### package-nicknames
    // package-nicknames package => nicknames
    private static final Primitive1 PACKAGE_NICKNAMES =
        new Primitive1("package-nicknames") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return coerceToPackage(arg).packageNicknames();
        }
    };

    // ### package-use-list
    // package-use-list package => use-list
    private static final Primitive1 PACKAGE_USE_LIST =
        new Primitive1("package-use-list") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return coerceToPackage(arg).getUseList();
        }
    };

    // ### package-used-by-list
    // package-used-by-list package => used-by-list
    private static final Primitive1 PACKAGE_USED_BY_LIST =
        new Primitive1("package-used-by-list") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return coerceToPackage(arg).getUsedByList();
        }
    };

    // ### shadow
    // shadow symbol-names &optional package => t
    private static final Primitive SHADOW = new Primitive("shadow") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length == 0 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject symbols = args[0];
            Package pkg =
                args.length == 2 ? coerceToPackage(args[1]) : getCurrentPackage();
            if (symbols.listp()) {
                while (symbols != NIL) {
                    pkg.shadow(javaString(symbols.car()));
                    symbols = symbols.cdr();
                }
            } else
                pkg.shadow(javaString(symbols));
            return T;
        }
    };

    // ### package-used-by-list
    // package-used-by-list package => used-by-list
    private static final Primitive1 PACKAGE_SHADOWING_SYMBOLS =
        new Primitive1("package-shadowing-symbols") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return coerceToPackage(arg).getShadowingSymbols();
        }
    };

    // ### delete-package
    private static final Primitive1 DELETE_PACKAGE =
        new Primitive1("delete-package") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return coerceToPackage(arg).delete() ? T : NIL;
        }
    };
}
