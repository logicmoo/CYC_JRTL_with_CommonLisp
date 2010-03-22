/*
 * PackageFunctions.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: PackageFunctions.java 12290 2009-11-30 22:28:50Z vvoutilainen $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class PackageFunctions
{
    // ### packagep
    // packagep object => generalized-boolean
    private static final Primitive PACKAGEP = new JavaPrimitive("packagep", "object")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return arg instanceof SubLPackage ? T : NIL;
        }
    };

    // ### package-name
    // package-name package => nicknames
    private static final Primitive PACKAGE_NAME =
        new JavaPrimitive("package-name", "package")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return coerceToPackage(arg).NAME();
        }
    };

    // ### package-nicknames
    // package-nicknames package => nicknames
    private static final Primitive PACKAGE_NICKNAMES =
        new JavaPrimitive("package-nicknames", "package")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return coerceToPackage(arg).packageNicknames();
        }
    };

    // ### package-use-list
    // package-use-list package => use-list
    private static final Primitive PACKAGE_USE_LIST =
        new JavaPrimitive("package-use-list", "package")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return coerceToPackage(arg).getUseList();
        }
    };

    // ### package-used-by-list
    // package-used-by-list package => used-by-list
    private static final Primitive PACKAGE_USED_BY_LIST =
        new JavaPrimitive("package-used-by-list", "package")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return coerceToPackage(arg).getUsedByList();
        }
    };

    // ### %import
    // %import symbols &optional package => t
    private static final Primitive _IMPORT =
        new JavaPrimitive("%import", PACKAGE_SYS, false)
    {
        @Override
        public SubLObject execute(SubLObject[] args)
        {
            if (args.length == 0 || args.length > 2)
                return error(new WrongNumberOfArgumentsException(this));
            SubLObject symbols = args[0];
            SubLPackage pkg =
                args.length == 2 ? coerceToPackage(args[1]) : getCurrentPackage();
            if (symbols.isList()) {
                while (symbols != NIL) {
                    pkg.importSymbol(checkSymbol(symbols.first()));
                    symbols = symbols.rest();
                }
            } else
                pkg.importSymbol(checkSymbol(symbols));
            return T;
        }
    };

    // ### unexport
    // unexport symbols &optional package => t
    private static final Primitive UNEXPORT =
        new JavaPrimitive("unexport", "symbols &optional package")
    {
        @Override
        public SubLObject execute(SubLObject[] args)
        {
            if (args.length == 0 || args.length > 2)
                return error(new WrongNumberOfArgumentsException(this));
            SubLObject symbols = args[0];
            SubLPackage pkg =
                args.length == 2 ? coerceToPackage(args[1]) : getCurrentPackage();
            if (symbols.isList()) {
                while (symbols != NIL) {
                    pkg.unexport(checkSymbol(symbols.first()));
                    symbols = symbols.rest();
                }
            } else
                pkg.unexport(checkSymbol(symbols));
            return T;
        }
    };

    // ### shadow
    // shadow symbol-names &optional package => t
    private static final Primitive SHADOW =
        new JavaPrimitive("shadow", "symbol-names &optional package")
    {
        @Override
        public SubLObject execute(SubLObject[] args)
        {
            if (args.length == 0 || args.length > 2)
                return error(new WrongNumberOfArgumentsException(this));
            SubLObject symbols = args[0];
            SubLPackage pkg =
                args.length == 2 ? coerceToPackage(args[1]) : getCurrentPackage();
            if (symbols.isList()) {
                while (symbols != NIL) {
                    pkg.shadow(javaString(symbols.first()));
                    symbols = symbols.rest();
                }
            } else
                pkg.shadow(javaString(symbols));
            return T;
        }
    };

    // ### shadowing-import
    // shadowing-import symbols &optional package => t
    private static final Primitive SHADOWING_IMPORT =
        new JavaPrimitive("shadowing-import", "symbols &optional package")
    {
        @Override
        public SubLObject execute(SubLObject[] args)
        {
            if (args.length == 0 || args.length > 2)
                return error(new WrongNumberOfArgumentsException(this));
            SubLObject symbols = args[0];
            SubLPackage pkg =
                args.length == 2 ? coerceToPackage(args[1]) : getCurrentPackage();
            if (symbols.isList()) {
                while (symbols != NIL) {
                    pkg.shadowingImport(checkSymbol(symbols.first()));
                    symbols = symbols.rest();
                }
            } else
                pkg.shadowingImport(checkSymbol(symbols));
            return T;
        }
    };

    // ### package-shadowing-symbols
    // package-shadowing-symbols package => used-by-list
    private static final Primitive PACKAGE_SHADOWING_SYMBOLS =
        new JavaPrimitive("package-shadowing-symbols", "package")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return coerceToPackage(arg).getShadowingSymbols();
        }
    };

    // ### delete-package
    private static final Primitive DELETE_PACKAGE =
        new JavaPrimitive("delete-package", "package")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return coerceToPackage(arg).delete() ? T : NIL;
        }
    };

    // ### unuse-package
    // unuse-package packages-to-unuse &optional package => t
    private static final Primitive USE_PACKAGE =
        new JavaPrimitive("unuse-package", "packages-to-unuse &optional package")
    {
        @Override
        public SubLObject execute(SubLObject[] args)
        {
            if (args.length < 1 || args.length > 2)
                return error(new WrongNumberOfArgumentsException(this));
            SubLPackage pkg;
            if (args.length == 2)
                pkg = coerceToPackage(args[1]);
            else
                pkg = getCurrentPackage();
            if (args[0] instanceof SubLCons) {
                SubLObject list = args[0];
                while (list != NIL) {
                    pkg.unusePackage(coerceToPackage(list.first()));
                    list = list.rest();
                }
            } else
                pkg.unusePackage(coerceToPackage(args[0]));
            return T;
        }
    };

    // ### rename-package
    // rename-package package new-name &optional new-nicknames => package-object
    private static final Primitive RENAME_PACKAGE =
        new JavaPrimitive("rename-package", "package new-name &optional new-nicknames")
    {
        @Override
        public SubLObject execute(SubLObject[] args)
        {
            if (args.length < 2 || args.length > 3)
                return error(new WrongNumberOfArgumentsException(this));
            SubLPackage pkg = coerceToPackage(args[0]);
            String newName = javaString(args[1]);
            SubLObject nicknames = args.length == 3 ? checkList(args[2]) : NIL;
            pkg.rename(newName, nicknames);
            return pkg;
        }
    };

    private static final Primitive LIST_ALL_PACKAGES =
        new JavaPrimitive("list-all-packages", "")
    {
        @Override
        public SubLObject execute()
        {
            return LispPackages.listAllPackages();
        }
    };

    // ### %defpackage name nicknames size shadows shadowing-imports use
    // imports interns exports doc-string => package
    private static final Primitive _DEFPACKAGE =
        new JavaPrimitive("%defpackage", PACKAGE_SYS, false)
    {
        @Override
        public SubLObject execute(SubLObject[] args)
        {
            if (args.length != 10)
                return error(new WrongNumberOfArgumentsException(this));
            final String packageName = args[0].getString();
            SubLObject nicknames = checkList(args[1]);
            // FIXME size is ignored
            // LispObject size = args[2];
            SubLObject shadows = checkList(args[3]);
            SubLObject shadowingImports = checkList(args[4]);
            SubLObject use = checkList(args[5]);
            SubLObject imports = checkList(args[6]);
            SubLObject interns = checkList(args[7]);
            SubLObject exports = checkList(args[8]);
            // FIXME docString is ignored
            // LispObject docString = args[9];
            SubLPackage pkg = LispPackages.findPackage(packageName);
            if (pkg != null)
                return pkg;
            if (nicknames != NIL) {
                SubLObject list = nicknames;
                while (list != NIL) {
                    String nick = javaString(list.first());
                    if (LispPackages.findPackage(nick) != null) {
                        return error(new PackageError("A package named " + nick +
                                                       " already exists."));
                    }
                    list = list.rest();
                }
            }
            pkg = LispPackages.createPackage(packageName);
            while (nicknames != NIL) {
                SubLObject string = nicknames.first().STRING();
                pkg.addNickname(string.getString());
                nicknames = nicknames.rest();
            }
            while (shadows != NIL) {
                String symbolName = shadows.first().getString();
                pkg.shadow(symbolName);
                shadows = shadows.rest();
            }
            while (shadowingImports != NIL) {
                SubLObject si = shadowingImports.first();
                SubLPackage otherPkg = coerceToPackage(si.first());
                SubLObject symbolNames = si.rest();
                while (symbolNames != NIL) {
                    String symbolName = symbolNames.first().getString();
                    SubLSymbol sym = otherPkg.findAccessibleSymbol(symbolName);
                    if (sym != null)
                        pkg.shadowingImport(sym);
                    else
                        return error(new LispError(symbolName +
                                                    " not found in package " +
                                                    otherPkg.getJavaName() + "."));
                    symbolNames = symbolNames.rest();
                }
                shadowingImports = shadowingImports.rest();
            }
            while (use != NIL) {
                SubLObject obj = use.first();
                if (obj instanceof SubLPackage)
                    pkg.usePackage((SubLPackage)obj);
                else {
                    SubLObject string = obj.STRING();
                    SubLPackage p = LispPackages.findPackage(string.getString());
                    if (p == null)
                        return error(new LispError(obj.writeToString() +
                                                    " is not the name of a package."));
                    pkg.usePackage(p);
                }
                use = use.rest();
            }
            while (imports != NIL) {
                SubLObject si = imports.first();
                SubLPackage otherPkg = coerceToPackage(si.first());
                SubLObject symbolNames = si.rest();
                while (symbolNames != NIL) {
                    String symbolName = symbolNames.first().getString();
                    SubLSymbol sym = otherPkg.findAccessibleSymbol(symbolName);
                    if (sym != null)
                        pkg.importSymbol(sym);
                    else
                        return error(new LispError(symbolName +
                                                    " not found in package " +
                                                    otherPkg.getJavaName() + "."));
                    symbolNames = symbolNames.rest();
                }
                imports = imports.rest();
            }
            while (interns != NIL) {
                String symbolName = interns.first().getString();
                pkg.intern(symbolName);
                interns = interns.rest();
            }
            while (exports != NIL) {
                String symbolName = exports.first().getString();
                pkg.export(pkg.intern(symbolName));
                exports = exports.rest();
            }
            return pkg;
        }
    };
}
