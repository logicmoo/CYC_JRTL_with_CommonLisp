/*
 * Lisp.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Lisp.java,v 1.64 2003-05-08 14:18:37 piso Exp $
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

  public static final LispObject funcall(LispObject fun, LispObject[] argv)
    throws Condition
  {
    final LispThread thread = LispThread.currentThread();
    if (debug)
      thread.pushStackFrame(fun, argv);
    thread.clearValues();
    LispObject result;
    if (profiling)
      fun.incrementCallCount();
    if (argv == null)
      result = fun.execute();
    else
      {
        switch (argv.length)
          {
          case 0:
            result = fun.execute();
            break;
          case 1:
            result = fun.execute(argv[0]);
            break;
          case 2:
            result = fun.execute(argv[0], argv[1]);
            break;
          case 3:
            result = fun.execute(argv[0], argv[1], argv[2]);
            break;
          default:
            result = fun.execute(argv);
            break;
          }
      }
    if (debug)
      thread.popStackFrame();
    return result;
  }

  public static final LispObject macroexpand(LispObject form, Environment env)
    throws Condition
  {
    LispObject expanded = NIL;
    while (true)
      {
        form = macroexpand_1(form, env);
        LispObject[] values = LispThread.currentThread().getValues();
        if (values[1] == NIL)
          {
            values[1] = expanded;
            return form;
          }
        expanded = T;
      }
  }

  public static final LispObject macroexpand_1(LispObject form, Environment env)
    throws Condition
  {
    final LispThread thread = LispThread.currentThread();
    LispObject[] results = new LispObject[2];
    if (!(form instanceof Cons))
      {
        results[0] = form;
        results[1] = NIL;
        thread.setValues(results);
        return results[0];
      }
    Symbol symbol = checkSymbol(form.car());
    LispObject macro = symbol.getSymbolFunction();
    if (macro instanceof Macro)
      {
        if (profiling)
          macro.incrementCallCount();
        results[0] = macro.execute(form, env);
        results[1] = T;
        thread.setValues(results);
        return results[0];
      }
    // Not a macro.
    results[0] = form;
    results[1] = NIL;
    thread.setValues(results);
    return results[0];
  }

  private static boolean debug = true;

  public static final LispObject eval(LispObject obj, Environment env)
    throws Condition
  {
    return eval(obj, env, LispThread.currentThread());
  }

  public static final LispObject eval(LispObject obj, Environment env,
                                      LispThread thread) throws Condition
  {
    thread.clearValues();
    if (thread.isDestroyed())
      throw new ThreadDestroyed();
    if (obj instanceof Symbol)
      {
        LispObject result = null;
        if (obj.isSpecialVariable())
          result = thread.lookupSpecial(obj);
        else
          result = env.lookup(obj);
        if (result == null)
          {
            result = obj.getSymbolValue();
            if (result == null)
              throw new UnboundVariableException(obj.getName());
          }
        return result;
      }
    if (obj instanceof Cons)
      {
        LispObject first = obj.car();
        if (first instanceof Symbol)
          {
            LispObject fun = env.lookupFunctional(first);
            if (fun == null)
              {
                fun = first.getSymbolFunction();
                if (fun == null)
                  throw new UndefinedFunctionError(first);
              }
            switch (fun.getType())
              {
              case TYPE_SPECIAL_OPERATOR:
                {
                  if (profiling)
                    fun.incrementCallCount();
                  // Don't eval args!
                  return fun.execute(obj.cdr(), env);
                }
              case TYPE_MACRO:
                return eval(macroexpand(obj, env), env, thread);
              default:
                {
                  if (debug)
                    return funcall(fun, evalList(obj.cdr(), env, thread));
                  if (profiling)
                    fun.incrementCallCount();
                  switch (obj.cdr().length())
                    {
                    case 0:
                      return fun.execute();
                    case 1:
                      return fun.execute(thread.value(eval(obj.cadr(), env,
                                                           thread)));
                    case 2:
                      {
                        LispObject args = obj.cdr();
                        return fun.execute(eval(args.car(), env, thread),
                                           thread.value(eval(args.cadr(), env,
                                                             thread)));
                      }
                    case 3:
                      {
                        LispObject args = obj.cdr();
                        return fun.execute(eval(args.car(), env, thread),
                                           eval(args.cadr(), env, thread),
                                           thread.value(eval(args.cdr().cdr().car(),
                                                             env, thread)));
                      }
                    default:
                      return fun.execute(evalList(obj.cdr(), env, thread));
                    }
                }
              }
          }
        else
          {
            LispObject args = obj.cdr();
            if (!args.listp())
              throw new TypeError(args, "list");
            LispObject funcar = first.car();
            LispObject rest = first.cdr();
            Symbol symbol = checkSymbol(funcar);
            if (symbol == Symbol.LAMBDA)
              {
                Closure closure = new Closure(rest.car(), rest.cdr(), env);
                return closure.execute(evalList(args, env, thread));
              }
            else
              throw new ProgramError("illegal function object: " + first);
          }
      }
    else
      return obj;
  }

  private static final LispObject[] evalList(LispObject exps, Environment env,
                                             LispThread thread)
    throws Condition
  {
    final int length = exps.length();
    LispObject[] results = new LispObject[length];
    for (int i = 0; i < length; i++)
      {
        results[i] = eval(exps.car(), env, thread);
        exps = exps.cdr();
      }
    // Ignore multiple values!
    thread.clearValues();
    return results;
  }

  public static final LispObject progn(LispObject body, Environment env)
    throws Condition
  {
    final LispThread thread = LispThread.currentThread();
    LispObject result = NIL;
    while (body != NIL)
      {
        result = eval(body.car(), env, thread);
        body = body.cdr();
      }
    return result;
  }

  // Environment wrappers.
  public static final void bind(Symbol symbol, LispObject value,
                                Environment env)
  {
    if (symbol.isSpecialVariable())
      LispThread.currentThread().bindSpecial(symbol, value);
    else
      env.bind(symbol, value);
  }

  public static final void rebind(Symbol symbol, LispObject value,
                                  Environment env)
  {
    if (symbol.isSpecialVariable())
      {
        Environment dynEnv = LispThread.currentThread().getDynamicEnvironment();
        Debug.assertTrue(dynEnv != null);
        dynEnv.rebind(symbol, value);
      }
    else
      env.rebind(symbol, value);
  }

  public static final boolean equalp(LispObject first, LispObject second)
    throws LispError
  {
    if (first.equal(second))
      return true;
    if (first instanceof LispCharacter && second instanceof LispCharacter)
      {
        char c1 = ((LispCharacter)first).getValue();
        char c2 = ((LispCharacter)second).getValue();
        return (Character.toLowerCase(c1) == Character.toLowerCase(c2));
      }
    if (first.typep(Symbol.NUMBER) != NIL &&
        second.typep(Symbol.NUMBER) != NIL)
      return first.isEqualTo(second);
    if (first instanceof Cons && second instanceof Cons)
      {
        if (equalp(first.car(), second.car()) &&
            equalp(first.cdr(), second.cdr()))
          return true;
        else
          return false;
      }
    if (first instanceof LispString && second instanceof LispString)
      {
        if (LispString.getValue(first).equalsIgnoreCase(LispString.getValue(second)))
          return true;
        else
          return false;
      }
    if (first instanceof Vector && second instanceof Vector)
      {
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
    try
      {
        return (Symbol) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "symbol");
      }
  }

  public static final Cons checkCons(LispObject obj) throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (Cons) obj;
      }
    catch (ClassCastException e)
      {
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
    try
      {
        return (SequenceType) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "sequence");
      }
  }

  public static final AbstractArray checkArray(LispObject obj)
    throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (AbstractArray) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "array");
      }
  }

  public static final AbstractVector checkVector(LispObject obj)
    throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (AbstractVector) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "vector");
      }
  }

  public static final LispString checkString(LispObject obj)
    throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (LispString) obj;
      }
    catch (ClassCastException e)
      {
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
    throw new TypeError(String.valueOf(arg) +
                        " cannot be coerced to a string");
  }

  public static final String javaString(LispObject arg) throws LispError
  {
    if (arg instanceof LispString)
      return ((LispString)arg).getValue();
    if (arg.typep(Symbol.SYMBOL) != NIL)
      return arg.getName();
    if (arg instanceof LispCharacter)
      return String.valueOf(new char[] {((LispCharacter)arg).getValue()});
    throw new TypeError(String.valueOf(arg) +
                        " cannot be coerced to a string");
  }

  public static final LispObject number(long n)
  {
    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
      return new Fixnum((int)n);
    return new Bignum(n);
  }

  private static final BigInteger INT_MIN = BigInteger.valueOf(Integer.MIN_VALUE);
  private static final BigInteger INT_MAX = BigInteger.valueOf(Integer.MAX_VALUE);

  public static final LispObject number(BigInteger numerator,
                                        BigInteger denominator)
    throws LispError
  {
    if (denominator.equals(BigInteger.ZERO))
      throw new LispError("division by zero");
    if (denominator.signum() < 0)
      {
        numerator = numerator.negate();
        denominator = denominator.negate();
      }
    BigInteger gcd = numerator.gcd(denominator);
    if (!gcd.equals(BigInteger.ONE))
      {
        numerator = numerator.divide(gcd);
        denominator = denominator.divide(gcd);
      }
    if (denominator.equals(BigInteger.ONE))
      return number(numerator);
    return new Ratio(numerator, denominator);
  }

  public static final LispObject number(BigInteger n)
  {
    if (n.compareTo(INT_MIN) >= 0 && n.compareTo(INT_MAX) <= 0)
      return new Fixnum(n.intValue());
    return new Bignum(n);
  }

  public static final LispObject list(String s)
  {
    try
      {
        CharacterInputStream in = new CharacterInputStream(s);
        return in.read(true, NIL, false);
      }
    catch (Throwable t)
      {
        return null;
      }
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
    try
      {
        return (LispCharacter) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "character");
      }
  }

  public static final Package checkPackage(LispObject obj)
    throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (Package) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "package");
      }
  }

  public static final Function checkFunction(LispObject obj)
    throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (Function) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "function");
      }
  }

  public static final LispStream checkStream(LispObject obj)
    throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (LispStream) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "stream");
      }
  }

  public static final CharacterInputStream checkInputStream(LispObject obj)
    throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (CharacterInputStream) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "input stream");
      }
  }

  public static final Readtable checkReadtable(LispObject obj)
    throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (Readtable) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "readtable");
      }
  }

  public static final Environment checkEnvironment(LispObject obj)
    throws LispError
  {
    if (obj == null)
      throw new NullPointerException();
    try
      {
        return (Environment) obj;
      }
    catch (ClassCastException e)
      {
        throw new TypeError(obj, "environment");
      }
  }

  // Packages.
  public static final Package PACKAGE_CL =
    Packages.createPackage("COMMON-LISP", 1024);
  public static final Package PACKAGE_CL_USER =
    Packages.createPackage("COMMON-LISP-USER", 1024);
  public static final Package PACKAGE_JAVA = Packages.createPackage("JAVA");
  static
  {
    try
      {
        PACKAGE_CL.addNickname("CL");
        PACKAGE_CL.addNickname("LISP");
        PACKAGE_CL_USER.addNickname("CL-USER");
        PACKAGE_CL_USER.addNickname("USER");
        PACKAGE_CL_USER.usePackage(PACKAGE_CL);
        PACKAGE_CL_USER.usePackage(PACKAGE_JAVA);
      }
    catch (LispError e)
      {
        e.printStackTrace();
      }
  }
  public static final Package PACKAGE_KEYWORD =
    Packages.createPackage("KEYWORD", 1024);

  public static final Symbol intern(String name, Package pkg)
  {
    return pkg.intern(name);
  }

  public static final Symbol internInCurrentPackage(String name)
  {
    return getCurrentPackage().intern(name);
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

  public static final Package getCurrentPackage()
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

  public static final Primitive0 DEBUG = new Primitive0("debug")
    {
      public LispObject execute() throws LispError
      {
        debug = true;
        return LispThread.currentThread().nothing();
      }
    };

  public static final Primitive0 NODEBUG = new Primitive0("nodebug")
    {
      public LispObject execute() throws LispError
      {
        final LispThread thread = LispThread.currentThread();
        if (debug)
          {
            debug = false;
            thread.resetStack();
          }
        return thread.nothing();
      }
    };

  private static boolean profiling;

  // ### start-profiler
  public static final Primitive0 START_PROFILER =
    new Primitive0("start-profiler")
    {
      public LispObject execute() throws LispError
      {
        CharacterOutputStream out = getStandardOutput();
        out.freshLine();
        if (!profiling)
          {
            Package[] packages = Packages.getAllPackages();
            for (int i = 0; i < packages.length; i++)
              {
                Package pkg = packages[i];
                Symbol[] symbols = pkg.symbols();
                for (int j = 0; j < symbols.length; j++)
                  {
                    Symbol symbol = symbols[j];
                    LispObject f = symbol.getSymbolFunction();
                    if (f != null)
                      f.setCallCount(0);
                  }
              }
            out.writeLine("; Profiling started.");
            out.finishOutput();
            profiling = true;
          }
        else {
          out.writeLine("; Profiling already enabled.");
          out.finishOutput();
        }
        return LispThread.currentThread().nothing();
      }
    };

  // ### stop-profiler
  public static final Primitive0 STOP_PROFILER =
    new Primitive0("stop-profiler")
    {
      public LispObject execute() throws LispError
      {
        CharacterOutputStream out = getStandardOutput();
        out.freshLine();
        if (profiling)
          {
            profiling = false;
            out.writeLine("; Profiling stopped.");
          }
        else
          out.writeLine("; Profiling not enabled.");
        out.finishOutput();
        return LispThread.currentThread().nothing();
      }
    };

  private static final void loadClass(String className)
  {
    try
      {
        Class.forName(className);
      }
    catch (ClassNotFoundException e)
      {
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

  public static final Symbol _PRINT_BASE_ =
    exportSpecial("*PRINT-BASE*", PACKAGE_CL, new Fixnum(10));

  public static final Symbol _PRINT_RADIX_ =
    exportSpecial("*PRINT-RADIX*", PACKAGE_CL, NIL);

  public static final Symbol _RANDOM_STATE_ =
    exportSpecial("*RANDOM-STATE*", PACKAGE_CL, new JavaObject(new Random()));

  public static final Symbol STAR = exportSpecial("*", PACKAGE_CL, NIL);
  public static final Symbol STAR_STAR = exportSpecial("**", PACKAGE_CL, NIL);
  public static final Symbol STAR_STAR_STAR =
    exportSpecial("***", PACKAGE_CL, NIL);

  public static final Symbol MINUS = exportSpecial("-", PACKAGE_CL, NIL);

  public static final Symbol PLUS = exportSpecial("+", PACKAGE_CL, NIL);
  public static final Symbol PLUS_PLUS = exportSpecial("++", PACKAGE_CL, NIL);
  public static final Symbol PLUS_PLUS_PLUS =
    exportSpecial("+++", PACKAGE_CL, NIL);

  public static final Symbol SLASH = exportSpecial("/", PACKAGE_CL, NIL);
  public static final Symbol SLASH_SLASH = exportSpecial("//", PACKAGE_CL, NIL);
  public static final Symbol SLASH_SLASH_SLASH =
    exportSpecial("///", PACKAGE_CL, NIL);

  static {
    loadClass("org.armedbear.lisp.Primitives");
    loadClass("org.armedbear.lisp.Extensions");
    loadClass("org.armedbear.lisp.Java");
    loadClass("org.armedbear.lisp.CompiledFunction");
    loadClass("org.armedbear.lisp.TwoWayStream");
  }
}
