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

import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Closure extends Function {
	public static class Parameter {
		private static SubLObject processInitForm(SubLObject initForm)

		{
			if (initForm.constantp()) {
				if (initForm instanceof SubLSymbol)
					return initForm.getSymbolValue();
				if (initForm instanceof SubLCons) {
					Debug.assertTrue(initForm.first() == LispSymbols.QUOTE);
					return initForm.second();
				}
				return initForm;
			}
			return null;
		}

		SubLSymbol var;
		SubLObject initForm;
		SubLObject initVal;
		SubLObject svar;
		private int type;

		SubLSymbol keyword;

		public Parameter(SubLSymbol var) {
			this.var = var;
			this.initForm = null;
			this.initVal = null;
			this.svar = Lisp.NIL;
			this.type = Closure.REQUIRED;
			this.keyword = null;
		}

		public Parameter(SubLSymbol var, SubLObject initForm, int type)

		{
			this.var = var;
			this.initForm = initForm;
			this.initVal = Parameter.processInitForm(initForm);
			this.svar = Lisp.NIL;
			this.type = type;
			this.keyword = type == Closure.KEYWORD ? Lisp.PACKAGE_KEYWORD.intern(var.getJavaSymbolName()) : null;
		}

		public Parameter(SubLSymbol var, SubLObject initForm, SubLObject svar, int type)

		{
			this.var = var;
			this.initForm = initForm;
			this.initVal = Parameter.processInitForm(initForm);
			this.svar = svar != Lisp.NIL ? Lisp.checkSymbol(svar) : Lisp.NIL;
			this.type = type;
			this.keyword = type == Closure.KEYWORD ? Lisp.PACKAGE_KEYWORD.intern(var.getJavaSymbolName()) : null;
		}

		public Parameter(SubLSymbol keyword, SubLSymbol var, SubLObject initForm, SubLObject svar)

		{
			this.var = var;
			this.initForm = initForm;
			this.initVal = Parameter.processInitForm(initForm);
			this.svar = svar != Lisp.NIL ? Lisp.checkSymbol(svar) : Lisp.NIL;
			this.type = Closure.KEYWORD;
			this.keyword = keyword;
		}

		public String toString() {
			if (this.type == Closure.REQUIRED)
				return this.var.toString();
			StringBuffer sb = new StringBuffer();
			if (this.keyword != null) {
				sb.append(this.keyword);
				sb.append(' ');
			}
			sb.append(this.var.toString());
			sb.append(' ');
			sb.append(this.initForm);
			sb.append(' ');
			sb.append(this.type);
			return sb.toString();
		}
	}

	// Parameter types.
	public static int REQUIRED = 0;
	public static int OPTIONAL = 1;
	public static int KEYWORD = 2;
	public static int REST = 3;

	public static int AUX = 4;
	// States.
	private static int STATE_REQUIRED = 0;
	private static int STATE_OPTIONAL = 1;
	private static int STATE_KEYWORD = 2;
	private static int STATE_REST = 3;

	private static int STATE_AUX = 4;
	// ### lambda-list-names
	private static Primitive LAMBDA_LIST_NAMES = new JavaPrimitive("lambda-list-names", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			Closure closure = new Closure(Lisp.list(LispSymbols.LAMBDA, arg, Lisp.NIL), new Environment());
			return closure.getVariableList();
		}
	};

	private static void invalidParameter(SubLObject obj)

	{
		Lisp.error(new ProgramError(obj.writeToString() + " may not be used as a variable in a lambda list."));
	}

	private Parameter[] requiredParameters = new Parameter[0];
	private Parameter[] optionalParameters = this.requiredParameters;
	private Parameter[] keywordParameters = this.requiredParameters;
	private Parameter[] auxVars = this.requiredParameters;
	private SubLObject body;
	private SubLObject executionBody;
	private Environment environment;
	private boolean andKey;
	private boolean allowOtherKeys;

	private SubLSymbol restVar;
	private SubLSymbol envVar;

	private int arity;
	private int minArgs;

	private int maxArgs;

	private SubLSymbol[] variables = new SubLSymbol[0];

	private SubLObject specials = Lisp.NIL;

	private boolean bindInitForms;

	/**
	 * Construct a closure object with a lambda-list described by these
	 * parameters.
	 *
	 *
	 * @param required
	 *            Required parameters or an empty array for none
	 * @param optional
	 *            Optional parameters or an empty array for none
	 * @param keyword
	 *            Keyword parameters or an empty array for none
	 * @param keys
	 *            NIL if the lambda-list doesn't contain &amp;key, T otherwise
	 * @param rest
	 *            the &amp;rest parameter, or NIL if none
	 * @param moreKeys
	 *            NIL if &amp;allow-other-keys not present, T otherwise
	 */
	public Closure(Parameter[] required, Parameter[] optional, Parameter[] keyword, SubLSymbol keys, SubLSymbol rest,
			SubLSymbol moreKeys) {
		this.minArgs = required.length;
		this.maxArgs = rest == Lisp.NIL && moreKeys == Lisp.NIL ? this.minArgs + optional.length + 2 * keyword.length
				: -1;

		this.arity = rest == Lisp.NIL && moreKeys == Lisp.NIL && keys == Lisp.NIL && optional.length == 0 ? this.maxArgs
				: -1;

		this.requiredParameters = required;
		this.optionalParameters = optional;
		this.keywordParameters = keyword;

		if (rest != Lisp.NIL)
			this.restVar = rest;

		this.andKey = keys != Lisp.NIL;
		this.allowOtherKeys = moreKeys != Lisp.NIL;
		this.variables = this.processVariables();
		this.bindInitForms = false;

		// stuff we don't need: we're a compiled function
		this.body = null;
		this.executionBody = null;
		this.environment = null;
	}

	public Closure(SubLObject lambdaExpression, Environment env) {
		this(null, lambdaExpression, env);
	}

	public Closure(SubLObject name, SubLObject lambdaExpression, Environment env)

	{
		super(name, lambdaExpression.second());
		SubLObject lambdaList = lambdaExpression.second();
		this.setLambdaList(lambdaList);
		if (!(lambdaList == Lisp.NIL || lambdaList instanceof SubLCons))
			Lisp.error(new ProgramError("The lambda list " + lambdaList.writeToString() + " is invalid."));
		boolean _andKey = false;
		boolean _allowOtherKeys = false;
		if (lambdaList instanceof SubLCons) {
			int length = lambdaList.cl_length();
			ArrayList<Parameter> required = null;
			ArrayList<Parameter> optional = null;
			ArrayList<Parameter> keywords = null;
			ArrayList<Parameter> aux = null;
			int state = Closure.STATE_REQUIRED;
			SubLObject remaining = lambdaList;
			while (remaining != Lisp.NIL) {
				SubLObject obj = remaining.first();
				if (obj instanceof SubLSymbol) {
					if (state == Closure.STATE_AUX) {
						if (aux == null)
							aux = new ArrayList<Parameter>();
						aux.add(new Parameter((SubLSymbol) obj, Lisp.NIL, Closure.AUX));
					} else if (obj == LispSymbols.AND_OPTIONAL) {
						state = Closure.STATE_OPTIONAL;
						this.arity = -1;
					} else if (obj == LispSymbols.AND_REST || obj == LispSymbols.AND_BODY) {
						state = Closure.STATE_REST;
						this.arity = -1;
						this.maxArgs = -1;
						remaining = remaining.rest();
						if (remaining == Lisp.NIL)
							Lisp.error(new ProgramError("&REST/&BODY must be followed by a variable."));
						if (this.restVar != null)
							Lisp.error(new ProgramError("&REST/&BODY may occur only once."));
						SubLObject remainingcar = remaining.first();
						if (remainingcar instanceof SubLSymbol)
							this.restVar = (SubLSymbol) remainingcar;
						else
							Lisp.error(new ProgramError("&REST/&BODY must be followed by a variable."));
					} else if (obj == LispSymbols.AND_ENVIRONMENT) {
						remaining = remaining.rest();
						this.envVar = (SubLSymbol) remaining.first();
						this.arity = -1; // FIXME
					} else if (obj == LispSymbols.AND_KEY) {
						state = Closure.STATE_KEYWORD;
						_andKey = true;
						this.arity = -1;
					} else if (obj == LispSymbols.AND_ALLOW_OTHER_KEYS) {
						_allowOtherKeys = true;
						this.maxArgs = -1;
					} else if (obj == LispSymbols.AND_AUX) {
						// All remaining specifiers are aux variable specifiers.
						state = Closure.STATE_AUX;
						this.arity = -1; // FIXME
					} else if (state == Closure.STATE_OPTIONAL) {
						if (optional == null)
							optional = new ArrayList<Parameter>();
						optional.add(new Parameter((SubLSymbol) obj, Lisp.NIL, Closure.OPTIONAL));
						if (this.maxArgs >= 0)
							++this.maxArgs;
					} else if (state == Closure.STATE_KEYWORD) {
						if (keywords == null)
							keywords = new ArrayList<Parameter>();
						keywords.add(new Parameter((SubLSymbol) obj, Lisp.NIL, Closure.KEYWORD));
						if (this.maxArgs >= 0)
							this.maxArgs += 2;
					} else {
						if (state != Closure.STATE_REQUIRED)
							Lisp.error(new ProgramError("required parameters cannot appear after &REST/&BODY."));
						if (required == null)
							required = new ArrayList<Parameter>();
						required.add(new Parameter((SubLSymbol) obj));
						if (this.maxArgs >= 0)
							++this.maxArgs;
					}
				} else if (obj instanceof SubLCons) {
					if (state == Closure.STATE_AUX) {
						SubLSymbol sym = Lisp.checkSymbol(obj.first());
						SubLObject initForm = obj.second();
						Debug.assertTrue(initForm != null);
						if (aux == null)
							aux = new ArrayList<Parameter>();
						aux.add(new Parameter(sym, initForm, Closure.AUX));
					} else if (state == Closure.STATE_OPTIONAL) {
						SubLSymbol sym = Lisp.checkSymbol(obj.first());
						SubLObject initForm = obj.second();
						SubLObject svar = obj.rest().rest().first();
						if (optional == null)
							optional = new ArrayList<Parameter>();
						optional.add(new Parameter(sym, initForm, svar, Closure.OPTIONAL));
						if (this.maxArgs >= 0)
							++this.maxArgs;
					} else if (state == Closure.STATE_KEYWORD) {
						SubLSymbol keyword;
						SubLSymbol var;
						SubLObject initForm = Lisp.NIL;
						SubLObject svar = Lisp.NIL;
						SubLObject first = obj.first();
						if (first instanceof SubLCons) {
							keyword = Lisp.checkSymbol(first.first());
							var = Lisp.checkSymbol(first.second());
						} else {
							var = Lisp.checkSymbol(first);
							keyword = Lisp.PACKAGE_KEYWORD.intern(var.getJavaSymbolName());
						}
						obj = obj.rest();
						if (obj != Lisp.NIL) {
							initForm = obj.first();
							obj = obj.rest();
							if (obj != Lisp.NIL)
								svar = obj.first();
						}
						if (keywords == null)
							keywords = new ArrayList<Parameter>();
						keywords.add(new Parameter(keyword, var, initForm, svar));
						if (this.maxArgs >= 0)
							this.maxArgs += 2;
					} else
						Closure.invalidParameter(obj);
				} else
					Closure.invalidParameter(obj);
				remaining = remaining.rest();
			}
			if (this.arity == 0)
				this.arity = length;
			if (required != null) {
				this.requiredParameters = new Parameter[required.size()];
				required.toArray(this.requiredParameters);
			}
			if (optional != null) {
				this.optionalParameters = new Parameter[optional.size()];
				optional.toArray(this.optionalParameters);
			}
			if (keywords != null) {
				this.keywordParameters = new Parameter[keywords.size()];
				keywords.toArray(this.keywordParameters);
			}
			if (aux != null) {
				this.auxVars = new Parameter[aux.size()];
				aux.toArray(this.auxVars);
			}
		} else {
			// Lambda list is empty.
			Debug.assertTrue(lambdaList == Lisp.NIL);
			this.arity = 0;
			this.maxArgs = 0;
		}
		this.body = lambdaExpression.cddr();
		SubLObject bodyAndDecls = Lisp.parseBody(this.body, false);
		this.executionBody = bodyAndDecls.first();
		this.specials = Lisp.parseSpecials(bodyAndDecls.NTH(1));

		this.environment = env;
		this.andKey = _andKey;
		this.allowOtherKeys = _allowOtherKeys;
		this.minArgs = this.requiredParameters.length;
		if (this.arity >= 0)
			Debug.assertTrue(this.arity == this.minArgs);
		this.variables = this.processVariables();
	}

	private void bindAuxVars(Environment env, LispThread thread)

	{
		// Aux variable processing is analogous to LET* processing.
		for (Parameter parameter : this.auxVars) {
			SubLSymbol sym = parameter.var;
			SubLObject value;

			if (parameter.initVal != null)
				value = parameter.initVal;
			else
				value = Lisp.eval(parameter.initForm, env, thread);

			Lisp.bindArg(this.specials, sym, value, env, thread);
		}
	}

	private void bindParameterDefaults(Parameter[] parameters, Environment env, LispThread thread)

	{
		for (Parameter parameter : parameters) {
			SubLObject value;
			if (parameter.initVal != null)
				value = parameter.initVal;
			else
				value = Lisp.eval(parameter.initForm, env, thread);
			Lisp.bindArg(this.specials, parameter.var, value, env, thread);
			if (parameter.svar != Lisp.NIL)
				Lisp.bindArg(this.specials, (SubLSymbol) parameter.svar, Lisp.NIL, env, thread);
		}
	}

	private SubLObject bindParametersAndExecute(SubLObject... objects)

	{
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		Environment ext = new Environment(this.environment);
		this.bindRequiredParameters(ext, thread, objects);
		if (this.arity != this.minArgs) {
			this.bindParameterDefaults(this.optionalParameters, ext, thread);
			if (this.restVar != null)
				Lisp.bindArg(this.specials, this.restVar, Lisp.NIL, ext, thread);
			this.bindParameterDefaults(this.keywordParameters, ext, thread);
		}
		this.bindAuxVars(ext, thread);
		this.declareFreeSpecials(ext);
		try {
			return Lisp.progn(this.executionBody, ext, thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	private void bindRequiredParameters(Environment ext, LispThread thread, SubLObject[] objects)

	{
		// &whole and &environment before anything
		if (this.envVar != null)
			Lisp.bindArg(this.specials, this.envVar, this.environment, ext, thread);
		for (int i = 0; i < objects.length; ++i)
			Lisp.bindArg(this.specials, this.requiredParameters[i].var, objects[i], ext, thread);
	}

	private void declareFreeSpecials(Environment ext)

	{
		SubLObject s = this.specials;
		special: while (s != Lisp.NIL) {
			SubLSymbol special = (SubLSymbol) s.first();
			s = s.rest();
			for (SubLSymbol var : this.variables)
				if (special == var)
					continue special;
			for (Parameter parameter : this.auxVars)
				if (special == parameter.var)
					continue special;
			ext.declareSpecial(special);
		}
	}

	public SubLObject execute() {
		if (this.arity == 0)
			return Lisp.progn(this.executionBody, this.environment, LispThread.currentThread());
		else
			return this.execute(LispObjectFactory.makeLispObjectArray(0));
	}

	public SubLObject execute(SubLObject arg) {
		if (this.minArgs == 1)
			return this.bindParametersAndExecute(arg);
		else
			return this.invokeArrayExecute(arg);
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		if (this.minArgs == 2)
			return this.bindParametersAndExecute(first, second);
		else
			return this.invokeArrayExecute(first, second);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		if (this.minArgs == 3)
			return this.bindParametersAndExecute(first, second, third);
		else
			return this.invokeArrayExecute(first, second, third);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		if (this.minArgs == 4)
			return this.bindParametersAndExecute(first, second, third, fourth);
		else
			return this.invokeArrayExecute(first, second, third, fourth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		if (this.minArgs == 5)
			return this.bindParametersAndExecute(first, second, third, fourth, fifth);
		else
			return this.invokeArrayExecute(first, second, third, fourth, fifth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		if (this.minArgs == 6)
			return this.bindParametersAndExecute(first, second, third, fourth, fifth, sixth);
		else
			return this.invokeArrayExecute(first, second, third, fourth, fifth, sixth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		if (this.minArgs == 7)
			return this.bindParametersAndExecute(first, second, third, fourth, fifth, sixth, seventh);
		else
			return this.invokeArrayExecute(first, second, third, fourth, fifth, sixth, seventh);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		if (this.minArgs == 8)
			return this.bindParametersAndExecute(first, second, third, fourth, fifth, sixth, seventh, eighth);
		else
			return this.invokeArrayExecute(first, second, third, fourth, fifth, sixth, seventh, eighth);
	}

	public SubLObject execute(SubLObject[] args) {
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		Environment ext = new Environment(this.environment);
		if (this.optionalParameters.length == 0 && this.keywordParameters.length == 0)
			args = this.fastProcessArgs(args);
		else
			args = this.processArgs(args, thread);
		Debug.assertTrue(args.length == this.variables.length);
		if (this.envVar != null)
			Lisp.bindArg(this.specials, this.envVar, this.environment, ext, thread);
		for (int i = 0; i < this.variables.length; i++) {
			SubLSymbol sym = this.variables[i];
			Lisp.bindArg(this.specials, sym, args[i], ext, thread);
		}
		this.bindAuxVars(ext, thread);
		this.declareFreeSpecials(ext);
		try {
			return Lisp.progn(this.executionBody, ext, thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	// No optional or keyword parameters.
	protected SubLObject[] fastProcessArgs(SubLObject[] args)

	{
		int argsLength = args.length;
		if (this.arity >= 0) {
			// Fixed arity.
			if (argsLength != this.arity)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			return args;
		}
		// Not fixed arity.
		if (argsLength < this.minArgs)
			Lisp.error(new WrongNumberOfArgumentsException(this));
		SubLObject[] array = new SubLObject[this.variables.length];
		int index = 0;
		// Required parameters.
		for (int i = 0; i < this.minArgs; i++)
			array[index++] = args[i];
		int argsUsed = this.minArgs;
		// &rest parameter.
		if (this.restVar != null) {
			SubLObject rest = Lisp.NIL;
			for (int j = argsLength; j-- > argsUsed;)
				rest = LispObjectFactory.makeCons(args[j], rest);
			array[index++] = rest;
		} else if (argsUsed < argsLength) {
			// No keyword parameters.
			if (argsUsed + 2 <= argsLength) {
				// Check for :ALLOW-OTHER-KEYS.
				SubLObject allowOtherKeysValue = Lisp.NIL;
				int n = argsUsed;
				while (n < argsLength) {
					SubLObject keyword = args[n];
					if (keyword == Keyword.ALLOW_OTHER_KEYS) {
						allowOtherKeysValue = args[n + 1];
						break;
					}
					n += 2;
				}
				if (this.allowOtherKeys || allowOtherKeysValue != Lisp.NIL)
					// Skip keyword/value pairs.
					while (argsUsed + 2 <= argsLength)
					argsUsed += 2;
				else if (this.andKey) {
					SubLObject keyword = args[argsUsed];
					if (keyword == Keyword.ALLOW_OTHER_KEYS)
						// Section 3.4.1.4: "Note that if &key is present, a
						// keyword argument of :allow-other-keys is always
						// permitted---regardless of whether the associated
						// value is true or false."
						argsUsed += 2;
				}
			}
			if (argsUsed < argsLength)
				if (this.restVar == null)
					Lisp.error(new WrongNumberOfArgumentsException(this));
		}
		return array;
	}

	// Returns body as a list.
	public SubLObject getBody() {
		return this.body;
	}

	public Environment getEnvironment() {
		return this.environment;
	}

	public SubLObject getVariableList() {
		SubLObject result = Lisp.NIL;
		for (int i = this.variables.length; i-- > 0;)
			result = LispObjectFactory.makeCons(this.variables[i], result);
		return result;
	}

	public SubLObject invokeArrayExecute(SubLObject... objects)

	{
		return this.execute(objects);
	}

	protected SubLObject[] processArgs(SubLObject[] args, LispThread thread)

	{
		if (this.optionalParameters.length == 0 && this.keywordParameters.length == 0)
			return this.fastProcessArgs(args);
		int argsLength = args.length;
		if (this.arity >= 0) {
			// Fixed arity.
			if (argsLength != this.arity)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			return args;
		}
		// Not fixed arity.
		if (argsLength < this.minArgs)
			Lisp.error(new WrongNumberOfArgumentsException(this));
		SubLObject[] array = new SubLObject[this.variables.length];
		int index = 0;
		// The bindings established here (if any) are lost when this function
		// returns. They are used only in the evaluation of initforms for
		// optional and keyword arguments.
		SpecialBindingsMark mark = thread.markSpecialBindings();
		Environment ext = new Environment(this.environment);
		// Section 3.4.4: "...the &environment parameter is bound along with
		// &whole before any other variables in the lambda list..."
		try {
			if (this.bindInitForms)
				if (this.envVar != null)
					Lisp.bindArg(this.specials, this.envVar, this.environment, ext, thread);
			// Required parameters.
			for (int i = 0; i < this.minArgs; i++) {
				if (this.bindInitForms)
					Lisp.bindArg(this.specials, this.requiredParameters[i].var, args[i], ext, thread);
				array[index++] = args[i];
			}
			int i = this.minArgs;
			int argsUsed = this.minArgs;
			// Optional parameters.
			for (Parameter parameter : this.optionalParameters) {
				if (i < argsLength) {
					if (this.bindInitForms)
						Lisp.bindArg(this.specials, parameter.var, args[i], ext, thread);
					array[index++] = args[i];
					++argsUsed;
					if (parameter.svar != Lisp.NIL) {
						if (this.bindInitForms)
							Lisp.bindArg(this.specials, (SubLSymbol) parameter.svar, Lisp.T, ext, thread);
						array[index++] = Lisp.T;
					}
				} else {
					// We've run out of arguments.
					SubLObject value;
					if (parameter.initVal != null)
						value = parameter.initVal;
					else
						value = Lisp.eval(parameter.initForm, ext, thread);
					if (this.bindInitForms)
						Lisp.bindArg(this.specials, parameter.var, value, ext, thread);
					array[index++] = value;
					if (parameter.svar != Lisp.NIL) {
						if (this.bindInitForms)
							Lisp.bindArg(this.specials, (SubLSymbol) parameter.svar, Lisp.NIL, ext, thread);
						array[index++] = Lisp.NIL;
					}
				}
				++i;
			}
			// &rest parameter.
			if (this.restVar != null) {
				SubLObject rest = Lisp.NIL;
				for (int j = argsLength; j-- > argsUsed;)
					rest = LispObjectFactory.makeCons(args[j], rest);
				if (this.bindInitForms)
					Lisp.bindArg(this.specials, this.restVar, rest, ext, thread);
				array[index++] = rest;
			}
			// Keyword parameters.
			if (this.keywordParameters.length > 0) {
				int argsLeft = argsLength - argsUsed;
				if (argsLeft == 0)
					// No keyword arguments were supplied.
					// Bind all keyword parameters to their defaults.
					for (int k = 0; k < this.keywordParameters.length; k++) {
					Parameter parameter = this.keywordParameters[k];
					SubLObject value;
					if (parameter.initVal != null)
					value = parameter.initVal;
					else
					value = Lisp.eval(parameter.initForm, ext, thread);
					if (this.bindInitForms)
					Lisp.bindArg(this.specials, parameter.var, value, ext, thread);
					array[index++] = value;
					if (parameter.svar != Lisp.NIL) {
					if (this.bindInitForms)
					Lisp.bindArg(this.specials, (SubLSymbol) parameter.svar, Lisp.NIL, ext, thread);
					array[index++] = Lisp.NIL;
					}
					}
				else {
					if (argsLeft % 2 != 0)
						Lisp.error(new ProgramError("Odd number of keyword arguments."));
					SubLObject allowOtherKeysValue = null;
					for (Parameter parameter : this.keywordParameters) {
						SubLSymbol keyword = parameter.keyword;
						SubLObject value = null;
						boolean unbound = true;
						for (int j = argsUsed; j < argsLength; j += 2)
							if (args[j] == keyword) {
								if (this.bindInitForms)
									Lisp.bindArg(this.specials, parameter.var, args[j + 1], ext, thread);
								value = array[index++] = args[j + 1];
								if (parameter.svar != Lisp.NIL) {
									if (this.bindInitForms)
										Lisp.bindArg(this.specials, (SubLSymbol) parameter.svar, Lisp.T, ext, thread);
									array[index++] = Lisp.T;
								}
								args[j] = null;
								args[j + 1] = null;
								unbound = false;
								break;
							}
						if (unbound) {
							if (parameter.initVal != null)
								value = parameter.initVal;
							else
								value = Lisp.eval(parameter.initForm, ext, thread);
							if (this.bindInitForms)
								Lisp.bindArg(this.specials, parameter.var, value, ext, thread);
							array[index++] = value;
							if (parameter.svar != Lisp.NIL) {
								if (this.bindInitForms)
									Lisp.bindArg(this.specials, (SubLSymbol) parameter.svar, Lisp.NIL, ext, thread);
								array[index++] = Lisp.NIL;
							}
						}
						if (keyword == Keyword.ALLOW_OTHER_KEYS)
							if (allowOtherKeysValue == null)
								allowOtherKeysValue = value;
					}
					if (!this.allowOtherKeys)
						if (allowOtherKeysValue == null || allowOtherKeysValue == Lisp.NIL) {
							SubLObject unrecognizedKeyword = null;
							for (int j = argsUsed; j < argsLength; j += 2) {
								SubLObject keyword = args[j];
								if (keyword == null)
									continue;
								if (keyword == Keyword.ALLOW_OTHER_KEYS) {
									if (allowOtherKeysValue == null) {
										allowOtherKeysValue = args[j + 1];
										if (allowOtherKeysValue != Lisp.NIL)
											break;
									}
									continue;
								}
								// Unused keyword argument.
								boolean ok = false;
								for (Parameter parameter : this.keywordParameters)
									if (parameter.keyword == keyword) {
										// Found it!
										ok = true;
										break;
									}
								if (ok)
									continue;
								// Unrecognized keyword argument.
								if (unrecognizedKeyword == null)
									unrecognizedKeyword = keyword;
							}
							if (unrecognizedKeyword != null)
								if (!this.allowOtherKeys
										&& (allowOtherKeysValue == null || allowOtherKeysValue == Lisp.NIL))
									Lisp.error(new ProgramError(
											"Unrecognized keyword argument " + unrecognizedKeyword.writeToString()));
						}
				}
			} else if (argsUsed < argsLength) {
				// No keyword parameters.
				if (argsUsed + 2 <= argsLength) {
					// Check for :ALLOW-OTHER-KEYS.
					SubLObject allowOtherKeysValue = Lisp.NIL;
					int n = argsUsed;
					while (n < argsLength) {
						SubLObject keyword = args[n];
						if (keyword == Keyword.ALLOW_OTHER_KEYS) {
							allowOtherKeysValue = args[n + 1];
							break;
						}
						n += 2;
					}
					if (this.allowOtherKeys || allowOtherKeysValue != Lisp.NIL)
						// Skip keyword/value pairs.
						while (argsUsed + 2 <= argsLength)
						argsUsed += 2;
					else if (this.andKey) {
						SubLObject keyword = args[argsUsed];
						if (keyword == Keyword.ALLOW_OTHER_KEYS)
							// Section 3.4.1.4: "Note that if &KEY is present, a
							// keyword argument of :ALLOW-OTHER-KEYS is always
							// permitted---regardless of whether the associated
							// value is true or false."
							argsUsed += 2;
					}
				}
				if (argsUsed < argsLength)
					if (this.restVar == null)
						Lisp.error(new WrongNumberOfArgumentsException(this));
			}
		} finally {
			thread.resetSpecialBindings(mark);
		}
		return array;
	}

	private void processParameters(ArrayList<SubLSymbol> vars, Parameter[] parameters) {
		for (Parameter parameter : parameters) {
			vars.add(parameter.var);
			if (parameter.svar != Lisp.NIL)
				vars.add((SubLSymbol) parameter.svar);
			if (!this.bindInitForms)
				if (!parameter.initForm.constantp())
					this.bindInitForms = true;
		}
	}

	// Also sets bindInitForms.
	private SubLSymbol[] processVariables() {
		ArrayList<SubLSymbol> vars = new ArrayList<SubLSymbol>();
		for (Parameter parameter : this.requiredParameters)
			vars.add(parameter.var);
		this.processParameters(vars, this.optionalParameters);
		if (this.restVar != null)
			vars.add(this.restVar);
		this.processParameters(vars, this.keywordParameters);
		SubLSymbol[] array = new SubLSymbol[vars.size()];
		vars.toArray(array);
		return array;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.COMPILED_FUNCTION)
			return Lisp.NIL;
		return super.typep(typeSpecifier);
	}
}
