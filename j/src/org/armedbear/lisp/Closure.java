/*
 * Closure.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Closure.java,v 1.71 2004-04-19 17:51:06 piso Exp $
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
    private static final int AUX      = 4;

    // States.
    private static final int STATE_REQUIRED = 0;
    private static final int STATE_OPTIONAL = 1;
    private static final int STATE_KEYWORD  = 2;
    private static final int STATE_REST     = 3;
    private static final int STATE_AUX      = 4;

    private final LispObject lambdaList;
    private final Parameter[] requiredParameters;
    private final Parameter[] optionalParameters;
    private final Parameter[] keywordParameters;
    private final Parameter[] auxVars;
    private final LispObject body;
    private final Environment environment;
    private final boolean andKey;
    private final boolean allowOtherKeys;
    private Symbol restVar;
    private Symbol envVar;
    private int arity;

    private int minArgs;
    private int maxArgs;

    private final Symbol[] variables;
    private final Symbol[] specials;

    public Closure(LispObject lambdaList, LispObject body, Environment env)
        throws ConditionThrowable
    {
        this(null, lambdaList, body, env);
    }

    public Closure(String name, LispObject lambdaList, LispObject body,
                   Environment env)
        throws ConditionThrowable
    {
        super(name, getCurrentPackage());
        this.lambdaList = lambdaList;
        Debug.assertTrue(lambdaList == NIL || lambdaList instanceof Cons);
        boolean andKey = false;
        boolean allowOtherKeys = false;
        if (lambdaList instanceof Cons) {
            final int length = lambdaList.length();
            ArrayList required = null;
            ArrayList optional = null;
            ArrayList keywords = null;
            ArrayList aux = null;
            int state = STATE_REQUIRED;
            LispObject remaining = lambdaList;
            while (remaining != NIL) {
                LispObject obj = remaining.car();
                if (obj instanceof Symbol) {
                    if (state == STATE_AUX) {
                        if (aux == null)
                            aux = new ArrayList();
                        aux.add(new Parameter((Symbol)obj, NIL, AUX));
                    } else if (obj == Symbol.AND_OPTIONAL) {
                        state = STATE_OPTIONAL;
                        arity = -1;
                    } else if (obj == Symbol.AND_REST || obj == Symbol.AND_BODY) {
                        state = STATE_REST;
                        arity = -1;
                        maxArgs = -1;
                        remaining = remaining.cdr();
                        if (remaining == NIL) {
                            signal(new LispError(
                                "&REST/&BODY must be followed by a variable"));
                        }
                        Debug.assertTrue(restVar == null);
                        try {
                            restVar = (Symbol) remaining.car();
                        }
                        catch (ClassCastException e) {
                            signal(new LispError(
                                "&REST/&BODY must be followed by a variable"));
                        }
                    } else if (obj == Symbol.AND_ENVIRONMENT) {
                        remaining = remaining.cdr();
                        envVar = (Symbol) remaining.car();
                        arity = -1; // FIXME
                    } else if (obj == Symbol.AND_KEY) {
                        state = STATE_KEYWORD;
                        andKey = true;
                        arity = -1;
                    } else if (obj == Symbol.AND_ALLOW_OTHER_KEYS) {
                        allowOtherKeys = true;
                        maxArgs = -1;
                    } else if (obj == Symbol.AND_AUX) {
                        // All remaining specifiers are aux variable specifiers.
                        state = STATE_AUX;
                        arity = -1; // FIXME
                    } else {
                        if (state == STATE_OPTIONAL) {
                            if (optional == null)
                                optional = new ArrayList();
                            optional.add(new Parameter((Symbol)obj, NIL,
                                OPTIONAL));
                            if (maxArgs >= 0)
                                ++maxArgs;
                        } else if (state == STATE_KEYWORD) {
                            if (keywords == null)
                                keywords = new ArrayList();
                            keywords.add(new Parameter((Symbol)obj, NIL,
                                KEYWORD));
                            if (maxArgs >= 0)
                                maxArgs += 2;
                        } else {
                            Debug.assertTrue(state == STATE_REQUIRED);
                            if (required == null)
                                required = new ArrayList();
                            required.add(new Parameter((Symbol)obj));
                            if (maxArgs >= 0)
                                ++maxArgs;
                        }
                    }
                } else if (obj instanceof Cons) {
                    if (state == STATE_AUX) {
                        Symbol symbol = checkSymbol(obj.car());
                        LispObject initForm = obj.cadr();
                        Debug.assertTrue(initForm != null);
                        if (aux == null)
                            aux = new ArrayList();
                        aux.add(new Parameter(symbol, initForm, AUX));
                    } else if (state == STATE_OPTIONAL) {
                        Symbol symbol = checkSymbol(obj.car());
                        LispObject initForm = obj.cadr();
                        LispObject svar = obj.cdr().cdr().car();
                        if (optional == null)
                            optional = new ArrayList();
                        optional.add(new Parameter(symbol, initForm, svar,
                            OPTIONAL));
                        if (maxArgs >= 0)
                            ++maxArgs;
                    } else if (state == STATE_KEYWORD) {
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
                        if (keywords == null)
                            keywords = new ArrayList();
                        keywords.add(new Parameter(keyword, var, initForm,
                            svar));
                        if (maxArgs >= 0)
                            maxArgs += 2;
                    } else
                        invalidParameter(obj);
                } else
                    invalidParameter(obj);
                remaining = remaining.cdr();
            }
            if (arity == 0)
                arity = length;
            if (required != null) {
                requiredParameters = new Parameter[required.size()];
                required.toArray(requiredParameters);
            } else
                requiredParameters = null;
            if (optional != null) {
                optionalParameters = new Parameter[optional.size()];
                optional.toArray(optionalParameters);
            } else
                optionalParameters = null;
            if (keywords != null) {
                keywordParameters = new Parameter[keywords.size()];
                keywords.toArray(keywordParameters);
            } else
                keywordParameters = null;
            if (aux != null) {
                auxVars = new Parameter[aux.size()];
                aux.toArray(auxVars);
            } else
                auxVars = null;
        } else {
            // Lambda list is empty.
            Debug.assertTrue(lambdaList == NIL);
            requiredParameters = null;
            optionalParameters = null;
            keywordParameters = null;
            auxVars = null;
            arity = 0;
            minArgs = maxArgs = 0;
        }
        this.body = body;
        this.environment = env;
        this.andKey = andKey;
        this.allowOtherKeys = allowOtherKeys;
        minArgs = requiredParameters != null ? requiredParameters.length : 0;
        if (arity >= 0)
            Debug.assertTrue(arity == minArgs);
        variables = processVariables();
        specials = processDeclarations();
    }

    private final Symbol[] processVariables()
    {
        ArrayList vars = new ArrayList();
        if (requiredParameters != null) {
            for (int i = 0; i < requiredParameters.length; i++)
                vars.add(requiredParameters[i].var);
        }
        if (optionalParameters != null) {
            for (int i = 0; i < optionalParameters.length; i++) {
                vars.add(optionalParameters[i].var);
                if (optionalParameters[i].svar != NIL)
                    vars.add(optionalParameters[i].svar);
            }
        }
        if (restVar != null) {
            vars.add(restVar);
        }
        if (keywordParameters != null) {
            for (int i = 0; i < keywordParameters.length; i++) {
                vars.add(keywordParameters[i].var);
                if (keywordParameters[i].svar != NIL)
                    vars.add(keywordParameters[i].svar);
            }
        }
        Symbol[] array = new Symbol[vars.size()];
        vars.toArray(array);
        return array;
    }

    private final Symbol[] processDeclarations() throws ConditionThrowable
    {
        ArrayList specials = null;
        LispObject forms = body;
        while (forms != NIL) {
            LispObject obj = forms.car();
            if (obj instanceof Cons && obj.car() == Symbol.DECLARE) {
                LispObject decls = obj.cdr();
                while (decls != NIL) {
                    LispObject decl = decls.car();
                    if (decl instanceof Cons && decl.car() == Symbol.SPECIAL) {
                        LispObject vars = decl.cdr();
                        while (vars != NIL) {
                            Symbol var = checkSymbol(vars.car());
                            if (specials == null)
                                specials = new ArrayList();
                            specials.add(var);
                            vars = vars.cdr();
                        }
                    }
                    decls = decls.cdr();
                }
                forms = forms.cdr();
            } else
                break;
        }
        if (specials == null)
            return null;
        Symbol[] array = new Symbol[specials.size()];
        specials.toArray(array);
        return array;
    }

    private static final void invalidParameter(LispObject obj)
        throws ConditionThrowable
    {
        signal(new LispError(String.valueOf(obj) +
                             " may not be used as a variable in a lambda list"));
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.COMPILED_FUNCTION)
            return NIL;
        return super.typep(typeSpecifier);
    }

    public final LispObject getParameterList()
    {
        return lambdaList;
    }

    public final LispObject getVariableList()
    {
        LispObject result = NIL;
        if (variables != null) {
            for (int i = variables.length; i-- > 0;)
                result = new Cons(variables[i], result);
        }
        return result;
    }

    // Returns body as a list.
    public final LispObject getBody()
    {
        return body;
    }

    public final Environment getEnvironment()
    {
        return environment;
    }

    public LispObject execute() throws ConditionThrowable
    {
        if (arity == 0) {
            final LispThread thread = LispThread.currentThread();
            LispObject result = NIL;
            LispObject prog = body;
            while (prog != NIL) {
                result = eval(prog.car(), environment, thread);
                prog = prog.cdr();
            }
            return result;
        } else
            return execute(new LispObject[0]);
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (minArgs == 1) {
            final LispThread thread = LispThread.currentThread();
            Environment oldDynEnv = thread.getDynamicEnvironment();
            Environment ext = new Environment(environment);
            if (specials != null) {
                for (int i = 0; i < specials.length; i++)
                    ext.declareSpecial(specials[i]);
            }
            bind(requiredParameters[0].var, arg, ext);
            if (arity != 1) {
                if (optionalParameters != null)
                    bindOptionalParameterDefaults(ext, thread);
                if (restVar != null)
                    bind(restVar, NIL, ext);
                if (keywordParameters != null)
                    bindKeywordParameterDefaults(ext, thread);
            }
            if (auxVars != null)
                bindAuxVars(ext, thread);
            LispObject result = NIL;
            LispObject prog = body;
            try {
                while (prog != NIL) {
                    result = eval(prog.car(), ext, thread);
                    prog = prog.cdr();
                }
            }
            finally {
                thread.setDynamicEnvironment(oldDynEnv);
            }
            return result;
        } else {
            LispObject[] args = new LispObject[1];
            args[0] = arg;
            return execute(args);
        }
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        if (minArgs == 2) {
            final LispThread thread = LispThread.currentThread();
            Environment oldDynEnv = thread.getDynamicEnvironment();
            Environment ext = new Environment(environment);
            if (specials != null) {
                for (int i = 0; i < specials.length; i++)
                    ext.declareSpecial(specials[i]);
            }
            bind(requiredParameters[0].var, first, ext);
            bind(requiredParameters[1].var, second, ext);
            if (arity != 2) {
                if (optionalParameters != null)
                    bindOptionalParameterDefaults(ext, thread);
                if (restVar != null)
                    bind(restVar, NIL, ext);
                if (keywordParameters != null)
                    bindKeywordParameterDefaults(ext, thread);
            }
            if (auxVars != null)
                bindAuxVars(ext, thread);
            LispObject result = NIL;
            LispObject prog = body;
            try {
                while (prog != NIL) {
                    result = eval(prog.car(), ext, thread);
                    prog = prog.cdr();
                }
            }
            finally {
                thread.setDynamicEnvironment(oldDynEnv);
            }
            return result;
        } else {
            LispObject[] args = new LispObject[2];
            args[0] = first;
            args[1] = second;
            return execute(args);
        }
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        if (minArgs == 3) {
            final LispThread thread = LispThread.currentThread();
            Environment oldDynEnv = thread.getDynamicEnvironment();
            Environment ext = new Environment(environment);
            if (specials != null) {
                for (int i = 0; i < specials.length; i++)
                    ext.declareSpecial(specials[i]);
            }
            bind(requiredParameters[0].var, first, ext);
            bind(requiredParameters[1].var, second, ext);
            bind(requiredParameters[2].var, third, ext);
            if (arity != 3) {
                if (optionalParameters != null)
                    bindOptionalParameterDefaults(ext, thread);
                if (restVar != null)
                    bind(restVar, NIL, ext);
                if (keywordParameters != null)
                    bindKeywordParameterDefaults(ext, thread);
            }
            if (auxVars != null)
                bindAuxVars(ext, thread);
            LispObject result = NIL;
            LispObject prog = body;
            try {
                while (prog != NIL) {
                    result = eval(prog.car(), ext, thread);
                    prog = prog.cdr();
                }
            }
            finally {
                thread.setDynamicEnvironment(oldDynEnv);
            }
            return result;
        } else {
            LispObject[] args = new LispObject[3];
            args[0] = first;
            args[1] = second;
            args[2] = third;
            return execute(args);
        }
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        if (minArgs == 4) {
            final LispThread thread = LispThread.currentThread();
            Environment oldDynEnv = thread.getDynamicEnvironment();
            Environment ext = new Environment(environment);
            if (specials != null) {
                for (int i = 0; i < specials.length; i++)
                    ext.declareSpecial(specials[i]);
            }
            bind(requiredParameters[0].var, first, ext);
            bind(requiredParameters[1].var, second, ext);
            bind(requiredParameters[2].var, third, ext);
            bind(requiredParameters[3].var, fourth, ext);
            if (arity != 4) {
                if (optionalParameters != null)
                    bindOptionalParameterDefaults(ext, thread);
                if (restVar != null)
                    bind(restVar, NIL, ext);
                if (keywordParameters != null)
                    bindKeywordParameterDefaults(ext, thread);
            }
            if (auxVars != null)
                bindAuxVars(ext, thread);
            LispObject result = NIL;
            LispObject prog = body;
            try {
                while (prog != NIL) {
                    result = eval(prog.car(), ext, thread);
                    prog = prog.cdr();
                }
            }
            finally {
                thread.setDynamicEnvironment(oldDynEnv);
            }
            return result;
        } else {
            LispObject[] args = new LispObject[4];
            args[0] = first;
            args[1] = second;
            args[2] = third;
            args[3] = fourth;
            return execute(args);
        }
    }

    public LispObject execute(LispObject args, Environment env)
        throws ConditionThrowable
    {
        LispObject array[] = new LispObject[2];
        array[0] = args;
        array[1] = env;
        return execute(array);
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        Environment oldDynEnv = thread.getDynamicEnvironment();
        Environment ext = new Environment(environment);
        if (specials != null) {
            for (int i = 0; i < specials.length; i++)
                ext.declareSpecial(specials[i]);
        }
        args = processArgs(args);
        Debug.assertTrue(args.length == variables.length);
        for (int i = 0; i < variables.length; i++) {
            Symbol symbol = variables[i];
            if (isSpecial(symbol))
                thread.bindSpecial(symbol, args[i]);
            else
                ext.bind(symbol, args[i]);
        }
        if (auxVars != null)
            bindAuxVars(ext, thread);
        LispObject result = NIL;
        LispObject prog = body;
        try {
            while (prog != NIL) {
                result = eval(prog.car(), ext, thread);
                prog = prog.cdr();
            }
        }
        finally {
            thread.setDynamicEnvironment(oldDynEnv);
        }
        return result;
    }

    private final boolean isSpecial(Symbol symbol)
    {
        if (symbol.isSpecialVariable())
            return true;
        if (specials != null) {
            for (int i = specials.length; i-- > 0;) {
                if (symbol == specials[i])
                    return true;
            }
        }
        return false;
    }

    protected LispObject[] processArgs(LispObject[] args) throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        if (arity >= 0) {
            // Fixed arity.
            if (args.length != arity)
                signal(new WrongNumberOfArgumentsException(this));
            return args;
        }
        // Not fixed arity.
        if (args.length < minArgs)
            signal(new WrongNumberOfArgumentsException(this));
        // The bindings established here are lost when this function returns.
        // They are used only in the evaluation of initforms for optional and
        // keyword arguments.
        Environment oldDynEnv = thread.getDynamicEnvironment();
        Environment ext = new Environment(environment);
        // Section 3.4.4: "...the &environment parameter is bound along with
        // &whole before any other variables in the lambda list..."
        if (envVar != null)
            bind(envVar, environment, ext);
        LispObject[] array = new LispObject[variables.length];
        int index = 0;
        // Required parameters.
        if (requiredParameters != null) {
            for (int i = 0; i < minArgs; i++) {
                bind(requiredParameters[i].var, args[i], ext);
                array[index++] = args[i];
            }
        }
        int i = minArgs;
        int argsUsed = minArgs;
        // Optional parameters.
        if (optionalParameters != null) {
            for (int j = 0; j < optionalParameters.length; j++) {
                Parameter parameter = optionalParameters[j];
                if (i < args.length) {
                    bind(parameter.var, args[i], ext);
                    array[index++] = args[i];
                    ++argsUsed;
                    if (parameter.svar != NIL) {
                        bind((Symbol)parameter.svar, T, ext);
                        array[index++] = T;
                    }
                } else {
                    // We've run out of arguments.
                    LispObject initForm = parameter.initForm;
                    LispObject value =
                        initForm != null ? eval(initForm, ext, thread) : NIL;
                    bind(parameter.var, value, ext);
                    array[index++] = value;
                    if (parameter.svar != NIL) {
                         bind((Symbol)parameter.svar, NIL, ext);
                         array[index++] = NIL;
                    }
                }
                ++i;
            }
        }
        // &rest parameter.
        if (restVar != null) {
            LispObject rest = NIL;
            for (int j = args.length; j-- > argsUsed;)
                rest = new Cons(args[j], rest);
            bind(restVar, rest, ext);
            array[index++] = rest;
        }
        // Keyword parameters.
        if (keywordParameters != null) {
            int argsLeft = args.length - argsUsed;
            if (argsLeft == 0) {
                // No keyword arguments were supplied.
                // Bind all keyword parameters to their defaults.
                for (int k = 0; k < keywordParameters.length; k++) {
                    Parameter parameter = keywordParameters[k];
                    LispObject initForm = parameter.initForm;
                    LispObject value =
                        initForm != null ? eval(initForm, ext, thread) : NIL;
                    bind(parameter.var, value, ext);
                    array[index++] = value;
                    if (parameter.svar != NIL) {
                        bind((Symbol)parameter.svar, NIL, ext);
                        array[index++] = NIL;
                    }
                }
            } else {
                if ((argsLeft % 2) != 0)
                    signal(new ProgramError("Odd number of keyword arguments."));
                LispObject allowOtherKeysValue = null;
                for (int k = 0; k < keywordParameters.length; k++) {
                    Parameter parameter = keywordParameters[k];
                    Symbol keyword = parameter.keyword;
                    LispObject value = null;
                    boolean unbound = true;
                    for (int j = argsUsed; j < args.length; j += 2) {
                        if (args[j] == keyword) {
                            bind(parameter.var, args[j+1], ext);
                            value = array[index++] = args[j+1];
                            if (parameter.svar != NIL) {
                                bind((Symbol)parameter.svar, T, ext);
                                array[index++] = T;
                            }
                            args[j] = null;
                            args[j+1] = null;
                            unbound = false;
                            break;
                        }
                    }
                    if (unbound) {
                        LispObject initForm = parameter.initForm;
                        value = initForm != null ? eval(initForm, ext, thread) : NIL;
                        bind(parameter.var, value, ext);
                        array[index++] = value;
                        if (parameter.svar != NIL) {
                            bind((Symbol)parameter.svar, NIL, ext);
                            array[index++] = NIL;
                        }
                    }
                    if (keyword == Keyword.ALLOW_OTHER_KEYS) {
                        if (allowOtherKeysValue == null)
                            allowOtherKeysValue = value;
                    }
                }
                if (!allowOtherKeys) {
                    if (allowOtherKeysValue == null || allowOtherKeysValue == NIL) {
                        LispObject unrecognizedKeyword = null;
                        for (int j = argsUsed; j < args.length; j += 2) {
                            LispObject keyword = args[j];
                            if (keyword == null)
                                continue;
                            if (keyword == Keyword.ALLOW_OTHER_KEYS) {
                                if (allowOtherKeysValue == null) {
                                    allowOtherKeysValue = args[j+1];
                                    if (allowOtherKeysValue != NIL)
                                        break;
                                }
                                continue;
                            }
                            // Unused keyword argument.
                            boolean ok = false;
                            for (int k = keywordParameters.length; k-- > 0;) {
                                if (keywordParameters[k].keyword == keyword) {
                                    // Found it!
                                    ok = true;
                                    break;
                                }
                            }
                            if (ok)
                                continue;
                            // Unrecognized keyword argument.
                            if (unrecognizedKeyword == null)
                                unrecognizedKeyword = keyword;
                        }
                        if (unrecognizedKeyword != null) {
                            if (!allowOtherKeys &&
                                (allowOtherKeysValue == null || allowOtherKeysValue == NIL))
                                signal(new ProgramError("Unrecognized keyword argument " +
                                                        unrecognizedKeyword + "."));
                        }
                    }
                }
            }
        } else if (argsUsed < args.length) {
            // No keyword parameters.
            if (argsUsed + 2 <= args.length) {
                // Check for :ALLOW-OTHER-KEYS.
                LispObject allowOtherKeysValue = NIL;
                int n = argsUsed;
                while (n < args.length) {
                    LispObject keyword = args[n];
                    if (keyword == Keyword.ALLOW_OTHER_KEYS) {
                        allowOtherKeysValue = args[n+1];
                        break;
                    }
                    n += 2;
                }
                if (allowOtherKeys || allowOtherKeysValue != NIL) {
                    // Skip keyword/value pairs.
                    while (argsUsed + 2 <= args.length)
                        argsUsed += 2;
                } else if (andKey) {
                    LispObject keyword = args[argsUsed];
                    if (keyword == Keyword.ALLOW_OTHER_KEYS) {
                        // Section 3.4.1.4: "Note that if &key is present, a
                        // keyword argument of :allow-other-keys is always
                        // permitted---regardless of whether the associated
                        // value is true or false."
                        argsUsed += 2;
                    }
                }
            }
            if (argsUsed < args.length) {
                if (restVar == null)
                    signal(new WrongNumberOfArgumentsException(this));
            }
        }
        thread.setDynamicEnvironment(oldDynEnv);
        return array;
    }

    private final void bindOptionalParameterDefaults(Environment env,
                                                     LispThread thread)
        throws ConditionThrowable
    {
        for (int i = 0; i < optionalParameters.length; i++) {
            Parameter parameter = optionalParameters[i];
            LispObject initForm = parameter.initForm;
            bind(parameter.var,
                 initForm != null ? eval(initForm, env, thread) : NIL,
                 env);
            if (parameter.svar != NIL)
                bind((Symbol)parameter.svar, NIL, env);
        }
    }

    private final void bindKeywordParameterDefaults(Environment env,
                                                    LispThread thread)
        throws ConditionThrowable
    {
        for (int i = 0; i < keywordParameters.length; i++) {
            Parameter parameter = keywordParameters[i];
            LispObject initForm = parameter.initForm;
            bind(parameter.var,
                 initForm != null ? eval(initForm, env, thread) : NIL,
                 env);
            if (parameter.svar != NIL)
                bind((Symbol)parameter.svar, NIL, env);
        }
    }

    private final void bindAuxVars(Environment env, LispThread thread)
        throws ConditionThrowable
    {
        // Aux variable processing is analogous to LET* processing.
        for (int i = 0; i < auxVars.length; i++) {
            Parameter parameter = auxVars[i];
            Symbol symbol = parameter.var;
            LispObject initForm = parameter.initForm;
            LispObject value =
                initForm == NIL ? NIL : eval(initForm, env, thread);
            bind(symbol, value, env);
        }
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<CLOSURE LAMBDA ");
        sb.append(lambdaList != NIL ? String.valueOf(lambdaList) : "()");
        try {
            LispObject code = body;
            while (code != NIL) {
                sb.append(' ');
                sb.append(code.car());
                code = code.cdr();
            }
        }
        catch (ConditionThrowable t) {
            Debug.trace(t);
        }
        sb.append('>');
        return sb.toString();
    }

    private static class Parameter
    {
        private final Symbol var;
        private final LispObject initForm;
        private final LispObject svar;
        private final int type;
        private final Symbol keyword;

        public Parameter(Symbol var)
        {
            this.var = var;
            this.initForm = null;
            this.svar = NIL;
            this.type = REQUIRED;
            this.keyword = null;
        }

        public Parameter(Symbol var, LispObject initForm, int type)
        {
            this.var = var;
            this.initForm = initForm;
            this.svar = NIL;
            this.type = type;
            keyword =
                type == KEYWORD ? PACKAGE_KEYWORD.intern(var.getName()) : null;
        }

        public Parameter(Symbol var, LispObject initForm, LispObject svar,
                         int type)
            throws ConditionThrowable
        {
            this.var = var;
            this.initForm = initForm;
            this.svar = (svar != NIL) ? checkSymbol(svar) : NIL;
            this.type = type;
            keyword =
                type == KEYWORD ? PACKAGE_KEYWORD.intern(var.getName()) : null;
        }

        public Parameter(Symbol keyword, Symbol var, LispObject initForm,
                         LispObject svar)
            throws ConditionThrowable
        {
            this.var = var;
            this.initForm = initForm;
            this.svar = (svar != NIL) ? checkSymbol(svar) : NIL;
            type = KEYWORD;
            this.keyword = keyword;
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
