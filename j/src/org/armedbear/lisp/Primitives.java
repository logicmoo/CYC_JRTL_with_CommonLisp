/*
 * Primitives.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Primitives.java,v 1.19 2003-02-14 18:43:47 piso Exp $
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
import java.util.Iterator;

public final class Primitives extends Module
{
    private static final int ABS                        = 1;
    private static final int ADD                        = 2;
    private static final int ARRAYP                     = 3;
    private static final int ARRAY_HAS_FILL_POINTER_P   = 4;
    private static final int ATOM                       = 5;
    private static final int CADDR                      = 6;
    private static final int CADR                       = 7;
    private static final int CAR                        = 8;
    private static final int CDDR                       = 9;
    private static final int CDR                        = 10;
    private static final int CHAR                       = 11;
    private static final int CONS                       = 12;
    private static final int CONSP                      = 13;
    private static final int DIVIDE                     = 14;
    private static final int ELT                        = 15;
    private static final int ENDP                       = 16;
    private static final int EQ                         = 17;
    private static final int EQL                        = 18;
    private static final int EQUAL                      = 19;
    private static final int EVAL                       = 20;
    private static final int EXIT                       = 21;
    private static final int FBOUNDP                    = 22;
    private static final int FIRST                      = 23;
    private static final int FLET                       = 24;
    private static final int FMAKUNBOUND                = 25;
    private static final int FOURTH                     = 26;
    private static final int FUNCTIONP                  = 27;
    private static final int IF                         = 28;
    private static final int LABELS                     = 29;
    private static final int LAMBDA                     = 30;
    private static final int LAST                       = 31;
    private static final int LENGTH                     = 32;
    private static final int LET                        = 33;
    private static final int LETX                       = 34;
    private static final int LIST                       = 35;
    private static final int LISTP                      = 36;
    private static final int LISTX                      = 37;
    private static final int LIST_ALL_PACKAGES          = 38;
    private static final int MAKE_SYMBOL                = 39;
    private static final int MAKUNBOUND                 = 40;
    private static final int MEMBER                     = 41;
    private static final int MOD                        = 42;
    private static final int MULTIPLY                   = 43;
    private static final int NOT                        = 44;
    private static final int NULL                       = 45;
    private static final int NUMBERP                    = 46;
    private static final int PREDECESSOR                = 47;
    private static final int PROGN                      = 48;
    private static final int QUOTE                      = 49;
    private static final int REST                       = 50;
    private static final int ROOM                       = 51;
    private static final int RPLACA                     = 52;
    private static final int RPLACD                     = 53;
    private static final int SECOND                     = 54;
    private static final int SET                        = 55;
    private static final int SIMPLE_VECTOR_P            = 56;
    private static final int SPECIAL_OPERATOR_P         = 57;
    private static final int STRINGP                    = 58;
    private static final int STRING_EQUAL               = 59;
    private static final int STRING_EQUAL_IGNORE_CASE   = 60;
    private static final int SUBSEQ                     = 61;
    private static final int SUBTRACT                   = 62;
    private static final int SUCCESSOR                  = 63;
    private static final int SYMBOLP                    = 64;
    private static final int SYMBOL_FUNCTION            = 65;
    private static final int SYMBOL_NAME                = 66;
    private static final int SYMBOL_PACKAGE             = 67;
    private static final int SYMBOL_PLIST               = 68;
    private static final int SYMBOL_VALUE               = 69;
    private static final int THIRD                      = 70;
    private static final int VALUES                     = 71;
    private static final int VALUES_LIST                = 72;
    private static final int VECTORP                    = 73;
    private static final int ZEROP                      = 74;

    private Primitives()
    {
        defineSpecialOperator("if", IF);
        defineSpecialOperator("flet", FLET);
        defineSpecialOperator("labels", LABELS);
        defineSpecialOperator("lambda", LAMBDA);
        defineSpecialOperator("let", LET);
        defineSpecialOperator("let*", LETX);
        defineSpecialOperator("progn", PROGN);
        defineSpecialOperator("quote", QUOTE);

        definePrimitive("*", MULTIPLY);
        definePrimitive("+", ADD);
        definePrimitive("-", SUBTRACT);
        definePrimitive("/", DIVIDE);
        definePrimitive("exit", EXIT);
        definePrimitive("last", LAST);
        definePrimitive("list", LIST);
        definePrimitive("list*", LISTX);
        definePrimitive("list-all-packages", LIST_ALL_PACKAGES); // FIXME Primitive0
        definePrimitive("room", ROOM);
        definePrimitive("subseq", SUBSEQ);
        definePrimitive("values", VALUES);

        definePrimitive1("1+", SUCCESSOR);
        definePrimitive1("1-", PREDECESSOR);
        definePrimitive1("abs", ABS);
        definePrimitive1("array-has-fill-pointer-p", ARRAY_HAS_FILL_POINTER_P);
        definePrimitive1("arrayp", ARRAYP);
        definePrimitive1("atom", ATOM);
        definePrimitive1("caddr", CADDR);
        definePrimitive1("cadr", CADR);
        definePrimitive1("car", CAR);
        definePrimitive1("cddr", CDDR);
        definePrimitive1("cdr", CDR);
        definePrimitive1("consp", CONSP);
        definePrimitive1("endp", ENDP);
        definePrimitive1("eval", EVAL);
        definePrimitive1("fboundp", FBOUNDP);
        definePrimitive1("first", FIRST);
        definePrimitive1("fmakunbound", FMAKUNBOUND);
        definePrimitive1("fourth", FOURTH);
        definePrimitive1("functionp", FUNCTIONP);
        definePrimitive1("length", LENGTH);
        definePrimitive1("listp", LISTP);
        definePrimitive1("make-symbol", MAKE_SYMBOL);
        definePrimitive1("makunbound", MAKUNBOUND);
        definePrimitive1("not", NOT);
        definePrimitive1("null", NULL);
        definePrimitive1("numberp", NUMBERP);
        definePrimitive1("rest", REST);
        definePrimitive1("second", SECOND);
        definePrimitive1("simple-vector-p", SIMPLE_VECTOR_P);
        definePrimitive1("special-operator-p", SPECIAL_OPERATOR_P);
        definePrimitive1("stringp", STRINGP);
        definePrimitive1("symbol-function", SYMBOL_FUNCTION);
        definePrimitive1("symbol-name", SYMBOL_NAME);
        definePrimitive1("symbol-package", SYMBOL_PACKAGE);
        definePrimitive1("symbol-plist", SYMBOL_PLIST);
        definePrimitive1("symbol-value", SYMBOL_VALUE);
        definePrimitive1("symbolp", SYMBOLP);
        definePrimitive1("third", THIRD);
        definePrimitive1("values-list", VALUES_LIST);
        definePrimitive1("vectorp", VECTORP);
        definePrimitive1("zerop", ZEROP);

        definePrimitive2("char", CHAR);
        definePrimitive2("cons", CONS);
        definePrimitive2("elt", ELT);
        definePrimitive2("eq", EQ);
        definePrimitive2("eql", EQL);
        definePrimitive2("equal", EQUAL);
        definePrimitive2("member", MEMBER);
        definePrimitive2("mod", MOD);
        definePrimitive2("rplaca", RPLACA);
        definePrimitive2("rplacd", RPLACD);
        definePrimitive2("set", SET);
        definePrimitive2("string-equal", STRING_EQUAL_IGNORE_CASE);
        definePrimitive2("string=", STRING_EQUAL);
    }

    // SpecialOperator
    public LispObject dispatch(LispObject args, Environment env, int index)
        throws LispException
    {
        switch (index) {
            case IF:
                switch (args.length()) {
                    case 2: {
                        if (eval(args.car(), env) != NIL)
                            return eval(args.cadr(), env);
                        return NIL;
                    }
                    case 3: {
                        if (eval(args.car(), env) != NIL)
                            return eval(args.cadr(), env);
                        return eval(args.cdr().cadr(), env);
                    }
                    default:
                        throw new WrongNumberOfArgumentsException("IF");
                }
            case LAMBDA:                        // ### lambda
                // Should be a macro.
                return new Closure(args.car(), args.cdr(), env);
            case FLET:                          // ### flet
                return _flet(args, env, false);
            case LABELS:                        // ### labels
                return _flet(args, env, true);
            case LET:                           // ### let
                return _let(args, env, false);
            case LETX:                          // ### let*
                return _let(args, env, true);
            case PROGN:                         // ### progn
                return progn(args, env);
            case QUOTE:                         // ### quote
                return args.car();
            default:
                Debug.trace("bad index " + index);
                Debug.assertTrue(false);
                return NIL;
        }
    }

    // Primitive
    public LispObject dispatch(LispObject[] args, int index)
        throws LispException
    {
        switch (index) {
            case ADD: {                         // ### +
                long result = 0;
                final int length = args.length;
                for (int i = 0; i < length; i++)
                    result += Fixnum.getValue(args[i]);
                return new Fixnum(result);
            }
            case SUBTRACT:                      // ### -
                switch (args.length) {
                    case 0:
                        throw new WrongNumberOfArgumentsException("-");
                    case 1:
                        return new Fixnum(-Fixnum.getValue(args[0]));
                    case 2:
                        return new Fixnum(Fixnum.getValue(args[0]) -
                            Fixnum.getValue(args[1]));
                    default:
                        long result = Fixnum.getValue(args[0]);
                        for (int i = 1; i < args.length; i++)
                            result -= Fixnum.getValue(args[i]);
                        return new Fixnum(result);
                }
            case MULTIPLY: {                    // ### *
                long result = 1;
                for (int i = 0; i < args.length; i++)
                    result *= Fixnum.getValue(args[i]);
                return new Fixnum(result);
            }
            case DIVIDE: {                      // ### /
                if (args.length < 2)
                    throw new WrongNumberOfArgumentsException("/");
                long result = Fixnum.getValue(args[0]);
                for (int i = 1; i < args.length; i++)
                    result /= Fixnum.getValue(args[i]);
                return new Fixnum(result);
            }
            case LIST: {                        // ### list
                LispObject result = NIL;
                for (int i = args.length; i-- > 0;)
                    result = new Cons(args[i], result);
                return result;
            }
            case LISTX: {                       // ### list*
                if (args.length < 1)
                    throw new WrongNumberOfArgumentsException("LIST*");
                LispObject result = args[args.length-1];
                for (int i = args.length-1; i-- > 0;)
                    result = new Cons(args[i], result);
                return result;
            }
            case LAST: {                        // ### last
                long n;
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
            case SUBSEQ:
                return subseq(args);
            case VALUES:                        // ### values
                return values(args);
            case EXIT:                          // ### exit
                exit();
                return T;
            case ROOM:
                return room();
            case LIST_ALL_PACKAGES:
                return Packages.listAllPackages();
            default:
                Debug.trace("bad index " + index);
                Debug.assertTrue(false);
                return NIL;
        }
    }

    // Primitive1
    public LispObject dispatch(LispObject arg, int index)
        throws LispException
    {
        switch (index) {
            case CAR:                           // ### car
            case FIRST:                         // ### first
                return arg.car();
            case CADR:                          // ### cadr
            case SECOND:                        // ### second
                return arg.cadr();
            case CADDR:
            case THIRD:                         // ### third
                return arg.cdr().cdr().car();
            case FOURTH:                        // ### fourth
                return arg.cdr().cdr().cdr().car();
            case CDR:                           // ### cdr
            case REST:                          // ### rest
                return arg.cdr();
            case CDDR:                          // ### cddr
                return arg.cdr().cdr();
            case FUNCTIONP:                     // ### functionp
                // Argument must be a function.
                return arg instanceof Function ? T : NIL;
            case SPECIAL_OPERATOR_P:            // ### special-operator-p
                return arg.getSymbolFunction() instanceof SpecialOperator ? T : NIL;
            case ENDP:                          // ### endp
                if (arg == NIL)
                    return T;
                if (arg instanceof Cons)
                    return NIL;
                throw new WrongTypeException(arg, "list");
            case NOT:                           // ### not
            case NULL:                          // ### null
                return arg == NIL ? T : NIL;
            case NUMBERP:                       // ### numberp
                return arg instanceof Fixnum ? T : NIL;
            case SYMBOLP:                       // ### symbolp
                return (arg instanceof Symbol || arg == T || arg == NIL) ? T : NIL;
            case LENGTH:                        // ### length
                return new Fixnum(arg.length());
            case ATOM:                          // ### atom
                return arg instanceof Cons ? NIL : T;
            case CONSP:                         // ### consp
                return arg instanceof Cons ? T : NIL;
            case LISTP:                         // ### listp
                return (arg instanceof Cons || arg == NIL) ? T : NIL;
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
                return new LispString(checkSymbol(arg).getName());
            case SYMBOL_PACKAGE:                // ### symbol-package
                return checkSymbol(arg).getPackage();
            case SYMBOL_VALUE:                  // ### symbol-value
                return checkSymbol(arg).symbolValue();
            case SYMBOL_FUNCTION: {             // ### symbol-function
                LispObject function = arg.getSymbolFunction();
                if (function != null)
                    return function;
                throw new LispException(String.valueOf(arg).concat(
                    " has no global function definition"));
            }
            case SYMBOL_PLIST:                  // ### symbol-plist
                return Symbol.getPropertyList(arg);
            case ABS:                           // ### abs
                return new Fixnum(Math.abs(Fixnum.getValue(arg)));
            case ARRAYP:                        // ### arrayp
                return arg instanceof ArrayType ? T : NIL;
            case ARRAY_HAS_FILL_POINTER_P:      // ### array-has-fill-pointer-p
                return checkVector(arg).getFillPointer() >= 0 ? T : NIL;
            case VECTORP:                       // ### vectorp
                return arg instanceof VectorType ? T : NIL;
            case SIMPLE_VECTOR_P:               // ### simple-vector-p
                // FIXME
                return arg instanceof Vector ? T : NIL;
            case STRINGP:                       // ### stringp
                return arg instanceof LispString ? T : NIL;
            case ZEROP:                         // ### zerop
                return Fixnum.getValue(arg) == 0 ? T : NIL;
            case SUCCESSOR:                     // ### 1+
                return new Fixnum(Fixnum.getValue(arg) + 1);
            case PREDECESSOR:                   // ### 1-
                return new Fixnum(Fixnum.getValue(arg) - 1);
            case VALUES_LIST:                   // ### values-list
                return values(arg.copyToArray());
            case EVAL:                          // ### eval
                return eval(arg, new Environment());
            default:
                Debug.trace("bad index " + index);
                Debug.assertTrue(false);
                return NIL;
        }
    }

    // Primitive2
    public LispObject dispatch(LispObject first, LispObject second, int index)
        throws LispException
    {
        switch (index) {
            case CONS:                          // ### cons
                return new Cons(first, second);
            case ELT:                           // ### elt
                return first.elt(Fixnum.getValue(second));
            case EQ:                            // ### eq
                return first == second ? T : NIL;
            case EQL:                           // ### eql
                return eql(first, second) ? T : NIL;
            case EQUAL:                         // ### equal
                return equal(first, second) ? T : NIL;
            case STRING_EQUAL:                  // ### string=
                // Case sensitive.
                return LispString.equals(first, second);
            case STRING_EQUAL_IGNORE_CASE:      // ### string-equal
                return LispString.equalsIgnoreCase(first, second);
            case CHAR:                          // ### char
                try {
                    String s = LispString.getValue(first);
                    char c = s.charAt((int)Fixnum.getValue(second));
                    return new LispCharacter(c);
                }
                catch (StringIndexOutOfBoundsException e) {
                    throw new LispException("string index out of bounds");
                }
            case MEMBER: {                      // ### member
                // member item list &key key test test-not => tail
                // FIXME Support keyword arguments!
                LispObject rest = checkList(second);
                while (rest != NIL) {
                    if (eql(first, rest.car()))
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
            case SET:                           // ### set
                checkSymbol(first).setSymbolValue(second);
                return second;
            default:
                Debug.trace("bad index " + index);
                Debug.assertTrue(false);
                return NIL;
        }
    }

    private static final LispObject values(LispObject[] args)
    {
        if (args.length == 1) {
            setValues(null);
            return args[0];
        }
        setValues(args);
        return args.length > 0 ? args[0] : NIL;
    }

    // ### princ
    private static final Primitive1 PRINC = new Primitive1("princ") {
        public LispObject execute(LispObject arg) throws LispException
        {
            CharacterOutputStream out =
                getStandardOutput();
            if (out != null)
                out.princ(arg);
            return arg;
        }
    };

    // ### prin1
    private static final Primitive1 PRIN1 = new Primitive1("prin1") {
        public LispObject execute(LispObject arg) throws LispException
        {
            CharacterOutputStream out =
                getStandardOutput();
            if (out != null)
                out.prin1(arg);
            return arg;
        }
    };

    // ### print
    // PRINT is just like PRIN1 except that the printed representation of
    // object is preceded by a newline and followed by a space.
    private static final Primitive1 PRINT = new Primitive1("print") {
        public LispObject execute(LispObject arg) throws LispException
        {
            CharacterOutputStream out =
                getStandardOutput();
            if (out != null) {
                out.terpri();
                out.prin1(arg);
                out.writeString(" ");
            }
            return arg;
        }
    };

    // ### fresh-line
    private static final Primitive FRESH_LINE = new Primitive("fresh-line") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length > 1)
                throw new WrongNumberOfArgumentsException(this);
            CharacterOutputStream out = null;
            if (args.length == 1) {
                if (args[0] instanceof CharacterOutputStream)
                    out = (CharacterOutputStream) args[0];
                else
                    throw new WrongTypeException(args[0], "output stream");
            }
            if (out == null)
                out = getStandardOutput();
            return out.freshLine();
        }
    };

    // ### boundp
    private static final Primitive1 BOUNDP = new Primitive1("boundp") {
        public LispObject execute(LispObject obj) throws LispException
        {
            Symbol symbol = checkSymbol(obj);
            if (dynEnv != null && dynEnv.lookup(symbol) != null)
                return T;
            return symbol.getSymbolValue() != null ? T : NIL;
        }
    };

    // ### append
    private static final Primitive APPEND = new Primitive("append") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            switch (args.length) {
                case 0:
                    return NIL;
                case 1:
                    return args[0];
                default: {
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
            }
        }
    };

    // ### nconc
    private static final Primitive NCONC = new Primitive("nconc") {
        public LispObject execute(LispObject[] array) throws LispException
        {
            switch (array.length) {
                case 0:
                    return NIL;
                case 1:
                    return array[0];
                default: {
                    Cons result = null;
                    Cons splice = null;
                    final int limit = array.length - 1;
                    int i;
                    for (i = 0; i < limit; i++) {
                        LispObject top = array[i];
                        if (top == NIL)
                            continue;
                        if (splice != null) {
                            splice.setCdr(top);
                            splice = checkCons(top);
                        }
                        while (top != NIL) {
                            if (result == null) {
                                result = checkCons(top);
                                splice = result;
                            } else {
                                splice = checkCons(top);
                            }
                            top = top.cdr();
                        }
                    }
                    if (result == null)
                        return array[i];
                    splice.setCdr(array[i]);
                    return result;
                }
            }
        }
    };

    private static final Primitive1 REVERSE = new Primitive1("reverse") {
        public LispObject execute(LispObject obj) throws LispException
        {
            if (obj == NIL)
                return NIL;
            if (obj instanceof Cons) {
                final int length = obj.length();
                LispObject[] array = new LispObject[length];
                for (int i = 0; i < length; i++) {
                    array[i] = obj.car();
                    obj = obj.cdr();
                }
                LispObject result = NIL;
                for (int i = 0; i < length; i++)
                    result = new Cons(array[i], result);
                return result;
            }
            throw new LispException();
        }
    };

    private static final Primitive3 SUBST = new Primitive3("subst") {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispException
        {
            return _subst(first, second, third);
        }
    };

    private static LispObject _subst(LispObject n, LispObject o, LispObject expr)
        throws LispException
    {
        if (expr == NIL)
            return NIL;
        if (expr instanceof Cons) {
            LispObject[] array = expr.copyToArray();
            final int length = array.length;
            for (int i = 0; i < length; i++) {
                LispObject obj = array[i];
                if (obj == NIL)
                    array[i] = NIL;
                else if (obj instanceof Cons)
                    array[i] = _subst(n, o, obj);
                else if (eql(obj, o))
                    array[i] = n;
            }
            LispObject result = (o == NIL) ? n : NIL;
            for (int i = length; i-- > 0;)
                result = new Cons(array[i], result);
            return result;
        }
        throw new LispException();
    }

    // Numeric equality.
    private static final Primitive EQUALS = new Primitive("=") {
        public LispObject execute(LispObject[] array) throws LispException
        {
            final int length = array.length;
            if (length == 2)
                return Fixnum.getValue(array[0]) == Fixnum.getValue(array[1]) ? T : NIL;
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            long[] values = new long[length];
            // Make sure the arguments are all numbers.
            for (int i = 0; i < length; i++)
                values[i] = Fixnum.getValue(array[i]);
            final long value = values[0];
            for (int i = 1; i < length; i++) {
                if (values[i] != value)
                    return NIL;
            }
            return T;
        }
    };

    // Returns true if no two numbers are the same; otherwise returns false.
    private static final Primitive NOT_EQUALS = new Primitive("/=") {
        public LispObject execute(LispObject[] array) throws LispException
        {
            final int length = array.length;
            if (length == 2)
                return Fixnum.getValue(array[0]) != Fixnum.getValue(array[1]) ? T : NIL;
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            long[] values = new long[length];
            // Make sure the arguments are all numbers.
            for (int i = 0; i < length; i++)
                values[i] = Fixnum.getValue(array[i]);
            for (int i = 0; i < length; i++) {
                final long value = values[i];
                for (int j = i+1; j < length; j++) {
                    if (values[j] == value)
                        return NIL;
                }
            }
            return T;
        }
    };

    // ### <
    // Numeric comparison.
    private static final Primitive LESS_THAN = new Primitive("<") {
        public LispObject execute(LispObject[] array) throws LispException
        {
            final int length = array.length;
            if (length == 2)
                return Fixnum.getValue(array[0]) < Fixnum.getValue(array[1]) ? T : NIL;
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            long[] values = new long[length];
            // Make sure the arguments are all numbers.
            for (int i = 0; i < length; i++)
                values[i] = Fixnum.getValue(array[i]);
            for (int i = 1; i < length; i++) {
                if (values[i] <= values[i-1])
                    return NIL;
            }
            return T;
        }
    };

    // ### <=
    private static final Primitive LE = new Primitive("<=") {
        public LispObject execute(LispObject[] array) throws LispException
        {
            switch (array.length) {
                case 0:
                    throw new WrongNumberOfArgumentsException(this);
                case 1:
                    return T;
                case 2:
                    return Fixnum.getValue(array[0]) <= Fixnum.getValue(array[1]) ? T : NIL;
                default: {
                    final int length = array.length;
                    long[] values = new long[length];
                    // Make sure all of the arguments are numbers.
                    for (int i = 0; i < length; i++)
                        values[i] = Fixnum.getValue(array[i]);
                    for (int i = 1; i < length; i++) {
                        if (values[i] < values[i-1])
                            return NIL;
                    }
                    return T;
                }
            }
        }
    };

    // ### >
    private static final Primitive GREATER_THAN = new Primitive(">") {
        public LispObject execute(LispObject[] array) throws LispException
        {
            final int length = array.length;
            if (length == 2)
                return Fixnum.getValue(array[0]) > Fixnum.getValue(array[1]) ? T : NIL;
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            long[] values = new long[length];
            // Make sure all of the arguments are numbers.
            for (int i = 0; i < length; i++)
                values[i] = Fixnum.getValue(array[i]);
            for (int i = 1; i < length; i++) {
                if (values[i] >= values[i-1])
                    return NIL;
            }
            return T;
        }
    };

    // ### >=
    private static final Primitive GE = new Primitive(">=") {
        public LispObject execute(LispObject[] array) throws LispException
        {
            final int length = array.length;
            switch (length) {
                case 0:
                    throw new WrongNumberOfArgumentsException(this);
                case 1:
                    return T;
                case 2:
                    return Fixnum.getValue(array[0]) >= Fixnum.getValue(array[1]) ? T : NIL;
                default:
                    long[] values = new long[length];
                    // Make sure all of the arguments are numbers.
                    for (int i = 0; i < length; i++)
                        values[i] = Fixnum.getValue(array[i]);
                    for (int i = 1; i < length; i++) {
                        if (values[i] > values[i-1])
                            return NIL;
                    }
                    return T;
            }
        }
    };

    // ### assoc
    // assoc item alist &key key test test-not => entry
    // FIXME Support keyword arguments!
    private static final Primitive ASSOC = new Primitive("assoc") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length != 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject item = args[0];
            LispObject alist = args[1];
            while (alist != NIL) {
                LispObject cons = alist.car();
                if (cons instanceof Cons) {
                    if (eql(cons.car(), item))
                        return cons;
                } else if (cons != NIL)
                    throw new WrongTypeException(cons, "list");
                alist = alist.cdr();
            }
            return NIL;
        }
    };

    // ### get
    // get symbol indicator &optional default => value
    private static final Primitive GET = new Primitive("get") {
        public LispObject execute(LispObject[] args) throws LispException
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
            LispObject list = checkList(symbol.getPropertyList());
            while (list != NIL) {
                LispObject obj = list.car();
                if (eql(obj, indicator))
                    return list.cadr();
                list = list.cdr().cdr();
            }
            return defaultValue;
        }
    };

    // ### nth
    private static final Primitive2 NTH = new Primitive2("nth") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispException
        {
            long index = Fixnum.getValue(first);
            if (index < 0)
                throw new LispException("bad index to NTH: " + index);
            long i = 0;
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

    // ### nthcdr
    private static final Primitive2 NTHCDR = new Primitive2("nthcdr") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispException
        {
            long index = Fixnum.getValue(first);
            if (index < 0)
                throw new LispException("bad index to NTHCDR: " + index);
            long i = 0;
            while (true) {
                if (i == index)
                    return second;
                second = second.cdr();
                if (second == NIL)
                    return NIL;
                ++i;
            }
        }
    };

    // ### error
    private static final Primitive ERROR = new Primitive("error") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length < 1)
                throw new WrongNumberOfArgumentsException(this);
            throw new LispException(_format(args));
        }
    };

    // ### format
    private static final Primitive FORMAT = new Primitive("format") {
        public LispObject execute(LispObject[] args) throws LispException
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
            // Destination can also be stream or string with fill pointer.
            throw new LispException("FORMAT: not implemented");
        }
    };

    private static final String _format(LispObject[] args) throws LispException
    {
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
                        String s;
                        if (obj instanceof LispString)
                            s = ((LispString)obj).getValue();
                        else if (obj instanceof Symbol)
                            s = ((Symbol)obj).getName();
                        else
                            s = String.valueOf(obj);
                        sb.append(s);
                    }
                } else if (c == 'S' || c == 's') {
                    if (j < args.length) {
                        LispObject obj = args[j++];
                        String s;
                        if (obj instanceof LispString)
                            s = ((LispString)obj).getValue();
                        else if (obj instanceof Symbol)
                            s = ((Symbol)obj).getName();
                        else
                            s = String.valueOf(obj);
                        sb.append(s);
                    }
                } else if (c == '%') {
                    sb.append(System.getProperty("line.separator"));
                } else
                    throw new LispException("FORMAT: not implemented");
                state = NEUTRAL;
            } else {
                // There are no other valid states.
                Debug.assertTrue(false);
            }
        }
        return sb.toString();
    }

    // ### defun
    // Should be a macro.
    private static final SpecialOperator DEFUN = new SpecialOperator("defun") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            Symbol symbol = checkSymbol(args.car());
            LispObject rest = args.cdr();
            LispObject parameters = rest.car();
            LispObject body = rest.cdr();
            body = new Cons(symbol, body);
            body = new Cons(Symbol.BLOCK, body);
            body = new Cons(body, NIL);
            symbol.setSymbolFunction(new Closure(symbol.getName(), parameters,
                body, env));
            // INTERN returns multiple values, but DEFUN does not.
            setValues(null);
            return symbol;
        }
    };

    // ### defmacro
    private static final SpecialOperator DEFMACRO =
        new SpecialOperator("defmacro") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            Symbol symbol = checkSymbol(args.car());
            LispObject rest = args.cdr();
            LispObject parameters = rest.car();
            LispObject body = rest.cdr();
            body = new Cons(symbol, body);
            body = new Cons(Symbol.BLOCK, body);
            body = new Cons(body, NIL);
            symbol.setSymbolFunction(new Macro(parameters, body, env));
            setValues(null);
            return symbol;
        }
    };

    // ### defparameter
    // defparameter name initial-value [documentation]
    private static final SpecialOperator DEFPARAMETER =
        new SpecialOperator("defparameter") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            final int length = args.length();
            if (length < 2 || length > 3)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args.car());
            LispObject initialValue = eval(args.cadr(), env);
            symbol.setSymbolValue(initialValue);
            symbol.setSpecial(true);
            setValues(null);
            return symbol;
        }
    };

    // ### defvar
    private static final SpecialOperator DEFVAR = new SpecialOperator("defvar") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            final int length = args.length();
            if (length < 1 || length > 3)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args.car());
            LispObject rest = args.cdr();
            if (rest != NIL) {
                LispObject initialValue = eval(rest.car(), env);
                if (symbol.getSymbolValue() == null)
                    symbol.setSymbolValue(initialValue);
            }
            symbol.setSpecial(true);
            setValues(null);
            return symbol;
        }
    };

    // ### defconstant
    private static final SpecialOperator DEFCONSTANT =
        new SpecialOperator("defconstant") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            if (args.length() != 2)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args.car());
            symbol.setSymbolValue(eval(args.cadr(), env));
            symbol.setConstant(true);
            setValues(null);
            return symbol;
        }
    };

    // ### when
    private static final SpecialOperator WHEN = new SpecialOperator("when") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            switch (args.length()) {
                case 0:
                    throw new WrongNumberOfArgumentsException(this);
                case 1:
                    return NIL;
                case 2: {
                    LispObject result = eval(args.car(), env);
                    if (result != NIL)
                        return eval(args.cadr(), env);
                    return NIL;
                }
                default: {
                    LispObject result = eval(args.car(), env);
                    if (result != NIL)
                        return progn(args.cdr(), env);
                    return NIL;
                }
            }
        }
    };

    // ### unless
    private static final SpecialOperator UNLESS =
        new SpecialOperator("unless") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            switch (args.length()) {
                case 0:
                    throw new WrongNumberOfArgumentsException(this);
                case 1:
                    return NIL;
                case 2: {
                    LispObject result = eval(args.car(), env);
                    if (result == NIL)
                        return eval(args.cadr(), env);
                    return NIL;
                }
                default: {
                    LispObject result = eval(args.car(), env);
                    if (result == NIL)
                        return progn(args.cdr(), env);
                    return NIL;
                }
            }
        }
    };

    // ### cond
    private static final SpecialOperator COND = new SpecialOperator("cond") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            LispObject result = NIL;
            while (args != NIL) {
                LispObject clause = args.car();
                result = eval(clause.car(), env);
                if (result != NIL) {
                    if (clause.cdr() != NIL)
                        result = progn(clause.cdr(), env);
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
            throws LispException
        {
            LispObject key = eval(args.car(), env);
            args = args.cdr();
            while (args != NIL) {
                LispObject clause = args.car();
                LispObject keys = clause.car();
                boolean match = false;
                if (keys instanceof Cons) {
                    while (keys != NIL) {
                        LispObject candidate = keys.car();
                        if (eql(key, candidate)) {
                            match = true;
                            break;
                        }
                        keys = keys.cdr();
                    }
                } else {
                    LispObject candidate = keys;
                    if (candidate == T || candidate == Symbol.OTHERWISE)
                        match = true;
                    else if (eql(key, candidate))
                        match = true;
                }
                if (match) {
                    return progn(clause.cdr(), env);
                }
                args = args.cdr();
            }
            return NIL;
        }
    };

    // ### do
    private static final SpecialOperator DO = new SpecialOperator("do") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            // Process variable specifications:
            LispObject first = args.car();
            args = args.cdr();
            int length = first.length();
            Symbol[] variables = new Symbol[length];
            LispObject[] initials = new LispObject[length];
            LispObject[] updates = new LispObject[length];
            for (int i = 0; i < length; i++) {
                LispObject obj = first.car();
                variables[i] = checkSymbol(obj.car());
                initials[i] = obj.cadr();
                updates[i] = obj.cdr().cdr().car();
                first = first.cdr();
            }
            // Initialize variables in parallel.
            Environment oldDynEnv = dynEnv;
            dynEnv = new Environment(dynEnv);
            Environment extended = new Environment(env);
            for (int i = 0; i < length; i++) {
                Symbol symbol = variables[i];
                LispObject value = eval(initials[i], env);
                bind(symbol, value, extended);
            }
            LispObject second = args.car();
            LispObject test = second.car();
            LispObject resultForms = second.cdr();
            LispObject body = args.cdr();
            int depth = stack.size();
            try {
                // Implicit block.
                while (true) {
                    // Execute body.
                    // Test for termination.
                    if (eval(test, extended) != NIL)
                        break;
                    progn(body, extended);
                    // Update variables.
                    // Evaluate step forms.
                    LispObject results[] = new LispObject[length];
                    for (int i = 0; i < length; i++) {
                        LispObject update = updates[i];
                        LispObject result = eval(update, extended);
                        results[i] = result;
                    }
                    // Update variables.
                    for (int i = 0; i < length; i++) {
                        Symbol symbol = variables[i];
                        rebind(symbol, results[i], extended);
                    }
                }
                LispObject result = progn(resultForms, extended);
                return result;
            }
            catch (Return ret) {
                if (ret.getName() == NIL) {
                    stack.setSize(depth);
                    return ret.getResult();
                }
                throw ret;
            }
            finally {
                dynEnv = oldDynEnv;
            }
        }
    };

    // ### dolist
    private static final SpecialOperator DOLIST = new SpecialOperator("dolist") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            Block block = new Block(NIL, args.cdr());
            args = args.car();
            Symbol var = checkSymbol(args.car());
            LispObject listForm = args.cadr();
            LispObject list = checkList(eval(listForm, env));
            LispObject resultForm = args.cdr().cdr().car();
            Environment oldDynEnv = dynEnv;
            while (list != NIL) {
                Environment ext = new Environment(env);
                bind(var, list.car(), ext);
                LispObject body = block.getBody();
                int depth = stack.size();
                try {
                    while (body != NIL) {
                        LispObject result = eval(body.car(), ext);
                        body = body.cdr();
                    }
                }
                catch (Return ret) {
                    if (ret.getName() == NIL) {
                        stack.setSize(depth);
                        return ret.getResult();
                    }
                    throw ret;
                }
                list = list.cdr();
            }
            Environment ext = new Environment(env);
            bind(var, NIL, ext);
            LispObject result = eval(resultForm, ext);
            dynEnv = oldDynEnv;
            return result;
        }
    };

    // ### dotimes
    private static final SpecialOperator DOTIMES =
        new SpecialOperator("dotimes") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            Block block = new Block(NIL, args.cdr());
            args = args.car();
            Symbol var = checkSymbol(args.car());
            LispObject countForm = args.cadr();
            long count = Fixnum.getValue(eval(countForm, env));
            LispObject resultForm = args.cdr().cdr().car();
            Environment oldDynEnv = dynEnv;
            long i;
            for (i = 0; i < count; i++) {
                Environment ext = new Environment(env);
                bind(var, new Fixnum(i), ext);
                LispObject body = block.getBody();
                int depth = stack.size();
                try {
                    while (body != NIL) {
                        LispObject result = eval(body.car(), ext);
                        body = body.cdr();
                    }
                }
                catch (Return ret) {
                    if (ret.getName() == NIL) {
                        stack.setSize(depth);
                        return ret.getResult();
                    }
                    throw ret;
                }
            }
            Environment ext = new Environment(env);
            bind(var, new Fixnum(i), ext);
            LispObject result = eval(resultForm, ext);
            dynEnv = oldDynEnv;
            return result;
        }
    };

    // ### do-external-symbols
    // do-external-symbols (var [package [result-form]]) declaration* {tag | statement}*
    // => result*
    // Should be a macro.
    private static final SpecialOperator DO_EXTERNAL_SYMBOLS =
        new SpecialOperator("do-external-symbols") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            Block block = new Block(NIL, args.cdr());
            args = args.car();
            Symbol var = checkSymbol(args.car());
            args = args.cdr();
            // Defaults.
            Package pkg = getCurrentPackage();
            LispObject resultForm = NIL;
            if (args != NIL) {
                pkg = coerceToPackage(eval(args.car(), env));
                args = args.cdr();
                if (args != NIL)
                    resultForm = args.car();
            }
            Environment oldDynEnv = dynEnv;
            for (Iterator it = pkg.iterator(); it.hasNext();) {
                Symbol symbol = (Symbol) it.next();
                if (!symbol.isExternal())
                    continue;
                Environment ext = new Environment(env);
                bind(var, symbol, ext);
                LispObject body = block.getBody();
                int depth = stack.size();
                try {
                    while (body != NIL) {
                        LispObject result = eval(body.car(), ext);
                        body = body.cdr();
                    }
                }
                catch (Return ret) {
                    if (ret.getName() == NIL) {
                        stack.setSize(depth);
                        return ret.getResult();
                    }
                    throw ret;
                }
            }
            Environment ext = new Environment(env);
            bind(var, NIL, ext);
            LispObject result = eval(resultForm, ext);
            dynEnv = oldDynEnv;
            return result;
        }
    };

    // ### handler-bind
    private static final SpecialOperator HANDLER_BIND =
        new SpecialOperator("handler-bind") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            LispObject bindings = checkList(args.car());
            LispObject forms = args.cdr();
            try {
                return progn(args.cdr(), env);
            }
            catch (LispException e) {
                while (bindings != NIL) {
                    Cons binding = checkCons(bindings.car());
                    LispObject type = binding.car();
                    if (isConditionOfType(e, type)) {
                        LispObject handler = eval(binding.cadr(), env);
                        LispObject[] handlerArgs = new LispObject[1];
                        handlerArgs[0] = new JavaObject(e);
                        funcall(handler, handlerArgs); // Might not return.
                    }
                    bindings = bindings.cdr();
                }
                // Re-throw condition.
                throw e;
            }
        }
    };

    // ### handler-case
    private static final SpecialOperator HANDLER_CASE =
        new SpecialOperator("handler-case") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            LispObject form = args.car();
            LispObject clauses = args.cdr();
            int depth = stack.size();
            try {
                return eval(form, env);
            }
            catch (LispException e) {
                stack.setSize(depth);
                while (clauses != NIL) {
                    Cons clause = checkCons(clauses.car());
                    LispObject type = clause.car();
                    if (isConditionOfType(e, type)) {
                        LispObject parameterList = clause.cadr();
                        LispObject body = clause.cdr().cdr();
                        Closure handler = new Closure(parameterList, body, env);
                        LispObject[] handlerArgs = new LispObject[1];
                        handlerArgs[0] = new JavaObject(e);
                        return funcall(handler, handlerArgs);
                    }
                    clauses = clauses.cdr();
                }
                // Re-throw condition.
                throw e;
            }
        }
    };

    private static boolean isConditionOfType(LispException e, LispObject type)
    {
        return type == Symbol.ERROR;
    }

    // ### make-array
    // We only support one-dimensional arrays for now.
    // make-array size &key element-type initial-element fill-pointer
    private static final Primitive MAKE_ARRAY = new Primitive("make-array") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length == 0)
                throw new WrongNumberOfArgumentsException(this);
            if (args.length > 1)
                if ((args.length - 1) % 2 != 0)
                    throw new LispException("odd number of keyword arguments");
            long lsize;
            LispObject sizeArg = args[0];
            if (sizeArg instanceof Cons) {
                if (sizeArg.length() > 1)
                    throw new LispException(
                        "only one-dimensional arrays are supported");
                lsize = Fixnum.getValue(sizeArg.car());
            } else
                lsize = Fixnum.getValue(args[0]);
            long limit =
                Fixnum.getValue(Symbol.ARRAY_DIMENSION_LIMIT.getSymbolValue());
            if (lsize < 0 && lsize >= limit) {
                StringBuffer sb = new StringBuffer();
                sb.append("the size specified for this array (");
                sb.append(lsize);
                sb.append(')');
                if (lsize >= limit) {
                    sb.append(" is >= ARRAY-DIMENSION-LIMIT (");
                    sb.append(limit);
                    sb.append(')');
                } else
                    sb.append(" is negative");
                throw new LispException(sb.toString());
            }
            final int size = (int) lsize;
            LispObject elementType = null;
            LispObject initialElement = null;
            LispObject initialContents = null;
            LispObject fillPointer = NIL;
            // Process keyword arguments (if any).
            for (int i = 1; i < args.length; i += 2) {
                LispObject keyword = checkSymbol(args[i]);
                LispObject value = args[i+1];
                if (keyword == Keyword.ELEMENT_TYPE)
                    elementType = value;
                else if (keyword == Keyword.INITIAL_ELEMENT)
                    initialElement = value;
                else if (keyword == Keyword.INITIAL_CONTENTS)
                    initialContents = value;
                else if (keyword == Keyword.FILL_POINTER)
                    fillPointer = value;
                else {
                    String s = "MAKE-ARRAY: unsupported keyword " + keyword;
                    throw new LispException(s);
                }
            }
            if (initialElement != null && initialContents != null) {
                throw new LispException("MAKE-ARRAY: cannot specify both " +
                    ":initial-element and :initial-contents");
            }
            if (elementType == Symbol.CHARACTER) {
                LispString string = new LispString(size);
                if (initialElement != null) {
                    // Initial element was specified.
                    char c = checkCharacter(initialElement).getValue();
                    string.fill(c);
                } else if (initialContents != null) {
                    // Since we only support one-dimensional arrays, this
                    // must be a sequence (and not a nested structure of
                    // sequences).
                    checkSequence(initialContents);
                    for (int i = 0; i < size; i++)
                        string.set(i, initialContents.elt(i));
                }
                if (fillPointer != NIL)
                    string.setFillPointer(fillPointer);
                return string;
            }
            Vector v = new Vector(size);
            if (initialElement != null) {
                // Initial element was specified.
                v.fill(initialElement);
            } else if (initialContents != null) {
                // Since we only support one-dimensional arrays, this
                // must be a sequence (and not a nested structure of
                // sequences).
                checkSequence(initialContents);
                // FIXME Don't use ELT for lists!
                for (int i = 0; i < size; i++)
                    v.set(i, initialContents.elt(i));
            }
            if (fillPointer != NIL)
                v.setFillPointer(fillPointer);
            return v;
        }
    };

    // ### vector
    private static final Primitive VECTOR = new Primitive("vector") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            return new Vector(args);
        }
    };

    // ### svref
    private static final Primitive2 SVREF = new Primitive2("svref") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispException
        {
            AbstractVector v = checkVector(first);
            if (!v.isSimpleVector())
                throw new WrongTypeException(first, "simple vector");
            int index = v.checkIndex(second);
            return v.get(index);
        }
    };

    // ### %svset
    // %svset simple-vector index new-value
    private static final Primitive3 _SVSET = new Primitive3("%svset") {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispException
        {
            AbstractVector v = checkVector(first);
            if (!v.isSimpleVector())
                throw new WrongTypeException(first, "simple vector");
            int i = v.checkIndex(second);
            v.set(i, third);
            return third;
        }
    };

    // ### aref
    // aref array &rest subscripts => element
    private static final Primitive AREF = new Primitive("aref") {
        public LispObject execute(LispObject[] args)
            throws LispException
        {
            if (args.length < 2)
                throw new WrongNumberOfArgumentsException(this);
            if (args[0] instanceof LispString) {
                LispString string = (LispString) args[0];
                int i = string.checkIndex(args[1]);
                return string.get(i);
            }
            if (args[0] instanceof Vector) {
                Vector v = (Vector) args[0];
                int i = v.checkIndex(args[1]);
                return v.get(i);
            }
            throw new WrongTypeException(args[0], "array");
        }
    };

    // ### %aset
    // %aset array &rest subscripts element
    private static final Primitive3 _ASET = new Primitive3("%aset") {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispException
        {
            if (first instanceof LispString) {
                LispString string = (LispString) first;
                int i = string.checkIndex(second);
                string.set(i, third);
                return third;
            }
            if (first instanceof Vector) {
                Vector v = (Vector) first;
                int i = v.checkIndex(second);
                v.set(i, third);
                return third;
            }
            throw new WrongTypeException(first, "array");
        }
    };

    // ### fill-pointer
    private static final Primitive1 FILL_POINTER =
        new Primitive1("fill-pointer") {
        public LispObject execute(LispObject arg)
            throws LispException
        {
            int fillPointer = checkVector(arg).getFillPointer();
            if (fillPointer < 0)
                throw new LispException("array does not have a fill pointer");
            return new Fixnum(fillPointer);
        }
    };

    // ### %set-fill-pointer
    private static final Primitive2 _SET_FILL_POINTER =
        new Primitive2("%set-fill-pointer") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispException
        {
            AbstractVector v = checkVector(first);
            int fillPointer = v.getFillPointer();
            if (fillPointer < 0)
                throw new LispException("array does not have a fill pointer");
            v.setFillPointer(second);
            return second;
        }
    };

    // ### vector-push
    // vector-push new-element vector => index-of-new-element
    private static final Primitive2 VECTOR_PUSH =
        new Primitive2("vector-push") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispException
        {
            AbstractVector v = checkVector(second);
            int fillPointer = v.getFillPointer();
            if (fillPointer < 0)
                throw new LispException("array does not have a fill pointer");
            v.checkIndex(fillPointer);
            v.set(fillPointer, first);
            v.setFillPointer(fillPointer + 1);
            return new Fixnum(fillPointer);
        }
    };

    // ### vector-pop
    // vector-pop vector => element
    private static final Primitive1 VECTOR_POP = new Primitive1("vector-pop") {
        public LispObject execute(LispObject arg) throws LispException
        {
            AbstractVector v = checkVector(arg);
            int fillPointer = v.getFillPointer();
            if (fillPointer < 0)
                throw new LispException("array does not have a fill pointer");
            if (fillPointer == 0)
                throw new LispException("nothing left to pop");
            int newFillPointer = v.checkIndex(fillPointer - 1);
            LispObject element = v.get(newFillPointer);
            v.setFillPointer(newFillPointer);
            return element;
        }
    };

    // ### describe
    // Need to support optional second argument specifying output stream.
    private static final Primitive DESCRIBE = new Primitive("describe") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length != 1)
                throw new WrongNumberOfArgumentsException(this);
            describe(args[0]);
            return nothing();
        }
    };

    private static void describe(LispObject obj) throws LispException
    {
        StringBuffer sb = new StringBuffer(String.valueOf(obj));
        if (obj instanceof Symbol) {
            Symbol symbol = (Symbol) obj;
            LispObject pkg = symbol.getPackage();
            sb.append(" is an ");
            if (pkg == NIL)
                sb.append("uninterned");
            else
                sb.append(symbol.isExternal() ? "external" : "internal");
            sb.append(" symbol");
            if (pkg != NIL) {
                sb.append(" in the ");
                sb.append(pkg.getName());
                sb.append(" package");
            }
            sb.append(".\n");
            if (symbol.isSpecialVariable()) {
                sb.append("It is a special variable; ");
                LispObject value = symbol.getSymbolValue();
                if (value != null) {
                    sb.append("its value is ");
                    sb.append(value);
                } else
                    sb.append("no current value");
                sb.append(".\n");
            }
            LispObject function = symbol.getSymbolFunction();
            if (function != null) {
                sb.append("Its function binding is ");
                sb.append(function);
                sb.append(".\n");
                LispObject documentation =
                    Interpreter.evaluate("(documentation '" +
                        symbol.getName() + " 'function)");
                if (documentation instanceof LispString) {
                    sb.append("Function documentation:\n  ");
                    sb.append(((LispString)documentation).getValue());
                    sb.append('\n');
                }
            }
            LispObject plist = symbol.getPropertyList();
            if (plist != NIL) {
                sb.append("Its property list has these indicator/value pairs:\n");
                LispObject[] array = plist.copyToArray();
                for (int i = 0; i < array.length; i += 2) {
                    LispObject indicator = array[i];
                    LispObject value = array[i+1];
                    sb.append("  ");
                    sb.append(indicator);
                    sb.append("\t\t");
                    sb.append(value);
                    sb.append('\n');
                }
            }
        }
        CharacterOutputStream out = getStandardOutput();
        out.freshLine();
        out.writeString(sb.toString());
    }

    // ### type-of
    private static final Primitive1 TYPE_OF = new Primitive1("type-of") {
        public LispObject execute(LispObject arg) throws LispException
        {
            return arg.typeOf();
        }
    };

    // ### macro-function
    // Need to support optional second argument specifying environment.
    private static final Primitive MACRO_FUNCTION =
        new Primitive("macro-function") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length != 1)
                throw new WrongNumberOfArgumentsException(this);
            LispObject obj = args[0].getSymbolFunction();
            return (obj instanceof Macro) ? obj : NIL;
        }
    };

    // ### function-lambda-expression
    // Need to return multiple values.
    private static final Primitive1 FUNCTION_LAMBDA_EXPRESSION =
        new Primitive1("function-lambda-expression") {
        public LispObject execute(LispObject arg) throws LispException
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
                values[1] = closure.getEnvironment() != null ? T : NIL;
            } else
                values[0] = values[1] = NIL;
            setValues(values);
            return values[0];
        }
    };

    // Only implemented for strings.
    private static final LispObject subseq(LispObject[] args)
        throws LispException
    {
        if (args.length < 2 || args.length > 3)
            throw new WrongNumberOfArgumentsException("SUBSEQ");
        String s = LispString.checkString(args[0]).getValue();
        try {
            int beginIndex = (int) Fixnum.checkNumber(args[1]).getValue();
            if (args.length == 2)
                return new LispString(s.substring(beginIndex));
            int endIndex = (int) Fixnum.checkNumber(args[2]).getValue();
            return new LispString(s.substring(beginIndex, endIndex));
        }
        catch (StringIndexOutOfBoundsException e) {
            throw new LispException("SUBSEQ".concat(
                ": string index out of bounds"));
        }
    }

    private static final LispObject room() throws LispException
    {
        Runtime runtime = Runtime.getRuntime();
        long total = 0;
        long free = 0;
        long maxFree = 0;
        while (true) {
            try {
                runtime.gc();
                Thread.currentThread().sleep(100);
                runtime.runFinalization();
                Thread.currentThread().sleep(100);
                runtime.gc();
                Thread.currentThread().sleep(100);
            }
            catch (InterruptedException e) {}
            total = runtime.totalMemory();
            free = runtime.freeMemory();
            if (free > maxFree)
                maxFree = free;
            else
                break;
        }
        long used = total - free;
        CharacterOutputStream out =
            getStandardOutput();
        StringBuffer sb = new StringBuffer("Total memory ");
        sb.append(total);
        sb.append(" bytes");
        sb.append(System.getProperty("line.separator"));
        sb.append(used);
        sb.append(" bytes used");
        sb.append(System.getProperty("line.separator"));
        sb.append(free);
        sb.append(" bytes free");
        sb.append(System.getProperty("line.separator"));
        out.writeString(sb.toString());
        out.finishOutput();
        return new Fixnum(used);
    }

    // ### funcall
    private static final Primitive FUNCALL = new Primitive("funcall") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length < 1)
                throw new WrongNumberOfArgumentsException(this);

            LispObject fun = args[0];
            if (fun instanceof Symbol)
                fun = fun.getSymbolFunction();

            final int length = args.length - 1; // Fixnum of arguments.

            LispObject[] funArgs = new LispObject[length];
            System.arraycopy(args, 1, funArgs, 0, length);
            return funcall(fun, funArgs);
        }
    };

    // ### apply
    private static final Primitive APPLY = new Primitive("apply") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length < 2)
                throw new WrongNumberOfArgumentsException(this);

            LispObject spread = checkList(args[args.length-1]);

            LispObject fun = args[0];
            if (fun instanceof Symbol)
                fun = fun.getSymbolFunction();

            final int length = args.length - 2 + spread.length();
            final LispObject[] funArgs = new LispObject[length];
            int j = 0;
            for (int i = 1; i < args.length - 1; i++)
                funArgs[j++] = args[i];
            while (spread != NIL) {
                funArgs[j++] = spread.car();
                spread = spread.cdr();
            }

            return funcall(fun, funArgs);
        }
    };

    // ### mapcar
    private static final Primitive MAPCAR = new Primitive("mapcar") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length < 2)
                throw new WrongNumberOfArgumentsException(this);

            // First argument must be a function.
            LispObject fun = args[0];
            if (fun instanceof Symbol)
                fun = fun.getSymbolFunction();

            // Remaining arguments must be lists.
            int length = -1;
            for (int i = 1; i < args.length; i++) {
                if (!args[i].listp())
                    throw new WrongTypeException(args[i], "list");
                int len = args[i].length();
                if (length < 0)
                    length = len;
                else if (length > len)
                    length = len;
            }

            LispObject[] results = new LispObject[length];

            for (int i = 0; i < length; i++) {
                final int numFunArgs = args.length - 1;
                LispObject[] funArgs = new LispObject[numFunArgs];
                for (int j = 0; j < numFunArgs; j++)
                    funArgs[j] = args[j+1].car();

                results[i] = funcall(fun, funArgs);

                for (int j = 1; j < args.length; j++)
                    args[j] = args[j].cdr();
            }

            LispObject result = NIL;
            for (int i = length; i-- > 0;) {
                result = new Cons(results[i], result);
            }

            return result;
        }
    };

    // ### macroexpand
    private static final Primitive MACROEXPAND = new Primitive("macroexpand") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length < 1 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject form = args[0];
            // Ignore args[1] (environment) for now.
            return macroexpand(form);
        }
    };

    // ### macroexpand-1
    private static final Primitive MACROEXPAND_1 =
        new Primitive("macroexpand-1") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length < 1 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject form = args[0];
            // Ignore args[1] (environment) for now.
            return macroexpand_1(form);
        }
    };

    // ### *gensym-counter*
    private static final Symbol _GENSYM_COUNTER_ =
        PACKAGE_CL.intern("*GENSYM-COUNTER*");
    static {
        _GENSYM_COUNTER_.setSymbolValue(new Fixnum(0));
        _GENSYM_COUNTER_.setSpecial(true);
        _GENSYM_COUNTER_.setExternal(true);
    }

    // ### gensym
    private static final Primitive GENSYM = new Primitive("gensym") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length > 1)
                throw new WrongNumberOfArgumentsException(this);
            long old = Fixnum.getValue(_GENSYM_COUNTER_.getSymbolValue());
            String prefix ="G";
            long n = -1;
            if (args.length == 1) {
                LispObject arg = args[0];
                if (arg instanceof Fixnum) {
                    n = ((Fixnum)arg).getValue();
                    if (n < 0)
                        throw new WrongTypeException(arg,
                            "non-negative integer");
                } else if (arg instanceof LispString) {
                    prefix = ((LispString)arg).getValue();
                } else {
                    throw new WrongTypeException(arg,
                        "string or non-negative integer");
                }
            }
            if (n < 0) {
                n = old + 1;
                _GENSYM_COUNTER_.setSymbolValue(new Fixnum(n));
            }
            StringBuffer sb = new StringBuffer(prefix);
            sb.append(n);
            return new Symbol(sb.toString());
        }
    };

    // ### string
    private static final Primitive1 STRING = new Primitive1("string") {
        public LispObject execute(LispObject arg) throws LispException
        {
            return string(arg);
        }
    };

    // ### concatenate
    private static final Primitive CONCATENATE = new Primitive("concatenate") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length == 0)
                throw new WrongNumberOfArgumentsException(this);
            LispObject type = args[0];
            if (type == Symbol.STRING) {
                LispString result = new LispString();
                for (int i = 1; i < args.length; i++)
                    result.append(args[i]);
                return result;
            }
            throw new LispException("not supported");
        }
    };

    // ### use-package
    // use-package packages-to-use &optional package => t
    private static final Primitive USE_PACKAGE = new Primitive("use-package") {
        public LispObject execute(LispObject[] args) throws LispException
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

    // ### intern
    // intern string &optional package => symbol, status
    // status is one of :INHERITED, :EXTERNAL, :INTERNAL or NIL.
    private static final Primitive INTERN = new Primitive("intern") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length == 0 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            String s = LispString.getValue(args[0]);
            Package pkg;
            if (args.length == 2)
                pkg = coerceToPackage(args[1]);
            else
                pkg = getCurrentPackage();
            return intern(s, pkg);
        }
    };

    // ### unintern
    // unintern symbol &optional package => generalized-boolean
    private static final Primitive UNINTERN = new Primitive("unintern") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length == 0 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args[0]);
            Package pkg;
            if (args.length == 2)
                pkg = coerceToPackage(args[1]);
            else
                pkg = getCurrentPackage();
            return unintern(symbol, pkg);
        }
    };

    // Returns package or throws exception.
    private static final Package coerceToPackage(LispObject obj)
        throws LispException
    {
        if (obj instanceof Package)
            return (Package) obj;

        String packageName = null;
        if (obj instanceof Symbol)
            packageName = obj.getName();
        else if (obj instanceof LispString)
            packageName = ((LispString)obj).getValue();
        else if (obj instanceof LispCharacter)
            packageName = new LispString((LispCharacter)obj).getValue();
        Package pkg = null;
        if (packageName != null) {
            pkg = Packages.findPackage(packageName);
            if (pkg != null)
                return pkg;
        }
        throw new LispException(obj + " is not the name of a package");
    }

    // ### find-package
    private static final Primitive1 FIND_PACKAGE =
        new Primitive1("find-package") {
        public LispObject execute(LispObject arg) throws LispException
        {
            if (arg instanceof Package)
                return arg;
            if (arg instanceof LispString) {
                Package pkg =
                    Packages.findPackage(((LispString)arg).getValue());
                return pkg != null ? pkg : NIL;
            }
            if (arg instanceof Symbol) {
                Package pkg =
                    Packages.findPackage(arg.getName());
                return pkg != null ? pkg : NIL;
            }
            return NIL;
        }
    };

    // ### make-package
    // make-package &key nicknames use => package
    private static final Primitive MAKE_PACKAGE =
        new Primitive("make-package") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length == 0)
                throw new WrongNumberOfArgumentsException(this);
            if (args.length > 1)
                if ((args.length - 1) % 2 != 0)
                    throw new LispException("odd number of keyword arguments");
            LispObject arg = args[0];
            String packageName = null;
            if (arg instanceof LispString) {
                packageName = ((LispString)arg).getValue();
            } else if (arg instanceof Symbol) {
                packageName = arg.getName();
            } else
                throw new WrongTypeException(arg, "string");
            Package pkg =
                Packages.findPackage(packageName);
            if (pkg != null)
                throw new LispException("package " + packageName +
                    " already exists");
            pkg = Packages.getPackage(packageName);

            // Defaults.
            LispObject nicknames = null;
            LispObject use = null;

            // Process keyword arguments (if any).
            for (int i = 1; i < args.length; i += 2) {
                LispObject keyword = checkSymbol(args[i]);
                LispObject value = args[i+1];
                if (keyword == Keyword.NICKNAMES)
                    nicknames = value;
                else if (keyword == Keyword.USE)
                    use = value;
            }

            if (nicknames != null) {
                LispObject list = checkList(nicknames);
                while (list != NIL) {
                    LispString string = string(list.car());
                    pkg.addNickname(string.getValue());
                    list = list.cdr();
                }
            }

            if (use != null) {
                LispObject list = checkList(use);
                while (list != NIL) {
                    LispObject obj = list.car();
                    if (obj instanceof Package)
                        pkg.usePackage((Package)obj);
                    else {
                        LispString string = string(obj);
                        Package p = Packages.findPackage(string.getValue());
                        if (p == null)
                            throw new LispException(String.valueOf(obj) +
                                " is not the name of a package");
                        pkg.usePackage(p);
                    }
                    list = list.cdr();
                }
            } else
                pkg.usePackage(PACKAGE_CL); // Default.

            return pkg;
        }
    };

    // ### in-package
    private static final SpecialOperator IN_PACKAGE =
        new SpecialOperator("in-package") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            if (args.length() != 1)
                throw new WrongNumberOfArgumentsException(this);
            LispObject arg = args.car();
            LispString string = string(arg);
            Package pkg = Packages.findPackage(string.getValue());
            if (pkg == null)
                throw new LispException("package " + arg + " does not exist");
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

    // ### package-nicknames
    // package-nicknames package => nicknames
    private static final Primitive1 PACKAGE_NICKNAMES =
        new Primitive1("package-nicknames") {
        public LispObject execute(LispObject arg) throws LispException
        {
            return coerceToPackage(arg).getNicknames();
        }
    };

    // ### package-use-list
    // package-use-list package => use-list
    private static final Primitive1 PACKAGE_USE_LIST =
        new Primitive1("package-use-list") {
        public LispObject execute(LispObject arg) throws LispException
        {
            return coerceToPackage(arg).getUseList();
        }
    };

    // ### package-used-by-list
    // package-used-by-list package => used-by-list
    private static final Primitive1 PACKAGE_USED_BY_LIST =
        new Primitive1("package-used-by-list") {
        public LispObject execute(LispObject arg) throws LispException
        {
            return coerceToPackage(arg).getUsedByList();
        }
    };

    // ### export
    // export symbols &optional package
    private static final Primitive EXPORT =
        new Primitive("export") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length == 0 || args.length > 2)
                throw new WrongNumberOfArgumentsException(this);
            Package pkg = null;
            if (args.length == 2) {
                LispObject arg = args[1];
                if (arg instanceof Package)
                    pkg = (Package) arg;
                else if (arg instanceof LispString)
                    pkg = Packages.findPackage(((LispString)arg).getValue());
                else if (arg instanceof Symbol)
                    pkg = Packages.findPackage(arg.getName());
                else
                    throw new WrongTypeException(arg, "package");
                if (pkg == null)
                    throw new LispException(String.valueOf(arg) +
                        " is not a package");
            } else
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

    // ### remove
    // remove item sequence &key from-end test test-not start end count key =>
    // result-sequence
    private static final Primitive REMOVE =
        new Primitive("remove") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length < 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject item = args[0];
            SequenceType sequence = checkSequence(args[1]);
            return sequence.remove(item);
        }
    };

    // ### make-string
    // make-string size &key initial-element element-type => string
    // Returns a simple string.
    private static final Primitive MAKE_STRING = new Primitive("make-string") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length == 0)
                throw new WrongNumberOfArgumentsException(this);
            if (args.length > 1)
                if ((args.length - 1) % 2 != 0)
                    throw new LispException("odd number of keyword arguments");
            long lsize;
            LispObject sizeArg = args[0];
            if (sizeArg instanceof Cons) {
                if (sizeArg.length() > 1)
                    throw new LispException(
                        "only one-dimensional arrays are supported");
                lsize = Fixnum.getValue(sizeArg.car());
            } else
                lsize = Fixnum.getValue(args[0]);
            long limit =
                Fixnum.getValue(Symbol.ARRAY_DIMENSION_LIMIT.getSymbolValue());
            if (lsize < 0 && lsize >= limit) {
                StringBuffer sb = new StringBuffer();
                sb.append("the size specified for this string (");
                sb.append(lsize);
                sb.append(')');
                if (lsize >= limit) {
                    sb.append(" is >= ARRAY-DIMENSION-LIMIT (");
                    sb.append(limit);
                    sb.append(')');
                } else
                    sb.append(" is negative");
                throw new LispException(sb.toString());
            }
            final int size = (int) lsize;
            LispObject elementType = Symbol.CHARACTER;
            LispObject initialElement = null;
            // Process keyword arguments (if any).
            for (int i = 1; i < args.length; i += 2) {
                LispObject keyword = checkSymbol(args[i]);
                LispObject value = args[i+1];
                if (keyword == Keyword.ELEMENT_TYPE)
                    elementType = value;
                else if (keyword == Keyword.INITIAL_ELEMENT)
                    initialElement = value;
                else {
                    String s = "MAKE-STRING: unsupported keyword " + keyword;
                    throw new LispException(s);
                }
            }
            if (elementType != Symbol.CHARACTER)
                throw new LispException(String.valueOf(elementType) +
                    " is an invalid element-type");
            LispString string = new LispString(size);
            if (initialElement != null) {
                // Initial element was specified.
                char c = checkCharacter(initialElement).getValue();
                string.fill(c);
            }
            return string;
        }
    };

    // ### fset
    private static final Primitive2 FSET =
        new Primitive2("fset") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispException
        {
            checkSymbol(first).setSymbolFunction(second);
            return second;
        }
    };

    // ### %set-symbol-plist
    private static final Primitive2 _SET_SYMBOL_PLIST =
        new Primitive2("%set-symbol-plist") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispException
        {
            checkSymbol(first).setPropertyList(checkList(second));
            return second;
        }
    };

    // ### %put
    // %put symbol indicator value
    private static final Primitive _PUT = new Primitive("%put") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length != 3)
                throw new WrongNumberOfArgumentsException(this);
            Symbol symbol = checkSymbol(args[0]);
            LispObject indicator = args[1];
            LispObject value = args[2];
            LispObject list = checkList(symbol.getPropertyList());
            while (list != NIL) {
                if (eql(list.car(), indicator)) {
                    // Found it!
                    LispObject rest = list.cdr();
                    rest.setCar(value);
                    return value;
                }
                list = list.cdr().cdr();
            }
            // Not found.
            symbol.setPropertyList(new Cons(indicator, new Cons(value,
                symbol.getPropertyList())));
            return value;
        }
    };

    private static final LispObject _let(LispObject args, Environment env,
        boolean sequential) throws LispException
    {
        LispObject varList = checkList(args.car());
        LispObject result;
        if (varList != NIL) {
            Environment oldDynEnv = dynEnv;
            Environment ext = new Environment(env);
            Environment evalEnv = sequential ? ext : env;
            LispObject array[] = varList.copyToArray();
            for (int i = 0; i < array.length; i++) {
                LispObject obj = array[i];
                if (obj instanceof Cons) {
                    bind(checkSymbol(obj.car()),
                        eval(obj.cadr(),evalEnv),
                        ext);
                } else
                    bind(checkSymbol(obj), NIL, ext);
            }
            result = progn(args.cdr(), ext);
            dynEnv = oldDynEnv;
        } else
            result = progn(args.cdr(), env);
        return result;
    }

    private static final LispObject _flet(LispObject args, Environment env,
        boolean recursive) throws LispException
    {
        // First argument is a list of local function definitions.
        LispObject defs = checkList(args.car());
        LispObject result;
        if (defs != NIL) {
            Environment oldDynEnv = dynEnv;
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
                ext.bindFunctional(symbol, closure);
                defs = defs.cdr();
            }
            result = progn(args.cdr(), ext);
            dynEnv = oldDynEnv;
        } else
            result = progn(args.cdr(), env);
        return result;
    }

    // ### block
    private static final SpecialOperator BLOCK = new SpecialOperator("block") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            if (args.length() < 1)
                throw new WrongNumberOfArgumentsException(this);
            Block block;
            if (args.car() == NIL)
                block = new Block(NIL, args.cdr());
            else {
                Symbol symbol = checkSymbol(args.car());
                block = new Block(symbol, args.cdr());
            }
            LispObject body = block.getBody();
            LispObject result = NIL;
            int depth = stack.size();
            try {
                while (body != NIL) {
                    result = eval(body.car(), env);
                    body = body.cdr();
                }
                return result;
            }
            catch (Return ret) {
                if (ret.getName() == block.getName()) {
                    stack.setSize(depth);
                    return ret.getResult();
                }
                throw ret;
            }
        }
    };

    // ### catch
    private static final SpecialOperator CATCH = new SpecialOperator("catch") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            if (args.length() < 1)
                throw new WrongNumberOfArgumentsException(this);
            LispObject tag = eval(args.car(), env);
            LispObject body = args.cdr();
            LispObject result = NIL;
            int depth = stack.size();
            try {
                while (body != NIL) {
                    result = eval(body.car(), env);
                    body = body.cdr();
                }
                return result;
            }
            catch (Throw t) {
                if (t.getTag() == tag) {
                    stack.setSize(depth);
                    return t.getResult();
                }
                throw t;
            }
        }
    };

    // ### throw
    private static final SpecialOperator THROW = new SpecialOperator("throw") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            if (args.length() < 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject tag = eval(args.car(), env);
            LispObject result = eval(args.cadr(), env);
            throw new Throw(tag, result);
        }
    };

    // ### unwind-protect
    private static final SpecialOperator UNWIND_PROTECT =
        new SpecialOperator("unwind-protect") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            LispObject result;
            LispObject[] values;
            try {
                result = eval(args.car(), env);
                values = getValues();
            }
            finally {
                eval(args.cadr(), env);
            }
            setValues(values);
            return result;
        }
    };

    // ### function
    private static final SpecialOperator FUNCTION =
        new SpecialOperator("function") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            LispObject arg = args.car();
            if (arg instanceof Symbol) {
                LispObject f = env.lookupFunctional(arg);
                if (f != null)
                    return f;
                f = arg.getSymbolFunction();
                if (f instanceof Function)
                    return f;
                throw new UndefinedFunctionException(arg);
            }
            if (arg instanceof Cons) {
                Symbol symbol = checkSymbol(arg.car());
                if (symbol == Symbol.LAMBDA)
                    return new Closure(arg.cadr(), arg.cddr(), env);
            }
            throw new UndefinedFunctionException(String.valueOf(arg));
        }
    };

    // ### return-from
    private static final SpecialOperator RETURN_FROM =
        new SpecialOperator("return-from") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            final int length = args.length();
            if (length < 1 || length > 2)
                throw new WrongNumberOfArgumentsException(this);
            LispObject name = args.car();
            LispObject result;
            if (length == 2)
                result = eval(args.cadr(), env);
            else
                result = NIL;
            throw new Return(name, result);
        }
    };

    // ### setq
    private static final SpecialOperator SETQ = new SpecialOperator("setq") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            LispObject value = Symbol.NIL;
            while (args != NIL) {
                Symbol symbol = checkSymbol(args.car());
                args = args.cdr();
                value = eval(args.car(), env);
                if (symbol.isSpecialVariable()) {
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
            throws LispException
        {
            LispObject[] vars = args.car().copyToArray();
            args = args.cdr();

            LispObject valuesForm = args.car();

            LispObject value = eval(valuesForm, env);

            LispObject[] values = getValues();
            if (values == null) {
                // eval(valuesForm, env) did not return multiple values.
                values = new LispObject[1];
                values[0] = value;
            }

            Environment oldDynEnv = dynEnv;
            dynEnv = new Environment(dynEnv);
            Environment ext = new Environment(env);

            for (int i = 0; i < vars.length; i++) {
                Symbol symbol = checkSymbol(vars[i]);
                if (i < values.length)
                    bind(symbol, values[i], ext);
                else
                    bind(symbol, NIL, ext);
            }

            LispObject result = progn(args.cdr(), ext);
            dynEnv = oldDynEnv;
            return result;
        }
    };

    // ### and
    // Should be a macro.
    private static final SpecialOperator AND = new SpecialOperator("and") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            switch (args.length()) {
                case 0:
                    return T;
                case 1:
                    return eval(args.car(), env);
                default:
                    while (true) {
                        LispObject result = eval(args.car(), env);
                        if (result == NIL)
                            return NIL;
                        args = args.cdr();
                        if (args == NIL)
                            return result;
                    }
            }
        }
    };

    // ### or
    // Should be a macro.
    private static final SpecialOperator OR = new SpecialOperator("or") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            switch (args.length()) {
                case 0:
                    return NIL;
                case 1:
                    return eval(args.car(), env);
                default:
                    while (true) {
                        LispObject result = eval(args.car(), env);
                        if (result != NIL)
                            return result;
                        args = args.cdr();
                        if (args == NIL)
                            return NIL;
                    }
            }
        }
    };

    // ### assert
    // Should be a macro.
    private static final SpecialOperator ASSERT =
        new SpecialOperator("assert") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            final int length = args.length();
            if (length != 1)
                throw new WrongNumberOfArgumentsException(this);
            LispObject form = args.car();
            if (eval(form, env) == NIL)
                throw new LispException("assertion failed: " + form);
            return NIL;
        }
    };

    // ### time
    // Should be a macro.
    private static final SpecialOperator TIME = new SpecialOperator("time")
    {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            if (args.length() != 1)
                throw new WrongNumberOfArgumentsException(this);
            LispObject arg = args.car();
            Cons.setCount(0);
            long start = java.lang.System.currentTimeMillis();
            LispObject result = eval(arg, env);
            long elapsed = java.lang.System.currentTimeMillis() - start;
            long count = Cons.getCount();
            CharacterOutputStream out = getTraceOutput();
            out.freshLine();
            StringBuffer sb =
                new StringBuffer(String.valueOf((float)elapsed/1000));
            sb.append(" seconds");
            if (count > 0) {
                sb.append(System.getProperty("line.separator"));
                sb.append(count);
                sb.append(" cons cell");
                if (count > 1)
                    sb.append('s');
            }
            out.writeString(sb.toString());
            out.finishOutput();
            return result;
        }
    };

    // ### loop
    // Should be a macro.
    private static final SpecialOperator LOOP = new SpecialOperator("loop")
    {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            int length = args.length();
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            Block block = new Block(NIL, args);
            while (true) {
                LispObject body = block.getBody();
                int depth = stack.size();
                try {
                    while (body != NIL) {
                        eval(body.car(), env);
                        body = body.cdr();
                    }
                }
                catch (Return ret) {
                    stack.setSize(depth);
                    if (ret.getName() == block.getName())
                        return ret.getResult();
                    throw ret;
                }
            }
        }
    };

    // ### return
    // Should be a macro.
    private static final SpecialOperator RETURN =
        new SpecialOperator("return") {
        public LispObject execute(LispObject args, Environment env)
            throws LispException
        {
            switch (args.length()) {
                case 0:
                    throw new Return(NIL, NIL);
                case 1:
                    throw new Return(NIL, eval(args.car(), env));
                default:
                    throw new WrongNumberOfArgumentsException(this);
            }
        }
    };

    // ### make-string-output-stream
    // make-string-output-stream &key element-type => string-stream
    private static final Primitive MAKE_STRING_OUTPUT_STREAM =
        new Primitive("make-string-output-stream") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            if (args.length > 1)
                throw new WrongNumberOfArgumentsException(this);
            // FIXME Ignore arg for now.
            return new StringOutputStream();
        }
    };

    // ### get-output-stream-string
    // get-output-stream-string string-output-stream => string
    private static final Primitive1 GET_OUTPUT_STREAM_STRING =
        new Primitive1("get-output-stream-string") {
        public LispObject execute(LispObject arg) throws LispException
        {
            if (arg instanceof StringOutputStream)
                return ((StringOutputStream)arg).getString();
            throw new WrongTypeException(this, "string output stream");
        }
    };

    // ### write-string
    // write-string string &optional output-stream &key start end => string
    private static final Primitive WRITE_STRING =
        new Primitive("write-string") {
        public LispObject execute(LispObject[] args) throws LispException
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
                    throw new WrongTypeException(args[1],
                        "character output stream");
            }
            out.writeString(string);
            return string;
        }
    };

    // ### close
    // close stream &key abort => result
    private static final Primitive CLOSE = new Primitive("close") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            final int length = args.length;
            if (length == 0)
                throw new WrongNumberOfArgumentsException(this);
            LispObject abort = NIL; // Default.
            LispStream stream = checkStream(args[0]);
            if (length > 1) {
                if ((length - 1) % 2 != 0)
                    throw new LispException("odd number of keyword arguments");
                if (length > 3)
                    throw new WrongNumberOfArgumentsException(this);
                if (args[1] == Keyword.ABORT)
                    abort = args[2];
                else
                    throw new LispException(
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
            throws LispException
        {
            if (args.length() != 1)
                throw new WrongNumberOfArgumentsException(this);
            LispObject result = eval(args.car(), env);
            LispObject[] values = getValues();
            setValues(null);
            if (values == null)
                return new Cons(result, NIL);
            LispObject list = NIL;
            for (int i = values.length; i-- > 0;)
                list = new Cons(values[i], list);
            return list;
        }
    };

    // ### make-hash-table
    // make-hash-table &key test size rehash-size rehash-threshold => hash-table
    // FIXME Support keyword arguments!
    // FIXME Implementation only supports EQ hash tables.
    private static final Primitive0 MAKE_HASH_TABLE =
        new Primitive0("make-hash-table") {
        public LispObject execute() throws LispException
        {
            return new HashTable();
        }
    };

    // ### gethash
    // gethash key hash-table &optional default => value, present-p
    private static final Primitive GETHASH = new Primitive("gethash") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            final int length = args.length;
            if (length < 2 || length > 3)
                throw new WrongNumberOfArgumentsException(this);
            if (args[1] instanceof HashTable) {
                LispObject key = args[0];
                HashTable ht = (HashTable) args[1];
                LispObject defaultValue =
                    length == 3 ? args[2] : NIL;
                return ht.gethash(key, defaultValue);
            }
            throw new WrongTypeException(args[1], "hash table");
        }
    };

    // puthash key hash-table default &optional (value default) => value
    private static final Primitive PUTHASH = new Primitive("puthash") {
        public LispObject execute(LispObject[] args) throws LispException
        {
            final int length = args.length;
            if (length < 3 || length > 4)
                throw new WrongNumberOfArgumentsException(this);
            if (args[1] instanceof HashTable) {
                LispObject key = args[0];
                HashTable ht = (HashTable) args[1];
                LispObject value;
                if (length == 3)
                    value = args[2];
                else {
                    Debug.assertTrue(length == 4);
                    value = args[3];
                }
                return ht.puthash(key, value);
            }
            throw new WrongTypeException(args[1], "hash table");
        }
    };

    // remhash key hash-table => generalized-boolean
    private static final Primitive2 REMHASH = new Primitive2("remhash") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispException
        {
            if (second instanceof HashTable) {
                LispObject key = first;
                HashTable ht = (HashTable) second;
                return ht.remhash(key);
            }
            throw new WrongTypeException(second, "hash table");
        }
    };

    private static final Primitive1 PROBE_FILE = new Primitive1("probe-file") {
        public LispObject execute(LispObject arg) throws LispException
        {
            String pathname = LispString.getValue(arg);
            return new File(pathname).exists() ? T : NIL;
        }
    };

    static {
        new Primitives();
    }
}
