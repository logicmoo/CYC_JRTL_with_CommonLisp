/*
 * Primitives.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Primitives.java,v 1.343 2003-08-24 16:23:22 piso Exp $
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class Primitives extends Module
{
    // SpecialOperator
    private static final int DO                         = 1;
    private static final int DO_                        = 2;
    private static final int FLET                       = 3;
    private static final int LABELS                     = 4;
    private static final int PROGN                      = 5;

    // Primitive
    private static final int DIVIDE                     = 6;
    private static final int EXIT                       = 7;
    private static final int LAST                       = 8;
    private static final int MAX                        = 9;
    private static final int MIN                        = 10;
    private static final int MULTIPLY                   = 11;
    private static final int VALUES                     = 12;

    // Primitive1
    private static final int ABS                        = 13;
    private static final int ARRAYP                     = 14;
    private static final int ARRAY_HAS_FILL_POINTER_P   = 15;
    private static final int BIT_VECTOR_P               = 16;
    private static final int BOTH_CASE_P                = 17;
    private static final int CHARACTERP                 = 18;
    private static final int CHAR_CODE                  = 19;
    private static final int CHAR_DOWNCASE              = 20;
    private static final int CHAR_INT                   = 21;
    private static final int CHAR_UPCASE                = 22;
    private static final int CODE_CHAR                  = 23;
    private static final int COMPILED_FUNCTION_P        = 24;
    private static final int CONSP                      = 25;
    private static final int EVAL                       = 26;
    private static final int EVENP                      = 27;
    private static final int FBOUNDP                    = 28;
    private static final int FMAKUNBOUND                = 29;
    private static final int FOURTH                     = 30;
    private static final int FUNCTIONP                  = 31;
    private static final int IDENTITY                   = 32;
    private static final int KEYWORDP                   = 33;
    private static final int LENGTH                     = 34;
    private static final int LISTP                      = 35;
    private static final int LOWER_CASE_P               = 36;
    private static final int MAKE_SYMBOL                = 37;
    private static final int MAKUNBOUND                 = 38;
    private static final int NUMBERP                    = 39;
    private static final int ODDP                       = 40;
    private static final int PREDECESSOR                = 41;
    private static final int SECOND                     = 42;
    private static final int SIMPLE_BIT_VECTOR_P        = 43;
    private static final int SIMPLE_STRING_P            = 44;
    private static final int SIMPLE_VECTOR_P            = 45;
    private static final int SPECIAL_OPERATOR_P         = 46;
    private static final int STRINGP                    = 47;
    private static final int SUCCESSOR                  = 48;
    private static final int SYMBOL_FUNCTION            = 49;
    private static final int SYMBOL_NAME                = 50;
    private static final int SYMBOL_PACKAGE             = 51;
    private static final int SYMBOL_PLIST               = 52;
    private static final int SYMBOL_VALUE               = 53;
    private static final int THIRD                      = 54;
    private static final int UPPER_CASE_P               = 55;
    private static final int VALUES_LIST                = 56;
    private static final int VECTORP                    = 57;

    // Primitive2
    private static final int MEMBER                     = 58;
    private static final int MOD                        = 59;
    private static final int RPLACA                     = 60;
    private static final int RPLACD                     = 61;
    private static final int SET                        = 62;
    private static final int _RPLACA                    = 63;
    private static final int _RPLACD                    = 64;

    private Primitives()
    {
        defineSpecialOperator("do", DO);
        defineSpecialOperator("do*", DO_);
        defineSpecialOperator("flet", FLET);
        defineSpecialOperator("labels", LABELS);
        defineSpecialOperator("progn", PROGN);

        definePrimitive("*", MULTIPLY);
        definePrimitive("/", DIVIDE);
        definePrimitive("exit", EXIT);
        definePrimitive("last", LAST);
        definePrimitive("max", MAX);
        definePrimitive("min", MIN);
        definePrimitive("values", VALUES);

        definePrimitive1("1+", SUCCESSOR);
        definePrimitive1("1-", PREDECESSOR);
        definePrimitive1("abs", ABS);
        definePrimitive1("array-has-fill-pointer-p", ARRAY_HAS_FILL_POINTER_P);
        definePrimitive1("arrayp", ARRAYP);
        definePrimitive1("bit-vector-p", BIT_VECTOR_P);
        definePrimitive1("both-case-p", BOTH_CASE_P);
        definePrimitive1("char-code", CHAR_CODE);
        definePrimitive1("char-downcase", CHAR_DOWNCASE);
        definePrimitive1("char-int", CHAR_INT);
        definePrimitive1("char-upcase", CHAR_UPCASE);
        definePrimitive1("characterp", CHARACTERP);
        definePrimitive1("code-char", CODE_CHAR);
        definePrimitive1("compiled-function-p", COMPILED_FUNCTION_P);
        definePrimitive1("consp", CONSP);
        definePrimitive1("eval", EVAL);
        definePrimitive1("evenp", EVENP);
        definePrimitive1("fboundp", FBOUNDP);
        definePrimitive1("fmakunbound", FMAKUNBOUND);
        definePrimitive1("fourth", FOURTH);
        definePrimitive1("functionp", FUNCTIONP);
        definePrimitive1("identity", IDENTITY);
        definePrimitive1("keywordp", KEYWORDP);
        definePrimitive1("length", LENGTH);
        definePrimitive1("listp", LISTP);
        definePrimitive1("lower-case-p", LOWER_CASE_P);
        definePrimitive1("make-symbol", MAKE_SYMBOL);
        definePrimitive1("makunbound", MAKUNBOUND);
        definePrimitive1("numberp", NUMBERP);
        definePrimitive1("oddp", ODDP);
        definePrimitive1("second", SECOND);
        definePrimitive1("simple-bit-vector-p", SIMPLE_BIT_VECTOR_P);
        definePrimitive1("simple-string-p", SIMPLE_STRING_P);
        definePrimitive1("simple-vector-p", SIMPLE_VECTOR_P);
        definePrimitive1("special-operator-p", SPECIAL_OPERATOR_P);
        definePrimitive1("stringp", STRINGP);
        definePrimitive1("symbol-function", SYMBOL_FUNCTION);
        definePrimitive1("symbol-name", SYMBOL_NAME);
        definePrimitive1("symbol-package", SYMBOL_PACKAGE);
        definePrimitive1("symbol-plist", SYMBOL_PLIST);
        definePrimitive1("symbol-value", SYMBOL_VALUE);
        definePrimitive1("third", THIRD);
        definePrimitive1("upper-case-p", UPPER_CASE_P);
        definePrimitive1("values-list", VALUES_LIST);
        definePrimitive1("vectorp", VECTORP);

        definePrimitive2("member", MEMBER);
        definePrimitive2("mod", MOD);
        definePrimitive2("rplaca", RPLACA);
        definePrimitive2("rplacd", RPLACD);
        definePrimitive2("set", SET);
        definePrimitive2("%rplaca", _RPLACA);
        definePrimitive2("%rplacd", _RPLACD);
    }

    // SpecialOperator
    public LispObject dispatch(LispObject args, Environment env, int index)
        throws Condition
    {
        switch (index) {
            case DO:
                return _do(args, env, false);
            case DO_:
                return _do(args, env, true);
            case FLET:                          // ### flet
                return _flet(args, env, false);
            case LABELS:                        // ### labels
                return _flet(args, env, true);
            case PROGN:                         // ### progn
                return progn(args, env, LispThread.currentThread());
            default:
                Debug.trace("bad index " + index);
                Debug.assertTrue(false);
                return NIL;
        }
    }

    // Primitive
    public LispObject dispatch(LispObject[] args, int index)
        throws LispError
    {
        switch (index) {
            case MULTIPLY: {                    // ### *
                LispObject result = Fixnum.ONE;
                for (int i = 0; i < args.length; i++)
                    result = result.multiplyBy(args[i]);
                return result;
            }
            case DIVIDE: {                      // ### /
                if (args.length < 1)
                    throw new WrongNumberOfArgumentsException("/");
                if (args.length == 1)
                    return Fixnum.ONE.divideBy(args[0]);
                LispObject result = args[0];
                for (int i = 1; i < args.length; i++)
                    result = result.divideBy(args[i]);
                return result;
            }
            case MIN: {                         // ### min
                if (args.length < 1)
                    throw new WrongNumberOfArgumentsException("MIN");
                LispObject result = args[0];
                if ((result.getType() & TYPE_REAL) == 0)
                    throw new TypeError(result, "real");
                for (int i = 1; i < args.length; i++) {
                    if (args[i].isLessThan(result))
                        result = args[i];
                }
                return result;
            }
            case MAX: {                         // ### max
                if (args.length < 1)
                    throw new WrongNumberOfArgumentsException("MAX");
                LispObject result = args[0];
                if ((result.getType() & TYPE_REAL) == 0)
                    throw new TypeError(result, "real");
                for (int i = 1; i < args.length; i++) {
                    if (args[i].isGreaterThan(result))
                        result = args[i];
                }
                return result;
            }
            case LAST: {                        // ### last
                int n;
                switch (args.length) {
                    case 1:
                        n = 1;
                        break;
                    case 2:
                        n = Fixnum.getValue(args[1]);
                        break;
                    default:
                        throw new WrongNumberOfArgumentsException("LAST");
                }
                LispObject list = checkList(args[0]);
                if (list == NIL)
                    return NIL;
                LispObject result = list;
                while (list instanceof Cons) {
                    list = list.cdr();
                    if (n-- <= 0)
                        result = result.cdr();
                }
                return result;
            }
            case VALUES:                        // ### values
                return values(args);
            case EXIT:                          // ### exit
                exit();
                return T;
            default:
                Debug.trace("bad index " + index);
                throw new WrongNumberOfArgumentsException((String)null);
        }
    }

    // Primitive1
    public LispObject dispatch(LispObject arg, int index)
        throws Condition
    {
        switch (index) {
            case IDENTITY:                      // ### identity
                return arg;
            case SECOND:                        // ### second
                return arg.cadr();
            case THIRD:                         // ### third
                return arg.cdr().cdr().car();
            case FOURTH:                        // ### fourth
                return arg.cdr().cdr().cdr().car();
            case FUNCTIONP:                     // ### functionp
                return arg instanceof Function ? T : NIL;
            case COMPILED_FUNCTION_P:           // ### compiled-function-p
                return arg.typep(Symbol.COMPILED_FUNCTION);
            case KEYWORDP:                      // ### keywordp
                if (arg instanceof Symbol) {
                    if (((Symbol)arg).getPackage() == PACKAGE_KEYWORD)
                        return T;
                }
                return NIL;
            case SPECIAL_OPERATOR_P:            // ### special-operator-p
                return arg.getSymbolFunction() instanceof SpecialOperator ? T : NIL;
            case EVENP:                         // ### evenp
                return (Fixnum.getValue(arg) % 2) == 0 ? T : NIL;
            case ODDP:                          // ### oddp
                return (Fixnum.getValue(arg) % 2) == 0 ? NIL : T;
            case NUMBERP:                       // ### numberp
                return (arg.getType() & TYPE_NUMBER) != 0 ? T : NIL;
            case LENGTH:                        // ### length
                return arg.LENGTH();
            case CONSP:                         // ### consp
                return arg instanceof Cons ? T : NIL;
            case LISTP:                         // ### listp
                return arg.LISTP();
            case MAKE_SYMBOL:                   // ### make-symbol
                return new Symbol(LispString.getValue(arg));
            case FBOUNDP:                       // ### fboundp
                return arg.getSymbolFunction() != null ? T : NIL;
            case MAKUNBOUND:                    // ### makunbound
                checkSymbol(arg).setSymbolValue(null);
                return arg;
            case FMAKUNBOUND:                   // ### fmakunbound
                checkSymbol(arg).setSymbolFunction(null);
                return arg;
            case SYMBOL_NAME:                   // ### symbol-name
                if (arg.typep(Symbol.SYMBOL) != NIL)
                    return new LispString(arg.getName());
                throw new TypeError(arg, "symbol");
            case SYMBOL_PACKAGE:                // ### symbol-package
                return checkSymbol(arg).getPackage();
            case SYMBOL_VALUE:                  // ### symbol-value
                if (arg == T)
                    return T;
                if (arg == NIL)
                    return NIL;
                return checkSymbol(arg).symbolValue();
            case SYMBOL_FUNCTION: {             // ### symbol-function
                LispObject function = arg.getSymbolFunction();
                if (function != null)
                    return function;
                throw new UndefinedFunctionError(arg);
            }
            case SYMBOL_PLIST:                  // ### symbol-plist
                try {
                    return ((Symbol)arg).getPropertyList();
                }
                catch (ClassCastException e) {
                    throw new TypeError(arg, "symbol");
                }
            case ABS:                           // ### abs
                return arg.ABS();
            case ARRAYP:                        // ### arrayp
                return arg.typep(Symbol.ARRAY);
            case ARRAY_HAS_FILL_POINTER_P:      // ### array-has-fill-pointer-p
                return checkVector(arg).getFillPointer() >= 0 ? T : NIL;
            case VECTORP:                       // ### vectorp
                return (arg.getType() & TYPE_VECTOR) != 0 ? T : NIL;
            case SIMPLE_VECTOR_P:               // ### simple-vector-p
                return arg.typep(Symbol.SIMPLE_VECTOR);
            case BIT_VECTOR_P:                  // ### bit-vector-p
                return (arg.getType() & TYPE_BIT_VECTOR) != 0 ? T : NIL;
            case SIMPLE_BIT_VECTOR_P:           // ### simple-bit-vector-p
                return arg.typep(Symbol.SIMPLE_BIT_VECTOR);
            case CHAR_CODE:                     // ### char-code
            case CHAR_INT:                      // ### char-int
                return new Fixnum(LispCharacter.getValue(arg));
            case CODE_CHAR:                     // ### code-char
                if (arg instanceof Fixnum) {
                    int n = Fixnum.getValue(arg);
                    if (n < 128)
                        return LispCharacter.getInstance((char)n);
                }
                return NIL;
            case CHARACTERP:                    // ### characterp
                return arg instanceof LispCharacter ? T : NIL;
            case BOTH_CASE_P: {                 // ### both-case-p
                char c = LispCharacter.getValue(arg);
                if (Character.isLowerCase(c) || Character.isUpperCase(c))
                    return T;
                return NIL;
            }
            case LOWER_CASE_P:                  // ### lower-case-p
                return Character.isLowerCase(LispCharacter.getValue(arg)) ? T : NIL;
            case UPPER_CASE_P:                  // ### upper-case-p
                return Character.isUpperCase(LispCharacter.getValue(arg)) ? T : NIL;
            case CHAR_DOWNCASE:                 // ### char-downcase
                return LispCharacter.getInstance(Character.toLowerCase(
                    LispCharacter.getValue(arg)));
            case CHAR_UPCASE:                   // ### char-upcase
                return LispCharacter.getInstance(Character.toUpperCase(
                    LispCharacter.getValue(arg)));
            case STRINGP:                       // ### stringp
                return (arg.getType() & TYPE_STRING) != 0 ? T : NIL;
            case SIMPLE_STRING_P:               // ### simple-string-p
                return arg.typep(Symbol.SIMPLE_STRING);
            case SUCCESSOR:                     // ### 1+
                return arg.add(Fixnum.ONE);
            case PREDECESSOR:                   // ### 1-
                return arg.subtract(Fixnum.ONE);
            case VALUES_LIST:                   // ### values-list
                return values(arg.copyToArray());
            case EVAL:                          // ### eval
                return eval(arg, new Environment(), LispThread.currentThread());
            default:
                Debug.trace("bad index " + index);
                throw new WrongNumberOfArgumentsException((String)null);
        }
    }

    // Primitive2
    public LispObject dispatch(LispObject first, LispObject second, int index)
        throws LispError
    {
        switch (index) {
            case MEMBER: {                      // ### member
                // member item list &key key test test-not => tail
                // FIXME Support keyword arguments!
                LispObject rest = checkList(second);
                while (rest != NIL) {
                    if (first.eql(rest.car()))
                        return rest;
                    rest = rest.cdr();
                }
                return NIL;
            }
            case MOD:                           // ### mod
                return new Fixnum(Fixnum.getValue(first) %
                    Fixnum.getValue(second));
            case RPLACA:                        // ### rplaca
                first.setCar(second);
                return first;
            case RPLACD:                        // ### rplacd
                first.setCdr(second);
                return first;
            case _RPLACA:                       // ### %rplaca
                first.setCar(second);
                return second;
            case _RPLACD:                       // ### %rplacd
                first.setCdr(second);
                return second;
            case SET:                           // ### set
                checkSymbol(first).setSymbolValue(second);
                return second;
            default:
                Debug.trace("bad index " + index);
                throw new WrongNumberOfArgumentsException((String)null);
        }
    }

    private static final LispObject values(LispObject[] args)
    {
        if (args.length == 1) {
            LispThread.currentThread().clearValues();
            return args[0];
        }
        LispThread.currentThread().setValues(args);
        return args.length > 0 ? args[0] : NIL;
    }

    // ### eq
    private static final Primitive2 EQ = new Primitive2("eq") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first == second ? T : NIL;
        }
    };

    // ### eql
    private static final Primitive2 EQL = new Primitive2("eql") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.eql(second) ? T : NIL;
        }
    };

    // ### equal
    private static final Primitive2 EQUAL = new Primitive2("equal") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.equal(second) ? T : NIL;
        }
    };

    // ### equalp
    private static final Primitive2 EQUALP = new Primitive2("equalp") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.equalp(second) ? T : NIL;
        }
    };

    // ### cons
    private static final Primitive2 CONS = new Primitive2("cons") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return new Cons(first, second);
        }
    };

    // ### elt
    private static final Primitive2 ELT = new Primitive2("elt") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.elt(Fixnum.getValue(second));
        }
    };

    // ### quote
    private static final SpecialOperator QUOTE = new SpecialOperator("quote") {
        public LispObject execute(LispObject args, Environment env)
            throws LispError
        {
            return args.car();
        }
    };

    // ### atom
    private static final Primitive1 ATOM = new Primitive1("atom") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg instanceof Cons ? NIL : T;
        }
    };

    // ### constantp
    private static final Primitive CONSTANTP = new Primitive("constantp") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg.CONSTANTP();
        }
        public LispObject execute(LispObject first, LispObject second) throws LispError
        {
            return first.CONSTANTP();
        }
    };

    // ### symbolp
    private static final Primitive1 SYMBOLP = new Primitive1("symbolp") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg.SYMBOLP();
        }
    };

    // ### endp
    private static final Primitive1 ENDP = new Primitive1("endp") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg.ENDP();
        }
    };

    // ### null
    private static final Primitive1 NULL = new Primitive1("null") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg == NIL ? T : NIL;
        }
    };

    // ### not
    private static final Primitive1 NOT = new Primitive1("not") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg == NIL ? T : NIL;
        }
    };

    // ### zerop
    private static final Primitive1 ZEROP = new Primitive1("zerop") {
        public LispObject execute(LispObject arg) throws TypeError
        {
            return arg.ZEROP();
        }
    };

    // ### fixnump
    private static final Primitive1 FIXNUMP =
        new Primitive1("fixnump", PACKAGE_SYS, true) {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg instanceof Fixnum ? T : NIL;
        }
    };

    // ### +
    private static final Primitive ADD = new Primitive("+") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.add(second);
        }
        public LispObject execute(LispObject[] args) throws LispError
        {
            LispObject result = Fixnum.ZERO;
            final int length = args.length;
            for (int i = 0; i < length; i++)
                result = result.add(args[i]);
            return result;
        }
    };

    // ### -
    private static final Primitive SUBTRACT = new Primitive("-") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.subtract(second);
        }
        public LispObject execute(LispObject[] args) throws LispError
        {
            switch (args.length) {
                case 0:
                    throw new WrongNumberOfArgumentsException("-");
                case 1:
                    return Fixnum.ZERO.subtract(args[0]);
                case 2:
                    Debug.assertTrue(false);
                    return args[0].subtract(args[1]);
                default: {
                    LispObject result = args[0];
                    for (int i = 1; i < args.length; i++)
                        result = result.subtract(args[i]);
                    return result;
                }
            }
        }
    };

    // ### if
    private static final SpecialOperator IF = new SpecialOperator("if") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final LispThread thread = LispThread.currentThread();
            switch (args.length()) {
                case 2: {
                    if (eval(args.car(), env, thread) != NIL)
                        return eval(args.cadr(), env, thread);
                    return NIL;
                }
                case 3: {
                    if (eval(args.car(), env, thread) != NIL)
                        return eval(args.cadr(), env, thread);
                    return eval(args.cdr().cadr(), env, thread);
                }
                default:
                    throw new WrongNumberOfArgumentsException("IF");
            }
        }
    };

    // ### when
    private static final SpecialOperator WHEN = new SpecialOperator("when") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args == NIL)
                throw new WrongNumberOfArgumentsException(this);
            final LispThread thread = LispThread.currentThread();
            LispObject result = NIL;
            if (eval(args.car(), env, thread) != NIL) {
                args = args.cdr();
                while (args != NIL) {
                    result = eval(args.car(), env, thread);
                    args = args.cdr();
                }
            }
            return result;
        }
    };

    // ### unless
    private static final SpecialOperator UNLESS =
        new SpecialOperator("unless") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args == NIL)
                throw new WrongNumberOfArgumentsException(this);
            final LispThread thread = LispThread.currentThread();
            LispObject result = NIL;
            if (eval(args.car(), env, thread) == NIL) {
                args = args.cdr();
                while (args != NIL) {
                    result = eval(args.car(), env, thread);
                    args = args.cdr();
                }
            }
            return result;
        }
    };

    // ### princ
    private static final Primitive PRINC = new Primitive("princ") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 1 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            CharacterOutputStream out = null;
            if (args.length == 2) {
                if (args[1] instanceof CharacterOutputStream)
                    out = (CharacterOutputStream) args[1];
                else
                    throw new TypeError(args[0], "output stream");
            }
            if (out == null)
                out = getStandardOutput();
            if (out != null)
                out.princ(args[0]);
            return args[0];
        }
    };

    // ### princ-to-string
    private static final Primitive1 PRINC_TO_STRING =
        new Primitive1("princ-to-string") {
        public LispObject execute(LispObject arg) throws LispError
        {
            LispThread thread = LispThread.currentThread();
            Environment oldDynEnv = thread.getDynamicEnvironment();
            thread.bindSpecial(_PRINT_ESCAPE_, NIL);
            LispString string = new LispString(String.valueOf(arg));
            thread.setDynamicEnvironment(oldDynEnv);
            return string;
        }
    };

    // ### prin1
    // prin1 object &optional output-stream => object
    private static final Primitive PRIN1 = new Primitive("prin1") {
        public LispObject execute(LispObject arg) throws LispError
        {
            CharacterOutputStream out = getStandardOutput();
            if (out != null)
                out.prin1(arg);
            return arg;
        }
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            CharacterOutputStream out;
            if (second instanceof CharacterOutputStream)
                out = (CharacterOutputStream) second;
            else if (second == T)
                out = getTerminalIO().getOutputStream();
            else if (second == NIL)
                out = getStandardOutput();
            else
                throw new TypeError(second, "output stream");
            out.prin1(first);
            return first;
        }
    };

    // ### prin1-to-string
    private static final Primitive1 PRIN1_TO_STRING =
        new Primitive1("prin1-to-string") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return new LispString(String.valueOf(arg));
        }
    };

    // ### print
    // PRINT is just like PRIN1 except that the printed representation of
    // object is preceded by a newline and followed by a space.
    private static final Primitive1 PRINT = new Primitive1("print") {
        public LispObject execute(LispObject arg) throws LispError
        {
            CharacterOutputStream out = getStandardOutput();
            if (out != null) {
                out.terpri();
                out.prin1(arg);
                out.writeString(" ");
            }
            return arg;
        }
    };

    // ### terpri
    private static final Primitive TERPRI = new Primitive("terpri") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length > 1)
                throw new WrongNumberOfArgumentsException(this);
            CharacterOutputStream out = null;
            if (args.length == 1) {
                if (args[0] instanceof CharacterOutputStream)
                    out = (CharacterOutputStream) args[0];
                else
                    throw new TypeError(args[0], "output stream");
            }
            if (out == null)
                out = getStandardOutput();
            return out.terpri();
        }
    };

    // ### fresh-line
    private static final Primitive FRESH_LINE = new Primitive("fresh-line") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length > 1)
                throw new WrongNumberOfArgumentsException(this);
            CharacterOutputStream out;
            if (args.length == 1)
                out = checkOutputStream(args[0]);
            else
                out = getStandardOutput();
            return out.freshLine();
        }
    };

    // ### boundp
    private static final Primitive1 BOUNDP = new Primitive1("boundp") {
        public LispObject execute(LispObject obj) throws LispError
        {
            if (obj == NIL)
                return T;
            Symbol symbol = checkSymbol(obj);
            if (LispThread.currentThread().lookupSpecial(symbol) != null)
                return T;
            return symbol.getSymbolValue() != null ? T : NIL;
        }
    };

    // ### append
    private static final Primitive APPEND = new Primitive("append") {
        public LispObject execute()
        {
            return NIL;
        }
        public LispObject execute(LispObject arg)
        {
            return arg;
        }
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            if (first == NIL)
                return second;
            // APPEND is required to copy its first argument.
            Cons result = new Cons(first.car());
            Cons splice = result;
            first = first.cdr();
            while (first != NIL) {
                Cons temp = new Cons(first.car());
                splice.setCdr(temp);
                splice = temp;
                first = first.cdr();
            }
            splice.setCdr(second);
            return result;
        }
        public LispObject execute(LispObject[] args) throws LispError
        {
            Cons result = null;
            Cons splice = null;
            final int limit = args.length - 1;
            int i;
            for (i = 0; i < limit; i++) {
                LispObject top = args[i];
                if (top == NIL)
                    continue;
                result = new Cons(top.car());
                splice = result;
                top = top.cdr();
                while (top != NIL) {
                    Cons temp = new Cons(top.car());
                    splice.setCdr(temp);
                    splice = temp;
                    top = top.cdr();
                }
                break;
            }
            if (result == null)
                return args[i];
            for (++i; i < limit; i++) {
                LispObject top = args[i];
                while (top != NIL) {
                    Cons temp = new Cons(top.car());
                    splice.setCdr(temp);
                    splice = temp;
                    top = top.cdr();
                }
            }
            splice.setCdr(args[i]);
            return result;
        }
    };

    // ### nconc
    private static final Primitive NCONC = new Primitive("nconc") {
        public LispObject execute(LispObject[] array) throws LispError
        {
            switch (array.length) {
                case 0:
                    return NIL;
                case 1:
                    return array[0];
                default: {
                    LispObject result = null;
                    LispObject splice = null;
                    final int limit = array.length - 1;
                    int i;
                    for (i = 0; i < limit; i++) {
                        LispObject list = array[i];
                        if (list == NIL)
                            continue;
                        if (list instanceof Cons) {
                            if (splice != null) {
                                splice.setCdr(list);
                                splice = list;
                            }
                            while (list instanceof Cons) {
                                if (result == null) {
                                    result = list;
                                    splice = result;
                                } else {
                                    splice = list;
                                }
                                list = list.cdr();
                            }
                        } else
                            throw new TypeError(list, "list");
                    }
                    if (result == null)
                        return array[i];
                    splice.setCdr(array[i]);
                    return result;
                }
            }
        }
    };

    // ### =
    // Numeric equality.
    private static final Primitive EQUALS = new Primitive("=") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.isEqualTo(second) ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws LispError
        {
            final int length = array.length;
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            final LispObject obj = array[0];
            for (int i = 1; i < length; i++) {
                if (array[i].isNotEqualTo(obj))
                    return NIL;
            }
            return T;
        }
    };

    // Returns true if no two numbers are the same; otherwise returns false.
    private static final Primitive NOT_EQUALS = new Primitive("/=") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.isNotEqualTo(second) ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws LispError
        {
            final int length = array.length;
            if (length == 2)
                return array[0].isNotEqualTo(array[1]) ? T : NIL;
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            for (int i = 0; i < length; i++) {
                final LispObject obj = array[i];
                for (int j = i+1; j < length; j++) {
                    if (array[j].isEqualTo(obj))
                        return NIL;
                }
            }
            return T;
        }
    };

    // ### <
    // Numeric comparison.
    private static final Primitive LESS_THAN = new Primitive("<") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.isLessThan(second) ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws LispError
        {
            final int length = array.length;
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            for (int i = 1; i < length; i++) {
                if (array[i].isLessThanOrEqualTo(array[i-1]))
                    return NIL;
            }
            return T;
        }
    };

    // ### <=
    private static final Primitive LE = new Primitive("<=") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.isLessThanOrEqualTo(second) ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws LispError
        {
            switch (array.length) {
                case 0:
                    throw new WrongNumberOfArgumentsException(this);
                case 1:
                    return T;
                case 2:
                    Debug.assertTrue(false);
                    return array[0].isLessThanOrEqualTo(array[1]) ? T : NIL;
                default: {
                    final int length = array.length;
                    for (int i = 1; i < length; i++) {
                        if (array[i].isLessThan(array[i-1]))
                            return NIL;
                    }
                    return T;
                }
            }
        }
    };

    // ### >
    private static final Primitive GREATER_THAN = new Primitive(">") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.isGreaterThan(second) ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws LispError
        {
            final int length = array.length;
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            for (int i = 1; i < length; i++) {
                if (array[i].isGreaterThanOrEqualTo(array[i-1]))
                    return NIL;
            }
            return T;
        }
    };

    // ### >=
    private static final Primitive GE = new Primitive(">=") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.isGreaterThanOrEqualTo(second) ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws LispError
        {
            final int length = array.length;
            switch (length) {
                case 0:
                    throw new WrongNumberOfArgumentsException(this);
                case 1:
                    return T;
                case 2:
                    Debug.assertTrue(false);
                    return array[0].isGreaterThanOrEqualTo(array[1]) ? T : NIL;
                default:
                    for (int i = 1; i < length; i++) {
                        if (array[i].isGreaterThan(array[i-1]))
                            return NIL;
                    }
                    return T;
            }
        }
    };

    // ### assoc
    // assoc item alist &key key test test-not => entry
    // This is the bootstrap version (needed for %set-documentation).
    // Redefined properly in list.lisp.
    private static final Primitive ASSOC = new Primitive("assoc") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject item = args[0];
            LispObject alist = args[1];
            while (alist != NIL) {
                LispObject cons = alist.car();
                if (cons instanceof Cons) {
                    if (cons.car().eql(item))
                        return cons;
                } else if (cons != NIL)
                    throw new TypeError(cons, "list");
                alist = alist.cdr();
            }
            return NIL;
        }
    };

    // ### nth
    // nth n list => object
    private static final Primitive2 NTH = new Primitive2("nth") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            int index = Fixnum.getValue(first);
            if (index < 0)
                throw new LispError("bad index to NTH: " + index);
            int i = 0;
            while (true) {
                if (i == index)
                    return second.car();
                second = second.cdr();
                if (second == NIL)
                    return NIL;
                ++i;
            }
        }
    };

    // ### %setnth
    // %setnth n list new-object => new-object
    private static final Primitive3 _SETNTH =
        new Primitive3("%setnth", PACKAGE_SYS, true) {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispError
        {
            int index = Fixnum.getValue(first);
            if (index < 0)
                throw new LispError("bad index to NTH: " + index);
            int i = 0;
            while (true) {
                if (i == index) {
                    second.setCar(third);
                    return third;
                }
                second = second.cdr();
                if (second == NIL)
                    throw new LispError(String.valueOf(index) +
                        "is too large an index for SETF of NTH");
                ++i;
            }
        }
    };

    // ### nthcdr
    private static final Primitive2 NTHCDR = new Primitive2("nthcdr") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            final int index = Fixnum.getValue(first);
            if (index < 0)
                throw new TypeError("bad index to NTHCDR: " + index);
            for (int i = 0; i < index; i++) {
                second = second.cdr();
                if (second == NIL)
                    return NIL;
            }
            return second;
        }
    };

    // ### error
    private static final Primitive ERROR = new Primitive("error") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 1)
                throw new WrongNumberOfArgumentsException(this);
            LispObject datum = args[0];
            if (datum instanceof Symbol) {
                if (datum == Symbol.TYPE_ERROR)
                    throw new TypeError(_format(args, 1));
                if (datum == Symbol.PROGRAM_ERROR)
                    throw new ProgramError(_format(args, 1));
                // Default.
                throw new SimpleError(((Symbol)datum).getName());
            }
            throw new SimpleError(_format(args));
        }
    };

    // ### signal
    private static final Primitive SIGNAL = new Primitive("signal") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            if (args.length < 1)
                throw new WrongNumberOfArgumentsException(this);
            throw new SimpleCondition();
        }
    };

    // ### format
    private static final Primitive FORMAT = new Primitive("format") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject destination = args[0];
            // Copy remaining arguments.
            LispObject[] _args = new LispObject[args.length-1];
            for (int i = 0; i < _args.length; i++)
                _args[i] = args[i+1];
            String s = _format(_args);
            if (destination == T) {
                getStandardOutput().writeString(s);
                return NIL;
            }
            if (destination == NIL)
                return new LispString(s);
            if (destination instanceof CharacterOutputStream) {
                ((CharacterOutputStream)destination).writeString(s);
                return NIL;
            }
            if (destination instanceof TwoWayStream) {
                ((TwoWayStream)destination).getOutputStream().writeString(s);
                return NIL;
            }
            // Destination can also be stream or string with fill pointer.
//             throw new LispError("FORMAT: not implemented");
            return NIL;
        }
    };

    private static final String _format(LispObject[] args, int skip)
        throws LispError
    {
        final int remaining = args.length - skip;
        if (remaining > 0) {
            LispObject[] array = new LispObject[remaining];
            for (int i = skip, j = 0; i < args.length; i++, j++)
                array[j] = args[i];
            return _format(array);
        } else
            return null;
    }

    private static final String _format(LispObject[] args) throws LispError
    {
        final LispThread thread = LispThread.currentThread();
        String control = checkString(args[0]).getValue();
        StringBuffer sb = new StringBuffer();
        final int limit = control.length();
        int j = 1;
        final int NEUTRAL = 0;
        final int TILDE = 1;
        int state = NEUTRAL;
        for (int i = 0; i < limit; i++) {
            char c = control.charAt(i);
            if (state == NEUTRAL) {
                if (c == '~')
                    state = TILDE;
                else
                    sb.append(c);
            } else if (state == TILDE) {
                if (c == 'A' || c == 'a') {
                    if (j < args.length) {
                        LispObject obj = args[j++];
                        Environment oldDynEnv = thread.getDynamicEnvironment();
                        thread.bindSpecial(_PRINT_ESCAPE_, NIL);
                        sb.append(String.valueOf(obj));
                        thread.setDynamicEnvironment(oldDynEnv);
                    }
                } else if (c == 'S' || c == 's') {
                    if (j < args.length) {
                        LispObject obj = args[j++];
                        Environment oldDynEnv = thread.getDynamicEnvironment();
                        thread.bindSpecial(_PRINT_ESCAPE_, T);
                        sb.append(String.valueOf(obj));
                        thread.setDynamicEnvironment(oldDynEnv);
                    }
                } else if (c == 'D' || c == 'd') {
                    if (j < args.length) {
                        LispObject obj = args[j++];
                        Environment oldDynEnv = thread.getDynamicEnvironment();
                        thread.bindSpecial(_PRINT_ESCAPE_, NIL);
                        thread.bindSpecial(_PRINT_RADIX_, NIL);
                        thread.bindSpecial(_PRINT_BASE_, new Fixnum(10));
                        sb.append(String.valueOf(obj));
                        thread.setDynamicEnvironment(oldDynEnv);
                    }
                } else if (c == 'X' || c == 'x') {
                    if (j < args.length) {
                        LispObject obj = args[j++];
                        Environment oldDynEnv = thread.getDynamicEnvironment();
                        thread.bindSpecial(_PRINT_ESCAPE_, NIL);
                        thread.bindSpecial(_PRINT_RADIX_, NIL);
                        thread.bindSpecial(_PRINT_BASE_, new Fixnum(16));
                        sb.append(String.valueOf(obj));
                        thread.setDynamicEnvironment(oldDynEnv);
                    }
                } else if (c == '%') {
                    sb.append(System.getProperty("line.separator"));
                }
//                 else
//                     throw new LispError("FORMAT: not implemented");
                state = NEUTRAL;
            } else {
                // There are no other valid states.
                Debug.assertTrue(false);
            }
        }
        return sb.toString();
    }

    // ### %defun
    // %defun name arglist body => name
    private static final Primitive3 _DEFUN =
        new Primitive3("%defun", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispError
        {
            Symbol symbol = checkSymbol(first);
            LispObject arglist = checkList(second);
            LispObject body = checkList(third);
            if (body.car() instanceof LispString && body.cdr() != NIL) {
                // Documentation.
                symbol.setFunctionDocumentation(body.car());
                body = body.cdr();
            }
            body = new Cons(symbol, body);
            body = new Cons(Symbol.BLOCK, body);
            body = new Cons(body, NIL);
            Closure closure = new Closure(symbol.getName(), arglist, body,
                                          new Environment());
            closure.setArglist(arglist);
            symbol.setSymbolFunction(closure);
            return symbol;
        }
    };

    // ### lambda
    private static final SpecialOperator LAMBDA =
        new SpecialOperator("lambda") {
        public LispObject execute(LispObject args, Environment env)
            throws LispError
        {
            return new Closure(args.car(), args.cdr(), env);
        }
    };

    // ### macro-function
    // Need to support optional second argument specifying environment.
    private static final Primitive MACRO_FUNCTION =
        new Primitive("macro-function") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 1)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args[0]);
            LispObject obj = symbol.getSymbolFunction();
            if (obj instanceof MacroObject)
                return ((MacroObject)obj).getExpander();
            if (obj instanceof SpecialOperator) {
                LispObject macroObject =
                    get(symbol, Symbol.MACROEXPAND_MACRO, NIL);
                if (macroObject instanceof MacroObject)
                    return ((MacroObject)macroObject).getExpander();
            }
            return NIL;
        }
    };

    // ### defmacro
    private static final SpecialOperator DEFMACRO =
        new SpecialOperator("defmacro") {
        public LispObject execute(LispObject args, Environment env)
            throws LispError
        {
            Symbol symbol = checkSymbol(args.car());
            LispObject lambdaList = checkList(args.cadr());
            LispObject body = args.cddr();
            LispObject block = new Cons(Symbol.BLOCK, new Cons(symbol, body));
            LispObject toBeApplied = list(Symbol.LAMBDA, lambdaList, block);
            LispObject formArg = gensym("FORM-");
            LispObject envArg = gensym("ENV-"); // Ignored.
            LispObject expander =
                list(Symbol.LAMBDA, list(formArg, envArg),
                    list(Symbol.APPLY, toBeApplied,
                        list(Symbol.CDR, formArg)));
            Closure expansionFunction =
                new Closure(expander.cadr(), expander.cddr(), env);
            MacroObject macroObject = new MacroObject(expansionFunction);
            if (symbol.getSymbolFunction() instanceof SpecialOperator)
                put(symbol, Symbol.MACROEXPAND_MACRO, macroObject);
            else
                symbol.setSymbolFunction(macroObject);
            LispThread.currentThread().clearValues();
            return symbol;
        }
    };

    // ### make-macro
    private static final Primitive1 MAKE_MACRO = new Primitive1("make-macro") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return new MacroObject(arg);
        }
    };

    // ### defparameter
    // defparameter name initial-value [documentation]
    private static final SpecialOperator DEFPARAMETER =
        new SpecialOperator("defparameter") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final int length = args.length();
            if (length < 2 || length > 3)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args.car());
            final LispThread thread = LispThread.currentThread();
            LispObject initialValue = eval(args.cadr(), env, thread);
            symbol.setSymbolValue(initialValue);
            symbol.setSpecial(true);
            thread.clearValues();
            return symbol;
        }
    };

    // ### defvar
    private static final SpecialOperator DEFVAR = new SpecialOperator("defvar") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final int length = args.length();
            if (length < 1 || length > 3)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args.car());
            final LispThread thread = LispThread.currentThread();
            LispObject rest = args.cdr();
            if (rest != NIL) {
                LispObject initialValue = eval(rest.car(), env, thread);
                if (symbol.getSymbolValue() == null)
                    symbol.setSymbolValue(initialValue);
            }
            symbol.setSpecial(true);
            thread.clearValues();
            return symbol;
        }
    };

    // ### defconstant
    // defconstant name initial-value [documentation] => name
    private static final SpecialOperator DEFCONSTANT =
        new SpecialOperator("defconstant") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args.length() > 3)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args.car());
            final LispThread thread = LispThread.currentThread();
            symbol.setSymbolValue(eval(args.cadr(), env, thread));
            symbol.setConstant(true);
            thread.clearValues();
            return symbol;
        }
    };

    // ### cond
    private static final SpecialOperator COND = new SpecialOperator("cond") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final LispThread thread = LispThread.currentThread();
            LispObject result = NIL;
            while (args != NIL) {
                LispObject clause = args.car();
                result = eval(clause.car(), env, thread);
                thread.clearValues();
                if (result != NIL) {
                    LispObject body = clause.cdr();
                    while (body != NIL) {
                        result = eval(body.car(), env, thread);
                        body = body.cdr();
                    }
                    return result;
                }
                args = args.cdr();
            }
            return result;
        }
    };

    // ### case
    private static final SpecialOperator CASE = new SpecialOperator("case") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final LispThread thread = LispThread.currentThread();
            LispObject key = eval(args.car(), env, thread);
            args = args.cdr();
            while (args != NIL) {
                LispObject clause = args.car();
                LispObject keys = clause.car();
                boolean match = false;
                if (keys.listp()) {
                    while (keys != NIL) {
                        LispObject candidate = keys.car();
                        if (key.eql(candidate)) {
                            match = true;
                            break;
                        }
                        keys = keys.cdr();
                    }
                } else {
                    LispObject candidate = keys;
                    if (candidate == T || candidate == Symbol.OTHERWISE)
                        match = true;
                    else if (key.eql(candidate))
                        match = true;
                }
                if (match) {
                    return progn(clause.cdr(), env, thread);
                }
                args = args.cdr();
            }
            return NIL;
        }
    };

    // ### ecase
    private static final SpecialOperator ECASE = new SpecialOperator("ecase") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final LispThread thread = LispThread.currentThread();
            LispObject key = eval(args.car(), env, thread);
            args = args.cdr();
            while (args != NIL) {
                LispObject clause = args.car();
                LispObject keys = clause.car();
                boolean match = false;
                if (keys instanceof Cons) {
                    while (keys != NIL) {
                        LispObject candidate = keys.car();
                        if (key.eql(candidate)) {
                            match = true;
                            break;
                        }
                        keys = keys.cdr();
                    }
                } else {
                    LispObject candidate = keys;
                    if (key.eql(candidate))
                        match = true;
                }
                if (match) {
                    return progn(clause.cdr(), env, thread);
                }
                args = args.cdr();
            }
            throw new TypeError("ECASE: no match for " + key);
        }
    };

    private static final LispObject _do(LispObject args, Environment env,
                                        boolean sequential)
        throws Condition
    {
        // Process variable specifications.
        LispObject first = args.car();
        args = args.cdr();
        int length = first.length();
        Symbol[] variables = new Symbol[length];
        LispObject[] initials = new LispObject[length];
        LispObject[] updates = new LispObject[length];
        for (int i = 0; i < length; i++) {
            LispObject obj = first.car();
            if (obj instanceof Cons) {
                variables[i] = checkSymbol(obj.car());
                initials[i] = obj.cadr();
                // Is there a step form?
                if (obj.cdr().cdr() != NIL)
                    updates[i] = obj.cdr().cdr().car();
            } else {
                // Not a cons, must be a symbol.
                variables[i] = checkSymbol(obj);
                initials[i] = NIL;
            }
            first = first.cdr();
        }
        final LispThread thread = LispThread.currentThread();
        Environment oldDynEnv = thread.getDynamicEnvironment();
        Environment ext = new Environment(env);
        for (int i = 0; i < length; i++) {
            Symbol symbol = variables[i];
            LispObject value =
                eval(initials[i], (sequential ? ext : env), thread);
            bind(symbol, value, ext);
        }
        LispObject second = args.car();
        LispObject test = second.car();
        LispObject resultForms = second.cdr();
        LispObject body = args.cdr();
        final int depth = thread.getStackDepth();
        try {
            // Implicit block.
            while (true) {
                // Execute body.
                // Test for termination.
                if (eval(test, ext, thread) != NIL)
                    break;
                progn(body, ext, thread);
                // Update variables.
                if (sequential) {
                    for (int i = 0; i < length; i++) {
                        LispObject update = updates[i];
                        if (update != null)
                            rebind(variables[i], eval(update, ext, thread), ext);
                    }
                } else {
                    // Evaluate step forms.
                    LispObject results[] = new LispObject[length];
                    for (int i = 0; i < length; i++) {
                        LispObject update = updates[i];
                        if (update != null) {
                            LispObject result = eval(update, ext, thread);
                            results[i] = result;
                        }
                    }
                    // Update variables.
                    for (int i = 0; i < length; i++) {
                        if (results[i] != null) {
                            Symbol symbol = variables[i];
                            rebind(symbol, results[i], ext);
                        }
                    }
                }
            }
            LispObject result = progn(resultForms, ext, thread);
            return result;
        }
        catch (Return ret) {
            if (ret.getTag() == NIL) {
                thread.setStackDepth(depth);
                return ret.getResult();
            }
            throw ret;
        }
        finally {
            thread.setDynamicEnvironment(oldDynEnv);
        }
    }

    // ### dolist
    private static final SpecialOperator DOLIST = new SpecialOperator("dolist") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            LispObject bodyForm = args.cdr();
            args = args.car();
            Symbol var = checkSymbol(args.car());
            LispObject listForm = args.cadr();
            final LispThread thread = LispThread.currentThread();
            LispObject list = checkList(eval(listForm, env, thread));
            LispObject resultForm = args.cdr().cdr().car();
            Environment oldDynEnv = thread.getDynamicEnvironment();
            while (list != NIL) {
                Environment ext = new Environment(env);
                bind(var, list.car(), ext);
                LispObject body = bodyForm;
                int depth = thread.getStackDepth();
                try {
                    while (body != NIL) {
                        LispObject result = eval(body.car(), ext, thread);
                        body = body.cdr();
                    }
                }
                catch (Return ret) {
                    if (ret.getTag() == NIL) {
                        thread.setStackDepth(depth);
                        return ret.getResult();
                    }
                    throw ret;
                }
                list = list.cdr();
            }
            Environment ext = new Environment(env);
            bind(var, NIL, ext);
            LispObject result = eval(resultForm, ext, thread);
            thread.setDynamicEnvironment(oldDynEnv);
            return result;
        }
    };

    // ### dotimes
    private static final SpecialOperator DOTIMES =
        new SpecialOperator("dotimes") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            LispObject bodyForm = args.cdr();
            args = args.car();
            Symbol var = checkSymbol(args.car());
            LispObject countForm = args.cadr();
            final LispThread thread = LispThread.currentThread();
            int count = Fixnum.getInt(eval(countForm, env, thread));
            LispObject resultForm = args.cdr().cdr().car();
            Environment oldDynEnv = thread.getDynamicEnvironment();
            int i;
            for (i = 0; i < count; i++) {
                Environment ext = new Environment(env);
                bind(var, new Fixnum(i), ext);
                LispObject body = bodyForm;
                int depth = thread.getStackDepth();
                try {
                    while (body != NIL) {
                        LispObject result = eval(body.car(), ext, thread);
                        body = body.cdr();
                    }
                }
                catch (Return ret) {
                    if (ret.getTag() == NIL) {
                        thread.setStackDepth(depth);
                        return ret.getResult();
                    }
                    throw ret;
                }
            }
            Environment ext = new Environment(env);
            bind(var, new Fixnum(i), ext);
            LispObject result = eval(resultForm, ext, thread);
            thread.setDynamicEnvironment(oldDynEnv);
            return result;
        }
    };

    // ### handler-bind
    private static final SpecialOperator HANDLER_BIND =
        new SpecialOperator("handler-bind") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            LispObject bindings = checkList(args.car());
            final LispThread thread = LispThread.currentThread();
            LispObject forms = args.cdr();
            try {
                return progn(args.cdr(), env, thread);
            }
            catch (Return ret) {
                throw ret;
            }
            catch (Condition c) {
                while (bindings != NIL) {
                    Cons binding = checkCons(bindings.car());
                    LispObject type = binding.car();
                    if (isConditionOfType(c, type)) {
                        LispObject obj = eval(binding.cadr(), env, thread);
                        LispObject handler;
                        if (obj instanceof Symbol) {
                            handler = obj.getSymbolFunction();
                            if (handler == null)
                                throw new UndefinedFunctionError(obj);
                        } else
                            handler = obj;
                        LispObject[] handlerArgs = new LispObject[1];
                        handlerArgs[0] = new JavaObject(c);
                         // Might not return.
                        funcall(handler, handlerArgs, thread);
                    }
                    bindings = bindings.cdr();
                }
                // Re-throw condition.
                throw c;
            }
        }
    };

    // ### handler-case
    private static final SpecialOperator HANDLER_CASE =
        new SpecialOperator("handler-case") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            LispObject form = args.car();
            LispObject clauses = args.cdr();
            final LispThread thread = LispThread.currentThread();
            final int depth = thread.getStackDepth();
            try {
                return eval(form, env, thread);
            }
            catch (Condition c) {
                thread.setStackDepth(depth);
                while (clauses != NIL) {
                    Cons clause = checkCons(clauses.car());
                    LispObject type = clause.car();
                    if (isConditionOfType(c, type)) {
                        LispObject parameterList = clause.cadr();
                        LispObject body = clause.cdr().cdr();
                        Closure handler = new Closure(parameterList, body, env);
                        int numArgs = parameterList.length();
                        if (numArgs == 1) {
                            LispObject[] handlerArgs = new LispObject[1];
                            handlerArgs[0] = new JavaObject(c);
                            return funcall(handler, handlerArgs, thread);
                        }
                        if (numArgs == 0) {
                            LispObject[] handlerArgs = new LispObject[0];
                            return funcall(handler, handlerArgs, thread);
                        }
                        throw new LispError("HANDLER-CASE: invalid handler clause");
                    }
                    clauses = clauses.cdr();
                }
                // Re-throw condition.
                throw c;
            }
        }
    };

    private static boolean isConditionOfType(Condition c, LispObject type)
    {
        if (type == Symbol.END_OF_FILE)
            return c instanceof EndOfFileException;
        if (type == Symbol.STREAM_ERROR)
            return c instanceof StreamError;
        if (type == Symbol.UNDEFINED_FUNCTION)
            return c instanceof UndefinedFunctionError;
        if (type == Symbol.TYPE_ERROR)
            return c instanceof TypeError;
        if (type == Symbol.PACKAGE_ERROR)
            return c instanceof PackageError;
        if (type == Symbol.PROGRAM_ERROR)
            return c instanceof ProgramError;
        if (type == Symbol.CONTROL_ERROR)
            return c instanceof ControlError;
        if (type == Symbol.SIMPLE_ERROR)
            return c instanceof SimpleError;
        if (type == Symbol.ERROR)
            return c instanceof LispError;
        if (type == Symbol.SIMPLE_CONDITION)
            return c instanceof SimpleCondition;

        return false;
    }

    // ### %make-array dimensions element-type initial-element initial-contents
    // adjustable fill-pointer displaced-to displaced-index-offset
    private static final Primitive _MAKE_ARRAY =
        new Primitive("%make-array", PACKAGE_SYS, false) {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 9)
                throw new WrongNumberOfArgumentsException(this);
            LispObject dimensions = args[0];
            LispObject elementType = args[1];
            LispObject initialElement = args[2];
            LispObject initialElementProvided = args[3];
            LispObject initialContents = args[4];
            LispObject adjustable = args[5];
            LispObject fillPointer = args[6];
            LispObject displacedTo = args[7];
            LispObject displacedIndexOffset = args[8];
            if (initialElementProvided != NIL && initialContents != NIL) {
                throw new LispError("MAKE-ARRAY: cannot specify both " +
                                    ":INITIAL-ELEMENT AND :INITIAL-CONTENTS");
            }
            final int rank = dimensions.listp() ? dimensions.length() : 1;
            if (displacedTo != NIL) {
                final AbstractArray array = checkArray(displacedTo);
                final int offset;
                if (displacedIndexOffset != NIL)
                    offset = Fixnum.getValue(displacedIndexOffset);
                else
                    offset = 0;
                if (initialElementProvided != NIL)
                    throw new LispError(":INITIAL-ELEMENT must not be specified with :DISPLACED-TO");
                if (initialContents != NIL)
                    throw new LispError(":INITIAL-CONTENTS must not be specified with :DISPLACED-TO");
                return new DisplacedArray(array, offset);
            }
            if (rank == 1) {
                final int size;
                if (dimensions instanceof Cons)
                    size = Fixnum.getValue(dimensions.car());
                else
                    size = Fixnum.getValue(dimensions);
                int limit =
                    Fixnum.getValue(Symbol.ARRAY_DIMENSION_LIMIT.getSymbolValue());
                if (size < 0 || size >= limit) {
                    StringBuffer sb = new StringBuffer();
                    sb.append("the size specified for this array (");
                    sb.append(size);
                    sb.append(')');
                    if (size >= limit) {
                        sb.append(" is >= ARRAY-DIMENSION-LIMIT (");
                        sb.append(limit);
                        sb.append(')');
                    } else
                        sb.append(" is negative");
                    throw new LispError(sb.toString());
                }
                AbstractVector v;
                if (elementType == Symbol.CHARACTER ||
                    elementType == Symbol.BASE_CHAR ||
                    elementType == Symbol.STANDARD_CHAR ||
                    elementType == Symbol.NIL) {
                    v = new LispString(size);
                } else if (elementType == Symbol.BIT) {
                    v = new BitVector(size);
                } else {
                    // FIXME If elementType != null it should be a known type.
                    v = new Vector(size);
                }
                if (initialElementProvided != NIL) {
                    // Initial element was specified.
                    v.fill(initialElement);
                } else if (initialContents != NIL) {
                    final int type = initialContents.getType();
                    if ((type & TYPE_LIST) != 0) {
                        LispObject list = initialContents;
                        for (int i = 0; i < size; i++) {
                            v.set(i, list.car());
                            list = list.cdr();
                        }
                    } else if ((type & TYPE_VECTOR) != 0) {
                        for (int i = 0; i < size; i++)
                            v.set(i, initialContents.elt(i));
                    } else
                        throw new TypeError(initialContents, "sequence");
                }
                if (fillPointer != NIL)
                    v.setFillPointer(fillPointer);
                return v;
            }
            // rank != 1
            int[] dimv = new int[rank];
            for (int i = 0; i < rank; i++) {
                LispObject dim = dimensions.car();
                dimv[i] = Fixnum.getValue(dim);
                dimensions = dimensions.cdr();
            }
            Array array;
            if (initialContents != NIL) {
                array = new Array(dimv, initialContents);
            } else {
                array = new Array(dimv);
                if (initialElementProvided != NIL)
                    array.fill(initialElement);
            }
            return array;
        }
    };

    // ### array-rank
    // array-rank array => rank
    private static final Primitive1 ARRAY_RANK =
        new Primitive1("array-rank") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return new Fixnum(checkArray(arg).getRank());
        }
    };

    // ### array-dimensions
    // array-dimensions array => dimensions
    // Returns a list of integers. Fill pointer (if any) is ignored.
    private static final Primitive1 ARRAY_DIMENSIONS =
        new Primitive1("array-dimensions") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return checkArray(arg).getDimensions();
        }
    };

    // ### array-dimension
    // array-dimension array axis-number => dimension
    private static final Primitive2 ARRAY_DIMENSION =
        new Primitive2("array-dimension") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return new Fixnum(checkArray(first).getDimension(Fixnum.getValue(second)));
        }
    };

    // ### array-total-size
    // array-total-size array => size
    private static final Primitive1 ARRAY_TOTAL_SIZE =
        new Primitive1("array-total-size") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return new Fixnum(checkArray(arg).getTotalSize());
        }
    };


    // ### array-element-type
    // array-element-type array => typespec
    private static final Primitive1 ARRAY_ELEMENT_TYPE =
        new Primitive1("array-element-type") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return checkArray(arg).getElementType();
        }
    };

    // ### array-in-bounds-p
    // array-in-bounds-p array &rest subscripts => generalized-boolean
    private static final Primitive ARRAY_IN_BOUNDS_P =
        new Primitive("array-in-bounds-p") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 1)
                throw new WrongNumberOfArgumentsException(this);
            AbstractArray array = checkArray(args[0]);
            int rank = array.getRank();
            if (rank != args.length - 1) {
                StringBuffer sb = new StringBuffer("ARRAY-IN-BOUNDS-P: ");
                sb.append("wrong number of subscripts (");
                sb.append(args.length - 1);
                sb.append(") for array of rank ");
                sb.append(rank);
                throw new ProgramError(sb.toString());
            }
            for (int i = 0; i < rank; i++) {
                LispObject arg = args[i+1];
                if (arg instanceof Fixnum) {
                    int subscript = ((Fixnum)arg).getValue();
                    if (subscript < 0 || subscript >= array.getDimension(i))
                        return NIL;
                } else if (arg instanceof Bignum) {
                    return NIL;
                } else
                    throw new TypeError(arg, "integer");
            }
            return T;
        }
    };

    // ### %array-row-major-index
    // %array-row-major-index array subscripts => index
    private static final Primitive2 _ARRAY_ROW_MAJOR_INDEX =
        new Primitive2("%array-row-major-index", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            AbstractArray array = checkArray(first);
            LispObject[] subscripts = second.copyToArray();
            return number(arrayRowMajorIndex(array, subscripts));
        }
    };

    // ### aref
    // aref array &rest subscripts => element
    private static final Primitive AREF = new Primitive("aref") {
        public LispObject execute(LispObject arg) throws LispError
        {
            AbstractArray array = checkArray(arg);
            if (array.getRank() == 0)
                return array.getRowMajor(0);
            StringBuffer sb = new StringBuffer("AREF: ");
            sb.append("wrong number of subscripts (0) for array of rank ");
            sb.append(array.getRank());
            throw new ProgramError(sb.toString());
        }
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.AREF(second);
        }
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 1)
                throw new WrongNumberOfArgumentsException(this);
            AbstractArray array = checkArray(args[0]);
            LispObject[] subscripts = new LispObject[args.length - 1];
            for (int i = subscripts.length; i-- > 0;)
                subscripts[i] = args[i+1];
            int rowMajorIndex = arrayRowMajorIndex(array, subscripts);
            return array.getRowMajor(rowMajorIndex);
        }
    };

    private static final int arrayRowMajorIndex(AbstractArray array,
                                                LispObject[] subscripts) throws LispError
    {
        final int rank = array.getRank();
        if (rank != subscripts.length) {
            StringBuffer sb = new StringBuffer("%ARRAY-ROW-MAJOR-INDEX: ");
            sb.append("wrong number of subscripts (");
            sb.append(subscripts.length);
            sb.append(") for array of rank ");
            sb.append(rank);
            throw new ProgramError(sb.toString());
        }
        if (rank == 0)
            return 0;
        int sum = 0;
        int size = 1;
        for (int i = rank; i-- > 0;) {
            int dim = array.getDimension(i);
            int lastSize = size;
            size *= dim;
            LispObject subscript = subscripts[i];
            if (subscript instanceof Fixnum) {
                int n = ((Fixnum)subscript).getValue();
                if (n < 0 || n >= array.getDimension(i))
                    throw new ProgramError();
                sum += n * lastSize;
            } else if (subscript instanceof Bignum) {
                throw new ProgramError();
            } else
                throw new TypeError(subscript, "integer");
        }
        return sum;
    }

    // ### row-major-aref
    // row-major-aref array index => element
    private static final Primitive2 ROW_MAJOR_AREF =
        new Primitive2("row-major-aref") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return checkArray(first).getRowMajor(Fixnum.getValue(second));
        }
    };

    // ### %set-row-major-aref
    // %set-row-major-aref array index new-value => new-value
    private static final Primitive3 _SET_ROW_MAJOR_AREF =
        new Primitive3("%set-row-major-aref", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispError
        {
            checkArray(first).setRowMajor(Fixnum.getValue(second), third);
            return third;
        }
    };

    // ### vector
    private static final Primitive VECTOR = new Primitive("vector") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            return new Vector(args);
        }
    };

    // ### svref
    // svref simple-vector index => element
    private static final Primitive2 SVREF = new Primitive2("svref") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            AbstractVector v = checkVector(first);
            if (!v.isSimpleVector())
                throw new TypeError(first, "simple vector");
            int index = v.checkIndex(second);
            return v.get(index);
        }
    };

    // ### %svset
    // %svset simple-vector index new-value => new-value
    private static final Primitive3 _SVSET =
        new Primitive3("%svset", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws LispError
        {
            AbstractVector v = checkVector(first);
            if (!v.isSimpleVector())
                throw new TypeError(first, "simple vector");
            int i = v.checkIndex(second);
            v.set(i, third);
            return third;
        }
    };

    // ### fill-pointer
    private static final Primitive1 FILL_POINTER =
        new Primitive1("fill-pointer") {
        public LispObject execute(LispObject arg)
            throws LispError
        {
            int fillPointer = checkVector(arg).getFillPointer();
            if (fillPointer < 0)
                throw new TypeError("array does not have a fill pointer");
            return new Fixnum(fillPointer);
        }
    };

    // ### %set-fill-pointer
    private static final Primitive2 _SET_FILL_POINTER =
        new Primitive2("%set-fill-pointer") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            AbstractVector v = checkVector(first);
            int fillPointer = v.getFillPointer();
            if (fillPointer < 0)
                throw new TypeError("array does not have a fill pointer");
            v.setFillPointer(second);
            return second;
        }
    };

    // ### vector-push
    // vector-push new-element vector => index-of-new-element
    private static final Primitive2 VECTOR_PUSH =
        new Primitive2("vector-push") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            AbstractVector v = checkVector(second);
            int fillPointer = v.getFillPointer();
            if (fillPointer < 0)
                throw new TypeError("array does not have a fill pointer");
            if (fillPointer >= v.capacity())
                return NIL;
            v.set(fillPointer, first);
            v.setFillPointer(fillPointer + 1);
            return new Fixnum(fillPointer);
        }
    };

    // ### vector-push-extend
    // vector-push new-element vector &optional extension => index-of-new-element
    private static final Primitive VECTOR_PUSH_EXTEND =
        new Primitive("vector-push-extend") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 2 || args.length > 3)
                throw new WrongNumberOfArgumentsException(this);
            AbstractVector v = checkVector(args[1]);
            int extension = 0;
            if (args.length == 3) {
                // Extension was supplied.
                extension = Fixnum.getValue(args[2]);
            }
            int fillPointer = v.getFillPointer();
            if (fillPointer < 0)
                throw new TypeError("array does not have a fill pointer");
            if (fillPointer >= v.capacity()) {
                // Need to extend vector.
                extension = Math.max(extension, v.capacity() + 1);
                v.ensureCapacity(v.capacity() + extension);
            }
            v.set(fillPointer, args[0]);
            v.setFillPointer(fillPointer + 1);
            return new Fixnum(fillPointer);
        }
    };

    // ### vector-pop
    // vector-pop vector => element
    private static final Primitive1 VECTOR_POP = new Primitive1("vector-pop") {
        public LispObject execute(LispObject arg) throws LispError
        {
            AbstractVector v = checkVector(arg);
            int fillPointer = v.getFillPointer();
            if (fillPointer < 0)
                throw new TypeError("array does not have a fill pointer");
            if (fillPointer == 0)
                throw new LispError("nothing left to pop");
            int newFillPointer = v.checkIndex(fillPointer - 1);
            LispObject element = v.get(newFillPointer);
            v.setFillPointer(newFillPointer);
            return element;
        }
    };

    // ### type-of
    private static final Primitive1 TYPE_OF = new Primitive1("type-of") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg.typeOf();
        }
    };

    // ### class-of
    private static final Primitive1 CLASS_OF = new Primitive1("class-of") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg.classOf();
        }
    };

    // ### typep
    private static final Primitive2 TYPEP = new Primitive2("typep") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return first.typep(second);
        }
    };

    // ### subtypep
    // subtypep type-1 type-2 &optional environment => subtype-p, valid-p
    private static final Primitive SUBTYPEP = new Primitive("subtypep") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 2 || args.length > 3)
                throw new WrongNumberOfArgumentsException(this);
            if (args[0] == NIL)
                return T;
            if (args[1] == NIL)
                return NIL;
            TypeSpecifier ts1 = TypeSpecifier.getInstance(args[0]);
            TypeSpecifier ts2 = TypeSpecifier.getInstance(args[1]);
            return ts1.isSubtypeOf(ts2);
        }
    };

    // ### function-lambda-expression
    // function-lambda-expression function => lambda-expression, closure-p, name
    private static final Primitive1 FUNCTION_LAMBDA_EXPRESSION =
        new Primitive1("function-lambda-expression") {
        public LispObject execute(LispObject arg) throws LispError
        {
            LispObject[] values = new LispObject[3];
            Function function = checkFunction(arg);
            String name = function.getName();
            values[2] = name != null ? new LispString(name) : NIL;
            if (function instanceof Closure) {
                Closure closure = (Closure) function;
                LispObject expr = closure.getBody();
                expr = new Cons(closure.getParameterList(), expr);
                expr = new Cons(Symbol.LAMBDA, expr);
                values[0] = expr;
                Environment env = closure.getEnvironment();
                if (env == null || env.isEmpty())
                    values[1] = NIL;
                else
                    values[1] = T;
            } else
                values[0] = values[1] = NIL;
            LispThread.currentThread().setValues(values);
            return values[0];
        }
    };

    // ### funcall
    private static final Primitive FUNCALL = new Primitive("funcall") {
        public LispObject execute(LispObject first) throws Condition
        {
            LispObject fun;
            if (first instanceof Symbol) {
                fun = first.getSymbolFunction();
                if (fun instanceof SpecialOperator)
                    throw new UndefinedFunctionError(first);
            } else
                fun = first;
            if (fun instanceof Function)
                return funcall0(fun, LispThread.currentThread());
            throw new TypeError(fun, "function");
        }
        public LispObject execute(LispObject first, LispObject second)
            throws Condition
        {
            LispObject fun;
            if (first instanceof Symbol) {
                fun = first.getSymbolFunction();
                if (fun instanceof SpecialOperator)
                    throw new UndefinedFunctionError(first);
            } else
                fun = first;
            if (fun instanceof Function)
                return funcall1(fun, second, LispThread.currentThread());
            throw new TypeError(fun, "function");
        }
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws Condition
        {
            LispObject fun;
            if (first instanceof Symbol) {
                fun = first.getSymbolFunction();
                if (fun instanceof SpecialOperator)
                    throw new UndefinedFunctionError(first);
            } else
                fun = first;
            if (fun instanceof Function)
                return funcall2(fun, second, third, LispThread.currentThread());
            throw new TypeError(fun, "function");
        }
        public LispObject execute(LispObject[] args) throws Condition
        {
            if (args.length < 1)
                throw new WrongNumberOfArgumentsException(this);
            LispObject fun = args[0];
            if (fun instanceof Symbol) {
                fun = fun.getSymbolFunction();
                if (fun instanceof SpecialOperator)
                    throw new UndefinedFunctionError(args[0]);
            }
            if (fun instanceof Function) {
                final int length = args.length - 1; // Number of arguments.
                if (length == 3) {
                    return funcall3(fun, args[1], args[2], args[3],
                                    LispThread.currentThread());
                } else {
                    LispObject[] funArgs = new LispObject[length];
                    System.arraycopy(args, 1, funArgs, 0, length);
                    return funcall(fun, funArgs, LispThread.currentThread());
                }
            }
            throw new TypeError(fun, "function");
        }
    };

    // ### apply
    private static final Primitive APPLY = new Primitive("apply") {
        public LispObject execute(LispObject first, LispObject second)
            throws Condition
        {
            LispObject spread = checkList(second);
            LispObject fun = first;
            if (fun instanceof Symbol)
                fun = fun.getSymbolFunction();
            if (fun instanceof Function) {
                final int numFunArgs = spread.length();
                final LispThread thread = LispThread.currentThread();
                switch (numFunArgs) {
                    case 1:
                        return funcall1(fun, spread.car(), thread);
                    case 2:
                        return funcall2(fun, spread.car(), spread.cadr(), thread);
                    case 3:
                        return funcall3(fun, spread.car(), spread.cadr(),
                                        spread.cdr().cdr().car(), thread);
                    default: {
                        final LispObject[] funArgs = new LispObject[numFunArgs];
                        int j = 0;
                        while (spread != NIL) {
                            funArgs[j++] = spread.car();
                            spread = spread.cdr();
                        }
                        return funcall(fun, funArgs, thread);
                    }
                }
            }
            throw new TypeError(fun, "function");
        }
        public LispObject execute(final LispObject[] args) throws Condition
        {
            final int numArgs = args.length;
            if (numArgs < 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject spread = checkList(args[numArgs - 1]);
            LispObject fun = args[0];
            if (fun instanceof Symbol)
                fun = fun.getSymbolFunction();
            if (fun instanceof Function) {
                final int numFunArgs = numArgs - 2 + spread.length();
                final LispObject[] funArgs = new LispObject[numFunArgs];
                int j = 0;
                for (int i = 1; i < numArgs - 1; i++)
                    funArgs[j++] = args[i];
                while (spread != NIL) {
                    funArgs[j++] = spread.car();
                    spread = spread.cdr();
                }
                return funcall(fun, funArgs, LispThread.currentThread());
            }
            throw new TypeError(fun, "function");
        }
    };

    // ### mapcar
    private static final Primitive MAPCAR = new Primitive("mapcar") {
        public LispObject execute(LispObject first, LispObject second)
            throws Condition
        {
            // First argument must be a function.
            LispObject fun = first;
            if (fun instanceof Symbol)
                fun = fun.getSymbolFunction();
            if (!(fun instanceof Function))
                throw new UndefinedFunctionError(first);
            // Second argument must be a list.
            LispObject list = checkList(second);
            final LispThread thread = LispThread.currentThread();
            LispObject result = NIL;
            LispObject splice = null;
            while (list != NIL) {
                LispObject obj = funcall1(fun, list.car(), thread);
                if (splice == null) {
                    result = new Cons(obj, result);
                    splice = result;
                } else {
                    Cons cons = new Cons(obj);
                    splice.setCdr(cons);
                    splice = cons;
                }
                list = list.cdr();
            }
            return result;
        }
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws Condition
        {
            // First argument must be a function.
            LispObject fun = first;
            if (fun instanceof Symbol)
                fun = fun.getSymbolFunction();
            if (!(fun instanceof Function))
                throw new UndefinedFunctionError(first);
            // Remaining arguments must be lists.
            LispObject list1 = checkList(second);
            LispObject list2 = checkList(third);
            final LispThread thread = LispThread.currentThread();
            LispObject result = NIL;
            LispObject splice = null;
            while (list1 != NIL && list2 != NIL) {
                LispObject obj =
                    funcall2(fun, list1.car(), list2.car(), thread);
                if (splice == null) {
                    result = new Cons(obj, result);
                    splice = result;
                } else {
                    Cons cons = new Cons(obj);
                    splice.setCdr(cons);
                    splice = cons;
                }
                list1 = list1.cdr();
                list2 = list2.cdr();
            }
            return result;
        }
        public LispObject execute(final LispObject[] args) throws Condition
        {
            final int numArgs = args.length;
            if (numArgs < 2)
                throw new WrongNumberOfArgumentsException(this);
            // First argument must be a function.
            LispObject fun = args[0];
            if (fun instanceof Symbol)
                fun = fun.getSymbolFunction();
            if (!(fun instanceof Function))
                throw new UndefinedFunctionError(args[0]);
            // Remaining arguments must be lists.
            int commonLength = -1;
            for (int i = 1; i < numArgs; i++) {
                if (!args[i].listp())
                    throw new TypeError(args[i], "list");
                int len = args[i].length();
                if (commonLength < 0)
                    commonLength = len;
                else if (commonLength > len)
                    commonLength = len;
            }
            final LispThread thread = LispThread.currentThread();
            LispObject[] results = new LispObject[commonLength];
            final int numFunArgs = numArgs - 1;
            final LispObject[] funArgs = new LispObject[numFunArgs];
            for (int i = 0; i < commonLength; i++) {
                for (int j = 0; j < numFunArgs; j++)
                    funArgs[j] = args[j+1].car();
                results[i] = funcall(fun, funArgs, thread);
                for (int j = 1; j < numArgs; j++)
                    args[j] = args[j].cdr();
            }
            LispObject result = NIL;
            for (int i = commonLength; i-- > 0;)
                result = new Cons(results[i], result);
            return result;
        }
    };

    // ### macroexpand
    private static final Primitive MACROEXPAND = new Primitive("macroexpand") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            final int length = args.length;
            if (length < 1 || length > 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject form = args[0];
            Environment env =
                length == 2 ? checkEnvironment(args[1]) : new Environment();
            return macroexpand(form, env, LispThread.currentThread());
        }
    };

    // ### macroexpand-1
    private static final Primitive MACROEXPAND_1 =
        new Primitive("macroexpand-1") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            final int length = args.length;
            if (length < 1 || length > 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject form = args[0];
            Environment env =
                length == 2 ? checkEnvironment(args[1]) : new Environment();
            return macroexpand_1(form, env, LispThread.currentThread());
        }
    };

    // ### *gensym-counter*
    private static final Symbol _GENSYM_COUNTER_ =
        PACKAGE_CL.addExternalSymbol("*GENSYM-COUNTER*");
    static {
        _GENSYM_COUNTER_.setSymbolValue(Fixnum.ZERO);
        _GENSYM_COUNTER_.setSpecial(true);
    }

    // ### gensym
    private static final Primitive GENSYM = new Primitive("gensym") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length > 1)
                throw new WrongNumberOfArgumentsException(this);
            String prefix = "G";
            if (args.length == 1) {
                LispObject arg = args[0];
                if (arg instanceof Fixnum) {
                    int n = ((Fixnum)arg).getValue();
                    if (n < 0)
                        throw new TypeError(arg,
                            "non-negative integer");
                    StringBuffer sb = new StringBuffer(prefix);
                    sb.append(n);
                    return new Symbol(sb.toString());
                }
                if (arg instanceof Bignum) {
                    BigInteger n = ((Bignum)arg).getValue();
                    if (n.signum() < 0)
                        throw new TypeError(arg,
                            "non-negative integer");
                    StringBuffer sb = new StringBuffer(prefix);
                    sb.append(n.toString());
                    return new Symbol(sb.toString());
                }
                if (arg instanceof LispString)
                    prefix = ((LispString)arg).getValue();
                else
                    throw new TypeError(arg, "string or non-negative integer");
            }
            return gensym(prefix);
        }
    };

    private static final Symbol gensym() throws LispError
    {
        return gensym("G");
    }

    private static final Symbol gensym(String prefix) throws LispError
    {
        LispObject oldValue;
        LispThread thread = LispThread.currentThread();
        Environment dynEnv = thread.getDynamicEnvironment();
        Binding binding =
            (dynEnv == null) ? null : dynEnv.getBinding(_GENSYM_COUNTER_);
        if (binding != null) {
            oldValue = binding.value;
            binding.value = oldValue.incr();
        } else {
            oldValue = _GENSYM_COUNTER_.getSymbolValue();
            _GENSYM_COUNTER_.setSymbolValue(oldValue.incr());
        }
        StringBuffer sb = new StringBuffer(prefix);
        sb.append(String.valueOf(oldValue));
        return new Symbol(sb.toString());
    }

    // ### string
    private static final Primitive1 STRING = new Primitive1("string") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return string(arg);
        }
    };

    // ### intern
    // intern string &optional package => symbol, status
    // status is one of :INHERITED, :EXTERNAL, :INTERNAL or NIL.
    private static final Primitive INTERN = new Primitive("intern") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            final LispThread thread = LispThread.currentThread();
            switch (args.length) {
                case 1: {
                    Package pkg =
                        (Package) _PACKAGE_.symbolValueNoThrow(thread);
                    return pkg.intern(LispString.getValue(args[0]), thread);
                }
                case 2: {
                    Package pkg = coerceToPackage(args[1]);
                    return pkg.intern(LispString.getValue(args[0]), thread);
                }
                default:
                    throw new WrongNumberOfArgumentsException(this);
            }
        }
    };

    // ### unintern
    // unintern symbol &optional package => generalized-boolean
    private static final Primitive UNINTERN = new Primitive("unintern") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length == 0 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args[0]);
            Package pkg;
            if (args.length == 2)
                pkg = coerceToPackage(args[1]);
            else
                pkg = getCurrentPackage();
            return pkg.unintern(symbol);
        }
    };

    // ### find-package
    private static final Primitive1 FIND_PACKAGE =
        new Primitive1("find-package") {
        public LispObject execute(LispObject arg) throws LispError
        {
            if (arg instanceof Package)
                return arg;
            if (arg instanceof LispString) {
                Package pkg =
                    Packages.findPackage(((LispString)arg).getValue());
                return pkg != null ? pkg : NIL;
            }
            if (arg instanceof Symbol) {
                Package pkg = Packages.findPackage(arg.getName());
                return pkg != null ? pkg : NIL;
            }
            if (arg instanceof LispCharacter) {
                String packageName =
                    String.valueOf(new char[] {((LispCharacter)arg).getValue()});
                Package pkg = Packages.findPackage(packageName);
                return pkg != null ? pkg : NIL;
            }
            return NIL;
        }
    };

    // ### %make-package
    // %make-package package-name nicknames use => package
    private static final Primitive3 _MAKE_PACKAGE =
        new Primitive3("%make-package", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws LispError
        {
            String packageName = javaString(first);
            Package pkg =
                Packages.findPackage(packageName);
            if (pkg != null)
                throw new LispError("package " + packageName +
                    " already exists");
            LispObject nicknames = checkList(second);
            if (nicknames != NIL) {
                LispObject list = nicknames;
                while (list != NIL) {
                    String nick = javaString(list.car());
                    if (Packages.findPackage(nick) != null) {
                        throw new PackageError("a package named " + nick +
                                               " already exists");
                    }
                    list = list.cdr();
                }
            }
            LispObject use = checkList(third);
            if (use != NIL) {
                LispObject list = use;
                while (list != NIL) {
                    LispObject obj = list.car();
                    if (obj instanceof Package)
                        ; // OK.
                    else {
                        String s = javaString(obj);
                        Package p = Packages.findPackage(s);
                        if (p == null)
                            throw new LispError(String.valueOf(obj) +
                                                " is not the name of a package");
                    }
                    list = list.cdr();
                }
            }
            // Now create the package.
            pkg = Packages.createPackage(packageName);
            // Add the nicknames.
            while (nicknames != NIL) {
                String nick = javaString(nicknames.car());
                pkg.addNickname(nick);
                nicknames = nicknames.cdr();
            }
            // Create the use list.
            while (use != NIL) {
                LispObject obj = use.car();
                if (obj instanceof Package)
                    pkg.usePackage((Package)obj);
                else {
                    String s = javaString(obj);
                    Package p = Packages.findPackage(s);
                    if (p == null)
                        throw new LispError(String.valueOf(obj) +
                                            " is not the name of a package");
                    pkg.usePackage(p);
                }
                use = use.cdr();
            }
            return pkg;
        }
    };

    // ### %in-package
    private static final Primitive1 _IN_PACKAGE =
        new Primitive1("%in-package", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws LispError
        {
            String packageName = javaString(arg);
            Package pkg = Packages.findPackage(packageName);
            if (pkg == null)
                throw new PackageError("package " + arg + " does not exist");
            LispThread thread = LispThread.currentThread();
            Environment dynEnv = thread.getDynamicEnvironment();
            if (dynEnv != null) {
                Binding binding = dynEnv.getBinding(_PACKAGE_);
                if (binding != null) {
                    binding.value = pkg;
                    return pkg;
                }
            }
            // No dynamic binding.
            _PACKAGE_.setSymbolValue(pkg);
            return pkg;
        }
    };

    // ### use-package
    // use-package packages-to-use &optional package => t
    private static final Primitive USE_PACKAGE = new Primitive("use-package") {
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
                    pkg.usePackage(coerceToPackage(list.car()));
                    list = list.cdr();
                }
            } else
                pkg.usePackage(coerceToPackage(args[0]));
            return T;
        }
    };

    // ### do-external-symbols
    // do-external-symbols (var [package [result-form]]) declaration* {tag | statement}*
    // => result*
    // Should be a macro.
    private static final SpecialOperator DO_EXTERNAL_SYMBOLS =
        new SpecialOperator("do-external-symbols") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            return doSymbols(args, env, true);
        }
    };

    // ### do-symbols
    // do-symbols (var [package [result-form]]) declaration* {tag | statement}*
    // => result*
    // Should be a macro.
    private static final SpecialOperator DO_SYMBOLS =
        new SpecialOperator("do-symbols") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            return doSymbols(args, env, false);
        }
    };

    private static final LispObject doSymbols(LispObject args, Environment env,
                                              boolean externalOnly)
        throws Condition
    {
        LispObject bodyForm = args.cdr();
        args = args.car();
        Symbol var = checkSymbol(args.car());
        args = args.cdr();
        final LispThread thread = LispThread.currentThread();
        // Defaults.
        Package pkg = getCurrentPackage();
        LispObject resultForm = NIL;
        if (args != NIL) {
            pkg = coerceToPackage(eval(args.car(), env, thread));
            args = args.cdr();
            if (args != NIL)
                resultForm = args.car();
        }
        Environment oldDynEnv = thread.getDynamicEnvironment();
        final List list;
        if (externalOnly)
            list = pkg.getExternalSymbols();
        else
            list = pkg.getAccessibleSymbols();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Symbol symbol = (Symbol) it.next();
            Environment ext = new Environment(env);
            bind(var, symbol, ext);
            LispObject body = bodyForm;
            int depth = thread.getStackDepth();
            try {
                while (body != NIL) {
                    eval(body.car(), ext, thread);
                    body = body.cdr();
                }
            }
            catch (Return ret) {
                if (ret.getTag() == NIL) {
                    thread.setStackDepth(depth);
                    return ret.getResult();
                }
                throw ret;
            }
        }
        Environment ext = new Environment(env);
        bind(var, NIL, ext);
        LispObject result = eval(resultForm, ext, thread);
        thread.setDynamicEnvironment(oldDynEnv);
        return result;
    }

    // ### package-symbols
    private static final Primitive1 PACKAGE_SYMBOLS =
        new Primitive1("package-symbols", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws Condition
        {
            return coerceToPackage(arg).getSymbols();
        }
    };

    // ### export
    // export symbols &optional package
    private static final Primitive EXPORT =
        new Primitive("export") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length == 0 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            Package pkg;
            if (args.length == 2)
                pkg = coerceToPackage(args[1]);
            else
                pkg = (Package) _PACKAGE_.symbolValue();
            // args[0] can be a single symbol or a list.
            if (args[0] instanceof Cons) {
                for (LispObject list = args[0]; list != NIL; list = list.cdr())
                    pkg.export(checkSymbol(list.car()));
            } else
                pkg.export(checkSymbol(args[0]));
            return T;
        }
    };

    // ### find-symbol
    // find-symbol string &optional package => symbol, status
    private static final Primitive FIND_SYMBOL =
        new Primitive("find-symbol") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length == 0 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            String name = LispString.getValue(args[0]);
            Package pkg;
            if (args.length == 2)
                pkg = coerceToPackage(args[1]);
            else
                pkg = getCurrentPackage();
            return pkg.findSymbol(name);
        }
    };

    // ### fset
    private static final Primitive2 FSET =
        new Primitive2("fset") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            Symbol symbol = checkSymbol(first);
            if (second instanceof LispString) {
                String className = ((LispString)second).getValue();
                if (className.endsWith(".class")) {
                    try {
                        JavaClassLoader loader = new JavaClassLoader();
                        Class c = loader.loadClassFromFile(className);
                        if (c != null) {
                            Class[] parameterTypes = new Class[0];
                            java.lang.reflect.Constructor constructor =
                                c.getConstructor(parameterTypes);
                            Object[] initargs = new Object[0];
                            LispObject obj =
                                (LispObject) constructor.newInstance(initargs);
                            symbol.setSymbolFunction(obj);
                            return obj;
                        }
                    }
                    catch (Throwable t) {
                        Debug.trace(t);
                    }
                }
                throw new LispError("unable to load ".concat(className));
            }
            symbol.setSymbolFunction(second);
            return second;
        }
    };

    // ### %set-symbol-plist
    private static final Primitive2 _SET_SYMBOL_PLIST =
        new Primitive2("%set-symbol-plist") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            checkSymbol(first).setPropertyList(checkList(second));
            return second;
        }
    };

    // ### get
    // get symbol indicator &optional default => value
    private static final Primitive GET = new Primitive("get") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            Symbol symbol;
            LispObject indicator;
            LispObject defaultValue;
            switch (args.length) {
                case 2:
                    symbol = checkSymbol(args[0]);
                    indicator = args[1];
                    defaultValue = NIL;
                    break;
                case 3:
                    symbol = checkSymbol(args[0]);
                    indicator = args[1];
                    defaultValue = args[2];
                    break;
                default:
                    throw new WrongNumberOfArgumentsException(this);
            }
            return get(symbol, indicator, defaultValue);
        }
    };

    // ### %put
    // %put symbol indicator value
    private static final Primitive3 _PUT = new Primitive3("%put") {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispError
        {
            Symbol symbol = checkSymbol(first);
            LispObject indicator = second;
            LispObject value = third;
            return put(symbol, indicator, value);
        }
    };

    private static final SpecialOperator LET = new SpecialOperator("let") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            return _let(args, env, false);
        }
    };

    private static final SpecialOperator LETX = new SpecialOperator("let*") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            return _let(args, env, true);
        }
    };

    private static final LispObject _let(LispObject args, Environment env,
        boolean sequential) throws Condition
    {
        LispObject varList = checkList(args.car());
        final LispThread thread = LispThread.currentThread();
        LispObject result = NIL;
        if (varList != NIL) {
            Environment oldDynEnv = thread.getDynamicEnvironment();
            Environment ext = new Environment(env);
            Environment evalEnv = sequential ? ext : env;
            for (int i = varList.length(); i-- > 0;) {
                LispObject obj = varList.car();
                varList = varList.cdr();
                if (obj instanceof Cons) {
                    bind(checkSymbol(obj.car()),
                        eval(obj.cadr(), evalEnv, thread),
                        ext);
                } else
                    bind(checkSymbol(obj), NIL, ext);
            }
            LispObject body = args.cdr();
            while (body != NIL) {
                result = eval(body.car(), ext, thread);
                body = body.cdr();
            }
            thread.setDynamicEnvironment(oldDynEnv);
        } else {
            LispObject body = args.cdr();
            while (body != NIL) {
                result = eval(body.car(), env, thread);
                body = body.cdr();
            }
        }
        return result;
    }

    private static final LispObject _flet(LispObject args, Environment env,
        boolean recursive) throws Condition
    {
        // First argument is a list of local function definitions.
        LispObject defs = checkList(args.car());
        final LispThread thread = LispThread.currentThread();
        LispObject result;
        if (defs != NIL) {
            Environment oldDynEnv = thread.getDynamicEnvironment();
            Environment ext = new Environment(env);
            while (defs != NIL) {
                LispObject def = checkList(defs.car());
                Symbol symbol = checkSymbol(def.car());
                LispObject rest = def.cdr();
                LispObject parameters = rest.car();
                LispObject body = rest.cdr();
                body = new Cons(symbol, body);
                body = new Cons(Symbol.BLOCK, body);
                body = new Cons(body, NIL);
                Closure closure;
                if (recursive)
                    closure = new Closure(parameters, body, ext);
                else
                    closure = new Closure(parameters, body, env);
                closure.setLambdaName(list(Symbol.FLET, symbol));
                ext.bindFunctional(symbol, closure);
                defs = defs.cdr();
            }
            result = progn(args.cdr(), ext, thread);
            thread.setDynamicEnvironment(oldDynEnv);
        } else
            result = progn(args.cdr(), env, thread);
        return result;
    }

    // ### macrolet
    private static final SpecialOperator MACROLET =
        new SpecialOperator("macrolet") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            LispObject defs = checkList(args.car());
            final LispThread thread = LispThread.currentThread();
            LispObject result;
            if (defs != NIL) {
                Environment ext = new Environment(env);
                while (defs != NIL) {
                    LispObject def = checkList(defs.car());
                    Symbol symbol = checkSymbol(def.car());
                    LispObject lambdaList = def.cadr();
                    LispObject body = def.cddr();
                    LispObject block =
                        new Cons(Symbol.BLOCK, new Cons(symbol, body));
                    LispObject toBeApplied =
                        list(Symbol.LAMBDA, lambdaList, block);
                    LispObject formArg = gensym("FORM-");
                    LispObject envArg = gensym("ENV-"); // Ignored.
                    LispObject expander =
                        list(Symbol.LAMBDA, list(formArg, envArg),
                             list(Symbol.APPLY, toBeApplied,
                                  list(Symbol.CDR, formArg)));
                    Closure expansionFunction =
                        new Closure(expander.cadr(), expander.cddr(), env);
                    MacroObject macroObject =
                        new MacroObject(expansionFunction);
                    ext.bindFunctional(symbol, macroObject);
                    defs = defs.cdr();
                }
                result = progn(args.cdr(), ext, thread);
            } else
                result = progn(args.cdr(), env, thread);
            return result;
        }
    };

    // ### tagbody
    private static final SpecialOperator TAGBODY =
        new SpecialOperator("tagbody") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            Binding tags = null;
            LispObject body = args;
            while (body != NIL) {
                LispObject current = body.car();
                body = body.cdr();
                if (current instanceof Cons)
                    continue;
                // It's a tag.
                tags = new Binding(current, body, tags);
            }
            final LispThread thread = LispThread.currentThread();
            final int depth = thread.getStackDepth();
            LispObject remaining = args;
            while (remaining != NIL) {
                LispObject current = remaining.car();
                if (current instanceof Cons) {
                    try {
                        // Handle GO inline if possible.
                        if (current.car() == Symbol.GO) {
                            LispObject code = null;
                            LispObject tag = current.cadr();
                            for (Binding binding = tags; binding != null; binding = binding.next) {
                                if (binding.symbol.eql(tag)) {
                                    code = binding.value;
                                    break;
                                }
                            }
                            if (code != null) {
                                remaining = code;
                                continue;
                            }
                            throw new Go(tag);
                        }
                        eval(current, env, thread);
                    }
                    catch (Go go) {
                        LispObject code = null;
                        LispObject tag = go.getTag();
                        for (Binding binding = tags; binding != null; binding = binding.next) {
                            if (binding.symbol.eql(tag)) {
                                code = binding.value;
                                break;
                            }
                        }
                        if (code != null) {
                            remaining = code;
                            thread.setStackDepth(depth);
                            continue;
                        }
                        throw (go);
                    }
                }
                remaining = remaining.cdr();
            }
            thread.clearValues();
            return NIL;
        }
    };

    // ### go
    private static final SpecialOperator GO = new SpecialOperator("go") {
        public LispObject execute(LispObject args, Environment env)
            throws LispError
        {
            if (args.length() != 1)
                throw new WrongNumberOfArgumentsException(this);
            throw new Go(args.car());
        }
    };

    // ### block
    private static final SpecialOperator BLOCK = new SpecialOperator("block") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args == NIL)
                throw new WrongNumberOfArgumentsException(this);
            LispObject tag;
            if (args.car() == NIL)
                tag = NIL;
            else
                tag = checkSymbol(args.car());
            LispObject body = args.cdr();
            Block block = new Block(tag, body);
            Environment ext = new Environment(env);
            ext.addBlock(tag, block);
            LispObject result = NIL;
            final LispThread thread = LispThread.currentThread();
            final int depth = thread.getStackDepth();
            try {
                while (body != NIL) {
                    result = eval(body.car(), ext, thread);
                    body = body.cdr();
                }
                return result;
            }
            catch (Return ret) {
                if (ret.getBlock() != null) {
                    if (ret.getBlock() == block) {
                        thread.setStackDepth(depth);
                        return ret.getResult();
                    } else
                        throw ret;
                }
                if (ret.getTag() == tag) {
                    thread.setStackDepth(depth);
                    return ret.getResult();
                }
                throw ret;
            }
        }
    };

    // ### return-from
    private static final SpecialOperator RETURN_FROM =
        new SpecialOperator("return-from") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final int length = args.length();
            if (length < 1 || length > 2)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args.car());
            Block block = env.lookupBlock(symbol);
            if (block == null) {
                StringBuffer sb = new StringBuffer("no block named ");
                sb.append(symbol.getName());
                sb.append(" is currently visible");
                throw new LispError(sb.toString());
            }
            LispObject result;
            if (length == 2)
                result = eval(args.cadr(), env, LispThread.currentThread());
            else
                result = NIL;
            throw new Return(symbol, block, result);
        }
    };

    // ### return
    // Should be a macro.
    private static final SpecialOperator RETURN =
        new SpecialOperator("return") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            switch (args.length()) {
                case 0:
                    throw new Return(NIL, NIL);
                case 1:
                    throw new Return(NIL,
                                     eval(args.car(), env,
                                          LispThread.currentThread()));
                default:
                    throw new WrongNumberOfArgumentsException(this);
            }
        }
    };

    // ### catch
    private static final SpecialOperator CATCH = new SpecialOperator("catch") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args.length() < 1)
                throw new WrongNumberOfArgumentsException(this);
            final LispThread thread = LispThread.currentThread();
            LispObject tag = eval(args.car(), env, thread);
            LispObject body = args.cdr();
            LispObject result = NIL;
            final int depth = thread.getStackDepth();
            try {
                while (body != NIL) {
                    result = eval(body.car(), env, thread);
                    body = body.cdr();
                }
                return result;
            }
            catch (Throw t) {
                if (t.getTag() == tag) {
                    thread.setStackDepth(depth);
                    return t.getResult();
                }
                throw t;
            }
            catch (Return ret) {
                throw ret;
            }
        }
    };

    // ### throw
    private static final SpecialOperator THROW = new SpecialOperator("throw") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args.length() < 2)
                throw new WrongNumberOfArgumentsException(this);
            final LispThread thread = LispThread.currentThread();
            LispObject tag = eval(args.car(), env, thread);
            LispObject result = eval(args.cadr(), env, thread);
            throw new Throw(tag, result);
        }
    };

    // ### unwind-protect
    private static final SpecialOperator UNWIND_PROTECT =
        new SpecialOperator("unwind-protect") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final LispThread thread = LispThread.currentThread();
            LispObject result;
            LispObject[] values;
            try {
                result = eval(args.car(), env, thread);
                values = thread.getValues();
            }
            finally {
                LispObject body = args.cdr();
                while (body != NIL) {
                    eval(body.car(), env, thread);
                    body = body.cdr();
                }
            }
            thread.setValues(values);
            return result;
        }
    };

    // ### function
    private static final SpecialOperator FUNCTION =
        new SpecialOperator("function") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            LispObject arg = args.car();
            if (arg instanceof Symbol) {
                LispObject functional = env.lookupFunctional(arg);
                if (functional instanceof Autoload) {
                    Autoload autoload = (Autoload) functional;
                    autoload.load();
                    functional = autoload.getSymbol().getSymbolFunction();
                }
                if (functional instanceof Function)
                    return functional;
                throw new UndefinedFunctionError(arg);
            }
            if (arg instanceof Cons) {
                if (arg.car() == Symbol.LAMBDA)
                    return new Closure(arg.cadr(), arg.cddr(), env);
            }
            throw new UndefinedFunctionError(String.valueOf(arg));
        }
    };

    // ### resolve
    // Force autoload to be resolved.
    private static final Primitive1 RESOLVE =
        new Primitive1("resolve", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws Condition
        {
            Symbol symbol = checkSymbol(arg);
            LispObject fun = symbol.getSymbolFunction();
            if (fun instanceof Autoload) {
                Autoload autoload = (Autoload) fun;
                autoload.load();
                return autoload.getSymbol().getSymbolFunction();
            }
            return fun;
        }
    };

    // ### setq
    private static final SpecialOperator SETQ = new SpecialOperator("setq") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            LispObject value = Symbol.NIL;
            final LispThread thread = LispThread.currentThread();
            while (args != NIL) {
                Symbol symbol = checkSymbol(args.car());
                args = args.cdr();
                value = eval(args.car(), env, thread);
                if (symbol.isSpecialVariable()) {
                    Environment dynEnv = thread.getDynamicEnvironment();
                    if (dynEnv != null) {
                        Binding binding = dynEnv.getBinding(symbol);
                        if (binding != null) {
                            binding.value = value;
                            args = args.cdr();
                            continue;
                        }
                    }
                    symbol.setSymbolValue(value);
                    args = args.cdr();
                    continue;
                }
                // Not special.
                Binding binding = env.getBinding(symbol);
                if (binding != null)
                    binding.value = value;
                else
                    symbol.setSymbolValue(value);
                args = args.cdr();
            }
            return value;
        }
    };

    // ### multiple-value-bind
    // multiple-value-bind (var*) values-form declaration* form*
    // Should be a macro.
    private static final SpecialOperator MULTIPLE_VALUE_BIND =
        new SpecialOperator("multiple-value-bind") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            LispObject vars = args.car();
            args = args.cdr();
            LispObject valuesForm = args.car();
            final LispThread thread = LispThread.currentThread();
            LispObject value = eval(valuesForm, env, thread);
            LispObject[] values = thread.getValues();
            if (values == null) {
                // eval() did not return multiple values.
                values = new LispObject[1];
                values[0] = value;
            }
            Environment oldDynEnv = thread.getDynamicEnvironment();
            Environment ext = new Environment(env);
            int i = 0;
            LispObject var = vars.car();
            while (var != NIL) {
                Symbol symbol = checkSymbol(var);
                if (i < values.length)
                    bind(symbol, values[i], ext);
                else
                    bind(symbol, NIL, ext);
                vars = vars.cdr();
                var = vars.car();
                ++i;
            }
            LispObject result = NIL;
            LispObject body = args.cdr();
            while (body != NIL) {
                result = eval(body.car(), ext, thread);
                body = body.cdr();
            }
            thread.setDynamicEnvironment(oldDynEnv);
            return result;
        }
    };

    // ### multiple-value-seq
    // multiple-value-setq vars form => result
    // Result is the primary value returned by the form.
    // Should be a macro.
    private static final SpecialOperator MULTIPLE_VALUE_SETQ =
        new SpecialOperator("multiple-value-setq") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args.length() != 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject vars = args.car();
            LispObject form = args.cadr();
            final LispThread thread = LispThread.currentThread();
            LispObject result = eval(form, env, thread);
            LispObject[] values = thread.getValues();
            if (values == null) {
                // eval() did not return multiple values.
                values = new LispObject[1];
                values[0] = result;
            }
            final Environment dynEnv = thread.getDynamicEnvironment();
            final int limit = values.length;
            int i = 0;
            while (vars != NIL) {
                Symbol symbol = checkSymbol(vars.car());
                LispObject value = i < limit ? values[i] : NIL;
                ++i;
                if (symbol.isSpecialVariable()) {
                    if (dynEnv != null) {
                        Binding binding = dynEnv.getBinding(symbol);
                        if (binding != null) {
                            binding.value = value;
                            vars = vars.cdr();
                            continue;
                        }
                    }
                    symbol.setSymbolValue(value);
                    vars = vars.cdr();
                    continue;
                }
                // Not special.
                Binding binding = env.getBinding(symbol);
                if (binding != null)
                    binding.value = value;
                else
                    symbol.setSymbolValue(value);
                vars = vars.cdr();
            }
            thread.clearValues();
            return result;
        }
    };

    // ### multiple-value-prog1
    private static final SpecialOperator MULTIPLE_VALUE_PROG1 =
        new SpecialOperator("multiple-value-prog1") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args.length() == 0)
                throw new WrongNumberOfArgumentsException(this);
            final LispThread thread = LispThread.currentThread();
            LispObject result = eval(args.car(), env, thread);
            LispObject[] values = thread.getValues();
            while ((args = args.cdr()) != NIL)
                eval(args.car(), env, thread);
            thread.setValues(values);
            return result;
        }
    };

    // ### multiple-value-call
    private static final SpecialOperator MULTIPLE_VALUE_CALL =
        new SpecialOperator("multiple-value-call") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args.length() == 0)
                throw new WrongNumberOfArgumentsException(this);
            final LispThread thread = LispThread.currentThread();
            LispObject function;
            LispObject obj = eval(args.car(), env, thread);
            args = args.cdr();
            if (obj instanceof Symbol) {
                function = obj.getSymbolFunction();
                if (function == null)
                    throw new UndefinedFunctionError(obj);
            } else if (obj instanceof Function) {
                function = obj;
            } else
                throw new LispError(String.valueOf(obj) + " is not a function name");
            ArrayList arrayList = new ArrayList();
            while (args != NIL) {
                LispObject form = args.car();
                LispObject result = eval(form, env, thread);
                LispObject[] values = thread.getValues();
                if (values != null) {
                    for (int i = 0; i < values.length; i++)
                        arrayList.add(values[i]);
                } else
                    arrayList.add(result);
                args = args.cdr();
            }
            LispObject[] argv = new LispObject[arrayList.size()];
            arrayList.toArray(argv);
            return funcall(function, argv, thread);
        }
    };

    // ### and
    // Should be a macro.
    private static final SpecialOperator AND = new SpecialOperator("and") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final LispThread thread = LispThread.currentThread();
            LispObject result = T;
            while (args != NIL) {
                result = eval(args.car(), env, thread);
                if (result == NIL) {
                    if (args.cdr() != NIL) {
                        // Not the last form.
                        thread.clearValues();
                    }
                    break;
                }
                args = args.cdr();
            }
            return result;
        }
    };

    // ### or
    // Should be a macro.
    private static final SpecialOperator OR = new SpecialOperator("or") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            final LispThread thread = LispThread.currentThread();
            LispObject result = NIL;
            while (args != NIL) {
                result = eval(args.car(), env, thread);
                if (result != NIL) {
                    if (args.cdr() != NIL) {
                        // Not the last form.
                        thread.clearValues();
                    }
                    break;
                }
                args = args.cdr();
            }
            return result;
        }
    };

    // ### assert
    // Should be a macro.
    private static final SpecialOperator ASSERT =
        new SpecialOperator("assert") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args.length() != 1)
                throw new WrongNumberOfArgumentsException(this);
            if (eval(args.car(), env, LispThread.currentThread()) == NIL)
                throw new LispError("assertion failed: " + args.car());
            return NIL;
        }
    };

    // ### write-char
    // write-char character &optional output-stream => character
    private static final Primitive WRITE_CHAR =
        new Primitive("write-char") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 1 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            char c = LispCharacter.getValue(args[0]);
            CharacterOutputStream out = null;
            if (args.length == 1)
                out = getStandardOutput();
            else {
                LispObject streamArg = args[1];
                if (streamArg instanceof CharacterOutputStream)
                    out = (CharacterOutputStream) streamArg;
                else if (streamArg == T || streamArg == NIL)
                    out = getStandardOutput();
                else
                    throw new TypeError(args[1],
                                        "character output stream");
            }
            out.writeChar(c);
            return args[0];
        }
    };

    // ### write-string
    // write-string string &optional output-stream &key start end => string
    private static final Primitive WRITE_STRING =
        new Primitive("write-string") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length == 0)
                throw new WrongNumberOfArgumentsException(this);
            LispString string = checkString(args[0]);
            CharacterOutputStream out = null;
            if (args.length == 1)
                out = getStandardOutput();
            else {
                LispObject streamArg = args[1];
                if (streamArg instanceof CharacterOutputStream)
                    out = (CharacterOutputStream) streamArg;
                else if (streamArg == T || streamArg == NIL)
                    out = getStandardOutput();
                else
                    throw new TypeError(args[1],
                        "character output stream");
            }
            out.writeString(string);
            return string;
        }
    };

    // ### finish-output
    // finish-output &optional output-stream => nil
    private static final Primitive FINISH_OUTPUT =
        new Primitive("finish-output") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length > 1)
                throw new WrongNumberOfArgumentsException(this);
            CharacterOutputStream out = null;
            if (args.length == 0)
                out = getStandardOutput();
            else {
                LispObject streamArg = args[0];
                if (streamArg instanceof CharacterOutputStream)
                    out = (CharacterOutputStream) streamArg;
                else if (streamArg instanceof TwoWayStream)
                    out = ((TwoWayStream)streamArg).getOutputStream();
                else if (streamArg == T || streamArg == NIL)
                    out = getStandardOutput();
                else
                    throw new TypeError(args[1], "character output stream");
            }
            out.finishOutput();
            return NIL;
        }
    };

    // ### close
    // close stream &key abort => result
    private static final Primitive CLOSE = new Primitive("close") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            final int length = args.length;
            if (length == 0)
                throw new WrongNumberOfArgumentsException(this);
            LispObject abort = NIL; // Default.
            LispStream stream = checkStream(args[0]);
            if (length > 1) {
                if ((length - 1) % 2 != 0)
                    throw new ProgramError("odd number of keyword arguments");
                if (length > 3)
                    throw new WrongNumberOfArgumentsException(this);
                if (args[1] == Keyword.ABORT)
                    abort = args[2];
                else
                    throw new LispError(
                        "CLOSE: unrecognized keyword argument: " + args[1]);
            }
            return stream.close(abort);
        }
    };

    // ### multiple-value-list
    // multiple-value-list form => list
    // Evaluates form and creates a list of the multiple values it returns.
    // Should be a macro.
    private static final SpecialOperator MULTIPLE_VALUE_LIST =
        new SpecialOperator("multiple-value-list") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args.length() != 1)
                throw new WrongNumberOfArgumentsException(this);
            final LispThread thread = LispThread.currentThread();
            LispObject result = eval(args.car(), env, thread);
            LispObject[] values = thread.getValues();
            thread.clearValues();
            if (values == null)
                return new Cons(result);
            LispObject list = NIL;
            for (int i = values.length; i-- > 0;)
                list = new Cons(values[i], list);
            return list;
        }
    };

    // ### nth-value
    // nth-value n form => object
    // Evaluates n and then form and returns the nth value returned by form, or
    // NIL if n >= number of values returned.
    // Should be a macro.
    private static final SpecialOperator NTH_VALUE =
        new SpecialOperator("nth-value") {
        public LispObject execute(LispObject args, Environment env)
            throws Condition
        {
            if (args.length() != 2)
                throw new WrongNumberOfArgumentsException(this);
            final LispThread thread = LispThread.currentThread();
            int n = Fixnum.getInt(eval(args.car(), env, thread));
            if (n < 0)
                n = 0;
            LispObject result = eval(args.cadr(), env, thread);
            LispObject[] values = thread.getValues();
            thread.clearValues();
            if (values == null) {
                // A single value was returned.
                return n == 0 ? result : NIL;
            }
            if (n < values.length)
                return values[n];
            return NIL;
        }
    };

    // ### write-byte
    // write-byte byte stream => byte
    private static final Primitive2 WRITE_BYTE =
        new Primitive2("write-byte") {
        public LispObject execute (LispObject first, LispObject second)
            throws LispError
        {
            int n = Fixnum.getValue(first);
            if (n < 0 || n > 255)
                throw new TypeError(first, "unsigned byte");
            if (second instanceof BinaryOutputStream) {
                ((BinaryOutputStream)second).writeByte(n);
                return first;
            }
            throw new TypeError(second, "binary output stream");
        }
    };

    // ### read-byte
    // read-byte stream &optional eof-error-p eof-value => byte
    private static final Primitive READ_BYTE =
        new Primitive("read-byte") {
        public LispObject execute (LispObject[] args) throws LispError
        {
            int length = args.length;
            if (length < 1 || length > 3)
                throw new WrongNumberOfArgumentsException(this);
            BinaryInputStream stream;
            if (args[0] instanceof BinaryInputStream)
                stream = (BinaryInputStream) args[0];
            else
                throw new TypeError(args[0], "binary input stream");
            boolean eofError = length > 1 ? (args[1] != NIL) : true;
            LispObject eofValue = length > 2 ? args[2] : NIL;
            return stream.readByte(eofError, eofValue);
        }
    };

    // ### read-line
    // read-line &optional input-stream eof-error-p eof-value recursive-p
    // => line, missing-newline-p
    private static final Primitive READ_LINE =
        new Primitive("read-line") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            int length = args.length;
            if (length > 4)
                throw new WrongNumberOfArgumentsException(this);
            CharacterInputStream stream;
            if (length == 0)
                stream = getStandardInput();
            else if (args[0] instanceof CharacterInputStream)
                stream = (CharacterInputStream) args[0];
            else if (args[0] instanceof TwoWayStream)
                stream = ((TwoWayStream)args[0]).getInputStream();
            else
                throw new TypeError(args[0], "input stream");
            boolean eofError = length > 1 ? (args[1] != NIL) : true;
            LispObject eofValue = length > 2 ? args[2] : NIL;
            boolean recursive = length > 3 ? (args[3] != NIL) : false;
            return stream.readLine(eofError, eofValue);
        }
    };

    // ### %read-from-string
    // read-from-string string &optional eof-error-p eof-value &key start end
    // preserve-whitespace => object, position
    private static final Primitive _READ_FROM_STRING =
        new Primitive("%read-from-string") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            if (args.length < 6)
                throw new WrongNumberOfArgumentsException(this);
            String s = LispString.getValue(args[0]);
            boolean eofError = args[1] != NIL;
            LispObject eofValue = args[2];
            LispObject start = args[3];
            LispObject end = args[4];
            boolean preserveWhitespace = args[5] != NIL;
            int startIndex, endIndex;
            if (start != NIL)
                startIndex = (int) Fixnum.getValue(start);
            else
                startIndex = 0;
            if (end != NIL)
                endIndex = (int) Fixnum.getValue(end);
            else
                endIndex = s.length();
            CharacterInputStream in =
                new CharacterInputStream(s.substring(startIndex, endIndex));
            LispObject result;
            if (preserveWhitespace)
                result = in.readPreservingWhitespace(eofError, eofValue, false);
            else
                result = in.read(eofError, eofValue, false);
            LispObject[] values = new LispObject[2];
            values[0] = result;
            values[1] = new Fixnum(startIndex + in.getOffset());
            LispThread.currentThread().setValues(values);
            return result;
        }
    };

    private static final Primitive1 STANDARD_CHAR_P =
        new Primitive1("standard-char-p") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return checkCharacter(arg).isStandardChar();
        }
    };

    private static final Primitive1 GRAPHIC_CHAR_P =
        new Primitive1("graphic-char-p") {
        public LispObject execute(LispObject arg) throws LispError
        {
            char c = LispCharacter.getValue(arg);
            return (c >= ' ' && c < 127) ? T : NIL;
        }
    };

    private static final Primitive1 ALPHA_CHAR_P =
        new Primitive1("alpha-char-p") {
        public LispObject execute(LispObject arg) throws LispError
        {
            char c = LispCharacter.getValue(arg);
            return Character.isLetter(c) ? T : NIL;
        }
    };

    private static final Primitive1 NAME_CHAR = new Primitive1("name-char") {
        public LispObject execute(LispObject arg) throws LispError
        {
            String s = LispString.getValue(string(arg));
            int n = nameToChar(s);
            return n >= 0 ? LispCharacter.getInstance((char)n) : NIL;
        }
    };

    private static final Primitive1 CHAR_NAME = new Primitive1("char-name") {
        public LispObject execute(LispObject arg) throws LispError
        {
            char c = LispCharacter.getValue(arg);
            String name = null;
            switch (c) {
                case ' ':
                    name = "Space";
                    break;
                case '\n':
                    name = "Newline";
                    break;
                case '\t':
                    name = "Tab";
                    break;
                case '\r':
                    name = "Return";
                    break;
                case '\f':
                    name = "Page";
                    break;
                default:
                    break;
            }
            return name != null ? new LispString(name) : NIL;
        }
    };

    private static final Primitive DIGIT_CHAR = new Primitive("digit-char") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            final long radix;
            switch (args.length) {
                case 1:
                    radix = 10;
                    break;
                case 2:
                    radix = Fixnum.getValue(args[1]);
                    break;
                default:
                    throw new WrongNumberOfArgumentsException(this);
            }
            long weight = Fixnum.getValue(args[0]);
            if (weight >= radix || weight >= 36)
                return NIL;
            if (weight < 10)
                return LispCharacter.getInstance((char)('0' + weight));
            return LispCharacter.getInstance((char)('A' + weight - 10));
        }
    };

    private static final Primitive1 _CALL_COUNT =
        new Primitive1("%call-count", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws LispError
        {
            return new Fixnum(arg.getCallCount());
        }
    };

    private static final Primitive2 _SET_CALL_COUNT =
        new Primitive2("%set-call-count", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            first.setCallCount(Fixnum.getValue(second));
            return second;
        }
    };

    // ### get-dispatch-macro-character
    // get-dispatch-macro-character disp-char sub-char &optional readtable
    // => function
    private static final Primitive GET_DISPATCH_MACRO_CHARACTER =
        new Primitive("get-dispatch-macro-character") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 2 || args.length > 3)
                throw new WrongNumberOfArgumentsException(this);
            char dispChar = LispCharacter.getValue(args[0]);
            char subChar = LispCharacter.getValue(args[1]);
            Readtable readtable;
            if (args.length == 3)
                readtable = checkReadtable(args[2]);
            else
                readtable = getCurrentReadtable();
            return readtable.getDispatchMacroCharacter(dispChar, subChar);
        }
    };

    // ### set-dispatch-macro-character
    // set-dispatch-macro-character disp-char sub-char new-function &optional readtable
    // => t
    private static final Primitive SET_DISPATCH_MACRO_CHARACTER =
        new Primitive("set-dispatch-macro-character") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length < 3 || args.length > 4)
                throw new WrongNumberOfArgumentsException(this);
            char dispChar = LispCharacter.getValue(args[0]);
            char subChar = LispCharacter.getValue(args[1]);
            LispObject function = args[2];
            Readtable readtable;
            if (args.length == 4)
                readtable = checkReadtable(args[3]);
            else
                readtable = getCurrentReadtable();
            return readtable.setDispatchMacroCharacter(dispChar, subChar, function);
        }
    };

    // read &optional input-stream eof-error-p eof-value recursive-p => object
    private static final Primitive READ = new Primitive("read") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            int length = args.length;
            if (length > 4)
                throw new WrongNumberOfArgumentsException(this);
            CharacterInputStream stream =
                length > 0 ? checkInputStream(args[0]) : getStandardInput();
            boolean eofError = length > 1 ? (args[1] != NIL) : true;
            LispObject eofValue = length > 2 ? args[2] : NIL;
            boolean recursive = length > 3 ? (args[3] != NIL) : false;
            return stream.read(eofError, eofValue, recursive);
        }
    };

    private static final Primitive2 _SET_LAMBDA_NAME =
        new Primitive2("%set-lambda-name", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            if (first instanceof Function) {
                Function f = (Function) first;
                f.setLambdaName(second);
                return second;
            } else
                throw new TypeError(first, "function");
        }
    };

    // Destructively alters the vector, changing its length to NEW-SIZE, which
    // must be less than or equal to its current length.
    // shrink-vector vector new-size => vector
    private static final Primitive2 SHRINK_VECTOR =
        new Primitive2("shrink-vector", PACKAGE_SYS, true) {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            checkVector(first).shrink(Fixnum.getInt(second));
            return first;
        }
    };

    private static final Primitive3 VECTOR_SUBSEQ =
        new Primitive3("vector-subseq", PACKAGE_SYS, true) {
        public LispObject execute(LispObject vector, LispObject start,
            LispObject end) throws LispError
        {
            AbstractVector v = checkVector(vector);
            return v.subseq(Fixnum.getValue(start),
                end == NIL ? v.length() : Fixnum.getValue(end));
        }
    };

    // ### random
    // random limit &optional random-state => random-number
    private static final Primitive RANDOM = new Primitive("random") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            int length = args.length;
            if (length < 1 || length > 2)
                throw new WrongNumberOfArgumentsException(this);
            Random random;
            if (length == 2)
                random = (Random) JavaObject.getObject(args[1]);
            else
                random = (Random) JavaObject.getObject(_RANDOM_STATE_.symbolValueNoThrow());
            if (args[0] instanceof Fixnum) {
                int limit = ((Fixnum)args[0]).getValue();
                int n = random.nextInt((int)limit);
                Debug.assertTrue(n < limit);
                return new Fixnum(n);
            }
            if (args[0] instanceof Bignum) {
                BigInteger limit = ((Bignum)args[0]).getValue();
                int bitLength = limit.bitLength();
                BigInteger rand = new BigInteger(bitLength + 1, random);
                BigInteger remainder = rand.remainder(limit);
                return new Bignum(remainder);
            }
            if (args[0] instanceof LispFloat) {
                float limit = ((LispFloat)args[0]).getValue();
                float rand = random.nextFloat();
                return new LispFloat(rand * limit);
            }
            throw new TypeError(args[0], "number");
        }
    };

    // ### make-random-state
    private static final Primitive MAKE_RANDOM_STATE =
        new Primitive("make-random-state") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            // FIXME Ignore arguments (or lack thereof).
            return new JavaObject(new Random());
        }
    };

    // ### truncate
    private static final Primitive TRUNCATE = new Primitive("truncate") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            final int length = args.length;
            if (length < 1 || length > 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject n = args[0];
            LispObject d = length == 1 ? Fixnum.ONE : args[1];
            if (n instanceof Fixnum)
                return ((Fixnum)n).truncate(d);
            if (n instanceof Bignum)
                return ((Bignum)n).truncate(d);
            if (n instanceof Ratio)
                return ((Ratio)n).truncate(d);
            if (n instanceof LispFloat)
                return ((LispFloat)n).truncate(d);
            throw new TypeError(n, "number");
        }
    };

    // ### ash
    // ash integer count => shifted-integer
    private static final Primitive2 ASH = new Primitive2("ash") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            BigInteger n;
            if (first instanceof Fixnum)
                n = BigInteger.valueOf(((Fixnum)first).getValue());
            else if (first instanceof Bignum)
                n = ((Bignum)first).getValue();
            else
                throw new TypeError(first, "integer");
            if (second instanceof Fixnum) {
                int count = Fixnum.getInt(second);
                if (count == 0)
                    return first;
                // BigInteger.shiftLeft() succumbs to a stack overflow if count
                // is Integer.MIN_VALUE, so...
                if (count == Integer.MIN_VALUE)
                    return n.signum() >= 0 ? Fixnum.ZERO : new Fixnum(-1);
                return number(n.shiftLeft(count));
            }
            if (second instanceof Bignum) {
                BigInteger count = ((Bignum)second).getValue();
                if (count.signum() > 0)
                    throw new LispError("can't represent result of left shift");
                if (count.signum() < 0)
                    return Fixnum.ZERO;
                Debug.bug(); // Shouldn't happen.
            }
            throw new TypeError(second, "integer");
        }
    };

    // ### expt
    // expt base-number power-number => result
    public static final Primitive2 EXPT = new Primitive2("expt") {
        public LispObject execute(LispObject n, LispObject power)
            throws LispError
        {
            if (power instanceof Fixnum) {
                LispObject result = null;
                if (n instanceof Fixnum || n instanceof Bignum)
                    result = new Fixnum(1);
                else
                    result = new LispFloat((float)1);
                int count = Fixnum.getInt(power);
                if (count > 0) {
                    for (int i = count; i-- > 0;)
                        result = result.multiplyBy(n);
                } else if (count < 0) {
                    for (int i = -count; i-- > 0;)
                        result = result.divideBy(n);
                }
                return result;
            }
            if (power instanceof LispFloat) {
                if (n instanceof Fixnum) {
                    double d = Math.pow(((Fixnum)n).getValue(),
                        ((LispFloat)power).getValue());
                    return new LispFloat(new Float(d).floatValue());
                }
            }
            throw new LispError("EXPT: unsupported case");
        }
    };

    // ### logand
    // logand &rest integers => result-integer
    private static final Primitive LOGAND = new Primitive("logand") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            BigInteger result = BigInteger.valueOf(-1);
            for (int i = 0; i < args.length; i++) {
                BigInteger n;
                if (args[i] instanceof Fixnum)
                    n = ((Fixnum)args[i]).getBigInteger();
                else if (args[i] instanceof Bignum)
                    n = ((Bignum)args[i]).getValue();
                else
                    throw new TypeError(args[i], "integer");
                result = result.and(n);
            }
            return number(result);
        }
    };

    // ### logior
    // logior &rest integers => result-integer
    private static final Primitive LOGIOR = new Primitive("logior") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            BigInteger result = BigInteger.ZERO;
            for (int i = 0; i < args.length; i++) {
                BigInteger n;
                if (args[i] instanceof Fixnum)
                    n = ((Fixnum)args[i]).getBigInteger();
                else if (args[i] instanceof Bignum)
                    n = ((Bignum)args[i]).getValue();
                else
                    throw new TypeError(args[i], "integer");
                result = result.or(n);
            }
            return number(result);
        }
    };

    // ### make-socket
    // make-socket host port => stream
    private static final Primitive2 MAKE_SOCKET = new Primitive2("make-socket") {
        public LispObject execute(LispObject first, LispObject second) throws LispError
        {
            String host = LispString.getValue(first);
            int port = Fixnum.getValue(second);
            try {
                Socket socket = new Socket(host, port);
                CharacterInputStream in =
                    new CharacterInputStream(socket.getInputStream());
                CharacterOutputStream out =
                    new CharacterOutputStream(socket.getOutputStream());
                return new TwoWayStream(in, out);
            }
            catch (Exception e) {
                throw new LispError(e.getMessage());
            }
        }
    };

    static {
        new Primitives();
    }

    // ### list
    private static final Primitive LIST = new Primitive("list") {
        public LispObject execute(LispObject arg) throws LispError
        {
            return new Cons(arg);
        }
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return new Cons(first, new Cons(second));
        }
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispError
        {
            return new Cons(first, new Cons(second, new Cons(third)));
        }
        public LispObject execute(LispObject[] args) throws LispError
        {
            LispObject result = NIL;
            for (int i = args.length; i-- > 0;)
                result = new Cons(args[i], result);
            return result;
        }
    };

    // ### list*
    private static final Primitive LIST_ = new Primitive("list*") {
        public LispObject execute() throws LispError
        {
            throw new WrongNumberOfArgumentsException("LIST*");
        }
        public LispObject execute(LispObject arg) throws LispError
        {
            return arg;
        }
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return new Cons(first, second);
        }
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third) throws LispError
        {
            return new Cons(first, new Cons(second, third));
        }
        public LispObject execute(LispObject[] args) throws LispError
        {
            int i = args.length - 1;
            LispObject result = args[i];
            while (i-- > 0)
                result = new Cons(args[i], result);
            return result;
        }
    };

    // ### nreverse
    private static final Primitive1 NREVERSE = new Primitive1("nreverse") {
        public LispObject execute (LispObject arg) throws LispError {
            if (arg instanceof AbstractVector) {
                ((AbstractVector)arg).nreverse();
                return arg;
            }
            LispObject list = checkList(arg);
            // Following code is from CLISP.
            if (list instanceof Cons) {
                LispObject list3 = list.cdr();
                if (list3 instanceof Cons) {
                    if (list3.cdr() instanceof Cons) {
                        LispObject list1 = list3;
                        LispObject list2 = NIL;
                        do {
                            LispObject h = list3.cdr();
                            list3.setCdr(list2);
                            list2 = list3;
                            list3 = h;
                        } while (list3.cdr() instanceof Cons);
                        list.setCdr(list2);
                        list1.setCdr(list3);
                    }
                    LispObject h = list.car();
                    list.setCar(list3.car());
                    list3.setCar(h);
                }
            }
            return list;
        }
    };

    // ### nreconc
    // From CLISP.
    private static final Primitive2 NRECONC = new Primitive2("nreconc") {
        public LispObject execute(LispObject list, LispObject obj)
            throws LispError
        {
            if (list instanceof Cons) {
                LispObject list3 = list.cdr();
                if (list3 instanceof Cons) {
                    if (list3.cdr() instanceof Cons) {
                        LispObject list1 = list3;
                        LispObject list2 = NIL;
                        do {
                            LispObject h = list3.cdr();
                            list3.setCdr(list2);
                            list2 = list3;
                            list3 = h;
                        } while (list3.cdr() instanceof Cons);
                        list.setCdr(list2);
                        list1.setCdr(list3);
                    }
                    LispObject h = list.car();
                    list.setCar(list3.car());
                    list3.setCar(h);
                    list3.setCdr(obj);
                } else {
                    list.setCdr(obj);
                }
                return list;
            } else
                return obj;
        }
    };

    // ### reverse
    private static final Primitive1 REVERSE = new Primitive1("reverse") {
        public LispObject execute(LispObject arg) throws LispError
        {
            if (arg instanceof AbstractVector)
                return ((AbstractVector)arg).reverse();
            if (arg instanceof Cons) {
                LispObject result = NIL;
                while (arg != NIL) {
                    result = new Cons(arg.car(), result);
                    arg = arg.cdr();
                }
                return result;
            }
            if (arg == NIL)
                return NIL;
            throw new TypeError(arg, "proper sequence");
        }
    };

    // ### %setelt
    // %setelt sequence index newval => newval
    private static final Primitive3 _SETELT = new Primitive3("%setelt") {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispError
        {
            if (first instanceof Cons) {
                int index = Fixnum.getValue(second);
                if (index < 0)
                    throw new TypeError();
                LispObject list = first;
                int i = 0;
                while (true) {
                    if (i == index) {
                        list.setCar(third);
                        return third;
                    }
                    list = list.cdr();
                    if (list == NIL)
                        throw new TypeError();
                    ++i;
                }
            } else if (first instanceof AbstractVector) {
                ((AbstractVector)first).set(Fixnum.getValue(second), third);
                return third;
            } else
                throw new TypeError(first, "sequence");
        }
    };

//     (defun maptree (fun x)
//       (if (atom x)
//           (funcall fun x)
//           (let ((a (funcall fun (car x)))
//                 (d (maptree fun (cdr x))))
//             (if (and (eql a (car x)) (eql d (cdr x)))
//                 x
//                 (cons a d)))))

    // ### maptree
    private static final Primitive2 MAPTREE = new Primitive2("maptree") {
        public LispObject execute(LispObject fun, LispObject x)
            throws Condition
        {
            if (x instanceof Cons) {
                LispObject a = fun.execute(x.car());
                // Recurse!
                LispObject d = execute(fun, x.cdr());
                if (a.eql(x.car()) && d.eql(x.cdr()))
                    return x;
                else
                    return new Cons(a, d);
            } else
                return fun.execute(x);
        }
    };

    // ### %make-list
    private static final Primitive2 _MAKE_LIST = new Primitive2("%make-list") {
        public LispObject execute(LispObject first, LispObject second)
            throws Condition
        {
            int size = Fixnum.getValue(first);
            if (size < 0)
                throw new TypeError("MAKE-LIST: " + size +
                    " is not a valid list length");
            LispObject result = NIL;
            for (int i = size; i-- > 0;)
                result = new Cons(second, result);
            return result;
        }
    };

    // memq item list &key key test test-not => tail
    private static final Primitive2 MEMQ = new Primitive2("memq") {
        public LispObject execute(LispObject item, LispObject list)
            throws LispError
        {
            LispObject tail = checkList(list);
            while (tail != NIL) {
                if (item == tail.car())
                    return tail;
                tail = tail.cdr();
            }
            return NIL;
        }
    };

    // %member item list key test test-not => tail
    private static final Primitive _MEMBER = new Primitive("%member") {
        public LispObject execute(LispObject[] args) throws Condition
        {
            if (args.length != 5)
                throw new WrongNumberOfArgumentsException(this);
            LispObject item = args[0];
            LispObject tail = checkList(args[1]);
            LispObject key = args[2];
            if (key != NIL) {
                if (key instanceof Symbol)
                    key = key.getSymbolFunction();
                if (!(key instanceof Function))
                    throw new UndefinedFunctionError(args[2]);
            }
            LispObject test = args[3];
            LispObject testNot = args[4];
            if (test != NIL && testNot != NIL)
                throw new LispError("MEMBER: test and test-not both supplied");
            if (test == NIL && testNot == NIL) {
                test = EQL;
            } else if (test != NIL) {
                if (test instanceof Symbol)
                    test = test.getSymbolFunction();
                if (!(test instanceof Function))
                    throw new UndefinedFunctionError(args[3]);
            } else if (testNot != NIL) {
                if (testNot instanceof Symbol)
                    testNot = testNot.getSymbolFunction();
                if (!(testNot instanceof Function))
                    throw new UndefinedFunctionError(args[3]);
            }
            if (key == NIL && test == EQL) {
                while (tail != NIL) {
                    if (item.eql(tail.car()))
                        return tail;
                    tail = tail.cdr();
                }
                return NIL;
            }
            while (tail != NIL) {
                LispObject candidate = tail.car();
                if (key != NIL)
                    candidate = key.execute(candidate);
                if (test != NIL) {
                    if (test.execute(item, candidate) == T)
                        return tail;
                } else if (testNot != NIL) {
                    if (testNot.execute(item, candidate) == NIL)
                        return tail;
                }
                tail = tail.cdr();
            }
            return NIL;
        }
    };

    // ### funcall-key
    // funcall-key function-or-nil element
    private static final Primitive2 FUNCALL_KEY = new Primitive2("funcall-key") {
        public LispObject execute(LispObject first, LispObject second)
            throws Condition
        {
            if (first != NIL)
                return funcall1(first, second, LispThread.currentThread());
            return second;
        }
    };

    // ### %compare-elements
    // %compare-elements test key elt1 elt2
    private static final Primitive _COMPARE_ELEMENTS =
        new Primitive("%compare-elements", PACKAGE_SYS, true) {
        public LispObject execute(LispObject args[]) throws Condition
        {
            if (args[1] == NIL) {
                // No key function.
                return funcall2(args[0], args[2], args[3],
                                LispThread.currentThread());
            }
            LispObject key = args[1];
            final LispThread thread = LispThread.currentThread();
            return funcall2(args[0],
                            funcall1(key, args[2], thread),
                            funcall1(key, args[3], thread),
                            thread);
        }
    };

    // ### coerce-to-function
    private static final Primitive1 COERCE_TO_FUNCTION =
        new Primitive1("coerce-to-function") {
        public LispObject execute(LispObject arg) throws Condition
        {
            return coerceToFunction(arg);
        }
    };

    // ### arglist
    private static final Primitive1 ARGLIST =
        new Primitive1("arglist", PACKAGE_SYS, false) {
        public LispObject execute(LispObject arg) throws Condition
        {
            Function function = coerceToFunction(arg);
            LispObject arglist = function.getArglist();
            LispObject[] values = new LispObject[2];
            if (arglist != null) {
                values[0] = arglist;
                values[1] = T;
            } else {
                values[0] = NIL;
                values[1] = NIL;
            }
            LispThread.currentThread().setValues(values);
            return values[0];
        }
    };

    private static final Primitive2 _SET_ARGLIST =
        new Primitive2("%set-arglist", PACKAGE_SYS, false) {
        public LispObject execute(LispObject first, LispObject second)
            throws Condition
        {
            coerceToFunction(first).setArglist(second);
            return second;
        }
    };

    // ### streamp
    private static final Primitive1 STREAMP = new Primitive1("streamp")
    {
        public LispObject execute(LispObject arg)
        {
            return arg instanceof LispStream ? T : NIL;
        }
    };

    // ### realp
    private static final Primitive1 REALP = new Primitive1("realp")
    {
        public LispObject execute(LispObject arg)
        {
            return (arg.getType() & TYPE_REAL) != 0 ? T : NIL;
        }
    };

    // ### rationalp
    private static final Primitive1 RATIONALP = new Primitive1("rationalp")
    {
        public LispObject execute(LispObject arg)
        {
            return (arg.getType() & TYPE_RATIONAL) != 0 ? T : NIL;
        }
    };

    // ### complexp
    private static final Primitive1 COMPLEXP = new Primitive1("complexp")
    {
        public LispObject execute(LispObject arg)
        {
            return arg instanceof Complex ? T : NIL;
        }
    };
}
