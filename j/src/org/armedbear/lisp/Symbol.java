/*
 * Symbol.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Symbol.java,v 1.212 2005-10-16 02:03:28 piso Exp $
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
    public static final Symbol AND_ALLOW_OTHER_KEYS                = PACKAGE_CL.addExternalSymbol("&ALLOW-OTHER-KEYS");
    public static final Symbol AND_AUX                             = PACKAGE_CL.addExternalSymbol("&AUX");
    public static final Symbol AND_BODY                            = PACKAGE_CL.addExternalSymbol("&BODY");
    public static final Symbol AND_ENVIRONMENT                     = PACKAGE_CL.addExternalSymbol("&ENVIRONMENT");
    public static final Symbol AND_KEY                             = PACKAGE_CL.addExternalSymbol("&KEY");
    public static final Symbol AND_OPTIONAL                        = PACKAGE_CL.addExternalSymbol("&OPTIONAL");
    public static final Symbol AND_REST                            = PACKAGE_CL.addExternalSymbol("&REST");
    public static final Symbol AND_WHOLE                           = PACKAGE_CL.addExternalSymbol("&WHOLE");
    public static final Symbol APPLY                               = PACKAGE_CL.addExternalSymbol("APPLY");
    public static final Symbol ARRAY_HAS_FILL_POINTER_P            = PACKAGE_CL.addExternalSymbol("ARRAY-HAS-FILL-POINTER-P");
    public static final Symbol BLOCK                               = PACKAGE_CL.addExternalSymbol("BLOCK");
    public static final Symbol BREAK                               = PACKAGE_CL.addExternalSymbol("BREAK");
    public static final Symbol CDR                                 = PACKAGE_CL.addExternalSymbol("CDR");
    public static final Symbol DECLARE                             = PACKAGE_CL.addExternalSymbol("DECLARE");
    public static final Symbol DOCUMENTATION                       = PACKAGE_CL.addExternalSymbol("DOCUMENTATION");
    public static final Symbol EQ                                  = PACKAGE_CL.addExternalSymbol("EQ");
    public static final Symbol EQL                                 = PACKAGE_CL.addExternalSymbol("EQL");
    public static final Symbol EQUAL                               = PACKAGE_CL.addExternalSymbol("EQUAL");
    public static final Symbol EQUALP                              = PACKAGE_CL.addExternalSymbol("EQUALP");
    public static final Symbol EVAL                                = PACKAGE_CL.addExternalSymbol("EVAL");
    public static final Symbol FLET                                = PACKAGE_CL.addExternalSymbol("FLET");
    public static final Symbol FORMAT                              = PACKAGE_CL.addExternalSymbol("FORMAT");
    public static final Symbol FUNCALL                             = PACKAGE_CL.addExternalSymbol("FUNCALL");
    public static final Symbol GO                                  = PACKAGE_CL.addExternalSymbol("GO");
    public static final Symbol LAMBDA                              = PACKAGE_CL.addExternalSymbol("LAMBDA");
    public static final Symbol LET                                 = PACKAGE_CL.addExternalSymbol("LET");
    public static final Symbol LOAD                                = PACKAGE_CL.addExternalSymbol("LOAD");
    public static final Symbol MACRO_FUNCTION                      = PACKAGE_CL.addExternalSymbol("MACRO-FUNCTION");
    public static final Symbol OTHERWISE                           = PACKAGE_CL.addExternalSymbol("OTHERWISE");
    public static final Symbol OUTPUT_STREAM_P                     = PACKAGE_CL.addExternalSymbol("OUTPUT-STREAM-P");
    public static final Symbol QUOTE                               = PACKAGE_CL.addExternalSymbol("QUOTE");
    public static final Symbol SETF                                = PACKAGE_CL.addExternalSymbol("SETF");
    public static final Symbol SIGNAL                              = PACKAGE_CL.addExternalSymbol("SIGNAL");
    public static final Symbol SLOT_BOUNDP                         = PACKAGE_CL.addExternalSymbol("SLOT-BOUNDP");
    public static final Symbol SLOT_MISSING                        = PACKAGE_CL.addExternalSymbol("SLOT-MISSING");
    public static final Symbol SLOT_UNBOUND                        = PACKAGE_CL.addExternalSymbol("SLOT-UNBOUND");
    public static final Symbol SLOT_VALUE                          = PACKAGE_CL.addExternalSymbol("SLOT-VALUE");
    public static final Symbol SPECIAL                             = PACKAGE_CL.addExternalSymbol("SPECIAL");
    public static final Symbol TRANSLATE_LOGICAL_PATHNAME          = PACKAGE_CL.addExternalSymbol("TRANSLATE-LOGICAL-PATHNAME");
    public static final Symbol UPDATE_INSTANCE_FOR_REDEFINED_CLASS = PACKAGE_CL.addExternalSymbol("UPDATE-INSTANCE-FOR-REDEFINED-CLASS");
    public static final Symbol VARIABLE                            = PACKAGE_CL.addExternalSymbol("VARIABLE");

    // Type specifiers.
    public static final Symbol AND                                 = PACKAGE_CL.addExternalSymbol("AND");
    public static final Symbol ARRAY                               = PACKAGE_CL.addExternalSymbol("ARRAY");
    public static final Symbol ATOM                                = PACKAGE_CL.addExternalSymbol("ATOM");
    public static final Symbol BASE_CHAR                           = PACKAGE_CL.addExternalSymbol("BASE-CHAR");
    public static final Symbol BASE_STRING                         = PACKAGE_CL.addExternalSymbol("BASE-STRING");
    public static final Symbol BIGNUM                              = PACKAGE_CL.addExternalSymbol("BIGNUM");
    public static final Symbol BIT                                 = PACKAGE_CL.addExternalSymbol("BIT");
    public static final Symbol BIT_VECTOR                          = PACKAGE_CL.addExternalSymbol("BIT-VECTOR");
    public static final Symbol BOOLEAN                             = PACKAGE_CL.addExternalSymbol("BOOLEAN");
    public static final Symbol BROADCAST_STREAM                    = PACKAGE_CL.addExternalSymbol("BROADCAST-STREAM");
    public static final Symbol BUILT_IN_CLASS                      = PACKAGE_CL.addExternalSymbol("BUILT-IN-CLASS");
    public static final Symbol CELL_ERROR                          = PACKAGE_CL.addExternalSymbol("CELL-ERROR");
    public static final Symbol CHARACTER                           = PACKAGE_CL.addExternalSymbol("CHARACTER");
    public static final Symbol CLASS                               = PACKAGE_CL.addExternalSymbol("CLASS");
    public static final Symbol COMPILED_FUNCTION                   = PACKAGE_CL.addExternalSymbol("COMPILED-FUNCTION");
    public static final Symbol COMPLEX                             = PACKAGE_CL.addExternalSymbol("COMPLEX");
    public static final Symbol CONCATENATED_STREAM                 = PACKAGE_CL.addExternalSymbol("CONCATENATED-STREAM");
    public static final Symbol CONS                                = PACKAGE_CL.addExternalSymbol("CONS");
    public static final Symbol DOUBLE_FLOAT                        = PACKAGE_CL.addExternalSymbol("DOUBLE-FLOAT");
    public static final Symbol ECHO_STREAM                         = PACKAGE_CL.addExternalSymbol("ECHO-STREAM");
    public static final Symbol EXTENDED_CHAR                       = PACKAGE_CL.addExternalSymbol("EXTENDED-CHAR");
    public static final Symbol FILE_STREAM                         = PACKAGE_CL.addExternalSymbol("FILE-STREAM");
    public static final Symbol FIXNUM                              = PACKAGE_CL.addExternalSymbol("FIXNUM");
    public static final Symbol FLOAT                               = PACKAGE_CL.addExternalSymbol("FLOAT");
    public static final Symbol FUNCTION                            = PACKAGE_CL.addExternalSymbol("FUNCTION");
    public static final Symbol GENERIC_FUNCTION                    = PACKAGE_CL.addExternalSymbol("GENERIC-FUNCTION");
    public static final Symbol HASH_TABLE                          = PACKAGE_CL.addExternalSymbol("HASH-TABLE");
    public static final Symbol INTEGER                             = PACKAGE_CL.addExternalSymbol("INTEGER");
    public static final Symbol KEYWORD                             = PACKAGE_CL.addExternalSymbol("KEYWORD");
    public static final Symbol LIST                                = PACKAGE_CL.addExternalSymbol("LIST");
    public static final Symbol LOGICAL_PATHNAME                    = PACKAGE_CL.addExternalSymbol("LOGICAL-PATHNAME");
    public static final Symbol LONG_FLOAT                          = PACKAGE_CL.addExternalSymbol("LONG-FLOAT");
    public static final Symbol MEMBER                              = PACKAGE_CL.addExternalSymbol("MEMBER");
    public static final Symbol METHOD                              = PACKAGE_CL.addExternalSymbol("METHOD");
    public static final Symbol METHOD_COMBINATION                  = PACKAGE_CL.addExternalSymbol("METHOD-COMBINATION");
    public static final Symbol NOT                                 = PACKAGE_CL.addExternalSymbol("NOT");
    public static final Symbol NULL                                = PACKAGE_CL.addExternalSymbol("NULL");
    public static final Symbol NUMBER                              = PACKAGE_CL.addExternalSymbol("NUMBER");
    public static final Symbol OR                                  = PACKAGE_CL.addExternalSymbol("OR");
    public static final Symbol PACKAGE                             = PACKAGE_CL.addExternalSymbol("PACKAGE");
    public static final Symbol PATHNAME                            = PACKAGE_CL.addExternalSymbol("PATHNAME");
    public static final Symbol RANDOM_STATE                        = PACKAGE_CL.addExternalSymbol("RANDOM-STATE");
    public static final Symbol RATIO                               = PACKAGE_CL.addExternalSymbol("RATIO");
    public static final Symbol RATIONAL                            = PACKAGE_CL.addExternalSymbol("RATIONAL");
    public static final Symbol REAL                                = PACKAGE_CL.addExternalSymbol("REAL");
    public static final Symbol READTABLE                           = PACKAGE_CL.addExternalSymbol("READTABLE");
    public static final Symbol RESTART                             = PACKAGE_CL.addExternalSymbol("RESTART");
    public static final Symbol SATISFIES                           = PACKAGE_CL.addExternalSymbol("SATISFIES");
    public static final Symbol SEQUENCE                            = PACKAGE_CL.addExternalSymbol("SEQUENCE");
    public static final Symbol SHORT_FLOAT                         = PACKAGE_CL.addExternalSymbol("SHORT-FLOAT");
    public static final Symbol SIGNED_BYTE                         = PACKAGE_CL.addExternalSymbol("SIGNED-BYTE");
    public static final Symbol SIMPLE_ARRAY                        = PACKAGE_CL.addExternalSymbol("SIMPLE-ARRAY");
    public static final Symbol SIMPLE_BASE_STRING                  = PACKAGE_CL.addExternalSymbol("SIMPLE-BASE-STRING");
    public static final Symbol SIMPLE_BIT_VECTOR                   = PACKAGE_CL.addExternalSymbol("SIMPLE-BIT-VECTOR");
    public static final Symbol SIMPLE_STRING                       = PACKAGE_CL.addExternalSymbol("SIMPLE-STRING");
    public static final Symbol SIMPLE_VECTOR                       = PACKAGE_CL.addExternalSymbol("SIMPLE-VECTOR");
    public static final Symbol SINGLE_FLOAT                        = PACKAGE_CL.addExternalSymbol("SINGLE-FLOAT");
    public static final Symbol STANDARD                            = PACKAGE_CL.addExternalSymbol("STANDARD");
    public static final Symbol STANDARD_CHAR                       = PACKAGE_CL.addExternalSymbol("STANDARD-CHAR");
    public static final Symbol STANDARD_CLASS                      = PACKAGE_CL.addExternalSymbol("STANDARD-CLASS");
    public static final Symbol STANDARD_GENERIC_FUNCTION           = PACKAGE_CL.addExternalSymbol("STANDARD-GENERIC-FUNCTION");
    public static final Symbol STANDARD_METHOD                     = PACKAGE_CL.addExternalSymbol("STANDARD-METHOD");
    public static final Symbol STANDARD_OBJECT                     = PACKAGE_CL.addExternalSymbol("STANDARD-OBJECT");
    public static final Symbol STREAM                              = PACKAGE_CL.addExternalSymbol("STREAM");
    public static final Symbol STRING                              = PACKAGE_CL.addExternalSymbol("STRING");
    public static final Symbol STRING_STREAM                       = PACKAGE_CL.addExternalSymbol("STRING-STREAM");
    public static final Symbol STRUCTURE_CLASS                     = PACKAGE_CL.addExternalSymbol("STRUCTURE-CLASS");
    public static final Symbol STRUCTURE_OBJECT                    = PACKAGE_CL.addExternalSymbol("STRUCTURE-OBJECT");
    public static final Symbol SYMBOL                              = PACKAGE_CL.addExternalSymbol("SYMBOL");
    public static final Symbol SYNONYM_STREAM                      = PACKAGE_CL.addExternalSymbol("SYNONYM-STREAM");
    public static final Symbol TWO_WAY_STREAM                      = PACKAGE_CL.addExternalSymbol("TWO-WAY-STREAM");
    public static final Symbol UNSIGNED_BYTE                       = PACKAGE_CL.addExternalSymbol("UNSIGNED-BYTE");
    public static final Symbol VECTOR                              = PACKAGE_CL.addExternalSymbol("VECTOR");

    public static final Symbol CASE_FROB_STREAM                    = PACKAGE_SYS.addInternalSymbol("CASE-FROB-STREAM");
    public static final Symbol ENVIRONMENT                         = PACKAGE_SYS.addExternalSymbol("ENVIRONMENT");
    public static final Symbol FORWARD_REFERENCED_CLASS            = PACKAGE_SYS.addExternalSymbol("FORWARD-REFERENCED-CLASS");
    public static final Symbol NIL_VECTOR                          = PACKAGE_EXT.addExternalSymbol("NIL-VECTOR");
    public static final Symbol SLIME_INPUT_STREAM                  = PACKAGE_EXT.addExternalSymbol("SLIME-INPUT-STREAM");
    public static final Symbol SLIME_OUTPUT_STREAM                 = PACKAGE_EXT.addExternalSymbol("SLIME-OUTPUT-STREAM");
    public static final Symbol SOCKET_STREAM                       = PACKAGE_SYS.addInternalSymbol("SOCKET-STREAM");
    public static final Symbol STRING_INPUT_STREAM                 = PACKAGE_SYS.addInternalSymbol("STRING-INPUT-STREAM");
    public static final Symbol STRING_OUTPUT_STREAM                = PACKAGE_SYS.addInternalSymbol("STRING-OUTPUT-STREAM");

    public static final Symbol UNSPECIFIED                         = PACKAGE_CL.addExternalSymbol("*");

    // Condition types.
    public static final Symbol ARITHMETIC_ERROR                    = PACKAGE_CL.addExternalSymbol("ARITHMETIC-ERROR");
    public static final Symbol CONDITION                           = PACKAGE_CL.addExternalSymbol("CONDITION");
    public static final Symbol CONTROL_ERROR                       = PACKAGE_CL.addExternalSymbol("CONTROL-ERROR");
    public static final Symbol DIVISION_BY_ZERO                    = PACKAGE_CL.addExternalSymbol("DIVISION-BY-ZERO");
    public static final Symbol END_OF_FILE                         = PACKAGE_CL.addExternalSymbol("END-OF-FILE");
    public static final Symbol ERROR                               = PACKAGE_CL.addExternalSymbol("ERROR");
    public static final Symbol FILE_ERROR                          = PACKAGE_CL.addExternalSymbol("FILE-ERROR");
    public static final Symbol FLOATING_POINT_INEXACT              = PACKAGE_CL.addExternalSymbol("FLOATING-POINT-INEXACT");
    public static final Symbol FLOATING_POINT_INVALID_OPERATION    = PACKAGE_CL.addExternalSymbol("FLOATING-POINT-INVALID-OPERATION");
    public static final Symbol FLOATING_POINT_OVERFLOW             = PACKAGE_CL.addExternalSymbol("FLOATING-POINT-OVERFLOW");
    public static final Symbol FLOATING_POINT_UNDERFLOW            = PACKAGE_CL.addExternalSymbol("FLOATING-POINT-UNDERFLOW");
    public static final Symbol PACKAGE_ERROR                       = PACKAGE_CL.addExternalSymbol("PACKAGE-ERROR");
    public static final Symbol PARSE_ERROR                         = PACKAGE_CL.addExternalSymbol("PARSE-ERROR");
    public static final Symbol PRINT_NOT_READABLE                  = PACKAGE_CL.addExternalSymbol("PRINT-NOT-READABLE");
    public static final Symbol PROGRAM_ERROR                       = PACKAGE_CL.addExternalSymbol("PROGRAM-ERROR");
    public static final Symbol READER_ERROR                        = PACKAGE_CL.addExternalSymbol("READER-ERROR");
    public static final Symbol SERIOUS_CONDITION                   = PACKAGE_CL.addExternalSymbol("SERIOUS-CONDITION");
    public static final Symbol SIMPLE_CONDITION                    = PACKAGE_CL.addExternalSymbol("SIMPLE-CONDITION");
    public static final Symbol SIMPLE_ERROR                        = PACKAGE_CL.addExternalSymbol("SIMPLE-ERROR");
    public static final Symbol SIMPLE_TYPE_ERROR                   = PACKAGE_CL.addExternalSymbol("SIMPLE-TYPE-ERROR");
    public static final Symbol SIMPLE_WARNING                      = PACKAGE_CL.addExternalSymbol("SIMPLE-WARNING");
    public static final Symbol STORAGE_CONDITION                   = PACKAGE_CL.addExternalSymbol("STORAGE-CONDITION");
    public static final Symbol STREAM_ERROR                        = PACKAGE_CL.addExternalSymbol("STREAM-ERROR");
    public static final Symbol STYLE_WARNING                       = PACKAGE_CL.addExternalSymbol("STYLE-WARNING");
    public static final Symbol TYPE_ERROR                          = PACKAGE_CL.addExternalSymbol("TYPE-ERROR");
    public static final Symbol UNBOUND_SLOT                        = PACKAGE_CL.addExternalSymbol("UNBOUND-SLOT");
    public static final Symbol UNBOUND_VARIABLE                    = PACKAGE_CL.addExternalSymbol("UNBOUND-VARIABLE");
    public static final Symbol UNDEFINED_FUNCTION                  = PACKAGE_CL.addExternalSymbol("UNDEFINED-FUNCTION");
    public static final Symbol WARNING                             = PACKAGE_CL.addExternalSymbol("WARNING");

    public static final Symbol COMPILER_ERROR                      = PACKAGE_EXT.addExternalSymbol("COMPILER-ERROR");
    public static final Symbol COMPILER_UNSUPPORTED_FEATURE_ERROR  = PACKAGE_EXT.addExternalSymbol("COMPILER-UNSUPPORTED-FEATURE-ERROR");

    // Internal symbols.
    public static final Symbol BACKQUOTE_MACRO                     = PACKAGE_SYS.addInternalSymbol("BACKQUOTE-MACRO");
    public static final Symbol CLASS_BYTES                         = PACKAGE_SYS.addExternalSymbol("CLASS-BYTES");
    public static final Symbol COMMA_MACRO                         = PACKAGE_SYS.addInternalSymbol("COMMA-MACRO");
    public static final Symbol DATUM                               = PACKAGE_SYS.addInternalSymbol("DATUM");
    public static final Symbol EXPECTED_TYPE                       = PACKAGE_SYS.addInternalSymbol("EXPECTED-TYPE");
    public static final Symbol FORMAT_ARGUMENTS                    = PACKAGE_SYS.addInternalSymbol("FORMAT-ARGUMENTS");
    public static final Symbol FORMAT_CONTROL                      = PACKAGE_SYS.addInternalSymbol("FORMAT-CONTROL");
    public static final Symbol FSET                                = PACKAGE_SYS.addInternalSymbol("FSET");
    public static final Symbol INSTANCE                            = PACKAGE_SYS.addInternalSymbol("INSTANCE");
    public static final Symbol LAYOUT                              = PACKAGE_SYS.addExternalSymbol("LAYOUT");
    public static final Symbol MACROEXPAND_MACRO                   = PACKAGE_SYS.addInternalSymbol("MACROEXPAND-MACRO");
    public static final Symbol NAME                                = PACKAGE_SYS.addInternalSymbol("NAME");
    public static final Symbol NAMED_LAMBDA                        = PACKAGE_SYS.addExternalSymbol("NAMED-LAMBDA");
    public static final Symbol OBJECT                              = PACKAGE_SYS.addInternalSymbol("OBJECT");
    public static final Symbol OPERANDS                            = PACKAGE_SYS.addInternalSymbol("OPERANDS");
    public static final Symbol OPERATION                           = PACKAGE_SYS.addInternalSymbol("OPERATION");
    public static final Symbol OUTPUT_OBJECT                       = PACKAGE_SYS.addExternalSymbol("OUTPUT-OBJECT");
    public static final Symbol SETF_FUNCTION                       = PACKAGE_SYS.addExternalSymbol("SETF-FUNCTION");
    public static final Symbol SETF_INVERSE                        = PACKAGE_SYS.addExternalSymbol("SETF-INVERSE");
    public static final Symbol SLOT_DEFINITION                     = PACKAGE_SYS.addExternalSymbol("SLOT-DEFINITION");
    public static final Symbol _DOCUMENTATION                      = PACKAGE_SYS.addExternalSymbol("%DOCUMENTATION");
    public static final Symbol _SOURCE                             = PACKAGE_SYS.addInternalSymbol("%SOURCE");

    public static final Symbol SINGLE_FLOAT_POSITIVE_INFINITY      = PACKAGE_EXT.addExternalSymbol("SINGLE-FLOAT-POSITIVE-INFINITY");
    public static final Symbol SINGLE_FLOAT_NEGATIVE_INFINITY      = PACKAGE_EXT.addExternalSymbol("SINGLE-FLOAT-NEGATIVE-INFINITY");
    public static final Symbol DOUBLE_FLOAT_POSITIVE_INFINITY      = PACKAGE_EXT.addExternalSymbol("DOUBLE-FLOAT-POSITIVE-INFINITY");
    public static final Symbol DOUBLE_FLOAT_NEGATIVE_INFINITY      = PACKAGE_EXT.addExternalSymbol("DOUBLE-FLOAT-NEGATIVE-INFINITY");

    public static final Symbol STYLE_WARN                          = PACKAGE_EXT.addExternalSymbol("STYLE-WARN");

    // Bit flags.
    private static final int FLAG_SPECIAL           = 0x0001;
    private static final int FLAG_CONSTANT          = 0x0002;
    private static final int FLAG_BUILT_IN_FUNCTION = 0x0004;
    private static final int FLAG_SINGLE_VALUED_P   = 0x0008;

    public static final Symbol addFunction(String name, LispObject obj)
    {
        try {
            Symbol symbol = PACKAGE_CL.internAndExport(name);
            symbol.function = obj;
            return symbol;
        }
        catch (ConditionThrowable t) {
            Debug.trace(t); // Shouldn't happen.
            return null;
        }
    }

    public final SimpleString name;
    private int hash = -1;
    private LispObject pkg; // Either a package object or NIL.
    private LispObject value;
    private LispObject function;
    private LispObject propertyList;
    private int flags;

    // Construct an uninterned symbol.
    public Symbol(String s)
    {
        name = new SimpleString(s);
        pkg = NIL;
    }

    public Symbol(SimpleString string)
    {
        name = string;
        pkg = NIL;
    }

    public Symbol(String s, Package pkg)
    {
        name = new SimpleString(s);
        this.pkg = pkg;
    }

    public Symbol(SimpleString string, Package pkg)
    {
        name = string;
        this.pkg = pkg;
    }

    public Symbol(SimpleString string, int hash, Package pkg)
    {
        name = string;
        this.hash = hash;
        this.pkg = pkg;
    }

    public LispObject typeOf()
    {
        if (pkg == PACKAGE_KEYWORD)
            return Symbol.KEYWORD;
        if (this == T)
            return Symbol.BOOLEAN;
        return Symbol.SYMBOL;
    }

    public LispObject classOf()
    {
        return BuiltInClass.SYMBOL;
    }

    public LispObject getDescription() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
        thread.bindSpecial(_PRINT_ESCAPE_, NIL);
        try {
            FastStringBuffer sb = new FastStringBuffer("The symbol ");
            sb.append(name.writeToString());
            sb.append(" at #x");
            sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
            if (pkg instanceof Package) {
                sb.append(", an ");
                Symbol sym = ((Package)pkg).findExternalSymbol(name);
                sb.append(sym == this ? "external" : "internal");
                sb.append(" symbol in the ");
                sb.append(((Package)pkg).getName());
                sb.append(" package");
            }
            return new SimpleString(sb);
        }
        finally {
            thread.lastSpecialBinding = lastSpecialBinding;
        }
    }

    public LispObject getParts() throws ConditionThrowable
    {
        LispObject parts = NIL;
        parts = parts.push(new Cons("name", name));
        parts = parts.push(new Cons("package", pkg));
        parts = parts.push(new Cons("value", value));
        parts = parts.push(new Cons("function", function));
        parts = parts.push(new Cons("plist", propertyList));
        parts = parts.push(new Cons("flags", new Fixnum(flags)));
        parts = parts.push(new Cons("hash", new Fixnum(hash)));
        return parts.nreverse();
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
        return name;
    }

    public final LispObject getPackage()
    {
        return pkg;
    }

    public final void setPackage(LispObject obj)
    {
        pkg = obj;
    }

    public final boolean isSpecialOperator()
    {
        return (function instanceof SpecialOperator);
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

    public final LispObject SINGLE_VALUED_P()
    {
        return (flags & FLAG_SINGLE_VALUED_P) != 0 ? T : NIL;
    }

    public final void setSingleValued(boolean b)
    {
        if (b)
            flags |= FLAG_SINGLE_VALUED_P;
        else
            flags &= ~FLAG_SINGLE_VALUED_P;
    }

    public final String getName()
    {
        try {
            return name.getStringValue();
        }
        catch (Throwable t) {
            Debug.trace(t);
            return null;
        }
    }

    public final String getQualifiedName()
    {
        try {
            final String n = name.getStringValue();
            if (pkg == NIL)
                return("#:".concat(n));
            if (pkg == PACKAGE_KEYWORD)
                return ":".concat(n);
            FastStringBuffer sb = new FastStringBuffer(((Package)pkg).getName());
            if (((Package)pkg).findExternalSymbol(name) != null)
                sb.append(':');
            else
                sb.append("::");
            sb.append(n);
            return sb.toString();
        }
        catch (Throwable t) {
            Debug.trace(t);
            return null;
        }
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
        return signal(new UnboundVariable(this));
    }

    public final LispObject symbolValue(LispThread thread) throws ConditionThrowable
    {
        LispObject val = thread.lookupSpecial(this);
        if (val != null)
            return val;
        if (value != null)
            return value;
        return signal(new UnboundVariable(this));
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
        if (function instanceof Autoload) {
            Autoload autoload = (Autoload) function;
            autoload.load();
        }
        return function;
    }

    public final LispObject getSymbolSetfFunctionOrDie()
        throws ConditionThrowable
    {
        LispObject obj = get(this, Symbol.SETF_FUNCTION, null);
        if (obj == null)
            signal(new UndefinedFunction(list2(Keyword.NAME,
                                               list2(Symbol.SETF,
                                                     this))));
        return obj;
    }

    public final void setSymbolFunction(LispObject obj)
    {
        this.function = obj;
    }

    public final LispObject getPropertyList()
    {
        if (propertyList == null)
            propertyList = NIL;
        return propertyList;
    }

    public final void setPropertyList(LispObject obj)
    {
        if (obj == null)
            throw new NullPointerException();
        propertyList = obj;
    }

    public String writeToString() throws ConditionThrowable
    {
        final String n = name.getStringValue();
        final LispThread thread = LispThread.currentThread();
        boolean printEscape = (_PRINT_ESCAPE_.symbolValue(thread) != NIL);
        LispObject printCase = _PRINT_CASE_.symbolValue(thread);
        final LispObject readtableCase =
            ((Readtable)_READTABLE_.symbolValue(thread)).getReadtableCase();
        boolean printReadably = (_PRINT_READABLY_.symbolValue(thread) != NIL);
        if (printReadably) {
            if (readtableCase != Keyword.UPCASE ||
                printCase != Keyword.UPCASE)
            {
                FastStringBuffer sb = new FastStringBuffer();
                if (pkg == PACKAGE_KEYWORD) {
                    sb.append(':');
                } else if (pkg instanceof Package) {
                    sb.append(multipleEscape(((Package)pkg).getName()));
                    sb.append("::");
                } else {
                    sb.append("#:");
                }
                sb.append(multipleEscape(n));
                return sb.toString();
            } else
                printEscape = true;
        }
        if (!printEscape) {
            if (pkg == PACKAGE_KEYWORD) {
                if (printCase == Keyword.DOWNCASE)
                    return n.toLowerCase();
                if (printCase == Keyword.CAPITALIZE)
                    return capitalize(n, readtableCase);
                return n;
            }
            // Printer escaping is disabled.
            if (readtableCase == Keyword.UPCASE) {
                if (printCase == Keyword.DOWNCASE)
                    return n.toLowerCase();
                if (printCase == Keyword.CAPITALIZE)
                    return capitalize(n, readtableCase);
                return n;
            } else if (readtableCase == Keyword.DOWNCASE) {
                // "When the readtable case is :DOWNCASE, uppercase characters
                // are printed in their own case, and lowercase characters are
                // printed in the case specified by *PRINT-CASE*." (22.1.3.3.2)
                if (printCase == Keyword.DOWNCASE)
                    return n;
                if (printCase == Keyword.UPCASE)
                    return n.toUpperCase();
                if (printCase == Keyword.CAPITALIZE)
                    return capitalize(n, readtableCase);
                return n;
            } else if (readtableCase == Keyword.PRESERVE) {
                return n;
            } else // INVERT
                return invert(n);
        }
        // Printer escaping is enabled.
        final boolean escapeSymbolName = needsEscape(n, readtableCase, thread);
        String symbolName = escapeSymbolName ? multipleEscape(n) : n;
        if (!escapeSymbolName) {
            if (readtableCase == Keyword.PRESERVE)
                ;
            else if (readtableCase == Keyword.INVERT)
                symbolName = invert(symbolName);
            else if (printCase == Keyword.DOWNCASE)
                symbolName = symbolName.toLowerCase();
            else if (printCase == Keyword.UPCASE)
                symbolName = symbolName.toUpperCase();
            else if (printCase == Keyword.CAPITALIZE)
                symbolName = capitalize(symbolName, readtableCase);
        }
        if (pkg == NIL) {
            if (printReadably || _PRINT_GENSYM_.symbolValue(thread) != NIL)
                return "#:".concat(symbolName);
            else
                return symbolName;
        }
        if (pkg == PACKAGE_KEYWORD)
            return ":".concat(symbolName);
        // "Package prefixes are printed if necessary." (22.1.3.3.1)
        final Package currentPackage = (Package) _PACKAGE_.symbolValue(thread);
        if (pkg == currentPackage)
            return symbolName;
        if (currentPackage != null && currentPackage.uses(pkg)) {
            // Check for name conflict in current package.
            if (currentPackage.findExternalSymbol(name) == null)
                if (currentPackage.findInternalSymbol(name) == null)
                    if (((Package)pkg).findExternalSymbol(name) != null)
                        return symbolName;
        }
        // Has this symbol been imported into the current package?
        if (currentPackage.findExternalSymbol(name) == this)
            return symbolName;
        if (currentPackage.findInternalSymbol(name) == this)
            return symbolName;
        // Package prefix is necessary.
        String packageName = ((Package)pkg).getName();
        final boolean escapePackageName = needsEscape(packageName, readtableCase, thread);
        if (escapePackageName) {
            packageName = multipleEscape(packageName);
        } else {
            if (readtableCase == Keyword.UPCASE) {
                if (printCase == Keyword.DOWNCASE)
                    packageName = packageName.toLowerCase();
                else if (printCase == Keyword.CAPITALIZE)
                    packageName = capitalize(packageName, readtableCase);
            } else if (readtableCase == Keyword.DOWNCASE) {
                if (printCase == Keyword.UPCASE)
                    packageName = packageName.toUpperCase();
                else if (printCase == Keyword.CAPITALIZE)
                    packageName = capitalize(packageName, readtableCase);
            } else if (readtableCase == Keyword.INVERT) {
                packageName = invert(packageName);
            }
        }
        FastStringBuffer sb = new FastStringBuffer(packageName);
        if (((Package)pkg).findExternalSymbol(name) != null)
            sb.append(':');
        else
            sb.append("::");
        sb.append(symbolName);
        return sb.toString();
    }

    private static final String invert(String s)
    {
        // "When the readtable case is :INVERT, the case of all alphabetic
        // characters in single case symbol names is inverted. Mixed-case
        // symbol names are printed as is." (22.1.3.3.2)
        final int limit = s.length();
        final int LOWER = 1;
        final int UPPER = 2;
        int state = 0;
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                if (state == LOWER)
                    return s; // Mixed case.
                state = UPPER;
            }
            if (Character.isLowerCase(c)) {
                if (state == UPPER)
                    return s; // Mixed case.
                state = LOWER;
            }
        }
        FastStringBuffer sb = new FastStringBuffer(limit);
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(c);
        }
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
            if ("(),|\\`'\";:".indexOf(c) >= 0)
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
        FastStringBuffer sb = new FastStringBuffer("|");
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
        FastStringBuffer sb = new FastStringBuffer(limit);
        boolean lastCharWasAlphanumeric = false;
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                if (readtableCase == Keyword.UPCASE)
                    sb.append(c);
                else // DOWNCASE
                    sb.append(lastCharWasAlphanumeric ? c : LispCharacter.toUpperCase(c));
                lastCharWasAlphanumeric = true;
            } else if (Character.isUpperCase(c)) {
                if (readtableCase == Keyword.UPCASE)
                    sb.append(lastCharWasAlphanumeric ? LispCharacter.toLowerCase(c) : c);
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

    public final int sxhash()
    {
        int h = hash;
        if (h < 0) {
            h = name.sxhash();
            hash = h;
        }
        return h;
    }

    public final boolean equals(Object obj)
    {
        return this == obj;
    }

    public LispObject execute() throws ConditionThrowable
    {
        try {
            return function.execute();
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        try {
            return function.execute(arg);
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        try {
            return function.execute(first, second);
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        try {
            return function.execute(first, second, third);
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        try {
            return function.execute(first, second, third, fourth);
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth)
        throws ConditionThrowable
    {
        try {
            return function.execute(first, second, third, fourth, fifth);
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth)
        throws ConditionThrowable
    {
        try {
            return function.execute(first, second, third, fourth, fifth, sixth);
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth,
                              LispObject seventh)
        throws ConditionThrowable
    {
        try {
            return function.execute(first, second, third, fourth, fifth, sixth,
                                    seventh);
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth,
                              LispObject seventh, LispObject eighth)
        throws ConditionThrowable
    {
        try {
            return function.execute(first, second, third, fourth, fifth, sixth,
                                    seventh, eighth);
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        try {
            return function.execute(args);
        }
        catch (NullPointerException e) {
            return signalNPE(e);
        }
    }

    private final LispObject signalNPE(NullPointerException e)
        throws ConditionThrowable
    {
        if (function == null)
            return signal(new UndefinedFunction(this));
        Debug.trace(e);
        return signal(new LispError("Null pointer exception"));
    }

    public void incrementCallCount()
    {
        if (function != null)
            function.incrementCallCount();
    }
}
