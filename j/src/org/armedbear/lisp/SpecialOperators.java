/*
 * SpecialOperators.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: SpecialOperators.java,v 1.2 2003-09-28 01:16:25 piso Exp $
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

public final class SpecialOperators extends Lisp
{
    // ### quote
    private static final SpecialOperator QUOTE = new SpecialOperator("quote") {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            return args.car();
        }
    };

    // ### if
    private static final SpecialOperator IF = new SpecialOperator("if") {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
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
                    throw new ConditionThrowable(new WrongNumberOfArgumentsException("IF"));
            }
        }
    };

    private static final SpecialOperator LET = new SpecialOperator("let") {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            return _let(args, env, false);
        }
    };

    private static final SpecialOperator LETX = new SpecialOperator("let*") {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            return _let(args, env, true);
        }
    };

    private static final LispObject _let(LispObject args, Environment env,
                                         boolean sequential)
        throws ConditionThrowable
    {
        LispObject varList = checkList(args.car());
        final LispThread thread = LispThread.currentThread();
        LispObject result = NIL;
        if (varList != NIL) {
            Environment oldDynEnv = thread.getDynamicEnvironment();
            try {
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
            }
            finally {
                thread.setDynamicEnvironment(oldDynEnv);
            }
        } else {
            LispObject body = args.cdr();
            while (body != NIL) {
                result = eval(body.car(), env, thread);
                body = body.cdr();
            }
        }
        return result;
    }

    // ### load-time-value
    private static final SpecialOperator LOAD_TIME_VALUE =
        new SpecialOperator("load-time-value")
    {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            throw new ConditionThrowable(new LispError("LOAD-TIME-VALUE is not implemented"));
        }
    };

    // ### locally
    private static final SpecialOperator LOCALLY =
        new SpecialOperator("locally")
    {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            LispThread thread = LispThread.currentThread();
            while (args != NIL) {
                LispObject obj = args.car();
                if (obj instanceof Cons && obj.car() == Symbol.DECLARE)
                    ; // FIXME
                else
                    break;
                args = args.cdr();
            }
            LispObject result = NIL;
            while (args != NIL) {
                result = eval(args.car(), env, thread);
                args = args.cdr();
            }
            return result;
        }
    };

    // ### progn
    private static final SpecialOperator PROGN = new SpecialOperator("progn")
    {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            LispThread thread = LispThread.currentThread();
            LispObject result = NIL;
            while (args != NIL) {
                result = eval(args.car(), env, thread);
                args = args.cdr();
            }
            return result;
        }
    };

    private static final SpecialOperator FLET = new SpecialOperator("flet")
    {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            return _flet(args, env, false);
        }
    };

    private static final SpecialOperator LABELS = new SpecialOperator("labels")
    {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            return _flet(args, env, true);
        }
    };

    private static final LispObject _flet(LispObject args, Environment env,
                                          boolean recursive)
        throws ConditionThrowable
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
                closure.setLambdaName(list2(Symbol.FLET, symbol));
                ext.bindFunctional(symbol, closure);
                defs = defs.cdr();
            }
            result = progn(args.cdr(), ext, thread);
            thread.setDynamicEnvironment(oldDynEnv);
        } else
            result = progn(args.cdr(), env, thread);
        return result;
    }

    // ### symbol-macrolet
    private static final SpecialOperator SYMBOL_MACROLET =
        new SpecialOperator("symbol-macrolet")
    {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            throw new ConditionThrowable(new LispError("SYMBOL-MACROLET is not implemented"));
        }
    };

    // ### the
    // the value-type form => result*
    private static final SpecialOperator THE = new SpecialOperator("the") {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            if (args.length() != 2)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            return eval(args.cadr(), env, LispThread.currentThread());
        }
    };

    // ### progv
    private static final SpecialOperator PROGV = new SpecialOperator("progv") {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            throw new ConditionThrowable(new LispError("PROGV is not implemented"));
        }
    };
}
