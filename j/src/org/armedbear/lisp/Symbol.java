/*
 * Symbol.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Symbol.java,v 1.35 2003-04-09 12:45:11 piso Exp $
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

public class Symbol extends LispObject
{
    public static final Symbol AND_ALLOW_OTHER_KEYS = export("&ALLOW-OTHER-KEYS");
    public static final Symbol AND_AUX              = export("&AUX");
    public static final Symbol AND_BODY             = export("&BODY");
    public static final Symbol AND_ENVIRONMENT      = export("&ENVIRONMENT");
    public static final Symbol AND_KEY              = export("&KEY");
    public static final Symbol AND_OPTIONAL         = export("&OPTIONAL");
    public static final Symbol AND_REST             = export("&REST");
    public static final Symbol AND_WHOLE            = export("&WHOLE");
    public static final Symbol BLOCK                = export("BLOCK");
    public static final Symbol EQ                   = export("EQ");
    public static final Symbol EQL                  = export("EQL");
    public static final Symbol EQUAL                = export("EQUAL");
    public static final Symbol EQUALP               = export("EQUALP");
    public static final Symbol FLET                 = export("FLET");
    public static final Symbol GO                   = export("GO");
    public static final Symbol LAMBDA               = export("LAMBDA");
    public static final Symbol LET                  = export("LET");
    public static final Symbol OTHERWISE            = export("OTHERWISE");
    public static final Symbol QUOTE                = export("QUOTE");

    // Type specifiers.
    public static final Symbol ARRAY                = export("ARRAY");
    public static final Symbol ATOM                 = export("ATOM");
    public static final Symbol BASE_CHAR            = export("BASE-CHAR");
    public static final Symbol BASE_STRING          = export("BASE-STRING");
    public static final Symbol BIGNUM               = export("BIGNUM");
    public static final Symbol BIT                  = export("BIT");
    public static final Symbol BIT_VECTOR           = export("BIT-VECTOR");
    public static final Symbol CHARACTER            = export("CHARACTER");
    public static final Symbol COMPILED_FUNCTION    = export("COMPILED_FUNCTION");
    public static final Symbol CONS                 = export("CONS");
    public static final Symbol DOUBLE_FLOAT         = export("DOUBLE-FLOAT");
    public static final Symbol EXTENDED_CHAR        = export("EXTENDED-CHAR");
    public static final Symbol FIXNUM               = export("FIXNUM");
    public static final Symbol FLOAT                = export("FLOAT");
    public static final Symbol FUNCTION             = export("FUNCTION");
    public static final Symbol INTEGER              = export("INTEGER");
    public static final Symbol KEYWORD              = export("KEYWORD");
    public static final Symbol LIST                 = export("LIST");
    public static final Symbol LONG_FLOAT           = export("LONG-FLOAT");
    public static final Symbol NULL                 = export("NULL");
    public static final Symbol NUMBER               = export("NUMBER");
    public static final Symbol PACKAGE              = export("PACKAGE");
    public static final Symbol RATIO                = export("RATIO");
    public static final Symbol RATIONAL             = export("RATIONAL");
    public static final Symbol REAL                 = export("REAL");
    public static final Symbol SEQUENCE             = export("SEQUENCE");
    public static final Symbol SHORT_FLOAT          = export("SHORT-FLOAT");
    public static final Symbol SIMPLE_ARRAY         = export("SIMPLE-ARRAY");
    public static final Symbol SIMPLE_BASE_STRING   = export("SIMPLE-BASE-STRING");
    public static final Symbol SIMPLE_BIT_VECTOR    = export("SIMPLE-BIT-VECTOR");
    public static final Symbol SIMPLE_STRING        = export("SIMPLE-STRING");
    public static final Symbol SIMPLE_VECTOR        = export("SIMPLE-VECTOR");
    public static final Symbol SINGLE_FLOAT         = export("SINGLE-FLOAT");
    public static final Symbol STANDARD_CHAR        = export("STANDARD-CHAR");
    public static final Symbol STRING               = export("STRING");
    public static final Symbol SYMBOL               = export("SYMBOL");
    public static final Symbol UNSIGNED_BYTE        = export("UNSIGNED-BYTE");
    public static final Symbol VECTOR               = export("VECTOR");

    public static final Symbol UNSPECIFIED          = export("*");

    // Condition types.
    public static final Symbol SIMPLE_CONDITION     = export("SIMPLE-CONDITION");

    public static final Symbol ERROR                = export("ERROR");
    public static final Symbol CONTROL_ERROR        = export("CONTROL-ERROR");
    public static final Symbol PACKAGE_ERROR        = export("PACKAGE-ERROR");
    public static final Symbol PROGRAM_ERROR        = export("PROGRAM-ERROR");
    public static final Symbol SIMPLE_ERROR         = export("SIMPLE-ERROR");
    public static final Symbol TYPE_ERROR           = export("TYPE-ERROR");
    public static final Symbol UNDEFINED_FUNCTION   = export("UNDEFINED-FUNCTION");

    // Internal symbols.
    public static final Symbol BACKQUOTE     = intern("BACKQUOTE", PACKAGE_CL);
    public static final Symbol COMMA         = intern("COMMA", PACKAGE_CL);
    public static final Symbol COMMA_ATSIGN  = intern("COMMA-ATSIGN", PACKAGE_CL);
    public static final Symbol COMMA_DOT     = intern("COMMA-DOT", PACKAGE_CL);

    public static final Symbol ARRAY_DIMENSION_LIMIT =
        export("ARRAY-DIMENSION-LIMIT");

    static {
        ARRAY_DIMENSION_LIMIT.setSymbolValue(new Fixnum(0x1000000));
        ARRAY_DIMENSION_LIMIT.setConstant(true);
    }

    // Bit flags.
    private static final int SPECIAL  = 0x0001;
    private static final int CONSTANT = 0x0002;
    private static final int EXTERNAL = 0x0004;

    public static final Symbol addFunction(String name, LispObject obj)
    {
        Symbol symbol = export(name, PACKAGE_CL);
        symbol.setSymbolFunction(obj);
        return symbol;
    }

    private final String name;
    private LispObject pkg;
    private LispObject value;
    private LispObject function;
    private LispObject propertyList = NIL;
    private int flags;

    // Construct an uninterned symbol.
    public Symbol(String name)
    {
        this.name = name;
        pkg = NIL;
    }

    public Symbol(String name, Package pkg)
    {
        this.name = name;
        this.pkg = pkg;
    }

    public LispObject typeOf()
    {
        return Symbol.SYMBOL;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.SYMBOL)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject constantp()
    {
        return (flags & CONSTANT) != 0 ? T : NIL;
    }

    public LispObject getPackage()
    {
        return pkg;
    }

    public void setPackage(LispObject obj)
    {
        pkg = obj;
    }

    public final int getType()
    {
        return TYPE_SYMBOL;
    }

    public final boolean isInternal()
    {
        return (flags & EXTERNAL) == 0;
    }

    public final boolean isExternal()
    {
        return (flags & EXTERNAL) != 0;
    }

    public final void setExternal(boolean b)
    {
        if (b)
            flags |= EXTERNAL;
        else
            flags &= ~EXTERNAL;
    }

    public final boolean isSpecialVariable()
    {
        return (flags & SPECIAL) != 0;
    }

    public final void setSpecial(boolean b)
    {
        if (b)
            flags |= SPECIAL;
        else
            flags &= ~SPECIAL;
    }

    public final boolean isConstant()
    {
        return (flags & CONSTANT) != 0;
    }

    public final void setConstant(boolean b)
    {
        if (b)
            flags |= CONSTANT;
        else
            flags &= ~CONSTANT;
    }

    public static LispObject getPropertyList(LispObject obj) throws LispError
    {
        try {
            return ((Symbol)obj).propertyList;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "symbol");
        }
    }

    public final String getName()
    {
        return name;
    }

    public final String getQualifiedName()
    {
        if (pkg == null)
            return("#:".concat(name));
        if (pkg == PACKAGE_KEYWORD)
            return ":".concat(name);
        StringBuffer sb = new StringBuffer(pkg.getName());
        if (isExternal())
            sb.append(':');
        else
            sb.append("::");
        sb.append(name);
        return sb.toString();
    }

    // Raw accessor.
    public final LispObject getSymbolValue()
    {
        return value;
    }

    public final void setSymbolValue(LispObject value)
    {
        this.value = value;
    }

    // symbol-value
    public final LispObject symbolValue() throws LispError
    {
        if (dynEnv != null) {
            if ((flags & SPECIAL) != 0) {
                LispObject val = dynEnv.lookup(this);
                if (val != null)
                    return val;
            }
        }
        if (value != null)
            return value;
        throw new LispError(toString().concat(" has no dynamic value"));
    }

    public final LispObject symbolValueNoThrow()
    {
        if (dynEnv != null) {
            if ((flags & SPECIAL) != 0) {
                LispObject val = dynEnv.lookup(this);
                if (val != null)
                    return val;
            }
        }
        return value;
    }

    public final LispObject getSymbolFunction()
    {
        return function;
    }

    public final void setSymbolFunction(LispObject obj)
    {
        this.function = obj;
    }

    public final LispObject getPropertyList()
    {
        return propertyList;
    }

    public final void setPropertyList(LispObject obj)
    {
        propertyList = obj;
    }

    public String toString()
    {
        boolean escape = false;
        for (int i = name.length(); i-- > 0;) {
            if (Character.isLowerCase(name.charAt(i))) {
                escape = true;
                break;
            }
        }
        final String s = escape ? ("|" + name + "|") : name;
        if (pkg == NIL)
            return "#:".concat(s);
        if (pkg == PACKAGE_KEYWORD)
            return ":".concat(s);
        final Package currentPackage = (Package) _PACKAGE_.getSymbolValue();
        if (pkg == currentPackage)
            return s;
        if (currentPackage.uses(pkg) && isExternal())
            return s;
        StringBuffer sb = new StringBuffer(pkg.getName());
        if (isExternal())
            sb.append(':');
        else
            sb.append("::");
        sb.append(s);
        return sb.toString();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Symbol)
            return ((Symbol)obj).getName() == name;
        return false;
    }
}
