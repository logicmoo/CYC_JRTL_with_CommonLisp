/*
 * Lisp.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Lisp.java,v 1.394 2005-09-29 18:31:34 piso Exp $
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

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.net.URL;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public abstract class Lisp
{
    protected static final boolean isJava15OrLater;
    static {
        String version = System.getProperty("java.version");
        isJava15OrLater = version.startsWith("1.5") || version.startsWith("1.6");
    }

    public static final boolean debug = true;

    public static boolean cold = true;

    public static boolean initialized;

    // Packages.
    public static final Package PACKAGE_CL =
        Packages.createPackage("COMMON-LISP", 1024);
    public static final Package PACKAGE_CL_USER =
        Packages.createPackage("COMMON-LISP-USER", 1024);
    public static final Package PACKAGE_KEYWORD =
        Packages.createPackage("KEYWORD", 1024);
    public static final Package PACKAGE_SYS =
        Packages.createPackage("SYSTEM");
    public static final Package PACKAGE_MOP =
        Packages.createPackage("MOP");
    public static final Package PACKAGE_TPL =
        Packages.createPackage("TOP-LEVEL");
    public static final Package PACKAGE_EXT =
        Packages.createPackage("EXTENSIONS");
    public static final Package PACKAGE_JVM =
        Packages.createPackage("JVM");
    public static final Package PACKAGE_LOOP =
        Packages.createPackage("LOOP");
    public static final Package PACKAGE_PROF =
        Packages.createPackage("PROFILER");
    public static final Package PACKAGE_JAVA =
        Packages.createPackage("JAVA");

    // ### nil
    public static final LispObject NIL = new Nil(PACKAGE_CL);

    // We need NIL before we can call usePackage().
    static {
        try {
            PACKAGE_CL.addNickname("CL");
            PACKAGE_CL_USER.addNickname("CL-USER");
            PACKAGE_CL_USER.usePackage(PACKAGE_CL);
            PACKAGE_CL_USER.usePackage(PACKAGE_EXT);
            PACKAGE_CL_USER.usePackage(PACKAGE_JAVA);
            PACKAGE_SYS.addNickname("SYS");
            PACKAGE_SYS.usePackage(PACKAGE_CL);
            PACKAGE_SYS.usePackage(PACKAGE_EXT);
            PACKAGE_MOP.usePackage(PACKAGE_CL);
            PACKAGE_MOP.usePackage(PACKAGE_EXT);
            PACKAGE_MOP.usePackage(PACKAGE_SYS);
            PACKAGE_TPL.addNickname("TPL");
            PACKAGE_TPL.usePackage(PACKAGE_CL);
            PACKAGE_TPL.usePackage(PACKAGE_EXT);
            PACKAGE_EXT.addNickname("EXT");
            PACKAGE_EXT.usePackage(PACKAGE_CL);
            PACKAGE_JVM.usePackage(PACKAGE_CL);
            PACKAGE_JVM.usePackage(PACKAGE_EXT);
            PACKAGE_JVM.usePackage(PACKAGE_SYS);
            PACKAGE_LOOP.usePackage(PACKAGE_CL);
            PACKAGE_PROF.addNickname("PROF");
            PACKAGE_PROF.usePackage(PACKAGE_CL);
            PACKAGE_PROF.usePackage(PACKAGE_EXT);
            PACKAGE_JAVA.usePackage(PACKAGE_CL);
            PACKAGE_JAVA.usePackage(PACKAGE_EXT);
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }

    // Constructing NIL forces the Symbol class to be loaded (since Nil extends
    // Symbol). The Symbol class defines a number of named Symbol objects so
    // they can be referred to in the Java code. addInitialExports() is careful
    // not to touch symbols that have already been defined, so the Java names
    // assigned in Symbol.java continue to reference the right Symbol objects.
    static {
        PACKAGE_CL.addInitialExports(Exports.COMMON_LISP_SYMBOL_NAMES);
    }

    // End-of-file marker.
    public static final LispObject EOF = new LispObject();

    public static boolean profiling;

    public static boolean sampling;

    public static volatile boolean sampleNow;

    // args must not be null!
    public static final LispObject funcall(LispObject fun, LispObject[] args,
                                           LispThread thread)
        throws ConditionThrowable
    {
        LispObject stack = thread.getStack();
        thread.pushStackFrame(fun, args);
        thread._values = null;
        LispObject result;
        if (profiling)
            if (!sampling)
                fun.incrementCallCount();
        try {
            switch (args.length) {
                case 0:
                    result = fun.execute();
                    break;
                case 1:
                    result = fun.execute(args[0]);
                    break;
                case 2:
                    result = fun.execute(args[0], args[1]);
                    break;
                case 3:
                    result = fun.execute(args[0], args[1], args[2]);
                    break;
                case 4:
                    result = fun.execute(args[0], args[1], args[2], args[3]);
                    break;
                case 5:
                    result = fun.execute(args[0], args[1], args[2], args[3],
                                         args[4]);
                    break;
                case 6:
                    result = fun.execute(args[0], args[1], args[2], args[3],
                                         args[4], args[5]);
                    break;
                case 7:
                    result = fun.execute(args[0], args[1], args[2], args[3],
                                         args[4], args[5], args[6]);
                    break;
                case 8:
                    result = fun.execute(args[0], args[1], args[2], args[3],
                                         args[4], args[5], args[6], args[7]);
                    break;
                default:
                    result = fun.execute(args);
                    break;
            }
        }
        finally {
            thread.setStack(stack);
        }
        return result;
    }

    public static final LispObject macroexpand(LispObject form,
                                               final Environment env,
                                               final LispThread thread)
        throws ConditionThrowable
    {
        LispObject expanded = NIL;
        while (true) {
            form = macroexpand_1(form, env, thread);
            LispObject[] values = thread.getValues();
            if (values[1] == NIL) {
                values[1] = expanded;
                return form;
            }
            expanded = T;
        }
    }

    public static final LispObject macroexpand_1(final LispObject form,
                                                 final Environment env,
                                                 final LispThread thread)
        throws ConditionThrowable
    {
        if (form instanceof Cons) {
            form.length(); // Force an error if form is not a proper list.
            LispObject car = ((Cons)form).car;
            if (car instanceof Symbol) {
                LispObject obj = env.lookupFunction(car);
                if (obj instanceof Autoload) {
                    Autoload autoload = (Autoload) obj;
                    autoload.load();
                    obj = car.getSymbolFunction();
                }
                if (obj instanceof SpecialOperator) {
                    obj = get(car, Symbol.MACROEXPAND_MACRO, null);
                    if (obj instanceof Autoload) {
                        Autoload autoload = (Autoload) obj;
                        autoload.load();
                        obj = get(car, Symbol.MACROEXPAND_MACRO, null);
                    }
                }
                if (obj instanceof MacroObject) {
                    LispObject expander = ((MacroObject)obj).getExpander();
                    if (profiling)
                        if (!sampling)
                            expander.incrementCallCount();
                    LispObject hook =
                        coerceToFunction(_MACROEXPAND_HOOK_.symbolValue(thread));
                    return thread.setValues(hook.execute(expander, form, env),
                                            T);
                }
            }
        } else if (form instanceof Symbol) {
            Symbol symbol = (Symbol) form;
            LispObject obj = null;
            if (symbol.isSpecialVariable())
                obj = thread.lookupSpecial(symbol);
            else
                obj = env.lookup(symbol);
            if (obj == null)
                obj = symbol.getSymbolValue();
            if (obj instanceof SymbolMacro)
                return thread.setValues(((SymbolMacro)obj).getExpansion(), T);
        }
        // Not a macro.
        return thread.setValues(form, NIL);
    }

    // ### interactive-eval
    private static final Primitive INTERACTIVE_EVAL =
        new Primitive("interactive-eval", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject object) throws ConditionThrowable
        {
            final LispThread thread = LispThread.currentThread();
            thread.setSpecialVariable(Symbol.MINUS, object);
            LispObject result;
            try {
                result = thread.execute(Symbol.EVAL.getSymbolFunction(), object);
            }
            catch (OutOfMemoryError e) {
                return signal(new LispError("Out of memory."));
            }
            catch (StackOverflowError e) {
                thread.setSpecialVariable(_SAVED_BACKTRACE_,
                                          thread.backtraceAsList(0));
                return signal(new StorageCondition("Stack overflow."));
            }
            catch (ConditionThrowable t) {
                throw t;
            }
            catch (Throwable t) {
                Debug.trace(t);
                thread.setSpecialVariable(_SAVED_BACKTRACE_,
                                          thread.backtraceAsList(0));
                return signal(new LispError("Caught " + t + "."));
            }
            Debug.assertTrue(result != null);
            thread.setSpecialVariable(Symbol.STAR_STAR_STAR,
                                      thread.safeSymbolValue(Symbol.STAR_STAR));
            thread.setSpecialVariable(Symbol.STAR_STAR,
                                      thread.safeSymbolValue(Symbol.STAR));
            thread.setSpecialVariable(Symbol.STAR, result);
            thread.setSpecialVariable(Symbol.PLUS_PLUS_PLUS,
                                      thread.safeSymbolValue(Symbol.PLUS_PLUS));
            thread.setSpecialVariable(Symbol.PLUS_PLUS,
                                      thread.safeSymbolValue(Symbol.PLUS));
            thread.setSpecialVariable(Symbol.PLUS,
                                      thread.safeSymbolValue(Symbol.MINUS));
            LispObject[] values = thread.getValues();
            thread.setSpecialVariable(Symbol.SLASH_SLASH_SLASH,
                                      thread.safeSymbolValue(Symbol.SLASH_SLASH));
            thread.setSpecialVariable(Symbol.SLASH_SLASH,
                                      thread.safeSymbolValue(Symbol.SLASH));
            if (values != null) {
                LispObject slash = NIL;
                for (int i = values.length; i-- > 0;)
                    slash = new Cons(values[i], slash);
                thread.setSpecialVariable(Symbol.SLASH, slash);
            } else
                thread.setSpecialVariable(Symbol.SLASH, new Cons(result));
            return result;
        }
    };

    public static final LispObject signal(LispObject condition)
        throws ConditionThrowable
    {
        return Symbol.SIGNAL.execute(condition);
    }

    public static final LispObject signal(LispObject condition, LispObject message)
        throws ConditionThrowable
    {
        return Symbol.SIGNAL.execute(condition, Keyword.MESSAGE, message);
    }

    public static final LispObject signalTypeError(LispObject datum,
                                                   LispObject expectedType)
        throws ConditionThrowable
    {
        return signal(new TypeError(datum, expectedType));
    }

    protected static volatile boolean interrupted;

    public static synchronized final void setInterrupted(boolean b)
    {
        interrupted = b;
    }

    public static final void handleInterrupt() throws ConditionThrowable
    {
        setInterrupted(false);
        Symbol.BREAK.getSymbolFunction().execute();
        setInterrupted(false);
    }

    // Used by the compiler.
    public static final LispObject loadTimeValue(LispObject obj)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        if (_LOAD_TRUENAME_.symbolValue(thread) != NIL)
            return eval(obj, new Environment(), thread);
        else
            return NIL;
    }

    public static final LispObject eval(LispObject obj)
        throws ConditionThrowable
    {
        return eval(obj, new Environment(), LispThread.currentThread());
    }

    public static final LispObject eval(final LispObject obj,
                                        final Environment env,
                                        final LispThread thread)
        throws ConditionThrowable
    {
        thread._values = null;
        if (interrupted)
            handleInterrupt();
        if (thread.isDestroyed())
            throw new ThreadDestroyed();
        if (obj instanceof Symbol) {
            LispObject result;
            if (obj.isSpecialVariable() || env.isDeclaredSpecial(obj))
                result = thread.lookupSpecial(obj);
            else
                result = env.lookup(obj);
            if (result == null) {
                result = obj.getSymbolValue();
                if (result == null)
                    return signal(new UnboundVariable(obj));
            }
            if (result instanceof SymbolMacro)
                return eval(((SymbolMacro)result).getExpansion(), env, thread);
            return result;
        } else if (obj instanceof Cons) {
            LispObject first = ((Cons)obj).car;
            if (first instanceof Symbol) {
                LispObject fun = env.lookupFunction(first);
                if (fun instanceof SpecialOperator) {
                    if (profiling)
                        if (!sampling)
                            fun.incrementCallCount();
                    // Don't eval args!
                    return fun.execute(((Cons)obj).cdr, env);
                }
                if (fun instanceof MacroObject)
                    return eval(macroexpand(obj, env, thread), env, thread);
                if (fun instanceof Autoload) {
                    Autoload autoload = (Autoload) fun;
                    autoload.load();
                    return eval(obj, env, thread);
                }
                if (fun == null)
                    return signal(new UndefinedFunction(first));
                return evalCall(fun, ((Cons)obj).cdr, env, thread);
            } else {
                if (first.car() == Symbol.LAMBDA) {
                    LispObject rest = first.cdr();
                    Closure closure = new Closure(first, env);
                    return evalCall(closure, ((Cons)obj).cdr, env, thread);
                } else
                    return signal(new ProgramError("Illegal function object: " +
                                                   first.writeToString()));
            }
        } else
            return obj;
    }

    public static final int CALL_REGISTERS_MAX = 8;

    private static final LispObject evalCall(LispObject function,
                                             LispObject args,
                                             Environment env,
                                             LispThread thread)
        throws ConditionThrowable
    {
        if (args == NIL)
            return thread.execute(function);
        LispObject first = eval(args.car(), env, thread);
        args = args.cdr();
        if (args == NIL) {
            thread._values = null;
            return thread.execute(function, first);
        }
        LispObject second = eval(args.car(), env, thread);
        args = args.cdr();
        if (args == NIL) {
            thread._values = null;
            return thread.execute(function, first, second);
        }
        LispObject third = eval(args.car(), env, thread);
        args = args.cdr();
        if (args == NIL) {
            thread._values = null;
            return thread.execute(function, first, second, third);
        }
        LispObject fourth = eval(args.car(), env, thread);
        args = args.cdr();
        if (args == NIL) {
            thread._values = null;
            return thread.execute(function, first, second, third, fourth);
        }
        LispObject fifth = eval(args.car(), env, thread);
        args = args.cdr();
        if (args == NIL) {
            thread._values = null;
            return thread.execute(function, first, second, third, fourth,
                                  fifth);
        }
        LispObject sixth = eval(args.car(), env, thread);
        args = args.cdr();
        if (args == NIL) {
            thread._values = null;
            return thread.execute(function, first, second, third, fourth,
                                  fifth, sixth);
        }
        LispObject seventh = eval(args.car(), env, thread);
        args = args.cdr();
        if (args == NIL) {
            thread._values = null;
            return thread.execute(function, first, second, third, fourth,
                                  fifth, sixth, seventh);
        }
        LispObject eighth = eval(args.car(), env, thread);
        args = args.cdr();
        if (args == NIL) {
            thread._values = null;
            return thread.execute(function, first, second, third, fourth,
                                  fifth, sixth, seventh, eighth);
        }
        // More than CALL_REGISTERS_MAX arguments.
        final int length = args.length() + CALL_REGISTERS_MAX;
        LispObject[] array = new LispObject[length];
        array[0] = first;
        array[1] = second;
        array[2] = third;
        array[3] = fourth;
        array[4] = fifth;
        array[5] = sixth;
        array[6] = seventh;
        array[7] = eighth;
        for (int i = CALL_REGISTERS_MAX; i < length; i++) {
            array[i] = eval(args.car(), env, thread);
            args = args.cdr();
        }
        thread._values = null;
        return thread.execute(function, array);
    }

    public static final LispObject progn(LispObject body, Environment env,
                                         LispThread thread)
        throws ConditionThrowable
    {
        LispObject result = NIL;
        while (body != NIL) {
            result = eval(body.car(), env, thread);
            body = body.cdr();
        }
        return result;
    }

    // Environment wrappers.
    public static final void bind(Symbol symbol, LispObject value,
                                  Environment env)
        throws ConditionThrowable
    {
        if (symbol.isSpecialVariable() || env.isDeclaredSpecial(symbol))
            LispThread.currentThread().bindSpecial(symbol, value);
        else
            env.bind(symbol, value);
    }

    public static final Cons list1(LispObject obj1)
    {
        return new Cons(obj1);
    }

    public static final Cons list2(LispObject obj1, LispObject obj2)
    {
        return new Cons(obj1, new Cons(obj2));
    }

    public static final Cons list3(LispObject obj1, LispObject obj2,
                                   LispObject obj3)
    {
        return new Cons(obj1, new Cons(obj2, new Cons(obj3)));
    }

    public static final Cons list4(LispObject obj1, LispObject obj2,
                                   LispObject obj3, LispObject obj4)
    {
        return new Cons(obj1,
                        new Cons(obj2,
                                 new Cons(obj3,
                                          new Cons(obj4))));
    }

    public static final Cons list5(LispObject obj1, LispObject obj2,
                                   LispObject obj3, LispObject obj4,
                                   LispObject obj5)
    {
        return new Cons(obj1,
                        new Cons(obj2,
                                 new Cons(obj3,
                                          new Cons(obj4,
                                                   new Cons(obj5)))));
    }

    public static final Cons list6(LispObject obj1, LispObject obj2,
                                   LispObject obj3, LispObject obj4,
                                   LispObject obj5, LispObject obj6)
    {
        return new Cons(obj1,
                        new Cons(obj2,
                                 new Cons(obj3,
                                          new Cons(obj4,
                                                   new Cons(obj5,
                                                            new Cons(obj6))))));
    }

    public static final Cons list7(LispObject obj1, LispObject obj2,
                                   LispObject obj3, LispObject obj4,
                                   LispObject obj5, LispObject obj6,
                                   LispObject obj7)
    {
        return new Cons(obj1,
                        new Cons(obj2,
                                 new Cons(obj3,
                                          new Cons(obj4,
                                                   new Cons(obj5,
                                                            new Cons(obj6,
                                                                     new Cons(obj7)))))));
    }

    public static final Cons list8(LispObject obj1, LispObject obj2,
                                   LispObject obj3, LispObject obj4,
                                   LispObject obj5, LispObject obj6,
                                   LispObject obj7, LispObject obj8)
    {
        return new Cons(obj1,
                        new Cons(obj2,
                                 new Cons(obj3,
                                          new Cons(obj4,
                                                   new Cons(obj5,
                                                            new Cons(obj6,
                                                                     new Cons(obj7,
                                                                              new Cons(obj8))))))));
    }

    public static final Cons list9(LispObject obj1, LispObject obj2,
                                   LispObject obj3, LispObject obj4,
                                   LispObject obj5, LispObject obj6,
                                   LispObject obj7, LispObject obj8,
                                   LispObject obj9)
    {
        return new Cons(obj1,
                        new Cons(obj2,
                                 new Cons(obj3,
                                          new Cons(obj4,
                                                   new Cons(obj5,
                                                            new Cons(obj6,
                                                                     new Cons(obj7,
                                                                              new Cons(obj8,
                                                                                       new Cons(obj9)))))))));
    }

    // Used by the compiler.
    public static final LispObject multipleValueList(LispObject result)
        throws ConditionThrowable
    {
        LispThread thread = LispThread.currentThread();
        LispObject[] values = thread.getValues();
        if (values == null)
            return new Cons(result);
        thread.clearValues();
        LispObject list = NIL;
        for (int i = values.length; i-- > 0;)
            list = new Cons(values[i], list);
        return list;
    }

    // Used by the compiler for MULTIPLE-VALUE-CALLs with a single values form.
    public static final LispObject multipleValueCall1(LispObject result,
                                                      LispObject function,
                                                      LispThread thread)
        throws ConditionThrowable
    {
        LispObject[] values = thread.getValues();
        thread.clearValues();
        if (values == null)
            return thread.execute(coerceToFunction(function), result);
        else
            return funcall(coerceToFunction(function), values, thread);
    }

    public static final void progvBindVars(LispObject symbols,
                                           LispObject values,
                                           LispThread thread)
        throws ConditionThrowable
    {
        for (LispObject list = symbols; list != NIL; list = list.cdr()) {
            Symbol symbol = checkSymbol(list.car());
            LispObject value;
            if (values != NIL) {
                value = values.car();
                values = values.cdr();
            } else {
                // "If too few values are supplied, the remaining symbols are
                // bound and then made to have no value."
                value = null;
            }
            thread.bindSpecial(symbol, value);
        }
    }

    public static Symbol checkSymbol(LispObject obj) throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Symbol) obj;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.SYMBOL);
            // Not reached.
            return null;
        }
    }

    public static final LispObject checkList(LispObject obj)
        throws ConditionThrowable
    {
        if (obj.listp())
            return obj;
        return signalTypeError(obj, Symbol.LIST);
    }

    public static final AbstractArray checkArray(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (AbstractArray) obj;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.ARRAY);
            // Not reached.
            return null;
        }
    }

    public static final AbstractVector checkVector(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (AbstractVector) obj;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.VECTOR);
            // Not reached.
            return null;
        }
    }

    // ### *gensym-counter*
    private static final Symbol _GENSYM_COUNTER_ =
        exportSpecial("*GENSYM-COUNTER*", PACKAGE_CL, Fixnum.ZERO);

    public static final Symbol gensym(LispThread thread)
        throws ConditionThrowable
    {
        return gensym("G", thread);
    }

    public static final Symbol gensym(String prefix, LispThread thread)
        throws ConditionThrowable
    {
        FastStringBuffer sb = new FastStringBuffer(prefix);
        SpecialBinding binding = thread.getSpecialBinding(_GENSYM_COUNTER_);
        final LispObject oldValue;
        if (binding != null)
            oldValue = binding.value;
        else
            oldValue = _GENSYM_COUNTER_.getSymbolValue();
        // Decimal representation.
        if (oldValue instanceof Fixnum)
            sb.append(((Fixnum)oldValue).value);
        else if (oldValue instanceof Bignum)
            sb.append(((Bignum)oldValue).value.toString());
        else {
            // Restore sanity.
            if (binding != null)
                binding.value = Fixnum.ZERO;
            else
                _GENSYM_COUNTER_.setSymbolValue(Fixnum.ZERO);
            signal(new TypeError("The value of *GENSYM-COUNTER* was not a nonnegative integer. Old value: " +
                                 oldValue.writeToString() + " New value: 0"));
        }
        if (binding != null)
            binding.value = oldValue.incr();
        else
            _GENSYM_COUNTER_.setSymbolValue(oldValue.incr());
        return new Symbol(new SimpleString(sb));
    }

    public static final String javaString(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof AbstractString)
            return arg.getStringValue();
        if (arg instanceof Symbol)
            return ((Symbol)arg).getName();
        if (arg instanceof LispCharacter)
            return String.valueOf(new char[] {((LispCharacter)arg).value});
        signalTypeError(arg, list4(Symbol.OR, Symbol.STRING, Symbol.SYMBOL,
                                   Symbol.CHARACTER));
        // Not reached.
        return null;
    }

    public static final LispObject number(long n)
    {
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
            return new Fixnum((int)n);
        else
            return new Bignum(n);
    }

    private static final BigInteger INT_MIN = BigInteger.valueOf(Integer.MIN_VALUE);
    private static final BigInteger INT_MAX = BigInteger.valueOf(Integer.MAX_VALUE);

    public static final LispObject number(BigInteger numerator,
                                          BigInteger denominator)
        throws ConditionThrowable
    {
        if (denominator.signum() == 0)
            signal(new DivisionByZero());
        if (denominator.signum() < 0) {
            numerator = numerator.negate();
            denominator = denominator.negate();
        }
        BigInteger gcd = numerator.gcd(denominator);
        if (!gcd.equals(BigInteger.ONE)) {
            numerator = numerator.divide(gcd);
            denominator = denominator.divide(gcd);
        }
        if (denominator.equals(BigInteger.ONE))
            return number(numerator);
        else
            return new Ratio(numerator, denominator);
    }

    public static final LispObject number(BigInteger n)
    {
        if (n.compareTo(INT_MIN) >= 0 && n.compareTo(INT_MAX) <= 0)
            return new Fixnum(n.intValue());
        else
            return new Bignum(n);
    }

    public static final int mod(int number, int divisor)
        throws ConditionThrowable
    {
        final int r;
        try {
            r = number % divisor;
        }
        catch (ArithmeticException e) {
            signal(new ArithmeticError("Division by zero."));
            // Not reached.
            return 0;
        }
        if (r == 0)
            return r;
        if (divisor < 0) {
            if (number > 0)
                return r + divisor;
        } else {
            if (number < 0)
                return r + divisor;
        }
        return r;
    }

    // Adapted from SBCL.
    public static final int mix(long x, long y)
    {
        long xy = x * 3 + y;
        return (int) (536870911L & (441516657L ^ xy ^ (xy >> 5)));
    }

    // Used by the compiler.
    public static final LispObject readObjectFromString(String s)
    {
        try {
            return new StringInputStream(s).faslRead(true, NIL, false);
        }
        catch (Throwable t) {
            return null;
        }
    }

    public static final LispObject loadCompiledFunction(final String namestring)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        final boolean absolute = Utilities.isFilenameAbsolute(namestring);
        LispObject device = NIL;
        final Pathname defaultPathname;
        if (absolute) {
            defaultPathname = Pathname.coerceToPathname(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue(thread));
        } else {
            LispObject loadTruename = _LOAD_TRUENAME_.symbolValue(thread);
            if (loadTruename instanceof Pathname) {
                defaultPathname = (Pathname) loadTruename;
                // We're loading a file.
                device = ((Pathname)loadTruename).getDevice();
            } else
                defaultPathname = Pathname.coerceToPathname(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue(thread));
        }
        if (device instanceof Pathname) {
            // We're loading a fasl from j.jar.
            URL url = Lisp.class.getResource(namestring);
            if (url != null) {
                try {
                    String s = url.toString();
                    String zipFileName;
                    String entryName;
                    if (s.startsWith("jar:file:")) {
                        s = s.substring(9);
                        int index = s.lastIndexOf('!');
                        if (index >= 0) {
                            zipFileName = s.substring(0, index);
                            entryName = s.substring(index + 1);
                            if (entryName.startsWith("/"))
                                entryName = entryName.substring(1);
                            if (Utilities.isPlatformWindows) {
                                // "/C:/Documents%20and%20Settings/peter/Desktop/j.jar"
                                if (zipFileName.length() > 0 && zipFileName.charAt(0) == '/')
                                    zipFileName = zipFileName.substring(1);
                                // "C:/Documents%20and%20Settings/peter/Desktop/j.jar"
                                int i = zipFileName.indexOf("%20");
                                if (i >= 0) {
                                    int begin = 0;
                                    FastStringBuffer sb = new FastStringBuffer();
                                    while (i >= 0) {
                                        sb.append(zipFileName.substring(begin, i));
                                        sb.append(' ');
                                        begin = i + 3;
                                        i = zipFileName.indexOf("%20", begin);
                                    }
                                    sb.append(zipFileName.substring(begin));
                                    zipFileName = sb.toString();
                                    // "C:/Documents and Settings/peter/Desktop/j.jar"
                                }
                            }
                            ZipFile zipFile = new ZipFile(zipFileName);
                            try {
                                ZipEntry entry = zipFile.getEntry(entryName);
                                if (entry != null) {
                                    long size = entry.getSize();
                                    InputStream in = zipFile.getInputStream(entry);
                                    byte[] bytes = new byte[(int)size];
                                    int bytesRemaining = (int) size;
                                    int bytesRead = 0;
                                    while (bytesRemaining > 0) {
                                        int n;
                                        if (bytesRemaining >= 4096)
                                            n = in.read(bytes, bytesRead, 4096);
                                        else
                                            n = in.read(bytes, bytesRead, bytesRemaining);
                                        if (n < 0)
                                            break;
                                        bytesRead += n;
                                        bytesRemaining -= n;
                                    }
                                    in.close();
                                    if (bytesRemaining > 0)
                                        Debug.trace("bytesRemaining = " + bytesRemaining);
                                    JavaClassLoader loader = new JavaClassLoader();
                                    Class c =
                                        loader.loadClassFromByteArray(null, bytes, 0, bytes.length);
                                    if (c != null) {
                                        Class[] parameterTypes = new Class[0];
                                        Constructor constructor =
                                            c.getConstructor(parameterTypes);
                                        Object[] initargs = new Object[0];
                                        LispObject obj =
                                            (LispObject) constructor.newInstance(initargs);
                                        if (obj instanceof Function)
                                            ((Function)obj).setClassBytes(bytes);
                                        return obj != null ? obj : NIL;
                                    }
                                }
                            }
                            finally {
                                zipFile.close();
                            }
                        }
                    }
                }
                catch (VerifyError e) {
                    return signal(new LispError("Class verification failed: " +
                                                e.getMessage()));
                }
                catch (IOException e) {
                    Debug.trace(e);
                }
                catch (Throwable t) {
                    Debug.trace(t);
                }
            }
            return signal(new LispError("Unable to load " + namestring));
        }

        Pathname pathname = new Pathname(namestring);
        final File file = Utilities.getFile(pathname, defaultPathname);
        if (file != null && file.isFile()) {
            // The .cls file exists.
            try {
                LispObject obj = loadCompiledFunction(new FileInputStream(file),
                                                      (int) file.length());
                // FIXME close stream!
                if (obj != null)
                    return obj;

                Debug.trace("Unable to load " + namestring);
                return signal(new LispError("Unable to load " + namestring));

            }
            catch (VerifyError e) {
                return signal(new LispError("Class verification failed: " +
                                            e.getMessage()));
            }
            catch (Throwable t) {
                Debug.trace(t);
            }
            return signal(new LispError("Unable to load " +
                                        pathname.writeToString()));
        }

        try {
            LispObject loadTruename = _LOAD_TRUENAME_.symbolValue(thread);
            String zipFileName = ((Pathname)loadTruename).getNamestring();
            ZipFile zipFile = new ZipFile(zipFileName);
            try {
                ZipEntry entry = zipFile.getEntry(namestring);
                if (entry != null) {
                    LispObject obj = loadCompiledFunction(zipFile.getInputStream(entry),
                                                          (int) entry.getSize());
                    if (obj != null)
                        return obj;
                    Debug.trace("Unable to load " + namestring);
                    return signal(new LispError("Unable to load " + namestring));
                }
            }
            finally {
                zipFile.close();
            }
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
        return signal(new FileError("File not found: " + namestring,
                                    new Pathname(namestring)));
    }

    private static final LispObject loadCompiledFunction(InputStream in, int size)
    {
        try {
            byte[] bytes = new byte[size];
            int bytesRemaining = size;
            int bytesRead = 0;
            while (bytesRemaining > 0) {
                int n = in.read(bytes, bytesRead, bytesRemaining);
                if (n < 0)
                    break;
                bytesRead += n;
                bytesRemaining -= n;
            }
            in.close();
            if (bytesRemaining > 0)
                Debug.trace("bytesRemaining = " + bytesRemaining);

            JavaClassLoader loader = new JavaClassLoader();
            Class c =
                loader.loadClassFromByteArray(null, bytes, 0, bytes.length);
            if (c != null) {
                Class[] parameterTypes = new Class[0];
                Constructor constructor =
                    c.getConstructor(parameterTypes);
                Object[] initargs = new Object[0];
                LispObject obj =
                    (LispObject) constructor.newInstance(initargs);
                if (obj instanceof Function)
                    ((Function)obj).setClassBytes(bytes);
                return obj;
            }
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
        return null;
    }

    public static final LispObject makeCompiledClosure(LispObject ctf,
                                                       LispObject[] context)
    {
        return new CompiledClosure((ClosureTemplateFunction)ctf, context);
    }

    public static final String safeWriteToString(LispObject obj)
    {
        try {
            return obj.writeToString();
        }
        catch (ConditionThrowable t) {
            return obj.toString();
        }
        catch (NullPointerException e) {
            Debug.trace(e);
            return "null";
        }
    }

    public static final boolean isValidSetfFunctionName(LispObject obj)
    {
        if (obj instanceof Cons) {
            Cons cons = (Cons) obj;
            if (cons.car == Symbol.SETF && cons.cdr instanceof Cons) {
                Cons cdr = (Cons) cons.cdr;
                if (cdr.car != NIL && cdr.cdr == NIL)
                    return (cdr.car instanceof Symbol);
            }
        }
        return false;
    }

    public static final LispObject FUNCTION_NAME =
        list3(Symbol.OR,
              Symbol.SYMBOL,
              list3(Symbol.CONS,
                    list2(Symbol.EQL, Symbol.SETF),
                    list3(Symbol.CONS, Symbol.SYMBOL, Symbol.NULL)));

    public static final LispObject UNSIGNED_BYTE_8 =
        list2(Symbol.UNSIGNED_BYTE, new Fixnum(8));

    public static final LispObject UNSIGNED_BYTE_16 =
        list2(Symbol.UNSIGNED_BYTE, new Fixnum(16));

    public static final LispObject UNSIGNED_BYTE_32 =
        list2(Symbol.UNSIGNED_BYTE, new Fixnum(32));

    public static final LispObject UNSIGNED_BYTE_32_MAX_VALUE =
        new Bignum(4294967296L);

    public static final LispObject getUpgradedArrayElementType(LispObject type)
        throws ConditionThrowable
    {
        if (type instanceof Symbol) {
            if (type == Symbol.CHARACTER ||
                type == Symbol.BASE_CHAR ||
                type == Symbol.STANDARD_CHAR)
                return Symbol.CHARACTER;
            if (type == Symbol.BIT)
                return Symbol.BIT;
            if (type == NIL)
                return NIL;
        }
        if (type == BuiltInClass.CHARACTER)
            return Symbol.CHARACTER;
        if (type instanceof Cons) {
            if (type.equal(UNSIGNED_BYTE_8))
                return type;
            if (type.equal(UNSIGNED_BYTE_16))
                return type;
            if (type.equal(UNSIGNED_BYTE_32))
                return type;
            LispObject car = type.car();
            if (car == Symbol.INTEGER) {
                LispObject lower = type.cadr();
                LispObject upper = type.cdr().cadr();
                // Convert to inclusive bounds.
                if (lower instanceof Cons)
                    lower = lower.car().incr();
                if (upper instanceof Cons)
                    upper = upper.car().decr();
                if (lower.integerp() && upper.integerp()) {
                    if (lower instanceof Fixnum && upper instanceof Fixnum) {
                        int l = ((Fixnum)lower).value;
                        if (l >= 0) {
                            int u = ((Fixnum)upper).value;
                            if (u <= 1)
                                return Symbol.BIT;
                            if (u <= 255)
                                return UNSIGNED_BYTE_8;
                            if (u <= 65535)
                                return UNSIGNED_BYTE_16;
                            return UNSIGNED_BYTE_32;
                        }
                    }
                    if (lower.isGreaterThanOrEqualTo(Fixnum.ZERO)) {
                        if (lower.isLessThan(UNSIGNED_BYTE_32_MAX_VALUE)) {
                            if (upper.isLessThan(UNSIGNED_BYTE_32_MAX_VALUE))
                                return UNSIGNED_BYTE_32;
                        }
                    }
                }
            } else if (car == Symbol.EQL) {
                LispObject obj = type.cadr();
                if (obj instanceof Fixnum) {
                    int val = ((Fixnum)obj).value;
                    if (val >= 0) {
                        if (val <= 1)
                            return Symbol.BIT;
                        if (val <= 255)
                            return UNSIGNED_BYTE_8;
                        if (val <= 65535)
                            return UNSIGNED_BYTE_16;
                        return UNSIGNED_BYTE_32;
                    }
                } else if (obj instanceof Bignum) {
                    if (obj.isGreaterThanOrEqualTo(Fixnum.ZERO)) {
                        if (obj.isLessThan(UNSIGNED_BYTE_32_MAX_VALUE))
                            return UNSIGNED_BYTE_32;
                    }
                }
            }
        }
        return T;
    }

    public static final byte coerceLispObjectToJavaByte(LispObject obj)
        throws ConditionThrowable
    {
        try {
            return (byte) ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.FIXNUM);
            // Not reached.
            return 0;
        }
    }

    public static final LispObject coerceJavaByteToLispObject(byte b)
    {
        return new Fixnum(((int)b) & 0xff);
    }

    public static final LispCharacter checkCharacter(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (LispCharacter) obj;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.CHARACTER);
            // Not reached.
            return null;
        }
    }

    public static final Package checkPackage(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Package) obj;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.PACKAGE);
            // Not reached.
            return null;
        }
    }

    public static final Function checkFunction(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Function) obj;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.FUNCTION);
            // Not reached.
            return null;
        }
    }

    public static final Stream checkStream(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Stream) obj;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.STREAM);
            // Not reached.
            return null;
        }
    }

    public static final Stream checkCharacterInputStream(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            final Stream stream = (Stream) obj;
            if (stream.isCharacterInputStream())
                return stream;
            signal(new TypeError("The value " + obj.writeToString() +
                                 " is not a character input stream."));
            // Not reached.
            return null;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.STREAM);
            // Not reached.
            return null;
        }
    }

    public static final Stream checkCharacterOutputStream(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            final Stream stream = (Stream) obj;
            if (stream.isCharacterOutputStream())
                return stream;
            signal(new TypeError("The value " + obj.writeToString() +
                                 " is not a character output stream."));
            // Not reached.
            return null;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.STREAM);
            // Not reached.
            return null;
        }
    }

    public static final Stream checkBinaryInputStream(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            final Stream stream = (Stream) obj;
            if (stream.isBinaryInputStream())
                return stream;
            signal(new TypeError("The value " + obj.writeToString() +
                                 " is not a binary input stream."));
            // Not reached.
            return null;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.STREAM);
            // Not reached.
            return null;
        }
    }

    public static final Stream inSynonymOf(LispObject obj)
        throws ConditionThrowable
    {
        if (obj instanceof Stream)
            return (Stream) obj;
        if (obj == T)
            return checkCharacterInputStream(_TERMINAL_IO_.symbolValue());
        if (obj == NIL)
            return checkCharacterInputStream(_STANDARD_INPUT_.symbolValue());
        signalTypeError(obj, Symbol.STREAM);
        // Not reached.
        return null;
    }

    public static final Stream outSynonymOf(LispObject obj)
        throws ConditionThrowable
    {
        if (obj instanceof Stream)
            return (Stream) obj;
        if (obj == T)
            return checkCharacterOutputStream(_TERMINAL_IO_.symbolValue());
        if (obj == NIL)
            return checkCharacterOutputStream(_STANDARD_OUTPUT_.symbolValue());
        signalTypeError(obj, Symbol.STREAM);
        // Not reached.
        return null;
    }

    public static final void writeByte(int n, LispObject obj)
        throws ConditionThrowable
    {
        if (n < 0 || n > 255)
            signalTypeError(new Fixnum(n), UNSIGNED_BYTE_8);
        try {
            ((Stream)obj)._writeByte(n);
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.STREAM);
        }
    }

    public static final Readtable checkReadtable(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Readtable) obj;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.READTABLE);
            // Not reached.
            return null;
        }
    }

    public static final Environment checkEnvironment(LispObject obj)
        throws ConditionThrowable
    {
        if (obj == null)
            throw new NullPointerException();
        try {
            return (Environment) obj;
        }
        catch (ClassCastException e) {
            signalTypeError(obj, Symbol.ENVIRONMENT);
            // Not reached.
            return null;
        }
    }

    public static final void checkBounds(int start, int end, int length)
        throws ConditionThrowable
    {
        if (start < 0 || end < 0 || start > end || end > length) {
            FastStringBuffer sb = new FastStringBuffer("The bounding indices ");
            sb.append(start);
            sb.append(" and ");
            sb.append(end);
            sb.append(" are bad for a sequence of length ");
            sb.append(length);
            sb.append('.');
            signal(new TypeError(sb.toString()));
        }
    }

    public static final LispObject coerceToFunction(LispObject obj)
        throws ConditionThrowable
    {
        if (obj instanceof Function)
            return obj;
        if (obj instanceof StandardGenericFunction)
            return obj;
        if (obj instanceof Symbol) {
            LispObject fun = obj.getSymbolFunction();
            if (fun instanceof Function)
                return (Function) fun;
        } else if (obj instanceof Cons && obj.car() == Symbol.LAMBDA)
            return new Closure(obj, new Environment());
        signal(new UndefinedFunction(obj));
        // Not reached.
        return null;
    }

    // Returns package or throws exception.
    public static final Package coerceToPackage(LispObject obj)
        throws ConditionThrowable
    {
        if (obj instanceof Package)
            return (Package) obj;
        Package pkg = Packages.findPackage(javaString(obj));
        if (pkg != null)
            return pkg;
        signal(new PackageError(obj.writeToString() + " is not the name of a package."));
        // Not reached.
        return null;
    }

    public LispObject assq(LispObject item, LispObject alist)
        throws ConditionThrowable
    {
        while (alist instanceof Cons) {
            LispObject entry = ((Cons)alist).car;
            if (entry instanceof Cons) {
                if (((Cons)entry).car == item)
                    return entry;
            } else if (entry != NIL)
                return signalTypeError(entry, Symbol.CONS);
            alist = ((Cons)alist).cdr;
        }
        if (alist != NIL)
            return signalTypeError(alist, Symbol.LIST);
        return NIL;
    }

    public static final boolean memq(LispObject item, LispObject listArg)
        throws ConditionThrowable
    {
        LispObject list = listArg;
        while (list instanceof Cons) {
            if (item == ((Cons)list).car)
                return true;
            list = ((Cons)list).cdr;
        }
        if (list != NIL)
            signalTypeError(list, Symbol.LIST);
        return false;
    }

    public static final boolean memql(LispObject item, LispObject listArg)
        throws ConditionThrowable
    {
        LispObject list = listArg;
        while (list instanceof Cons) {
            if (item.eql(((Cons)list).car))
                return true;
            list = ((Cons)list).cdr;
        }
        if (list != NIL)
            signal(new TypeError("The value " + listArg.writeToString() +
                                 " is not a proper list."));
        return false;
    }

    // Property lists.
    public static final LispObject getf(LispObject plist, LispObject indicator,
                                        LispObject defaultValue)
        throws ConditionThrowable
    {
        LispObject list = plist;
        while (list != NIL) {
            if (list.car() == indicator)
                return list.cadr();
            if (list.cdr() instanceof Cons)
                list = list.cddr();
            else
                return signal(new TypeError("Malformed property list: " +
                                            plist.writeToString()));
        }
        return defaultValue;
    }

    public static final LispObject get(LispObject symbol, LispObject indicator,
                                       LispObject defaultValue)
        throws ConditionThrowable
    {
        LispObject list;
        try {
            list = ((Symbol)symbol).getPropertyList();
        }
        catch (ClassCastException e) {
            return signalTypeError(symbol, Symbol.SYMBOL);
        }
        while (list != NIL) {
            if (list.car() == indicator)
                return list.cadr();
            list = list.cddr();
        }
        return defaultValue;
    }

    public static final LispObject put(Symbol symbol, LispObject indicator,
                                       LispObject value)
        throws ConditionThrowable
    {
        LispObject list = symbol.getPropertyList();
        while (list != NIL) {
            if (list.car() == indicator) {
                // Found it!
                LispObject rest = list.cdr();
                rest.setCar(value);
                return value;
            }
            list = list.cddr();
        }
        // Not found.
        symbol.setPropertyList(new Cons(indicator,
                                        new Cons(value,
                                                 symbol.getPropertyList())));
        return value;
    }

    public static final LispObject putf(LispObject plist, LispObject indicator,
                                        LispObject value)
        throws ConditionThrowable
    {
        LispObject list = plist;
        while (list != NIL) {
            if (list.car() == indicator) {
                // Found it!
                LispObject rest = list.cdr();
                rest.setCar(value);
                return plist;
            }
            list = list.cddr();
        }
        // Not found.
        return new Cons(indicator, new Cons(value, plist));
    }

    public static final LispObject remprop(Symbol symbol, LispObject indicator)
        throws ConditionThrowable
    {
        LispObject list = checkList(symbol.getPropertyList());
        LispObject prev = null;
        while (list != NIL) {
            if (!(list.cdr() instanceof Cons))
                signal(new ProgramError("The symbol " + symbol.writeToString() +
                                        " has an odd number of items in its property list."));
            if (list.car() == indicator) {
                // Found it!
                if (prev != null)
                    prev.setCdr(list.cddr());
                else
                    symbol.setPropertyList(list.cddr());
                return T;
            }
            prev = list.cdr();
            list = list.cddr();
        }
        // Not found.
        return NIL;
    }

    public static final String format(LispObject formatControl,
                                      LispObject formatArguments)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        String control = formatControl.getStringValue();
        LispObject[] args = formatArguments.copyToArray();
        StringBuffer sb = new StringBuffer();
        if (control != null) {
            final int limit = control.length();
            int j = 0;
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
                            SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
                            thread.bindSpecial(_PRINT_ESCAPE_, NIL);
                            thread.bindSpecial(_PRINT_READABLY_, NIL);
                            sb.append(obj.writeToString());
                            thread.lastSpecialBinding = lastSpecialBinding;
                        }
                    } else if (c == 'S' || c == 's') {
                        if (j < args.length) {
                            LispObject obj = args[j++];
                            SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
                            thread.bindSpecial(_PRINT_ESCAPE_, T);
                            sb.append(obj.writeToString());
                            thread.lastSpecialBinding = lastSpecialBinding;
                        }
                    } else if (c == 'D' || c == 'd') {
                        if (j < args.length) {
                            LispObject obj = args[j++];
                            SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
                            thread.bindSpecial(_PRINT_ESCAPE_, NIL);
                            thread.bindSpecial(_PRINT_RADIX_, NIL);
                            thread.bindSpecial(_PRINT_BASE_, new Fixnum(10));
                            sb.append(obj.writeToString());
                            thread.lastSpecialBinding = lastSpecialBinding;
                        }
                    } else if (c == 'X' || c == 'x') {
                        if (j < args.length) {
                            LispObject obj = args[j++];
                            SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
                            thread.bindSpecial(_PRINT_ESCAPE_, NIL);
                            thread.bindSpecial(_PRINT_RADIX_, NIL);
                            thread.bindSpecial(_PRINT_BASE_, new Fixnum(16));
                            sb.append(obj.writeToString());
                            thread.lastSpecialBinding = lastSpecialBinding;
                        }
                    } else if (c == '%') {
                        sb.append('\n');
                    }
                    state = NEUTRAL;
                } else {
                    // There are no other valid states.
                    Debug.assertTrue(false);
                }
            }
        }
        return sb.toString();
    }

    public static final Symbol intern(String name, Package pkg)
    {
        return pkg.intern(name);
    }

    // Used by the compiler.
    public static final Symbol internInPackage(String name, String packageName)
        throws ConditionThrowable
    {
        Package pkg = Packages.findPackage(packageName);
        if (pkg == null)
            signal(new LispError(packageName + " is not the name of a package."));
        return pkg.intern(name);
    }

    // The compiler's object table.
    private static final Hashtable objectTable = new Hashtable();

    public static final LispObject recall(SimpleString key)
    {
        return (LispObject) objectTable.remove(key.getStringValue());
    }

    public static final Primitive REMEMBER =
        new Primitive("remember", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject key, LispObject value)
            throws ConditionThrowable
        {
            objectTable.put(key.getStringValue(), value);
            return NIL;
        }
    };

    public static final Symbol internSpecial(String name, Package pkg,
                                             LispObject value)
    {
        Symbol symbol = pkg.intern(name);
        symbol.setSpecial(true);
        symbol.setSymbolValue(value);
        return symbol;
    }

    public static final Symbol internConstant(String name, Package pkg,
                                              LispObject value)
    {
        Symbol symbol = pkg.intern(name);
        symbol.setSpecial(true);
        symbol.setSymbolValue(value);
        symbol.setConstant(true);
        return symbol;
    }

    public static final Symbol exportSpecial(String name, Package pkg,
                                             LispObject value)
    {
        Symbol symbol = pkg.intern(name);
        try {
            pkg.export(symbol); // FIXME Inefficient!
        }
        catch (ConditionThrowable t) {
            Debug.trace(t);
        }
        symbol.setSpecial(true);
        symbol.setSymbolValue(value);
        return symbol;
    }

    public static final Symbol exportConstant(String name, Package pkg,
                                              LispObject value)
    {
        Symbol symbol = pkg.intern(name);
        try {
            pkg.export(symbol); // FIXME Inefficient!
        }
        catch (ConditionThrowable t) {
            Debug.trace(t);
        }
        symbol.setSpecial(true);
        symbol.setSymbolValue(value);
        symbol.setConstant(true);
        return symbol;
    }

    public static final Symbol _DEFAULT_PATHNAME_DEFAULTS_ =
        exportSpecial("*DEFAULT-PATHNAME-DEFAULTS*", PACKAGE_CL, null);
    static {
        String userDir = System.getProperty("user.dir");
        if (userDir != null && userDir.length() > 0) {
            if (userDir.charAt(userDir.length() - 1) != File.separatorChar)
                userDir = userDir.concat(File.separator);
        }
        // This string will be converted to a pathname when Pathname.java is loaded.
        _DEFAULT_PATHNAME_DEFAULTS_.setSymbolValue(new SimpleString(userDir));
    }

    public static final Symbol _PACKAGE_ =
        exportSpecial("*PACKAGE*", PACKAGE_CL, PACKAGE_CL_USER);

    public static final Package getCurrentPackage()
    {
        return (Package) _PACKAGE_.symbolValueNoThrow();
    }

    private static Stream stdin = new Stream(System.in, Symbol.CHARACTER, true);

    private static Stream stdout = new Stream(System.out, Symbol.CHARACTER, true);

    public static final Symbol _STANDARD_INPUT_ =
        exportSpecial("*STANDARD-INPUT*", PACKAGE_CL, stdin);

    public static final Symbol _STANDARD_OUTPUT_ =
        exportSpecial("*STANDARD-OUTPUT*", PACKAGE_CL, stdout);

    public static final Symbol _ERROR_OUTPUT_ =
        exportSpecial("*ERROR-OUTPUT*", PACKAGE_CL, stdout);

    public static final Symbol _TRACE_OUTPUT_ =
        exportSpecial("*TRACE-OUTPUT*", PACKAGE_CL, stdout);

    public static final Symbol _TERMINAL_IO_ =
        exportSpecial("*TERMINAL-IO*", PACKAGE_CL,
                      new TwoWayStream(stdin, stdout, true));

    public static final Symbol _QUERY_IO_ =
        exportSpecial("*QUERY-IO*", PACKAGE_CL,
                      new TwoWayStream(stdin, stdout, true));

    public static final Symbol _DEBUG_IO_ =
        exportSpecial("*DEBUG-IO*", PACKAGE_CL,
                      new TwoWayStream(stdin, stdout, true));

    public static final void resetIO(Stream in, Stream out)
    {
        stdin = in;
        stdout = out;
        _STANDARD_INPUT_.setSymbolValue(stdin);
        _STANDARD_OUTPUT_.setSymbolValue(stdout);
        _ERROR_OUTPUT_.setSymbolValue(stdout);
        _TRACE_OUTPUT_.setSymbolValue(stdout);
        _TERMINAL_IO_.setSymbolValue(new TwoWayStream(stdin, stdout, true));
        _QUERY_IO_.setSymbolValue(new TwoWayStream(stdin, stdout, true));
        _DEBUG_IO_.setSymbolValue(new TwoWayStream(stdin, stdout, true));
    }

    public static final void resetIO()
    {
        resetIO(new Stream(System.in, Symbol.CHARACTER, true),
                new Stream(System.out, Symbol.CHARACTER, true));
    }

    public static final TwoWayStream getTerminalIO()
    {
        return (TwoWayStream) _TERMINAL_IO_.symbolValueNoThrow();
    }

    public static final Stream getStandardInput()
    {
        return (Stream) _STANDARD_INPUT_.symbolValueNoThrow();
    }

    public static final Stream getStandardOutput() throws ConditionThrowable
    {
        return checkCharacterOutputStream(_STANDARD_OUTPUT_.symbolValue());
    }

    public static final Symbol _READTABLE_ =
        exportSpecial("*READTABLE*", PACKAGE_CL, new Readtable());

    public static final Readtable currentReadtable() throws ConditionThrowable
    {
        return (Readtable) _READTABLE_.symbolValue();
    }

    public static final Symbol _READ_SUPPRESS_ =
        exportSpecial("*READ-SUPPRESS*", PACKAGE_CL, NIL);

    public static final Symbol _DEBUGGER_HOOK_ =
        exportSpecial("*DEBUGGER-HOOK*", PACKAGE_CL, NIL);

    public static final Symbol MOST_POSITIVE_FIXNUM =
        exportConstant("MOST-POSITIVE-FIXNUM", PACKAGE_CL,
            new Fixnum(Integer.MAX_VALUE));

    public static final Symbol MOST_NEGATIVE_FIXNUM =
        exportConstant("MOST-NEGATIVE-FIXNUM", PACKAGE_CL,
            new Fixnum(Integer.MIN_VALUE));

    public static void exit(int status)
    {
        Interpreter interpreter = Interpreter.getInstance();
        if (interpreter != null)
            interpreter.kill(status);
    }

    // ### t
    // We can't use exportConstant() here since we need to set T's value to
    // itself.
    public static final Symbol T = exportConstant("T", PACKAGE_CL, null);
    static {
        T.setSymbolValue(T);
    }

    // ### *read-eval*
    public static final Symbol _READ_EVAL_ =
        exportSpecial("*READ-EVAL*", PACKAGE_CL, T);

    // ### *features*
    public static final Symbol _FEATURES_ =
        exportSpecial("*FEATURES*", PACKAGE_CL, null);
    static {
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Linux")) {
            _FEATURES_.setSymbolValue(list6(Keyword.ARMEDBEAR,
                                            Keyword.ABCL,
                                            Keyword.COMMON_LISP,
                                            Keyword.ANSI_CL,
                                            Keyword.UNIX,
                                            Keyword.LINUX));
        } else if (osName.startsWith("SunOS")) {
            _FEATURES_.setSymbolValue(list6(Keyword.ARMEDBEAR,
                                            Keyword.ABCL,
                                            Keyword.COMMON_LISP,
                                            Keyword.ANSI_CL,
                                            Keyword.UNIX,
                                            Keyword.SUNOS));
        } else if (osName.startsWith("Mac OS X")) {
            _FEATURES_.setSymbolValue(list6(Keyword.ARMEDBEAR,
                                            Keyword.ABCL,
                                            Keyword.COMMON_LISP,
                                            Keyword.ANSI_CL,
                                            Keyword.UNIX,
                                            Keyword.DARWIN));
        } else if (osName.startsWith("Windows")) {
            _FEATURES_.setSymbolValue(list5(Keyword.ARMEDBEAR,
                                            Keyword.ABCL,
                                            Keyword.COMMON_LISP,
                                            Keyword.ANSI_CL,
                                            Keyword.WINDOWS));
        } else {
            _FEATURES_.setSymbolValue(list4(Keyword.ARMEDBEAR,
                                            Keyword.ABCL,
                                            Keyword.COMMON_LISP,
                                            Keyword.ANSI_CL));
        }
    }

    // ### *modules*
    public static final Symbol _MODULES_ =
        exportSpecial("*MODULES*", PACKAGE_CL, NIL);

    // ### *load-verbose*
    public static final Symbol _LOAD_VERBOSE_ =
        exportSpecial("*LOAD-VERBOSE*", PACKAGE_CL, NIL);

    // ### *load-print*
    public static final Symbol _LOAD_PRINT_ =
        exportSpecial("*LOAD-PRINT*", PACKAGE_CL, NIL);

    // ### *load-pathname*
    public static final Symbol _LOAD_PATHNAME_ =
        exportSpecial("*LOAD-PATHNAME*", PACKAGE_CL, NIL);

    // ### *load-truename*
    public static final Symbol _LOAD_TRUENAME_ =
        exportSpecial("*LOAD-TRUENAME*", PACKAGE_CL, NIL);

    // ### *load-depth*
    // internal symbol
    public static final Symbol _LOAD_DEPTH_ =
        internSpecial("*LOAD-DEPTH*", PACKAGE_SYS, new Fixnum(0));

    // ### *load-stream*
    // internal symbol
    public static final Symbol _LOAD_STREAM_ =
        internSpecial("*LOAD-STREAM*", PACKAGE_SYS, NIL);

    // ### *source*
    // internal symbol
    public static final Symbol _SOURCE_ =
        exportSpecial("*SOURCE*", PACKAGE_SYS, NIL);

    // ### *source-position*
    // internal symbol
    public static final Symbol _SOURCE_POSITION_ =
        exportSpecial("*SOURCE-POSITION*", PACKAGE_SYS, NIL);

    // ### *autoload-verbose*
    // internal symbol
    public static final Symbol _AUTOLOAD_VERBOSE_ =
        exportSpecial("*AUTOLOAD-VERBOSE*", PACKAGE_EXT, NIL);

    // ### *compile-verbose*
    public static final Symbol _COMPILE_VERBOSE_ =
        exportSpecial("*COMPILE-VERBOSE*", PACKAGE_CL, T);

    // ### *compile-print*
    public static final Symbol _COMPILE_PRINT_ =
        exportSpecial("*COMPILE-PRINT*", PACKAGE_CL, T);

    // ### *compile-file-pathname*
    public static final Symbol _COMPILE_FILE_PATHNAME_ =
        exportSpecial("*COMPILE-FILE-PATHNAME*", PACKAGE_CL, NIL);

    // ### *compile-file-truename*
    public static final Symbol _COMPILE_FILE_TRUENAME_ =
        exportSpecial("*COMPILE-FILE-TRUENAME*", PACKAGE_CL, NIL);

    // ### *compile-file-type*
    public static final String COMPILE_FILE_TYPE = "abcl";
    public static final Symbol _COMPILE_FILE_TYPE_ =
        internConstant("*COMPILE-FILE-TYPE*", PACKAGE_SYS,
                       new SimpleString(COMPILE_FILE_TYPE));

    // ### *compile-file-zip*
    public static final Symbol _COMPILE_FILE_ZIP_ =
        exportSpecial("*COMPILE-FILE-ZIP*", PACKAGE_SYS, T);

    // ### *macroexpand-hook*
    public static final Symbol _MACROEXPAND_HOOK_ =
        exportSpecial("*MACROEXPAND-HOOK*", PACKAGE_CL, Symbol.FUNCALL);

    // ### array-dimension-limit
    public static final int ARRAY_DIMENSION_MAX = 0x1000000;
    public static final Symbol ARRAY_DIMENSION_LIMIT =
        exportConstant("ARRAY-DIMENSION-LIMIT", PACKAGE_CL,
                       new Fixnum(ARRAY_DIMENSION_MAX));

    // ### char-code-limit
    // "The upper exclusive bound on the value returned by the function CHAR-CODE."
    public static final int CHAR_MAX = 256;
    public static final Symbol CHAR_CODE_LIMIT =
        exportConstant("CHAR-CODE-LIMIT", PACKAGE_CL, new Fixnum(CHAR_MAX));

    // ### *read-base*
    public static final Symbol _READ_BASE_ =
        exportSpecial("*READ-BASE*", PACKAGE_CL, new Fixnum(10));

    // ### *read-default-float-format*
    public static final Symbol _READ_DEFAULT_FLOAT_FORMAT_ =
        exportSpecial("*READ-DEFAULT-FLOAT-FORMAT*", PACKAGE_CL, Symbol.SINGLE_FLOAT);

    // Printer control variables.
    public static final Symbol _PRINT_ARRAY_ =
        exportSpecial("*PRINT-ARRAY*", PACKAGE_CL, T);

    public static final Symbol _PRINT_BASE_ =
        exportSpecial("*PRINT-BASE*", PACKAGE_CL, new Fixnum(10));

    public static final Symbol _PRINT_CASE_ =
        exportSpecial("*PRINT-CASE*", PACKAGE_CL, Keyword.UPCASE);

    public static final Symbol _PRINT_CIRCLE_ =
        exportSpecial("*PRINT-CIRCLE*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_ESCAPE_ =
        exportSpecial("*PRINT-ESCAPE*", PACKAGE_CL, T);

    public static final Symbol _PRINT_GENSYM_ =
        exportSpecial("*PRINT-GENSYM*", PACKAGE_CL, T);

    public static final Symbol _PRINT_LENGTH_ =
        exportSpecial("*PRINT-LENGTH*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_LEVEL_ =
        exportSpecial("*PRINT-LEVEL*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_LINES_ =
        exportSpecial("*PRINT-LINES*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_MISER_WIDTH_ =
        exportSpecial("*PRINT-MISER-WIDTH*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_PPRINT_DISPATCH_ =
        exportSpecial("*PRINT-PPRINT-DISPATCH*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_PRETTY_ =
        exportSpecial("*PRINT-PRETTY*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_RADIX_ =
        exportSpecial("*PRINT-RADIX*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_READABLY_ =
        exportSpecial("*PRINT-READABLY*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_RIGHT_MARGIN_ =
        exportSpecial("*PRINT-RIGHT-MARGIN*", PACKAGE_CL, NIL);

    public static final Symbol _PRINT_STRUCTURE_ =
        exportSpecial("*PRINT-STRUCTURE*", PACKAGE_EXT, T);

    // ### *current-print-length*
    public static final Symbol _CURRENT_PRINT_LENGTH_ =
        exportSpecial("*CURRENT-PRINT-LENGTH*", PACKAGE_SYS, Fixnum.ZERO);

    // ### *current-print-level*
    public static final Symbol _CURRENT_PRINT_LEVEL_ =
        exportSpecial("*CURRENT-PRINT-LEVEL*", PACKAGE_SYS, Fixnum.ZERO);

    public static final Symbol _PRINT_FASL_ =
        internSpecial("*PRINT-FASL*", PACKAGE_SYS, NIL);

    public static final Symbol _RANDOM_STATE_ =
        exportSpecial("*RANDOM-STATE*", PACKAGE_CL, new RandomState());

    public static final Symbol STAR = exportSpecial("*", PACKAGE_CL, NIL);
    public static final Symbol STAR_STAR =
        exportSpecial("**", PACKAGE_CL, NIL);
    public static final Symbol STAR_STAR_STAR =
        exportSpecial("***", PACKAGE_CL, NIL);

    public static final Symbol MINUS = exportSpecial("-", PACKAGE_CL, NIL);

    public static final Symbol PLUS = exportSpecial("+", PACKAGE_CL, NIL);
    public static final Symbol PLUS_PLUS =
        exportSpecial("++", PACKAGE_CL, NIL);
    public static final Symbol PLUS_PLUS_PLUS =
        exportSpecial("+++", PACKAGE_CL, NIL);

    public static final Symbol SLASH = exportSpecial("/", PACKAGE_CL, NIL);
    public static final Symbol SLASH_SLASH =
        exportSpecial("//", PACKAGE_CL, NIL);
    public static final Symbol SLASH_SLASH_SLASH =
        exportSpecial("///", PACKAGE_CL, NIL);

    public static final Symbol PI =
        exportConstant("PI", PACKAGE_CL, new DoubleFloat(Math.PI));

    public static final Symbol SHORT_FLOAT_EPSILON =
        exportConstant("SHORT-FLOAT-EPSILON", PACKAGE_CL,
                       new SingleFloat((float)5.960465E-8));

    public static final Symbol SINGLE_FLOAT_EPSILON =
        exportConstant("SINGLE-FLOAT-EPSILON", PACKAGE_CL,
                       new SingleFloat((float)5.960465E-8));

    public static final Symbol DOUBLE_FLOAT_EPSILON =
        exportConstant("DOUBLE-FLOAT-EPSILON", PACKAGE_CL,
                       new DoubleFloat((double)1.1102230246251568E-16));

    public static final Symbol LONG_FLOAT_EPSILON =
        exportConstant("LONG-FLOAT-EPSILON", PACKAGE_CL,
                       new DoubleFloat((double)1.1102230246251568E-16));

    public static final Symbol SHORT_FLOAT_NEGATIVE_EPSILON =
        exportConstant("SHORT-FLOAT-NEGATIVE-EPSILON", PACKAGE_CL,
                       new SingleFloat(2.9802326e-8f));

    public static final Symbol SINGLE_FLOAT_NEGATIVE_EPSILON =
        exportConstant("SINGLE-FLOAT-NEGATIVE-EPSILON", PACKAGE_CL,
                       new SingleFloat(2.9802326e-8f));

    public static final Symbol DOUBLE_FLOAT_NEGATIVE_EPSILON =
        exportConstant("DOUBLE-FLOAT-NEGATIVE-EPSILON", PACKAGE_CL,
                       new DoubleFloat((double)5.551115123125784E-17));

    public static final Symbol LONG_FLOAT_NEGATIVE_EPSILON =
        exportConstant("LONG-FLOAT-NEGATIVE-EPSILON", PACKAGE_CL,
                       new DoubleFloat((double)5.551115123125784E-17));

    public static final Symbol MOST_POSITIVE_SHORT_FLOAT =
        exportConstant("MOST-POSITIVE-SHORT-FLOAT", PACKAGE_CL,
                       new SingleFloat(Float.MAX_VALUE));

    public static final Symbol MOST_POSITIVE_SINGLE_FLOAT =
        exportConstant("MOST-POSITIVE-SINGLE-FLOAT", PACKAGE_CL,
                       new SingleFloat(Float.MAX_VALUE));

    public static final Symbol MOST_POSITIVE_DOUBLE_FLOAT =
        exportConstant("MOST-POSITIVE-DOUBLE-FLOAT", PACKAGE_CL,
                       new DoubleFloat(Double.MAX_VALUE));

    public static final Symbol MOST_POSITIVE_LONG_FLOAT =
        exportConstant("MOST-POSITIVE-LONG-FLOAT", PACKAGE_CL,
                       new DoubleFloat(Double.MAX_VALUE));

    public static final Symbol LEAST_POSITIVE_SHORT_FLOAT =
        exportConstant("LEAST-POSITIVE-SHORT-FLOAT", PACKAGE_CL,
                       new SingleFloat(Float.MIN_VALUE));

    public static final Symbol LEAST_POSITIVE_SINGLE_FLOAT =
        exportConstant("LEAST-POSITIVE-SINGLE-FLOAT", PACKAGE_CL,
                       new SingleFloat(Float.MIN_VALUE));

    public static final Symbol LEAST_POSITIVE_DOUBLE_FLOAT =
        exportConstant("LEAST-POSITIVE-DOUBLE-FLOAT", PACKAGE_CL,
                       new DoubleFloat(Double.MIN_VALUE));

    public static final Symbol LEAST_POSITIVE_LONG_FLOAT =
        exportConstant("LEAST-POSITIVE-LONG-FLOAT", PACKAGE_CL,
                       new DoubleFloat(Double.MIN_VALUE));

    public static final Symbol LEAST_POSITIVE_NORMALIZED_SHORT_FLOAT =
        exportConstant("LEAST-POSITIVE-NORMALIZED-SHORT-FLOAT", PACKAGE_CL,
                       new SingleFloat(1.17549435e-38f));

    public static final Symbol LEAST_POSITIVE_NORMALIZED_SINGLE_FLOAT =
        exportConstant("LEAST-POSITIVE-NORMALIZED-SINGLE-FLOAT", PACKAGE_CL,
                       new SingleFloat(1.17549435e-38f));

    public static final Symbol LEAST_POSITIVE_NORMALIZED_DOUBLE_FLOAT =
        exportConstant("LEAST-POSITIVE-NORMALIZED-DOUBLE-FLOAT", PACKAGE_CL,
                       new DoubleFloat(2.2250738585072014e-308d));

    public static final Symbol LEAST_POSITIVE_NORMALIZED_LONG_FLOAT =
        exportConstant("LEAST-POSITIVE-NORMALIZED-LONG-FLOAT", PACKAGE_CL,
                       new DoubleFloat(2.2250738585072014e-308d));

    public static final Symbol MOST_NEGATIVE_SHORT_FLOAT =
        exportConstant("MOST-NEGATIVE-SHORT-FLOAT", PACKAGE_CL,
                       new SingleFloat(- Float.MAX_VALUE));

    public static final Symbol MOST_NEGATIVE_SINGLE_FLOAT =
        exportConstant("MOST-NEGATIVE-SINGLE-FLOAT", PACKAGE_CL,
                       new SingleFloat(- Float.MAX_VALUE));

    public static final Symbol MOST_NEGATIVE_DOUBLE_FLOAT =
        exportConstant("MOST-NEGATIVE-DOUBLE-FLOAT", PACKAGE_CL,
                       new DoubleFloat(- Double.MAX_VALUE));

    public static final Symbol MOST_NEGATIVE_LONG_FLOAT =
        exportConstant("MOST-NEGATIVE-LONG-FLOAT", PACKAGE_CL,
                       new DoubleFloat(- Double.MAX_VALUE));

    public static final Symbol LEAST_NEGATIVE_SHORT_FLOAT =
        exportConstant("LEAST-NEGATIVE-SHORT-FLOAT", PACKAGE_CL,
                       new SingleFloat(- Float.MIN_VALUE));

    public static final Symbol LEAST_NEGATIVE_SINGLE_FLOAT =
        exportConstant("LEAST-NEGATIVE-SINGLE-FLOAT", PACKAGE_CL,
                       new SingleFloat(- Float.MIN_VALUE));

    public static final Symbol LEAST_NEGATIVE_DOUBLE_FLOAT =
        exportConstant("LEAST-NEGATIVE-DOUBLE-FLOAT", PACKAGE_CL,
                       new DoubleFloat(- Double.MIN_VALUE));

    public static final Symbol LEAST_NEGATIVE_LONG_FLOAT =
        exportConstant("LEAST-NEGATIVE-LONG-FLOAT", PACKAGE_CL,
                       new DoubleFloat(- Double.MIN_VALUE));

    public static final Symbol LEAST_NEGATIVE_NORMALIZED_SHORT_FLOAT =
        exportConstant("LEAST-NEGATIVE-NORMALIZED-SHORT-FLOAT", PACKAGE_CL,
                       new SingleFloat(-1.17549435e-38f));

    public static final Symbol LEAST_NEGATIVE_NORMALIZED_SINGLE_FLOAT =
        exportConstant("LEAST-NEGATIVE-NORMALIZED-SINGLE-FLOAT", PACKAGE_CL,
                       new SingleFloat(-1.17549435e-38f));

    public static final Symbol LEAST_NEGATIVE_NORMALIZED_DOUBLE_FLOAT =
        exportConstant("LEAST-NEGATIVE-NORMALIZED-DOUBLE-FLOAT", PACKAGE_CL,
                       new DoubleFloat(-2.2250738585072014e-308d));

    public static final Symbol LEAST_NEGATIVE_NORMALIZED_LONG_FLOAT =
        exportConstant("LEAST-NEGATIVE-NORMALIZED-LONG-FLOAT", PACKAGE_CL,
                       new DoubleFloat(-2.2250738585072014e-308d));

    public static final Symbol BOOLE_CLR =
        exportConstant("BOOLE-CLR", PACKAGE_CL, Fixnum.ZERO);

    public static final Symbol BOOLE_SET =
        exportConstant("BOOLE-SET", PACKAGE_CL, Fixnum.ONE);

    public static final Symbol BOOLE_1 =
        exportConstant("BOOLE-1", PACKAGE_CL, Fixnum.TWO);

    public static final Symbol BOOLE_2 =
        exportConstant("BOOLE-2", PACKAGE_CL, new Fixnum(3));

    public static final Symbol BOOLE_C1 =
        exportConstant("BOOLE-C1", PACKAGE_CL, new Fixnum(4));

    public static final Symbol BOOLE_C2 =
        exportConstant("BOOLE-C2", PACKAGE_CL, new Fixnum(5));

    public static final Symbol BOOLE_AND =
        exportConstant("BOOLE-AND", PACKAGE_CL, new Fixnum(6));

    public static final Symbol BOOLE_IOR =
        exportConstant("BOOLE-IOR", PACKAGE_CL, new Fixnum(7));

    public static final Symbol BOOLE_XOR =
        exportConstant("BOOLE-XOR", PACKAGE_CL, new Fixnum(8));

    public static final Symbol BOOLE_EQV =
        exportConstant("BOOLE-EQV", PACKAGE_CL, new Fixnum(9));

    public static final Symbol BOOLE_NAND =
        exportConstant("BOOLE-NAND", PACKAGE_CL, new Fixnum(10));

    public static final Symbol BOOLE_NOR =
        exportConstant("BOOLE-NOR", PACKAGE_CL, new Fixnum(11));

    public static final Symbol BOOLE_ANDC1 =
        exportConstant("BOOLE-ANDC1", PACKAGE_CL, new Fixnum(12));

    public static final Symbol BOOLE_ANDC2 =
        exportConstant("BOOLE-ANDC2", PACKAGE_CL, new Fixnum(13));

    public static final Symbol BOOLE_ORC1 =
        exportConstant("BOOLE-ORC1", PACKAGE_CL, new Fixnum(14));

    public static final Symbol BOOLE_ORC2 =
        exportConstant("BOOLE-ORC2", PACKAGE_CL, new Fixnum(15));

    // ### call-arguments-limit
    public static final Symbol CALL_ARGUMENTS_LIMIT =
        exportConstant("CALL-ARGUMENTS-LIMIT", PACKAGE_CL, new Fixnum(50));

    // ### lambda-parameters-limit
    public static final Symbol LAMBDA_PARAMETERS_LIMIT =
        exportConstant("LAMBDA-PARAMETERS-LIMIT", PACKAGE_CL, new Fixnum(50));

    // ### multiple-values-limit
    public static final Symbol MULTIPLE_VALUES_LIMIT =
        exportConstant("MULTIPLE-VALUES-LIMIT", PACKAGE_CL, new Fixnum(20));

    // ### internal-time-units-per-second
    public static final Symbol INTERNAL_TIME_UNITS_PER_SECOND =
        exportConstant("INTERNAL-TIME-UNITS-PER-SECOND", PACKAGE_CL,
                       new Fixnum(1000));

    // ### call-registers-limit
    public static final Symbol CALL_REGISTERS_LIMIT =
        exportConstant("CALL-REGISTERS-LIMIT", PACKAGE_SYS,
                       new Fixnum(CALL_REGISTERS_MAX));

    // ### *warn-on-redefinition*
    public static final Symbol _WARN_ON_REDEFINITION_ =
        exportSpecial("*WARN-ON-REDEFINITION*", PACKAGE_EXT, T);

    // ### *saved-backtrace*
    public static final Symbol _SAVED_BACKTRACE_ =
        exportSpecial("*SAVED-BACKTRACE*", PACKAGE_EXT, NIL);

    // ### *batch-mode*
    public static final Symbol _BATCH_MODE_ =
        exportSpecial("*BATCH-MODE*", PACKAGE_EXT, NIL);

    // ### *noinform*
    public static final Symbol _NOINFORM_ =
        exportSpecial("*NOINFORM*", PACKAGE_SYS, NIL);

    // ### *disassembler*
    public static final Symbol _DISASSEMBLER_ =
        exportSpecial("*DISASSEMBLER*", PACKAGE_EXT,
                      new SimpleString("jad -a -p")); // or "jad -dis -p"

    // ### *speed* compiler policy
    public static final Symbol _SPEED_ =
        exportSpecial("*SPEED*", PACKAGE_SYS, Fixnum.ONE);

    // ### *space* compiler policy
    public static final Symbol _SPACE_ =
        exportSpecial("*SPACE*", PACKAGE_SYS, Fixnum.ONE);

    // ### *safety* compiler policy
    public static final Symbol _SAFETY_ =
        exportSpecial("*SAFETY*", PACKAGE_SYS, Fixnum.ONE);

    // ### *debug* compiler policy
    public static final Symbol _DEBUG_ =
        exportSpecial("*DEBUG*", PACKAGE_SYS, Fixnum.ONE);

    // ### *explain* compiler policy
    public static final Symbol _EXPLAIN_ =
        exportSpecial("*EXPLAIN*", PACKAGE_SYS, NIL);

    public static final Symbol _COMPILE_FILE_ENVIRONMENT_ =
        exportSpecial("*COMPILE-FILE-ENVIRONMENT*", PACKAGE_SYS, NIL);

    public static final LispObject UNBOUND_VALUE = new LispObject()
    {
        public String writeToString()
        {
            return "#<UNBOUND>";
        }
    };

    public static final LispObject NULL_VALUE = new LispObject()
    {
        public String writeToString()
        {
            return "null";
        }
    };

    public static final Symbol _SLOT_UNBOUND_ =
        exportConstant("+SLOT-UNBOUND+", PACKAGE_SYS, UNBOUND_VALUE);

    public static final Symbol _CL_PACKAGE_ =
        exportConstant("+CL-PACKAGE+", PACKAGE_SYS, PACKAGE_CL);

    public static final Symbol _KEYWORD_PACKAGE_ =
        exportConstant("+KEYWORD-PACKAGE+", PACKAGE_SYS, PACKAGE_KEYWORD);

    // ### *backquote-count*
    public static final Symbol _BACKQUOTE_COUNT_ =
        internSpecial("*BACKQUOTE-COUNT*", PACKAGE_SYS, Fixnum.ZERO);

    // ### *bq-vector-flag*
    public static final Symbol _BQ_VECTOR_FLAG_ =
        internSpecial("*BQ-VECTOR-FLAG*", PACKAGE_SYS, list1(new Symbol("bqv")));

    // ### *traced-names*
    public static final Symbol _TRACED_NAMES_ =
        exportSpecial("*TRACED-NAMES*", PACKAGE_SYS, NIL);

    // Floating point traps.
    protected static boolean TRAP_OVERFLOW  = true;
    protected static boolean TRAP_UNDERFLOW = true;

    private static final void loadClass(String className)
    {
        try {
            Class.forName(className);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static {
        loadClass("org.armedbear.lisp.Primitives");
        loadClass("org.armedbear.lisp.SpecialOperators");
        loadClass("org.armedbear.lisp.Extensions");
        loadClass("org.armedbear.lisp.Java");
        loadClass("org.armedbear.lisp.CompiledFunction");
        loadClass("org.armedbear.lisp.Autoload");
        loadClass("org.armedbear.lisp.AutoloadMacro");
        loadClass("org.armedbear.lisp.cxr");
        loadClass("org.armedbear.lisp.Do");
        loadClass("org.armedbear.lisp.dolist");
        loadClass("org.armedbear.lisp.dotimes");
        loadClass("org.armedbear.lisp.Pathname");
        loadClass("org.armedbear.lisp.LispClass");
        loadClass("org.armedbear.lisp.BuiltInClass");
        loadClass("org.armedbear.lisp.StructureObject");

        loadClass("org.armedbear.lisp.ash");

        cold = false;
    }
}
