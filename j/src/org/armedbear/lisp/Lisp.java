/*
 * Lisp.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Lisp.java,v 1.46 2003-03-26 01:43:22 piso Exp $
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

import java.math.BigInteger;
import java.util.Random;
import java.util.Stack;

public abstract class Lisp
{
    // ### nil
    public static final LispObject NIL = new Nil();

    // End-of-file marker.
    /*package*/ static final LispObject EOF = new LispObject();

    // Types.
    /*package*/ static final int TYPE_SYMBOL            = 1;
    /*package*/ static final int TYPE_PRIMITIVE         = 2;
    /*package*/ static final int TYPE_PRIMITIVE0        = 3;
    /*package*/ static final int TYPE_PRIMITIVE1        = 4;
    /*package*/ static final int TYPE_PRIMITIVE2        = 5;
    /*package*/ static final int TYPE_PRIMITIVE3        = 6;
    /*package*/ static final int TYPE_CLOSURE           = 7;
    /*package*/ static final int TYPE_SPECIAL_OPERATOR  = 8;
    /*package*/ static final int TYPE_COMPILED_FUNCTION = 9;
    /*package*/ static final int TYPE_MACRO             = 10;
    /*package*/ static final int TYPE_CONS              = 11;

    public static Environment dynEnv = null;

    private static LispObject[] _values;

    public static final LispObject[] getValues()
    {
        return _values;
    }

    public static final void setValues(LispObject[] array)
    {
        if (array == null)
            _values = null;
        else {
            _values = new LispObject[array.length];
            for (int i = array.length; i-- > 0;)
                _values[i] = array[i];
        }
    }

    public static final LispObject nothing()
    {
        _values = new LispObject[0];
        return NIL;
    }

    // Forces a single value, for situations where multiple values should be
    // ignored.
    private static final LispObject value(LispObject obj)
    {
        _values = null;
        return obj;
    }

    public static final LispObject funcall(LispObject fun, LispObject[] argv)
        throws Condition
    {
        if (debug) {
            stack.push(new StackFrame((Function)fun, argv));
        }
        LispObject result;
        switch (fun.getType()) {
            case TYPE_PRIMITIVE0: {
                if (argv.length != 0)
                    throw new WrongNumberOfArgumentsException(fun);
                if (profiling)
                    fun.incrementCallCount();
                result = fun.execute();
                break;
            }
            case TYPE_PRIMITIVE1: {
                if (argv.length != 1)
                    throw new WrongNumberOfArgumentsException(fun);
                if (profiling)
                    fun.incrementCallCount();
                result = fun.execute(argv[0]);
                break;
            }
            case TYPE_PRIMITIVE2: {
                if (argv.length != 2)
                    throw new WrongNumberOfArgumentsException(fun);
                if (profiling)
                    fun.incrementCallCount();
                result = fun.execute(argv[0], argv[1]);
                break;
            }
            case TYPE_PRIMITIVE3: {
                if (argv.length != 3)
                    throw new WrongNumberOfArgumentsException(fun);
                if (profiling)
                    fun.incrementCallCount();
                result = fun.execute(argv[0], argv[1], argv[2]);
                break;
            }
            case TYPE_PRIMITIVE:
            case TYPE_COMPILED_FUNCTION:
            case TYPE_CLOSURE:
            case TYPE_MACRO:
                if (profiling)
                    fun.incrementCallCount();
                result = fun.execute(argv);
                break;
            case TYPE_SPECIAL_OPERATOR:
            default:
                throw new UndefinedFunctionError(String.valueOf(fun));
        }
        if (debug) {
            if (!stack.empty())
                stack.pop();
        }
        return result;
    }

    public static final LispObject macroexpand(LispObject form, Environment env)
        throws Condition
    {
        LispObject expanded = NIL;
        while (true) {
            form = macroexpand_1(form, env);
            LispObject[] values = getValues();
            if (values[1] == NIL) {
                values[1] = expanded;
                return form;
            }
            expanded = T;
        }
    }

    public static final LispObject macroexpand_1(LispObject form, Environment env)
        throws Condition
    {
        LispObject[] results = new LispObject[2];
        if (!(form instanceof Cons)) {
            results[0] = form;
            results[1] = NIL;
            setValues(results);
            return results[0];
        }
        Symbol symbol = checkSymbol(form.car());
        LispObject macro = symbol.getSymbolFunction();
        if (macro instanceof Macro) {
            if (profiling)
                macro.incrementCallCount();
            results[0] = macro.execute(form, env);
            results[1] = T;
            setValues(results);
            return results[0];
        }
        // Not a macro.
        results[0] = form;
        results[1] = NIL;
        setValues(results);
        return results[0];
    }

    private static class StackFrame
    {
        private final Functional functional;
        private final LispObject[] argv;

        public StackFrame(LispObject obj, LispObject[] argv)
        {
            functional = (Functional) obj;
            this.argv = argv;
        }

        public Functional getFunctional()
        {
            return functional;
        }

        public LispObject[] getArgumentVector()
        {
            return argv;
        }
    }

    public static final Stack stack = new Stack();

    public static void resetStack()
    {
        stack.clear();
    }

    public static void checkStack() throws LispError
    {
        if (stack.size() > 0) {
            getStandardOutput().writeLine("stack depth = " + stack.size());
            backtrace();
        }
    }

    public static void backtrace()
    {
        if (stack.size() > 0) {
            CharacterOutputStream out = getTraceOutput();
            try {
                out.writeLine("Evaluation stack:");
                out.finishOutput();
                for (int i = stack.size(); i-- > 0;) {
                    out.writeString("  ");
                    out.writeString(String.valueOf(stack.size() - 1 - i));
                    out.writeString(": ");
                    StackFrame frame = (StackFrame) stack.get(i);
                    LispObject obj = NIL;
                    LispObject[] argv = frame.getArgumentVector();
                    for (int j = argv.length; j-- > 0;)
                        obj = new Cons(argv[j], obj);
                    Functional functional = frame.getFunctional();
                    if (functional.getLambdaName() != null)
                        obj = new Cons(functional.getLambdaName(), obj);
                    else
                        obj = new Cons(functional, obj);
                    pprint(obj, out.getCharPos(), out);
                    out.terpri();
                    out.finishOutput();
                }
            }
            catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }

    private static void pprint(LispObject obj, int indentBy,
        CharacterOutputStream stream) throws StreamError
    {
        if (stream.getCharPos() == 0) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < indentBy; i++)
                sb.append(' ');
            stream.writeString(sb.toString());
        }
        String raw = String.valueOf(obj);
        if (stream.getCharPos() + raw.length() < 80) {
            // It fits.
            stream.writeString(raw);
            return;
        }
        // Object doesn't fit.
        if (obj instanceof Cons) {
            try {
                boolean newlineBefore = false;
                LispObject[] array = obj.copyToArray();
                if (array.length > 0) {
                    LispObject first = array[0];
                    if (first == Symbol.LET) {
                        newlineBefore = true;
                    }
                }
                int charPos = stream.getCharPos();
                if (newlineBefore && charPos != indentBy) {
                    stream.terpri();
                    charPos = stream.getCharPos();
                }
                if (charPos < indentBy) {
                    StringBuffer sb = new StringBuffer();
                    for (int i = charPos; i < indentBy; i++)
                        sb.append(' ');
                    stream.writeString(sb.toString());
                }
                stream.print('(');
                for (int i = 0; i < array.length; i++) {
                    pprint(array[i], indentBy + 2, stream);
                    if (i < array.length - 1)
                        stream.print(' ');
                }
                stream.print(')');
            }
            catch (LispError e) {
                Debug.trace(e);
            }
        } else {
            stream.terpri();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < indentBy; i++)
                sb.append(' ');
            stream.writeString(sb.toString());
            stream.writeString(raw);
            return;
        }
    }

    private static boolean debug = true;

    public static final LispObject eval(LispObject obj, Environment env)
        throws Condition
    {
        _values = null;
        if (obj instanceof Symbol) {
            LispObject result = null;
            if (obj.isSpecialVariable()) {
                if (dynEnv != null)
                    result = dynEnv.lookup(obj);
            } else
                result = env.lookup(obj);
            if (result == null) {
                result = obj.getSymbolValue();
                if (result == null)
                    throw new UnboundVariableException(obj.getName());
            }
            return result;
        } else if (obj instanceof Cons) {
            LispObject first = obj.car();
            if (first instanceof Symbol) {
                LispObject fun = env.lookupFunctional(first);
                if (fun == null) {
                    fun = first.getSymbolFunction();
                    if (fun == null)
                        throw new UndefinedFunctionError(first);
                }
                switch (fun.getType()) {
                    case TYPE_SPECIAL_OPERATOR: {
                        if (profiling)
                            fun.incrementCallCount();
                        // Don't eval args!
                        return fun.execute(obj.cdr(), env);
                    }
                    case TYPE_MACRO:
                        return eval(macroexpand(obj, env), env);
                    case TYPE_PRIMITIVE0: {
                        if (debug)
                            return apply(fun, evalList(obj.cdr(), env));
                        if (obj.cdr() != NIL)
                            throw new WrongNumberOfArgumentsException(fun);
                        if (profiling)
                            fun.incrementCallCount();
                        return fun.execute();
                    }
                    case TYPE_PRIMITIVE1: {
                        if (debug)
                            return apply(fun, evalList(obj.cdr(), env));
                        LispObject args = obj.cdr();
                        if (args.length() != 1)
                            throw new WrongNumberOfArgumentsException(fun);
                        if (profiling)
                            fun.incrementCallCount();
                        return fun.execute(value(eval(args.car(), env)));
                    }
                    case TYPE_PRIMITIVE2: {
                        if (debug)
                            return apply(fun, evalList(obj.cdr(), env));
                        LispObject args = obj.cdr();
                        if (args.length() != 2)
                            throw new WrongNumberOfArgumentsException(fun);
                        if (profiling)
                            fun.incrementCallCount();
                        return fun.execute(eval(args.car(), env),
                            value(eval(args.cadr(), env)));
                    }
                    case TYPE_PRIMITIVE3: {
                        if (debug)
                            return apply(fun, evalList(obj.cdr(), env));
                        LispObject args = obj.cdr();
                        if (args.length() != 3)
                            throw new WrongNumberOfArgumentsException(fun);
                        if (profiling)
                            fun.incrementCallCount();
                        return fun.execute(eval(args.car(), env),
                            eval(args.cadr(), env),
                            value(eval(args.cdr().cdr().car(), env)));
                    }
                    case TYPE_COMPILED_FUNCTION:
                        return fun.execute(evalList(obj.cdr(), env));
                    default:
                        if (debug)
                            return apply(fun, evalList(obj.cdr(), env));
                        if (profiling)
                            fun.incrementCallCount();
                        return fun.execute(evalList(obj.cdr(), env));
                }
            } else {
                LispObject args = obj.cdr();
                if (!args.listp())
                    throw new TypeError(args, "list");
                LispObject funcar = first.car();
                LispObject rest = first.cdr();
                Symbol symbol = checkSymbol(funcar);
                if (symbol == Symbol.LAMBDA) {
                    Closure closure = new Closure(rest.car(), rest.cdr(), env);
                    return closure.execute(evalList(args, env));
                } else
                    throw new ProgramError("illegal function object: " + first);
            }
        } else
            return obj;
    }

    // Debug only.
    private static final LispObject apply(LispObject fun, LispObject[] argv)
        throws Condition
    {
        stack.push(new StackFrame(fun, argv));
        if (profiling)
            fun.incrementCallCount();
        LispObject result;
        switch (fun.getType()) {
            case TYPE_PRIMITIVE0: {
                if (argv.length != 0)
                    throw new WrongNumberOfArgumentsException(fun);
                result = fun.execute();
                break;
            }
            case TYPE_PRIMITIVE1: {
                if (argv.length != 1)
                    throw new WrongNumberOfArgumentsException(fun);
                result = fun.execute(argv[0]);
                break;
            }
            case TYPE_PRIMITIVE2: {
                if (argv.length != 2)
                    throw new WrongNumberOfArgumentsException(fun);
                result = fun.execute(argv[0], argv[1]);
                break;
            }
            case TYPE_PRIMITIVE3: {
                if (argv.length != 3)
                    throw new WrongNumberOfArgumentsException(fun);
                result = fun.execute(argv[0], argv[1], argv[2]);
                break;
            }
            default:
                result = fun.execute(argv);
                break;
        }
        if (!stack.empty())
            stack.pop();
        return result;
    }

    private static final LispObject[] evalList(LispObject exps, Environment env)
        throws Condition
    {
        final int length = exps.length();
        LispObject[] results = new LispObject[length];
        for (int i = 0; i < length; i++) {
            results[i] = eval(exps.car(), env);
            exps = exps.cdr();
        }
        // Ignore multiple values!
        _values = null;
        return results;
    }

    public static final LispObject progn(LispObject body, Environment env)
        throws Condition
    {
        LispObject result = NIL;
        while (body != NIL) {
            result = eval(body.car(), env);
            body = body.cdr();
        }
        return result;
    }

    // Environment wrappers.
    public static final void bind(Symbol symbol, LispObject value, Environment env)
    {
        if (symbol.isSpecialVariable()) {
            dynEnv = new Environment(dynEnv);
            dynEnv.bind(symbol, value);
        } else
            env.bind(symbol, value);
    }

    public static final void rebind(Symbol symbol, LispObject value, Environment env)
    {
        if (symbol.isSpecialVariable()) {
            Debug.assertTrue(dynEnv != null);
            dynEnv.rebind(symbol, value);
        } else
            env.rebind(symbol, value);
    }

    public static final boolean equalp(LispObject first, LispObject second)
        throws LispError
    {
        if (first.equal(second))
            return true;
        if (first instanceof LispCharacter && second instanceof LispCharacter) {
            char c1 = ((LispCharacter)first).getValue();
            char c2 = ((LispCharacter)second).getValue();
            return (Character.toLowerCase(c1) == Character.toLowerCase(c2));
        }
        if (first instanceof Cons && second instanceof Cons) {
            if (equalp(first.car(), second.car()) &&
                equalp(first.cdr(), second.cdr()))
                return true;
            else
                return false;
        }
        if (first instanceof LispString && second instanceof LispString) {
            if (LispString.getValue(first).equalsIgnoreCase(LispString.getValue(second)))
                return true;
            else
                return false;
        }
        if (first instanceof Vector && second instanceof Vector) {
            if (first.length() != second.length())
                return false;
            Vector v1 = (Vector) first;
            Vector v2 = (Vector) second;
            for (int i = v1.length(); i-- > 0;)
                if (!equalp(v1.get(i), v2.get(i)))
                    return false;
            return true;
        }
        return false;
    }

    public static final Cons list(LispObject first, LispObject second)
    {
        return new Cons(first, new Cons(second));
    }

    public static final Cons list(LispObject first, LispObject second,
        LispObject third)
    {
        return new Cons(first, new Cons(second, new Cons(third)));
    }

    public static Symbol checkSymbol(LispObject obj) throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Symbol) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "symbol");
        }
    }

    public static Fixnum checkNumber(LispObject obj) throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Fixnum) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public static final Cons checkCons(LispObject obj) throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Cons) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "cons");
        }
    }

    public static final LispObject checkList(LispObject obj)
        throws LispError
    {
        if (obj.listp())
            return obj;
        throw new TypeError(obj, "list");
    }

    public static final SequenceType checkSequence(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (SequenceType) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "sequence");
        }
    }

    public static final AbstractArray checkArray(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (AbstractArray) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "array");
        }
    }

    public static final AbstractVector checkVector(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (AbstractVector) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "vector");
        }
    }

    public static final LispString checkString(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (LispString) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "string");
        }
    }

    public static final LispString string(LispObject arg) throws LispError
    {
        if (arg instanceof LispString)
            return (LispString) arg;
        if (arg.typep(Symbol.SYMBOL) != NIL)
            return new LispString(arg.getName());
        if (arg instanceof LispCharacter)
            return new LispString(((LispCharacter)arg).getValue());
        throw new LispError(String.valueOf(arg) +
                                " cannot be coerced to a string");
    }

    public static final LispObject number(long n)
    {
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
            return new Fixnum((int)n);
        return new Bignum(n);
    }

    private static final BigInteger ZERO    = BigInteger.valueOf(0);
    private static final BigInteger ONE     = BigInteger.valueOf(1);
    private static final BigInteger INT_MIN = BigInteger.valueOf(Integer.MIN_VALUE);
    private static final BigInteger INT_MAX = BigInteger.valueOf(Integer.MAX_VALUE);

    public static final LispObject number(BigInteger numerator,
        BigInteger denominator) throws LispError
    {
        if (denominator.equals(ZERO))
            throw new LispError("division by zero");
        if (denominator.signum() < 0) {
            numerator = numerator.negate();
            denominator = denominator.negate();
        }
        BigInteger gcd = numerator.gcd(denominator);
        if (!gcd.equals(ONE)) {
            numerator = numerator.divide(gcd);
            denominator = denominator.divide(gcd);
        }
        if (denominator.equals(ONE))
            return number(numerator);
        return new Ratio(numerator, denominator);
    }

    public static final LispObject number(BigInteger n)
    {
        if (n.compareTo(INT_MIN) >= 0 && n.compareTo(INT_MAX) <= 0)
            return new Fixnum(n.intValue());
        return new Bignum(n);
    }

    public static final int nameToChar(String s)
    {
        String lower = s.toLowerCase();
        if (lower.equals("space"))
            return ' ';
        if (lower.equals("tab"))
            return '\t';
        if (lower.equals("newline"))
            return'\n';
        if (lower.equals("linefeed"))
            return '\n';
        if (lower.equals("return"))
            return '\r';
        if (lower.equals("page"))
            return '\f';
        // Unknown.
        return -1;
    }

    public static final LispCharacter checkCharacter(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (LispCharacter) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "character");
        }
    }

    public static final Package checkPackage(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Package) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "package");
        }
    }

    public static final Function checkFunction(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Function) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "function");
        }
    }

    public static final LispStream checkStream(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (LispStream) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "stream");
        }
    }

    public static final CharacterInputStream checkInputStream(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (CharacterInputStream) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "input stream");
        }
    }

    public static final Readtable checkReadtable(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Readtable) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "readtable");
        }
    }

    public static final Environment checkEnvironment(LispObject obj)
        throws LispError
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Environment) obj;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "environment");
        }
    }

    // Packages.
    public static final Package PACKAGE_CL = Packages.getPackage("COMMON-LISP");
    public static final Package PACKAGE_CL_USER =
        Packages.getPackage("COMMON-LISP-USER");
    public static final Package PACKAGE_JAVA = Packages.getPackage("JAVA");
    static {
        try {
            PACKAGE_CL.addNickname("CL");
            PACKAGE_CL.addNickname("LISP");
            PACKAGE_CL_USER.addNickname("CL-USER");
            PACKAGE_CL_USER.addNickname("USER");
            PACKAGE_CL_USER.usePackage(PACKAGE_CL);
            PACKAGE_CL_USER.usePackage(PACKAGE_JAVA);
        }
        catch (LispError e) {
            e.printStackTrace();
        }
    }
    public static final Package PACKAGE_KEYWORD =
        Packages.getPackage("KEYWORD");

    public static final Symbol intern(String name, Package pkg)
    {
        return pkg.intern(name);
    }

    public static final Symbol export(String name, Package pkg)
    {
        Symbol symbol = pkg.intern(name);
        symbol.setExternal(true);
        return symbol;
    }

    // Export symbol from the COMMON-LISP package.
    public static final Symbol export(String name)
    {
        return export(name, PACKAGE_CL);
    }

    public static final Symbol internSpecial(String name, Package pkg,
        LispObject value)
    {
        Symbol symbol = pkg.intern(name);
        symbol.setSpecial(true);
        symbol.setSymbolValue(value);
        return symbol;
    }

    public static final Symbol exportSpecial(String name, Package pkg,
        LispObject value)
    {
        Symbol symbol = pkg.intern(name);
        symbol.setExternal(true);
        symbol.setSpecial(true);
        symbol.setSymbolValue(value);
        return symbol;
    }

    public static final Symbol exportConstant(String name, Package pkg,
        LispObject value)
    {
        Symbol symbol = pkg.intern(name);
        symbol.setExternal(true);
        symbol.setConstant(true);
        symbol.setSymbolValue(value);
        return symbol;
    }

    public static final LispObject unintern(Symbol symbol, Package pkg)
    {
        return pkg.unintern(symbol);
    }

    public static Symbol _DEFAULT_PATHNAME_DEFAULTS_ =
        exportSpecial("*DEFAULT-PATHNAME-DEFAULTS*", PACKAGE_CL,
            new LispString(System.getProperty("user.dir")));

    public static final Symbol _PACKAGE_ =
        exportSpecial("*PACKAGE*", PACKAGE_CL, PACKAGE_CL_USER);

    public static final Package getCurrentPackage() throws LispError
    {
        return (Package) _PACKAGE_.symbolValueNoThrow();
    }

    public static final Symbol _STANDARD_INPUT_ =
        exportSpecial("*STANDARD-INPUT*", PACKAGE_CL,
            new CharacterInputStream(System.in));

    public static final Symbol _STANDARD_OUTPUT_ =
        exportSpecial("*STANDARD-OUTPUT*", PACKAGE_CL,
            new CharacterOutputStream(System.out));

    public static final Symbol _ERROR_OUTPUT_ =
        exportSpecial("*ERROR-OUTPUT*", PACKAGE_CL,
            new CharacterOutputStream(System.out));

    public static final Symbol _TRACE_OUTPUT_ =
        exportSpecial("*TRACE-OUTPUT*", PACKAGE_CL,
            new CharacterOutputStream(System.out));

    public static final CharacterInputStream getStandardInput()
    {
        return (CharacterInputStream) _STANDARD_INPUT_.symbolValueNoThrow();
    }

    public static final CharacterOutputStream getStandardOutput()
    {
        return (CharacterOutputStream) _STANDARD_OUTPUT_.symbolValueNoThrow();
    }

    public static final CharacterOutputStream getTraceOutput()
    {
        return (CharacterOutputStream) _TRACE_OUTPUT_.symbolValueNoThrow();
    }

    public static final Symbol _READTABLE_ =
        exportSpecial("*READTABLE*", PACKAGE_CL, new Readtable());

    public static final Readtable getCurrentReadtable()
    {
        return (Readtable) _READTABLE_.symbolValueNoThrow();
    }

    public static final Symbol _READ_SUPPRESS_ =
        exportSpecial("*READ-SUPPRESS*", PACKAGE_CL, NIL);

    public static final Symbol MOST_POSITIVE_FIXNUM =
        exportConstant("MOST-POSITIVE-FIXNUM", PACKAGE_CL,
            new Fixnum(Integer.MAX_VALUE));

    public static final Symbol MOST_NEGATIVE_FIXNUM =
        exportConstant("MOST-NEGATIVE-FIXNUM", PACKAGE_CL,
            new Fixnum(Integer.MIN_VALUE));

    public static void exit()
    {
        Interpreter interpreter = Interpreter.getInstance();
        if (interpreter != null)
            interpreter.kill();
    }

    public static final Primitive0 DEBUG = new Primitive0("debug") {
        public LispObject execute() throws LispError
        {
            debug = true;
            return nothing();
        }
    };

    public static final Primitive0 NODEBUG = new Primitive0("nodebug") {
        public LispObject execute() throws LispError
        {
            if (debug) {
                debug = false;
                resetStack();
            }
            return nothing();
        }
    };

    private static boolean profiling;

    // ### start-profiler
    public static final Primitive0 START_PROFILER =
        new Primitive0("start-profiler") {
        public LispObject execute() throws LispError
        {
            CharacterOutputStream out = getStandardOutput();
            out.freshLine();
            if (!profiling) {
                Package[] packages = Packages.getAllPackages();
                for (int i = 0; i < packages.length; i++) {
                    Package pkg = packages[i];
                    Symbol[] symbols = pkg.symbols();
                    for (int j = 0; j < symbols.length; j++) {
                        Symbol symbol = symbols[j];
                        LispObject f = symbol.getSymbolFunction();
                        if (f != null)
                            f.setCallCount(0);
                    }
                }
                out.writeLine("; Profiling started.");
                out.finishOutput();
                profiling = true;
            } else {
                out.writeLine("; Profiling already enabled.");
                out.finishOutput();
            }
            return nothing();
        }
    };

    // ### stop-profiler
    public static final Primitive0 STOP_PROFILER =
        new Primitive0("stop-profiler") {
        public LispObject execute() throws LispError
        {
            CharacterOutputStream out = getStandardOutput();
            out.freshLine();
            if (profiling) {
                profiling = false;
                out.writeLine("; Profiling stopped.");
            } else
                out.writeLine("; Profiling not enabled.");
            out.finishOutput();
            return nothing();
        }
    };

    private static final void loadClass(String className)
    {
        try {
            Class.forName(className);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // ### t
    public static final Symbol T = export("T");
    static {
        T.setSymbolValue(T);
        T.setConstant(true);
    }

    public static final Symbol _PRINT_ESCAPE_ =
        exportSpecial("*PRINT-ESCAPE*", PACKAGE_CL, T);

    public static final Symbol _RANDOM_STATE_ =
        exportSpecial("*RANDOM-STATE*", PACKAGE_CL,
            new JavaObject(new Random()));

    static {
        loadClass("org.armedbear.lisp.Primitives");
        loadClass("org.armedbear.lisp.Extensions");
        loadClass("org.armedbear.lisp.Java");
        loadClass("org.armedbear.lisp.CompiledFunction");
    }
}
