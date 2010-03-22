/*
 * Closure.java
 *
 * Copyright (C) 2002-2008 Peter Graves
 * Copyright (C) 2008 Ville Voutilainen
 * $Id: Closure.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Closure extends Function
{
  // Parameter types.
  public static final int REQUIRED = 0;
  public static final int OPTIONAL = 1;
  public static final int KEYWORD  = 2;
  public static final int REST     = 3;
  public static final int AUX      = 4;

  // States.
  private static final int STATE_REQUIRED = 0;
  private static final int STATE_OPTIONAL = 1;
  private static final int STATE_KEYWORD  = 2;
  private static final int STATE_REST     = 3;
  private static final int STATE_AUX      = 4;

  private Parameter[] requiredParameters = new Parameter[0];
  private Parameter[] optionalParameters = requiredParameters;
  private Parameter[] keywordParameters = requiredParameters;
  private Parameter[] auxVars = requiredParameters;
  private final SubLObject body;
  private final SubLObject executionBody;
  private final Environment environment;
  private final boolean andKey;
  private final boolean allowOtherKeys;
  private SubLSymbol restVar;
  private SubLSymbol envVar;
  private int arity;

  private int minArgs;
  private int maxArgs;

  private SubLSymbol[] variables = new SubLSymbol[0];
  private SubLObject specials = NIL;

  private boolean bindInitForms;


    /** Construct a closure object with a lambda-list described
     * by these parameters.
     *
     *
     * @param required Required parameters or an empty array for none
     * @param optional Optional parameters or an empty array for none
     * @param keyword Keyword parameters or an empty array for none
     * @param keys NIL if the lambda-list doesn't contain &amp;key, T otherwise
     * @param rest the &amp;rest parameter, or NIL if none
     * @param moreKeys NIL if &amp;allow-other-keys not present, T otherwise
     */
  public Closure(Parameter[] required,
                 Parameter[] optional,
                 Parameter[] keyword,
                 SubLSymbol keys, SubLSymbol rest, SubLSymbol moreKeys) {
      minArgs = required.length;
      maxArgs = (rest == NIL && moreKeys == NIL)
          ? minArgs + optional.length + 2*keyword.length : -1;

      arity = (rest == NIL && moreKeys == NIL && keys == NIL
               && optional.length == 0)
          ? maxArgs : -1;

      requiredParameters = required;
      optionalParameters = optional;
      keywordParameters = keyword;

      if (rest != NIL)
        restVar = rest;

      andKey = keys != NIL;
      allowOtherKeys = moreKeys != NIL;
      variables = processVariables();
      bindInitForms = false;

      // stuff we don't need: we're a compiled function
      body = null;
      executionBody = null;
      environment = null;
  }


  public Closure(SubLObject lambdaExpression, Environment env)
  {
    this(null, lambdaExpression, env);
  }

  public Closure(final SubLObject name, final SubLObject lambdaExpression,
                 final Environment env)

  {
    super(name, lambdaExpression.second());
    final SubLObject lambdaList = lambdaExpression.second();
    setLambdaList(lambdaList);
    if (!(lambdaList == NIL || lambdaList instanceof SubLCons))
      error(new ProgramError("The lambda list " + lambdaList.writeToString() +
                           " is invalid."));
    boolean _andKey = false;
    boolean _allowOtherKeys = false;
    if (lambdaList instanceof SubLCons)
      {
        final int length = lambdaList.cl_length();
        ArrayList<Parameter> required = null;
        ArrayList<Parameter> optional = null;
        ArrayList<Parameter> keywords = null;
        ArrayList<Parameter> aux = null;
        int state = STATE_REQUIRED;
        SubLObject remaining = lambdaList;
        while (remaining != NIL)
          {
            SubLObject obj = remaining.first();
            if (obj instanceof SubLSymbol)
              {
                if (state == STATE_AUX)
                  {
                    if (aux == null)
                      aux = new ArrayList<Parameter>();
                    aux.add(new Parameter((SubLSymbol)obj, NIL, AUX));
                  }
                else if (obj == LispSymbols.AND_OPTIONAL)
                  {
                    state = STATE_OPTIONAL;
                    arity = -1;
                  }
                else if (obj == LispSymbols.AND_REST || obj == LispSymbols.AND_BODY)
                  {
                    state = STATE_REST;
                    arity = -1;
                    maxArgs = -1;
                    remaining = remaining.rest();
                    if (remaining == NIL)
                      {
                        error(new ProgramError(
                          "&REST/&BODY must be followed by a variable."));
                      }
                    if (restVar != null) 
                      {
                        error(new ProgramError(
                          "&REST/&BODY may occur only once."));
                      }
                    final SubLObject remainingcar =  remaining.first();
                    if (remainingcar instanceof SubLSymbol)
                      {
                        restVar = (SubLSymbol) remainingcar;
                      }
                    else
                      {
                        error(new ProgramError(
                          "&REST/&BODY must be followed by a variable."));
                      }
                  }
                else if (obj == LispSymbols.AND_ENVIRONMENT)
                  {
                    remaining = remaining.rest();
                    envVar = (SubLSymbol) remaining.first();
                    arity = -1; // FIXME
                  }
                else if (obj == LispSymbols.AND_KEY)
                  {
                    state = STATE_KEYWORD;
                    _andKey = true;
                    arity = -1;
                  }
                else if (obj == LispSymbols.AND_ALLOW_OTHER_KEYS)
                  {
                    _allowOtherKeys = true;
                    maxArgs = -1;
                  }
                else if (obj == LispSymbols.AND_AUX)
                  {
                    // All remaining specifiers are aux variable specifiers.
                    state = STATE_AUX;
                    arity = -1; // FIXME
                  }
                else
                  {
                    if (state == STATE_OPTIONAL)
                      {
                        if (optional == null)
                          optional = new ArrayList<Parameter>();
                        optional.add(new Parameter((SubLSymbol)obj, NIL, OPTIONAL));
                        if (maxArgs >= 0)
                          ++maxArgs;
                      }
                    else if (state == STATE_KEYWORD)
                      {
                        if (keywords == null)
                          keywords = new ArrayList<Parameter>();
                        keywords.add(new Parameter((SubLSymbol)obj, NIL, KEYWORD));
                        if (maxArgs >= 0)
                          maxArgs += 2;
                      }
                    else
                      {
                        if (state != STATE_REQUIRED)
                          {
                            error(new ProgramError(
                              "required parameters cannot appear after &REST/&BODY."));
                          }
                        if (required == null)
                          required = new ArrayList<Parameter>();
                        required.add(new Parameter((SubLSymbol)obj));
                        if (maxArgs >= 0)
                          ++maxArgs;
                      }
                  }
              }
            else if (obj instanceof SubLCons)
              {
                if (state == STATE_AUX)
                  {
                    SubLSymbol sym = checkSymbol(obj.first());
                    SubLObject initForm = obj.second();
                    Debug.assertTrue(initForm != null);
                    if (aux == null)
                      aux = new ArrayList<Parameter>();
                    aux.add(new Parameter(sym, initForm, AUX));
                  }
                else if (state == STATE_OPTIONAL)
                  {
                    SubLSymbol sym = checkSymbol(obj.first());
                    SubLObject initForm = obj.second();
                    SubLObject svar = obj.rest().rest().first();
                    if (optional == null)
                      optional = new ArrayList<Parameter>();
                    optional.add(new Parameter(sym, initForm, svar, OPTIONAL));
                    if (maxArgs >= 0)
                      ++maxArgs;
                  }
                else if (state == STATE_KEYWORD)
                  {
                    SubLSymbol keyword;
                    SubLSymbol var;
                    SubLObject initForm = NIL;
                    SubLObject svar = NIL;
                    SubLObject first = obj.first();
                    if (first instanceof SubLCons)
                      {
                        keyword = checkSymbol(first.first());
                        var = checkSymbol(first.second());
                      }
                    else
                      {
                        var = checkSymbol(first);
                        keyword =
                          PACKAGE_KEYWORD.intern(var.getJavaSymbolName());
                      }
                    obj = obj.rest();
                    if (obj != NIL)
                      {
                        initForm = obj.first();
                        obj = obj.rest();
                        if (obj != NIL)
                          svar = obj.first();
                      }
                    if (keywords == null)
                      keywords = new ArrayList<Parameter>();
                    keywords.add(new Parameter(keyword, var, initForm, svar));
                    if (maxArgs >= 0)
                      maxArgs += 2;
                  }
                else
                  invalidParameter(obj);
              }
            else
              invalidParameter(obj);
            remaining = remaining.rest();
          }
        if (arity == 0)
          arity = length;
        if (required != null)
          {
            requiredParameters = new Parameter[required.size()];
            required.toArray(requiredParameters);
          }
        if (optional != null)
          {
            optionalParameters = new Parameter[optional.size()];
            optional.toArray(optionalParameters);
          }
        if (keywords != null)
          {
            keywordParameters = new Parameter[keywords.size()];
            keywords.toArray(keywordParameters);
          }
        if (aux != null)
          {
            auxVars = new Parameter[aux.size()];
            aux.toArray(auxVars);
          }
      }
    else
      {
        // Lambda list is empty.
        Debug.assertTrue(lambdaList == NIL);
        arity = 0;
        maxArgs = 0;
      }
    this.body = lambdaExpression.cddr();
    SubLObject bodyAndDecls = parseBody(this.body, false);
    this.executionBody = bodyAndDecls.first();
    this.specials = parseSpecials(bodyAndDecls.NTH(1));

    this.environment = env;
    this.andKey = _andKey;
    this.allowOtherKeys = _allowOtherKeys;
    minArgs = requiredParameters.length;
    if (arity >= 0)
      Debug.assertTrue(arity == minArgs);
    variables = processVariables();
  }

  private final void processParameters(ArrayList<SubLSymbol> vars,
                                       final Parameter[] parameters)
  {
    for (Parameter parameter : parameters)
      {
        vars.add(parameter.var);
        if (parameter.svar != NIL)
          vars.add((SubLSymbol)parameter.svar);
        if (!bindInitForms)
          if (!parameter.initForm.constantp())
            bindInitForms = true;
      }
  }

  // Also sets bindInitForms.
  private final SubLSymbol[] processVariables()
  {
    ArrayList<SubLSymbol> vars = new ArrayList<SubLSymbol>();
    for (Parameter parameter : requiredParameters)
      vars.add(parameter.var);
    processParameters(vars, optionalParameters);
    if (restVar != null)
      {
        vars.add(restVar);
      }
    processParameters(vars, keywordParameters);
    SubLSymbol[] array = new SubLSymbol[vars.size()];
    vars.toArray(array);
    return array;
  }

  private static final void invalidParameter(SubLObject obj)

  {
    error(new ProgramError(obj.writeToString() +
                         " may not be used as a variable in a lambda list."));
  }

  @Override
  public SubLObject typep(SubLObject typeSpecifier)
  {
    if (typeSpecifier == LispSymbols.COMPILED_FUNCTION)
      return NIL;
    return super.typep(typeSpecifier);
  }

  public final SubLObject getVariableList()
  {
    SubLObject result = NIL;
    for (int i = variables.length; i-- > 0;)
      result = makeCons(variables[i], result);
    return result;
  }

  // Returns body as a list.
  public final SubLObject getBody()
  {
    return body;
  }

  public final Environment getEnvironment()
  {
    return environment;
  }

  @Override
  public SubLObject execute()
  {
    if (arity == 0)
      {
        return progn(executionBody, environment, 
                     LispThread.currentThread());
      }
    else
      return execute(makeLispObjectArray(0));
  }
    
  private final SubLObject bindParametersAndExecute(SubLObject... objects)

  {
    final LispThread thread = LispThread.currentThread();
    final SpecialBindingsMark mark = thread.markSpecialBindings();
    Environment ext = new Environment(environment);
    bindRequiredParameters(ext, thread, objects);
    if (arity != minArgs)
      {
        bindParameterDefaults(optionalParameters, ext, thread);
        if (restVar != null)
          bindArg(specials, restVar, NIL, ext, thread);
        bindParameterDefaults(keywordParameters, ext, thread);
      }
    bindAuxVars(ext, thread);
    declareFreeSpecials(ext);
    try
      {
        return progn(executionBody, ext, thread);
      }
    finally
      {
        thread.resetSpecialBindings(mark);
      }
  }

  private final void bindRequiredParameters(Environment ext,
                                            LispThread thread,
                                            SubLObject[] objects)

  {
    // &whole and &environment before anything
    if (envVar != null)
      bindArg(specials, envVar, environment, ext, thread);
    for (int i = 0; i < objects.length; ++i)
      {
        bindArg(specials, requiredParameters[i].var, objects[i], ext, thread);
      }
  }

  public final SubLObject invokeArrayExecute(SubLObject... objects)

  {
    return execute(objects);
  }

  @Override
  public SubLObject execute(SubLObject arg)
  {
    if (minArgs == 1)
      {
        return bindParametersAndExecute(arg);
      }
    else
      {
        return invokeArrayExecute(arg);
      }
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second)

  {
    if (minArgs == 2)
      {
        return bindParametersAndExecute(first, second);
      }
    else
      {
        return invokeArrayExecute(first, second);
      }
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third)

  {
    if (minArgs == 3)
      {
        return bindParametersAndExecute(first, second, third);
      }
    else
      {
        return invokeArrayExecute(first, second, third);
      }
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth)

  {
    if (minArgs == 4)
      {
        return bindParametersAndExecute(first, second, third, fourth);
      }
    else
      {
        return invokeArrayExecute(first, second, third, fourth);
      }
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth)

  {
    if (minArgs == 5)
      {
        return bindParametersAndExecute(first, second, third, fourth,
                                        fifth);
      }
    else
      {
        return invokeArrayExecute(first, second, third, fourth, fifth);
      }
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth)

  {
    if (minArgs == 6)
      {
        return bindParametersAndExecute(first, second, third, fourth,
                                        fifth, sixth);
      }
    else
      {
        return invokeArrayExecute(first, second, third, fourth, fifth,
                                  sixth);
      }
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh)

  {
    if (minArgs == 7)
      {
        return bindParametersAndExecute(first, second, third, fourth,
                               fifth, sixth, seventh);
      }
    else
      {
        return invokeArrayExecute(first, second, third, fourth, fifth,
                                  sixth, seventh);
      }
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh, SubLObject eighth)

  {
    if (minArgs == 8)
      {
        return bindParametersAndExecute(first, second, third, fourth,
                               fifth, sixth, seventh, eighth);
      }
    else
      {
        return invokeArrayExecute(first, second, third, fourth, fifth,
                                  sixth, seventh, eighth);
      }
  }

  private final void declareFreeSpecials(Environment ext)

  {
    SubLObject s = specials;
    special:
    while (s != NIL) {
      SubLSymbol special = (SubLSymbol)s.first();
      s = s.rest();
      for (SubLSymbol var : variables)
	if (special == var)
          continue special;
      for (Parameter parameter : auxVars)
        if (special == parameter.var)
          continue special;
      ext.declareSpecial(special);
    }
  }

  @Override
  public SubLObject execute(SubLObject[] args)
  {
    final LispThread thread = LispThread.currentThread();
    final SpecialBindingsMark mark = thread.markSpecialBindings();
    Environment ext = new Environment(environment);
    if (optionalParameters.length == 0 && keywordParameters.length == 0)
      args = fastProcessArgs(args);
    else
      args = processArgs(args, thread);
    Debug.assertTrue(args.length == variables.length);
    if (envVar != null)
      {
        bindArg(specials, envVar, environment, ext, thread);
      }
    for (int i = 0; i < variables.length; i++)
      {
        SubLSymbol sym = variables[i];
        bindArg(specials, sym, args[i], ext, thread);
      }
    bindAuxVars(ext, thread);
    declareFreeSpecials(ext);
    try
      {
        return progn(executionBody, ext, thread);
      }
    finally
      {
        thread.resetSpecialBindings(mark);
      }
  }

  protected final SubLObject[] processArgs(SubLObject[] args, LispThread thread)

  {
    if (optionalParameters.length == 0 && keywordParameters.length == 0)
      return fastProcessArgs(args);
    final int argsLength = args.length;
    if (arity >= 0)
      {
        // Fixed arity.
        if (argsLength != arity)
          error(new WrongNumberOfArgumentsException(this));
        return args;
      }
    // Not fixed arity.
    if (argsLength < minArgs)
      error(new WrongNumberOfArgumentsException(this));
    final SubLObject[] array = new SubLObject[variables.length];
    int index = 0;
    // The bindings established here (if any) are lost when this function
    // returns. They are used only in the evaluation of initforms for
    // optional and keyword arguments.
    final SpecialBindingsMark mark = thread.markSpecialBindings();
    Environment ext = new Environment(environment);
    // Section 3.4.4: "...the &environment parameter is bound along with
    // &whole before any other variables in the lambda list..."
    try {
        if (bindInitForms)
          if (envVar != null)
            bindArg(specials, envVar, environment, ext, thread);
        // Required parameters.
        for (int i = 0; i < minArgs; i++)
          {
            if (bindInitForms)
              bindArg(specials, requiredParameters[i].var, args[i], ext, thread);
            array[index++] = args[i];
          }
        int i = minArgs;
        int argsUsed = minArgs;
        // Optional parameters.
        for (Parameter parameter : optionalParameters)
          {
            if (i < argsLength)
              {
                if (bindInitForms)
                  bindArg(specials, parameter.var, args[i], ext, thread);
                array[index++] = args[i];
                ++argsUsed;
                if (parameter.svar != NIL)
                  {
                    if (bindInitForms)
                      bindArg(specials, (SubLSymbol)parameter.svar, T, ext, thread);
                    array[index++] = T;
                  }
              }
            else
              {
                // We've run out of arguments.
                SubLObject value;
                if (parameter.initVal != null)
                  value = parameter.initVal;
                else
                  value = Lisp.eval(parameter.initForm, ext, thread);
                if (bindInitForms)
                  bindArg(specials, parameter.var, value, ext, thread);
                array[index++] = value;
                if (parameter.svar != NIL)
                  {
                    if (bindInitForms)
                      bindArg(specials, (SubLSymbol)parameter.svar, NIL, ext, thread);
                    array[index++] = NIL;
                  }
              }
            ++i;
          }
        // &rest parameter.
        if (restVar != null)
          {
            SubLObject rest = NIL;
            for (int j = argsLength; j-- > argsUsed;)
              rest = makeCons(args[j], rest);
            if (bindInitForms)
                bindArg(specials, restVar, rest, ext, thread);
            array[index++] = rest;
          }
        // Keyword parameters.
        if (keywordParameters.length > 0)
          {
            int argsLeft = argsLength - argsUsed;
            if (argsLeft == 0)
              {
                // No keyword arguments were supplied.
                // Bind all keyword parameters to their defaults.
                for (int k = 0; k < keywordParameters.length; k++)
                  {
                    Parameter parameter = keywordParameters[k];
                    SubLObject value;
                    if (parameter.initVal != null)
                      value = parameter.initVal;
                    else
                      value = Lisp.eval(parameter.initForm, ext, thread);
                    if (bindInitForms)
                        bindArg(specials, parameter.var, value, ext, thread);
                    array[index++] = value;
                    if (parameter.svar != NIL)
                      {
                        if (bindInitForms)
                            bindArg(specials, (SubLSymbol)parameter.svar, NIL, ext, thread);
                        array[index++] = NIL;
                      }
                  }
              }
            else
              {
                if ((argsLeft % 2) != 0)
                  error(new ProgramError("Odd number of keyword arguments."));
                SubLObject allowOtherKeysValue = null;
                for (Parameter parameter : keywordParameters)
                  {
                    SubLSymbol keyword = parameter.keyword;
                    SubLObject value = null;
                    boolean unbound = true;
                    for (int j = argsUsed; j < argsLength; j += 2)
                      {
                        if (args[j] == keyword)
                          {
                            if (bindInitForms)
                                bindArg(specials, parameter.var, args[j+1], ext, thread);
                            value = array[index++] = args[j+1];
                            if (parameter.svar != NIL)
                              {
                                if (bindInitForms)
                                    bindArg(specials,(SubLSymbol)parameter.svar, T, ext, thread);
                                array[index++] = T;
                              }
                            args[j] = null;
                            args[j+1] = null;
                            unbound = false;
                            break;
                          }
                      }
                    if (unbound)
                      {
                        if (parameter.initVal != null)
                          value = parameter.initVal;
                        else
                          value = Lisp.eval(parameter.initForm, ext, thread);
                        if (bindInitForms)
                            bindArg(specials, parameter.var, value, ext, thread);
                        array[index++] = value;
                        if (parameter.svar != NIL)
                          {
                            if (bindInitForms)
                                bindArg(specials, (SubLSymbol)parameter.svar, NIL, ext, thread);
                            array[index++] = NIL;
                          }
                      }
                    if (keyword == Keyword.ALLOW_OTHER_KEYS)
                      {
                        if (allowOtherKeysValue == null)
                          allowOtherKeysValue = value;
                      }
                  }
                if (!allowOtherKeys)
                  {
                    if (allowOtherKeysValue == null || allowOtherKeysValue == NIL)
                      {
                        SubLObject unrecognizedKeyword = null;
                        for (int j = argsUsed; j < argsLength; j += 2)
                          {
                            SubLObject keyword = args[j];
                            if (keyword == null)
                              continue;
                            if (keyword == Keyword.ALLOW_OTHER_KEYS)
                              {
                                if (allowOtherKeysValue == null)
                                  {
                                    allowOtherKeysValue = args[j+1];
                                    if (allowOtherKeysValue != NIL)
                                      break;
                                  }
                                continue;
                              }
                            // Unused keyword argument.
                            boolean ok = false;
                            for (Parameter parameter : keywordParameters)
                              {
                                if (parameter.keyword == keyword)
                                  {
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
                        if (unrecognizedKeyword != null)
                          {
                            if (!allowOtherKeys &&
                                (allowOtherKeysValue == null || allowOtherKeysValue == NIL))
                              error(new ProgramError("Unrecognized keyword argument " +
                                                      unrecognizedKeyword.writeToString()));
                          }
                      }
                  }
              }
          }
        else if (argsUsed < argsLength)
          {
            // No keyword parameters.
            if (argsUsed + 2 <= argsLength)
              {
                // Check for :ALLOW-OTHER-KEYS.
                SubLObject allowOtherKeysValue = NIL;
                int n = argsUsed;
                while (n < argsLength)
                  {
                    SubLObject keyword = args[n];
                    if (keyword == Keyword.ALLOW_OTHER_KEYS)
                      {
                        allowOtherKeysValue = args[n+1];
                        break;
                      }
                    n += 2;
                  }
                if (allowOtherKeys || allowOtherKeysValue != NIL)
                  {
                    // Skip keyword/value pairs.
                    while (argsUsed + 2 <= argsLength)
                      argsUsed += 2;
                  }
                else if (andKey)
                  {
                    SubLObject keyword = args[argsUsed];
                    if (keyword == Keyword.ALLOW_OTHER_KEYS)
                      {
                        // Section 3.4.1.4: "Note that if &KEY is present, a
                        // keyword argument of :ALLOW-OTHER-KEYS is always
                        // permitted---regardless of whether the associated
                        // value is true or false."
                        argsUsed += 2;
                      }
                  }
              }
            if (argsUsed < argsLength)
              {
                if (restVar == null)
                  error(new WrongNumberOfArgumentsException(this));
              }
          }
    }
    finally {
        thread.resetSpecialBindings(mark);
    }
    return array;
  }

  // No optional or keyword parameters.
  protected final SubLObject[] fastProcessArgs(SubLObject[] args)

  {
    final int argsLength = args.length;
    if (arity >= 0)
      {
        // Fixed arity.
        if (argsLength != arity)
          error(new WrongNumberOfArgumentsException(this));
        return args;
      }
    // Not fixed arity.
    if (argsLength < minArgs)
      error(new WrongNumberOfArgumentsException(this));
    final SubLObject[] array = new SubLObject[variables.length];
    int index = 0;
    // Required parameters.
    for (int i = 0; i < minArgs; i++)
      {
        array[index++] = args[i];
      }
    int argsUsed = minArgs;
    // &rest parameter.
    if (restVar != null)
      {
        SubLObject rest = NIL;
        for (int j = argsLength; j-- > argsUsed;)
          rest = makeCons(args[j], rest);
        array[index++] = rest;
      }
    else if (argsUsed < argsLength)
      {
        // No keyword parameters.
        if (argsUsed + 2 <= argsLength)
          {
            // Check for :ALLOW-OTHER-KEYS.
            SubLObject allowOtherKeysValue = NIL;
            int n = argsUsed;
            while (n < argsLength)
              {
                SubLObject keyword = args[n];
                if (keyword == Keyword.ALLOW_OTHER_KEYS)
                  {
                    allowOtherKeysValue = args[n+1];
                    break;
                  }
                n += 2;
              }
            if (allowOtherKeys || allowOtherKeysValue != NIL)
              {
                // Skip keyword/value pairs.
                while (argsUsed + 2 <= argsLength)
                  argsUsed += 2;
              }
            else if (andKey)
              {
                SubLObject keyword = args[argsUsed];
                if (keyword == Keyword.ALLOW_OTHER_KEYS)
                  {
                    // Section 3.4.1.4: "Note that if &key is present, a
                    // keyword argument of :allow-other-keys is always
                    // permitted---regardless of whether the associated
                    // value is true or false."
                    argsUsed += 2;
                  }
              }
          }
        if (argsUsed < argsLength)
          {
            if (restVar == null)
              error(new WrongNumberOfArgumentsException(this));
          }
      }
    return array;
  }

  private final void bindParameterDefaults(Parameter[] parameters,
                                           Environment env,
                                           LispThread thread)

  {
    for (Parameter parameter : parameters)
      {
        SubLObject value;
        if (parameter.initVal != null)
          value = parameter.initVal;
        else
          value = Lisp.eval(parameter.initForm, env, thread);
        bindArg(specials, parameter.var, value, env, thread);
        if (parameter.svar != NIL)
	  bindArg(specials, (SubLSymbol)parameter.svar, NIL, env, thread);
      }
  }

  private final void bindAuxVars(Environment env, LispThread thread)

  {
    // Aux variable processing is analogous to LET* processing.
    for (Parameter parameter : auxVars)
      {
        SubLSymbol sym = parameter.var;
        SubLObject value;

        if (parameter.initVal != null)
          value = parameter.initVal;
        else
          value = Lisp.eval(parameter.initForm, env, thread);

        bindArg(specials, sym, value, env, thread);
      }
  }

  public static class Parameter
  {
    final SubLSymbol var;
    final SubLObject initForm;
    final SubLObject initVal;
    final SubLObject svar;
    private final int type;
    final SubLSymbol keyword;

    public Parameter(SubLSymbol var)
    {
      this.var = var;
      this.initForm = null;
      this.initVal = null;
      this.svar = NIL;
      this.type = REQUIRED;
      this.keyword = null;
    }

    public Parameter(SubLSymbol var, SubLObject initForm, int type)

    {
      this.var = var;
      this.initForm = initForm;
      this.initVal = processInitForm(initForm);
      this.svar = NIL;
      this.type = type;
      keyword =
        type == KEYWORD ? PACKAGE_KEYWORD.intern(var.getJavaSymbolName()) : null;
    }

    public Parameter(SubLSymbol var, SubLObject initForm, SubLObject svar,
                     int type)

    {
      this.var = var;
      this.initForm = initForm;
      this.initVal = processInitForm(initForm);
      this.svar = (svar != NIL) ? checkSymbol(svar) : NIL;
      this.type = type;
      keyword =
        type == KEYWORD ? PACKAGE_KEYWORD.intern(var.getJavaSymbolName()) : null;
    }

    public Parameter(SubLSymbol keyword, SubLSymbol var, SubLObject initForm,
                     SubLObject svar)

    {
      this.var = var;
      this.initForm = initForm;
      this.initVal = processInitForm(initForm);
      this.svar = (svar != NIL) ? checkSymbol(svar) : NIL;
      type = KEYWORD;
      this.keyword = keyword;
    }

    @Override
    public String toString()
    {
      if (type == REQUIRED)
        return var.toString();
      StringBuffer sb = new StringBuffer();
      if (keyword != null)
        {
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

    private static final SubLObject processInitForm(SubLObject initForm)

    {
      if (initForm.constantp())
        {
          if (initForm instanceof SubLSymbol)
            return initForm.getSymbolValue();
          if (initForm instanceof SubLCons)
            {
              Debug.assertTrue(initForm.first() == LispSymbols.QUOTE);
              return initForm.second();
            }
          return initForm;
        }
      return null;
    }
  }

  // ### lambda-list-names
  private static final Primitive LAMBDA_LIST_NAMES =
      new JavaPrimitive("lambda-list-names", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
        Closure closure = new Closure(list(LispSymbols.LAMBDA, arg, NIL), new Environment());
        return closure.getVariableList();
      }
    };
}
