/*
 * Symbol.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Symbol.java,v 1.48 2003-06-22 16:15:14 piso Exp $
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
    public static final Symbol AND_ALLOW_OTHER_KEYS = PACKAGE_CL.addExternalSymbol("&ALLOW-OTHER-KEYS");
    public static final Symbol AND_AUX              = PACKAGE_CL.addExternalSymbol("&AUX");
    public static final Symbol AND_BODY             = PACKAGE_CL.addExternalSymbol("&BODY");
    public static final Symbol AND_ENVIRONMENT      = PACKAGE_CL.addExternalSymbol("&ENVIRONMENT");
    public static final Symbol AND_KEY              = PACKAGE_CL.addExternalSymbol("&KEY");
    public static final Symbol AND_OPTIONAL         = PACKAGE_CL.addExternalSymbol("&OPTIONAL");
    public static final Symbol AND_REST             = PACKAGE_CL.addExternalSymbol("&REST");
    public static final Symbol AND_WHOLE            = PACKAGE_CL.addExternalSymbol("&WHOLE");
    public static final Symbol APPLY                = PACKAGE_CL.addExternalSymbol("APPLY");
    public static final Symbol BLOCK                = PACKAGE_CL.addExternalSymbol("BLOCK");
    public static final Symbol CDR                  = PACKAGE_CL.addExternalSymbol("CDR");
    public static final Symbol DOCUMENTATION        = PACKAGE_CL.addExternalSymbol("DOCUMENTATION");
    public static final Symbol EQ                   = PACKAGE_CL.addExternalSymbol("EQ");
    public static final Symbol EQL                  = PACKAGE_CL.addExternalSymbol("EQL");
    public static final Symbol EQUAL                = PACKAGE_CL.addExternalSymbol("EQUAL");
    public static final Symbol EQUALP               = PACKAGE_CL.addExternalSymbol("EQUALP");
    public static final Symbol FLET                 = PACKAGE_CL.addExternalSymbol("FLET");
    public static final Symbol GO                   = PACKAGE_CL.addExternalSymbol("GO");
    public static final Symbol LAMBDA               = PACKAGE_CL.addExternalSymbol("LAMBDA");
    public static final Symbol LET                  = PACKAGE_CL.addExternalSymbol("LET");
    public static final Symbol LOAD                 = PACKAGE_CL.addExternalSymbol("LOAD");
    public static final Symbol OTHERWISE            = PACKAGE_CL.addExternalSymbol("OTHERWISE");
    public static final Symbol QUOTE                = PACKAGE_CL.addExternalSymbol("QUOTE");

    // Type specifiers.
    public static final Symbol ARRAY                = PACKAGE_CL.addExternalSymbol("ARRAY");
    public static final Symbol ATOM                 = PACKAGE_CL.addExternalSymbol("ATOM");
    public static final Symbol BASE_CHAR            = PACKAGE_CL.addExternalSymbol("BASE-CHAR");
    public static final Symbol BASE_STRING          = PACKAGE_CL.addExternalSymbol("BASE-STRING");
    public static final Symbol BIGNUM               = PACKAGE_CL.addExternalSymbol("BIGNUM");
    public static final Symbol BIT                  = PACKAGE_CL.addExternalSymbol("BIT");
    public static final Symbol BIT_VECTOR           = PACKAGE_CL.addExternalSymbol("BIT-VECTOR");
    public static final Symbol CHARACTER            = PACKAGE_CL.addExternalSymbol("CHARACTER");
    public static final Symbol COMPILED_FUNCTION    = PACKAGE_CL.addExternalSymbol("COMPILED_FUNCTION");
    public static final Symbol CONS                 = PACKAGE_CL.addExternalSymbol("CONS");
    public static final Symbol DOUBLE_FLOAT         = PACKAGE_CL.addExternalSymbol("DOUBLE-FLOAT");
    public static final Symbol EXTENDED_CHAR        = PACKAGE_CL.addExternalSymbol("EXTENDED-CHAR");
    public static final Symbol FIXNUM               = PACKAGE_CL.addExternalSymbol("FIXNUM");
    public static final Symbol FLOAT                = PACKAGE_CL.addExternalSymbol("FLOAT");
    public static final Symbol FUNCTION             = PACKAGE_CL.addExternalSymbol("FUNCTION");
    public static final Symbol INTEGER              = PACKAGE_CL.addExternalSymbol("INTEGER");
    public static final Symbol KEYWORD              = PACKAGE_CL.addExternalSymbol("KEYWORD");
    public static final Symbol LIST                 = PACKAGE_CL.addExternalSymbol("LIST");
    public static final Symbol LONG_FLOAT           = PACKAGE_CL.addExternalSymbol("LONG-FLOAT");
    public static final Symbol NULL                 = PACKAGE_CL.addExternalSymbol("NULL");
    public static final Symbol NUMBER               = PACKAGE_CL.addExternalSymbol("NUMBER");
    public static final Symbol PACKAGE              = PACKAGE_CL.addExternalSymbol("PACKAGE");
    public static final Symbol RATIO                = PACKAGE_CL.addExternalSymbol("RATIO");
    public static final Symbol RATIONAL             = PACKAGE_CL.addExternalSymbol("RATIONAL");
    public static final Symbol REAL                 = PACKAGE_CL.addExternalSymbol("REAL");
    public static final Symbol SEQUENCE             = PACKAGE_CL.addExternalSymbol("SEQUENCE");
    public static final Symbol SHORT_FLOAT          = PACKAGE_CL.addExternalSymbol("SHORT-FLOAT");
    public static final Symbol SIMPLE_ARRAY         = PACKAGE_CL.addExternalSymbol("SIMPLE-ARRAY");
    public static final Symbol SIMPLE_BASE_STRING   = PACKAGE_CL.addExternalSymbol("SIMPLE-BASE-STRING");
    public static final Symbol SIMPLE_BIT_VECTOR    = PACKAGE_CL.addExternalSymbol("SIMPLE-BIT-VECTOR");
    public static final Symbol SIMPLE_STRING        = PACKAGE_CL.addExternalSymbol("SIMPLE-STRING");
    public static final Symbol SIMPLE_VECTOR        = PACKAGE_CL.addExternalSymbol("SIMPLE-VECTOR");
    public static final Symbol SINGLE_FLOAT         = PACKAGE_CL.addExternalSymbol("SINGLE-FLOAT");
    public static final Symbol STANDARD_CHAR        = PACKAGE_CL.addExternalSymbol("STANDARD-CHAR");
    public static final Symbol STREAM               = PACKAGE_CL.addExternalSymbol("STREAM");
    public static final Symbol STRING               = PACKAGE_CL.addExternalSymbol("STRING");
    public static final Symbol SYMBOL               = PACKAGE_CL.addExternalSymbol("SYMBOL");
    public static final Symbol TWO_WAY_STREAM       = PACKAGE_CL.addExternalSymbol("TWO-WAY-STREAM");
    public static final Symbol UNSIGNED_BYTE        = PACKAGE_CL.addExternalSymbol("UNSIGNED-BYTE");
    public static final Symbol VECTOR               = PACKAGE_CL.addExternalSymbol("VECTOR");

    public static final Symbol UNSPECIFIED          = PACKAGE_CL.addExternalSymbol("*");

    // Condition types.
    public static final Symbol SIMPLE_CONDITION     = PACKAGE_CL.addExternalSymbol("SIMPLE-CONDITION");

    public static final Symbol END_OF_FILE          = PACKAGE_CL.addExternalSymbol("END-OF-FILE");
    public static final Symbol ERROR                = PACKAGE_CL.addExternalSymbol("ERROR");
    public static final Symbol CONTROL_ERROR        = PACKAGE_CL.addExternalSymbol("CONTROL-ERROR");
    public static final Symbol PACKAGE_ERROR        = PACKAGE_CL.addExternalSymbol("PACKAGE-ERROR");
    public static final Symbol PROGRAM_ERROR        = PACKAGE_CL.addExternalSymbol("PROGRAM-ERROR");
    public static final Symbol SIMPLE_ERROR         = PACKAGE_CL.addExternalSymbol("SIMPLE-ERROR");
    public static final Symbol STREAM_ERROR         = PACKAGE_CL.addExternalSymbol("STREAM-ERROR");
    public static final Symbol TYPE_ERROR           = PACKAGE_CL.addExternalSymbol("TYPE-ERROR");
    public static final Symbol UNDEFINED_FUNCTION   = PACKAGE_CL.addExternalSymbol("UNDEFINED-FUNCTION");

    // Internal symbols.
    public static final Symbol BACKQUOTE            = PACKAGE_CL.addInternalSymbol("BACKQUOTE");
    public static final Symbol COMMA                = PACKAGE_CL.addInternalSymbol("COMMA");
    public static final Symbol COMMA_ATSIGN         = PACKAGE_CL.addInternalSymbol("COMMA-ATSIGN");
    public static final Symbol COMMA_DOT            = PACKAGE_CL.addInternalSymbol("COMMA-DOT");
    public static final Symbol MACROEXPAND_MACRO    = PACKAGE_CL.addInternalSymbol("MACROEXPAND-MACRO");

    public static final Symbol ARRAY_DIMENSION_LIMIT = PACKAGE_CL.addExternalSymbol("ARRAY-DIMENSION-LIMIT");
    static {
        ARRAY_DIMENSION_LIMIT.setSymbolValue(new Fixnum(0x1000000));
        ARRAY_DIMENSION_LIMIT.setConstant(true);
    }

    // Bit flags.
    private static final int SPECIAL  = 0x0001;
    private static final int CONSTANT = 0x0002;

    public static final Symbol addFunction(String name, LispObject obj)
    {
        Symbol symbol = PACKAGE_CL.intern(name);
        try {
            PACKAGE_CL.export(symbol); // FIXME Inefficient!
        }
        catch (LispError e) {
            Debug.trace(e);
        }
        symbol.function = obj;
        return symbol;
    }

    private final String name;
    private LispObject pkg;
    private LispObject value;
    private LispObject function;
    private LispObject propertyList;
    private int flags;

    // Construct an uninterned symbol.
    public Symbol(String name)
    {
        this.name = name;
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
        return pkg != null ? pkg : NIL;
    }

    public void setPackage(LispObject obj)
    {
        pkg = obj;
    }

    public int getType()
    {
        return TYPE_SYMBOL;
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
        if (((Package)pkg).findExternalSymbol(name) != null)
            sb.append(':');
        else
            sb.append("::");
        sb.append(name);
        return sb.toString();
    }

    // Raw accessor.
    public LispObject getSymbolValue()
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
        if ((flags & SPECIAL) != 0) {
            LispObject val = LispThread.currentThread().lookupSpecial(this);
            if (val != null)
                return val;
        }
        if (value != null)
            return value;
        throw new LispError(toString().concat(" has no dynamic value"));
    }

    public final LispObject symbolValueNoThrow()
    {
        if ((flags & SPECIAL) != 0) {
            LispObject val = LispThread.currentThread().lookupSpecial(this);
            if (val != null)
                return val;
        }
        return value;
    }

    public final LispObject symbolValueNoThrow(LispThread thread)
    {
        if ((flags & SPECIAL) != 0) {
            LispObject val = thread.lookupSpecial(this);
            if (val != null)
                return val;
        }
        return value;
    }

    public LispObject getSymbolFunction()
    {
        return function;
    }

    public final void setSymbolFunction(LispObject obj)
    {
        this.function = obj;
    }

    public final LispObject getPropertyList()
    {
        return propertyList != null ? propertyList : NIL;
    }

    public final void setPropertyList(LispObject obj)
    {
        if (obj == null)
            throw new NullPointerException();
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
        if (pkg == null || pkg == NIL)
            return "#:".concat(s);
        if (pkg == PACKAGE_KEYWORD)
            return ":".concat(s);
        final Package currentPackage = (Package) _PACKAGE_.getSymbolValue();
        if (pkg == currentPackage)
            return s;
        if (currentPackage.uses(pkg)) {
            if (((Package)pkg).findExternalSymbol(name) != null)
                return s;
        }
        StringBuffer sb = new StringBuffer(pkg.getName());
        if (((Package)pkg).findExternalSymbol(name) != null)
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
