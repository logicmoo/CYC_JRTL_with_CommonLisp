/*
 * PackageFunctions.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: PackageFunctions.java,v 1.8 2003-07-06 18:08:27 piso Exp $
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
    // ### packagep
    // packagep object => generalized-boolean
    private static final Primitive1 PACKAGEP = new Primitive1("packagep") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg instanceof Package ? T : NIL;
        }
    };

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

    // ### import
    // import symbols &optional package => t
    private static final Primitive IMPORT = new Primitive("import") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length == 0 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject symbols = args[0];
            Package pkg =
                args.length == 2 ? coerceToPackage(args[1]) : getCurrentPackage();
            if (symbols.listp()) {
                while (symbols != NIL) {
                    pkg.importSymbol(checkSymbol(symbols.car()));
                    symbols = symbols.cdr();
                }
            } else
                pkg.importSymbol(checkSymbol(symbols));
            return T;
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

    // ### shadowing-import
    // shadowing-import symbols &optional package => t
    private static final Primitive SHADOWING_IMPORT =
        new Primitive("shadowing-import") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length == 0 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject symbols = args[0];
            Package pkg =
                args.length == 2 ? coerceToPackage(args[1]) : getCurrentPackage();
            if (symbols.listp()) {
                while (symbols != NIL) {
                    pkg.shadowingImport(checkSymbol(symbols.car()));
                    symbols = symbols.cdr();
                }
            } else
                pkg.shadowingImport(checkSymbol(symbols));
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

    // ### unuse-package
    // unuse-package packages-to-unuse &optional package => t
    private static final Primitive USE_PACKAGE =
        new Primitive("unuse-package") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 1 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            Package pkg;
            if (args.length == 2)
                pkg = coerceToPackage(args[1]);
            else
                pkg = getCurrentPackage();
            if (args[0] instanceof Cons) {
                LispObject list = args[0];
                while (list != NIL) {
                    pkg.unusePackage(coerceToPackage(list.car()));
                    list = list.cdr();
                }
            } else
                pkg.unusePackage(coerceToPackage(args[0]));
            return T;
        }
    };

    private static final Primitive0 LIST_ALL_PACKAGES =
        new Primitive0("list-all-packages") {
        public LispObject execute()
        {
            return Packages.listAllPackages();
        }
    };

    // ### %defpackage
    // %defpackage name nicknames size shadows shadowing-imports use imports
    // interns exports doc-string => package
    private static final Primitive _DEFPACKAGE =
        new Primitive("%defpackage", PACKAGE_SYS, false) {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 10)
                throw new WrongNumberOfArgumentsException(this);
            final String packageName = LispString.getValue(args[0]);
            LispObject nicknames = checkList(args[1]);
            LispObject size = args[2];
            LispObject shadows = checkList(args[3]);
            LispObject shadowingImports = checkList(args[4]);
            LispObject use = checkList(args[5]);
            LispObject imports = checkList(args[6]);
            LispObject interns = checkList(args[7]);
            LispObject exports = checkList(args[8]);
            LispObject docString = args[9];
            Debug.trace("packageName = " + packageName);
            Debug.trace("nicknames = " + nicknames);
            Debug.trace("size = " + size);
            Debug.trace("shadows = " + shadows);
            Debug.trace("shadowingImports = " + shadowingImports);
            Debug.trace("use = " + use);
            Debug.trace("imports = " + imports);
            Debug.trace("interns = " + interns);
            Debug.trace("exports = " + exports);
            Debug.trace("docString = " + docString);
            Package pkg = Packages.findPackage(packageName);
            if (pkg != null) {
                Debug.trace("package " + packageName + " already exists");
                return pkg;
            }
            pkg = Packages.createPackage(packageName);

            if (nicknames != NIL) {
                LispObject list = checkCons(nicknames);
                while (list != NIL) {
                    LispString string = string(list.car());
                    pkg.addNickname(string.getValue());
                    list = list.cdr();
                }
            }

            if (use != NIL) {
                LispObject list = checkCons(use);
                while (list != NIL) {
                    LispObject obj = list.car();
                    if (obj instanceof Package)
                        pkg.usePackage((Package)obj);
                    else {
                        LispString string = string(obj);
                        Package p = Packages.findPackage(string.getValue());
                        if (p == null)
                            throw new LispError(String.valueOf(obj) +
                                                " is not the name of a package");
                        pkg.usePackage(p);
                    }
                    list = list.cdr();
                }
            }

            if (shadows != NIL) {
                LispObject list = checkCons(shadows);
                while (list != NIL) {
                    String symbolName = LispString.getValue(list.car());
                    pkg.shadow(symbolName);
                    list = list.cdr();
                }
            }

            while (shadowingImports != NIL) {
                LispObject si = shadowingImports.car();
                Package otherPkg = coerceToPackage(si.car());
                LispObject symbolNames = si.cdr();
                while (symbolNames != NIL) {
                    String symbolName = LispString.getValue(symbolNames.car());
                    Symbol sym = otherPkg.findAccessibleSymbol(symbolName);
                    if (sym != null)
                        pkg.shadowingImport(sym);
                    else
                        throw new LispError(symbolName +
                                            " not found in package " +
                                            otherPkg.getName());
                    symbolNames = symbolNames.cdr();
                }
                shadowingImports = shadowingImports.cdr();
            }

            if (interns != NIL) {
                LispObject list = checkCons(interns);
                while (list != NIL) {
                    String symbolName = LispString.getValue(list.car());
                    pkg.intern(symbolName);
                    list = list.cdr();
                }
            }

            while (exports != NIL) {
                LispObject obj = exports.car();
                String symbolName = LispString.getValue(exports.car());
                pkg.export(pkg.intern(symbolName));
                exports = exports.cdr();
            }

            return NIL;
        }
    };
}
