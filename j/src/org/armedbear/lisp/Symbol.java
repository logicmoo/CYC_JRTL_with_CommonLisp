/*
 * Symbol.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Symbol.java,v 1.143 2004-08-15 10:58:21 piso Exp $
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
    public static final Symbol BREAK                            = PACKAGE_CL.addExternalSymbol("BREAK");
    public static final Symbol CDR                              = PACKAGE_CL.addExternalSymbol("CDR");
    public static final Symbol DECLARE                          = PACKAGE_CL.addExternalSymbol("DECLARE");
    public static final Symbol DOCUMENTATION                    = PACKAGE_CL.addExternalSymbol("DOCUMENTATION");
    public static final Symbol EQ                               = PACKAGE_CL.addExternalSymbol("EQ");
    public static final Symbol EQL                              = PACKAGE_CL.addExternalSymbol("EQL");
    public static final Symbol EQUAL                            = PACKAGE_CL.addExternalSymbol("EQUAL");
    public static final Symbol EQUALP                           = PACKAGE_CL.addExternalSymbol("EQUALP");
    public static final Symbol EVAL                             = PACKAGE_CL.addExternalSymbol("EVAL");
    public static final Symbol FLET                             = PACKAGE_CL.addExternalSymbol("FLET");
    public static final Symbol FORMAT                           = PACKAGE_CL.addExternalSymbol("FORMAT");
    public static final Symbol FUNCALL                          = PACKAGE_CL.addExternalSymbol("FUNCALL");
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

    public static final Symbol CASE_FROB_STREAM                 = PACKAGE_SYS.addInternalSymbol("CASE-FROB-STREAM");
    public static final Symbol NIL_VECTOR                       = PACKAGE_SYS.addInternalSymbol("NIL-VECTOR");
    public static final Symbol SOCKET_STREAM                    = PACKAGE_SYS.addInternalSymbol("SOCKET-STREAM");
    public static final Symbol STRING_INPUT_STREAM              = PACKAGE_SYS.addInternalSymbol("STRING-INPUT-STREAM");
    public static final Symbol STRING_OUTPUT_STREAM             = PACKAGE_SYS.addInternalSymbol("STRING-OUTPUT-STREAM");

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
    public static final Symbol _SETF_FUNCTION                   = PACKAGE_SYS.addInternalSymbol("%SETF-FUNCTION");
    public static final Symbol _SOURCE                          = PACKAGE_SYS.addInternalSymbol("%SOURCE");

    public static final Symbol DOUBLE_FLOAT_POSITIVE_INFINITY   = PACKAGE_EXT.addExternalSymbol("DOUBLE-FLOAT-POSITIVE-INFINITY");
    public static final Symbol DOUBLE_FLOAT_NEGATIVE_INFINITY   = PACKAGE_EXT.addExternalSymbol("DOUBLE-FLOAT-NEGATIVE-INFINITY");

    // Bit flags.
    private static final int FLAG_SPECIAL           = 0x0001;
    private static final int FLAG_CONSTANT          = 0x0002;
    private static final int FLAG_BUILT_IN_FUNCTION = 0x0004;

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
        pkg = NIL;
    }

    public Symbol(String name, Package pkg)
    {
        this.name = name;
        this.pkg = pkg;
    }

    public LispObject typeOf()
    {
        if (pkg == PACKAGE_KEYWORD)
            return Symbol.KEYWORD;
        else
            return Symbol.SYMBOL;
    }

    public LispClass classOf()
    {
        return BuiltInClass.SYMBOL;
    }

    public LispObject getDescription()
    {
        StringBuffer sb = new StringBuffer("The symbol ");
        sb.append(name);
        return new SimpleString(sb);
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

    public boolean constantp()
    {
        return (flags & FLAG_CONSTANT) != 0;
    }

    public final LispObject STRING()
    {
        return new SimpleString(name);
    }

    public final LispObject getPackage()
    {
        return pkg;
    }

    public final void setPackage(LispObject obj)
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

    public final boolean isBuiltInFunction()
    {
        return (flags & FLAG_BUILT_IN_FUNCTION) != 0;
    }

    public final void setBuiltInFunction(boolean b)
    {
        if (b)
            flags |= FLAG_BUILT_IN_FUNCTION;
        else
            flags &= ~FLAG_BUILT_IN_FUNCTION;
    }

    public final String getName()
    {
        return name;
    }

    public final String getQualifiedName()
    {
        if (pkg == NIL)
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
        return signal(new LispError(writeToString().concat(" has no dynamic value.")));
    }

    public final LispObject symbolValue(LispThread thread) throws ConditionThrowable
    {
        LispObject val = thread.lookupSpecial(this);
        if (val != null)
            return val;
        if (value != null)
            return value;
        return signal(new LispError(writeToString().concat(" has no dynamic value.")));
    }

    public final LispObject symbolValueNoThrow()
    {
        try {
            if ((flags & FLAG_SPECIAL) != 0) {
                LispObject val = LispThread.currentThread().lookupSpecial(this);
                if (val != null)
                    return val;
            }
            return value;
        }
        catch (ConditionThrowable t) {
            return null;
        }
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
        if (function instanceof Autoload) {
            Autoload autoload = (Autoload) function;
            autoload.load();
        }
        return function;
    }

    public final LispObject getSymbolSetfFunctionOrDie() throws ConditionThrowable
    {
        LispObject obj = get(this, Symbol._SETF_FUNCTION);
        if (obj == null)
            return signal(new LispError("The function (SETF " + name +
                                        ") is undefined."));
        return obj;
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
        put(this, _FUNCTION_DOCUMENTATION, new SimpleString(docstring));
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

    public String writeToString() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        boolean printEscape = (_PRINT_ESCAPE_.symbolValue(thread) != NIL);
        LispObject printCase = _PRINT_CASE_.symbolValue(thread);
        LispObject readtableCase = currentReadtable().getReadtableCase();
        boolean printReadably = (_PRINT_READABLY_.symbolValue(thread) != NIL);
        if (printReadably) {
            if (readtableCase != Keyword.UPCASE ||
                printCase != Keyword.UPCASE)
            {
                StringBuffer sb = new StringBuffer();
                if (pkg == PACKAGE_KEYWORD) {
                    sb.append(':');
                } else if (pkg != NIL) {
                    sb.append(multipleEscape(pkg.getName()));
                    sb.append("::");
                } else {
                    sb.append("#:");
                }
                sb.append(multipleEscape(name));
                return sb.toString();
            } else
                printEscape = true;
        }
        if (!printEscape) {
            if (pkg == PACKAGE_KEYWORD) {
                if (printCase == Keyword.DOWNCASE)
                    return name.toLowerCase();
                if (printCase == Keyword.CAPITALIZE)
                    return capitalize(name, readtableCase);
                return name;
            }
            // Printer escaping is disabled.
            if (readtableCase == Keyword.UPCASE) {
                if (printCase == Keyword.DOWNCASE)
                    return name.toLowerCase();
                if (printCase == Keyword.CAPITALIZE)
                    return capitalize(name, readtableCase);
                return name;
            } else if (readtableCase == Keyword.DOWNCASE) {
                // "When the readtable case is :DOWNCASE, uppercase characters
                // are printed in their own case, and lowercase characters are
                // printed in the case specified by *PRINT-CASE*." (22.1.3.3.2)
                if (printCase == Keyword.DOWNCASE)
                    return name;
                if (printCase == Keyword.UPCASE)
                    return name.toUpperCase();
                if (printCase == Keyword.CAPITALIZE)
                    return capitalize(name, readtableCase);
                return name;
            } else if (readtableCase == Keyword.PRESERVE) {
                return name;
            } else // INVERT
                return invert(name);
        }
        // Printer escaping is enabled.
        final boolean escape = needsEscape(name, readtableCase, thread);
        String s = escape ? multipleEscape(name) : name;
        if (!escape) {
            if (readtableCase == Keyword.PRESERVE)
                ;
            else if (readtableCase == Keyword.INVERT)
                s = invert(s);
            else if (printCase == Keyword.DOWNCASE)
                s = s.toLowerCase();
            else if (printCase == Keyword.UPCASE)
                s = s.toUpperCase();
            else if (printCase == Keyword.CAPITALIZE)
                s = capitalize(s, readtableCase);
        }
        if (pkg == NIL) {
            if (printReadably || _PRINT_GENSYM_.symbolValue(thread) != NIL)
                return "#:".concat(s);
            else
                return s;
        }
        if (pkg == PACKAGE_KEYWORD)
            return ":".concat(s);
        // "Package prefixes are printed if necessary." (22.1.3.3.1)
        final Package currentPackage = (Package) _PACKAGE_.symbolValue(thread);
        if (pkg == currentPackage)
            return s;
        if (currentPackage != null && currentPackage.uses(pkg)) {
            // Check for name conflict in current package.
            if (currentPackage.findExternalSymbol(name) == null)
                if (currentPackage.findInternalSymbol(name) == null)
                    if (((Package)pkg).findExternalSymbol(name) != null)
                        return s;
        }
        // Has this symbol been imported into the current package?
        if (currentPackage.findExternalSymbol(name) == this)
            return s;
        if (currentPackage.findInternalSymbol(name) == this)
            return s;
        // Package prefix is necessary.
        String packageName = pkg.getName();
        if (needsEscape(packageName, readtableCase, thread))
            packageName = multipleEscape(packageName);
        else if (printCase == Keyword.DOWNCASE)
            packageName = packageName.toLowerCase();
        StringBuffer sb = new StringBuffer(packageName);
        if (((Package)pkg).findExternalSymbol(name) != null)
            sb.append(':');
        else
            sb.append("::");
        sb.append(s);
        return sb.toString();
    }

    private static final boolean needsEscape(String s,
                                             LispObject readtableCase,
                                             LispThread thread)
        throws ConditionThrowable
    {
        boolean escape = false;
        final int length = s.length();
        if (length == 0)
            return true;
        if (s.charAt(0) == '#')
            return true;
        int radix;
        try {
            radix = ((Fixnum)_PRINT_BASE_.symbolValue(thread)).value;
        }
        catch (ClassCastException e) {
            signal(new TypeError("The value of *PRINT-BASE* is not of type (INTEGER 2 36)."));
            // Not reached.
            return false;
        }
        if (radix < 2 || radix > 36) {
            signal(new TypeError("The value of *PRINT-BASE* is not of type (INTEGER 2 36)."));
            // Not reached.
            return false;
        }
        boolean seenNonDigit = false;
        for (int i = length; i-- > 0;) {
            char c = s.charAt(i);
            if ("(),|\\`'\";".indexOf(c) >= 0)
                return true;
            if (Character.isWhitespace(c))
                return true;
            if (readtableCase == Keyword.UPCASE) {
                if (Character.isLowerCase(c))
                    return true;
            } else if (readtableCase == Keyword.DOWNCASE) {
                if (Character.isUpperCase(c))
                    return true;
            }
            if (!escape && !seenNonDigit) {
                if (Character.digit(c, radix) < 0)
                    seenNonDigit = true;
            }
        }
        if (!seenNonDigit)
                return true;
        if (s.length() > 0 && s.charAt(0) == '.') {
            boolean allDots = true;
            for (int i = s.length(); i-- > 1;) {
                if (s.charAt(i) != '.') {
                    allDots = false;
                    break;
                }
            }
            if (allDots)
                return true;
        }
        return false;
    }

    private static final String multipleEscape(String s)
    {
        StringBuffer sb = new StringBuffer("|");
        final int limit = s.length();
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            if (c == '|' || c == '\\')
                sb.append('\\');
            sb.append(c);
        }
        sb.append('|');
        return sb.toString();
    }

    private static final String capitalize(String s, LispObject readtableCase)
    {
        if (readtableCase == Keyword.INVERT || readtableCase == Keyword.PRESERVE)
            return s;
        final int limit = s.length();
        StringBuffer sb = new StringBuffer(limit);
        boolean lastCharWasAlphanumeric = false;
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                if (readtableCase == Keyword.UPCASE)
                    sb.append(c);
                else // DOWNCASE
                    sb.append(lastCharWasAlphanumeric ? c : Utilities.toUpperCase(c));
                lastCharWasAlphanumeric = true;
            } else if (Character.isUpperCase(c)) {
                if (readtableCase == Keyword.UPCASE)
                    sb.append(lastCharWasAlphanumeric ? Utilities.toLowerCase(c) : c);
                else // DOWNCASE
                    sb.append(c);
                lastCharWasAlphanumeric = true;
            } else {
                sb.append(c);
                lastCharWasAlphanumeric = Character.isDigit(c);
            }
        }
        return sb.toString();
    }

    public LispObject getParts() throws ConditionThrowable
    {
        LispObject result = NIL;
        result = result.push(new Cons(new SimpleString("name"), new SimpleString(name)));
        result = result.push(new Cons(new SimpleString("package"), pkg));
        result = result.push(new Cons(new SimpleString("value"),
                                      value != null ? value : UNBOUND));
        result = result.push(new Cons(new SimpleString("function"),
                                      function != null ? function : UNBOUND));
        result = result.push(new Cons(new SimpleString("plist"), getPropertyList()));
        return result.nreverse();
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
                return new SimpleString(((Symbol)arg).name);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.SYMBOL));
            }
        }
    };

    // ### symbol-package
    public static final Primitive1 SYMBOL_PACKAGE = new Primitive1("symbol-package","symbol")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((Symbol)arg).pkg;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.SYMBOL));
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
                return signal(new TypeError(arg, Symbol.SYMBOL));
            }
        }
    };

    // ### symbol-plist
    public static final Primitive1 SYMBOL_PLIST = new Primitive1("symbol-plist", "symbol")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                LispObject propertyList = ((Symbol)arg).propertyList;
                return propertyList != null ? propertyList : NIL;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.SYMBOL));
            }
        }
    };

    // ### keywordp
    public static final Primitive1 KEYWORDP = new Primitive1("keywordp", "object")
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
    public static final Primitive1 MAKE_SYMBOL = new Primitive1("make-symbol", "name")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new Symbol(arg.getStringValue());
        }
    };

    // makunbound
    public static final Primitive1 MAKUNBOUND = new Primitive1("makunbound", "symbol")
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
