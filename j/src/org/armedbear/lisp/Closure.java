/*
 * Closure.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Closure.java,v 1.1 2003-01-17 19:43:10 piso Exp $
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

import java.util.ArrayList;

public class Closure extends Function
{
    // Parameter types.
    private static final int REQUIRED = 0;
    private static final int OPTIONAL = 1;
    private static final int KEYWORD  = 2;
    private static final int REST     = 3;

    private final LispObject parameterList;
    private final Parameter[] parameterArray;
    private final LispObject body;
    private final Environment env;
    private final LispObject function;
    private int arity;
    private int required;
    private int keywords;

    public Closure(LispObject parameterList, LispObject body, Environment env)
        throws LispException
    {
        this(null, parameterList, body, env);
    }

    public Closure(String name, LispObject parameterList, LispObject body,
        Environment env) throws LispException
    {
        super(name, getCurrentPackage());
        this.parameterList = parameterList;
        Debug.assertTrue(parameterList == NIL || parameterList instanceof Cons);
        if (parameterList instanceof Cons) {
            final int length = parameterList.length();
            ArrayList arrayList = new ArrayList();
            LispObject remaining = parameterList;
            boolean optional = false;
            boolean rest = false;
            boolean key = false;
            for (int i = 0; i < length; i++) {
                LispObject obj = remaining.car();
                if (obj instanceof Symbol) {
                    if (obj == Symbol.AND_OPTIONAL) {
                        optional = true;
                        arity = -1;
                    } else if (obj == Symbol.AND_REST) {
                        rest = true;
                        optional = false;
                        key = false;
                        arity = -1;
                        remaining = remaining.cdr();
                        if (remaining == NIL)
                            throw new LispException(
                                "&REST must be followed by a variable");
                        obj = remaining.car();
                        arrayList.add(new Parameter((Symbol)obj, NIL, REST));
                    } else if (obj == Symbol.AND_KEY) {
                        key = true;
                        optional = false;
                        rest = false;
                        arity = -1;
                    } else{
                        if (optional) {
                            arrayList.add(new Parameter((Symbol)obj, NIL,
                                OPTIONAL));
                        } else if (key) {
                            arrayList.add(new Parameter((Symbol)obj, NIL, KEYWORD));
                            ++keywords;
                        } else {
                            arrayList.add(new Parameter((Symbol)obj));
                            ++required;
                        }
                    }
                } else if (obj instanceof Cons) {
                    if (optional) {
                        Symbol symbol = checkSymbol(obj.car());
                        LispObject initForm = obj.cadr();
                        LispObject svar = obj.cdr().cdr().car();
                        arrayList.add(new Parameter(symbol, initForm, svar, OPTIONAL));
                    } else if (key) {
                        Symbol keyword;
                        Symbol var;
                        LispObject initForm = NIL;
                        LispObject svar = NIL;
                        LispObject first = obj.car();
                        if (first instanceof Cons) {
                            keyword = checkSymbol(first.car());
                            var = checkSymbol(first.cadr());
                        } else {
                            var = checkSymbol(first);
                            keyword =
                                PACKAGE_KEYWORD.intern(var.getName());
                        }
                        obj = obj.cdr();
                        if (obj != NIL) {
                            initForm = obj.car();
                            obj = obj.cdr();
                            if (obj != NIL)
                                svar = obj.car();
                        }
                        arrayList.add(new Parameter(keyword, var, initForm,
                                                    svar));
                    } else
                        Debug.assertTrue(false);
                }
                remaining = remaining.cdr();
            }
            if (arity == 0)
                arity = length;
            parameterArray = new Parameter[arrayList.size()];
            arrayList.toArray(parameterArray);
        } else {
            Debug.assertTrue(parameterList == NIL);
            parameterArray = new Parameter[0];
            arity = 0;
        }
        this.body = body;
        this.env = env;
        this.function = new Cons(Symbol.LAMBDA, new Cons(parameterList, body));
        if (arity >= 0)
            Debug.assertTrue(arity == required);
    }

    public int getType()
    {
        return TYPE_CLOSURE;
    }

    public final LispObject getParameterList()
    {
        return parameterList;
    }

    public final LispObject getFunction()
    {
        return function;
    }

    // Returns body as a list.
    public final LispObject getBody()
    {
        return body;
    }

    public final Environment getEnvironment()
    {
        return env;
    }

    public final LispObject execute(LispObject[] args) throws LispException
    {
        if (arity >= 0) {
            if (args.length != arity)
                throw new WrongNumberOfArgumentsException(this);
        } else if (args.length < required)
            throw new WrongNumberOfArgumentsException(this);
        Environment oldDynEnv = dynEnv;
        Environment ext = new Environment(env);
        if (arity >= 0) {
            // Fixed arity.
            for (int i = 0; i < arity; i++)
                bind(parameterArray[i].var, args[i], ext);
        } else {
            Debug.assertTrue(required < parameterArray.length);
            // Required parameters.
            int i;
            for (i = 0; i < required; i++) {
                Parameter parameter = parameterArray[i];
                Symbol symbol = parameter.var;
                bind(symbol, args[i], ext);
            }
            int argsUsed = required;
            // Optional parameters.
            while (i < parameterArray.length) {
                Parameter parameter = parameterArray[i];
                if (parameter.type != OPTIONAL)
                    break;
                Symbol symbol = parameter.var;
                if (i < args.length) {
                    bind(symbol, args[i], ext);
                    ++argsUsed;
                    if (parameter.svar != NIL) {
                        Symbol svar = checkSymbol(parameter.svar);
                        bind(svar, T, ext);
                    }
                } else {
                    // We've run out of arguments.
                    LispObject initForm = parameter.initForm;
                    bind(symbol,
                         initForm != null? eval(initForm, ext) : NIL,
                         ext);
                    if (parameter.svar != NIL) {
                        Symbol svar = checkSymbol(parameter.svar);
                        bind(svar, NIL, ext);
                    }
                }
                ++i;
            }
            // &rest parameter.
            if (i < parameterArray.length) {
                Parameter parameter = parameterArray[i];
                if (parameter.type == REST) {
                    Symbol symbol = parameter.var;
                    LispObject rest = NIL;
                    for (int j = args.length; j-- > i;)
                        rest = new Cons(args[j], rest);
                    bind(symbol, rest, ext);
                    ++i;
                }
            }
            // Keyword parameters.
            if (keywords > 0) {
                int argsLeft = args.length - argsUsed;
                if ((argsLeft % 2) != 0)
                    throw new LispException("odd number of keyword arguments");
                while (i < parameterArray.length) {
                    Parameter parameter = parameterArray[i];
                    if (parameter.type != KEYWORD)
                        break;
                    Symbol symbol = parameter.var;
                    // This is a keyword parameter. Look through the remaining
                    // arguments for one that matches.
                    boolean bound = false;
                    for (int j = argsUsed; j < args.length; j += 2) {
                        LispObject keyword = args[j];
                        if (keyword == parameter.keyword) {
                            // Found it!
                            bind(symbol, args[j+1], ext);
                            bound = true;
                            break;
                        }
                    }
                    if (!bound) {
                        // We didn't find a matching argument.
                        LispObject initForm = parameter.initForm;
                        LispObject value =
                            initForm != null? eval(initForm, ext) : NIL;
                        bind(symbol, value, ext);
                    }
                    ++i;
                }
            }
        }
        LispObject result = NIL;
        LispObject prog = body;
        while (prog != NIL) {
            result = eval(prog.car(), ext);
            prog = prog.cdr();
        }
        dynEnv = oldDynEnv;
        return result;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<CLOSURE ");
        sb.append(parameterList != NIL ? String.valueOf(parameterList) : "()");
        sb.append(' ');
        try {
            sb.append(body.car());
        }
        catch (LispException e) {
            Debug.trace(e);
        }
        sb.append('>');
        return sb.toString();
    }

    private static class Parameter
    {
        Symbol keyword;
        Symbol var;
        LispObject initForm;
        LispObject svar = NIL;
        int type;

        Parameter(Symbol var)
        {
            this.var = var;
        }

        Parameter(Symbol var, LispObject initForm, int type)
        {
            this.var = var;
            this.initForm = initForm;
            this.type = type;
            if (type == KEYWORD)
                keyword = PACKAGE_KEYWORD.intern(var.getName());
        }

        Parameter(Symbol var, LispObject initForm, LispObject svar, int type)
        {
            this.var = var;
            this.initForm = initForm;
            this.svar = svar;
            this.type = type;
            if (type == KEYWORD)
                keyword = PACKAGE_KEYWORD.intern(var.getName());
        }

        Parameter(Symbol keyword, Symbol var, LispObject initForm, LispObject svar)
        {
            this.keyword = keyword;
            this.var = var;
            this.initForm = initForm;
            this.svar = svar;
            type = KEYWORD;
        }

        public String toString()
        {
            if (type == REQUIRED)
                return var.toString();
            StringBuffer sb = new StringBuffer();
            if (keyword != null) {
                sb.append(keyword);
                sb.append(' ');
            }
            sb.append(var.toString());
            sb.append(' ');
            sb.append(initForm);
            sb.append(' ');
            sb.append(type);
            return sb.toString();
        }
    }
}
