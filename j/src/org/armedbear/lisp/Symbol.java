/*
 * Symbol.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Symbol.java,v 1.103 2004-01-27 18:54:33 piso Exp $
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
    public static final Symbol AND_ALLOW_OTHER_KEYS             = PACKAGE_CL.addExternalSymbol("&ALLOW-OTHER-KEYS");
    public static final Symbol AND_AUX                          = PACKAGE_CL.addExternalSymbol("&AUX");
    public static final Symbol AND_BODY                         = PACKAGE_CL.addExternalSymbol("&BODY");
    public static final Symbol AND_ENVIRONMENT                  = PACKAGE_CL.addExternalSymbol("&ENVIRONMENT");
    public static final Symbol AND_KEY                          = PACKAGE_CL.addExternalSymbol("&KEY");
    public static final Symbol AND_OPTIONAL                     = PACKAGE_CL.addExternalSymbol("&OPTIONAL");
    public static final Symbol AND_REST                         = PACKAGE_CL.addExternalSymbol("&REST");
    public static final Symbol AND_WHOLE                        = PACKAGE_CL.addExternalSymbol("&WHOLE");
    public static final Symbol APPLY                            = PACKAGE_CL.addExternalSymbol("APPLY");
    public static final Symbol BLOCK                            = PACKAGE_CL.addExternalSymbol("BLOCK");
    public static final Symbol CDR                              = PACKAGE_CL.addExternalSymbol("CDR");
    public static final Symbol DECLARE                          = PACKAGE_CL.addExternalSymbol("DECLARE");
    public static final Symbol DOCUMENTATION                    = PACKAGE_CL.addExternalSymbol("DOCUMENTATION");
    public static final Symbol EQ                               = PACKAGE_CL.addExternalSymbol("EQ");
    public static final Symbol EQL                              = PACKAGE_CL.addExternalSymbol("EQL");
    public static final Symbol EQUAL                            = PACKAGE_CL.addExternalSymbol("EQUAL");
    public static final Symbol EQUALP                           = PACKAGE_CL.addExternalSymbol("EQUALP");
    public static final Symbol FLET                             = PACKAGE_CL.addExternalSymbol("FLET");
    public static final Symbol FORMAT                           = PACKAGE_CL.addExternalSymbol("FORMAT");
    public static final Symbol GO                               = PACKAGE_CL.addExternalSymbol("GO");
    public static final Symbol LAMBDA                           = PACKAGE_CL.addExternalSymbol("LAMBDA");
    public static final Symbol LET                              = PACKAGE_CL.addExternalSymbol("LET");
    public static final Symbol LOAD                             = PACKAGE_CL.addExternalSymbol("LOAD");
    public static final Symbol OTHERWISE                        = PACKAGE_CL.addExternalSymbol("OTHERWISE");
    public static final Symbol QUOTE                            = PACKAGE_CL.addExternalSymbol("QUOTE");
    public static final Symbol SETF                             = PACKAGE_CL.addExternalSymbol("SETF");
    public static final Symbol SIGNAL                           = PACKAGE_CL.addExternalSymbol("SIGNAL");
    public static final Symbol SPECIAL                          = PACKAGE_CL.addExternalSymbol("SPECIAL");

    // Type specifiers.
    public static final Symbol AND                              = PACKAGE_CL.addExternalSymbol("AND");
    public static final Symbol ARRAY                            = PACKAGE_CL.addExternalSymbol("ARRAY");
    public static final Symbol ATOM                             = PACKAGE_CL.addExternalSymbol("ATOM");
    public static final Symbol BASE_CHAR                        = PACKAGE_CL.addExternalSymbol("BASE-CHAR");
    public static final Symbol BASE_STRING                      = PACKAGE_CL.addExternalSymbol("BASE-STRING");
    public static final Symbol BIGNUM                           = PACKAGE_CL.addExternalSymbol("BIGNUM");
    public static final Symbol BIT                              = PACKAGE_CL.addExternalSymbol("BIT");
    public static final Symbol BIT_VECTOR                       = PACKAGE_CL.addExternalSymbol("BIT-VECTOR");
    public static final Symbol BOOLEAN                          = PACKAGE_CL.addExternalSymbol("BOOLEAN");
    public static final Symbol BROADCAST_STREAM                 = PACKAGE_CL.addExternalSymbol("BROADCAST-STREAM");
    public static final Symbol BUILT_IN_CLASS                   = PACKAGE_CL.addExternalSymbol("BUILT-IN-CLASS");
    public static final Symbol CELL_ERROR                       = PACKAGE_CL.addExternalSymbol("CELL-ERROR");
    public static final Symbol CHARACTER                        = PACKAGE_CL.addExternalSymbol("CHARACTER");
    public static final Symbol CLASS                            = PACKAGE_CL.addExternalSymbol("CLASS");
    public static final Symbol COMPILED_FUNCTION                = PACKAGE_CL.addExternalSymbol("COMPILED-FUNCTION");
    public static final Symbol COMPLEX                          = PACKAGE_CL.addExternalSymbol("COMPLEX");
    public static final Symbol CONCATENATED_STREAM              = PACKAGE_CL.addExternalSymbol("CONCATENATED-STREAM");
    public static final Symbol CONS                             = PACKAGE_CL.addExternalSymbol("CONS");
    public static final Symbol DOUBLE_FLOAT                     = PACKAGE_CL.addExternalSymbol("DOUBLE-FLOAT");
    public static final Symbol ECHO_STREAM                      = PACKAGE_CL.addExternalSymbol("ECHO-STREAM");
    public static final Symbol EXTENDED_CHAR                    = PACKAGE_CL.addExternalSymbol("EXTENDED-CHAR");
    public static final Symbol FILE_STREAM                      = PACKAGE_CL.addExternalSymbol("FILE-STREAM");
    public static final Symbol FIXNUM                           = PACKAGE_CL.addExternalSymbol("FIXNUM");
    public static final Symbol FLOAT                            = PACKAGE_CL.addExternalSymbol("FLOAT");
    public static final Symbol FUNCTION                         = PACKAGE_CL.addExternalSymbol("FUNCTION");
    public static final Symbol GENERIC_FUNCTION                 = PACKAGE_CL.addExternalSymbol("GENERIC-FUNCTION");
    public static final Symbol HASH_TABLE                       = PACKAGE_CL.addExternalSymbol("HASH-TABLE");
    public static final Symbol INTEGER                          = PACKAGE_CL.addExternalSymbol("INTEGER");
    public static final Symbol KEYWORD                          = PACKAGE_CL.addExternalSymbol("KEYWORD");
    public static final Symbol LIST                             = PACKAGE_CL.addExternalSymbol("LIST");
    public static final Symbol LOGICAL_PATHNAME                 = PACKAGE_CL.addExternalSymbol("LOGICAL-PATHNAME");
    public static final Symbol LONG_FLOAT                       = PACKAGE_CL.addExternalSymbol("LONG-FLOAT");
    public static final Symbol MEMBER                           = PACKAGE_CL.addExternalSymbol("MEMBER");
    public static final Symbol METHOD                           = PACKAGE_CL.addExternalSymbol("METHOD");
    public static final Symbol METHOD_COMBINATION               = PACKAGE_CL.addExternalSymbol("METHOD-COMBINATION");
    public static final Symbol NOT                              = PACKAGE_CL.addExternalSymbol("NOT");
    public static final Symbol NULL                             = PACKAGE_CL.addExternalSymbol("NULL");
    public static final Symbol NUMBER                           = PACKAGE_CL.addExternalSymbol("NUMBER");
    public static final Symbol OR                               = PACKAGE_CL.addExternalSymbol("OR");
    public static final Symbol PACKAGE                          = PACKAGE_CL.addExternalSymbol("PACKAGE");
    public static final Symbol PATHNAME                         = PACKAGE_CL.addExternalSymbol("PATHNAME");
    public static final Symbol RANDOM_STATE                     = PACKAGE_CL.addExternalSymbol("RANDOM-STATE");
    public static final Symbol RATIO                            = PACKAGE_CL.addExternalSymbol("RATIO");
    public static final Symbol RATIONAL                         = PACKAGE_CL.addExternalSymbol("RATIONAL");
    public static final Symbol REAL                             = PACKAGE_CL.addExternalSymbol("REAL");
    public static final Symbol READTABLE                        = PACKAGE_CL.addExternalSymbol("READTABLE");
    public static final Symbol RESTART                          = PACKAGE_CL.addExternalSymbol("RESTART");
    public static final Symbol SEQUENCE                         = PACKAGE_CL.addExternalSymbol("SEQUENCE");
    public static final Symbol SHORT_FLOAT                      = PACKAGE_CL.addExternalSymbol("SHORT-FLOAT");
    public static final Symbol SIGNED_BYTE                      = PACKAGE_CL.addExternalSymbol("SIGNED-BYTE");
    public static final Symbol SIMPLE_ARRAY                     = PACKAGE_CL.addExternalSymbol("SIMPLE-ARRAY");
    public static final Symbol SIMPLE_BASE_STRING               = PACKAGE_CL.addExternalSymbol("SIMPLE-BASE-STRING");
    public static final Symbol SIMPLE_BIT_VECTOR                = PACKAGE_CL.addExternalSymbol("SIMPLE-BIT-VECTOR");
    public static final Symbol SIMPLE_STRING                    = PACKAGE_CL.addExternalSymbol("SIMPLE-STRING");
    public static final Symbol SIMPLE_VECTOR                    = PACKAGE_CL.addExternalSymbol("SIMPLE-VECTOR");
    public static final Symbol SINGLE_FLOAT                     = PACKAGE_CL.addExternalSymbol("SINGLE-FLOAT");
    public static final Symbol STANDARD_CHAR                    = PACKAGE_CL.addExternalSymbol("STANDARD-CHAR");
    public static final Symbol STANDARD_CLASS                   = PACKAGE_CL.addExternalSymbol("STANDARD-CLASS");
    public static final Symbol STANDARD_GENERIC_FUNCTION        = PACKAGE_CL.addExternalSymbol("STANDARD-GENERIC-FUNCTION");
    public static final Symbol STANDARD_METHOD                  = PACKAGE_CL.addExternalSymbol("STANDARD-METHOD");
    public static final Symbol STANDARD_OBJECT                  = PACKAGE_CL.addExternalSymbol("STANDARD-OBJECT");
    public static final Symbol STREAM                           = PACKAGE_CL.addExternalSymbol("STREAM");
    public static final Symbol STRING                           = PACKAGE_CL.addExternalSymbol("STRING");
    public static final Symbol STRING_STREAM                    = PACKAGE_CL.addExternalSymbol("STRING-STREAM");
    public static final Symbol STRUCTURE_CLASS                  = PACKAGE_CL.addExternalSymbol("STRUCTURE-CLASS");
    public static final Symbol STRUCTURE_OBJECT                 = PACKAGE_CL.addExternalSymbol("STRUCTURE-OBJECT");
    public static final Symbol SYMBOL                           = PACKAGE_CL.addExternalSymbol("SYMBOL");
    public static final Symbol SYNONYM_STREAM                   = PACKAGE_CL.addExternalSymbol("SYNONYM-STREAM");
    public static final Symbol TWO_WAY_STREAM                   = PACKAGE_CL.addExternalSymbol("TWO-WAY-STREAM");
    public static final Symbol UNSIGNED_BYTE                    = PACKAGE_CL.addExternalSymbol("UNSIGNED-BYTE");
    public static final Symbol VECTOR                           = PACKAGE_CL.addExternalSymbol("VECTOR");

    public static final Symbol UNSPECIFIED                      = PACKAGE_CL.addExternalSymbol("*");

    // Condition types.
    public static final Symbol ARITHMETIC_ERROR                 = PACKAGE_CL.addExternalSymbol("ARITHMETIC-ERROR");
    public static final Symbol CONDITION                        = PACKAGE_CL.addExternalSymbol("CONDITION");
    public static final Symbol CONTROL_ERROR                    = PACKAGE_CL.addExternalSymbol("CONTROL-ERROR");
    public static final Symbol DIVISION_BY_ZERO                 = PACKAGE_CL.addExternalSymbol("DIVISION-BY-ZERO");
    public static final Symbol END_OF_FILE                      = PACKAGE_CL.addExternalSymbol("END-OF-FILE");
    public static final Symbol ERROR                            = PACKAGE_CL.addExternalSymbol("ERROR");
    public static final Symbol FILE_ERROR                       = PACKAGE_CL.addExternalSymbol("FILE-ERROR");
    public static final Symbol FLOATING_POINT_INEXACT           = PACKAGE_CL.addExternalSymbol("FLOATING-POINT-INEXACT");
    public static final Symbol FLOATING_POINT_INVALID_OPERATION = PACKAGE_CL.addExternalSymbol("FLOATING-POINT-INVALID-OPERATION");
    public static final Symbol FLOATING_POINT_OVERFLOW          = PACKAGE_CL.addExternalSymbol("FLOATING-POINT-OVERFLOW");
    public static final Symbol FLOATING_POINT_UNDERFLOW         = PACKAGE_CL.addExternalSymbol("FLOATING-POINT-UNDERFLOW");
    public static final Symbol PACKAGE_ERROR                    = PACKAGE_CL.addExternalSymbol("PACKAGE-ERROR");
    public static final Symbol PARSE_ERROR                      = PACKAGE_CL.addExternalSymbol("PARSE-ERROR");
    public static final Symbol PRINT_NOT_READABLE               = PACKAGE_CL.addExternalSymbol("PRINT-NOT-READABLE");
    public static final Symbol PROGRAM_ERROR                    = PACKAGE_CL.addExternalSymbol("PROGRAM-ERROR");
    public static final Symbol READER_ERROR                     = PACKAGE_CL.addExternalSymbol("READER-ERROR");
    public static final Symbol SERIOUS_CONDITION                = PACKAGE_CL.addExternalSymbol("SERIOUS-CONDITION");
    public static final Symbol SIMPLE_CONDITION                 = PACKAGE_CL.addExternalSymbol("SIMPLE-CONDITION");
    public static final Symbol SIMPLE_ERROR                     = PACKAGE_CL.addExternalSymbol("SIMPLE-ERROR");
    public static final Symbol SIMPLE_TYPE_ERROR                = PACKAGE_CL.addExternalSymbol("SIMPLE-TYPE-ERROR");
    public static final Symbol SIMPLE_WARNING                   = PACKAGE_CL.addExternalSymbol("SIMPLE-WARNING");
    public static final Symbol STORAGE_CONDITION                = PACKAGE_CL.addExternalSymbol("STORAGE-CONDITION");
    public static final Symbol STREAM_ERROR                     = PACKAGE_CL.addExternalSymbol("STREAM-ERROR");
    public static final Symbol STYLE_WARNING                    = PACKAGE_CL.addExternalSymbol("STYLE-WARNING");
    public static final Symbol TYPE_ERROR                       = PACKAGE_CL.addExternalSymbol("TYPE-ERROR");
    public static final Symbol UNBOUND_SLOT                     = PACKAGE_CL.addExternalSymbol("UNBOUND-SLOT");
    public static final Symbol UNBOUND_VARIABLE                 = PACKAGE_CL.addExternalSymbol("UNBOUND-VARIABLE");
    public static final Symbol UNDEFINED_FUNCTION               = PACKAGE_CL.addExternalSymbol("UNDEFINED-FUNCTION");
    public static final Symbol WARNING                          = PACKAGE_CL.addExternalSymbol("WARNING");

    // Internal symbols.
    public static final Symbol BACKQUOTE                        = PACKAGE_CL.addInternalSymbol("BACKQUOTE");
    public static final Symbol COMMA                            = PACKAGE_CL.addInternalSymbol("COMMA");
    public static final Symbol COMMA_ATSIGN                     = PACKAGE_CL.addInternalSymbol("COMMA-ATSIGN");
    public static final Symbol COMMA_DOT                        = PACKAGE_CL.addInternalSymbol("COMMA-DOT");
    public static final Symbol MACROEXPAND_MACRO                = PACKAGE_SYS.addInternalSymbol("MACROEXPAND-MACRO");

    public static final Symbol ARRAY_DIMENSION_LIMIT            = PACKAGE_CL.addExternalSymbol("ARRAY-DIMENSION-LIMIT");
    static {
        ARRAY_DIMENSION_LIMIT.setSymbolValue(new Fixnum(0x1000000));
        ARRAY_DIMENSION_LIMIT.setConstant(true);
    }

    // Bit flags.
    private static final int FLAG_SPECIAL  = 0x0001;
    private static final int FLAG_CONSTANT = 0x0002;

    public static final Symbol addFunction(String name, LispObject obj)
    {
        Symbol symbol = PACKAGE_CL.intern(name);
        try {
            PACKAGE_CL.export(symbol); // FIXME Inefficient!
        }
        catch (ConditionThrowable t) {
            Debug.trace(t);
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

    public LispClass classOf()
    {
        return BuiltInClass.SYMBOL;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.SYMBOL)
            return T;
        if (type == BuiltInClass.SYMBOL)
            return T;
        if (type == Symbol.KEYWORD)
            return pkg == PACKAGE_KEYWORD ? T : NIL;
        if (type == Symbol.BOOLEAN)
            return this == T ? T : NIL;
        return super.typep(type);
    }

    public final LispObject SYMBOLP()
    {
        return T;
    }

    public LispObject CONSTANTP()
    {
        return (flags & FLAG_CONSTANT) != 0 ? T : NIL;
    }

    public LispObject getPackage()
    {
        return pkg != null ? pkg : NIL;
    }

    public void setPackage(LispObject obj)
    {
        pkg = obj;
    }

    public final boolean isSpecialVariable()
    {
        return (flags & FLAG_SPECIAL) != 0;
    }

    public final void setSpecial(boolean b)
    {
        if (b)
            flags |= FLAG_SPECIAL;
        else
            flags &= ~FLAG_SPECIAL;
    }

    public final boolean isConstant()
    {
        return (flags & FLAG_CONSTANT) != 0;
    }

    public final void setConstant(boolean b)
    {
        if (b)
            flags |= FLAG_CONSTANT;
        else
            flags &= ~FLAG_CONSTANT;
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

    public final LispObject symbolValue() throws ConditionThrowable
    {
        LispObject val = LispThread.currentThread().lookupSpecial(this);
        if (val != null)
            return val;
        if (value != null)
            return value;
        return signal(new LispError(toString().concat(" has no dynamic value")));
    }

    public final LispObject symbolValueNoThrow()
    {
        if ((flags & FLAG_SPECIAL) != 0) {
            LispObject val = LispThread.currentThread().lookupSpecial(this);
            if (val != null)
                return val;
        }
        return value;
    }

    public final LispObject symbolValueNoThrow(LispThread thread)
    {
        if ((flags & FLAG_SPECIAL) != 0) {
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

    public final LispObject getSymbolFunctionOrDie() throws ConditionThrowable
    {
        if (function == null)
            return signal(new UndefinedFunction(this));
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

    private static final Symbol _FUNCTION_DOCUMENTATION =
        PACKAGE_SYS.intern("%FUNCTION-DOCUMENTATION");

    private static final Symbol _VARIABLE_DOCUMENTATION =
        PACKAGE_SYS.intern("%VARIABLE-DOCUMENTATION");

    // Returns null if there is no function documentation.
    public final LispObject getFunctionDocumentation() throws ConditionThrowable
    {
        return get(this, _FUNCTION_DOCUMENTATION);
    }

    public final void setFunctionDocumentation(String docstring)
        throws ConditionThrowable
    {
        put(this, _FUNCTION_DOCUMENTATION, new LispString(docstring));
    }

    public final void setFunctionDocumentation(LispObject documentation)
        throws ConditionThrowable
    {
        put(this, _FUNCTION_DOCUMENTATION, documentation);
    }

    public final void setVariableDocumentation(LispObject documentation)
        throws ConditionThrowable
    {
        put(this, _VARIABLE_DOCUMENTATION, documentation);
    }

    public String toString()
    {
        LispObject printCase = _PRINT_CASE_.symbolValueNoThrow();
        if (pkg == PACKAGE_KEYWORD) {
            if (printCase == Keyword.DOWNCASE)
                return ":".concat(name.toLowerCase());
            else
                return ":".concat(name);
        }
        if (_PRINT_ESCAPE_.symbolValueNoThrow() == NIL) {
            if (printCase == Keyword.DOWNCASE)
                return name.toLowerCase();
            else
                return name;
        }
        boolean escape = false;
        for (int i = name.length(); i-- > 0;) {
            char c = name.charAt(i);
            if (c == '(' || c == ')' || c == ',') {
                escape = true;
                break;
            }
            if (Character.isWhitespace(c)) {
                escape = true;
                break;
            }
            if (Character.isLowerCase(c)) {
                escape = true;
                break;
            }
        }
        String s = escape ? ("|" + name + "|") : name;
        if (!escape) {
            if (printCase == Keyword.DOWNCASE)
                s = s.toLowerCase();
        }
        if (pkg == null || pkg == NIL) {
            if (_PRINT_GENSYM_.symbolValueNoThrow() != NIL)
                return "#:".concat(s);
            else
                return s;
        }
        // "Package prefixes are printed if necessary." (22.1.3.3.1)
        final Package currentPackage = (Package) _PACKAGE_.symbolValueNoThrow();
        if (pkg == currentPackage)
            return s;
        if (currentPackage != null && currentPackage.uses(pkg)) {
            if (((Package)pkg).findExternalSymbol(name) != null)
                return s;
        }
        // Package prefix is necessary.
        String packageName = pkg.getName();
        if (printCase == Keyword.DOWNCASE)
            packageName = packageName.toLowerCase();
        StringBuffer sb = new StringBuffer(packageName);
        if (((Package)pkg).findExternalSymbol(name) != null)
            sb.append(':');
        else
            sb.append("::");
        sb.append(s);
        return sb.toString();
    }

    public final int hashCode()
    {
        return name.hashCode();
    }

    public final boolean equals(Object obj)
    {
        return this == obj;
    }

    // ### symbol-name
    public static final Primitive1 SYMBOL_NAME = new Primitive1("symbol-name","symbol")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return new LispString(((Symbol)arg).name);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "symbol"));
            }
        }
    };

    // ### symbol-package
    public static final Primitive1 SYMBOL_PACKAGE = new Primitive1("symbol-package","symbol")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                LispObject pkg = ((Symbol)arg).pkg;
                return pkg != null ? pkg : NIL;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "symbol"));
            }
        }
    };

    // ### symbol-function
    public static final Primitive1 SYMBOL_FUNCTION =
        new Primitive1("symbol-function", "symbol")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                LispObject function = ((Symbol)arg).function;
                if (function != null)
                    return function;
                return signal(new UndefinedFunction(arg));
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "symbol"));
            }
        }
    };

    // ### symbol-plist
    public static final Primitive1 SYMBOL_PLIST = new Primitive1("symbol-plist","symbol")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                LispObject propertyList = ((Symbol)arg).propertyList;
                return propertyList != null ? propertyList : NIL;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "symbol"));
            }
        }
    };

    // ### keywordp
    public static final Primitive1 KEYWORDP = new Primitive1("keywordp","object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof Symbol) {
                if (((Symbol)arg).pkg == PACKAGE_KEYWORD)
                    return T;
            }
            return NIL;
        }
    };

    // ### make-symbol
    public static final Primitive1 MAKE_SYMBOL = new Primitive1("make-symbol","name")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new Symbol(LispString.getValue(arg));
        }
    };

    // makunbound
    public static final Primitive1 MAKUNBOUND = new Primitive1("makunbound","symbol")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                ((Symbol)arg).value = null;
                return arg;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "symbol"));
            }
        }
    };

}

